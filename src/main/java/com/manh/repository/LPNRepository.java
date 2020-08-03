package com.manh.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.manh.entity.LPN;

public interface LPNRepository extends JpaRepository<LPN, Long> {

	public List<LPN> findByItemName(String itemName);
	
}
