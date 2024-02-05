package com.OnlineShop.ecom;

public class MaximimProfit {

	public static void main(String[] args) {
	
	int[] arr1=new int[] {8,3,1};
	int profit =maximumProfit(arr1);
	System.out.println(profit);
	
	int[] arr2=new int[] {2,3,5};
	int profit2 =maximumProfit(arr2);
	System.out.println(profit2);
	}

	private static int maximumProfit(int[] arr1) {
		
		int currentDay=arr1.length-1;
		int maxProfit=0;
		
		
		while(currentDay>0) {
			int prevDay=currentDay-1;
			
			while(prevDay>=0&&(arr1[currentDay]>arr1[prevDay])) {
				maxProfit+= arr1[currentDay]-arr1[prevDay];
				prevDay--;
			}
			currentDay=prevDay;
		}
		
		return maxProfit;
	}

}
