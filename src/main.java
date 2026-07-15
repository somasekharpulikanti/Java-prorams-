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
//SECOND LARGEST NUMBER
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
//MOVE ZEROS TO THE END
//class Main{
//    public static void main(String[]args){
//        int[] arr = {10,0,2,0,4,5,0};
//        int index = 0;
//        for(int i = 0;i<=6;i++){
//            if(arr[i] != 0){
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        for(int i = index; i<=6;i++){
//            arr[i] = 0;
//        }
//        for(int i =0;i<=6;i++){
//            System.out.println(arr[i]);
//
//        }
//    }
//}
//PALINDROME
//class Main{
//    public static void main(String[]args){
//        int a = 121;
//        int temp  = a;
//        int digit = 0;
//        int rev = 0;
//        while(temp > 0){
//            digit = temp % 10;
//            rev = rev * 10 + digit;
//            temp = temp/10;
//        }
//        if(a == rev){
//            System.out.println(rev);
//
//        }
//    }
//}
//LARGEST NUMBER
//class Main{
//    public static void main(String[]args){
//        int[] arr = {10,20,30,40,50};
//        int largest = arr[0];
//        for(int i =0;i<=4;i++){
//            if(arr[i] > largest)
//                largest = arr[i];
//        }
//        System.out.println("Largst Number :" +largest);
//    }
//}
//PRIME NUMBER;
class Main{
    public static void main(String[]args){
        int num = 7;
        int count = 0;
        for(int i = 1;i <= num;i++){
            if(num % i == 0){
                count ++;
            }
        }
        if(count == 2){
                System.out.println("Prime Number");
            }else{
                System.out.println("NoN-Prime Number");
            }
    }
}