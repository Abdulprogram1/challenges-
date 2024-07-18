
public class SumandAvrageofArray {

    public static void main(String[] args) {
        int elimArray[] = Arrayutility.inputArray();
        long sumArray =sumArray(elimArray);
        float avrageArray =avrageArray(elimArray);
        System.out.print("Alleliment of Arrays sum :" + sumArray+"\n");
        System.out.print("Avrage of all eliment of arrays ;"+avrageArray);
     }
    public static long sumArray(int[] elimArray){
        long sum = 0;
        for( int i = 0; i<elimArray.length; i++){
        sum+=elimArray[i];
        }
    return sum;
    }
    public static float avrageArray(int[] elimArray){
        long sum = sumArray(elimArray);
    return  sum/elimArray.length;
    }
}
