package cxfdemo;

import javax.jws.WebService;

@WebService
public interface CXFDemo {
     public String sayHello(String text);
}