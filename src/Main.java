import java.util.*;
public class Main {
    public static void main(String args[]) {
        String expression;
        Scanner scanner = new Scanner(System.in);
        boolean var = false;
        Calculator calcolatrice;
        do {
            double a = 0, b = 0, ris;
            char op = ' ';
            System.out.println("Inserire l'espressione che si desidera risolvere utilizzando questa \"sintassi\": num1 op num2");
            expression = scanner.nextLine();
            var = false;
            calcolatrice=new Calculator(a,b,op);
        } while(var);
        calcolatrice.calculate();
    }
}