package hhz.springboot.common.rpc;

import hhz.springboot.common.entity.BaseResponse;
import hhz.springboot.common.entity.OrderDTO;
import hhz.springboot.common.entity.OrderSubDTO;

import java.util.List;

/**
 * @ClassName: ProviderService
 * @Description: TODO(概况)
 * @Author: huanghz
 * @Date: 2020/2/28 12:09
 */
public interface ProviderService
{
    String getStr();
    String getStr1();
    String getStr2();
    String getStr3();
    String testInteger(Integer param);
    String testException()throws Exception;

    BaseResponse<List<OrderDTO>> getOrder(OrderSubDTO orderSubDTO);
}
