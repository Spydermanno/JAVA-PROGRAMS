package PATTERNS;
import java.util.Scanner;
public class STPATTERNPRINTING {

	public STPATTERNPRINTING() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
Scanner s =new Scanner(System.in);
int n=s.nextInt();
int i=1;
while(i<=n) 
{
int j=1;
while(j<=n)
{
System.out.print(j+i-1);
j++;
}
System.out.println();
i++;
}
	}

}
