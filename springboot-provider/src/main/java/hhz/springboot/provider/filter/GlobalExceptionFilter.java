package hhz.springboot.provider.filter;


import hhz.springboot.common.entity.BaseResponse;
import hhz.springboot.common.entity.CommonResponseMsg;
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

        return Response
                .succResp(BaseResponse.newInstance(CommonResponseMsg.ERROR));
    }
}
