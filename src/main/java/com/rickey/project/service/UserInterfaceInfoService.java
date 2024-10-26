package com.rickey.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rickey.qiapicommon.model.entity.UserInterfaceInfo;

/**
 * 用户接口信息服务
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

    boolean isLeftCount(long userId, long interfaceInfoId);
}
