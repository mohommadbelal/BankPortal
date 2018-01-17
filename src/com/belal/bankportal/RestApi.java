package com.belal.bankportal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bankportal")
public class RestApi {

  @GET
  @Path("/banks/ifsc/{ifsc_code}")
  @Produces(MediaType.APPLICATION_JSON)
  public String getBankDetailsByIFSC(@PathParam("ifsc_code") String ifscCode) {
	  return "bank";
  }

  @GET
  @Path("/banks/{bank_name}/{city}")
  @Produces(MediaType.APPLICATION_JSON)
  public String getBanksInCity(@PathParam("bank_name") String bankName, @PathParam("city") String city) {
	  return bankName+":"+city;
  }

}