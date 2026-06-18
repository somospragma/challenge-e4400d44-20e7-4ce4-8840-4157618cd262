# Optimización de Procesamiento Concorrente en un Sistema de Pagos

Un sistema de procesamiento de pagos en línea necesita manejar múltiples transacciones simultáneamente sin bloquearse. El sistema debe ser capaz de procesar pagos de manera eficiente, previniendo situaciones donde una transacción pueda bloquear a otras. Además, es crucial comprender cómo el Event Loop maneja las tareas asíncronas para evitar cuellos de botella.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Concurrencia y Paralelismo |
| **Nivel** | advanced-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 4-5 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Puntos de Concurrencia

**Objetivo:** Identificar las áreas del sistema donde la concurrencia es crítica y puede causar bloqueos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el flujo de transacciones en el sistema de pagos.
- Identifica los puntos donde múltiples transacciones pueden interactuar de manera concurrente.

**Entregable:** Un informe que detalle los puntos de concurrencia críticos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo las transacciones pueden competir por recursos compartidos.
- Piensa en los posibles escenarios donde una transacción podría bloquear a otra.

</details>

### Fase 2: Implementación de Mecanismos Anti-Bloqueo

**Objetivo:** Implementar mecanismos para prevenir procesos bloqueantes en las áreas identificadas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Diseña soluciones para evitar que las transacciones se bloqueen entre sí.
- Considera el uso de primitivas de sincronización y patrones de diseño concurrente.

**Entregable:** Una descripción de los mecanismos implementados para prevenir bloqueos, incluyendo diagramas y explicaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre mutex, semáforos y otros mecanismos de sincronización.
- Evalúa la posibilidad de usar patrones como productor-consumidor o barreras.

</details>

### Fase 3: Comprensión y Optimización del Event Loop

**Objetivo:** Entender cómo el Event Loop maneja las tareas asíncronas y optimizar el procesamiento para evitar cuellos de botella.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el funcionamiento del Event Loop en el contexto de tu sistema de pagos.
- Identifica áreas donde el Event Loop podría ser optimizado para mejorar el rendimiento.

**Entregable:** Un informe que detalle tu comprensión del Event Loop y las optimizaciones implementadas.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre el concepto de Event Loop y su importancia en sistemas asíncronos.
- Considera cómo las microtareas y macrotareas son manejadas por el Event Loop.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la concurrencia y cómo se diferencia del paralelismo en el contexto de tu sistema de pagos?
- **paraQueSirve**: ¿Para qué sirve identificar los puntos de concurrencia en un sistema de pagos?
- **comoSeUsa**: ¿Cómo se pueden implementar mecanismos para prevenir procesos bloqueantes en tu sistema?
- **erroresComunes**: ¿Qué errores comunes pueden ocurrir al manejar concurrencia en un sistema de pagos?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización del Event Loop en tu sistema de pagos?

## Criterios de Evaluacion

- Identificación correcta de puntos de concurrencia críticos.
- Implementación efectiva de mecanismos anti-bloqueo.
- Comprensión y optimización del Event Loop.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
