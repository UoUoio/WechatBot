package io.uouo.wechatbot.controller;

import io.uouo.wechatbot.common.util.AjaxResult;
import io.uouo.wechatbot.domain.WechatMsg;
import io.uouo.wechatbot.service.WechatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: [青衫] 'QSSSYH@QQ.com'
 * @Date: 2021-03-16 19:52
 * @Description: < 描述 >
 */
@RestController
public class WechatBotController {

    @Autowired
    private WechatBotService wechatBotService;


    /**
     * 描述: 通用请求接口
     *
     * @param wechatMsg
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-26
     */
    @PostMapping("/wechatCommon")
    public AjaxResult wechatCommon(@RequestBody WechatMsg wechatMsg) {
        wechatBotService.wechatCommon(wechatMsg);
        return AjaxResult.success();
    }


    /**
     * 描述: 发送文本消息
     *
     * @param wechatMsg
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-26
     */
    @PostMapping("/sendTextMsg")
    public AjaxResult sendTextMsg(@RequestBody WechatMsg wechatMsg) {
        wechatBotService.sendTextMsg(wechatMsg);
        return AjaxResult.success();
    }

    /**
     * 描述: 发送图片消息
     *
     * @param wechatMsg
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-26
     */
    @PostMapping("/sendImgMsg")
    public AjaxResult sendImgMsg(@RequestBody WechatMsg wechatMsg) {
        // 发送消息
        wechatBotService.sendImgMsg(wechatMsg);
        return AjaxResult.success();
    }

    /**
     * 描述: 群组内发送@指定人消息(dll 3.1.0.66版本不可用)
     *
     * @param wechatMsg
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-26
     */
    @PostMapping("/sendATMsg")
    public AjaxResult sendATMsg(@RequestBody WechatMsg wechatMsg) {
        wechatBotService.sendATMsg(wechatMsg);
        return AjaxResult.success();
    }

    /**
     * 描述: 发送附件
     *
     * @param wechatMsg
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-26
     */
    @PostMapping("/sendAnnex")
    public AjaxResult sendAnnex(@RequestBody WechatMsg wechatMsg) {
        wechatBotService.sendAnnex(wechatMsg);
        return AjaxResult.success();
    }


    // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 获取信息 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    /**
     * 描述: 获取微信群组,联系人列表
     *
     * @param
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-29
     */
    @GetMapping("/getWeChatUserList")
    public AjaxResult getWeChatUserList() {
        wechatBotService.getWeChatUserList();
        return AjaxResult.success("执行结果稍后会打印在控制台");
    }

    /**
     * 描述: 获取群组里指定联系人的详细信息
     *
     * @param roomid 群组id
     * @param wxid   指定用户id
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-5-6
     */
    @GetMapping("/getChatroomMemberNick/{roomid}/{wxid}")
    public AjaxResult getChatroomMemberNick(@PathVariable("roomid") String roomid, @PathVariable("wxid") String wxid) {
        wechatBotService.getChatroomMemberNick(roomid, wxid);
        return AjaxResult.success("执行结果稍后会打印在控制台");
    }

    /**
     * 描述: 获取所有群组以及成员
     *
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     */
    @GetMapping("/getMemberId}")
    public AjaxResult getMemberId() {
        wechatBotService.getMemberId();
        return AjaxResult.success("执行结果稍后会打印在控制台");
    }

    /**
     * 描述: 获取个人详细信息 3.2.2.121版本dll 未提供该接口
     *
     * @param
     * @return io.uouo.wechatbot.common.util.AjaxResult
     * @Author 青衫 [2940500@qq.com]
     * @Date 2021-3-29
     */
    // @GetMapping("/getPersonalDetail/{wxid}")
    public AjaxResult getPersonalDetail(@PathVariable("wxid") String wxid) {
        wechatBotService.getPersonalDetail(wxid);
        return AjaxResult.success();
    }
}
