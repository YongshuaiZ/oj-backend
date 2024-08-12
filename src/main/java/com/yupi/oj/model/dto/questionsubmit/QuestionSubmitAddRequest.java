package com.yupi.oj.model.dto.questionsubmit;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建请求
 *  用户从前端提交代码的格式
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    /**
     * 题目ID
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}