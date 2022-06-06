package com.springboot.kafka.pojo;

import lombok.Data;

import java.util.List;

/**
 *接收业务权限结果消息实体类
 * @Author liluo
 * @create 2022/5/19 17:16
 */
@Data
public class AcceptAuditResultVo {
    /**
     * 消息类型
     */
    private int type;

    /**
     * 业务系统的唯一标识
     */
    private String token;

    /**
     * 功能权限文件id
     */
    private String functionPermissionFileId;

    /**
     * 数据权限文件id
     */
    private String dataPermissionfileId;

    /**
     * 应用权限检查列表
     */
    private List<PermissionsCheckVo> permissionsChecklist;
}
