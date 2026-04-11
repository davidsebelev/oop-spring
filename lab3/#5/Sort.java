import java.util.Arrays;

public class Sort {

    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] array) {
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static <E extends Comparable<E>> void mergeSort(E[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        mergeSortRecursive(array, 0, array.length - 1);
    }

    private static <E extends Comparable<E>> void mergeSortRecursive(E[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSortRecursive(array, left, mid);
        mergeSortRecursive(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static <E extends Comparable<E>> void merge(E[] array, int left, int mid, int right) {
        E[] leftPart = Arrays.copyOfRange(array, left, mid + 1);
        E[] rightPart = Arrays.copyOfRange(array, mid + 1, right + 1);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftPart.length && j < rightPart.length) {
            if (leftPart[i].compareTo(rightPart[j]) <= 0) {
                array[k++] = leftPart[i++];
            } else {
                array[k++] = rightPart[j++];
            }
        }

        while (i < leftPart.length) {
            array[k++] = leftPart[i++];
        }

        while (j < rightPart.length) {
            array[k++] = rightPart[j++];
        }
    }
}