
import static java.lang.System.exit;
import java.util.Scanner;

public class mainxo {

    static void X_func(int key, String[][] arr) {
        System.out.println("It's X Turn Use 1-9");
        Scanner scan = new Scanner(System.in);
        key = scan.nextInt();
        switch (key) {
            case 7 -> {
                if ("|".equals(arr[0][0]) || arr[0][0]==null) {
                    arr[0][0] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 8 -> {
                if ("|".equals(arr[0][1]) || arr[0][1]==null ) {
                    arr[0][1] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 9 ->{
                if ("|".equals(arr[0][2]) || arr[0][2]==null ) {
                    arr[0][2] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 6 ->{
                if ("|".equals(arr[1][2])|| arr[1][2]==null) {
                    arr[1][2] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 5 ->{
                if ("|".equals(arr[1][1])|| arr[1][1]==null ) {
                    arr[1][1] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 4 ->{
                if ("|".equals(arr[1][0]) || arr[1][0]==null) {
                    arr[1][0] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 1 ->{
                if ("|".equals(arr[2][0]) || arr[2][0]==null) {
                    arr[2][0] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 2 ->{
                if ("|".equals(arr[2][1]) || arr[2][1]==null) {
                    arr[2][1] = "X";
                } else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            case 3 ->{
                if ("|".equals(arr[2][2]) || arr[2][2]==null) {
                    arr[2][2] = "X";
                } 
                else {
                    System.out.println("The postion is already Taken");
                    X_func(key, arr);
                }
            }
            default ->
                System.out.println("Wrong Input");
        }

    }

    static void O_func(int key, String[][] arr) {
        System.out.println("It's O Turn Use 1-9");
        Scanner scan = new Scanner(System.in);
        key = scan.nextInt();
        switch (key) {
            case 7 -> {
                if ("|".equals(arr[0][0]) || arr[0][0]==null) {
                    arr[0][0] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 8 -> {
                if ("|".equals(arr[0][1]) || arr[0][1]==null ) {
                    arr[0][1] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 9 ->{
                if ("|".equals(arr[0][2]) || arr[0][2]==null ) {
                    arr[0][2] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 6 ->{
                if ("|".equals(arr[1][2])|| arr[1][2]==null) {
                    arr[1][2] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 5 ->{
                if ("|".equals(arr[1][1])|| arr[1][1]==null ) {
                    arr[1][1] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 4 ->{
                if ("|".equals(arr[1][0]) || arr[1][0]==null) {
                    arr[1][0] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 1 ->{
                if ("|".equals(arr[2][0]) || arr[2][0]==null) {
                    arr[2][0] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 2 ->{
                if ("|".equals(arr[2][1]) || arr[2][1]==null) {
                    arr[2][1] = "O";
                } else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
            case 3 ->{
                if ("|".equals(arr[2][2]) || arr[2][2]==null) {
                    arr[2][2] = "O";
                } 
                else {
                    System.out.println("The postion is already Taken");
                    O_func(key, arr);
                }
            }
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
        System.out.println("ITS DRAW PLAY AGAIN !!!!");
    }
    
}
