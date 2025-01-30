public final class Display {
    private final int weight;
    private final int size;
    private final String type;

    public Display(int weight, int size, String type) {
        this.weight = weight;
        this.size = size;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }
    public int getSize() {
        return size;
    }
    public String getType() {
        return type;
    }

    public Display setWeight(int weight) {
        return new Display(weight,size,type);
    }
    public Display setSize(int size) {
        return new Display(weight,size,type);
    }
    public Display setType(String type){
        return new Display(weight,size,type);
    }

    public String toString() {
        return " Вес монитора: " + this.weight + ", Тип: "+ this.type + " диагональю " +  + this.size;
    }
}



