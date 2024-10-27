package Laboratory_work_2;

public class InterfaceArrayImpl implements InterfaceArray {
    // Объявляем приватное финальное поле array, представляющее массив типа long
    private final long[] array;
    // Переменная n хранит текущее количество элементов в массиве
    private int n;

    public InterfaceArrayImpl(int size) {
        // Инициализируем массив типа long с заданным размером size
        this.array = new long[size];
        // Устанавливаем начальное количество элементов в массиве равным 0
        this.n = 0;
    }

    // Поиск элемента в массиве
    public boolean find(long searchValue) {
        // Перебираем все элементы массива до текущего количества элементов n
        for (int i = 0; i < this.n; i++) {
            // Проверяем, совпадает ли текущий элемент с искомым значением
            if (array[i] == searchValue) {
                // Если совпадение найдено, возвращаем true
                return true;
            }
        }
        // Если значение не найдено после проверки всех элементов, возвращаем false
        return false;
    }

    // Добавление элемента в массив
    public void add(long value) {
        // Добавляем переданное значение в массив на позицию с индексом n
        array[n] = value;
        // Увеличиваем счетчик n, чтобы отразить добавление нового элемента
        n++;
    }

    // Удаление элемента из массива
    public void delete(long value) {
        int i;
        for (i = 0; i < this.n; i++) {
            if (array[i] == value) {
                break;
            }
        }
        if (i == n - 1) {
        } else {
            for (int j = i; j < n - 1; j++) {
                array[j] = array[j + 1];
            }
            n--;
        }
    }

    // Вывод массива
    public void show() {
        // Перебираем все элементы массива до текущего количества элементов n
        for (int i = 0; i < n; i++) {
            // Выводим каждый элемент массива в консоль с пробелом после значения
            System.out.println(array[i] + " ");
        }
        // Печатаем пустую строку для перехода на новую строку после вывода всех элементов
        System.out.println();
    }

    // Получение количества элементов массива
    public void getSize() {
        // Инициализируем счетчик для подсчета количества элементов в массиве
        int count = 0;
        // Перебираем все заполненные элементы массива до текущего количества элементов n
        for (int i = 0; i < n; i++) {
            // Увеличиваем счетчик на 1 для каждого элемента
            count++;
        }
        // Выводим количество элементов в массиве
        System.out.println(count);
    }


    // Поиск максимального элемента в массиве
    public long findMax() {
        // Инициализируем переменную maxMeaning, которая будет хранить максимальное значение
        long maxMeaning = 0;
        // Проходим по всем элементам массива до n
        for (int i = 0; i < n; i++) {
            // Если текущий элемент больше текущего максимального значения
            if (array[i] > maxMeaning) {
                // Обновляем maxMeaning значением текущего элемента
                maxMeaning = array[i];
            }
        }
        // Возвращаем максимальное значение
        return (maxMeaning);
    }

    // Поиск минимального элемента в массиве
    public long findMin() {
        // Инициализируем переменную minMeaning первым элементом массива
        long minMeaning = array[0];
        // Проходим по всем элементам массива до n
        for (int i = 0; i < n; i++) {
            // Если текущий элемент меньше текущего минимального значения
            if (array[i] < minMeaning) {
                // Обновляем minMeaning значением текущего элемента
                minMeaning = array[i];
            }
        }
        // Возвращаем минимальное значение
        return (minMeaning);
    }
}