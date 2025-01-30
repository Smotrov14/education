public class Memory {
    private final int weight ;
    private final int volume ;
    private final String type ;

    public Memory(int weight, int volume, String type) {
        this.weight = weight;
        this.volume = volume;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }
    public int getVolume() {
        return volume;
    }
    public String getType() {
        return type;
    }

    public Memory setWeight(int weight) {
        return new Memory(weight,volume,type);
    }
    public Memory setVolume(int volume) {
        return new Memory(weight,volume,type);
    }
    public Memory setVolume(String type) {
        return new Memory(weight,volume,type);
    }
    public String toString() {
        return " Вес оперативки: " + this.weight + " Объем памяти: " + this.volume + " Тип памяти: " + this.type;
    }
}
