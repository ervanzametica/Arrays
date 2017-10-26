package classes;

import java.util.Scanner;

public class Arrays {
    private int [] numbers;
    private int dimension;
    Scanner scanner = new Scanner(System.in);

    public void enterDimension() {

        System.out.println("Enter dimension:");

        setDimension(scanner.nextInt());

    }

    public void enterArray() {
        numbers = new int [dimension];

        for(int i = 0; i < dimension; i++) {
            System.out.println("Enter " + (i + 1) + ". number:");
            numbers[i] = scanner.nextInt();
        }

    }

    public void printArray() {
        for(int i = 0; i < dimension; i++) {
            System.out.print(numbers[i] + " " );
        }
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setDimension(int dimension) {
        if (dimension > 0)
            this.dimension = dimension;
    }
}
