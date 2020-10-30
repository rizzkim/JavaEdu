package javaapp1030;

import java.net.InetAddress;

public class IPCheck {
	public static void main(String[] args) {
	//    현재 컴퓨터의 ip와 이름을 확인
	    try {
	        InetAddress localHost = InetAddress.getLocalHost();
	        System.out.printf("이름: %s\n", localHost.getHostName());
	        System.out.printf("IP: %s\n", localHost.getHostAddress());
	        
	        InetAddress daum = InetAddress.getByName("www.daum.net");
	        System.out.printf("이름: %s\n", daum.getHostName());
	        System.out.printf("IP: %s\n", daum.getHostAddress());

	    } catch(Exception e) {
	        System.out.printf("%s\n", e.getMessage());
	        e.printStackTrace();
	    }
	}
}