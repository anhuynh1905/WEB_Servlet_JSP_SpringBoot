package LoginForm.Services.impl;

import LoginForm.DAO.IUserModel;
import LoginForm.DAO.impl.UserModelImpl;
import LoginForm.Models.UserModel;
import LoginForm.Services.IUserService;

public class UserServiceImpl implements IUserService {
	IUserModel userDAO = new UserModelImpl();

	@Override
	public UserModel login(String username, String password) {
		// TODO Auto-generated method stub
		UserModel user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassword()))
			return user;
		else
			return null;
	}

	@Override
	public UserModel FindByUserName(String username) {
		// TODO Auto-generated method stub
		return userDAO.findByUsername(username);
	}

	@Override
	public void createAccount(UserModel user) {
		userDAO.insert(user);
	}

}
