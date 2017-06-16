package com.cloudtcc.controler;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cloudtcc.common.pojo.TreeNode;
import com.cloudtcc.iface.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2017/6/15.
 */
@Controller
public class ItemCatController {
    @Autowired(required = false)
    @Reference(interfaceClass = com.cloudtcc.iface.ItemCatService.class)
    private ItemCatService itemCatService;
    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<TreeNode> getCatList(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        return  itemCatService.getCatList( parentId);
    }
}
