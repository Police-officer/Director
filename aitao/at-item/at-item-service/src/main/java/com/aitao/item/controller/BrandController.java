package com.aitao.item.controller;

import com.aitao.common.pojo.PageResult;
import com.aitao.item.pojo.Brand;
import com.aitao.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 局长
 * @date: 2019/2/20 22:02
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
   @GetMapping("page")
   public ResponseEntity<PageResult<Brand>> queryBrandByPage(
           @RequestParam(value = "page",defaultValue = "1")Integer page,
           @RequestParam(value = "rows",defaultValue = "5") Integer rows,
           @RequestParam(value = "sortBy", required = false) String sortBy,
           @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
           @RequestParam(value = "key", required = false) String key) {
       PageResult<Brand> result = this.brandService.queryBrandByPageAndSort(page,rows,sortBy,desc, key);
       if (result == null || result.getItems().size() == 0) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       return ResponseEntity.ok(result);
   }
    /**
     * 新增品牌
     * @param brand
     * @return
     */
   @PostMapping
    public ResponseEntity<Void> saveBrand(Brand brand, @RequestParam("cids") List<Long> cids){
       this.brandService.saveBrand(brand,cids);
       return new ResponseEntity<>(HttpStatus.CREATED);
   }
}
