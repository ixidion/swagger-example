package de.bluemx.swagger.impl;

import de.bluemx.swagger.ApiResponseMessage;
import de.bluemx.swagger.HelloApiService;
import de.bluemx.swagger.NotFoundException;
import io.swagger.model.*;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-17T17:42:24.347+02:00")
public class HelloApiServiceImpl extends HelloApiService {
    @Override
    public Response helloUserGet(String user, SecurityContext securityContext) throws NotFoundException {
        String greetUser = String.format("Hello user %s and livecoding.tv!", user);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, greetUser)).build();
    }
}
