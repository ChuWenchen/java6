public class Maopao{
	public static void main(String[] agrs){
		int[] arr = {24,69,80,53,13,41};
		int mid = 0;
		for(int i =arr.length-1; i>0; i--){
			for(int j = 0; j<i; j++){
				if(arr[j] > arr[j+1]){
					mid = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = mid;
				}
			}
        }
        for(int i = 0;i<arr.length;i++){
        	System.out.print(arr[i] + "  ");
        }

	}
}