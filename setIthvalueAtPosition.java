public class setIthvalueAtPosition {

     static int SetValue(int n , int i){
        int bitValue = 1<<i;
        return n|bitValue;
     }

     public static int  clearValue(int n, int i) {
        int bitValue = ~(1<<i);
        return n & bitValue;
     }
      public static int updatevalue(int n, int i, int setbit) {
        if(setbit==0){
           
            return clearValue(n, i);
        }else
        return SetValue(n, i);
      }

    public static void main(String[] args) {
         System.out.println("Set the value given position:"+SetValue(2, 0));

        System.out.println("Clear the value to given position:"+clearValue(10,1));

        System.out.println(updatevalue(4, 0, 1));
    }
}
