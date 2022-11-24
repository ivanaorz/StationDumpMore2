public class SmallTruck extends Vehicle {

    public SmallTruck (int weight) {

        super("small truck", weight);
    }

    public String toString() {
        return "Small truck, weight =" + weight;
    }
}
