
public class Linear {

	public static void main(String[] args) {
		int []arr= {1,9,8,2,5,4,6,3};
		int target_num=5;
		boolean target =false;
		int index=0;
		
		/* for(int i=0;i<arr.length;i++) {
			if(arr[i]==target_num) {
				System.out.println("element found");
				target =true;
				break;
			}
		
		}
		if(!target){
			System.out.println("not found");
		}
		*/
		
		for(int i:arr) {
			if(i==target_num) {
			System.out.println("found at index "+index);
			target=true;
		}
			 
		 index ++;
		}
		if(!target) {
			 System.out.println("not found");
		 }


}
}