package com.wwcr.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wwcr.springbootinit.model.entity.InterfaceInfo;

/**
* @author d
* @description 针对表【interface_info(接口表)】的数据库操作Service
* @createDate 2023-12-25 21:08:00
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b);
}
