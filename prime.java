import java.util.Scanner;


public class prime {
	public static void main(String [ ] arg) {
		int k=0;
		int n,p;
		Scanner name=new Scanner(System.in);
		System.out.println("enter the number");
		n=name.nextInt();
		int[] a=new int[n];
		int[] m=new int[p];
		for(int i=2;i<=n;i++)
		{
			int f=0;
			for(int j=3;j<=i-1;j++)
			{
			if(i%j==0)
			{
				f=f+1;
	
		}
			}
			
		if(f==0)
		{
a[k]=i;
k++;
		}
		}
		for(p=0;p<k;p++){
			System.out.print(a[p]+" ");}
		for(p=0;p<=k;p++){
	if(a[p]>=10 && a[p]<=99)
	{
m[p]=a[p];
		for(int s=0;s<p;s++)
	{
		for(int d=s+1;d<p;d++)
			{
			for(int g=d+1;g<p;g++){
			if(( a[s]+a[d]+a[g])==n)
			{
	System.out.println(a[s]+"+"+a[d]+"+"+a[g]+"="+n);
			
		}
			else if(( a[s]+a[d]+a[g])==n)
			{
	System.out.println(a[s]+"+"+a[d]+"+"+a[g]+"="+n);
			
			}
			else{
				
			}
			}
}
	
		}
	
	}
	}
}

}