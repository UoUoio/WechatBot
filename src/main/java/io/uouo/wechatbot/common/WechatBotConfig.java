package io.uouo.wechatbot.common;

import io.uouo.wechatbot.client.WechatBotClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URISyntaxException;

/**
 * @author: [青衫] 'QSSSYH@QQ.com'
 * @Date: 2021-03-26 8:57
 * @Description: < 描述 >
 */
@Configuration
public class WechatBotConfig {

    /** 微信bot 链接地址 */
    @Value("${wechatBot.url}")
    private String wechatBotUrl;

    /** 微信消息处理地址 */
    public static String wechatMsgServerUrl;
    /** 是否开启远程处理微信消息功能 */
    public static Boolean wechatMsgServerIsOpen;

    /** 初始化 */
    @Bean
    public WechatBotClient initWechatBotClient() throws URISyntaxException {
        WechatBotClient botClient = new WechatBotClient(wechatBotUrl);
        // 建立连接
        botClient.connect();
        return botClient;
    }

    @Value("${wechatBotServer.url}")
    public void setWechatMsgServerUrl(String wechatMsgServerUrl) {
        WechatBotConfig.wechatMsgServerUrl = wechatMsgServerUrl;
    }

    @Value("${wechatBotServer.isOpen}")
    public void setWechatMsgServerIsOpen(boolean isOpen) {
        WechatBotConfig.wechatMsgServerIsOpen = isOpen;
    }
}
