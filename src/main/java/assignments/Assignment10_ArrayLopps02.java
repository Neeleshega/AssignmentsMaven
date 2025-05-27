package assignments;

public class Assignment10_ArrayLopps02 {

	public static void main(String[] args) {
		
		int array[] = {12 ,34,11,36,87,98,93};
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if (array[i] < array[j]) 
				{
					array[i] = array[i]+array[j];
					array[j] = array[i]-array[j];
					array[i] = array[i]-array[j];
				}
			}
		}
		
		System.out.println("Second largest number is :" + array[1]);

		System.out.println("Third largest number is :" + array[2]);
	}
}
