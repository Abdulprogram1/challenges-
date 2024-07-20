class ChackSortingArray{
    public static boolean isinc(int []arr){
        int i=1;
        while (i < arr.length) {
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isdec(int arr[]){
        for(int i=1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr = Arrayutility.arrInput();
        boolean isIncrease = isinc(arr);
        boolean isdecrease = isdec(arr);
        if(isIncrease || isdecrease){
            System.out.println("your array is sorted!");
         } else{
                System.out.println("yor arrayis not sorted!");
            
               }
    }
}