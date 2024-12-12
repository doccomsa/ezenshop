package com.ezen.shop.admin.product;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.shop.category.AdCategoryService;
import com.ezen.shop.category.CategoryVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

// 관리자 : 상품관리기능
@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/product/*")
public class AdProductController {

	private final AdCategoryService adCategoryService;
	
	// 상품등록 폼.  1차카테고리 정보를 출력.	
	@GetMapping("/pro_insert")
	public void pro_insert(Model model) {
		
		model.addAttribute("cate_list", adCategoryService.getFirstCategoryList());
	}
	
	// 상품등록(저장)
	// 상품수정 폼
	// 상품수정(변경)
	// 상품목록
	// 상품삭제
	// 상품검색
}
