import java.util.Scanner;


public class MatrixOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = s.nextInt();

        System.out.print("Enter number of columns : ");
        int column = s.nextInt();

        int matrix1[][] = new int[row][column];
        System.out.println("Enter elements of first matrix  : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                matrix1[i][j] = s.nextInt();
            }
        }

        int matrix2[][] = new int[row][column];
        System.out.println("Enter elements of first matrix  : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                matrix2[i][j] = s.nextInt();
            }
        }

        String choices = "1]Addition 2]Subtraction 3]Multiplication ";
        System.out.println("select choice : " + choices);
        int choice = s.nextInt();
        switch (choice){
            case 1:
                int addition[][] = new int[row][column];
                for (int i=0; i<row; i++){
                    for (int j=0; j<column; j++){
                        addition[i][j] = matrix1[i][j]+matrix2[i][j];
                    }
                }
                System.out.println("Addition of two matrix : ");
                for (int i=0; i<row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(addition[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                int subtraction[][] = new int[row][column];
                for (int i=0; i<row; i++){
                    for (int j=0; j<column; j++){
                        subtraction[i][j] = matrix1[i][j]-matrix2[i][j];
                    }
                }
                System.out.println("Addition of two matrix : ");
                for (int i=0; i<row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(subtraction[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                break;

            case 3:
                if (row != column){
                    System.out.println("Rows are not equal to column ");
                    break;
                }
                else {
                    int multiplication[][]= new int[row][column];
                    for (int i=0; i<row; i++){
                        for (int j=0; j<column; j++){
                            for (int k=0; k<column; k++){
                                multiplication[i][j] = multiplication[i][j] + matrix1[i][k]*matrix2[k][j];
                            }
                        }
                    }
                    System.out.println("Addition of two matrix : ");
                    for (int i=0; i<row; i++) {
                        for (int j = 0; j < column; j++) {
                            System.out.print(multiplication[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                    break;
                }
            default:
                System.out.println("Wrong choice !!!! \n Select correct choice ");
                break;
        }
    }
}


//OUTPUT :
//        "C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51251:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes MatrixOperations
//        Enter number of rows : 3
//        Enter number of columns : 3
//        Enter elements of first matrix  :
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        Enter elements of first matrix  :
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        select choice : 1]Addition 2]Subtraction 3]Multiplication
//        1
//        Addition of two matrix :
//        2 4 6
//        8 10 12
//        14 16 18
//
//        Process finished with exit code 0

//************************  SUBTRACTION : ************
//        "C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51281:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes MatrixOperations
//        Enter number of rows : 2
//        Enter number of columns : 2
//        Enter elements of first matrix  :
//        1 2  3 4
//        Enter elements of first matrix  :
//        4 3 2 1
//        select choice : 1]Addition 2]Subtraction 3]Multiplication
//        2
//        Addition of two matrix :
//        -3 -1
//        1 3
//
//        Process finished with exit code 0

// ********************** MULTIPLICATION *******************
//       CASE 1 ROW != COLUMN MULTIPLICATION IS NOT POSSIBLE
// "C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51292:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes MatrixOperations
//        Enter number of rows : 2
//        Enter number of columns : 3
//        Enter elements of first matrix  :
//        1 2 3
//        4 5 6
//        Enter elements of first matrix  :
//        1 2 3
//        1 1 1
//        select choice : 1]Addition 2]Subtraction 3]Multiplication
//        3
//        Rows are not equal to column
//
//        Process finished with exit code 0

//********************* CASE 2 ROWS == COLUMN MULTIPLICATION IS POSSIBLE
//"C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=51298:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\Desktop\Java\codes\out\production\codes MatrixOperations
//        Enter number of rows : 2
//        Enter number of columns : 2
//        Enter elements of first matrix  :
//        1
//        2
//        3
//        4
//        Enter elements of first matrix  :
//        1
//        2
//        3
//        4
//        select choice : 1]Addition 2]Subtraction 3]Multiplication
//        3
//        Addition of two matrix :
//        7 10
//        15 22
//
//        Process finished with exit code 0
