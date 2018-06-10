package com.pj.aris.service.test.impl;

import com.pj.aris.dao.test.TestDao;
import com.pj.aris.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pengjian on 2018/6/10.
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public String test() {
        return String.valueOf(testDao.getMaxId());
    }
}
