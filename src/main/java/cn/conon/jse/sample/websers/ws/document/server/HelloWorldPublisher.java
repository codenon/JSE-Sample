package cn.conon.jse.sample.websers.ws.document.server;
import javax.xml.ws.Endpoint;
//Endpoint publisher  
public class HelloWorldPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImpl());
	}
}