import java.util.Scanner;


public class primenum {
	public static void main(String [ ] arg) {
		int n,count=0;
		Scanner name=new Scanner(System.in);
		System.out.println("enter the number");
		n=name.nextInt();
		if(n==2||n==1)
			{
			System.out.println("it is prime");
			}
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			else if(count>=n)
			{
				System.out.println("it is not prime");
			}
			else
				System.out.println("it is prime");
		}
}
}
