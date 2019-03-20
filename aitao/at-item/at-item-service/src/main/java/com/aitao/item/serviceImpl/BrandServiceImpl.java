package com.aitao.item.serviceImpl;

import com.aitao.item.mapper.BrandMapper;
import com.aitao.item.service.BrandService;
import com.aitao.common.pojo.PageResult;
import com.aitao.item.pojo.Brand;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: 局长
 * @date: 2019/2/20 22:01
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPageAndSort(
            Integer page, Integer rows, String sortBy, Boolean desc, String key){
        // 开始分页
        PageHelper.startPage(page, rows);
        // 过滤
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(key)) {
            example.createCriteria().andLike("name", "%" + key + "%")
                    .orEqualTo("letter", key);
        }
        if (StringUtils.isNotBlank(sortBy)) {
            // 排序
            String orderByClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        // 查询
        Page<Brand> pageInfo = (Page<Brand>) brandMapper.selectByExample(example);
        // 返回结果
        return new PageResult<>(pageInfo.getTotal(), pageInfo);
    }
    @Transactional
    public void saveBrand(Brand brand, List<Long> cids){
        /**
         * 新增品牌信息
         */
        this.brandMapper.insertSelective(brand);
        /**
         * 新增品牌和分类中间表
         */
        for(Long cid: cids){
            this.brandMapper.insertCategoryBrand(cid,brand.getId());
        }
    }
}
