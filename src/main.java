//public class main {
//    public static void main(String[]args){
//        System.out.println("Hello World");
//
//    }
//}
//basic for loop program
//class Main{
//    public static void main(String[]args){
//        int[] arr = {10,20,30,40,50,60};
//        for(int i = 0;i<=5;i++){
//            System.out.println(arr[i]);
//
//        }
//    }
//}
// second largest numbrr
//class Main{
//    public static void main(String[]args){
//        int[] arr = {10,20,30,40,50};
//        int largest = arr[0];
//        int seclargest = arr[1];
//        for(int i=0;i<=4;i++){
//            if(arr[i] > largest ){
//                largest = arr[i];
//            }
//        }
//        for(int i= 0;i<=4;i++){
//            if(arr[i] < largest && arr[i] > seclargest){
//                seclargest = arr[i];
//            }
//        }
//        System.out.println("Largest-Number :" +largest);
//        System.out.println("Second-Largest Number :" +seclargest);
//    }
//}
//Move Zeros to the end
class Main{
    public static void main(String[]args){
        int[] arr = {10,0,2,0,4,5,0};
        int index = 0;
        for(int i = 0;i<=6;i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = index; i<=6;i++){
            arr[i] = 0;
        }
        for(int i =0;i<=6;i++){
            System.out.println(arr[i]);

        }
    }
}