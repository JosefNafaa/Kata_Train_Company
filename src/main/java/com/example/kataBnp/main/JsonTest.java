package com.example.kataBnp.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.example.kataBnp.journey.CandidateInputPojo;
import com.example.kataBnp.pojo.TapPojo;
import com.example.kataBnp.pojo.TapsPojo;
import com.example.kataBnp.util.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonTest {

	public static void main(String[] args) throws IOException {

		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get("D:\\Cours\\KATA\\CandidateInputExample.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JsonNode node = Json.parse(text);
		TapsPojo pojo = Json.AfromJson(node, TapsPojo.class);
		/*
		 * System.out.println("Let's read the json file :");
		 * System.out.println("la taille de la liste :"+pojo.getTaps().size()); for
		 * (TapPojo bj : pojo.getTaps()) { System.out.println(bj.getUnixTimestamp());
		 * System.out.println(bj.getCustomerId()); System.out.println(bj.getStation());
		 * }
		 */
		CandidateInputPojo candidateInput = new CandidateInputPojo();
		System.out.println(candidateInput.getTaps().getTaps().size());

	}

}
