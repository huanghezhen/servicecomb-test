package hhz.springboot.provider.filter;


import hhz.springboot.common.entity.BaseResponse;
import hhz.springboot.common.entity.CommonResponseMsg;
import org.apache.http.HttpStatus;
import org.apache.servicecomb.swagger.invocation.Response;
import org.apache.servicecomb.swagger.invocation.SwaggerInvocation;
import org.apache.servicecomb.swagger.invocation.exception.ExceptionToProducerResponseConverter;

/**
 * @ClassName: GlobalExceptionFilter
 * @Description: 概况
 * @Author: huanghz
 * @Date: 2020/4/27 下午5:07
 */
public class GlobalExceptionFilter implements ExceptionToProducerResponseConverter<Exception> {
    @Override
    public Class<Exception> getExceptionClass() {
        return Exception.class;
    }


    @Override
    public Response convert(SwaggerInvocation swaggerInvocation, Exception e) {

        System.out.println("----------------------------------------------------------");

        //String s = JSONObject.toJSONString(BaseResponse.newInstance(CommonResponseMsg.ERROR));

        return Response
                .create(HttpStatus.SC_OK, String.valueOf(HttpStatus.SC_OK), BaseResponse.newInstance(CommonResponseMsg.ERROR));
    }
}
