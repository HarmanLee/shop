package com.cloudtcc.service;

import com.cloudtcc.common.pojo.PageBean;
import com.cloudtcc.iface.ItemService;
import com.cloudtcc.mapper.TbItemMapper;
import com.cloudtcc.pojo.TbItem;
import com.cloudtcc.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public PageBean getItemList(int page, int rows){
        PageHelper.startPage(page, rows);
        List <TbItem> itemList = tbItemMapper.selectByExample(new TbItemExample());
        PageInfo <TbItem> pageInfo = new PageInfo <>(itemList);
        PageBean result = new PageBean();
        result.setTotal(pageInfo.getTotal());
        result.setRows(itemList);
        return result;
    }
}
