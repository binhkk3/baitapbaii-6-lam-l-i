package Quan_Ly_Nhan_Su;

public abstract class Nguoi {
    String ten ;
    int tuoi ;
    String que;

    public Nguoi(String ten, int tuoi, String que) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.que = que;
    }

    public Nguoi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", que='" + que + '\'' +
                '}';
    }
}
