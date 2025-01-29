public class ArithmeticCalculator {
    private int num1;
    private int num2;

    public ArithmeticCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void aktion(Operation operation){
        if( operation == Operation.ADD){
            System.out.println("Summ: " + (getNum1()+getNum2()));
        }
        else if( operation  == Operation.SUBTRACT){
            System.out.println("minus: "+ (getNum1()-getNum2()));
        }
        else if(operation == Operation.MULTIPLY){
            System.out.println("Umnogit: " + (getNum1()*getNum2()));
        }
        else {
            System.out.println("Error");
        }
    }
}
