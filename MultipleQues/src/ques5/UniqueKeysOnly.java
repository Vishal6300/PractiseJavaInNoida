package ques5;

import java.util.HashSet;
import java.util.Set;

public class UniqueKeysOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,5,7,8,9,10};
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

}
