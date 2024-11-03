public class week_2_binary_search {

    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 5;

        int ans = BinarySearch(arr, target);
        System.out.println("At position " + (ans+1));
    }
}
