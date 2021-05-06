package testjava;

import java.util.*;

class Solution {
	ArrayList<Integer> a = new ArrayList<Integer>(); 
	
	
public int[] solution(int[] arr, int divisor) {

	 
    Arrays.sort(arr);	// 배열 정렬 알고리즘
    int lastIndex = arr.length-1;

    if(divisor == 1) {
        return arr;
    } else if(arr[lastIndex] < divisor){
        a.add(-1);

    } else {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                a.add(arr[i]);
            }
        }
    }

    int[] answer = a.stream().mapToInt(i -> i).toArray();
    return answer;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}


