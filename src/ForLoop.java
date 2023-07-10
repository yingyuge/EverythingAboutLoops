import java.util.ArrayList;

public class ForLoop {
    // for loop syntax: for (int i = starting point; i < ending point; i++) {
    // the code that run so many times that starts from starting point and ends before ending point}
    // the use case of for loop:
    // 1. when you want to run a code block for so many times that you define
    // 2. when you want to do something on elements of arrays or ArrayLists or characters of Strings which index would matter
    // 3. can nest the loops when you want to create a pattern or find duplicate 
    // 4. can use continue/break keywords to skip one element or stop the codeblock in the loop from running
    // 5. can use if statement to decide which element to have the code block executed

    public static void main(String[] args) {
        //this loop will start from when i=0, stop before i reaches 5,
        // everytime after the code inside codeblock{} finished running, i will increase by 1
        // i will then be 0, 1, 2, 3, 4, the code will then run for 5!! times as the starting point is 0!!
        // in this case the output will print 5 times i, which each time i will increase by 1
        for (int i = 0; i < 5; i++ ) {
            System.out.println(i);
        }

        String[] people = new String[3]; //array with data type String, 3 elements
        people[0] = "Bob";              // define the value for 3 elements
        people[1] = "Sally";
        people[2] = "Amy";
        for (int i = 0; i < people.length; i++) { //start the i with 0, because it will represent the index of each element in String array "people"
                                                    // stop with people.length, which is 3, because the String array has 3 elements
            System.out.println(people[i]);          // in the codeblock run the output of all elements in String array, order: people[0],people[1],people[2]
                                                    // when i=0, the output code run, and go back to for(), run "i++" which i=1,run output people[1] and so on
        }

        ArrayList<Integer> ageOfPeople = new ArrayList<>(); //ArrayList with data type Integer, numbers of elements can freestyle
        ageOfPeople.add(20);                                // use add() to add the values in ArrayList
        ageOfPeople.add(30);
        ageOfPeople.add(25);
        for (int i = 0; i < ageOfPeople.size(); i++) { // start with 0 because of the index starts with 0; ends with the size of Arraylist(same use like for array, array.length)
            if (ageOfPeople.get(i) == 30) {                 // point 5 mentioned above, to use if statement to decide which element of which index would the code run for
                ageOfPeople.remove(i);                      // as ArrayList can adjust its size, it doesn't need the size setting like normal arrays, can add freely and remove freely, in this case, i=1
            }
            System.out.println(ageOfPeople.get(i));     // different from array, ArrayList use add method to define(add) values, use get method to get values.
                                                        // notice that this code run after if statement checked and run the if statement codeblock; it is inside for loop still
        }

        String singleName = "Yingyu"; //String data type with a value defined
        for (int i = 0; i < singleName.length(); i++) { // notice the String is a series of characters, the characters are like elements in String, index of first character starts with 0
                                                        // also notice that the length() method for String kept brackets"()", looks different from array.length(without brackets)
            System.out.println(singleName.charAt(i));   // so as array's methods and Arraylist's, String has a lot of methods as well, here with charAt() method we can find the single character in the String

        }

        // the use of continue: to skip one of the code block after the continue keyword
        for (int i= 0; i < 5; i++) { //that's like the first example i made, supposed to print 0 1 2 3 4
            if (i == 3) {               // here comes if statement to decide where i want to skip
                continue;               // here the code is in if statement block, when the condition is true, means when i is 3, the output code in loop will not run,
                                        // jump up to for(),do i++, meaning i will be 4 without outputing 3
            }
            System.out.println(i);    // this is output code inside loop, which when i=3 situation is skipped, output 0 1 2 4
        }
        // the use of break: to stop overall the code block of the loop, the whole loop will finish
        for (int i = 0; i < 5; i++) {
            if (i == 2) {               // here I decide where I want to stop the loop, when i=2
                break;                  // I break the loop, so the code below in the loop would not anymore run, 2 will not be printed, the 3 and 4 neither
            }
            System.out.println(i);      // output 0 1
        }

        // can also use for loop to iterate from back to front, because index can be determined, can be used to find out the reversed order of arrays, Strings...
        String reversedString = "";                        // here I create a new empty String to store the characters later I will find
        for (int i = singleName.length()-1; i >= 0; i--) { // from the example above, the String named singleName.length -1 is used to determine the starting point of loop (length will be 6 but index will be only 0 1 2 3 4 5)
                                                         //which is the length of the array, here means 3, everytime i will decrease by i, so i will be in the order of 3,2,1,0
                                                         // the ending point is the index of first character, which is 0
            char character = singleName.charAt(i);          // the character in the first run of this loop will be the last character in this singleName String
            reversedString = reversedString + character;    // use concatenation operator "+" to add the character found to the empty String
        }
        System.out.println(reversedString);                 // the String singleName was "Yingyu", after reversed should be "uygniY"
                                                            // notice the code is outside the for loop, otherwise everytime the loop code run, it prints, we only want it to print once

        // nest the loop, one loop is in another loop's codeblock, can be used to find duplicate
        String[] listWithDuplicateItem = {"apple", "orange", "apple", "pineapple"}; // here I define the String[] array with duplicated item "apple"
        for (int i = 0; i < listWithDuplicateItem.length; i++) {                    // i starts with 0, so the first item apple will get compared first, evertime this part run, within increment of i(i++), the item followed will get compared
            for (int j = i + 1; j < listWithDuplicateItem.length; j++){             // j starts with i+1, means when comparing apple, it doesn't compare with the first apple anymore, starts with orange, because you don't compare you with yourself
                if(listWithDuplicateItem[i].equals(listWithDuplicateItem[j])) {     //when the item in list with index i equals to the item in the list with index j, means there is duplicate
                    System.out.println(listWithDuplicateItem[i] + " has duplicate.");
                }

            }
        }


    }
}
