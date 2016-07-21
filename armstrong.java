import java.util.Scanner;


public class armstrong {
	public static void main(String [ ] arg){
		int n,sum=0,tmp;
		int a,b;	
		Scanner name=new Scanner(System.in);
		n=name.nextInt();
		tmp=n;
		while(tmp!=0)
		{
			a=tmp%10;
			b=a*a*a;
			sum=sum+b;
			tmp=tmp/10;
		}
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println("the number is armstrong");
		}
		else
		{
			System.out.println("the number is not armstrong");
		}
	}
}
