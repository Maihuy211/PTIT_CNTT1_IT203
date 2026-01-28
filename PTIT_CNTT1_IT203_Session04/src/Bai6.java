public class Bai6 {

    public static String processReview(String review) {

        // 1. Blacklist
        String[] blacklist = {"tệ", "ngu ngốc", "không đáng đọc"};

        // 2. Chặn từ nhạy cảm
        for (String badWord : blacklist) {
            String stars = "*".repeat(badWord.length());
            review = review.replace(badWord, stars);
            review = review.replace(badWord.toUpperCase(), stars);
        }

        // 3. Nếu quá 200 ký tự thì cắt (không cắt giữa từ)
        if (review.length() > 200) {
            String sub = review.substring(0, 200);
            int lastSpace = sub.lastIndexOf(" ");
            if (lastSpace != -1) {
                sub = sub.substring(0, lastSpace);
            }
            review = sub + "...";
        }

        return review;
    }

    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        System.out.println("Review sau xử lý:");
        System.out.println(processReview(review));
    }
}
