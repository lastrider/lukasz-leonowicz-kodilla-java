import java.util.Random;

public class Application {

    public static void main(String[] args) {

        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = arrayOperations.createRandomArray(20);
        arrayOperations.display(array);
        double average = arrayOperations.calculateAverage(array);
        System.out.println(average);
    }
}

class ArrayOperations {

    int[] createRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    void display(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    double calculateAverage(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }
}