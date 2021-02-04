/**
 * @author Camilo Castro
 */
import java.io.*;
import java.util.*;

public class CompareTheTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        int [] arr2  = new int[3];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < arr2.length; i++) arr2[i] = sc.nextInt();
        System.out.println(solve(arr, arr2));
    }

    public static String solve(int[] arr,int[] arr2){
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr2[i]) alice ++;
            else if(arr[i] < arr2[i]) bob ++;
        }
        return "" + alice + " " + bob;
    }
}