package dev.marisol.builder_practice.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void shouldSetAndGetAllFields_correctly() {
        House house = new House();

        house.setRooms(3);
        house.setFloors(2);
        house.setHasGarage(true);
        house.setHasGarden(true);
        house.setHasSwimmingPool(false);
        house.setHasFancyStatues(true);

        assertEquals(3, house.getRooms());
        assertEquals(2, house.getFloors());
        assertTrue(house.getHasGarage());
        assertTrue(house.getHasGarden());
        assertFalse(house.getHasSwimmingPool());
        assertTrue(house.getHasFancyStatues());

        assertTrue(house.hasGarage());
        assertTrue(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertTrue(house.hasFancyStatues());
    }
}
