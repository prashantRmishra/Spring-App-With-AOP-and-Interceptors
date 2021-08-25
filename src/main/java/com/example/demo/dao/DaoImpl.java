package com.example.demo.dao;

// import java.util.List;

// import com.example.demo.Exceptions.UserNotFoudException;
// import com.example.demo.bean.Employee;
// import com.example.demo.dao.RowMapper.Mapper;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;
public class DaoImpl {

}
// @Transactional
// @Repository

// public class DaoImpl implements Dao {
    

//     // @Autowired
//     // JdbcTemplate jdbcTemplate;

//     @Override
//     public Employee getEmpDEtails(int id) throws UserNotFoudException {
//         System.out.println("id "+id);
//         // List<Employee> e = null;
//         // try {
//         //     e =  jdbcTemplate.query("select * from emp where id =?", new Mapper(), new Object[]{id});
//         // } catch (Exception ex) {
//         //     System.out.println("ExceptionOccured");
//         //     throw new UserNotFoudException("user does not exisit");
//         // }
//         // if(e.isEmpty()) throw new UserNotFoudException("user does not exisit");
//         // return e.get(0);
//         return null;
//     }

//     @Override
//     public List<Employee> getAllEmpDetails() {
//         List<Employee> e = null;
//     //    try {
//     //     e =  jdbcTemplate.query("select * from emp ;", new Mapper());
//     //    } catch (Exception ex) {
//     //        //TODO: handle exception
//     //    }
//         return e;
//     }

//     @Override
//     public boolean addEmp(Employee e) {
//         int result = 0;
//         // try {
//         //     result = this.jdbcTemplate.update("insert into emp values(?,?,?)", new Object[]{e.getId(),e.getName(),e.getAge()});
//         // } catch (Exception ex) {
            
//         // }
//         return result > 0;
//     }

//     @Override
//     public boolean deleteEmp(int id) {
//         int result =0;
//         // try {
//         //     result = this.jdbcTemplate.update("delete from emp where id =?", new Object[]{id});
//         // } catch (Exception e) {
           
//         // }
//         return result > 0;
//     }
    
// }
