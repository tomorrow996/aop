package service;

/**
 * �ӿڵ�ʵ��
 * @author lzq
 *
 */
public class AServiceImpl implements AService {
	public void cool() {
		System.out.println("你好美");
	}
	public void cool(String name) {
		System.out.println("你好："+name+"，你好美！");
	}
}
