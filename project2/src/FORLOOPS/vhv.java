package FORLOOPS;

public class vhv {
public static void printdivisibleby(int a,int b) {  
	if(a%3!=0){
		a++;
	}
	if(a%3!=0) {
		a++;
	}
	for(int i=a;i<=b;i+=3) {
		System.out.println(i);
	}
}


		
	
	

	public vhv() {
		// TODO Auto-generated constructor stub
	}
 public static void main(String[] args) {
	 
	 printdivisibleby(68,100);
 }
}
