package jst;

import com.cloudtcc.iface.ItemService;
import com.cloudtcc.mapper.TbItemMapper;
import com.cloudtcc.pojo.TbItem;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by as on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application*.xml")
public class ItemTest {
    @Resource
    private ItemService itemService;
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    @Test
    public void test(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TbItemMapper itemMapper = sqlSession.getMapper(TbItemMapper.class);
        TbItem item = itemMapper.selectByPrimaryKey(536563L);
        System.out.println(item);
    }
}
