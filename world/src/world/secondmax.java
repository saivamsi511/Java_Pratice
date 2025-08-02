package world;

public class secondmax {
public static void main(String[] args) {
	int[] arr = {10,10,10};
	int fir = 0;
	int lst  = 0;
	for(int i =0;i<arr.length;i++) {
		if(arr[i] > fir) {
			fir = arr[i];
		}
	}
	for(int i =0;i<arr.length;i++) {
		if(arr[i] < fir && arr[i] > lst) {
			lst = arr[i];
		}
	}
//	if (lst ==0 ) {
//		return -1
//	}
	System.out.println(lst);
}
}
