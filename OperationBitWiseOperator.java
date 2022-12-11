public class OperationBitWiseOperator {
    public static void main(String[] args) {
        

        int n =10;
        int position = 2 ;
        int bitMask = 1<<position;

        if((n & bitMask )==0){
            System.out.println("0");
        }else{
            System.out.println("1"); 
        }

    }
}
