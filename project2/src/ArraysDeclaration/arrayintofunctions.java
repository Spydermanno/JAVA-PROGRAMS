package ArraysDeclaration;

public class arrayintofunctions {

	public arrayintofunctions() {
		// TODO Auto-generated constructor stub
	}
	public static void mul(int [] arr)
	{
	    for(int i=0;i<5;i++)
	    arr[i]*=i;

	}
	public static void main(String[] args) {
		{
		    int arr[]={1,2,3,4,5};
		    mul(arr);
		    for(int i=0;i<5;i++)
		    {
		        System.out.println(arr[i]);
		    }

	}

	}
}
