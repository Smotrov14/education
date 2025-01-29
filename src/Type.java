public enum Type {
   CPU("QuadCore - Intel " ),
    MEMORY("DDR4"),
    HDD("SSD "),
    DISPLAY("IPS "),
    KEYBOARD("Mekanikal RGB");
    private String value;
    public String getValue() {
        return value;
    }
    Type(String value) {
        this.value = value;
    }
}
