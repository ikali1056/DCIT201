public class ClassAverage {

    public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public static double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateClassAverage(30, 40));
        System.out.println(calculateClassAverage(70, 30, 10));

        double[] classScores = {76, 44, 32};
        System.out.println(calculateClassAverage(classScores));
    }
}