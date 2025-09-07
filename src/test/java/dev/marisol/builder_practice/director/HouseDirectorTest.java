
package dev.marisol.builder_practice.director;

import dev.marisol.builder_practice.builder.DefaultHouseBuilder;
import dev.marisol.builder_practice.builder.HouseBuilder;
import dev.marisol.builder_practice.entity.House;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseDirectorTest {

    @Test
    void shouldBuildHouseWithGaragePreset_whenDirectorBuildsGarageVariant() {
        HouseBuilder builder = new DefaultHouseBuilder();
        HouseDirector director = new HouseDirector(builder);

        House house = director.buildHouseWithGarage();

        assertTrue(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void shouldBuildHouseWithGardenPreset_whenDirectorBuildsGardenVariant() {
        HouseBuilder builder = new DefaultHouseBuilder();
        HouseDirector director = new HouseDirector(builder);

        House house = director.buildHouseWithGarden();

        assertFalse(house.hasGarage());
        assertTrue(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void shouldBuildHouseWithSwimmingPoolPreset_whenDirectorBuildsSwimmingPoolVariant() {
        HouseBuilder builder = new DefaultHouseBuilder();
        HouseDirector director = new HouseDirector(builder);

        House house = director.buildHouseWithSwimmingPool();

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertTrue(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

     @Test
    void shouldBuildHouseWithFancyStatuesPreset_whenDirectorBuildsFancyStatuesVariant() {
        HouseBuilder builder = new DefaultHouseBuilder();
        HouseDirector director = new HouseDirector(builder);

        House house = director.buildHouseWithFancyStatues();

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertTrue(house.hasFancyStatues());
    }
}
