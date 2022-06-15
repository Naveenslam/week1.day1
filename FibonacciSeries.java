package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 0;
		int secNum = 1;
		int sum;
		for (int i = 0; i <= 7; i++)

		{
			System.out.println(firstNum + " ");
			sum = firstNum + secNum;
			firstNum = secNum;
			System.out.println(" ");
			secNum = sum;

		}

	}

}
