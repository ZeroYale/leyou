package com.leyou.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.leyou.search.pojo.Goods;
/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/22
 * @version: 1.0
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
