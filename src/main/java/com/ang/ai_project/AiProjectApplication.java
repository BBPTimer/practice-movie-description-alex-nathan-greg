package com.ang.ai_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import org.apache.http.HttpException;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class AiProjectApplication {

	public static void main(String[] args) throws HttpException, IOException {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a movie title: ");
        String title = scanner.nextLine();

        System.out.println("Enter a rating: ");
        int rating = scanner.nextInt();

        Movie movie = new Movie(title, rating);

        GenerateContentResponse description = client.models.generateContent("gemini-2.0-flash-001", "Generate a description for the movie " + movie.getTitle(), null);

        movie.setDescription(description.text());

        GenerateContentResponse boxOffice = client.models.generateContent("gemini-2.0-flash-001", "How much did the movie " + movie.getTitle() + " generate at the box office?", null);

        movie.setBoxOffice(boxOffice.text());

        System.out.println(movie);
    }

}
