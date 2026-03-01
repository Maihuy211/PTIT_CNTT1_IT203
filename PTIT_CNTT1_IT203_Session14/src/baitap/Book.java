package baitap;

public class Book implements Comparable<Book> {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String nhaXuatBan;
    private int namXuatBan;
    private int soTrang;
    private double giaTien;

    public Book() {
    }

    public Book(String maSach, String tenSach, String tacGia, String nhaXuatBan,
                int namXuatBan, int soTrang, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return
                "Mã sách: " + maSach + '|' +
                "Tên sách: " + tenSach + '|' +
                "Tác giả: " + tacGia + "|" +
                "Nhà xuất bản: " + nhaXuatBan + "|" +
                "Năm xuất bản: " + namXuatBan +"|"+
                "Số trang: " + soTrang +"|"+
                "Giá tiền: " + giaTien;
    }
    @Override
    public int compareTo(Book o) {
        return Double.compare(o.giaTien, this.giaTien);
    }
}