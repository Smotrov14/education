public final class Hdd {
    private final int weight;
    private final int volume;
    private final String type;

    public Hdd(int weight, int volume, String type) {
        this.weight = weight;
        this.volume = volume;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }
    public int getVolume() {
        return volume;
    }

    public Hdd setWeight(int weight) {
        return new Hdd(weight, volume, type);
    }
    public Hdd setVolume(int volume) {
        return new Hdd(weight, volume, type);
    }
    public Hdd setType(String type) {
        return new Hdd(weight, volume, type);
    }

    public String toString() {
        return " Вес Диска: " + this.weight + ", Тип: "+ this.type + " на " +  + this.volume;
    }
}