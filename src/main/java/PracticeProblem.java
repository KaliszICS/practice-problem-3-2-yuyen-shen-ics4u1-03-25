public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(towerOfHanoi(5));
	}

	public static int towerOfHanoi(int num) {
		if (num == 3){
			return 7;
		}
		if (num < 3){
			return -1;
		}
		return 2*(towerOfHanoi(num-1)) + 1;
	}
}
