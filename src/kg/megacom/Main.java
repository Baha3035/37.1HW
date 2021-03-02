package kg.megacom;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> marks = new Stack<>();
        marks.push("Mercedes");
        marks.push("FIAT");
        marks.push("Lexus");
        marks.push("Lamborghini");
        marks.push("RollsRoyce");

        for (String marksEach:
             marks) {
            System.out.println(marksEach);
        }

        marks.pop();
        System.out.println(" ");
        System.out.println("Last element after removing the last: " + marks.peek());
        System.out.println("Index of the firs element: " + marks.indexOf("Mercedes"));

    }
}
