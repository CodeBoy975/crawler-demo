package com.yao.service.Impl;

import com.yao.dao.ItemDao;
import com.yao.entry.Item;
import com.yao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author pengjie_yao
 * @date 2019/10/30 16:22
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    /**
     * 根据条件查询数据
     *
     * @param item
     * @return
     */
    @Override
    public List<Item> findAll(Item item) {
        Example example = Example.of(item);
        List list = itemDao.findAll(example);
        return list;
    }

    /**
     * 保存数据
     *
     * @param item
     */
    @Override
    @Transactional
    public void save(Item item) {
        this.itemDao.save(item);
    }
}
