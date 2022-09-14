import java.util.Scanner;
public class Answer {
    public static void main(String[] args) {
        System.out.println("Этот калькулятор совершает элементарные операции с числами от 1 до 10 в римском и греческом виде");
        int next1=1;
        while (next1 > 0){
            Scanner s = new Scanner(System.in);
            System.out.println("Введите выражение через пробел");
            String input=s.nextLine();
            if ( input.length()<5){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("throws Exception //т.к. строка не является математической операцией ");;
                }
            }
            else{
                Main a = new Main();
                System.out.println(a.calc(input));}
        }
    }
}