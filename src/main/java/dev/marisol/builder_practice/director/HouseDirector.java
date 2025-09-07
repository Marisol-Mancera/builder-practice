package dev.marisol.builder_practice.director;

import dev.marisol.builder_practice.builder.HouseBuilder;
import dev.marisol.builder_practice.entity.House;


public class HouseDirector {

    private final HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House buildHouseWithGarage() {
        return builder.reset()
                .withRooms(0)
                .withFloors(0)
                .withGarage()
                .build();
    }

    public House buildHouseWithGarden() {
        return builder.reset()
                .withRooms(0)
                .withFloors(0)
                .withGarden()
                .build();
    }

    public House buildHouseWithSwimmingPool() {
        return builder.reset()
                .withRooms(0)
                .withFloors(0)
                .withSwimmingPool()
                .build();
    }

    public House buildHouseWithFancyStatues() {
        return builder.reset()
                .withRooms(0)
                .withFloors(0)
                .withFancyStatues()
                .build();
    }
}
