
package giaodich;
import java.util.Scanner;
class main {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLy = new QuanLyGiaoDich();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    System.out.println("Thêm giao dịch:");
                    System.out.print("Loại (1: Giao dịch đất, 2: Giao dịch nhà): ");
                    int loaiGiaoDich = scanner.nextInt();
                    scanner.nextLine();

                    if (loaiGiaoDich == 1) {
                        System.out.print("Mã giao dịch: ");
                        String maGiaoDich = scanner.nextLine();
                        System.out.print("Ngày (dd): ");
                        int ngay = scanner.nextInt();
                        System.out.print("Tháng (mm): ");
                        int thang = scanner.nextInt();
                        System.out.print("Năm (yyyy): ");
                        int nam = scanner.nextInt();
                        System.out.print("Đơn giá: ");
                        double donGia = scanner.nextDouble();
                        System.out.print("Diện tích: ");
                        double dienTich = scanner.nextDouble();
                        scanner.nextLine(); 

                        System.out.print("Loại đất (A, B, C): ");
                        String loaiDat = scanner.nextLine();

                        GiaoDichDat giaoDichDat = new GiaoDichDat(maGiaoDich, ngay, thang, nam, donGia, dienTich, loaiDat);
                        quanLy.themGiaoDich(giaoDichDat);
                    } else if (loaiGiaoDich == 2) {
                        System.out.print("Mã giao dịch: ");
                        String maGiaoDich = scanner.nextLine();
                        System.out.print("Ngày (dd): ");
                        int ngay = scanner.nextInt();
                        System.out.print("Tháng (mm): ");
                        int thang = scanner.nextInt();
                        System.out.print("Năm (yyyy): ");
                        int nam = scanner.nextInt();
                        System.out.print("Đơn giá: ");
                        double donGia = scanner.nextDouble();
                        System.out.print("Diện tích: ");
                        double dienTich = scanner.nextDouble();
                        scanner.nextLine(); 

                        System.out.print("Loại nhà (cao cấp, thường): ");
                        String loaiNha = scanner.nextLine();
                        System.out.print("Địa chỉ: ");
                        String diaChi = scanner.nextLine();

                        GiaoDichNha giaoDichNha = new GiaoDichNha(maGiaoDich, ngay, thang, nam, donGia, dienTich, loaiNha, diaChi);
                        quanLy.themGiaoDich(giaoDichNha);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }

                    break;
                case 2:
                    System.out.println("Danh sách giao dịch:");
                    quanLy.hienThiDanhSachGiaoDich();
                    break;
                case 3:
                    System.out.println("Tổng số lượng giao dịch:");
                    quanLy.tinhTongSoLuongGiaoDich();
                    break;
                case 4:
                    System.out.println("Trung bình thành tiền của giao dịch đất:");
                    quanLy.tinhTrungBinhThanhTienDat();
                    break;
                case 5:
                    System.out.println("Giao dịch tháng 5 năm 2023:");
                    quanLy.hienThiGiaoDichThang5Nam2023();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }

            System.out.println();
        } while (luaChon != 0);

        scanner.close();
    }

    public static void hienThiMenu() {
        System.out.println("----- Quản lý giao dịch nhà đất -----");
        System.out.println("1. Thêm giao dịch");
        System.out.println("2. Hiển thị danh sách giao dịch");
        System.out.println("3. Tính tổng số lượng giao dịch");
        System.out.println("4. Tính trung bình thành tiền của giao dịch đất");
        System.out.println("5. Hiển thị giao dịch tháng 5 năm 2023");
        System.out.println("0. Thoát");
    }
}