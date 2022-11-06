package PATTERNS;
import java.util.Scanner;
public class invertedandmirrorimagepatterns {

	public invertedandmirrorimagepatterns() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1;
	while(i<=n) {
		int j=1;
			while(j<=n) {
				if(j<=n-i) {
					System.out.print(' ');
				}
				else {
					System.out.print('*');
				}
				j++;
	   }
	   System.out.println();
	   i++;
	   
	   
	}

	}

}
