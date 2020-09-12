package IQ;

public class ArmStrongNumber {

	public static boolean isArmStrongNumber( int num){
		int cube=0;
		int r;
		int t=num;
		if (num <= 9) {
			return true;
		}
		while (num > 0) {
				r = num % 10;
				num = num / 10;
				cube = cube + (r * r *r);
		}
		
		if (t == cube) {
			return true;

		} 

		return false;

}

	public static void getNumber(int num) {
		for (int i = 0; i <= num; i++) {
			if (isArmStrongNumber(i))
				System.out.println(i + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2 is the ArmStrong  Number=" + isArmStrongNumber(2));

		System.out.println("64 is the ArmStrong  Number=" + isArmStrongNumber(64));
		getNumber(500);
	}
}
