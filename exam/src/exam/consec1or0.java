package exam;

public class consec1or0 {
public static void main(String[] args) {
	int[] arr = {1,0,0,0,1,0,1,0,1};
	int n = arr.length;
	int count1 = 0;
	int count0 = 0;
	int maxi1 = 0;
	int maxi0 = 0;
	for(int i=0;i<n-1;i++) {
		if(arr[i] == 1) {
			count1 += 1;
			maxi1 = Math.max(maxi1, count1);
		}
		else {
			count1 = 0;
		}
	}
	for(int i=0;i<n-1;i++) {
		if(arr[i] == 0) {
			count0 += 1;
			maxi0 = Math.max(maxi0, count0);
		}
		else {
			count0 = 0;
		}
	}
	System.out.println(maxi1 + " " + maxi0);
	if(maxi1 > maxi0) {
		System.out.println(maxi1);
	}
	else {
		System.out.println(maxi0 + "zero");
	}
}
}
