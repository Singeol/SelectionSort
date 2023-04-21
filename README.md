# **Сортировка выбором**

Данный код реализует алгоритм сортировки выбором. Пользователь вводит размер массива и значения его элементов. 
Программа сортирует массив в порядке возрастания и выводит его на экран.
## **Файлы**

* **Main.java**: основной класс, содержащий метод **'selectionSort'**, осуществляющий сортировку выбором, и метод 
**'main'**, запускающий программу.
* **README.md**: файл, который вы читаете сейчас.

## **Использование**

Введите в консоли размер массива и значения его элементов. Программа отсортирует массив в порядке возрастания и 
выведет его на экран.

## **Пример**

```
Введите размер массива: 5
Введите элементы массива: 4 5 1 8 2
Отсортированный массив: [1, 2, 4, 5, 8]
```

## **Описание алгоритма**

Алгоритм сортировки выбором заключается в последовательном поиске минимального элемента в неотсортированной части 
массива и перемещении его в начало. В данной реализации для каждого элемента неотсортированной части массива 
находится минимальный элемент в оставшейся части и меняется местами с текущим элементом. Таким образом, массив 
постепенно упорядочивается, а неотсортированная часть уменьшается на каждой итерации цикла.