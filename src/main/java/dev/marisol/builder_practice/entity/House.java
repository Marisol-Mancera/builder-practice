package dev.marisol.builder_practice.entity;

public class House {

    private int rooms;
    private int floors;
    private Boolean hasGarage;
    private Boolean hasGarden;
    private Boolean hasSwimmingPool;
    private Boolean hasFancyStatues;

   public House() {
        this.rooms = 0;
        this.floors = 0;
        this.hasGarage = false;
        this.hasGarden = false;
        this.hasSwimmingPool = false;
        this.hasFancyStatues = false;
    }

    public int getRooms() { 
        return rooms; }

    public int getFloors() { 
        return floors; }

    public Boolean getHasGarage() { 
        return hasGarage; }

    public Boolean getHasGarden() { 
        return hasGarden; }

    public Boolean getHasSwimmingPool() { 
        return hasSwimmingPool; }

    public Boolean getHasFancyStatues() { 
        return hasFancyStatues; }

    public boolean hasGarage() { 
        return Boolean.TRUE.equals(hasGarage); }

    public boolean hasGarden() { 
        return Boolean.TRUE.equals(hasGarden); }

    public boolean hasSwimmingPool() { 
        return Boolean.TRUE.equals(hasSwimmingPool); }

    public boolean hasFancyStatues() { 
        return Boolean.TRUE.equals(hasFancyStatues); }

    public void setRooms(int rooms) { 
        this.rooms = rooms; }

    public void setFloors(int floors) { 
        this.floors = floors; }

    public void setHasGarage(Boolean hasGarage) { 
        this.hasGarage = hasGarage; }

    public void setHasGarden(Boolean hasGarden) { 
        this.hasGarden = hasGarden; }

    public void setHasSwimmingPool(Boolean hasSwimmingPool) { 
        this.hasSwimmingPool = hasSwimmingPool; }

    public void setHasFancyStatues(Boolean hasFancyStatues) { 
        this.hasFancyStatues = hasFancyStatues; }
}