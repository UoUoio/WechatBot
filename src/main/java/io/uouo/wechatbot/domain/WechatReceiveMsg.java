package io.uouo.wechatbot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 微信消息接收对象 t_wechat_receive_msg
 *
 * @author ruoyi
 * @date 2021-03-20
 */
public class WechatReceiveMsg implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 微信消息编号 */
    private Long wechatReceiveMsgId;

    /** 消息id */
    private String id;

    /** 消息内容 */
    private String content;

    /** 群组里消息发送人,  私人对话这个字段为空 */
    private String id1;

    /** 群组里消息为 群组id, 个人的对话 为个人微信id */
    private String id2;

    /**
     *
     */
    private Long srvid;

    /** 接收消息时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    /** 接收消息类型 */
    private Integer type;

    /** 发送消息得对话框id   个人是个人得微信id,群组是群组得id带 */
    private String wxid;

    public void setWechatReceiveMsgId(Long wechatReceiveMsgId) {
        this.wechatReceiveMsgId = wechatReceiveMsgId;
    }

    public Long getWechatReceiveMsgId() {
        return wechatReceiveMsgId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId1() {
        return id1;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public String getId2() {
        return id2;
    }

    public void setSrvid(Long srvid) {
        this.srvid = srvid;
    }

    public Long getSrvid() {
        return srvid;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public String getWxid() {
        return wxid;
    }

    @Override
    public String toString() {
        return "WechatReceiveMsg{" +
                "wechatReceiveMsgId=" + wechatReceiveMsgId +
                ", id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", id1='" + id1 + '\'' +
                ", id2='" + id2 + '\'' +
                ", srvid=" + srvid +
                ", time=" + time +
                ", type=" + type +
                ", wxid='" + wxid + '\'' +
                '}';
    }
}
