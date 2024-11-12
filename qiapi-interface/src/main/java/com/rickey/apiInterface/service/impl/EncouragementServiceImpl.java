package com.rickey.apiInterface.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rickey.apiInterface.mapper.EncouragementMapper;
import com.rickey.apiInterface.model.entity.Encouragement;
import com.rickey.apiInterface.service.EncouragementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author RicKey
 * @description 针对表【encouragement(心灵鸡汤)】的数据库操作Service实现
 * @createDate 2024-10-22 22:08:31
 */
@Service
public class EncouragementServiceImpl extends ServiceImpl<EncouragementMapper, Encouragement>
        implements EncouragementService {

    @Resource
    private EncouragementMapper encouragementMapper;


    /**
     * @return
     */
    @Override
    public Encouragement getRandomEncouragement() {
        return encouragementMapper.getRandomEncouragement();
    }
}



