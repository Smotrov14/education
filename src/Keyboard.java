public final class Keyboard {
    private final int weight;
    private final String type;
    private final boolean isLight;

    public Keyboard(int weight, String type, boolean isLight) {
        this.weight = weight;
        this.type = type;
        this.isLight = isLight;
    }

    public int getWeight() {
        return weight;
    }
    public String getType() {
        return type;
    }
    public boolean getIsLight() {
        return isLight;
    }

    public Keyboard setWeight(int weight) {
        return new Keyboard(weight,type,isLight);
    }
    public Keyboard setType(String type) {
        return new Keyboard(weight,type,isLight);
    }
    public Keyboard setIsLight(boolean isLight) {
        return new Keyboard(weight,type,isLight);
    }

    public String toString() {
        return " Вес клавиатуры: " + this.weight + ", Тип: "+ this.type + " с подсветкой?: " +   this.isLight;
    }
}
