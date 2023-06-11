public class App {
    public static void main(String[] args) {

        int array[] = {38, 27, 43, 3, 9, 82, 10};

        MergeSort sorting = new MergeSort();

        System.out.print("Desordenado:   ");
        sorting.printArray(array);


        sorting.mergeSort(array, 0, array.length - 1);

        System.out.print("Ordenado:      ");
        sorting.printArray(array);

    }
}
