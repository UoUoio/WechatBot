package io.uouo.wechatbot.controller;

import io.uouo.wechatbot.client.WechatBotClient;
import io.uouo.wechatbot.common.util.AjaxResult;
import io.uouo.wechatbot.domain.WechatMsg;
import io.uouo.wechatbot.service.WechatBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: [青衫] 'QSSSYH@QQ.com'
 * @Date: 2021-03-16 19:52
 * @Description: < 描述 >
 */
@RestController
public class WechatBotController {

    @Autowired
    private WechatBotService wechatBotService;


    @PostMapping("/sendTextMsg")
    public AjaxResult sendTextMsg(@RequestBody WechatMsg wechatMsg) {
        wechatBotService.sendTextMsg(wechatMsg);
        return AjaxResult.success();

    }

    @PostMapping("/sendIMGMsg")
    public AjaxResult sendIMGtMsg(@RequestBody WechatMsg wechatMsg) {
        // 发送消息
        wechatBotService.sendIMGMsg(wechatMsg);
        return AjaxResult.success();

    }


}
