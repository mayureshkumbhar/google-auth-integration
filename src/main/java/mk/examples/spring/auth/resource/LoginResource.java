package mk.examples.spring.auth.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginResource {

	//OAuth2Authentication authentication;
	
	@GetMapping(value="/login")
	public String login(@RequestParam("state") String state, @RequestParam("code") String code) {
		System.out.println("Inside login");
		/*LinkedHashMap<String, String> details = (LinkedHashMap<String, String>)authentication.getUserAuthentication().getDetails();
		System.out.println(details);*/
		return "Login Success";
	}
}
