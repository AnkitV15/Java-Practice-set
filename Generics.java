class Add<T extends Number> {
    T firstSpec;
    T secondSpec;

    private double result;

    public void setData(T firstSpec, T secondSpec) {
        this.firstSpec = firstSpec;
        this.secondSpec = secondSpec;
    }

    @SuppressWarnings("unchecked")
    public T getSum() {
        result = this.firstSpec.doubleValue() + this.secondSpec.doubleValue();

        if (firstSpec instanceof Integer) {
            return (T) Integer.valueOf((int) result); 
        } else if (firstSpec instanceof Double) {
            return (T) Double.valueOf(result);
        } else if (firstSpec instanceof Float) {
            return (T) Float.valueOf((float) result);
        } else if (firstSpec instanceof Long) {
            return (T) Long.valueOf((long) result);
        } else {
            throw new UnsupportedOperationException("Type not supported");
        }
    }
}

public class Generics {
    public static void main(String[] args) {
        int first = 198;
        int second = 45;

        Add<Integer> adder = new Add<>(); 
        adder.setData(first, second); 
        int sum = adder.getSum();

        System.out.println("Addition of two numbers is: " + sum); 
    }
}