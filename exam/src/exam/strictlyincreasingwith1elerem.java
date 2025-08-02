package exam;

import java.util.Arrays;

public class strictlyincreasingwith1elerem {
public static void main(String[] args) {
	int[] arr = {2,3,1,2};
	int count = 0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i] > arr[i + 1]) {
			count++;
		}
	}
	if(count == 0) {
		System.out.println("possible");
	}
	if(count == 1) {
		System.out.println("possible");
	}
	System.out.println(count);
}
}
