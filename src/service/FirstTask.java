package service;

public class FirstTask {

    public static void main(String[] args) {

        int valueOne = 10;
        int valueTwo = 10;

        int[][] data = new int[valueOne][valueTwo];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = (i + 1) * (j + 1);
                System.out.println(i + " * " + j + " = " + data[i][j]);
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
