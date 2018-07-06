import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.print("What is your name? ");
		Scanner user = new Scanner(System.in);
		String name = user.next();
		
		System.out.println("Hello," + name);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("How are you, " + name + "?");
		String response1 = user.next();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Shut up, " + name + "!");
		
	}
}
