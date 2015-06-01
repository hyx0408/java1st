package day01_01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.junit.Test;

/*
 *  
 */
public class HelloWorld<T> implements Iterable<String> {
	
	private T i;
	private String name;
	public int old;
	
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>(){
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
			public String next() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

//	@Test
//	public void fun() {
//		// TODO Auto-generated method stub
//		System.out.println("你好");
//		InputStream is = System.in;
//		byte[] b = new byte[1024];
//		int len;
//		try {
//			while (true) {
//				len = is.read(b);
//				if ("over\r\n".equals(new String(b, 0, len)))
//					break;
//				else
//					System.out.println(new String(b, 0, len));
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
	public static void main(String[] args){
		new HelloWorld<Integer>().show("好");
	}
	public static <T> void show(T t){
		System.out.println(t);
	}

}

//class test {
//	@Test
//	public static void main(String[] args){
//		new HelloWorld<Integer>().show("好");
//	}
//}