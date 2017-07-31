package sorts;

/**
 * Created by user on 26.10.2016.
 */
import java.util.*;
import java.lang.*;
public class main_sorts {
    public static int[] arrRandom(int size){
        Random r = new Random();
        int myArr[] = new int[size];
        for (int i=0;i < size; i++){
            myArr[i]=r.nextInt(101);
        }
    return myArr;
    }
    public static int[] convert(ArrayList<Integer> arr){
        int [] myArr= new int [arr.size()];
        for (int i=0; i < arr.size();i++) {
            myArr[i] = arr.get(i).intValue();
        }
        return myArr;
    }
    public static ArrayList<Integer> inputCons(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (sc.hasNextInt()) {
            System.out.println("Введите число");
            int a = sc.nextInt();
            arr.add(a);
        }
        return arr;
    }
    public static void main(String[] args){

        int myArr[];
        ArrayList<Integer> arr;

        System.out.println("Каким методом желаете заполнить массив 1-случайными чслами, 2-вруную");
        int s = new Scanner(System.in).nextInt();
/*        switch (s) {
            case 2:
                arr = inputCons();
                myArr=convert(arr);
            case 1:
                myArr=arrRandom(100);
        }
*/        if(s==2){
            arr = inputCons();
            myArr = convert(arr);
        }
        else {myArr = arrRandom(100);}

        System.out.println(myArr.length);
        for (int i=0;i < myArr.length;i++) {
            System.out.print(myArr[i]+" ");
        }

        System.out.println("Каким методом хотите отсортироать массив 1-пузырьковаый 2- 3-");
        int sw = new Scanner(System.in).nextInt();
        switch (sw){
            case 1:
                Bubble r= new Bubble(myArr);
                myArr=r.Bs();
                System.out.println("Массив отсортирован пузырьковым методом:");
                for (int i=0;i < myArr.length;i++) {
                    System.out.print(myArr[i]+" ");
                }

                break;
            case 2:
                break;
        }

    }

}
