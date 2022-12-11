class bitwiseOperator{
    public static void main(String[] args) {
        System.out.println( 5&6);   // AND operatior 
        System.out.println(9|7);     // OR operator
        
        
        
        
        
        System.out.println(5^6);        //  XOR operator

        /* 
             XOR operator how to work 
             0 ^ 0 => 0
             1 ^ 0 => 1
             0 ^ 1 => 1
             1 ^ 1 => 0

             it conclusion for different value it give 1 value and for same value it give  0 . 
         */



            System.out.println(~-1);  // Binary one's compliment  (not operator )

            



            System.out.println(4<<1); // Binary Left Shift  ( << )  

                /*   formula of  binary left shift  
                 *      
                 *     formula ==> [  a<<b = a*2^b ]
                 * 
                 */
        
               
                     System.out.println(4>>1);  // Right Shift ( >> )

                     /*
                            formula of the right shift 
                            
                            formula  ==>  [  a/2^b  ]

                      */



                                //      How to cheak number is odd or even 
                                //       if   LSB ==>  0  number is even
                                //       if   LSB ==>  1  number is odd
                            

    }
}