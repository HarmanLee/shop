package com.cloudtcc.iface;

import com.cloudtcc.common.pojo.PageBean;
import com.cloudtcc.pojo.TbItem;

/**
 * Created by as on 2017/6/13.
 */
public interface ItemService {
    public TbItem getItemById(Long itemId);
    public PageBean getItemList(int page, int rows);
}
