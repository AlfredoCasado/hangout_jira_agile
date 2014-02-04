package resources

import javax.ws.rs.*

@Path("/hello-world")
public class HelloWorld {
   
    @GET
    def sayHello() {
        return "hello world"
    }

    
}