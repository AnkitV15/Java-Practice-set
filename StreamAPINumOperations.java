import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPINumOperations {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();

        numList.add(5);
        numList.add(12);
        numList.add(45);
        numList.add(57);
        numList.add(59);
        numList.add(50);
        numList.add(25);
        numList.add(765);


        Stream<Integer> evenList = numList.stream().filter((n) -> n % 2 == 0);

        int sumOdd = numList.stream().filter(n -> n % 2 != 0).reduce(0,Integer::sum);
        
        int maxValue = numList.stream().reduce(Integer.MIN_VALUE, Integer::max);

        int minValue = numList.stream().reduce(Integer.MAX_VALUE, Integer::min);

        evenList.forEach((n) -> System.out.println(n));

        System.out.println(sumOdd);

        System.out.println("Max Value: " +  maxValue);
        
        System.out.println("Min Value: " +  minValue);

    }
}
