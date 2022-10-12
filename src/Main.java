import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a string.");
        String userInput = scan.nextLine();
        int lenUserInput = userInput.length();

        System.out.println("Your string is " + lenUserInput + " characters long.");

        int half1 = lenUserInput/2;
        System.out.println("The 1st half of your string is " + userInput.substring(0, half1));
        System.out.println("The 2nd half of your string is " + userInput.substring(half1));

        System.out.println("Type in another string.");
        String userInput2 = scan.nextLine();
        int lenUserInput2 = userInput2.length();

        System.out.println("Your 2nd string is " + lenUserInput2 + " characters long.");


        if(lenUserInput > lenUserInput2) {
            System.out.println(userInput + " is longer.");
        }
        else if(lenUserInput2 > lenUserInput){
            System.out.println(userInput2 + " is longer.");
        }
        else {
            System.out.println(userInput + " is the same length as " + userInput2 + ".");
        }


        if(userInput.equals(userInput2)){
            System.out.println("Both Strings have the same charcters");
        }
        else if (userInput.compareTo(userInput2) > 0){
            System.out.println(userInput2 + " is 1st alphabetically.");
        }
        else{
            System.out.println(userInput + " is 1st alphabetically.");
        }


        if (userInput.indexOf(userInput2) >= 0){
            System.out.print(userInput2 + " is found in " + userInput + " at index " + userInput.indexOf(userInput2));
        }
        else{
            System.out.println("Not found.");
        }






        //System.out.println(wow + lenWow);

    }
}