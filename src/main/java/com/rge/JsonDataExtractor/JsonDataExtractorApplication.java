package com.rge.JsonDataExtractor;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.opencsv.CSVWriter;

import com.rge.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonDataExtractorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDataExtractorApplication.class, args);
		ObjectMapper objMapper = new ObjectMapper();
		 
		try(CSVWriter csvWriter = new CSVWriter(new FileWriter(args[1]));){
			// Parse the json file to create POJO
			Root root = objMapper.readValue(Paths.get(args[0]).toFile(), Root.class);

			List<String[]> outputList = new ArrayList<>();
			jsonList.add(new String[]{"ID", "TYPE", "NAME", "BATTER", "TOPPING"});

			// Loop through POJO to flatten json 
			root.getItems().getItem().forEach(
				(item)-> {
					item.getBatters().getBatter().forEach((batter)->{
						item.getTopping().forEach((topping)->{
							outputList.add(new String[]{item.getId(), item.getType(), item.getName(),
								batter.getType(), topping.getType()});
						});
					});
				}
			);

			csvWriter.writeAll(jsonList);

		}catch(Exception ex){
			System.out.println("Error Occurred while processing Json file:");
			ex.printStackTrace();
		}
	}
}
