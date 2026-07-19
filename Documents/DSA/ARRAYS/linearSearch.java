/* 
Example 1:
Input:
 arr[] = 1 2 3 4 5, num = 3  
Output:
 2  `
Explanation:
 3 is present at the 2nd index of the array.

 */

 import java.util.Scanner;
 class Solution {
    public int LinearSearch(int nums[],int target)
    {
        for(int i=0;i<nums.length;i++)
        {
         if(nums[i]==target)
         {
            return i;
         }
        }
        return -1;
  
      }
}

   public class linearSearch {

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the size of array : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.print("enter the elements of the array : ");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      System.out.print("enter the target element : ");
      int target=sc.nextInt();
      Solution s = new Solution();
      int result=s.LinearSearch(arr,target);
      System.out.println(result);
      sc.close();
   }    
}
