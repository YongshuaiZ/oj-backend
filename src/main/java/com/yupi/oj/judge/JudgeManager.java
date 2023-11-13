package com.yupi.oj.judge;

import com.yupi.oj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.oj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.oj.judge.strategy.JudgeContext;
import com.yupi.oj.judge.strategy.JudgeStrategy;
import com.yupi.oj.judge.codesandbox.model.JudgeInfo;
import com.yupi.oj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用)
 */
@Service
public class JudgeManager {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        // 获取题目提交的language
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();

        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if(language.equals("java")){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }

        return judgeStrategy.doJudge(judgeContext);
    }

}
