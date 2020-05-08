package hhz.springboot.common.filter;


import org.apache.http.HttpStatus;
import org.apache.servicecomb.swagger.invocation.Response;
import org.apache.servicecomb.swagger.invocation.SwaggerInvocation;
import org.apache.servicecomb.swagger.invocation.exception.ExceptionToProducerResponseConverter;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, String> ret = new HashMap<>();
        ret.put("msg", "自定义异常");


        return Response
                .create(HttpStatus.SC_OK, String.valueOf(HttpStatus.SC_OK), ret);
    }
}
