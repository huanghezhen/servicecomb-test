package hhz.pojo.vertx.consumer;

import hhz.common.entity.BaseResponse;
import hhz.common.entity.OrderDTO;
import hhz.common.rpc.ProviderServiceRpc;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: PojoVertxCtrl
 * @Description: TODO(概况)
 * @Author: huanghz
 * @Date: 2020/2/27 10:23
 */
@RestSchema(schemaId = "PojoVertxCtrl")
@RequestMapping("/")
public class PojoVertxCtrl
{
    @RpcReference(microserviceName = "pojoVertxProvider", schemaId = "ProviderServiceRpc")
    private ProviderServiceRpc providerServiceRpc;

    @GetMapping("/getOrder")
    public BaseResponse<OrderDTO> getOrder()
    {
        BaseResponse<OrderDTO> order = providerServiceRpc.getOrder();
        OrderDTO data = order.getData();

        return new BaseResponse<>(data);
    }
}
