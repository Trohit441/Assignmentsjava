/*Sorting Data Price Wise*/

import java.util.*;

class Product implements Comparable<Product>	/*CreatedProduct Class and Declare two methods*/
{
    String name;
    int price;

    Product(String name, int price)	
    {
        this.name = name;
        this.price= price;
    }

    public int compareTo(Product P)
    {
        return this.price - P.price;
    }
}


public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list = new ArrayList<Product>();

        list.add(new Product("Jenni", 10));
        list.add(new Product("Nick", 30));			/*Adding Data into list as a Name And Price Combination */
        list.add(new Product("Charle", 20));
        list.add(new Product("Rio", 50));
        list.add(new Product("Micle", 70));
        list.add(new Product("Robert", 60));

        Collections.sort(list);

        for(Product P: list)
            System.out.println(P.name+ " " +P.price);		/*Displaying Data from list as a Name And Price Combination */

	}

}
