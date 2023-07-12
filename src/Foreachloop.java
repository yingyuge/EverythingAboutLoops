import java.util.ArrayList;
import java.util.HashMap;

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

        // create a HashMap, Wrapper type when defining the data type of key and value of the HashMap
        HashMap<String, Double> ItemWithPrice = new HashMap<>();
        // add key-value pair using put() method
        ItemWithPrice.put("Chips", 1.2);
        ItemWithPrice.put("Tomaten", 2.1);
        // iterate through the HashMap using foreach
        for (String itemkey : ItemWithPrice.keySet()) { //means: for each item among the items(key!) in ItemWithPrice HashMap
            System.out.println("Item: " + itemkey + " price: " + ItemWithPrice.get(itemkey) + "."); // get() method need parameter key to retrieve the value, the value here is price of the item
        }
        // HashMap has methods: .put(key, value) to define the content of map
        // .keySet() method to get a Set, which has the keys of the HashMap
        // .remove(key) to remove the key-value pair
        // .clear() then the HashMap is empty
        // .size() get the length of HashMap
        // .containsKey(key) to see if the key is in the map, return boolean value
        // .replace(key, new value) to replace the value of a key
        // .values() returns a Collection containing all the values (without their keys) in the HashMap
        }


    }
