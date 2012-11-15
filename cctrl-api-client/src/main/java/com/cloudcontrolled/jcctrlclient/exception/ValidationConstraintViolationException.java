/*
 * Copyright 2012 Denis Neuling 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.cloudcontrolled.jcctrlclient.exception;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

public class ValidationConstraintViolationException extends CloudControlClientException {
	private static final long serialVersionUID = 8653296771499098292L;

	private static String lineSeparator = System.getProperty("line.separator");
	private List<ConstraintViolation> constraintViolations = new LinkedList<ConstraintViolation>();

	public ValidationConstraintViolationException(Throwable th) {
		super(th);
	}

	public ValidationConstraintViolationException(List<ConstraintViolation> violations) {
		super(inquireMessage(violations));
		this.constraintViolations = violations;
	}

	public ValidationConstraintViolationException(String pre, List<ConstraintViolation> violations) {
		super(concat(pre, inquireMessage(violations)));
		this.constraintViolations = violations;
	}

	public List<ConstraintViolation> getConstraintViolations() {
		return constraintViolations;
	}

	private static String inquireMessage(List<ConstraintViolation> violations) {
		String message = null;
		for (ConstraintViolation constraintViolation : violations) {
			message = concat(message, constraintViolation.toString());
		}
		return message;
	}

	private static String concat(String a, String b) {
		return (a != null && !a.isEmpty() ? a + lineSeparator : "") + b;
	}

	public static class ConstraintViolation {
		private String hint;
		private Field field;

		private ConstraintViolation(String hint, Field field) {
			this.hint = hint;
			this.field = field;
		}

		public static ConstraintViolation newConstraintViolation(String hint, Field field) {
			return new ConstraintViolation(hint, field);
		}

		@Override
		public String toString() {
			return "\t" + hint + " " + field;
		}
	}
}
