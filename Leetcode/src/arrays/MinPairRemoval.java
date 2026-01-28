package arrays;

import java.util.ArrayList;
import java.util.List;

public class MinPairRemoval {
	public static  int minimumPairRemoval(int[] nums) {
        int ops = 0;
        List<Integer>list = new ArrayList<Integer>();
        for(int n : nums)
        list.add(n);
        while (!IsNonDescending(list)){
            int index=0;
            int MinSum = Integer.MAX_VALUE;
            for(int i =0;i<list.size()-1;i++){
                int sum = list.get(i)+list.get(i+1);
                if(sum<MinSum){
                    MinSum = sum;
                    index = i;
                }

            }
            list.set(index,MinSum);
            list.remove(index+1);
            ops ++;
        }
        return ops;
	}
	public static boolean IsNonDescending(List<Integer>list) {
		for(int i =1 ;i<list.size();i++) {
			if(list.get(i)<list.get(i-1))
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumPairRemoval(new int[] {5,3,2,1}));
		System.out.println(minimumPairRemoval(new int[] {1,2,2}));

	}

}
