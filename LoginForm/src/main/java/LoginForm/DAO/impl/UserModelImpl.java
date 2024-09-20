package LoginForm.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Message;

import java.sql.*;
import LoginForm.DAO.IUserModel;
import LoginForm.Models.UserModel;
import LoginForm.Configs.employeesDBConnect;
import java.text.MessageFormat;

public class UserModelImpl implements IUserModel {

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM login";
		List<UserModel> list = new ArrayList<UserModel>();

		try {
			conn = new employeesDBConnect().connect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new UserModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
			}
			conn.close();
			return list;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserModel findByID(int ID) {
		String sql = "SELECT * FROM login WHERE ID = " + ID;
		UserModel find = null;

		try {
			conn = new employeesDBConnect().connect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				find = new UserModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10));
			}
			if (find == null)
				return null;
			else
				return find;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(UserModel user) {
		String sql = " insert into login (Username, Password, Avatar, ID, First_name, Last_name, Email, Phone_number, Role_id, my_date)"
			    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			conn = new employeesDBConnect().connect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getAvatar());
			ps.setInt(4, user.getID());
			ps.setString(5, user.getFirst_name());
			ps.setString(6, user.getLast_name());
			ps.setString(7, user.getEmail());
			ps.setInt(8, user.getPhone_number());
			ps.setInt(9, user.getRole_id());
			ps.setString(10, user.getMy_Date());
			
			ps.execute();
			conn.close();
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UserModelImpl a = new UserModelImpl();
		UserModel d = new UserModel("asustek", "Tufa15", "aura.jpg", 2332, "FPT", "SHOP", "fpt@gmail.com", 808, 3001, "2024-09-19");
		List<UserModel> b = a.findAll();
		for(UserModel cc : b) {
			cc.toString();
		}
		
		System.out.println("asdf1111111");
	}

}
