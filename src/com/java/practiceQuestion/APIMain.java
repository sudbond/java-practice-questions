package com.java.practiceQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class APIMain {
	// =================================================================================================================//
	// method to search train using train number
	public static void searchTrain() {
		// getting bufferedReader instance to take input from user
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// printing on console
		System.out.println("Enter the train number");
		// taking input from user
		int trainNumber = 0;
		try {
			trainNumber = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// building the complete url by adding train number with it.
		String urlString = "https://irctc1.p.rapidapi.com/api/v1/searchTrain?query=" + trainNumber;
		// Http Request : The request sent by the computer to a web server, contains all
		// sorts of potentially interesting information
		// The HTTP request method indicates the method to be performed on the resource
		// identified by the Requested URI (Uniform Resource Identifier).
		// build : Builds and returns an HttpRequest.
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlString))
				.header("X-RapidAPI-Key", "e8094312d4msh5b6888fbfd812d5p1cb25djsn92dd6f76700c")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		// creating and intitalising an variable of HttpResponse type
		HttpResponse<String> response = null;
		// try-catch block to catch the exception
		try {
			// HttpClient is used to send requests and retrieve their responses
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			// catch block to catch the exception if exists
		} catch (IOException | InterruptedException e) {
			// This method prints a stack trace for this Throwable object on the error
			// output stream that is the value of the field System.err. The first line
			// ofoutput contains the result of the toString() method forthis object.
			// Remaining lines represent data previously recorded bythe method
			// fillInStackTrace().
			e.printStackTrace();
		}
		// printing the response on console
		System.out.println(response.body());
	}
	// =================================================================================================================//

	// method to search station using initials of any stations of Indian railways
	public static void searchStation() {
		// getting the instance of buffered reader to take input from user
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// printing on the console
		System.out.println("Enter the first initials of any valid Indian Railways station name");
		// variable to store station name
		String stationName = null;
		// try block
		try {
			// taking input from user;
			stationName = bufferedReader.readLine().toUpperCase();
			// catch block
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// building the complete url by adding train number with it.
		String urlString = "https://irctc1.p.rapidapi.com/api/v1/searchTrain?query=" + stationName;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlString))
				.header("X-RapidAPI-Key", "e8094312d4msh5b6888fbfd812d5p1cb25djsn92dd6f76700c")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(response.body());
	}
	// =================================================================================================================//

	// method to find all trains between two stations
	public static void trainsBetweenStations() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of boarding station");
		String boardingStation = null;
		try {
			boardingStation = bufferedReader.readLine();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		System.out.println("Enter the name of destination station");
		String destStation = null;
		try {
			destStation = bufferedReader.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// building the complete url by adding train number with it
		String urlString = "https://irctc1.p.rapidapi.com/api/v2/trainBetweenStations?fromStationCode="
				+ boardingStation + "&toStationCode=" + destStation;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlString))
				.header("X-RapidAPI-Key", "e8094312d4msh5b6888fbfd812d5p1cb25djsn92dd6f76700c")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(response.body());
	}

	// =================================================================================================================//
	// method to find the train live status
	public static void trainLiveStatus() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the train number");
		int trainNumber = 0;
		try {
			trainNumber = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException | IOException e1) {

			e1.printStackTrace();
		}
		// building the complete url by adding train number with it.
		String urlString = "https://irctc1.p.rapidapi.com/api/v1/searchTrain?query=" + trainNumber + "&startDay=1";
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlString))
				.header("X-RapidAPI-Key", "e8094312d4msh5b6888fbfd812d5p1cb25djsn92dd6f76700c")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(response.body());
	}
	// =================================================================================================================//

	// method to get the PNR status of any train using PNR number
	public static void getPNRStatus() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the PNR Number");
		String pnrString = null;
		try {
			pnrString = bufferedReader.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String urlString = "https://irctc1.p.rapidapi.com/api/v3/getPNRStatus?pnrNumber=" + pnrString;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlString))
				.header("X-RapidAPI-Key", "e8094312d4msh5b6888fbfd812d5p1cb25djsn92dd6f76700c")
				.header("X-RapidAPI-Host", "irctc1.p.rapidapi.com").method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(response.body());
	}

	// =================================================================================================================//
	// driver method
	public static void main(String[] args) throws IOException, InterruptedException {
		// try block
		try (Scanner scanner = new Scanner(System.in)) {
			// printing on the console
			System.out.println("Welcome to Indian Railways");
			System.out.println("1. Press 1 to search the train using train number");
			System.out.println("2. Press 2 to seach stations using initials of station");
			System.out.println("3. Press 3 to get all trains between two stations");
			System.out.println("4. Press 4 to get live running train status");
			System.out.println("5. Press 5 to get PNR status");
			System.out.println("6. Press 6 to exit");
			// infinite loop
			while (true) {
				// taking input from user
				int button = scanner.nextInt();
				switch (button) {
				// withc statement : calling respective methods according to user's input
				case 1: // to search the train using train number
					searchTrain();

					break;
				case 2: // to seach stations using initials of station
					searchStation();

					break;
				case 3: // to get all trains between two stations
					trainsBetweenStations();

					break;
				case 4: // to get live running train status
					trainLiveStatus();

					break;
				case 5: // to get PNR status
					getPNRStatus();

					break;

				case 6: // to exit from the program
					System.out.println("Thankyou for using the app!!!");
					System.exit(button);
					break;
				}

			}
		}
	}

}
