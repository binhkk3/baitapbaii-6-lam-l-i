package Quan_Ly_Nhan_Su;

public interface QuanLy<T> {
    void them(T t);
    void sua(String name, T t);
    void xoa(String name);
    void danhGia(String name);
    int timkiem(String name);
    void xapXep();
    void print();
}
