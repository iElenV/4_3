import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mass = scanner.nextLine();
        String [] number = mass.split( " ");
        ArrayList <Integer> arr = new ArrayList<>();
        for (String s : number) {
            arr.add(Integer.parseInt(s));
        }



        System.out.println(arr);
        int same = arr.get(0);
        int k = 0;

        for (int i = 0; i <arr.size(); i++) {
         if (arr.get(i) != same) {
             k++;
                       }
                }
       String repeat= k==0? "Yes-все одинаковы" : "No - есть различия";
       System.out.println(repeat);
    }
}