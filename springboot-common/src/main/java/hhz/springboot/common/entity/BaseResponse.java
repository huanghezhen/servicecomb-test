package hhz.springboot.common.entity;

/**
 * @ClassName: BaseResponse
 * @Description: 响应类
 * @Author: huanghz
 * @Date: 2020/2/11 12:36
 */
public class BaseResponse<T>
{
    /**
     * 返回码
     */
    private int resultCode;
    private int logicCode;

    /**
     * 返回信息
     */
    private String resultMsg;

    /**
     * 返回数据
     */
    private T data;

    public BaseResponse()
    {
    }

    public BaseResponse(T data)
    {
        this.data = data;
    }

    public int getResultCode()
    {
        return resultCode;
    }

    public void setResultCode(int resultCode)
    {
        this.resultCode = resultCode;
    }

    public int getLogicCode()
    {
        return logicCode;
    }

    public void setLogicCode(int logicCode)
    {
        this.logicCode = logicCode;
    }

    public String getResultMsg()
    {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg)
    {
        this.resultMsg = resultMsg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
