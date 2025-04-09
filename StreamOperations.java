import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,4,23,2,3,42,1,23,340,0);

        List<Integer> evenSquares = numbers.stream()
            .filter(n -> n % 2 == 0)
            .filter(n -> n != 0)
            .map(n -> n * n)
            .collect(Collectors.toList());

        evenSquares.forEach(System.out::println);
    }
}
