/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymonhoc;

import java.io.Serializable;

/**
 *
 * @author Computer Strix
 */
public class MonHoc implements Serializable {
    private String sMaMH;
    private String sTenMH;
    private int nTinChi;

    public MonHoc(String sMaMH, String sTenMH, int nTinChi) {
        this.sMaMH = sMaMH;
        this.sTenMH = sTenMH;
        this.nTinChi = nTinChi;
    }

    public MonHoc() {
    }

    public String getsMaMH() {
        return sMaMH;
    }

    public void setsMaMH(String sMaMH) {
        this.sMaMH = sMaMH;
    }

    public String getsTenMH() {
        return sTenMH;
    }

    public void setsTenMH(String sTenMH) {
        this.sTenMH = sTenMH;
    }

    public int getnTinChi() {
        return nTinChi;
    }

    public void setnTinChi(int nTinChi) {
        this.nTinChi = nTinChi;
    }
    
}
