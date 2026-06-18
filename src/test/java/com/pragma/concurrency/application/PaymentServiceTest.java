package com.pragma.concurrency.application;

import com.pragma.concurrency.domain.model.Payment;
import com.pragma.concurrency.infrastructure.adapter.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PaymentServiceTest {

    @Mock
    private PaymentRepository paymentRepository;

    @InjectMocks
    private PaymentService paymentService;

    @Test
    public void testProcessPayment() {
        Payment payment = new Payment();
        when(paymentRepository.save(payment)).thenReturn(payment);
        paymentService.processPayment(payment);
        verify(paymentRepository).save(payment);
    }
}