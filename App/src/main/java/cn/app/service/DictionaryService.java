package cn.app.service;

import java.util.List;

import cn.app.pojo.Dictionary;

public interface DictionaryService {
	
	 public List<Dictionary> getDictionaryListByStatus();
	 //����ajax��ѯAPP
	 public List<Dictionary> getAppStatus();
	 //����ajax��ѯƽ̨
	 public List<Dictionary> getAppFlatForm();

}
