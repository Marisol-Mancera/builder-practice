# House Builder — Spring Boot (Java 21)

Práctica del patrón **Builder** aplicada a la entidad `House`, permitiendo construir **variantes** de casa (garage, garden, swimmingPool, fancyStatues) de forma **flexible**, **escalable** y **desacoplada**.

---

## Requisitos previos
- **Java 21**
- **Maven** 3.9+
- IDE a elección (IntelliJ / VS Code / Eclipse)

---

## 🏗️ Arquitectura del patrón (resumen)

- **Product:** `House` — modelo con atributos básicos (`rooms`, `floors`) y extras (`hasGarage`, `hasGarden`, `hasSwimmingPool`, `hasFancyStatues`).  
- **Builder (interface):** `HouseBuilder` — define **pasos de construcción** (`withRooms`, `withFloors`, `withGarage`, etc.) y `build()`.  
- **Concrete Builder:** `DefaultHouseBuilder` — mantiene una **instancia interna** de `House`, la **rellena con setters** y la devuelve en `build()`.  
- **Director:** `HouseDirector` — orquesta **“recetas”** (garage, garden, swimmingPool, fancyStatues) llamando al builder en un orden fijo.

---

## 📂 Estructura del proyecto

```
src
├─ main
│  └─ java
│     └─ dev/marisol/builder_practice
│        ├─ entities/
│        │  └─ House.java
│        ├─ builder/
│        │  ├─ HouseBuilder.java
│        │  └─ DefaultHouseBuilder.java
│        └─ director/
│           └─ HouseDirector.java
└─ test
   └─ java
      └─ dev/marisol/builder_practice
         ├─ builder/
         │  └─ DefaultHouseBuilderTest.java
         └─ director/
            └─ HouseDirectorTest.java
```

---


## 📈 Cobertura de pruebas (≥ 70%) 


<img width="335" height="260" alt="builder-cover" src="https://github.com/user-attachments/assets/cf2bfc61-2a62-464d-89c8-6ca94b0f581a" />

---

## 📘 Diagrama de clases (Mermaid) 

<img width="1188" height="937" alt="Diagrama-builder drawio" src="https://github.com/user-attachments/assets/1f61e4c4-d2ca-4024-9867-72f5c88ca00b" />

---

## Buenas prácticas aplicadas
- **Separación de responsabilidades** por paquetes: `entities`, `builder`, `director`.
- **Encapsulación**: campos privados; lectura con getters y `hasX()` para booleanos.
- **Builder fluido**: métodos encadenables y `build()` para producir el objeto final.
- **Director**: recetas que evitan duplicación y clarifican el proceso de construcción.
- **Tests AAA**: casos para construcción por defecto, asignación de `rooms/floors` y activación individual de extras.

---

## Autoría
**Marisol Mancera**


