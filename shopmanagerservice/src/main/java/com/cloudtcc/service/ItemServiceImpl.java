package com.cloudtcc.service;

import com.cloudtcc.iface.ItemService;
import com.cloudtcc.mapper.TbItemMapper;
import com.cloudtcc.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by as on 2017/6/13.
 */
@Service("itemService")
public class ItemServiceImpl implements ItemService {
   @Autowired(required = false)
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(Long itemId) {
        TbItem item =  tbItemMapper.selectByPrimaryKey(itemId);
        return item;
    }
}
