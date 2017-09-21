package com.cnpc.admin.log.service.impl;

import com.cnpc.admin.dao.DAO;
import com.cnpc.admin.entity.PageData;
import com.cnpc.admin.log.service.ILogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("logService")
public class LogServiceImpl implements ILogService {
    @Resource(name = "daoSupport")
    private DAO dao;


    @Override
    public List<PageData> find(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("LogMapper.list",pd);
    }

    @Override
    public void save(PageData pd) throws Exception {
        dao.save("LogMapper.save",pd);
    }
}