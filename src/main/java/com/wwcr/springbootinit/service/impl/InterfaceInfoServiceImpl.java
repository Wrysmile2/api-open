package com.wwcr.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wwcr.springbootinit.common.ErrorCode;
import com.wwcr.springbootinit.exception.BusinessException;
import com.wwcr.springbootinit.mapper.InterfaceInfoMapper;
import com.wwcr.springbootinit.model.entity.InterfaceInfo;
import com.wwcr.springbootinit.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author d
 * @description 针对表【interface_info(接口表)】的数据库操作Service实现
 * @createDate 2023-12-25 21:08:00
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，参数不能为空
        if (add) {
            if (StringUtils.isAnyBlank(name)){
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() < 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




