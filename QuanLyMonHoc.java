/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymonhoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Computer Strix
 */
public class QuanLyMonHoc {

    ArrayList<MonHoc> listMH;
    String tenFile = "danhsachmonhoc.txt";

    public ArrayList<MonHoc> getListMH() {
        return listMH;
    }

    public QuanLyMonHoc() {
        listMH = new ArrayList<MonHoc>();
    }

    public void themMH(MonHoc mh) {
        listMH.add(mh);
    }

    public void xoaMH(String sMaMH) {
        for (MonHoc mh : listMH) {
            if (mh.getsMaMH().equals(sMaMH)) {
                listMH.remove(mh);
                return;
            }
        }
    }

    public void suaMH(MonHoc mh) {
        for (MonHoc monhoc : listMH) {
            if (monhoc.getsMaMH().equals(mh.getsMaMH())) {
                monhoc.setsTenMH(mh.getsTenMH());
                monhoc.setnTinChi(mh.getnTinChi());
            }
        }
    }

    public void ghidulieu() {
        DocGhiFile.ghidulieu(listMH, tenFile);
    }

    public ArrayList<MonHoc> sapxeptheotc() {
        ArrayList<MonHoc> dskq = listMH;
        Collections.sort(dskq, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                if (o1.getnTinChi() > o2.getnTinChi()) {
                    return 1;
                } else if (o1.getnTinChi() == o2.getnTinChi()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        return dskq;
    }

    public void docDuLieu() {
        listMH = DocGhiFile.docdulieu(tenFile);
    }
}
