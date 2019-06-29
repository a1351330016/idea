import cn.itcast.dao.DeptDao;
import cn.itcast.dao.domain.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DeptTest {

    @Autowired
    private DeptDao deptDao;

    @Test
    public void test(){
        Dept deptName = deptDao.findByDeptName();
        System.out.println(deptName);


    }
}
