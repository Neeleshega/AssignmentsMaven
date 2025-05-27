package assignments;

public class Assignment10_ArrayLopps01 {

	public static void main(String[] args) {
		
		int array[] = {12 ,34,11,36,87,98,93};
		
		int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Second Largest Number: " + second);
        System.out.println("Third Largest Number: " + third);

	}

}
