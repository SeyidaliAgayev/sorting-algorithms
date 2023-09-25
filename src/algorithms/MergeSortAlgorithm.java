package algorithms;

public class MergeSortAlgorithm {
    public static void mergeSort(int[] intArray) {
        int inputArrayLength = intArray.length;
        if (inputArrayLength < 2) {
            return;
        }
        int midIndex = inputArrayLength /  2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputArrayLength - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = intArray[i];
        }
        for (int i = midIndex; i < inputArrayLength; i++) {
            rightHalf[i - midIndex] = intArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(intArray, leftHalf, rightHalf);

        System.out.println("Array after merge sorting: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    private static void merge(int[] intArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                intArray[k] = leftHalf[i];
                i++;
            } else {
                intArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            intArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            intArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
