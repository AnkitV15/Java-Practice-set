// Java program to take input

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineInput {
    public static void main(String[] args) throws IOException{

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String str = bfn.readLine();

        int it = Integer.parseInt(bfn.readLine());

        System.out.println("String Input: " + str);
        System.out.println("Integer Input: " + it);
    }
}
