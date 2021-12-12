import java.util.Scanner;
public class Armstrong_number{
	 void AN(int n) {
		 int temp=n;
		 int originalnumber=n;
		    int count=0;
			double sum=0;
			while(temp!=0) {
				temp=temp/10;
				count=count+1;	
			}
			System.out.println("number of digits in "+ originalnumber + " are "+ count);
		 while(n>0) {	
			 int x=n%10;
			 sum+=(Math.pow(x, count));
			 n=n/10;			 			 
		 }
		 if (originalnumber==sum) {
			 System.out.println(originalnumber +" is an armstrong number");
		 }
		 else {
			 System.out.println(originalnumber +" is not an armstrong number");			 
		 }
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Armstrong_number obj=new Armstrong_number();
		obj.AN(n);			
	}
}