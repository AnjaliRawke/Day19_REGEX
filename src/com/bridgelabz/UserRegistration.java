package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher("Anjali");
		if (matcher.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
}
