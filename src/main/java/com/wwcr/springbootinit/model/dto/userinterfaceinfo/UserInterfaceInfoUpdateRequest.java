package com.wwcr.springbootinit.model.dto.userinterfaceinfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     *总调用次数
     */
    private Integer totalNum;

    /**
     *剩余调用次数
     */
    private Integer leftNum;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}