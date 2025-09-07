package dev.marisol.builder_practice.builder;

import dev.marisol.builder_practice.entity.House;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultHouseBuilderTest {

    @Test
    void shouldBuildHouseWithDefaults_whenOnlyResetAndBuild() {
        DefaultHouseBuilder builder = new DefaultHouseBuilder();

        House house = builder.reset().build();

        assertNotNull(house);
        assertEquals(0, house.getRooms());
        assertEquals(0, house.getFloors());
        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void shouldAssignRoomsAndFloors_whenWithRoomsAndWithFloors() {
        DefaultHouseBuilder builder = new DefaultHouseBuilder();

        House house = builder.reset()
                .withRooms(3)
                .withFloors(2)
                .build();

        assertEquals(3, house.getRooms());
        assertEquals(2, house.getFloors());
        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

     @Test
    void shouldEnableGarageOnly_whenWithGarage() {
        DefaultHouseBuilder builder = new DefaultHouseBuilder();

        House house = builder
                .reset()
                .withGarage()
                .build();

        assertTrue(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

     @Test
    void shouldEnableGarageOnly_whenWithGarden() {
        DefaultHouseBuilder builder = new DefaultHouseBuilder();

        House house = builder
                .reset()
                .withGarden()
                .build();

        assertTrue(house.hasGarden());
        assertFalse(house.hasGarage());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }
}


