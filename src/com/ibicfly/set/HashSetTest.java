package com.ibicfly.set;

import java.util.HashSet;

public class HashSetTest {
public static void main(String[] args) {
	HashSet hashSet=new HashSet<>();
	Object temp1=new Object();
	hashSet.add(temp1);
	Object temp2=new Object();
	hashSet.add(temp2);
}
 public int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length==0)
        {
            return null; 
        }else
        {
        	int[] temp=new int[2];
            for(int i=0;i<nums.length-1;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {
                    	temp[0]=i;
                    	temp[1]=j;
                        break;
                    }
                }
            }
            return temp;
        }
    }
}
