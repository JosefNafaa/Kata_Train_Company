package com.example.kataBnp.journey;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.example.kataBnp.pojo.TapsPojo;
import com.example.kataBnp.util.Json;
import com.fasterxml.jackson.databind.JsonNode;

public class CandidateInputPojo {

	private static TapsPojo taps;
	static {
		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get("D:\\Cours\\KATA\\CandidateInputExample.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			JsonNode node = Json.parse(text);
			taps = Json.AfromJson(node, TapsPojo.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public TapsPojo getTaps() {
		return taps;
	}

	public void setTaps(TapsPojo taps) {
		this.taps = taps;
	}

}
