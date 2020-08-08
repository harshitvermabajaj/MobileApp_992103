import java.math.BigInteger;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		DatabaseDAO dao=new DatabaseDAO();
		Scanner sc =new Scanner(System.in);
		int i=1;
		System.out.println("Welcome to the mobile app!!\n\nLet's first create a database of few(2-3 or as many as you like) records");
		System.out.println("\nAnd then test our app on that database\n\nPlease choose option 1 for the first time\n\n");
		do {
			System.out.println("1. Add new record\n2. Account Balance Enquiry\n3. Recharge Mobile number\n4. Exit App\n");
			i=sc.nextInt();
			switch(i) {
				case 1:	{
					System.out.println("Enter a valid 10 digit mobile number:");
					BigInteger key=sc.nextBigInteger();
					System.out.println("Enter its current balance");
					Integer val=sc.nextInt();
					dao.addRecord(key, val);
					break;
				}
				case 2: {
					System.out.println("Enter a valid 10 digit mobile number:");
					BigInteger key=sc.nextBigInteger();
					dao.display(key);
					break;
				}
				case 3:{
					System.out.println("Enter a valid 10 digit mobile number:");
					BigInteger key=sc.nextBigInteger();
					System.out.println("Enter the recharge amount");
					Integer val=sc.nextInt();
					dao.recharge(key, val);
					break;
				}
				case 4:{
					System.out.println("Exiting the App!!");
					i=-1;
					break;
				}
				default:{
					System.out.println("Choose a valid option please:");
					i=1;
					break;
				}
			}
		}while(i>0);
		sc.close();
	}

}
