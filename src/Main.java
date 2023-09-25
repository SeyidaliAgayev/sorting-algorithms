import algorithms.BubbleSortAlgorithm;
import algorithms.MergeSortAlgorithm;
import util.FileUtils;

public class Main {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        MergeSortAlgorithm mergeSortAlgorithm = new MergeSortAlgorithm();
        MergeSortAlgorithm.mergeSort(fileUtils.readIntegersFromArray());

    }
}