public class CelingOfANumber {

    public static int celingOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // if (target > arr[end]) return -1;
        // while(start < end){
        //     int mid = start + (end - start) /2;
        //     if (target > arr[mid]) start = mid + 1;
        //     else  end = mid;
        // } return arr[start] ;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) start = mid + 1;  
            else if (target < arr[mid]) end = mid -1;
            else return arr[mid];
        } return (start < arr.length) ? arr[start] : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 7;
        System.out.println(celingOfANumber(arr , target));
    }

}