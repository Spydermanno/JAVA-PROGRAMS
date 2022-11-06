package FORLOOPS;

public class Division {
public static int div(int a,int b) {
	if(b==0) {
		return Float.MAX_EXPONENT;
	}
	return a/b;
}
	public Division() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		float z=(float)div(5,0);
        System.out.print(z);
	}

}
