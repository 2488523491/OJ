package com.jie.backendjudgeservice.judge.codesandbox.impl;


import com.jie.backendModel.model.codesandbox.ExecuteCodeRequest;
import com.jie.backendModel.model.codesandbox.ExecuteCodeResponse;
import com.jie.backendjudgeservice.judge.codesandbox.CodeSandbox;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
