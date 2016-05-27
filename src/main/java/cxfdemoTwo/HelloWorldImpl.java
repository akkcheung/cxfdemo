package cxfdemoTwo;
 
import java.util.LinkedHashMap;
import java.util.Map;
 
import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;

@InInterceptors(
	interceptors = {"cxfdemo.BasicAuthAuthorizationInterceptor"}) 
/*
@WebService(endpointInterface = "cxfdemoTwo.HelloWorld",
            serviceName = "HelloWorld")
*/
@WebService()
public class HelloWorldImpl implements HelloWorld {
    Map<Integer, User> users = new LinkedHashMap<Integer, User>();
 
 
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
 
    public String sayHiToUser(User user) {
        System.out.println("sayHiToUser called");
        users.put(users.size() + 1, user);
        return "Hello "  + user.getName();
    }
 
    public Map<Integer, User> getUsers() {
        System.out.println("getUsers called");
        return users;
    }
 
}
