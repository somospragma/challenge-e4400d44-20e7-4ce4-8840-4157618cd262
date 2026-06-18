package com.pragma.concurrency.application;

import com.pragma.concurrency.domain.model.Payment;
import com.pragma.concurrency.infrastructure.adapter.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final Lock lock = new ReentrantLock();

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void processPayment(Payment payment) {
        lock.lock();
        try {
            paymentRepository.save(payment);
        } finally {
            lock.unlock();
        }
    }
}