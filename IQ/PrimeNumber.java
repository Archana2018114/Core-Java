package IQ;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}

		}

		return true;
	}

	public static void getNumber(int num) {
		System.out.print("Prime Number from 0 to " + num + " " + "are:=");
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + "  ");
			}

		}
		System.out.print(" \n ");
		System.out.print(" \n ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0 is the prime Number=" + isPrimeNumber(0));
		System.out.println("1 is the prime Number=" + isPrimeNumber(1));
		System.out.println("2 is the prime Number=" + isPrimeNumber(2));
		System.out.println("3 is the prime Number=" + isPrimeNumber(3));
		System.out.println("-2 is the prime Number=" + isPrimeNumber(-2));
		System.out.println("-3 is the prime Number=" + isPrimeNumber(-3) + "\n");
		getNumber(7);
		getNumber(13);
		getNumber(20);

	}

}
