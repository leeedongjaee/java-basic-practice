import java.util.*;
public class HashTable{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		Map<String,String>ht=new Hashtable();
		System.out.println("공백으로 분리된 이름과 전화번호 4개를 입력하십시오.");
		for(int i=0; i<4;i++) {
			System.out.println("이름, 전화번호:");
			ht.put(sc.next(),sc.next());
		}
		System.out.println("전화번호를 검색할 이름을 입력하십시오.");
		String a=sc.next();
		System.out.println(a+"의 전화번호는 "+ht.get(a)+"입니다.");
	}
}
