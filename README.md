# Taller POO • Grupo 3 (4 Integrantes): Sistema Clínico y Telemedicina

**Dominio:** Recetas médicas, citas e historial clínico desacoplados mediante 3 interfaces (`Exportable`, `Persistible` y `Notificable`).

## Flujo Obligatorio en GitHub (60 min)
1. Subir esta plantilla a `main` y crear **4 Issues** (uno por integrante).
2. Cada alumno crea su rama desde `main`: `git checkout -b feat/<nombre-apellido>`.
3. Completar únicamente los `TODO` de su Issue, hacer `push` y abrir un **Pull Request** con `Closes #<num>`.
4. Revisar cruzadamente y fusionar todo en `main` antes de los 10 minutos de sustentación.

## Reparto de Issues
- **Issue #1 (Integrante 1):** Verificar/documentar interfaces (`Exportable`, `Persistible`, `Notificable`) y completar `CitaMedica.java`.
- **Issue #2 (Integrante 2):** Completar `RecetaMedica.java` con implementación múltiple de las 3 interfaces.
- **Issue #3 (Integrante 3):** Completar `HistorialClinico.java` implementando `Exportable` y `Persistible`.
- **Issue #4 (Integrante 4):** Completar `ServicioClinico.java` (desacoplado por interfaces) y pruebas en `Main.java`.

## Compilación y Ejecución

```bash
javac -d out src/interfaces/*.java src/modelos/*.java src/servicios/*.java src/app/Main.java
java -cp out app.Main
```
