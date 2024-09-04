public class selectionSort {

        public static void selectionSort(int arr[] ) {
                for (int i=0; i<arr.length-1; i++) {
                        int minimumPosition = i;
                        for (int j=i; j<arr.length-1; j++) {
                                if (arr[minimumPosition] > arr[j+1]) {
                                        minimumPosition = j+1;
                                }
                        }

                        // Swap
                        int temp = arr[minimumPosition];
                        arr[minimumPosition] = arr[i];
                        arr[i] = temp;
                }
        }

        public static void printarray (int arr[]) {
                for (int i=0; i<arr.length; i++) {
                        System.out.println(arr[i] + " ");
                }
        }

        public static void main(String[] args) {
                int arr[] = {6,4,5,2,1,3};
                selectionSort(arr);
                printarray(arr);

        }
}