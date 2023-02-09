import java.util.*;
public class Ass_Ex3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a Integer Numbers: ");
        int values = sc.nextInt();
        

        List<Integer> Num=new ArrayList();

        Num.add(sc.nextInt());
        Num.add(sc.nextInt());
        Num.add(sc.nextInt());
        Num.add(sc.nextInt());
        Num.forEach(odd->
        {
            if(odd%2!=0)
                System.out.println("The Odd Number is : "+odd);
        });

	}

}
