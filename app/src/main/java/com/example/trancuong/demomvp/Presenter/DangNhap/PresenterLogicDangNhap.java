package com.example.trancuong.demomvp.Presenter.DangNhap;

import com.example.trancuong.demomvp.View.DangNhap.ViewXuLyDangNhap;

/**
 * Created by Tran Cuong on 7/19/2017.
 */

public class PresenterLogicDangNhap  implements IPresenterDangNhap{

    ViewXuLyDangNhap viewXuLyDangNhap;

    public PresenterLogicDangNhap(ViewXuLyDangNhap viewXuLyDangNhap) {
        this.viewXuLyDangNhap = viewXuLyDangNhap;
    }

    @Override
    public void KiemTraDangNhap(String name, String pass) {
        if (name.equals("tran cuong") && pass.equals("123")){
            // tra ra view dang nhap thanh cong
            viewXuLyDangNhap.DangNhapThanhCong();
        }else {
            // tra ra cho view dang nhap that bai
            viewXuLyDangNhap.DangNhapThatBai();
        }
    }
}
