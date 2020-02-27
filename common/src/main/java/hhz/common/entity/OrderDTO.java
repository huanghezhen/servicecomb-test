package hhz.common.entity;

import java.util.List;

/**
 * @ClassName: OrderDTO
 * @Description: TODO(概况)
 * @Author: huanghz
 * @Date: 2020/2/27 9:03
 */
public class OrderDTO
{
    private String name;

    private List<OrderSubDTO> orderDTOList;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<OrderSubDTO> getOrderDTOList()
    {
        return orderDTOList;
    }

    public void setOrderDTOList(List<OrderSubDTO> orderDTOList)
    {
        this.orderDTOList = orderDTOList;
    }
}
