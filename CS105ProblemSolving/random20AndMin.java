package CS105ProblemSolving;

public class random20AndMin {

	public static void main(String[] args) {

		int nums[] = new int[20];
		int count = 0;
		int i = 0;
		int smallest = 1000;
		while (count < 20) {
			nums[i] = (int) (Math.random() * 1000 + 1);
			if (smallest > nums[i]) {
				smallest = nums[i];
			}
			System.out.print(nums[i] + " ");
			count++;
		}
		System.out.println();
		System.out.println(smallest);
	}

}
