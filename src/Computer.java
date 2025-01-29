
public class Computer {
 private  final String vendor ;
 private  final String name ;
 public Cpu cpu;
 public Memory memory;
        public Computer (String vendor, String name,Cpu cpu,Memory memory){
            this.vendor=vendor;
            this.name=name;
            this.cpu = cpu;
            this.memory= memory;
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


        Hdd hdd =  new Hdd(900, 1024);
        Display display = new Display(3200,27);
        Keyboard keyboard = new Keyboard(700);
 public int getAllWeight(){
     return (cpu.getWeight()+ memory.getWeight()+ hdd.getWeight()+ display.getWeight()+ keyboard.getWeight());
 }


public String getAllInfo(){
     return "компьтер бренда " + vendor + " модель компьютера " + name + cpu.toString() + memory.toString();
}

}
