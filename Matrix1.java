import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Matrix1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ращмерность матрицы: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
       /* int size = input.nextInt();
        int array[] = new int[size];*/
        //System.out.println("Введите аргументы: ");
        System.out.println("Введите k: ");
        int k = input.nextInt(); //  к - столбец по которому будем сортировать
        int a;
        for (int i = a = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(100);
            }
        }
        System.out.println("Не сортированная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сортированная матрица по " + k+"-му" + "столбцу в порядке возрастания: ");
        int[][] temp = new int[n][n];
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix.length-1; j++) {
                if (matrix[j][k] > matrix[j + 1][k]) {
                    temp[1] = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp[1];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
