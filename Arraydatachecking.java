import java.util.Scanner;

class Arraydatachecking {
    public int size = 4;
    public static int[] arr = new int[4];

    public int findmax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int findmin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int[] ascending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        return arr;
    }

    public int[] descending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        return arr;
    }

    public static void main(String[] args) {
        Arraydatachecking g = new Arraydatachecking();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();
        int[] arr = { 2, 3, 3, 55, 6 };
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        System.out.println("Your maximum number is ");
        System.out.println(g.findmax(arr));
        System.out.println("Your minimum number is ");
        System.out.println(g.findmin(arr));
        System.out.println("Your ascending array data is ");
        System.out.println(g.ascending(arr));
        System.out.println("Your descending array data is  ");
        System.out.println(g.descending(arr));
        // System.out.println(g.findmin(arr));

        g.ascending(arr);

        // System.out.println(g.descending(arr));

    }
}