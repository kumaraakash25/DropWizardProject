import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/getMessage")
public class MainResource {

    @GET
    public String getMessage1(){
        return "Good Evening Aakash";
    }
}
