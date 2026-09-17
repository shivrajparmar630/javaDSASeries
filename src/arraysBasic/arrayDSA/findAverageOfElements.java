package arraysBasic.arrayDSA;

public class findAverageOfElements {
    static double findAverage(int[] arr){
        int size = arr.length;
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        double avg = sum / size;
        return avg;
    }

    static void main() {
        int [] arr = {1,2,4,5,6};
        double avg = findAverage(arr);
        System.out.println("Average of elements  "+avg);
    }
}
