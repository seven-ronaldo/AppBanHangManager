package hao.com.manager.appbanhang.model.EventBus;

import hao.com.manager.appbanhang.model.SanPhamMoi;

public class SuaXoaEvent {
    SanPhamMoi sanPhamMoi;

    public SuaXoaEvent(SanPhamMoi sanPhamMoi) {
        this.sanPhamMoi = sanPhamMoi;
    }

    public SanPhamMoi getSanPhamMoi() {
        return sanPhamMoi;
    }

    public void setSanPhamMoi(SanPhamMoi sanPhamMoi) {
        this.sanPhamMoi = sanPhamMoi;
    }
}
