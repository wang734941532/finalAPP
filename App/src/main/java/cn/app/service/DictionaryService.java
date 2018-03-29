package cn.app.service;

import java.util.List;

import cn.app.pojo.Dictionary;

public interface DictionaryService {
	
	 public List<Dictionary> getDictionaryListByStatus();
	 //ÓÃÓÚajax²éÑ¯APP×´Ì¬
	 public List<Dictionary> getAppStatus();

}
