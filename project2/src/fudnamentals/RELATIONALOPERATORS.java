package fudnamentals;


import java.util.Scanner;


public class RELATIONALOPERATORS {

	public RELATIONALOPERATORS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		a=s.nextInt();
		b=s.nextInt();  
		if(a==b){
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are not equal");
		}
	}

}
