import algorithms.BubbleSortAlgorithm;
import util.FileUtils;

public class Main {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        bubbleSortAlgorithm.bubbleSort(fileUtils.readIntegersFromArray());

    }
}