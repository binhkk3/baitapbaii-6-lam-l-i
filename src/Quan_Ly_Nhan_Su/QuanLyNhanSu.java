package Quan_Ly_Nhan_Su;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuanLyNhanSu implements QuanLy<NhanVien>{
    private NhanVien[] danhSach = new NhanVien[4];
    private int size =0;

    @Override
    public void them(NhanVien nhanVien) {
        danhSach [ size] = nhanVien;
        size++;

    }

    @Override
    public void sua(String name, NhanVien nhanVien) {
        danhSach[timkiem(name)] = nhanVien;

    }

    @Override
    public void xoa(String name) {
        danhSach[timkiem(name)] = null;

    }

    @Override
    public void danhGia(String name) {

    }

    @Override
    public int timkiem(String name) {
        for (int i = 0; i < size; i++) {
            if ( name.equals(danhSach[i].getTen() )){
                return i;
            };
        }
        return 2;
    }

    @Override
    public void xapXep() {
        Arrays.sort(danhSach);

    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("................");

    }

    public static void main(String[] args) {
        QuanLyNhanSu ql = new QuanLyNhanSu();
        NhanVien nhanVien1 =new NhanVien("len van a",28,"thanh hoa",1112,"bao ve","nhan vien quen");
        NhanVien nhanVien2 =new NhanVien("len van b",26,"thanh hoa",1111,"bao ve","nhan vien quen");
        NhanVien nhanVien3 =new NhanVien("len van c",23,"thanh hoa",1113,"bao ve","nhan vien quen");
        NhanVien nhanVien4 =new NhanVien("len van d",29,"thanh hoa",1115,"bao ve","nhan vien quen");
     ql.them(nhanVien1);
     ql.them(nhanVien2);
     ql.them(nhanVien3);
     ql.them(nhanVien4);
     ql.print();
    // System.out.println(ql.timkiem("le van c"));
    // NhanVien nhanVien5 =new NhanVien("len van z",29,"thanh hoa",1115,"bao ve","nhan vien quen");
    //ql.sua("le can b",nhanVien5);
     //ql.print();
     //ql.xoa("le van b");
     //ql.print();
     ql.xapXep();
     ql.print();

    }
}
