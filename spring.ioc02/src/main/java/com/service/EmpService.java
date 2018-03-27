package com.service;

import com.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
public class EmpService {

    @Autowired  //省去了 配置 setter  主入口的步骤
    private EmpDao empDao;


//    public EmpService(@Autowired EmpDao empDao) {
//        this.empDao = empDao;
//    }

    public void saveEmp(){
        System.out.println("service----------  start . ");
        empDao.saveEmp();
        System.out.println("service----------  end .");
    }

}
