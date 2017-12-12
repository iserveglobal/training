package com.basaki.example.docker.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * {@code ErrorInfo} represents an error response object which is exposed to
 * the external client in a human readbable form.
 * <p/>
 *
 * @author Indra Basak
 * @since 3/18/17
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorInfo {

    private String path;

    private int code;

    private String type;

    private String message;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}