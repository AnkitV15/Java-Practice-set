class Calculator {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println(c1.add(5.4, 4.6));
    }
}
