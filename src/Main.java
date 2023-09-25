import algorithms.BubbleSortAlgorithm;
import algorithms.MergeSortAlgorithm;
import algorithms.QuickSortAlgorithm;
import util.FileUtils;

public class Main {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        QuickSortAlgorithm.quickSort(fileUtils.readIntegersFromArray(), 0, fileUtils.readIntegersFromArray().length - 1);

    }
}