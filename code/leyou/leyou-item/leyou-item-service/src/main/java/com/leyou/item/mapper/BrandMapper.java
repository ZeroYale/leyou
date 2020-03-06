package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/13
 * @version: 1.0
 */
public interface BrandMapper extends Mapper<Brand> {

    @Insert("INSERT INTO tb_category_brand (category_id,brand_id) values (#{cid},#{bid})")
    void insertCategoryAndBrand(@Param("cid") Long cid,@Param("bid") Long bid);

    @Select("Select * from tb_brand a INNER JOIN tb_category_brand b on a.id = b.brand_id where b.category_id=#{cid}")
    List<Brand> selectBrandsByCid(Long cid);
}
