import java.util.*;
import java.io.*;
public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        solve(arr);
    }
    public static void solve(int[] arr){
        double negative = 0;
        double positive = 0;
        double cero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) negative++;
            else if(arr[i] > 0) positive++;
            else cero ++;
        }
        System.out.printf("%.6f\n",positive / arr.length);
        System.out.printf("%.6f\n",negative / arr.length);
        System.out.printf("%.6f\n",cero / arr.length);
    }
}
