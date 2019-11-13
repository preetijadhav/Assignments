package com.exp.report.exceptionhandling;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ExceptionResponse {

	private String errorMessage;
	private String requestedURI;
}
