import java.util.Scanner;
public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.print("What is your name? ");
		Scanner user = new Scanner(System.in);
		String name = user.next();
		System.out.println("Hello," + name);
	}
}
