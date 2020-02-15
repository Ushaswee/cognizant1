package jbr.springmvc.dao;

import java.util.List;

import jbr.springmvc.pojos.*;
	public interface UserService {
	  void register(User user);
	  List<User> getAllusers();
	  User validateUser(Login login);
	  
	}