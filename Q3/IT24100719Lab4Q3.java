import java.util.Scanner;

public class IT24100719Lab4Q3 {
    public static void main(String[] args) {


        Scanner Input = new Scanner(System.in);
    

        System.out.print("Enter a number: ");
        int number = Input.nextInt();

        String result = (number > 0) ? "Positive":
                        (number < 0) ? "Negative" :
                        "Zero";

        System.out.println("The number is " + result + ".");

        Input.close();
    }
}