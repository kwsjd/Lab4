import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите количество элемнтов в массиве, затем введите эти сымые элементы: ");
        int n;
        int i;
        n = num.nextInt();
        int Array[] = new int[n];
        Scanner in = new Scanner(System.in);
        int[] arr = new int[n];
        int SearchKey;
        for ( i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" -Это элементы введенного массива. Введите число, которое вы хотели бы удалить : ");
        int m;
        m = num.nextInt();
        SearchKey = m;
        for ( i = 0; i < n; i++)
            if (arr[i] == SearchKey)
                break;
        for (int k = i; k < n - 1; k++)
            arr[k] = arr[k + 1];
        n--;
        for  ( i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
