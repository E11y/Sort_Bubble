package sorts;

import java.util.ArrayList;

/**
 * Created by user on 31.10.2016.
 */
public class Bubble {
    int [] arr;
      public Bubble(int [] arr){
        this.arr=arr;
    }
    public int [] Bs(){
        int j, i, n;
        n=1;
        int k=arr.length;
        //for(j =k ; j!=1; j--) {
        while(n==1) {
            n=0;
            for (i = 0; i < k-1 ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int a = arr[i + 1];
                    arr[i + 1]= arr[i];
                    arr[i]= a;
                    n = 1;
                }
            }

        }
        //}
        return arr;
    }
}
