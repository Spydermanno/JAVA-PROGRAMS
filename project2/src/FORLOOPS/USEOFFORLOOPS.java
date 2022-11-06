package FORLOOPS;

public class USEOFFORLOOPS {

	public USEOFFORLOOPS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if (i+1==j) {
				return;
				}
			System.out.print(j+" ");
			}
            System.out.println();
		}
	}

}
