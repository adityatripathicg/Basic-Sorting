public class insertionSort {
    public static void insertionSort(int arr[]){
        for(int i = 0;i<=arr.length-1;i++){ //i <= length-1 or i < length both work
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr []= { 5, 4, 1, 3, 2 };
        insertionSort(arr);
        printArr(arr);
    }
}
