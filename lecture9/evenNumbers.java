
    
// public class evenNumbers{
//     public static void even(int  i ){
//         for(  i = 1 ; i <= 100 ; i++){
//             if(i % 2 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int i = 1;
//         even(i);
//     }
// }

public class evenNumbers{
    
    public static String even() {
        String result = " ";
        for( int i = 1 ; i<=100 ; i++){
            if(i%2==0){

            
            result+= i ;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String n = even();
        System.out.println(n );

    }
}