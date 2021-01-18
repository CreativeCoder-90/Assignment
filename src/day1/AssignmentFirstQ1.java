package day1;
//program to find the second smallest element in an array.

class AssignmentFirst {

    public static void main(String[] args) {

        int[] arr = {12,5,8,3,11,36};
        int smallest = arr[arr.length-1];
        int s_smallest = arr[arr.length-1];  // second smallest

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<s_smallest && arr[i]>smallest){
                s_smallest = arr[i];
            }
        }
        System.out.println(s_smallest);
    }
}
