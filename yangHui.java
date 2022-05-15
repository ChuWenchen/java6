public class yangHui{
	public static void main(String[] agrs){
		int[][] arr = new int[10][];
		for(int i = 0; i<arr.length; i++){ // 遍历二维数组的每个元素(一维数组)，就是遍历每一行
			arr[i] = new int[i+1];
			for(int j = 0; j<i+1; j++){
				if(j==0 || j == i){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}