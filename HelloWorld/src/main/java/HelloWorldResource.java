import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.test.app.model.Response;

@Path("/echo")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

  @GET
  public String echo(String name) {
    return name;
  }
}
