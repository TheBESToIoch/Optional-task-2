import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Matrix4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ращмерность матрицы: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
       /* int size = input.nextInt();
        int array[] = new int[size];*/
        //System.out.println("Введите аргументы: ");
        //System.out.println("Введите k: ");
       // int k = input.nextInt(); //  к - столбец по которому будем сортировать
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
        int max = 0;
        int y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                if (matrix[i][j] == max){
                    y=j;
                }
                }
            }
        }
        System.out.println(y);
        int[][] temp = new int[n][n];
        int[][] temp1 = new int[999][999];
        for(int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length/2; c++) {
                temp1[n-1][n-1] = matrix[r][y];
                matrix[r][y] = matrix[r][0];
                matrix[r][0] = temp1[0][0];
                //matrix[r][y] = temp[n-1][n-1];
                System.out.println(temp1[n-1][n-1]);
            }
        }
        for(int r = 0; r<matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == max) {
                    //matrix[r] = temp[n-1];

                    temp[1] = matrix[r];
                    matrix[r] = matrix[0];
                    matrix[0] = temp[1];

                  /*  temp[1] = matrix[c];
                    matrix[c] = matrix[n-1];
                    matrix[n-1] = temp[1];*/
                }
                //matrix[r][y] = temp[n-1][n-1];
            }
        }

                System.out.println(max);
        System.out.println("Сортированная матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }

    }


