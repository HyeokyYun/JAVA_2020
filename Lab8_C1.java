import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int num;
	int sum = 0;
	int count = 0;
	while(true){
		try{
			num = keyboard.nextInt();
			sum += num;
			count++;
			if(count == 5){
				System.out.println("Result: " + sum);
				break;
			}
		}
		catch(InputMismatchException e){
			System.out.println("Exception: Not Integer!");
			break;
		}
	}
  }
}
