
Import java.util.*;
public class LargestNumber {
   
   public String largestNumber(int[] nums) {
        int n=nums.length;
        String ans="";
        if(n==0){
            return "";
        }
        String temp[]=new String[n];
        for(int i=0 ; i< n; i++){
            temp[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(temp,new Comparator<String>(){
            public int compare(String a, String b){
                String first=a+b;
                String second=b+a;
                return second.compareTo(first);
            }
        });
        if(temp[0].equals("0")){
          return "0";
        }
        for(int i=0 ; i<n ; i++){
            ans=ans+temp[i];
        }
        return ans;  
    }
   public static void mian(String args[]){
       int arr[]={10,2};
       System.out.println(largestNumber(arr));
   }
}
