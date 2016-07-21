import java.util.Scanner;


public class oddeven {
	public static void main(String [ ] arg){
int n;
Scanner nn=new Scanner(System.in);
n=nn.nextInt();
if(n==0){
	System.out.println("n is zero");
}
else if(n%2==0){
	System.out.println("even num");
}
else{
	System.out.println("odd num");
}
	}
}
