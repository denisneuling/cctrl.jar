package com.cloudcontrolled.api.response.normalize;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class WorkerNormalizer extends JSONNormalizer {

	public String normalize(String jsonResponse) throws Exception {
		JSONObject body = new JSONObject(jsonResponse);
		Map<String, JSONObject> layout = new HashMap<String, JSONObject>();
		layout.put("worker", body);
		JSONObject worker = new JSONObject(layout);
		return worker.toString();
	}
}
