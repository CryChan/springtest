package com.transation.dao;

import com.transation.model.fruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/28.
 */
public interface demoDAO {
    public int insert(fruit fruit);

    public int delete(fruit fruit);

    public List<fruit> select(fruit fruit);

    public int updata(@Param(value = "map")Map map);
}
