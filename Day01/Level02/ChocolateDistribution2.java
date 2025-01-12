import java.util.Scanner;

public class ChocolateDistribution2{
	public static void main(String [] args) {
		// Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
		System.out.println(" Enter sthe number of chocolate and number of children ");
		// created the  2 variables numberOfchocolates and numberOfchildren 
		int numberOfchocolates  = input.nextInt();
		int numberOfchildren  = input.nextInt();
		// created  the numberOfchocolatesEachchild and numberOfchocolatesleft
		int numberOfchocolatesEachchild = numberOfchocolates/numberOfchildren;
		int numberOfchocolatesleft = numberOfchocolates % numberOfchildren;
		// display the output
		System.out.println("The number of chocolate each child gets is " + numberOfchocolatesEachchild + "  and the number of remaining chocolates are " + numberOfchocolatesleft);
	}
}