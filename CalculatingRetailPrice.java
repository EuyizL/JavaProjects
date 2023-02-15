import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CalculatingRetailPrice {
	public static void main(String[] args) throws IOException {

    /* This class calculates the retail pricw for items
    and returns which store sells cheaper. */

    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);

    System.out.print("Please enter the 1st store's name: ");
    String storeName = reader.readLine(); // input string
    System.out.print("You entered: ");
    System.out.println(storeName);
        
    // Closing to avoid memory leak.
    input.close();
  }
}
