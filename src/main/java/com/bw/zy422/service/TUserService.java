package com.bw.zy422.service;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import com.bw.zy422.dao.TUserMapper;
import com.bw.zy422.model.TUser;
import com.bw.zy422.model.TUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class TUserService {
    @Autowired
    TUserMapper mapper;

    @Transactional
    public int add(TUser tUser) {
        tUser.setId(RandomUtil.randomUUID().replace("-",""));
        tUser.setPassword(SecureUtil.md5(tUser.getPassword()));
        tUser.setCreatetime(new Date());

        int i = mapper.insert(tUser);
        return i;
    }

    public List<TUser> verify(String phone) {
        TUserExample tue = new TUserExample();
        tue.createCriteria().andPhoneEqualTo(phone);

        return mapper.selectByExample(tue);
    }

    public TUser login(TUser tUser) {
        tUser.setPassword(SecureUtil.md5(tUser.getPassword()));

        TUserExample tue = new TUserExample();
        tue.createCriteria().andLoginNameEqualTo(tUser.getLoginName()).andPasswordEqualTo(tUser.getPassword());

        List<TUser> list = mapper.selectByExample(tue);
        if(list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
