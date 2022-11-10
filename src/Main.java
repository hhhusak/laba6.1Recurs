public class Main {

    static void printRecurs(int[] a, int size, int i){
        if(i < size){
            System.out.printf("%d\t", a[i]);
            printRecurs(a, size, i + 1);
        } else {
            System.out.println();
        }
    }

    static void arrayCrRecurs(int[] a, int size, int i, int min, int max){
        if (i < size){
            a[i] = (int) (Math.random() * (max - min)) + min;
            arrayCrRecurs(a, size, i+1, min, max);
        }
    }

    static void taskRecurs(int[] a, int size, int i, int count, int sum){
        if (i < size){
            if (a[i] > 0 && a[i] % 2 == 0) {
                count++;
                sum += a[i];
                a[i] = 0;
            }
            taskRecurs(a, size, i + 1, count, sum);
        } else {
            System.out.println("count: " + count);
            System.out.println("sum: " + sum);
        }
    }

    public static void main(String[] args) {
        int size = 25;
        int[] a = new int[size];

        arrayCrRecurs(a, size, 0, -10, 10);
        printRecurs(a, size, 0);
        taskRecurs(a, size, 0, 0, 0);
        printRecurs(a, size, 0);
    }
}