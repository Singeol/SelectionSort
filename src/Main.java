import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // метод сортировки выбором
    public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i]; // минимальный элемент считается текущим элементом
            int minId = i; // индекс текущего элемента считается минимальным
            // цикл перебирает все оставшиеся элементы массива
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) { // если элемент меньше минимального, обновляем значения минимального элемента и его индекса
                    min = array[j];
                    minId = j;
                }
            }
            // меняем местами текущий элемент и минимальный элемент
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array; // возвращаем отсортированный массив
    }

    public static void main(String[] args) {
        Main search = new Main(); //создаем экземпляр класса Main
        Scanner scanner = new Scanner(System.in); //создаем экземпляр класса Scanner для считывания ввода
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt(); //считываем количество элементов массива
        int[] array = new int[size]; //создаем массив указанного размера
        //цикл заполнения массива
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); //считываем i-й элемент массива
        }
        //выводим отсортированный массив на экран
        System.out.println("Отсортированный массив: " + Arrays.toString(search.selectionSort(array)));
    }
}
