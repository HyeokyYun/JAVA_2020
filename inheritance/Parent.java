package inheritance;

public class Parent{
	//public Parent() {
	//	System.out.println("Parent Constructor");
	//}
	public Parent(String name) {
		System.out.println("Parent(String) Constructor");
	}
	public Parent(Inheritance obj) {
		System.out.println("Parent(Interitance) Constructor");
	}
	public void printName() {
		System.out.println("printName() - Parent");
	}
}
