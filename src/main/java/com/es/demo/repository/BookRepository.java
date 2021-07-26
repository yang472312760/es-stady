package com.es.demo.repository;

import com.es.demo.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>@ProjectName:qmpo-bi</p>
 * <p>@Package:cn.qm.qmf.bs.repository</p>
 * <p>@ClassName:BookRepository</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/1/16 15:41</p>
 * <p>@Version:1.0</p>
 */
@Repository
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {
}
