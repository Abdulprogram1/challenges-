public class RiversHalfPramid {
    public static void main(String[] args) {
        pattern();
    }
    public static void pattern(){

    
    int i; /*for row */
    int j;/*for column */
    int n= 6; /*For number */
    for(i=n; i>=1; i--){
       for(j=1; j<=i; j++){
        System.out.print(" *");
       }
       System.out.println();
    }
    }
}
