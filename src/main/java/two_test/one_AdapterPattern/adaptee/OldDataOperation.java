package two_test.one_AdapterPattern.adaptee;

import two_test.one_AdapterPattern.adapter.DataOperation;
import two_test.one_AdapterPattern.adapter.DataOperationAdapter;

public class OldDataOperation implements DataOperation {
    DataOperationAdapter dataOperationAdapter = new DataOperationAdapter();

    @Override
    public int[] sort(int[] array,String algorithmName) {
        if (array.length == 0){
            throw new IllegalArgumentException("数组为空");
        }
        if (algorithmName.equals("Old")){
            return new int[0];
        }
        else if(algorithmName.equals("QuickSort")){
            return dataOperationAdapter.sort(array,algorithmName);
        }
        throw new IllegalArgumentException("不支持的排序算法");
    }

    @Override
    public int search(int[] array, int key,String algorithmName) {
        if (array.length == 0){
            throw new IllegalArgumentException("数组为空");
        }
        if (algorithmName.equals("Old")){
            return -1;
        }
        if (algorithmName.equals("BinarySearch")){
            return dataOperationAdapter.search(array,key,algorithmName);
        }
        throw new IllegalArgumentException("不支持的搜索算法");
    }
}
