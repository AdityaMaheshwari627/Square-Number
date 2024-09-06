//Square of a number
package Numbers;

import java.util.Scanner;

public class NumberSquare {

	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number:");
        float num = obj.nextFloat();
        System.out.print("Square of a number is "+Math.pow(num,2));
	}

}
