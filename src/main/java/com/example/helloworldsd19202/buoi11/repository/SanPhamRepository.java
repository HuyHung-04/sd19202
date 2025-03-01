package com.example.helloworldsd19202.buoi11.repository;

import com.example.helloworldsd19202.buoi11.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    Page<SanPham> findSanPhamsByTenContains(String ten, Pageable pageable);
}
