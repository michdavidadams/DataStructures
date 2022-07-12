package AssignmentFour;


public class AverageNumberMichaelAdams {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(averageNumber(n));
    }

    public static double averageNumber(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum / n;
    }
}