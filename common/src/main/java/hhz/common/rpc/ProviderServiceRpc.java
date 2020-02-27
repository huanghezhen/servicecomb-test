package hhz.common.rpc;

import hhz.common.entity.BaseResponse;
import hhz.common.entity.OrderDTO;

/**
 * @ClassName: PayServiceRpc
 * @Description: TODO(概况)
 * @Author: huanghz
 * @Date: 2020/2/27 9:01
 */
public interface ProviderServiceRpc
{
    BaseResponse<OrderDTO> getOrder();
}
