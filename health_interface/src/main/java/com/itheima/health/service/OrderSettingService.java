package com.itheima.health.service;

import com.itheima.health.pojo.OrderSetting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface OrderSettingService {


    void add(ArrayList<OrderSetting> orderSettingList);

    List<Map> getOrderSettingByMonth(String date);

    void editNumberByDate(OrderSetting orderSetting);
}
