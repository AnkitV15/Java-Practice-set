import java.util.ArrayList;

public class LambdaExpressions {
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("c");
        stringList.add("d");
        stringList.add("a");

        stringList.sort(null);

        System.out.println(stringList);
    }
}
