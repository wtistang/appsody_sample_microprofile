package dev.appsody.starter;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/hello")
public class StarterResource {
    @GET
    public String getRequest() {
        return "Hello World Demo";
    }
}
