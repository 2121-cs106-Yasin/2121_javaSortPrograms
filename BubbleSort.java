
public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = {2,6,10,5,4};
		int tmp;
		System.out.println("Before Sorting: ");
		for(int i=0; i<nums.length; i++) {
			System.out.print(" { "+ nums[i]+" } ");
		}
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[i] < nums[j]) {
					tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				
				}
			}
			
			
		}
		System.out.println("\nAfter Sorting: ");
		for(int i=0; i<nums.length; i++) {
			System.out.print(" { "+ nums[i]+" } ");
		}
		

	}

}
