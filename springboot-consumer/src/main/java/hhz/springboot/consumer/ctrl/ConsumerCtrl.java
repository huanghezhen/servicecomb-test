package hhz.springboot.consumer.ctrl;

import hhz.springboot.common.entity.BaseResponse;
import hhz.springboot.common.rpc.ProviderService;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ConsumerCtrl
 * @Description:
 * @Author: huanghz
 * @Date: 2020/5/7 16:02
 */
@RestSchema(schemaId = "ConsumerCtrl")
@RequestMapping(path = "/")
public class ConsumerCtrl {

    @RpcReference(microserviceName = "provider", schemaId = "ProviderService")
    public ProviderService providerService;

    @GetMapping("/testInteger")
    public String testInteger() {
        return providerService.testInteger(0);
    }


    @GetMapping("/testException")
    public BaseResponse testException() throws Exception {
        return providerService.testException();
    }
    @GetMapping("/testBoolean")
    public BaseResponse testBoolean() throws Exception {
        return providerService.testBoolean();
    }
}
