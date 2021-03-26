package io.uouo.wechatbot.service;

import io.uouo.wechatbot.domain.WechatMsg;

/**
 * @author: [青衫] 'QSSSYH@QQ.com'
 * @Date: 2021-03-18 20:55
 * @Description: < 描述 >
 */
public interface WechatBotService {

    /**
     * 描述: 发送文字消息
     *
     * @param wechatMsg 微信消息体
     * @return void
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-18
     */
    public void sendTextMsg(WechatMsg wechatMsg);

    /**
     * 描述: 发送图片消息
     *
     * @param wechatMsg 微信消息体
     * @return void
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-18
     */
    public void sendIMGMsg(WechatMsg wechatMsg);
}
