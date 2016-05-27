package cxfdemo;
import javax.jws.WebService;

@WebService()
public class CXFDemoImpl implements CXFDemo {

    public String sayHello(String text) {
        return "hello "+ text;
    }

}