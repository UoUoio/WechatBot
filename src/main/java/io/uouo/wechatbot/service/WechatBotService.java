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
    public void wechatCommon(WechatMsg wechatMsg);

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
    public void sendImgMsg(WechatMsg wechatMsg);

    /**
     * 描述: 群组内发送@指定人消息
     *
     * @param wechatMsg
     
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-26
     */
    void sendATMsg(WechatMsg wechatMsg);


    /**
     * 描述: 发送附件
     *
     * @param wechatMsg
     
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-26
     */
    void sendAnnex(WechatMsg wechatMsg);

    /**
     * 描述: 获取微信群组,联系人列表
     *
     * @param
     
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-29
     */
    void getWeChatUserList();

    /**
     * 描述:获取指定联系人的详细信息
     *
     * @param wxid 被获取详细信息的人的 微信id
     * @return void
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-29
     */
    void getPersonalDetail(String wxid);

    /**
     * 描述: 获取群组里指定联系人的详细信息
     *
     * @param roomid 群组id
     * @param wxid   指定用户id
     
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-5-6
     */
    void getChatroomMemberNick(String roomid, String wxid);

    /**
     * 描述: 获取所有群组以及成员
     *
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-5-6
     */
    void getMemberId();
}
