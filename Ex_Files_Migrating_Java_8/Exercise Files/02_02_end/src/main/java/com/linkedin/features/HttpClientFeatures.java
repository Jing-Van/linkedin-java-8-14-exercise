package com.linkedin.features;

import java.io.IOException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientFeatures {

	public static int sendGet() throws IOException, Exception {

		var client = HttpClient.newHttpClient();
		var url = new URL("https://www.linkedin.com/learning/");
		var request = HttpRequest.newBuilder()
				.GET().uri(url.toURI()).build();
		
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response);
		return response.statusCode();
	}
	
}
