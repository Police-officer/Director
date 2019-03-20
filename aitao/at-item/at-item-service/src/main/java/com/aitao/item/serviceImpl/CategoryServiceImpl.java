package com.aitao.item.serviceImpl;

import com.aitao.item.mapper.CategoryMapper;
import com.aitao.item.pojo.Category;
import com.aitao.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: 局长
 * @date: 2019/2/20 17:32
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    public List<Category> queryCategoryById(@RequestParam("pid") Long pid){
        Category category = new Category();
        category.setParentId(pid);
        return this.categoryMapper.select(category);
    }

}
