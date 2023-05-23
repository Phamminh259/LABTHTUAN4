
package giaodich;

class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, int ngay, int thang, int nam, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngay, thang, nam, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double tinhThanhTien() {
        if (loaiDat.equals("A")) {
            return getDienTich() * getDonGia() * 1.5;
        } else {
            return getDienTich() * getDonGia();
        }
    }
}