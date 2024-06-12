package prob3;

import java.util.Arrays;

public class MarketingList {

    private final int INITIAL_LENGTH = 4;
    private Marketing[] arr;
    private int size;

    public MarketingList() {
        arr = new Marketing[INITIAL_LENGTH];
        size = 0;
    }
    public void add(Marketing m) {
        if (m == null)
            return;
        if (size == arr.length)
            resize(); // Array is full
        arr[size] = m;
        size++;
    }
    public boolean remove(Marketing m) {
        if (size == 0)
            return false; // the list is empty
        if (m == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (arr[i].equals(m)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false; // s is not found in the list
        Marketing[] temp = new Marketing[arr.length];
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, arr.length - (index + 1));
        arr = temp;
        --size;
        return true;
    }
    private void resize() {
        System.out.println("resizing");
        int len = arr.length;
        int newlen = 2 * len;
        arr = Arrays.copyOf(arr, newlen);

    }
    public int size(){
        return size;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(arr[i] + ", ");
        }
        sb.append(arr[size - 1] + "]");
        return sb.toString();
    }
    public Marketing get(int i) {
        if (i < 0 || i > size - 1) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return arr[i];
    }
    public void Set(int index, Marketing m) {
        if(index > size){
            System.out.println("Index is out of bound of array");
        }
        else {
            arr[index] = m;
        }
    }
}
