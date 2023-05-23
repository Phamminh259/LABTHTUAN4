//Pham ngoc ha Minh// 1050080061
package khachhang;


class KhachHangNuocNgoai extends KhachHang 
{
private String QuocTich;
public KhachHangNuocNgoai()
{
super();
this.QuocTich="";
}
public KhachHangNuocNgoai(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHD, String HoTenKH, String QuocTich)
{
super( MaKH, SoLuong, DonGia, ThanhTien, NgayHD, HoTenKH);
this.QuocTich=QuocTich;
}
public String getQuocTich() {
return QuocTich;
}
public void setQuocTich(String quocTich) {
QuocTich = quocTich;
}
public void nhap()
{
super.nhap();
System.out.println("Quoc Tich: ");
QuocTich = in.next();
}
public double TTien()
{
return this.ThanhTien = this.SoLuong*this.DonGia;
}
public String toString()
{
return "Khach Hang Nuoc Ngoai: " + super.toString() + ", QuocTich: " + 
QuocTich
+ ", ThanhTien: " + ThanhTien;
}
}
class KhachHangViet extends KhachHang 
{
private int LoaiKH, DinhMuc;
public KhachHangViet()
{
super();
this.LoaiKH=0;
this.DinhMuc=0;
}
}