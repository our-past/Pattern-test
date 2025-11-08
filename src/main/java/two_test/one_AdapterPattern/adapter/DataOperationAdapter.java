package two_test.one_AdapterPattern.adapter;

import two_test.one_AdapterPattern.algorithm.BinarySearch;
import two_test.one_AdapterPattern.algorithm.QuickSort;

public class DataOperationAdapter implements DataOperation {

    private final QuickSort quickSort = new QuickSort();
    private final BinarySearch binarySearch = new BinarySearch();

    @Override
    public int[] sort(int[] array,String algorithmName) {
        if (algorithmName.equals("QuickSort")){
            return quickSort.quickSort(array);
        }
        return new int[0];
    }

    @Override
    public int search(int[] array, int key,String algorithmName) {
        if (algorithmName.equals("BinarySearch")){
            return binarySearch.binarySearch(array, key);
        }
        return 0;
    }

}
