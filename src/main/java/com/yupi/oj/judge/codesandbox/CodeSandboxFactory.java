package com.yupi.oj.judge.codesandbox;

import com.yupi.oj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.oj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.oj.judge.codesandbox.impl.ThirdPartyCodeSandbox;
import org.apache.poi.ss.formula.functions.T;

/**
 * 代码沙箱工厂，根据用户传入的字符串参数，生成对应的代码沙箱实现类
 */
public class CodeSandboxFactory {
    public static CodeSandbox newInstance(String type){
        switch(type){
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
