package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/json/service")
public class jsonservice
{
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public product getApplication()
	{
		product pr=new product();
		pr.setName("Apple");
		pr.setId(1);
		return pr;
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public void postApplication(product pr)
	{
		System.out.println(pr.getName()+""+pr.getId());
	}
}
