public class home1 {
    //home 1
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void oneException() { // ArithmeticException
        int a = 0;
        int d = 2;
        int c = d / a;
    }

    public static void twoException() { //ArrayIndexOutOfBoundsException
        int d = 6;
        int[] arr = new int[5];
        int count = 0;
        for (int i = 0; i < d; i++) {
            count += 1;
            arr[i] = count;
        }
    }

    public static void threeException() { // NumberFormatException
        int num = Integer.parseInt("100a");
    }

    //    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
//    новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же
//    ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] deltaArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        if (a.length != b.length) {
            throw new RuntimeException("Размеры массивов не равны");
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
}
