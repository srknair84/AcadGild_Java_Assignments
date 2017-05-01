import java.math.*;
import java.lang.*;
import java.util.*;

public class sumoftwonumbers {
	public static void main(String[] args){
		Scanner S=new Scanner(System.in);
		System.out.print("Enter Integer Number");
		int a=S.nextInt();
		System.out.print("Enter Float Number");
		float b=S.nextFloat();
		int c=(int) (a+b);
		System.out.println("sum is " +c);
	}
}
