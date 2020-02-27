package hhz.pojo.vertx.provider;

import hhz.common.entity.BaseResponse;
import hhz.common.entity.OrderDTO;
import hhz.common.entity.OrderSubDTO;
import hhz.common.rpc.ProviderServiceRpc;
import org.apache.servicecomb.provider.pojo.RpcSchema;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ProviderServiceRpcImpl
 * @Description: TODO(概况)
 * @Author: huanghz
 * @Date: 2020/2/27 10:19
 */
@RpcSchema(schemaId = "ProviderServiceRpc")
public class ProviderServiceRpcImpl implements ProviderServiceRpc
{

    @Override
    public BaseResponse<OrderDTO> getOrder()
    {
        OrderDTO orderDTO = new OrderDTO();
        OrderSubDTO orderSubDTO = new OrderSubDTO();
        orderSubDTO.setName("orderSubDTO");
        List<OrderSubDTO> orderSubDTOList = new ArrayList<>();
        orderSubDTOList.add(orderSubDTO);
        orderDTO.setName("orderDTO");
        orderDTO.setOrderDTOList(orderSubDTOList);
        return new BaseResponse<>(orderDTO);
    }
}
