public class quicksort {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quick(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // work to be done
        // let us take pivot as last element
        // function for partition //makes a magic
        int pindx = partition(arr, si, ei); // this arranges small elements on left and large elements on right & returns pivot value
        quick(arr, si, pindx - 1); // left part
        quick(arr, pindx + 1, ei); // right part
        // partition(arr, si,ei);

    }

    // partition function
    // this is imp
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // i.e -1 to make place for elmts smaller than pivot
        for (int j = si; j < ei; j++) { //j<ei because arr[ei]=pivot (taken)
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++; //example solved dry run gives ans i=2
        // swap
        int temp = pivot;
        arr[ei] = arr[i]; //not to write pivot = arr[i] as we not change pivot but change the value in it
        arr[i] = temp;
        return i;

    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        
        quick(arr, 0, arr.length - 1);
        printarr(arr);


    }

}
