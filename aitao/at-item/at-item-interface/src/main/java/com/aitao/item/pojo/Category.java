package com.aitao.item.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: 局长
 * @date: 2019/2/20 15:43
 */
@Table(name="tb_category")
public class Category {

    @Id  //标注用于声明一个实体类的属性映射为数据库的主键列,该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //用于标注主键的生成策略，通过strategy 属性指定。默认情况下，JPA 自动选择一个最适合底层数据库的主键生成策略
    /**
     * 在javax.persistence.GenerationType中定义了以下几种可供选择的策略：
     * –IDENTITY：采用数据库ID自增长的方式来自增主键字段，Oracle 不支持这种方式；
     * –AUTO： JPA自动选择合适的策略，是默认选项；
     * –SEQUENCE：通过序列产生主键，通过@SequenceGenerator 注解指定序列名，MySql不支持这种方式
     * –TABLE：通过表产生主键，框架借由表模拟序列产生主键，使用该策略可以使应用更易于数据库移植。
     */
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean parent) {
        isParent = parent;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
