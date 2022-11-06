package fudnamentals;

import java.util.Scanner;

public class usernput {

	public usernput() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       /* int a=s.nextInt();
        int b=s.nextInt();
        int c=a+b;
        System.out.println(c);
        
        double v=s.nextDouble();
        s.nextLong();*/
        
        String str=s.next();
        char ch=str.charAt(0);
        System.out.println(str);
        System.out.println(ch);
        
        

	}

}