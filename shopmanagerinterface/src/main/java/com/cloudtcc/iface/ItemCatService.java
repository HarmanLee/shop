package com.cloudtcc.iface;

import com.cloudtcc.common.pojo.TreeNode;
import com.cloudtcc.pojo.TbItemCat;

import java.util.List;

/**
 * Created by as on 2017/6/15.
 */
public interface ItemCatService {
    public List<TreeNode> getCatList(Long parentId);
}
