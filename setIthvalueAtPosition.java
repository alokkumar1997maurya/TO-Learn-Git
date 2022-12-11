public class setIthvalueAtPosition {

     static int SetValue(int n , int i){
        int bitValue = 1<<i;
        return n|bitValue;
     }

     public static int  clearValue(int n, int i) {
        int bitValue = ~(1<<i);
        return n & bitValue;
     }

    public static void main(String[] args) {
         System.out.println("Set the value given position:"+SetValue(2, 0));

        System.out.println("Clear the value to given position:"+clearValue(10,1));
    }
}
