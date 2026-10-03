public static void bubbleSort(int[] array) {
    int n = array.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break;
    }
}

public static void main(String[] args) {
    int[] numbers = {5, 3, 2, 10, 1, 8};
    bubbleSort(numbers);
    for (int num : numbers) {
        System.out.print(num + " "); 
    }
}
