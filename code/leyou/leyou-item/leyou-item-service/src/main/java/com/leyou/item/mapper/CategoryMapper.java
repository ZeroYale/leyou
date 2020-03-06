package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/13
 * @version: 1.0
 */

public interface CategoryMapper extends Mapper<Category>,SelectByIdListMapper<Category,Long>{
}
