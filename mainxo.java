
import static java.lang.System.exit;
import java.util.Scanner;

public class mainxo {

    static void X_func(int key, String[][] arr) {
        System.out.println("It's X Turn Use 1-9");
        Scanner scan = new Scanner(System.in);
        key = scan.nextInt();
        switch (key) {
            case 7 ->
                arr[0][0] = "X";
            case 8 ->
                arr[0][1] = "X";
            case 9 ->
                arr[0][2] = "X";
            case 6 ->
                arr[1][2] = "X";
            case 5 ->
                arr[1][1] = "X";
            case 4 ->
                arr[1][0] = "X";
            case 1 ->
                arr[2][0] = "X";
            case 2 ->
                arr[2][1] = "X";
            case 3 ->
                arr[2][2] = "X";
            default ->
                System.out.println("Wrong Input");
        }

    }

    static void O_func(int key, String[][] arr) {
        System.out.println("It's O Turn Use 1-9");
        Scanner scan = new Scanner(System.in);
        key = scan.nextInt();
        switch (key) {
            case 7 ->
                arr[0][0] = "O";
            case 8 ->
                arr[0][1] = "O";
            case 9 ->
                arr[0][2] = "O";
            case 6 ->
                arr[1][2] = "O";
            case 5 ->
                arr[1][1] = "O";
            case 4 ->
                arr[1][0] = "O";
            case 3 ->
                arr[2][2] = "O";
            case 2 ->
                arr[2][1] = "O";
            case 1 ->
                arr[2][0] = "0";
            default ->
                System.out.println("Wrong Input");
        }
    }

    static void display(String[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == null) {
                    arr[i][j] = "|";
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void check_X(String[][] arr) {
        if ("X".equals(arr[0][0]) && "X".equals(arr[0][1]) && "X".equals(arr[0][2])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);
        }
        if ("X".equals(arr[1][0]) && "X".equals(arr[1][1]) && "X".equals(arr[1][2])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);
        }
        if ("X".equals(arr[2][0]) && "X".equals(arr[2][1]) && "X".equals(arr[2][2])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);

        }

        if ("X".equals(arr[0][0]) && "X".equals(arr[1][0]) && "X".equals(arr[2][0])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);

        }

        if ("X".equals(arr[0][1]) && "X".equals(arr[1][1]) && "X".equals(arr[2][1])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);

        }

        if ("X".equals(arr[0][2]) && "X".equals(arr[1][2]) && "X".equals(arr[2][2])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);

        }

        if ("X".equals(arr[0][0]) && "X".equals(arr[1][1]) && "X".equals(arr[2][2])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);

        }

        if ("X".equals(arr[0][2]) && "X".equals(arr[1][1]) && "X".equals(arr[2][0])) {
            System.out.println("X IS THE WINNER !!!!");
            exit(0);

        }
    }

    static void check_O(String[][] arr) {
        if ("O".equals(arr[0][0]) && "O".equals(arr[0][1]) && "O".equals(arr[0][2])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);
        }
        if ("O".equals(arr[1][0]) && "O".equals(arr[1][1]) && "O".equals(arr[1][2])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);
        }
        if ("O".equals(arr[2][0]) && "O".equals(arr[2][1]) && "O".equals(arr[2][2])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);

        }

        if ("O".equals(arr[0][0]) && "O".equals(arr[1][0]) && "O".equals(arr[2][0])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);

        }

        if ("O".equals(arr[0][1]) && "O".equals(arr[1][1]) && "O".equals(arr[2][1])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);

        }

        if ("O".equals(arr[0][2]) && "O".equals(arr[1][2]) && "O".equals(arr[2][2])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);

        }

        if ("O".equals(arr[0][0]) && "O".equals(arr[1][1]) && "O".equals(arr[2][2])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);

        }

        if ("O".equals(arr[0][2]) && "O".equals(arr[1][1]) && "O".equals(arr[2][0])) {
            System.out.println("O IS THE WINNER !!!!");
            exit(0);

        }
    }

    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        int key = 0;
        for (int i = 0; i < 4; i++) {
            X_func(key, arr);
            display(arr);
            check_X(arr);
            O_func(key, arr);
            display(arr);
            check_O(arr);
        }
            X_func(key, arr);
            display(arr);
            check_X(arr);
    }
}
