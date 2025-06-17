// take n number of cards and arrange in order if joker card (0) is there place it into index 1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[0]==0){
               int temp=arr[0];
                arr[0]=arr[1];
                arr[1]=temp;
            }
        }
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
