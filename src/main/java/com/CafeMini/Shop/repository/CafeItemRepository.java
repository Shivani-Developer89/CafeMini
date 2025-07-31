package com.CafeMini.Shop.repository;

import com.CafeMini.Shop.model.CafeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeItemRepository  extends JpaRepository<CafeItem ,Long> {
}
