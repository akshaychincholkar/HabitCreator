package com.game.habitCreator.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import com.game.habitCreator.beans.Habit;

public class ClientController {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/habitcreatordb";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	static Connection conn = null;

	static {
		// STEP 2: Register JDBC driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean insertHabit(Habit habitBean) {
		boolean returnValue = false;
		String query = " insert into habits (name,daysOfChallenge,daysCompleted,duration,remarks,startDate,endDate,sequence,time)"
				+ " values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);
//			preparedStatement.setInt(1, habitBean.getSerialNumber());
			preparedStatement.setString(1, habitBean.getName());
			preparedStatement.setInt(2, habitBean.getDaysOfChallenge());
			preparedStatement.setInt(3, habitBean.getDaysCompleted());
			preparedStatement.setInt(4, habitBean.getDuration());
			preparedStatement.setString(5, habitBean.getRemarks());
			preparedStatement.setString(6, habitBean.getStartDate().toString());
			preparedStatement.setString(7, habitBean.getEndDate().toString());
			preparedStatement.setString(8, habitBean.getSequence());
			preparedStatement.setString(9, habitBean.getTime().toString());
			
			preparedStatement.execute();
			returnValue = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return returnValue;
	}
	public ArrayList<Habit> getAllHabits(){
		ArrayList<Habit> returningList = new ArrayList<Habit>();
		String query = "select * from habits";
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet =  statement.executeQuery(query);
			while(resultSet.next()){
				Habit localBean = new Habit();
				localBean.setSerialNumber(resultSet.getInt(1));
				localBean.setName(resultSet.getString(2));
				localBean.setDaysOfChallenge(resultSet.getInt(3));
				localBean.setDaysCompleted(resultSet.getInt(4));
				localBean.setDuration(resultSet.getInt(5));
				localBean.setRemarks(resultSet.getString(6));
				localBean.setStartDate(LocalDate.parse(resultSet.getDate(7).toString()));
				localBean.setEndDate(LocalDate.parse(resultSet.getDate(8).toString()));
				localBean.setSequence(resultSet.getString(9));
				localBean.setTime(LocalTime.parse(resultSet.getString(10).toString()));
				returningList.add(localBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returningList;
	}
}
