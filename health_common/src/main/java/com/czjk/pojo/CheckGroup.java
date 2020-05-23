package com.czjk.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * 检查组
 *
 * @author Haotian
 * @version 1.0.0
 * @date 2020/5/23 15:39
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CheckGroup implements Serializable {
    private static final long serialVersionUID = -6894386714026607208L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 助记
     */
    private String helpCode;

    /**
     * 适用性别
     */
    private String sex;

    /**
     * 介绍
     */
    private String remark;

    /**
     * 注意事项
     */
    private String attention;

    /**
     * 一个检查组合包含多个检查项
     */
    private List<CheckItem> checkItems;
}