package test;

import com.cloudtcc.mapper.TbItemMapper;
import com.cloudtcc.pojo.TbItem;
import com.cloudtcc.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2017/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class PageHelperTest {
    @Autowired(required = false)
    TbItemMapper tbItemMapper;
    @Test
    public void test(){
        List<TbItem> tbItemList = tbItemMapper.selectByExample(new TbItemExample());
        PageHelper.startPage(1,5);
        PageInfo<TbItem> list = new PageInfo<TbItem>(tbItemList);
        System.out.println(list.getPageSize()==tbItemList.size());
        System.out.println(list.getTotal());
        System.out.println(list.getList());
        System.out.println(list.getPages());

    }
}
