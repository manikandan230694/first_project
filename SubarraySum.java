package com.OnlineShop.ecom;

public class SubarraySum {
	
public static void main(String[] args) {
	 SubarraySum arraysum = new SubarraySum();
     int arr[] = {1,2,3,7,5};
     int n = arr.length;
     int sum = 12;
     arraysum.subArrayMethod(arr, n, sum);
     
     int arr2[] = {1,2,3,4,5,6,7,8,9,10};
     int n2 = arr.length;
     int sum2 = 15;
     arraysum.subArrayMethod(arr2, n2, sum2);
}
void subArrayMethod(int arr[], int n, int sum)
{
    for (int i = 0; i < n; i++) {
        int currentSum = arr[i];

        if (currentSum == sum) {
            System.out.println("sum in index"+ i);
            return;
        }
        else {
            for (int j = i + 1; j < n; j++) {
                currentSum += arr[j];

                if (currentSum == sum) {
                    System.out.println(
                        "Sum between index" + i + " & " + j);
                    return;
                }
            }
        }
    }
    System.out.println("Not found");
    return;
}
}
