package com.hxzy.mapper;

import java.util.List;

import com.hxzy.entity.Orders;

public interface OrdersMapper extends CommonMapper<Orders> {
	/**
	 * ��ѯ���ж�����Ϣ
	 * @return
	 */
	public List<Orders> queryAll();
	public List<Orders> queryAllLazy();
	
	/**
	 * �����û�id��ѯ�û��Ķ���������ϸ
	 * @return
	 */
	public List<Orders> queryDetailByuserId(Integer userId);
	
}