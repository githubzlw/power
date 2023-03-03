package com.saimi.power.service;

import com.saimi.power.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by saimi on 2021/8/3.
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
