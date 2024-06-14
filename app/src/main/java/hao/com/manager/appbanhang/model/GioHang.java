package hao.com.manager.appbanhang.model;

public class GioHang {
    int idsp, soluong;
    String tensp, hinhsp;
    Long giasp;
    boolean isChecked;

    public GioHang(){

    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getHinhsp() {
        return hinhsp;
    }

    public void setHinhsp(String hinhsp) {
        this.hinhsp = hinhsp;
    }

    public Long getGiasp() {
        return giasp;
    }

    public void setGiasp(Long giasp) {
        this.giasp = giasp;
    }
}
