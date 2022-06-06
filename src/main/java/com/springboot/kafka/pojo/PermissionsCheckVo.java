package com.springboot.kafka.pojo;

import lombok.Data;

/**
 * 应用权限检查实体类
 * @Author liluo
 * @create 2022/5/19 17:26
 */
@Data
public class PermissionsCheckVo {
    /**
     * 每个用户拥有各自的账号
     */
    private Boolean eachUserOwnAccount;

    /**
     * 多人采用同一账号
     */
    private Boolean manyUserOneAccount;

    /**
     * 限定访问数据库的IP地址
     */
    private Boolean limitVisitDbIp;

    /**
     *  启动了密码过期政策
     */
    private Boolean startPwdExpirePolicy;

    /**
     * 手工限时更改密码
     */
    private Boolean hardLimitedTimeUpdateTime;

    /**
     *是否发生了权限变更
     */
    private Boolean happenPermissionChange;

    /**
     * 权限变更是否执行了变更手续
     */
    private Boolean permissionChangeProcess;

    /**
     * 权限清单符合最小性原则
     */
    private Boolean permissionSmallPrinciple;

    /**
     * 应用系统管理员是否与数据库管理员分离
     */
    private Boolean applicationAndDbPersonSplit;

    /**
     * 应用系统管理员是否与操作系统管理员分离
     */
    private Boolean applicationAndOperatePersonSplit;
}
