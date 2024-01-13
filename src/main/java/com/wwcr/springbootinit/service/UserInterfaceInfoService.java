package com.wwcr.springbootinit.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wwcr.springbootinit.model.entity.UserInterfaceInfo;

/**
* @author d
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-01-09 14:58:05
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用次数统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
