package com.yao.dao;

import com.yao.entry.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pengjie_yao
 * @date 2019/10/3016:19
 */
@Repository
public interface ItemDao extends JpaRepository<Item, Long> {
}
