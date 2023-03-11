import java.util.Scanner;

public class Multiplication {
public static void main (String args[]) {
	int x;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Number:");
	x = sc.nextInt();
	for(int i=1;i<=12;i++) {
		System.out.println(x+"*"+i+"="+(x*i));
	}
	
}
}
