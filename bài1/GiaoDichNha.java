
package giaodich;


class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, int ngay, int thang, int nam, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngay, thang, nam, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double tinhThanhTien() {
        if (loaiNha.equals("cao cấp")) {
            return getDienTich() * getDonGia();
        } else {
            return getDienTich() * getDonGia() * 0.9;
        }
    }
}
