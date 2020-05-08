package hhz.springboot.common.entity;

/**
 * @ClassName: MemberResponseMsg
 * @Description: (概况)
 * @Author: huanghz
 * @Date: 2020/2/16 23:25
 */
public enum CommonResponseMsg implements ResponseMsg {
    /**
     * common
     * logicCode 00开头 7位数字 如：0000000
     * resultCode 在logicCode后加上两位 如：000000000
     */

    // 成功
    SUCCESS("0000000", "000000000", "成功"),
    // 接口异常
    ERROR("0000000", "000000001", "接口异常"),
    // 参数异常
    PARAM_ERROR("0000000", "000000002", "参数异常"),
    // bean工具类报错
    BEAN_UTIL_ERROR("0000000", "000000003", "bean工具类报错"),
    FLOWCONTROL_ERROR("0000000", "000000004", "服务器繁忙，请刷新重试"),
    ;

    private final String resultCode;
    private final String logicCode;
    private String resultMsg;

    CommonResponseMsg(String resultCode, String logicCode) {
        this.resultCode = resultCode;
        this.logicCode = logicCode;
    }

    CommonResponseMsg(String resultCode, String logicCode, String resultMsg) {
        this.resultCode = resultCode;
        this.logicCode = logicCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getLogicCode() {
        return logicCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }
}
