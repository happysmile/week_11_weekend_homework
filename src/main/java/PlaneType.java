public enum PlaneType {
    AirbusA220(120, 400),
    AirbusA320(180,500),
    AirbusA330(250, 550),
    AirbusA350(300,600),
    AirbusA380(500, 700),
    Boeing737(130, 500),
    Boeing747(150,400),
    Boeing767(180,300),
    Boeing777(190,500),
    Boeing787(200, 400);

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
