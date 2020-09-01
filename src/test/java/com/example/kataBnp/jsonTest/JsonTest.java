package com.example.kataBnp.jsonTest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.example.kataBnp.pojo.TapPojo;
import com.example.kataBnp.pojo.TapsPojo;
import com.example.kataBnp.util.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonTest {
	
	@Test
	void ReedJson() throws IOException {
		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get("D:\\\\Cours\\\\KATA\\\\CandidateInputExample.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JsonNode node = Json.parse(text);
		TapsPojo pojo = Json.AfromJson(node, TapsPojo.class);
		TapPojo tap = new TapPojo();
		tap = pojo.getTaps().get(0);
		assertEquals(tap.getStation(), "A");

	}
}
