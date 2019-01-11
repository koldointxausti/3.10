import java.util.Scanner;
import com.zubiri.user.*;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		boolean repeat = true;
		while (repeat) {
			System.out.println("Press one of the following numbers:");
			System.out.println("[1] Login");
			System.out.println("[2] Register");
			System.out.println("[0] Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Bye!");
				repeat = false;
				break;
			case 1:
				for (int i = 0; i < 10; ++i)
					System.out.println();
				if (user.getName().equals("null")) {
					System.out.println("No user registered yet");

				} else {
					System.out.println("Username:");
					String username = sc.next();
					sc.nextLine();
					if (username.equals(user.getName())) {
						System.out.println("Password:");
						String password = sc.nextLine();
						if (password.equals(user.getPassword())) {
							System.out.println("Hi " + username + "!");
							System.out.println();
							System.out.println("There are no options avaiable yet, would you like to exit?");
							boolean askAgain = true;
							while (askAgain) {
								String answer = sc.nextLine().toLowerCase();
								switch (answer) {
								case "y":
									askAgain = false; // get out of this loop but no out of the biggest loop (playAgain)
									break;
								case "n":
									askAgain = false; // get out of this loop
									repeat = false;
									break;
								default:
									System.out.println("Enter a posible answer ('y' for yes or 'n' for no)");
									break;
								}
							}
						}
					}else
						System.out.println("Incorrect username");
				}
				break;
			case 2:
				for (int i = 0; i < 10; ++i)
					System.out.println();
				System.out.println("Username:");
				String name = sc.nextLine();
				System.out.println(name);
				if (user.setName(name)) {
					System.out.println("Password:");
					String password = sc.nextLine();
					if (user.setPassword(password))
						System.out.println("Done");
					else {
						System.out.println("Enter a valid password");
						System.out.println(
								"It has to have at least a letter,  a number, a symbol and 8 or more characters long");
					}
				} else
					System.out.println("Enter a valid username (no numbers or digits)");
				break;
			default:
				System.out.println("Enter a valid number");
				break;
			}
		}
		sc.close();
	}
}
