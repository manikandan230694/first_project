package com.OnlineShop;

import java.io.*;
import java.util.*;
class LeadersInArray {
	  public static void main(String[] args)
	    {
	        LeadersInArray lead = new LeadersInArray();
	        int arr1[] = new int[] { 16, 17, 4, 3, 5, 2 };
	        int len = arr1.length;
	        lead.leadersMethod(arr1, len);
	    }
    void leadersMethod(int arr[], int size)
    {
      
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.push(arr[size - 1]);

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= stack1.peek()) {
                stack1.push(arr[i]);
            }
        }
 
        while (!stack1.empty()) {
            System.out.print(stack1.pop() + " ");
        }
    }
 
  
}
