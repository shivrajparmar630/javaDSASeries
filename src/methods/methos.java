package methods;

import java.util.*;
public class methos {
//    static void printWelcomeMessage(){
//        System.out.println("hello welcome to my core");
//    }

//    static int Add(int x, int y){
//        int loops.sum=x+y;
//        return loops.sum;
//    }



    static boolean isEven(int num){
        return num%2==0;
    }

//    static int getMax(int a, int b){
//        if(a>b){
//            return a;
//        }
//        else{
//            return b;
//        }
//    }



//    static float calculatePercentage (float obtained, int total){
//        float conditions.percentage = ( obtained/total)*100;
//        return conditions.percentage;
//    }

//    static int Display(int a, int b){
//        int age = a*b;
//        return age;
//    }
//
//    static String Display(String a, String b ){
//        String loops.sum = a+b;
//        return loops.sum;
//    }


//    static int updateValue(int a){
//        a = a*10;
//        System.out.println("inner value "+a);
//        return a;
//    }

    static void main() {

//        printWelcomeMessage();

//        int result = Add(5,3);
//        System.out.println("loops.sum of the no. is = "+result);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to know it is loops.even or not ??? ");
        int a = sc.nextInt();
        boolean result = isEven(a);
        System.out.println(result+"  conditions.number");

//        int max = getMax(45765,882);
//        System.out.println("the greater no is = "+max);

//         float conditions.percentage = calculatePercentage(413,500);
//        System.out.println("Percentage = "+conditions.percentage+"%");

//        int age = Display(5,5);
//        String Name = Display("Shivraj"," Singh");
//        System.out.println("Age = "+age);
//        System.out.println("Name = "+Name);

//        int a = 10;
//        System.out.println("Main value "+a);
//        int value = updateValue(a);
//        System.out.println("updated value "+ value);
//        System.out.println("main value "+a);
    }
}
