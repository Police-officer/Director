package com.aitao.item.service;

import com.aitao.item.pojo.Category;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: 局长
 * @date: 2019/2/20 17:30
 */
public interface CategoryService{

    List<Category> queryCategoryById(@RequestParam("pid") Long pid);

}
