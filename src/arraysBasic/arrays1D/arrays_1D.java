package arraysBasic.arrays1D;

import java.util.*;
public class arrays_1D {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array?");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i);
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for (int i =0 ; i<arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);





//        Scanner sc = new Scanner(System.in);
//        int Odd = 0;
//        System.out.println("Enetr the size of array");
//        int size = sc.nextInt();
//        int arr[]= new int[size];
//        for(int i=0; i<arr.length; i++){
//            System.out.println("Index "+i);
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]%2!=0){
//                Odd++;
//            }
//        }
//        System.out.println("Odd Count "+Odd);


//        Scanner sc = new Scanner(System.in);
//        int loops.even =0;
//        System.out.println("Enetr the size of Array");
//        int size = sc.nextInt();
//        int arr[]= new int[size];
//
//        for(int i=0; i<arr.length; i++){
//            System.out.println("Enetr the value of index = "+i);
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2==0){
//                loops.even ++;
//
//            }
//        }
//        System.out.println("Even no. are "+loops.even);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Arrays Size");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//
//        for(int i=0; i<arr.length; i++){
//            System.out.println("Enter the value in Index = "+i);
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.print("Arrays elements are ");
//        for(int i=0; i<arr.length; i++){
//            System.out.print(" "+arr[i]);
//        }


//        int nums[] = {5, 10, 15, 20, 25};
//        int loops.sum =0;
//        for(int i=0; i<nums.length; i++){
//            loops.sum = loops.sum + nums[i];
//        }
//        System.out.println("Sum of all elements are = "+loops.sum);


//        int arr [] ={10, 20, 30, 40, 50};
//        for(int i=0; i<arr.length; i++){
//            System.out.print(" " +arr[i]);
//        }

    }
}

