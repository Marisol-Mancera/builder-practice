package dev.marisol.builder_practice.entity;

public final class House {
    private int rooms;
    private int floors;
    private boolean garage;
    private boolean garden;
    private boolean swimmingPool;
    private boolean fancyStatues;

    private House(int rooms, int floors, boolean garage, boolean garden, boolean swimmingPool, boolean fancyStatues) {
        this.rooms = rooms;
        this.floors = floors;
        this.garage = garage;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
        this.fancyStatues = fancyStatues;
    }

    public int getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

   public boolean hasGarage() {
        return garage;
    }

    public boolean hasGarden() {
        return garden;
    }

    public boolean hasSwimmingPool() {
        return swimmingPool;
    }

    public boolean hasFancyStatues() {
        return fancyStatues;
    }
        
}