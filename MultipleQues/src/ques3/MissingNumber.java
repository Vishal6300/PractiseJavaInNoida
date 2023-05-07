package ques3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> arr= Arrays.asList(1,2,3,4,5,5,7,8,9,10);
		int[] arr= {1,2,3,4,5,5,7,8,9,10};
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
//		System.out.println(set);
//		int count=1;
//		 set.forEach((e) -> {
//		      if(e!=count) {
//		    	  System.out.println(count+1);
//		    	  
//		      }else {
//		    	  count++;
//		      }
//		    });
		
		
	}

}
