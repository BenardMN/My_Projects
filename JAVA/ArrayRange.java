public class ArrayRange {
    int [] makeRange(int lower, int upper){
        int arr[] = new int[(upper - lower) + 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = lower++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int myArray[];
        ArrayRange myRange = new ArrayRange();
        myArray = myRange.makeRange(1, 10);
        System.out.print("The array: [ ");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println("]");
    }
}
