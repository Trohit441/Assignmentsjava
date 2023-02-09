

class Runnable2 implements Runnable {
    public void run() {
        int n = 5, result = 0;

        int a[] = new int[5];

        a[0] = 10;

        a[1] = 20;

        a[2] = 30;

        a[3] = 40;

        a[4] = 50;

        for (int i = 0; i < n; i++)
            result = result + a[i];

        System.out.println("Average of  (" + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4] + ")  is =" + result / n);
    }
}


class Runnable1 implements Runnable{
    public void run()
    {
        int arr[]={10,15,20,25,30};
        for(int i =0;i<arr.length;i++)
        {

        }
        //Loop to print square of array elements
        for(int i=0;i<arr.length;i++) {
            int square = arr[i]*arr[i];
            System.out.println("Square of "+ arr[i] +" is: "+square);
        }
    }
}
public class Ex3_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new Runnable1();		/*Thread 1 is created*/
        Thread t = new Thread(r);
        t.start();
        
        Runnable r2 = new Runnable2();		/*Thread 1 is created*/
        Thread t2 = new Thread(r2);
        t2.start();

	}

}
