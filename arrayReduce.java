import java.util.Scanner;
public class arrayReduce{
	public static void main(String[] agrs){
		int[] arr = {1,2,3,4,5};
		Scanner myScanner = new Scanner(System.in);
		while(true){
			System.out.println("ÊÇ·ñËõ¼õ£¬y/n");
			char put = myScanner.next().charAt(0);
			if(put == 'n' ){
				break;
			}else{
				int[] arr2 = new int[arr.length-1];
				for(int i=0;i<arr2.length;i++){
					arr2[i]=arr[i];
					i++;
				}
				arr = arr2;
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i] + "  ");
				}
				System.out.println();
				if(arr.length == 1){
					System.out.println("ÎŞ·¨Ëõ¼õ");
					break;
				}
			}
		}
	}

}