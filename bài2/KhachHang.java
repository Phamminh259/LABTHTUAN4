// Phạm Ngọc Hà Minh//
package khachhang;

import java.util.Scanner;
public class KhachHang {
protected int MaKH;
protected int SoLuong;
protected double DonGia,ThanhTien;
protected String NgayHD,HoTenKH;
Scanner in =new Scanner (System.in);
protected KhachHang (){
    this.MaKH=MaKH;
    this.DonGia=DonGia;
    this.NgayHD=NgayHD;
    this.HoTenKH="";
    this.SoLuong=0;
}
  

    public KhachHang(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHD, String HoTenKH) {
        this.MaKH = MaKH;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.NgayHD = NgayHD;
        this.HoTenKH = HoTenKH;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(String NgayHD) {
        this.NgayHD = NgayHD;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String HoTenKH) {
        this.HoTenKH = HoTenKH;
    }

   protected void nhap(){
       System.out.println("nhap ma khach hang");
       MaKH=in.nextInt();
       System.out.println("nhap ho ten khach hang");
       HoTenKH=in.next();
       System.out.println("ngay lap hoa don");
       NgayHD=in.next();
       System.out.println("so luong(kw)");
       SoLuong=in.nextInt();
       System.out.println("don gia");{
       DonGia=in.nextDouble ();
   }
       
       
       
   }

    @Override
    public String toString() {
        return "KhachHang{" + "MaKH=" + MaKH + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", ThanhTien=" + ThanhTien + ", NgayHD=" + NgayHD + ", HoTenKH=" + HoTenKH + ", in=" + in + '}';
    }

   
    


}
