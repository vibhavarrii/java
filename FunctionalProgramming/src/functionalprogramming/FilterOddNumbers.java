package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterOddNumbers {

    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()//convert numbers to stream
                      .filter(n -> n % 2 != 0)
                      .collect(Collectors.toList());//converts back to list
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//sc is the object of scanner class
        //System.in is the keyboard input

        int n = sc.nextInt();//reading integer value from user
        List<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            inputList.add(sc.nextInt());
        }

        List<Integer> oddNumbers = filterOddNumbers(inputList);

        System.out.println("Odd Numbers: " + oddNumbers);

        sc.close();
    }
}
