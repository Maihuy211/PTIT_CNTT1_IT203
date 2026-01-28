import java.time.LocalDate;

public class Bai3 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        LocalDate today = LocalDate.now();
        // StringBuilder
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        sb.append("--- BAO CAO MUON SACH ---\n");
        sb.append("Ngay tao: ").append(today).append("\n");

        for (int i = 0; i < transactions.length; i++) {
            sb.append("Giao dich: ")
                    .append(transactions[i])
                    .append("\n");
        }
        long endSB = System.nanoTime();
        //  + string
        long startS = System.nanoTime();
        String s = "--- BAO CAO MUON SACH ---\n";
        s += "Ngay tao: " + today + "\n";
        for (int i = 0; i < transactions.length; i++) {
            s += "Giao dich: " + transactions[i] + "\n";
        }
        long endS = System.nanoTime();
        System.out.println(sb);
        System.out.println(s);
        System.out.println("So thoi gian thuc thi doi voi StringBuilder: " + (endSB - startSB));
        System.out.println("So thoi gian thuc thi doi voi String: " + (endS - startS));

    }
}
