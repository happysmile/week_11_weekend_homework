public enum PlaneType {
    AirbusA220(120, 40000),
    AirbusA320(180,50000),
    AirbusA330(250, 55000),
    AirbusA350(300,60000),
    AirbusA380(500, 70000),
    Boeing737(130, 50000),
    Boeing747(150,40000),
    Boeing767(180,30000),
    Boeing777(190,50000),
    Boeing787(200, 40000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }
}
