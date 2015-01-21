package cn.com.ssdut.forum.service;

import java.util.Map;

import org.springframework.stereotype.Service;




@Service
public interface UserService {
	
	public Map<String, Object> getUserById(String userId);
	
	public Map<String, Object> getUserByName(String userName);
	
	public void updateUser(Map<String, Object> user);
	
	public void deleteUser(Map<String, Object> user);
	
	public void addUser(Map<String, Object> user);
	
	public boolean hasLoginName(String userId);
}
