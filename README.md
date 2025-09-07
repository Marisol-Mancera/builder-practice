# House Builder — Spring Boot (Java 21)

Práctica del patrón **Builder** aplicada a la entidad `House`, permitiendo construir **variantes** de casa (garage, garden, swimmingPool, fancyStatues) de forma **flexible**, **escalable** y **desacoplada**.

> **Stack:** Java **21**, Spring Boot, JUnit 5.  
> **Objetivo:** aplicar correctamente el patrón Builder + **≥ 70%** de cobertura + **diagrama de clases** integrado en este README.

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

## 📘 Diagrama de clases (Mermaid) — **debe corresponder al código**

```mermaid
classDiagram
    direction LR

    class House {
        - rooms: int
        - floors: int
        - hasGarage: Boolean
        - hasGarden: Boolean
        - hasSwimmingPool: Boolean
        - hasFancyStatues: Boolean
        + House()
        + getRooms(): int
        + getFloors(): int
        + hasGarage(): boolean
        + hasGarden(): boolean
        + hasSwimmingPool(): boolean
        + hasFancyStatues(): boolean
        + setRooms(rooms: int): void
        + setFloors(floors: int): void
        + setHasGarage(hasGarage: Boolean): void
        + setHasGarden(hasGarden: Boolean): void
        + setHasSwimmingPool(hasSwimmingPool: Boolean): void
        + setHasFancyStatues(hasFancyStatues: Boolean): void
    }

    class HouseBuilder {
        <<interface>>
        + reset(): HouseBuilder
        + withRooms(rooms: int): HouseBuilder
        + withFloors(floors: int): HouseBuilder
        + withGarage(): HouseBuilder
        + withGarden(): HouseBuilder
        + withSwimmingPool(): HouseBuilder
        + withFancyStatues(): HouseBuilder
        + build(): House
    }

    class DefaultHouseBuilder {
        - house: House
        + DefaultHouseBuilder()
        + reset(): HouseBuilder
        + withRooms(rooms: int): HouseBuilder
        + withFloors(floors: int): HouseBuilder
        + withGarage(): HouseBuilder
        + withGarden(): HouseBuilder
        + withSwimmingPool(): HouseBuilder
        + withFancyStatues(): HouseBuilder
        + build(): House
    }

    class HouseDirector {
        - builder: HouseBuilder
        + HouseDirector(builder: HouseBuilder)
        + buildHouseWithGarage(): House
        + buildHouseWithGarden(): House
        + buildHouseWithSwimmingPool(): House
        + buildHouseWithFancyStatues(): House
    }

    HouseBuilder <|.. DefaultHouseBuilder : implements
    HouseDirector --> HouseBuilder : uses
    DefaultHouseBuilder --> House : fills
```



---
## Estado de la práctica

Esta entrega implementa el patrón **Builder** sobre la entidad `House`, permitiendo construir variantes configurables (garage, garden, swimmingPool, fancyStatues).  
Los **tests unitarios** siguen el enfoque AAA y el objetivo de **≥ 70%** de cobertura.  
El **diagrama de clases** incluido corresponde a la implementación actual.  
La evidencia de cobertura se adjunta en la sección **Cobertura de pruebas**.

## Autoría
**Marisol Mancera**


