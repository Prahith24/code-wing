package DailyPractise;
import java.util.Scanner;
public class EvennOdd {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a lb: ");
	int lb=scanner.nextInt();
    System.out.println("enter a ub: ");
    int ub=scanner.nextInt();
    if(lb>ub)
    {
    	System.out.println("lb must be lower than ub");
    	scanner.close();
    	return;
    }
    System.out.println("even and odd numbers between "+lb+" to "+ub);
    int i=lb;
    while(i<=ub)
    {
    	if(i%2==0)
    		System.out.println(i+" ->Even Number");
    	else
    		System.out.println(i+" -> Odd Number");
    	i++;
    }
    scanner.close();
}
}
