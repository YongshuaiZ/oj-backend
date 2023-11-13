package com.yupi.oj.judge.strategy;

import com.yupi.oj.judge.codesandbox.model.JudgeInfo;

public interface JudgeStrategy {
    public JudgeInfo doJudge(JudgeContext judgeContext);
}
