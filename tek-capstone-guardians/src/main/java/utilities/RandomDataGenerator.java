package utilities;

import java.security.SecureRandom;
import java.util.Random;

public class RandomDataGenerator {

	// Random Generators
	
	//Random Card Number 
	public static String generateRandomCardNumber() {
		String cardNumber = "";
		for (int i = 0; i < 16; i++) {
			cardNumber += (int) (Math.random() * 10);
		}
		return cardNumber;
	}
	//Random ZIP Code
	public static String generateRandomZIPCode() {
		String zipCode = "";
		for (int i = 1; i <= 5; i++) {
			zipCode += (int) (Math.random() * 10);
		}
		return zipCode;
	}

	// Random Email Generator
	public static String generateRandomEmail() {
		String[] domains = { "gmail.com", "yahoo.com", "outlook.com", "example.com" };
		String[] prefixes = { "user", "test", "random", "email", "customer" };
		String[] suffixes = { "123", "456", "789", "abc", "xyz" };

		Random random = new Random();
		String randomPrefix = prefixes[random.nextInt(prefixes.length)];
		String randomSuffix = suffixes[random.nextInt(suffixes.length)];
		String randomDomain = domains[random.nextInt(domains.length)];

		return randomPrefix + "." + randomSuffix + "@" + randomDomain;
	}

	// Random Password Generator
	public static String generateRandomPassword(int length) {
		String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
		String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numericChars = "0123456789";
		String specialChars = "!@#$%^&*";

		String allChars = lowercaseChars + uppercaseChars + numericChars + specialChars;

		Random random = new SecureRandom();
		StringBuilder password = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(allChars.length());
			char randomChar = allChars.charAt(randomIndex);
			password.append(randomChar);
		}

		return password.toString();
	}

	// random phone number
	public static String generateRandomPhoneNumber() {
		Random random = new Random();

		// Generate random area code (3 digits)
		int areaCode = random.nextInt(900) + 100;

		// Generate random exchange code (3 digits)
		int exchangeCode = random.nextInt(900) + 100;

		// Generate random subscriber number (4 digits)
		int subscriberNumber = random.nextInt(9000) + 1000;

		return String.format("(%03d) %03d-%04d", areaCode, exchangeCode, subscriberNumber);
	}

	// random name
	public static String generateRandomName() {
		String[] firstNames = { "John", "Emma", "Michael", "Olivia", "Hamid", "Amine", "Rashid", "Zack", "William",
				"Ava", "James", "Sophia", "Ethan", "Isabella", "Jamal", "Luke", "Wassim", "Ahmed", "Homayoon", "Shaiq",
				"Yusuf" };

		String[] lastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
				"Taylor", "Mohamed", "Martinez", "Dawit", "Varga", "Vegas", };

		Random random = new Random();
		String randomFirstName = firstNames[random.nextInt(firstNames.length)];
		String randomLastName = lastNames[random.nextInt(lastNames.length)];

		return randomFirstName + " " + randomLastName;
	}

}
