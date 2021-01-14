//a program to find all pairs of elements in an array whose sum is equal to a specified number.
import java.util.Scanner;

class AssignmentFirstQ2 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, -5, 11, 5, 20};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();              //specified number

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==num){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
