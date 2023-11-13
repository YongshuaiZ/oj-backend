package com.yupi.oj.judge;

import com.yupi.oj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.oj.model.entity.QuestionSubmit;
import com.yupi.oj.model.vo.QuestionSubmitVO;

/**
 * 判题服务业务流程：
 *  1）传入题目的提交id,获取到对应的题目、提交信息（包含代码、编程语言）
 *  2）如果题目提交状态不为等待中，就不用重复执行了
 *  3) 更改判题（题目提交）的状态为 "判题中” ，防止重复执行，也能让用户即时看到状态
 *  4）调用代码沙箱，获取到执行结果
 *  5）根据沙箱的执行结果，设置题目的判题状态和信息
 */
public interface JudgeService {
    QuestionSubmit doJudge(long questionSubmitId);
}
