package dev.marisol.builder_practice.builder;

import dev.marisol.builder_practice.entity.House;

public interface HouseBuilder {

    //pone todos los atributos en valores iniciales
    //para poder reutilizar el builder
    HouseBuilder reset();

    HouseBuilder withRooms(int rooms);

    HouseBuilder withFloors(int floors);

    HouseBuilder withGarage();

    HouseBuilder withGarden();

    HouseBuilder withSwimmingPool();

    HouseBuilder withFancyStatues();

    House build();
    
} 
