import com.google.common.primitives.Ints;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        List<Integer> myList = Ints.asList(arr);
        System.out.println("List of given array: "
                + myList);


        int arr2[] = { 3, 5, 7 };
        List<Integer> myList2 = Ints.asList(arr2);
        System.out.println("List of given array: "
                + myList2);
    }
}