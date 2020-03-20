public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name) {
        this.name = name;
        this.numberOfBags = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void addBags(int numberOfBags){
        this.numberOfBags += numberOfBags;
    }
}
