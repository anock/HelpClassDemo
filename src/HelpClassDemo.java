
class Help {

	void helpOn(int what) {
		switch (what) {

		case '1':
			System.out.println("The if : \n");
			System.out.println("The if (condition)");
			System.out.println("The else statement");
			break;

		case '2':

			System.out.println(" 	The switch : 	\n");
			System.out.println(" 	Switch (expression)	");
			System.out.println(" 	case constat:	");
			System.out.println(" 	statement sequence	");
			System.out.println("  	break ; 	");
			System.out.println("	The if : 	");
			System.out.println(" // ....");
			System.out.println("}");

			break;

		case '3':
			System.out.println("The for : \n");
			System.out.println("For(init; condition,iteration)");
			System.out.println("statement");
			break;

		case '4':

			System.out.println("the while : \n");
			System.out.println("while(condition) statement ;");
			break;

		case '5':
			System.out.println("The do-while : \n");
			System.out.println("do {");
			System.out.println("statement ;");
			System.out.println("} while(condition)");
			break;

		case '6':
			System.out.println("The break: \n");
			System.out.println("break ; or break label");
			break;

		case '7':
			System.out.println("The continue: \n");
			System.out.println("continue; or continue label \n");

		}
		System.out.println();
	}

	void showMenu() {
		System.out.println("Help On:");
		System.out.println("1 . if");
		System.out.println("2 . switch");
		System.out.println("3. for");
		System.out.println("4 . while");
		System.out.println("5 . do-while");
		System.out.println("6. break");
		System.out.println("7. continue \n");
		System.out.println("Choose one (q to quit) : ");
	}

	boolean isValid(int ch) {

		if (ch < '1' | ch > '7' & ch != 'q')
			return false;
		else
			return true;

	}

}

class HelpClassDemo {

	public static void main(String args[])

			throws java.io.IOException {
		char choice, ignore;

		Help h1 = new Help();

		for (;;) {
			do {
				h1.showMenu();
				choice = (char) System.in.read();

				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');

			} while (!h1.isValid(choice));

			if (choice == 'q')
				break;

			System.out.println("\n");

			h1.helpOn(choice);
		}

	}

}
