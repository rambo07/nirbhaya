package org.nirbhaya.trending;
import java.io.IOException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.nirbhaya.trending.MongoQuery;

@Path("/category-sewage1")
public class CategoryTrendsSewageMongo {

	@GET
	@Produces( MediaType.APPLICATION_JSON )

	public String sayPlainTextHello(@QueryParam("callback") String callback)
	{
		System.out.println("hello");
		try {
			
			if(callback!=null){
					return callback+"("+MongoQuery.getCatTypes("type","sewage problems")+")";
			}
			else{
				
					return MongoQuery.getCatTypes("type","sewage problems");
			}
			//return callback+"("+MongoQuery.getLocationProblem(query)+")";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// This method is called if request is HTML


}
