import java.security.Key;

public class Computer {
 private  final String vendor ;
 private  final String name ;
 public Cpu cpu;
 public Memory memory;
 public Hdd hdd;
 public Display display;
 public Keyboard keyboard;
        public Computer (String vendor, String name,Cpu cpu,Memory memory,Hdd hdd, Display display, Keyboard keyboard){
            this.vendor = vendor;
            this.name = name;
            this.cpu = cpu;
            this.memory = memory;
            this.hdd = hdd;
            this.display = display;
            this.keyboard = keyboard;
        }

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getVendor() {
        return vendor;
    }

 public int getAllWeight(){
     return (cpu.getWeight()+ memory.getWeight()+ hdd.getWeight()+ display.getWeight()+ keyboard.getWeight());
 }

public String getAllInfo(){
     return "компьтер бренда " + vendor + " модель компьютера " + name + cpu.toString() + memory.toString() + hdd.toString() + display.toString() + keyboard.toString();
}

}
