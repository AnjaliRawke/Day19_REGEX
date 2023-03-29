package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher("Anjali");
		if (matcher.matches())
			System.out.println("valid first name");
		else
			System.out.println("Invalid first name");

		Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher1 = pattern.matcher("Rawke");
		if (matcher.matches())
			System.out.println("valid lastname");
		else
			System.out.println("Invalid lastname");

		Pattern pattern2 = Pattern.compile("^( [a-z]{3} [.] [a-z]{3}  @ ([a-z]{2} [.] [a-z]{2}) [.][a-z]{2,})");
		Matcher matcher2 = pattern.matcher("abc.xyz@bl.co.in");
		if (matcher.matches())
			System.out.println("valid email");
		else
			System.out.println("Invalid email");

		Pattern pattern3 = Pattern.compile("^(\\+?\\d{1,3})\s\\d{10}$");
		Matcher matcher3 = pattern.matcher("+91 7058162286");
		if (matcher.matches())
			System.out.println("valid phone number");
		else
			System.out.println("Invalid phone number");

		Pattern pattern4 = Pattern.compile("^[A-Za-z]{8,}$");
		Matcher matcher4 = pattern.matcher("myPassword");
		if (matcher.matches())
			System.out.println("valid password rule1");//rule1-minimum 8 characters
		else
			System.out.println("Invalid password rule1");

	}
}
