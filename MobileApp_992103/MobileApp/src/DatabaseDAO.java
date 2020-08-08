import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class DatabaseDAO {
	private static Map<BigInteger, Integer > database =new HashMap<>();
		
		
		public void addRecord(BigInteger key, Integer val) {
			database.put(key,val);
			System.out.println("New record added successfully!!\n");
			return;
		}
		
		public void display(BigInteger key) {
			if(database.get(key)==null)
				{System.out.println("The given Mobile Number does not exist.\n");
				return;
				}
			else {
				System.out.println("Your current balance is: Rs "+database.get(key)+"\n");
				return;
			}
		}
		
		public void recharge(BigInteger key,Integer value) {
			if(database.get(key)==null)
				System.out.println("The given Mobile number does not exist.");
			else {
				database.put(key, database.get(key)+value);
				System.out.println("Recharge Successful!! Your new balance is "+database.get(key));
				return;
			}
	}
}