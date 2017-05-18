package com.game.habitCreator.client;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import com.game.habitCreator.beans.Habit;
import com.game.habitCreator.controller.ClientController;

/**
 * 
 * @author bittu
 *
 */
public class MainClient {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		boolean doExit = false;
		System.out.println("*************Habit Creator*****************");
		System.out.println("Why do we do what we do? and how to change it?"); 
		while(!doExit){
			System.out.println("---------------------------------------");
			System.out.println("PLEASE SELECT AN APPROPRIATE OPTION FROM THE FOLLOWING");
			System.out.println("1. LIST HABITS");
			System.out.println("2. ADD THE HABIT");
			System.out.println("3. UPDATE HABIT");
			System.out.println("4. EXIT");
			System.out.print("PLEASE ENTER YOUR CHOICE:");
			@SuppressWarnings("resource")
			int option = new Scanner(System.in).nextInt();
			ClientController controller = new ClientController();
			switch(option){
			case 1: ArrayList<Habit> list = controller.getAllHabits();
				for(Habit habit: list){
					System.out.println("Name: "+habit.getName());
				}
			break;
			case 2: Habit bean = new Habit();
					bean.setName("H2");
					bean.setDaysOfChallenge(45);
					bean.setDaysCompleted(0); //this field can be removed as while insertion habit is not started yet 
					bean.setDuration(30);
					bean.setRemarks("Description");
					bean.setStartDate(LocalDate.now());
					bean.setEndDate(LocalDate.now().plusDays(bean.getDaysOfChallenge()));
					bean.setSequence("yes");
					bean.setTime(LocalTime.now());

					if(controller.insertHabit(bean)){
						System.out.println("Success");
					}else{
						System.out.println("Failed");
					}
					break;
			case 3: 
					break;
			case 4:	doExit = true;
					System.out.println("SUCCESSFULLY EXITED");
					System.out.println("************************************");
					break;
			default:System.out.println("@@PLEASE SELECT APPROPRIATE OPTION");
			}
		}
	}

}
