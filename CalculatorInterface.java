@FunctionalInterface
interface Calculator {

    int calculate(int a,int b);
}
public class CalculatorInterface {
    public static void main(String[] args) {

        Calculator add = (a,b) -> a + b;
        System.out.println(add.calculate(5, 23));
        
        Calculator subtract = (a,b) -> a - b;
        System.out.println(subtract.calculate(5, 23));
        
        Calculator multiply = (a,b) -> a * b;
        System.out.println(multiply.calculate(5, 23));
        
        Calculator divide = (a,b) -> a / b;
        System.out.println(divide.calculate(5, 23));
        


    }

}
