package com.bean1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpService {

    @Autowired
    private EmpDao empDao;

    //注入口
//    public void setEmpDao(EmpDao empDao) {
//        this.empDao = empDao;
//    }

    public void addEmp() {
        empDao.saveEmp();
    }


}
