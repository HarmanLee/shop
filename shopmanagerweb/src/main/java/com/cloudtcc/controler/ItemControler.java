package com.cloudtcc.controler;

import com.cloudtcc.iface.ItemService;
import com.cloudtcc.pojo.TbItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by as on 2017/6/13.
 */
@Controller
public class ItemControler {
    @Resource
    ItemService itemService;
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        System.out.println("执行controler........" + itemId);
       // return new TbItem();
        TbItem item = itemService.getItemById(itemId);
        System.out.println(item);
       return item;
    }
}
