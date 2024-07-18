
import java.util.Scanner;


public class Occrance {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
      int [] occArr =Arrayutility.inputArray();
      System.out.print("enter the number you want to find : ");
      int no =sc.nextInt();
      int occrance = occr(occArr, no);
      System.out.print("Your eliment is found \t("+ occrance+")\time in array");
    }
    public static int occr(int [] occArr, int no){
        int oc =0;
        int count=0;
        while(count<occArr.length){
        if(occArr[count]==no){
            oc++;
        }
        count++;
        }
    return oc;
    }
    
}
