package com.nt.rest.errclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorType {
	private String message;
	private String code;
	private String error;
	private String classType;
	private String idReq;

}
