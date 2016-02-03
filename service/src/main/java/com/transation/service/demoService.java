package com.transation.service;

import com.transation.model.fruit;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/28.
 */
public interface demoService {
    public int insert(fruit fruit);

    public int delete(fruit fruit);

    public List<fruit> select(fruit fruit);

    public int updata(Map map);

}
