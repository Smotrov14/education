public class Hdd {
    private int weight ;
    private int volume ;

    public Hdd(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }
    public int getVolume() {
        return volume;
    }
    public Hdd setWeight(int weight) {
        return new Hdd(weight,volume);
    }
    public Hdd setVolume(int volume) {
       return new Hdd(weight,volume);
    }



}
