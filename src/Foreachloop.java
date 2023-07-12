import java.util.ArrayList;

public class Foreachloop {

    // syntax: for (DataType singleElementVarName : the name of Array/Collections to be looped) {
    // the code block will run for each element took out from the array or collections and run the code on it each time}
    // noticed that it doesn't take index
    // can use when we want to get every element of the array/collections, to print it out, to check its status and so on

    public static void main(String[] args) {
        // create an array to iterate through
        int[] numbers = {1, 2, 3, 4, 5};
        // iterate over the elements in array
        for (int number : numbers) {  // means: for each int number in the numbers array
            System.out.print(number +" "); // print 1 2 3 4 5

        }

        // create an ArrayList to iterate through, the data type of elements ArrayList holds use syntax: Wrapper Type: String, Integer and so on
        ArrayList<String> fruits = new ArrayList<>(); // ArrayList no need limitation of size, can add(), remove(), clear(), get(), size()
        // add elements in ArrayList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        // iterate over the elements in ArrayList
        for (String fruit : fruits) { //means: for each String fruit element in ArrayList called fruits
            System.out.print(fruit + " "); // print apple banana cherry
        }




    }
}
