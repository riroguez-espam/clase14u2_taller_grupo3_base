# Taller POO • Grupo 3 (4 Integrantes): Sistema Clínico y Telemedicina

**Dominio:** Recetas médicas, citas e historial clínico desacoplados mediante 3 interfaces (`Exportable`, `Persistible` y `Notificable`).

## Flujo Obligatorio en GitHub (60 min)
1. Subir esta plantilla a `main` y crear **4 Issues** (uno por integrante).
2. Cada alumno crea su rama desde `main`: `git checkout -b feat/<nombre-apellido>`.
3. Completar únicamente los `TODO` de su Issue, hacer `push` y abrir un **Pull Request** con `Closes #<num>`.
4. Revisar cruzadamente y fusionar todo en `main` antes de los 10 minutos de sustentación.

## Reparto de Issues
- **Issue #1 (Geovanny Ríos):** Verificar/documentar interfaces (`Exportable`, `Persistible`, `Notificable`) y completar `CitaMedica.java`.
- **Issue #2 (Sylvia Sánchez):** Completar `RecetaMedica.java` con implementación múltiple de las 3 interfaces.
- **Issue #3 (Alex Vásquez):** Completar `HistorialClinico.java` implementando `Exportable` y `Persistible`.
- **Issue #4 (Alex Vásquez):** Completar `ServicioClinico.java` (desacoplado por interfaces) y pruebas en `Main.java`.

## Compilación y Ejecución

```bash
javac -d out src/interfaces/*.java src/modelos/*.java src/servicios/*.java src/app/Main.java
java -cp out app.Main
```

## Estado de Implementación
- **Interfaces y `CitaMedica.java`:** Interfaces `Exportable`, `Persistible` y `Notificable` documentadas; `CitaMedica` implementa `Persistible` y `Notificable`.
- **`RecetaMedica.java`:** Implementación múltiple de `Exportable`, `Persistible` y `Notificable`.
- **`HistorialClinico.java`:** Implementación de `Exportable` y `Persistible`.
- **`ServicioClinico.java` y `Main.java`:** Servicio desacoplado por interfaces y pruebas integradas ejecutándose correctamente.

## Resultado de Ejecución

```text
=== PRUEBAS DE EXPORTACIÓN ===
Exportando documento: Receta [REC-104] - Paciente: Paciente 1 | Medicamento: Paracetamol 500mg
Exportando documento: Historial Clinico [Paciente: Paciente 1, Diagnostico: Control preventivo anual]

=== PRUEBAS DE GUARDADO ===
Cita registrada: Paciente 1 | Medicina General | 26/11/2026 09:00
Resultado de guardado: true
Receta médica REC-104 guardada en el sistema.
Resultado de guardado: true
Historial clinico de Paciente 1 guardado exitosamente.
Resultado de guardado: true

=== PRUEBAS DE NOTIFICACIÓN ===
Recordatorio de cita enviado a paciente1@correo.com: Paciente 1 - Medicina General (26/11/2026 09:00)
Enviando receta digital REC-104 al destino: +593987654321
```
