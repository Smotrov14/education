

public final class Cpu {
    private final int weight;
    private final int frequency;
    private final String name;
    private final int coreCount;

    public Cpu(int weight, int frequency, String name, int coreCount) {
        this.weight = weight;
        this.frequency = frequency;
        this.name = name;
        this.coreCount = coreCount;
    }
    public int getWeight() {
        return weight;
    }
    public int getFrequency() {
        return frequency;
    }
    public int getCoreCount() {
        return coreCount;
    }
    public String getName() {
        return name;
    }

    public Cpu setWeight(int weight) {
       return new Cpu(weight,frequency,name,coreCount);
    }
    public Cpu setFrequency(int frequency) {
        return new Cpu(weight,frequency,name,coreCount);
    }
    public Cpu setName(String name) {
        return new Cpu(weight,frequency,name,coreCount);
    }
    public Cpu setCoreCount(int coreCount) {
        return new Cpu(weight,frequency,name,coreCount);
    }

    public String toString() {
        return " Вес CPU: " + this.weight + " , "+ this.coreCount + " ядер, " + "производитель CPU: " + this.name + " с частотой " + this.frequency;
    }

}

