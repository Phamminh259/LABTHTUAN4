/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khachhang;

class KhachHangViet extends KhachHang 
{
private int LoaiKH, DinhMuc;
public KhachHangViet()
{
super();
this.LoaiKH=0;
this.DinhMuc=0;
}
public KhachHangViet(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHD, String HoTenKH, int loai, int dm)
{
super(MaKH, SoLuong, DonGia, ThanhTien, NgayHD, HoTenKH);
this.LoaiKH = loai;
this.DinhMuc = dm;
}
public int getLoaiKH() {
return LoaiKH;
}
public void setLoaiKH(int loaiKH) {
LoaiKH = loaiKH;
}
public int getDinhMuc() {
return DinhMuc;
}
public void setDinhMuc(int dinhMuc) {
DinhMuc = dinhMuc;
}
public void nhap()
{
super.nhap();
System.out.println("Loai Khach Hang (1=SinhHoat, 2=KinhDoanh, 3=SanXuat)");
LoaiKH = in.nextInt();
System.out.println("Dinh Muc: ");
DinhMuc = in.nextInt();
}
public double TTien()
{
if(SoLuong<=DinhMuc)
return this.ThanhTien=this.DonGia*this.SoLuong;
else
    
return this.ThanhTien=this.DinhMuc*this.DonGia + (this.SoLuong*this.DinhMuc)*this.DonGia*2.5;
}
public String toString() 
{
String temp;
if(LoaiKH==1)
temp="Sinh Hoat";
else if(LoaiKH==2)
temp="Kinh Doanh";
else
temp="San Xuat";
return "Khach Hang Viet: " + super.toString() + ", LoaiKH: " + temp 
+ ", Dinh Muc: " + DinhMuc + ", Thanh Tien: " + ThanhTien;
}

}