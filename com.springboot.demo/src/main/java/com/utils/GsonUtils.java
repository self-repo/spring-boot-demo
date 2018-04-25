package com.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * 
 * @author david03.wang
 *
 */
public class GsonUtils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5659482931723571647L;

	public static Gson gson = new Gson();

	public static <T> String toJson(T o) {
		return gson.toJson(o);
	}

	public static <T> List<T> fromJsonArray(String json, Class<T> clazz) {
		JsonParser parser = new JsonParser();
		List<T> result = new ArrayList<T>();
		JsonArray jsAr = parser.parse(json).getAsJsonArray();

		for (JsonElement jsIt : jsAr) {
			T obj = gson.fromJson(jsIt, clazz);
			result.add(obj);
		}
		return result;
	}

	public static <T> T fromJson(String json, Class<T> clazz) {
		return gson.fromJson(json, clazz);
	}

}