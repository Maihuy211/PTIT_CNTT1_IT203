public class ScoreUtils {
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }
    public static double calculateAverage(double[] scores) {
        if (scores == null || scores.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
        System.out.println("\n>> Kết quả xử lý:");

        double average = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", average);

        for (double score : scores) {
            boolean pass = ScoreUtils.checkPass(score);
            System.out.println("- Điểm " + score + ": " + (pass ? "Đạt" : "Trượt"));
        }

    }
}
