package cn.app.service;

import java.util.List;

import cn.app.pojo.Category;

public interface CategoryService {

	List<Category> getCategoryList();

	//��ѯһ������
	 List<Category> getSortOne();
	 //�Ӵ�Ŀ¼��ѯ
	 List<Category> getSortTwo(int ParentId);
}
