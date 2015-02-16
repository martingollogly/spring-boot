package lockc.springboot.examples.swagger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="swagger")
@Api(basePath="swagger", value="swagger", description="Example Sawgger API documentation")
public class TheController
{
 
    @ApiOperation(
            value="Get the thingy", 
            notes="An operation to return the thingy that you request", 
            nickname="getTheThingy",
            response=String.class)
    @RequestMapping(method = RequestMethod.GET, value="thing", produces= {"text/plain"})
    public String getThing() {
        return "the thing";
    }
    
    
}
