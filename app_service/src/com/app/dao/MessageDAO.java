package com.app.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.MessageBean;
import com.app.entity.UserInfo;

public interface MessageDAO {
	/**
	 * ����accid��ȡ��Ϣ
	 * @param accid
	 * @return
	 */
	public List<MessageBean> getMsg(String accid);
}