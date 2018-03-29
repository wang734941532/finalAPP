package cn.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.app.pojo.Dictionary;
import cn.app.service.CategoryService;
import cn.app.service.DictionaryService;
import cn.app.service.InfoService;
import cn.app.service.VersionService;

@Controller
public class AjaxController {
	
	@Autowired
	private InfoService infoService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private VersionService versionService;
	
	@Autowired
	private DictionaryService dictionaryService;
	
	
	
	
	
	public void setInfoService(InfoService infoService) {
		this.infoService = infoService;
	}






	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}






	public void setVersionService(VersionService versionService) {
		this.versionService = versionService;
	}






	public void setDictionaryService(DictionaryService dictionaryService) {
		this.dictionaryService = dictionaryService;
	}






	@RequestMapping(value="/verify/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String verify1(@PathVariable("id") Integer id){
		int value =2;
		int count = infoService.updateStatus(value, id);
		System.out.println(id);
		//return "{\"msg\":\"true\"}";
		return "true";
	}
	
	@RequestMapping(value="/verifyNo/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String verify2(@PathVariable("id") Integer id){
		int value =3;
		int count = infoService.updateStatus(value, id);
		//return "{\"msg\":\"true\"}";
		return "true";
	}
	
	@RequestMapping(value="/status",method=RequestMethod.GET)
	@ResponseBody
	public List<Dictionary> verify3(){
		List<Dictionary> appStatusList = dictionaryService.getAppStatus();
		
		//return "{\"msg\":\"true\"}";
		return appStatusList;
	}
}
