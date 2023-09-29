import java.util.ArrayList;

public class AverageCalculator {
    public static double getAverageOf(ArrayList<Integer> numbers) {
        double suma = 0;

        for (int number : numbers) {
            suma += number;
        }
        return suma / numbers.size();
    }
}