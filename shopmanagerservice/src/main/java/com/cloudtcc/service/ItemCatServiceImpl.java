package com.cloudtcc.service;

import com.cloudtcc.common.pojo.TreeNode;
import com.cloudtcc.iface.ItemCatService;
import com.cloudtcc.mapper.TbItemCatMapper;
import com.cloudtcc.pojo.TbItemCat;
import com.cloudtcc.pojo.TbItemCatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by as on 2017/6/15.
 */
@Service("itemCatService")
@com.alibaba.dubbo.config.annotation.Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired(required = false)
    TbItemCatMapper tbItemCatMapper;
    @Override
    public List<TreeNode> getCatList(Long parentId) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List <TbItemCat> itemCats = tbItemCatMapper.selectByExample(example);
        List<TreeNode> treeNodes = new ArrayList <>();
        for (TbItemCat itemCat : itemCats){
            TreeNode node = new TreeNode();
            node.setId(itemCat.getId());
            node.setText(itemCat.getName());
            node.setState(itemCat.getIsParent() ? "closed" : "open");
            treeNodes.add(node);
        }
        return treeNodes;
    }
}
