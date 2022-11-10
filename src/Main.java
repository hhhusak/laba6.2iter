import java.util.Scanner;

public class Main {

    static void arrayCrIter(int[] a, int n, int min, int max){
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * (max - min)) + min;
        }
    }

    static void printIter(int[] a, int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", a[i]);
        }
        System.out.println();
    }

    static void taskIter(int[] a, int n){
        double count = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] % 2 != 0){
                count++;
                sum += a[i];
            }
        }
        System.out.printf("Середнє арифметичне: %.2f", sum / count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Кількість елементів: ");int n = scan.nextInt();
        System.out.print("Мінімальне число: ");int min = scan.nextInt();
        System.out.print("Максимальне число: ");int max = scan.nextInt();
        int[] a = new int[n];

        arrayCrIter(a, n, min, max);
        printIter(a, n);
        taskIter(a, n);
    }
}