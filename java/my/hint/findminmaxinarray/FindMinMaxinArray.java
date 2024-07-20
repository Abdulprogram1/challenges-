/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.hint.findminmaxinarray;

/**
 *
 * @author Admin
 */
public class FindMinMaxinArray {

   public static void main(String[] args) {
        int []array = Arrayutility.arrInput();
        int maxValue = maxValue(array);
        int minValue = minValue(array);
        System.out.print("Maximum number in array :" + maxValue);
        System.out.print("Minimum number in array :"+ minValue);
    }
    public static int maxValue(int []array){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
          if(maxValue < array[i]){
            maxValue = array[i];
          }
        }
        return maxValue;
    }
    public static int minValue(int []array){
        if(array.length == 0){
        return Integer.MIN_VALUE;
        }
        int minValue = array[0];
        int i=1;
        while (i < array.length) {
            if(minValue > array[i]){
                minValue =array[i];
            }
            i++;
        }
        return minValue;
    }
}
