package com.cloudcontrolled.api.response.normalize;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class ListWorkerNormalizer extends JSONNormalizer {

	public String normalize(String jsonResponse) throws Exception {
		JSONArray array = new JSONArray(jsonResponse);
		Map<String, JSONArray> layout = new HashMap<String, JSONArray>();
		layout.put("workers", array);
		JSONObject workers = new JSONObject(layout);
		return workers.toString();
	}
}
