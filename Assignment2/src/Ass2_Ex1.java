import java.util.*;
class Bill
{
	
	public int Generate(int Consume)
	{
		if(Consume<=100)
		{
			return Consume*10;
		}
		else if(Consume<=200)
		{
			return +(100*10)+(Consume-100)*15;
		}
		else if(Consume<=300)
		{
			return (100*10)+(100*15)+(Consume-200)*25;
		}
		else if(Consume<=200)
		{
			return (100*10)+(100*15)+(Consume-300)*25;
		}
		return Consume;
	}
}
public class Ass2_Ex1 {

	public static void main(String[] args) {
		
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("Enter the Electricity Consumed Unit in KWh:");
		int U=Scan.nextInt();
		
		Bill B=new Bill();
		System.out.println(B.Generate(U));

	}

}
