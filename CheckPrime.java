/**
 * CheckPrime
 */
import java.util.Scanner;
public class CheckPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value: ");
        int number = input.nextInt();
        boolean stopNumber = true;
        int i = 2;

	if(number <= 1) {
	System.out.print(number + " is NOT a PRIME NUMBER!");
	}
        while(i <= (number / 2)) {
            if (number % i == 0) {
               stopNumber = false;
                break;
            }
            ++i;
        }
        if(stopNumber) {
            System.out.print(number + " is a PRIME NUMBER!");
        } else {
	    System.out.print(number + " is NOT a PRIME NUMBER!");
	}
        input.close();
    }
}