package com.knight.mall.controller.collectPlace;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.knight.mall.common.pageUtils.PageResult;
import com.knight.mall.controller.BaseController;
import com.knight.mall.model.CollectPlace;
import com.knight.mall.query.CollectPlaceQuery;
import com.knight.mall.service.CollectPlaceService;

@RequestMapping(value = "/collectPlace")
@Controller
public class CollectPlaceController extends BaseController{
	
	
	@Autowired
	private CollectPlaceService collectPlaceService;
	
	/**
	 * 查询所有自提点记录
	 * @param query
	 * @return
	 */
	@RequestMapping(value = "list")
	public String list(CollectPlaceQuery query, Model model,HttpServletRequest request) {
		query.setEnterpriseId(1L);
		query.setPageSize(10);
		query.setSort("GMT_CREATE desc");
		PageResult<CollectPlace>  listPlace = collectPlaceService.queryListForPage(query);
		model.addAttribute("ps", listPlace);
		model.addAttribute("title", "自提点列表");
		return "collectPlacelist";
	}
}
