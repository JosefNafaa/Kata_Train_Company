package com.example.kataBnp.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Json {

	private static ObjectMapper objectMapper = getDefaultObjectMaper();

	private static ObjectMapper getDefaultObjectMaper() {
		ObjectMapper defaultObjectMapper = new ObjectMapper();
		defaultObjectMapper.registerModule(new JavaTimeModule());
		defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return defaultObjectMapper;
	}

	public static JsonNode parse(String src) throws IOException {
		return objectMapper.readTree(src);
	}

	public static <A> A AfromJson(JsonNode node, Class<A> clazz) throws JsonProcessingException {

		return objectMapper.treeToValue(node, clazz);
	}

	public static JsonNode toJson(Object a) {
		return objectMapper.valueToTree(a);
	}

	public static String stingify(JsonNode node) throws IOException {

		// **ObjectWriter objectWriter = objectMapper.writer();

		return generateString(node, false);
	}

	public static String prettyPrint(JsonNode node) throws IOException {

		/*
		 * ObjectWriter objectWriter = objectMapper.writer(); objectWriter =
		 * objectWriter.with(SerializationFeature.INDENT_OUTPUT);
		 */

		return generateString(node, true);
	}

	public static String generateString(JsonNode node, boolean pretty) throws IOException {
		ObjectWriter objectWriter = objectMapper.writer();
		if (pretty)
			objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);

		return objectWriter.writeValueAsString(node);
	}
}
