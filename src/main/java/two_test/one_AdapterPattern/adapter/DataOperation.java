package two_test.one_AdapterPattern.adapter;

public interface DataOperation {

    int[] sort(int[] array,String algorithmName);

    int search(int[] array, int key,String algorithmName);
}
