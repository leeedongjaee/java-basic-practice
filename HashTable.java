import java.util.*;
public class HashTable{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		Map<String,String>ht=new Hashtable();
		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ 4���� �Է��Ͻʽÿ�.");
		for(int i=0; i<4;i++) {
			System.out.println("�̸�, ��ȭ��ȣ:");
			ht.put(sc.next(),sc.next());
		}
		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��Ͻʽÿ�.");
		String a=sc.next();
		System.out.println(a+"�� ��ȭ��ȣ�� "+ht.get(a)+"�Դϴ�.");
	}
}
