package cn.com.ssdut.forum.service.impl;

import java.util.HashMap;
import java.util.Map;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.ssdut.forum.dao.SimpleDao;
import cn.com.ssdut.forum.service.UserService;

@Transactional
@Service("UserService")
public class UserServiceImpl implements UserService{
	
	private static final String TABLE = "tp_users";

	@Autowired
	private @Setter
	SimpleDao topicSimpleDao;
	public SimpleDao topicSimpleDao(){
		return topicSimpleDao;
	}
	public void setUserDao(SimpleDao topicSimpleDao){
		this.topicSimpleDao = topicSimpleDao;
	}
	@Override
	public Map<String, Object> getUserById(String userID) {
		// TODO Auto-generated method stub
		Map<String, Object> conds = new HashMap<String, Object>();
		conds.put("userId", userId);
		return topicSimpleDao.retrieve(TABLE, conds);
	}
	@Override
	public Map<String, Object> getUserByName(String userName) {
		// TODO Auto-generated method stub
		Map<String, Object> conds = new HashMap<String,Object>();
		conds.put("userName", userName);
		return topicSimpleDao.retrieve(TABLE, conds);
		
	}
	@Override
	public void updateUser(Map<String, Object> user) {
		// TODO Auto-generated method stub
		Map<String, Object> conds = new HashMap<String,Object>();
		conds.put("userName", user.get("userName"));
		conds.put("userId", user.get("userId"));
		topicSimpleDao.update(TABLE, user, conds);
	}
	@Override
	public void deleteUser(Map<String, Object> user) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void addUser(Map<String, Object> user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean hasLoginName(String userId) {
		// TODO Auto-generated method stub
		return false;
	}
}
