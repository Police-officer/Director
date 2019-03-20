package com.aitao.item.service;

import com.aitao.common.pojo.PageResult;
import com.aitao.item.pojo.Brand;

import java.util.List;

/**
 * @author: 局长
 * @date: 2019/2/20 22:00
 */
public interface BrandService {

    PageResult<Brand> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);
    /**
     * 新增品牌
     */
    void saveBrand(Brand brand, List<Long> cids);
}
