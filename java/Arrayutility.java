
import java.util.Scanner;


public class Arrayutility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System .in);
        System.out.print("please enter eliment  size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i;
        for( i = 0; i<size; i++){
            System.out.print("Please enter Eliment"+ (i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
