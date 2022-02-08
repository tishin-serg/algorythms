package binarySearch;

public class BinarySearch {

    public int binarySearch(int[] arr, int data) {
        // На вход принимаем отсортированный массив
        // делим его на два, получаем середину и сравниваем с результатом поиска.
        // если результат поиска больше чем искомое значение, значит берем первую половину и делим её на 2

        int low = 0;
        int high = arr.length - 1;
        int mid;
        int answer;
        while (low <= high) {
            mid = (low + high) / 2;
            answer = arr[mid];
            if (answer == data) {
                return mid;
            } else if (answer > data) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}
