public class Binary_Search {

    private int[] arr;

    public Binary_Search(int[] arr){
        this.arr = arr;
    }

    public boolean Search(int to_search){
        // Binary Search Algorithm
        int left = 0, right = arr.length-1;

        boolean found = false;
        while (left <= right){
            int mid  = (left + right) / 2;

            if (arr[mid] == to_search) {
                found = true;
                break;
            }
            else if(to_search < arr[mid]) right = mid-1;
            else if(to_search > arr[mid]) left = mid+1;
        }
        return found;
    }


}
