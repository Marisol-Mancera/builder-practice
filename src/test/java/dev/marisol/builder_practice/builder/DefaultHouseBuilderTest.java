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
        assertFalse(house.getHasGarage());
        assertFalse(house.getHasGarden());
        assertFalse(house.getHasSwimmingPool());
        assertFalse(house.getHasFancyStatues());
    }
}

