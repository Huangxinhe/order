package generate;

import com.imooc.order.dataobject.OrderDetail;

public interface OrderDetailDao {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}