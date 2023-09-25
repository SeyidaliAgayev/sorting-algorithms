package algorithms;

public class QuickSortAlgorithm {
    public static void quickSort(int[] intArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int pivot = intArray[highIndex];
        int leftPointer = lowIndex;
         int rightPointer = highIndex;

         while (leftPointer < rightPointer) {
             while (intArray[leftPointer] <= pivot && leftPointer < rightPointer) {
                 leftPointer++;
             }
             while (intArray[rightPointer] >= pivot && leftPointer < rightPointer) {
                 rightPointer--;
             }
             quick(intArray, leftPointer, rightPointer);
         }
         quick(intArray, leftPointer, highIndex);
         quickSort(intArray, lowIndex, leftPointer - 1);
         quickSort(intArray, leftPointer + 1, highIndex);
        System.out.println("Array after quick sort: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void quick(int[] intArray, int index1, int index2) {
        int temp = intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = temp;
    }
}
