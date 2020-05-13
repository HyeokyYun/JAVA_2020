import java.util.Scanner; 
public class Main { 
		public static void main(String[] args) { 
					System.out.println("Enter a nonnegative number:"); 
							Scanner kb = new Scanner(System.in); 
									int number = kb.nextInt(); 
											System.out.println(number + " contains " + getNumberOfZeros(number) + " zeros."); 
													kb.close(); 
															} 
				/** Precondition: n >=0 Returns the number of zero digits in n. */ 
				public static int getNumberOfZeros(int n){ 
								int result; if (n == 0) result = 1; 
											else if (n < 10) result = 0; //n has one digit that is not 0 
														else if (n % 10 == 0) result = getNumberOfZeros(n / 10) + 1; 
																	else //n % 10 !=0 
																					result = getNumberOfZeros(n / 10);
																		return result;
																			}
}