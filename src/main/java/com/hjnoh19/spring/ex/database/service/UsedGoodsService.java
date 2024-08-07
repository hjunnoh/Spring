package com.hjnoh19.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjnoh19.spring.ex.database.domain.UsedGoods;
import com.hjnoh19.spring.ex.database.repository.UsedGoodsRepository;

// 로직(business) 담당
// 데이터를 수정 가공
// 그 외 복잡한 기능 수행
@Service
public class UsedGoodsService {
	
	// Repository 객체 관리를 스프링에게 위임
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;

	// 중고 물품 게시글 리스트 리턴 기능
	public List<UsedGoods> getUsedGoodsList() {
		// used goods 테이블 모든행 조회
		return usedGoodsRepository.selectUsedGoodsList();
	}
}
