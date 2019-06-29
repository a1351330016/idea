package cn.itcast.dao;


import cn.itcast.dao.domain.Dept;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptDao {

    @Select("SELECT * FROM DEPT_C WHERE deptname='财务部' AND telephone LIKE '13%'")
    Dept findByDeptName();


}
