import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Emum Калькулятор
        ArithmeticCalculator first = new ArithmeticCalculator(5,7);
        first.aktion(Operation.ADD);
        first.aktion(Operation.SUBTRACT);
        first.aktion(Operation.MULTIPLY);
        ArithmeticCalculator second = new ArithmeticCalculator(256,512);
        second.aktion(Operation.MULTIPLY);

        // Задача с компьютером
        Computer computer = new Computer("MSI","ProGamingTurbo");
        computer.cpu = new Cpu(140, 4300,"Intel",8);
        computer.memory = new Memory(160, 32,"DDR4");
        computer.hdd = new Hdd(400,1024,"SSD");
        computer.display = new Display(3200,32,"IPS");
        computer.keyboard = new Keyboard(800,"mekamical",true);
        System.out.println("общий вес пк: " + computer.getAllWeight());
        System.out.println(computer.getAllInfo());


        Computer computer2 = new Computer("Honor","Magik book");
        computer2.cpu= new Cpu(17842, 4300,"AMD",16);
        computer2.memory = new Memory(160, 32,"DDR4");
        computer2.hdd = new Hdd(400,2048,"SSD");
        computer2.display = new Display(3200,27,"Qled");
        computer2.keyboard = new Keyboard(800,"mekamical",true);
        System.out.println("общий вес пк: " + computer2.getAllWeight());
        System.out.println(computer2.getAllInfo());


        }

    }
