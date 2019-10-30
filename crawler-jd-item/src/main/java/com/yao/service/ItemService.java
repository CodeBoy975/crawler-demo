package com.yao.service;

import com.yao.entry.Item;

import java.util.List;

/**
 * @author pengjie_yao
 * @date 2019/10/3016:21
 */
public interface ItemService {


    /**
     *   根据条件查询数据
     * @param item
     * @return
     */
    public List<Item> findAll(Item item);

    /**
     *  保存数据
     * @param item
     */
    public void save(Item item);

}
