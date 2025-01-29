public class Display {
    private int weight;
    private int size;

    public Display(int weight, int size) {
        this.weight = weight;
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }
    public int getSize() {
        return size;
    }
    public Display setWeight(int weight) {
        return new Display(weight,size);
    }
    public Display setSize(int size) {
        return new Display(weight,size);
    }
}



