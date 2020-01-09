
/**Kirin Kambon
 * CMSY 166
 * Section 004
 * Keeps track of customers registering new phones
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EventKiosk {

	public static void main(String[] args) {

		ArrayList<Phone> newCustomers = new ArrayList<>();
		Scanner keyboardInput = new Scanner(System.in);

		boolean memberCA;
		String newPhone;
		String newCarrier;

		System.out.println("Is there a customer wanting to buy a new phone? (Y/N):  ");
		while (keyboardInput.nextLine().equalsIgnoreCase("y")) {

			System.out.println("Is the customer a CA member? (Y/N):  ");
			memberCA = (keyboardInput.nextLine().equalsIgnoreCase("y"));

			System.out.println("What type of phone (iPhone, Android, or Moto):  ");
			newPhone = keyboardInput.nextLine();

			System.out.println("What carrier? (Verizon, AT&T, or T-Mobile):  ");
			newCarrier = keyboardInput.nextLine();

			switch (newPhone) {
			case "iPhone": {
				Phone nextPhone = new IPhone(newCarrier, memberCA);
				nextPhone.initialize(newCarrier, memberCA);
				newCustomers.add(nextPhone);
				break;
			}
			case "Android": {
				Phone nextPhone = new Android(newCarrier, memberCA);
				nextPhone.initialize(newCarrier, memberCA);
				newCustomers.add(nextPhone);
				break;
			}
			case "Moto": {
				Phone nextPhone = new Moto(newCarrier, memberCA);
				nextPhone.initialize(newCarrier, memberCA);
				newCustomers.add(nextPhone);
				break;
			}
			default: {
				System.out.println("Unrecognized phone.  Try Again.");
				break;
			}
			}

			System.out.println("Is there a customer wanting to buy a new phone? (Y/N):  ");
		}

		printReport(newCustomers);
	}

	public static void printReport(ArrayList<Phone> newCustomers) {

		System.out.printf("%s%n%s%n%s%n%n", "==========================================================",
				"=       Columbia 50th Annversary Phone Signup Drive      =",
				"==========================================================");

		System.out.println("New Customers:\n");

		for (Phone phone : newCustomers) {
			System.out.printf("%s%n", phone.toString());
		}

	}

}
