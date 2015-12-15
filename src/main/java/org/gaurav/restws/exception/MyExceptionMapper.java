package org.gaurav.restws.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.gaurav.restws.model.MyErrDisplay;

@Provider
public class MyExceptionMapper implements ExceptionMapper<MyException>{


	@Override
	public Response toResponse(MyException arg0) {
		// TODO Auto-generated method stub
		MyErrDisplay err = new MyErrDisplay(arg0.getErrCode(), arg0.getMessage());
		return Response.status(arg0.getErrCode()).entity(err).build();
	}

}
