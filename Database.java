import java.util.Scanner;

public class Database
{	
	public static void main(String[] args) 
	{
        BinaryTree theTree = new BinaryTree(); 
		menu(theTree);
	}// end of main 

	//Prints out menu options and gets user input
	public static void menu (BinaryTree theTree)
	{
		while (true)
		{
			Scanner input = new Scanner (System.in); 

			System.out.println("What would you like to do to the database");
			System.out.println("[A]dd a new contact");
			System.out.println("[R]eplace a contact's name");
			System.out.println("[P]rint the database");
			System.out.println("[Q]uit the program");
			String command = input.next().toUpperCase();

			switch (command) 
			{
				case "A":
			        add(input,theTree);
					break;
				case "R":
					replace(input, theTree);
					break;
				case "P":
					print(input,theTree);
					break;
				case "Q":
					System.exit(0);
					break;
				default:
					//if the input doesn't match anything
					System.out.println("Please enter a vaild input");
					break; 
			} // end of switch case
		}// end of while loop
	} // end of menu method

	//Asks the user for the value that determines the position location in the BST
	//Also asks the position to add
	public static void add(Scanner input, BinaryTree theTree)
	{
		System.out.println("Enter the position value");
		int number = input.nextInt();
		System.out.println("Enter the job title");
		String word = input.next();
		theTree.addNode(number,word);
	} // end of add method 
	
	//Asks the user for the what contact they would like to replace and the new title for that contact
	public static void replace(Scanner input, BinaryTree theTree)
	{
		System.out.println("What is the position value of the contact you want to change");
		int changedKey = input.nextInt();
		System.out.println("What is the new job title");
		String changedName = input.next();
		theTree.replaceNode(changedKey, changedName);
	} // end of replace method 

	//Prints out the datatbase and asks the user in which way they would like it to be printed
	public static void print(Scanner input, BinaryTree theTree)
	{
		Scanner choice = new Scanner (System.in);
		System.out.println("How would you like it to print out");
		System.out.println("[T]op to bottom");
		System.out.println("[B]ottom to top");
		System.out.println("[S]ide to side");
		String option = choice.next().toUpperCase();
			switch (option)
			{
				case "T":
					theTree.preorderTraverseTree(theTree.root);
				break;
				case "B":
					theTree.postOrderTraverseTree(theTree.root);
				break;
				case "S":
					theTree.inOrderTraverseTree(theTree.root);
				break;
			}// end of switch/case	
	} // end of print method
}// end of database 