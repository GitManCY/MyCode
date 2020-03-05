package com.itmayiedu.service.impl;

import com.itmayiedu.annotation.ExtTransaction;
import com.itmayiedu.dao.UserDao;
import com.itmayiedu.service.LogService;
import com.itmayiedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//user 服务层
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LogService logService;

    // 方法执行完毕之后，才会提交事务
    public void del() {
        System.out.println("del");
    }

    @ExtTransaction
    public void add() {
        // 调用接口的时候 接口失败 需要回滚，但是日志记录不需要回滚。
        logService.addLog(); // 后面程序发生错误，不能影响到我的回滚### 正常当addLog方法执行完毕，就应该提交事务
        userDao.add("test001", 20);
//        int i = 1 / 0;
        System.out.println("################");
        userDao.add("test002", 21);

    }
}
