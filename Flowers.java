
package leetcodesolutions;

public class Main {

    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(arr,n));
    }
            public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean ans=true;
        int len=flowerbed.length;
        if(len==1 && flowerbed[0]==0 && n>0){
            flowerbed[0]=1;
            n--;
        }
        if(len>1 && flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        for(int i=1 ; i<len-1 ; i++){
            if(flowerbed[i]==0 && n>0){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }
            }
            if(n==0){
                return ans;
            }
        }
        if(len>1 && flowerbed[len-1]==0 && flowerbed[len-2]==0){
            flowerbed[len-1]=1;
            n--;
        }
        if(n>0){
            ans=false;
        }
        return ans;
    }
    }


