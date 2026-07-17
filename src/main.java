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
//PRIME NUMBER Checking;
//class Main{
//    public static void main(String[]args){
//        int num = 7;
//        int count = 0;
//        for(int i = 1;i <= num;i++){
//            if(num % i == 0){
//                count ++;
//            }
//        }
//        if(count == 2){
//                System.out.println("Prime Number");
//            }else{
//                System.out.println("NoN-Prime Number");
//            }
//    }
//}
//MOVE NEGATIVES TO THE END
//class Main{
//    public static void main(String[] args){
//        int[] arr = {2,-3,5,-1,8,-7,4};
//        int[] result =new int[arr.length];
//        int index  = 0;
//        for(int i = 0;i<=6;i++){
//            if(arr[i] >= 0){
//                result[index] = arr[i];
//                index ++;
//            }
//        }
//        for(int i =0;i<=6;i++){
//           if(arr[i] < 0){
//               result[index] = arr[i];
//               index ++;
//           }
//        }
//        for(int i = 0;i<result.length;i++){
//            System.out.println(result[i]+ " ");
//        }
//    }
//}
//REVERSE ARRAY
//class Main{
//    public static void main(String[]args){
//        int[] arr = {10,20,30,40,50};
//        for(int i = 4; i>=0;i--){
//            System.out.println(arr[i]);
//        }
//    }
//}
//MISSING NUMBERS IN THE ARRAY
//class Main{
//    public static void main(String[]args) {
//        int[] arr ={1, 2, 3, 5};
//        int n = 5;
//        int sum = 0;
//        int excepted = n * ((n + 1) / 2);
//        for (int i = 0; i <=3 ; i++) {
//            sum = sum + arr[i];
//        }
//        int missing = excepted - sum;
//        System.out.println("Missing Number:" +missing);
//    }
//}
//REMOVING THE DUPLICATES FROM THE ARRAY
//class Main{
//    public static void main(String[]args){
//        int[]arr = {2, 4, 1, 2, 1, 2, 4, 5};
//        int index = 0;
//    }
//}
//STRING COMPRESSION
class Main{
    public static void main(String[]args){
        String word = "aaabbccccdd";
        int count  = 1;
        for(int i = 0; i<=9;i++){
            if(word.charAt(i) == word.charAt(i+1)){
                count ++;
            }else{
                System.out.print(word.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
        System.out.print(word.charAt(word.length()-1));
        System.out.print(count);
    }
}