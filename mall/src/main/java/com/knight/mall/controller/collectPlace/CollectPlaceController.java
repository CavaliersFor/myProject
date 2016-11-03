package com.knight.mall.controller.collectPlace;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.knight.mall.common.pageUtils.PageResult;
import com.knight.mall.controller.BaseController;
import com.knight.mall.exception.ServiceException;
import com.knight.mall.model.CollectPlace;
import com.knight.mall.model.Region;
import com.knight.mall.query.CollectPlaceQuery;
import com.knight.mall.service.CollectPlaceService;
import com.knight.mall.service.RegionService;

@RequestMapping(value = "/collectPlace")
@Controller
public class CollectPlaceController extends BaseController{
	
	
	@Autowired
	private CollectPlaceService collectPlaceService;
	
	@Autowired
	private RegionService regionService;
	
	/**
	 * 获取商家id
	 * TODO
	 * @return
	 */
	public Long getId(HttpServletRequest request) {
		// 登陆信息
		return 1L;
	}
	
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
	
	
	/**
	 * 新增自提点页面
	 * @return
	 * @throws ServiceException 
	 */
	@RequestMapping(value="addPage")
	public String addPage(Long id,Model model,HttpServletRequest request) throws ServiceException{
		
		List<Region> listProvince = regionService.getAllProvince();
		
		if(id!=null && !id.equals(new Long(-1))){
			CollectPlaceQuery query = new CollectPlaceQuery();
			query.setEnterpriseId(getId(request));
			query.setIdArray(id);
			List<CollectPlace> listPlace = collectPlaceService.queryList(query);
			if(listPlace!=null && listPlace.size()==1){
				model.addAttribute("p", listPlace.get(0));
				
				String province = listPlace.get(0).getProvince();
				String city = listPlace.get(0).getCity();
				for(Region r: listProvince){
					if(r.getRegionName().equals(province)){
						List<Region> listCity = regionService.getByParentCode(r.getCode());
						model.addAttribute("citys", listCity);
						for(Region c:listCity){
							System.out.println(c.getRegionName());
							System.out.println(city);
							if(c.getRegionName().trim().equals(city.trim())){
								List<Region> listRegion = regionService.getByParentCode(c.getCode());
								model.addAttribute("regions", listRegion);
							}
						}
						break;
					}
				}
			}else{
				throw new ServiceException("自提点id有误");
			}
		}
		model.addAttribute("provinces", listProvince);
		
		return "addCollectPlace";
	}
}
