// Phạm Ngọc Hà Minh//
package giaodich;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
        System.out.println("Thêm giao dịch thành công.");
    }

    public void hienThiDanhSachGiaoDich() {
        if (danhSachGiaoDich.isEmpty()) {
            System.out.println("Danh sách giao dịch rỗng.");
        } else {
            for (GiaoDich giaoDich : danhSachGiaoDich) {
                System.out.println(giaoDich.toString());
            }
        }
    }

    public void tinhTongSoLuongGiaoDich() {
        int soLuongGiaoDichDat = 0;
        int soLuongGiaoDichNha = 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                soLuongGiaoDichDat++;
            } else if (giaoDich instanceof GiaoDichNha) {
                soLuongGiaoDichNha++;
            }
        }

        System.out.println("Số lượng giao dịch đất: " + soLuongGiaoDichDat);
        System.out.println("Số lượng giao dịch nhà: " + soLuongGiaoDichNha);
    }

    public void tinhTrungBinhThanhTienDat() {
        double tongThanhTienDat = 0;
        int soLuongGiaoDichDat = 0;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                GiaoDichDat giaoDichDat = (GiaoDichDat) giaoDich;
                tongThanhTienDat += giaoDichDat.tinhThanhTien();
                soLuongGiaoDichDat++;
            }
        }

        double trungBinhThanhTienDat = tongThanhTienDat / soLuongGiaoDichDat;
        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTienDat);
    }

    public void hienThiGiaoDichThang5Nam2023() {
        System.out.println("Các giao dịch của tháng 5 năm 2023:");

        boolean coGiaoDich = false;

        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.getThang() == 5 && giaoDich.getNam() == 2023) {
                System.out.println(giaoDich.toString());
                coGiaoDich = true;
            }
        }

        if (!coGiaoDich) {
            System.out.println("Không có giao dịch nào trong tháng 5 năm 2023.");
        }
    }
}
