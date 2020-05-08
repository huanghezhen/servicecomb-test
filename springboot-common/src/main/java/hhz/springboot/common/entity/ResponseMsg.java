package hhz.springboot.common.entity;

/**
 * @ClassName: ResponseMsg
 * @Description: 错误码
 * @Author: huanghz
 * @Date: 2020/2/16 23:00
 */
public interface ResponseMsg {
    String getResultCode();

    String getLogicCode();

    String getResultMsg();
}
