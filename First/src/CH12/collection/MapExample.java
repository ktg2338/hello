package CH12.collection;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
  public static void main(String[] args) {
    /* 1. �̸��� Ű��, �̸����� ������ ���� �ؽø��� ���弼��. */
    HashMap<String,String> emails = new HashMap<String,String>();
    
    /* 2. �����͸� �����ϼ��� */
    emails.put("hongpark", "segong@cloudstudying.kr");
    emails.put("nari", "nari@cloudstudying.kr");
    emails.put("junge", "junge@cloudstudying.kr");
    
    /* 3. �ؽø��� ũ�⸦ ����ϼ���. */
    System.out.printf("emails.size() -> %d\n", emails.get(emails));
    
    // key ��� ���
    System.out.println("\n== key set ==");
    for (String key : emails.keySet()) {
      System.out.println(key);
    }
    
    // value ��� ���
    System.out.println("\n== values ==");
    for (String val : emails.values()) {
      System.out.println(val);
    }
  }
}