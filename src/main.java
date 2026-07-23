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
//class Main{
//    public static void main(String[]args){
//        String word = "aaabbccccdd";
//        int count  = 1;
//        for(int i = 0; i<=9;i++){
//            if(word.charAt(i) == word.charAt(i+1)){
//                count ++;
//            }else{
//                System.out.print(word.charAt(i));
//                System.out.print(count);
//                count = 1;
//            }
//        }
//        System.out.print(word.charAt(word.length()-1));
//        System.out.print(count);
//    }
//}
//REMOVEING THE DUPLICATES
//class Main{
//    public static void main(String[]args){
//        String word = "programming";
//        String result = " ";
//        for(int i = 0; i<word.length();i++){
//            boolean duplicate = false;
//            for(int j=0;j<i;j++){
//                if(word.charAt(i) == word.charAt(j)){
//                    duplicate = true;
//                    break;
//                }
//            }
//            if(!duplicate){
//                result = result + word.charAt(i);
//            }
//            System.out.println(result);
//        }
//    }
//}
//COUNTING THE SPECIAL CHARACTERS
//class Main{
//    public static void main(String[]args){
//        String word = "Hello@123!@#";
//        int count  = 0;
//        for(int i = 0; i<word.length();i++){
//            if(
//           word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'||
//            word.charAt(i) >= 'a' && word.charAt(i) <= 'z'||
//            word.charAt(i) >= '0' && word.charAt(i) <= '9'
//            ){
//                continue;
//            }else {
//                count++;
//
//            }
//        }
//        System.out.println(count);
//    }
//}
//FIND THE FRIST NON-REPEATING ELEMENTS
//class Main{
//    public static void main(String[]args){
//        int[] arr = {4,5,1,2,1,4,5};
//        for(int i = 0;i<arr.length;i++){
//            int count = 0;
//            for(int j = 0 ; j<arr.length;j++){
//                if(arr[i] == arr[j]){
//                    count ++ ;
//                }
//            }
//        if(count == 0){
//            System.out.println(arr[i]);
//            break;
//        }
//        }
//
//    }
//}
// FIND THE FRIST REPEATING ELEMENSTS
//class Main{
//    public static  void main(String[]args){
//        int[] arr = {4,5,1,2,1,4,5};
//        for(int i = 0; i<arr.length;i++){
//            int count = 0;
//            for(int j = 0;j<arr.length;j++){
//                if(arr[i] == arr[j]){
//                    count ++;
//                }
//            }
//            if(count == 2){
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//    }
//}
// ROTATE THE ARRAY IN THE RIGHT POSITION
//class Main{
//    public static void main(String[]args){
//        int[] arr = {1,2,3,4,5};
//        // save the element
//       int last  = arr.length;
//       //shifts the elemenst
//       for(int i = arr.length-1;i>0;i--){
//           arr[i] = arr[i-1];
//       }
//       //assign teh last index to the first
//       arr[0] =last;
//       //print the elemenst
//       for(int i = 0; i<arr.length;i++){
//           System.out.println(arr[i]);
//       }
//    }
//}
//ROTATE THE ARRAY FROM IN THE LEFT POSITION
//class Main{
//    public static void main(String[]args){
//        int[] arr = {1,2,3,4,5};
//        int frist = arr[0];
//        for(int i =0; i<4;i++){
//            arr[i] = arr[i+1];
//        }
//        arr[4] = frist;
//        for(int i = 0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}
//TWO SUM PROBLEM
//class Main{
//    public static void main(String[]args){
//        int[] arr = {2,7,11,15};
//        int target  = 9;
//        for(int i = 0; i<arr.length;i++){
//
//            for(int j = i+1; j<arr.length;j++){
//
//                if(arr[i]+arr[j] == target){
//                    System.out.println("pair found");
//                    System.out.println(arr[i] + "+" + arr[j] + "=" + target);
//                }else{
//                    System.out.println(arr[i] + "+" + arr[j] + "!=" + target);
//                }
//            }
//        }
//
//    }
//}
//REMOVE DUPLICATES
//class Main{
//    public static void main(String[]args){
//        int[] arr = {1,1,2,2,3,4,4};
//        int i = 0;
//        for(int j = 1;j<arr.length;j++){
//            if(arr[i] != arr[j]){
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        for(int k = 0;k<=i;k++){
//            System.out.println(arr[k]);
//
//        }
//    }
//}
//Longest Substring Without Repeating Characters
//class Main{
//    public static void main(String[]args){
//        String str = "abcabcbb";
//        boolean duplicate = false;
//        int maxlength = 0;
//        for(int i = 0;i<str.length();i++){
//            int count = 0;
//            for(int j = i;j<str.length();j++){
//                for(int k = i;k<j;k++){
//                    if(str.charAt(j) == str.charAt(k)){
//                        duplicate = true;
//                        break;
//                    }
//                    if(duplicate){
//                        break;
//                    }else{
//                        count ++;
//                    }
//                }
//            }
//            if(count > maxlength){
//                maxlength = count;
//            }
//        }
//
//        System.out.println(maxlength);
//    }
//}
//Palindrome
//class Main{
//    public static void main(String[]args){
//        String str = "madam";
//       int start = 0;
//       int end = str.length()-1;
//       boolean palindrome = true;
//       while(start > end){
//           if(str.charAt(start) != str.charAt(end)){
//               palindrome = false;
//               break;
//           }else{
//               start ++;
//               end --;
//           }
//       }
//       if(palindrome){
//           System.out.println("palindrome");
//       }else{
//           System.out.println("not-palindrome");
//
//       }
//    }
//}
//COUNT THE FREQUENCHY OF THE CHARCTER IN A STRING
//class Main{
//    public static void main(String[]args){
//        String str = "programming";
//        for(int i= 0;i<str.length();i++){
//            int count = 0;
//            for(int j=0;j<str.length();j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    count ++;
//                }
//            }
//            System.out.println(str.charAt(i) + "=" + count);
//        }
//    }
//}
//REMOVE THE DUPLICATES FROM TEH STRING
//class Main{
//    public static void main(String[]args){
//        String str = "programming";
//        for(int i = 0;i<str.length();i++){
//            boolean present = false;
//            for(int j = i+1;j<str.length();j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    present =true;
//                    break;
//                }
//            }
//            if(!present){
//                System.out.println(str.charAt(i));
//            }
//        }
//    }
//}