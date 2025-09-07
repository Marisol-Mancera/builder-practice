package dev.marisol.builder_practice.builder;

import dev.marisol.builder_practice.entity.*;
import org.springframework.stereotype.Component;

@Component
public class DefaultHouseBuilder implements HouseBuilder {

    private House house;

    public DefaultHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder reset() {
        this.house = new House();
        return this;
    }

    @Override
    public HouseBuilder withRooms(int rooms) {
        this.house.setRooms(rooms);
        return this;
    }

    @Override
    public HouseBuilder withFloors(int floors) {
        this.house.setFloors(floors);
        return this;
    }

    @Override
    public HouseBuilder withGarage() {
        this.house.setHasGarage(true);
        return this;
    }

    @Override
    public HouseBuilder withGarden() {
        this.house.setHasGarden(true);
        return this;
    }

    @Override
    public HouseBuilder withSwimmingPool() {
        this.house.setHasSwimmingPool(true);
        return this;
    }

    @Override
    public HouseBuilder withFancyStatues() {
        this.house.setHasFancyStatues(true);
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }
}
