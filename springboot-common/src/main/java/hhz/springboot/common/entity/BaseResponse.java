package hhz.springboot.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName: BaseResponse
 * @Description: 响应类
 * @Author: huanghz
 * @Date: 2020/2/11 12:36
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {

    @ApiModelProperty("状态")
    private boolean status;
    @ApiModelProperty("返回码")
    private String resultCode;
    @ApiModelProperty("返回码")
    private String logicCode;
    @ApiModelProperty("返回信息")
    private String resultMsg;
    @ApiModelProperty("返回数据")
    private T data;

    public BaseResponse() {
    }

    private BaseResponse(ResponseMsg responseMsg) {
        status = false;
        resultCode = responseMsg.getResultCode();
        logicCode = responseMsg.getLogicCode();
        resultMsg = responseMsg.getResultMsg();
    }

    private BaseResponse(ResponseMsg responseMsg, T data) {
        status = true;
        resultCode = responseMsg.getResultCode();
        logicCode = responseMsg.getLogicCode();
        resultMsg = responseMsg.getResultMsg();
        this.data = data;
    }

    private BaseResponse(T data) {
        this(CommonResponseMsg.SUCCESS, data);
    }


    public static <T> BaseResponse<T> newInstanceSuccess() {
        return new BaseResponse<>(CommonResponseMsg.SUCCESS, null);
    }

    public static <T> BaseResponse<T> newInstance(ResponseMsg responseMsg) {
        return new BaseResponse<>(responseMsg);
    }

    public static <T> BaseResponse<T> newInstance(T data) {
        return new BaseResponse<>(data);
    }

    public static <T> BaseResponse<T> newInstance(ResponseMsg responseMsg, T data) {
        return new BaseResponse<>(responseMsg, data);
    }


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getLogicCode() {
        return logicCode;
    }

    public void setLogicCode(String logicCode) {
        this.logicCode = logicCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getData() {
        return data;
    }

    public T judgeStatusGetData() {
        if (!status) {
            throw new BaseException(this);
        }
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
