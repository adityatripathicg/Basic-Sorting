public class bubbleSort2 {
    public static void bubbleSort2(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1 };
        bubbleSort2(arr);
       
    }
}
