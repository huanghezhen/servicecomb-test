package hhz.springboot.provider;

import hhz.springboot.common.entity.BaseResponse;
import hhz.springboot.common.entity.OrderDTO;
import hhz.springboot.common.entity.OrderSubDTO;
import hhz.springboot.common.rpc.ProviderService;
import org.apache.servicecomb.provider.pojo.RpcSchema;

import java.util.List;

/**
 * @ClassName: ProviderServiceImpl
 * @Description: TODO(概况)
 * @Author: huanghz
 * @Date: 2020/2/28 12:09
 */
@RpcSchema(schemaId = "ProviderService")
public class ProviderServiceImpl implements ProviderService
{
    @Override
    public String getStr()
    {
        return null;
    }

    @Override
    public String getStr1()
    {
        return null;
    }

    @Override
    public String getStr2()
    {
        return null;
    }

    @Override
    public String getStr3()
    {
        return null;
    }

    @Override
    public BaseResponse<List<OrderDTO>> getOrder(OrderSubDTO orderSubDTO)
    {
        return null;
    }
}