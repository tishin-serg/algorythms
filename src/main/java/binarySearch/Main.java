package binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 28, 47, 88, 198, 888, 2123};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(arr, 8));
    }
}
