import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator first = new ArithmeticCalculator(5,7);
        first.aktion(Operation.ADD);
        first.aktion(Operation.SUBTRACT);
        first.aktion(Operation.MULTIPLY);
        ArithmeticCalculator second = new ArithmeticCalculator(256,512);
        second.aktion(Operation.MULTIPLY);



        Computer computer = new Computer("MSI","ProGamingTurbo");
        computer.cpu = new Cpu(140, 4300,"Intel",8);
        computer.memory = new Memory(160, 32,"DDR4");
        System.out.println("общий вес пк: " + computer.getAllWeight());
        System.out.println(computer.getAllInfo());


        Computer computer2 = new Computer("Honor","Magik book");
        computer2.cpu= new Cpu(17842, 4300,"AMD",16);
        computer2.memory = new Memory(160, 32,"DDR4");
        System.out.println("общий вес пк: " + computer2.getAllWeight());
        System.out.println(computer2.getAllInfo());


        }

    }
