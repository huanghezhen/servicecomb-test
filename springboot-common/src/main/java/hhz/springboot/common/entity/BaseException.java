package hhz.springboot.common.entity;

/**
 * @ClassName: Base
 * @Description: (概况)
 * @Author: huanghz
 * @Date: 2020/2/17 14:38
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 4549265243418656938L;
    private final ResponseMsg responseMsg;

    public BaseException() {
        super(CommonResponseMsg.ERROR.getResultMsg());
        responseMsg = CommonResponseMsg.ERROR;
    }

    public BaseException(Throwable cause) {
        super(CommonResponseMsg.ERROR.getResultMsg(), cause);
        responseMsg = CommonResponseMsg.ERROR;
    }

    public BaseException(ResponseMsg responseMsg) {
        super(responseMsg.getResultMsg());
        this.responseMsg = responseMsg;
    }

    public BaseException(ResponseMsg responseMsg, Throwable cause) {
        super(responseMsg.getResultMsg(), cause);
        this.responseMsg = responseMsg;
    }

    public BaseException(BaseResponse baseResponse) {
        super(baseResponse.getResultMsg());
        this.responseMsg = new ResponseMsg() {
            @Override
            public String getResultCode() {
                return baseResponse.getResultCode();
            }

            @Override
            public String getLogicCode() {
                return baseResponse.getLogicCode();
            }

            @Override
            public String getResultMsg() {
                return baseResponse.getResultMsg();
            }
        };
    }

    public ResponseMsg getResponseMsg() {
        return responseMsg;
    }
}
