public class Plane {

    private PlaneType planeType;
    int capacity;
    int totalWeight;

    public Plane() {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }

    public int getTotalWeight(){
        return this.planeType.getTotalWeight();
    }

}
