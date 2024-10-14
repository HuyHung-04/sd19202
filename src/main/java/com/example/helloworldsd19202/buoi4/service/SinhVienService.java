package com.example.helloworldsd19202.buoi4.service;

import com.example.helloworldsd19202.buoi4.model.SinhVien;

import java.util.ArrayList;

public class SinhVienService {
    ArrayList<SinhVien> danhSach = new ArrayList<>();
    public SinhVienService(){
        danhSach.add(new SinhVien("1","A",6,"HN",true));
        danhSach.add(new SinhVien("2","B",7,"TQ",false));
        danhSach.add(new SinhVien("3","C",8,"ND",true));
    }
    public ArrayList<SinhVien> getAll(){
        return danhSach;
    }
    public SinhVien findById(String id){
        for (SinhVien sv: danhSach){
            if(sv.getId().equals(id)){
                return sv;
            }
        }
        return null;
    }
    public void add(SinhVien sv){
        danhSach.add(sv);
    }
    public void delete(String id){
        for (SinhVien sv: danhSach){
            if(sv.getId().equals(id)){
                danhSach.remove(sv);
                break;
            }
        }
    }
    public void update(SinhVien sv){
        for(int i = 0; i< danhSach.size(); i++){
            if (danhSach.get(i).getId().equals(sv.getId())){
                danhSach.set(i,sv);
            }
        }
    }
    public ArrayList<SinhVien> searchId(String id){
        ArrayList<SinhVien> search = new ArrayList<>();
        for(SinhVien sv: danhSach){
            if(sv.getId().equals(id)){
                search.add(sv);
            }
        }
        return search;
    }
}
