package org.example;

import java.util.Objects;

public class Main {
    private static final int MIN_WIDTH = 2;
    private static final int MIN_HEIGHT = 2;
    private static final int MAX_WIDTH = 20;
    private static final int MAX_HEIGHT = 20;

    public static void main(String[] args) {

        var scanner = new Scanner();

        while (true) {

            System.out.println("Як будемо створювати матрицю?");
            System.out.println("1 - з клавіатури");
            System.out.println("2 - рандомно");
            System.out.println("будь яка інша кнопка - вихід");

            var input = scanner.readUserInput();

            int[][] matrix;

            if (Objects.equals(input, "1")) {
                System.out.println("Ширина:");
                var width = Integer.parseInt(scanner.readUserInput());

                System.out.println("Висота:");
                var height = Integer.parseInt(scanner.readUserInput());

                matrix = createMatrix(width, height);

            } else if (Objects.equals(input, "2")) {
                matrix = createMatrix(
                    (int)(Math.random() * MAX_WIDTH) + MIN_WIDTH,
                    (int)(Math.random() * MAX_HEIGHT) + MIN_HEIGHT
                );
            }
            else {
                break;
            }

            System.out.println("Мінімальний елемент: " + getMinimalValue(matrix));
            System.out.println("Максимальний елемент: " + getMaximumValue(matrix));
            System.out.println("Середнє арифметичне: " + getMeanValue(matrix));
        }
    }

    private static int[][] createMatrix(int width, int height) {
        var array = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = (int)(Math.random() * 51); // from 0 to 50
            }
        }

        return array;
    }

    private static int getMinimalValue(int[][] matrix) {
        var min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            var length = matrix[i].length;

            for (int j = 0; j < length; j++) {
                var element = matrix[i][j];

                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }

    private static int getMaximumValue(int[][] matrix) {
        var max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            var length = matrix[i].length;

            for (int j = 0; j < length; j++) {
                var element = matrix[i][j];

                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }

    private static int getMeanValue(int[][] matrix) {

        var height = matrix.length;
        var width = matrix[0].length;

        var totalLength = height * width;
        int sum = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum += matrix[i][j];
            }
        }

        return sum / totalLength;
    }
}