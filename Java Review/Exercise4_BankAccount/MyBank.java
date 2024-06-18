import java.util.*; 


public class MyBank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bankingOptions = 0; 

		/* IGNORE ME
		ArrayList<BankAccount> accountLists = new ArrayList<>(); 
		*/

		BankAccount account1 = createAccount(scanner);


		do {
			printAst();
			System.out.println("\n!!! [BANK OPTIONS] !!!");
			System.out.println("(1) Credit Cash");
			System.out.println("(2) Debit Cash");
			System.out.println("(3) Account Inquiry");
			System.out.println("(4) Exit Banking");

			System.out.print("Choice: ");
			bankingOptions = scanner.nextInt();

			switch(bankingOptions) {
			case 1: 
				printAst();
				System.out.println("Deposit Amount: ");
				double depositAmount = scanner.nextDouble();
				printAst();
				if (account1.creditCash(depositAmount)) {
					System.out.println("!!! [DEPOSIT SUCCESSFUL] !!!");
					System.out.println(account1.getCashBalance()); 

				} else {
					System.out.println("!!! [DEPOSIT UNSUCCESSFUL] !!!");
					System.out.println("!!! PLEASE CHECK DEPOSIT AMOUNT !!!");
				}
				break;
			case 2: 
				printAst();
				System.out.println("Withdrawal Amount: ");
				double withdrawalAmount = scanner.nextDouble();
				printAst(); 
				if (account1.debitCash(withdrawalAmount)) {
					System.out.println("!!! [WITHDRAWAL SUCCESSFUL] !!!");
					System.out.println("Update balance: " + account1.getCashBalance()); 

				} else {
					System.out.println("!!! [WITHDRAWAL UNSUCCESSFUL] !!!");
					System.out.println("!!! PLEASE CHECK WITHDRAWAL AMOUNT !!!");
				}
				break;
			case 3: 
				printAst();
				System.out.println("!!! [ACCOUNT INQUIRY] !!!");
				System.out.println("Updated balance: " + account1.accountInquiry());
				break;
			case 4: 
				printAst();
				System.out.println("!!! [EXIT BANKING] !!!");
			}


		} while(bankingOptions != 4);

		
	}

	public static BankAccount createAccount(Scanner scanner) {

		printAst(); 
		System.out.println("\n!!! [CREATE ACCOUNT] !!!");

		System.out.print("Enter name: ");
		String name = scanner.nextLine();

		System.out.print("Enter ID: ");
		int id = scanner.nextInt(); 

		printAst();
		System.out.println("\n!!! [ADD BALANCE] !!!");
		System.out.println("(1) Add now");
		System.out.println("(2) Add later");

		System.out.print("Choice: ");
		int addOptions = scanner.nextInt(); 

		BankAccount tempAccount;

		if(addOptions == 1) {
			System.out.print("Initial amount: ");
			double initialAmount = scanner.nextDouble(); 

			tempAccount = new BankAccount(id, name, initialAmount); 
		} else {
			tempAccount = new BankAccount(id, name);
		}

		return tempAccount;
	}

	public static void printAst() {
		System.out.println("**************************************");
	}


		/* //IGNORE THIS
	public static int bankOptions(Scanner scanner) {
		printAst();
		System.out.println("!!! [BANK OPTIONS] !!!");
		System.out.println("(1) Create Account");
		System.out.println("(2) Exit banking");
		
		do {
			int bankingOptions = scanner.nextInt();
		} while(bankingOptions > 2 || bankOptions < 1);
		
		return bankingOptions;
	}
	*/

}