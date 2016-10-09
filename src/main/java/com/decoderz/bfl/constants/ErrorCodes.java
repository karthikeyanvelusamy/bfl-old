package com.decoderz.bfl.constants;

public enum ErrorCodes {

	USER_DUPLICATE_ENTRY("User Already Exists", "DFL_DB_DUPLICATE", 500),
	INTERNAL_SERVER_ERROR("Internal Server Error","DFL_UNEXPECTED_ERROR",500);

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDflErrorCode() {
		return dflErrorCode;
	}

	public void setDflErrorCode(String dflErrorCode) {
		this.dflErrorCode = dflErrorCode;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	private String message;
	private String dflErrorCode;
	private int httpStatusCode;

	private ErrorCodes(String message, String dflErrorCode, int httpStatusCode) {
		this.message = message;
		this.dflErrorCode = dflErrorCode;
		this.httpStatusCode = httpStatusCode;
	}

}
