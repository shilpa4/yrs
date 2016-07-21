import java.util.Scanner;


public class posnegcount {
	public static void main(String [ ] arg){
		int a[]=new int[5];
		Scanner name=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=name.nextInt();
		}
		int count=0,count1=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]>=0){
				System.out.println("positve "+a[i]);
				count++;
			}
			else{
				System.out.println("negative "+a[i]);
				count1++;

			}
		}
		System.out.println("no of positive:"+count);
		System.out.println("no of positive:"+count1);

		
	}
}
