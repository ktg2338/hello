package CH12.collection;

import java.util.TreeSet;

public class SetExample {
  public static void main(String[] args) {
    /* 1. String ������ ���� Ʈ���� ��ü�� ���弼��. */
    TreeSet<String> names = new TreeSet<>();
    
    // ��ü �߰�
    names.add("Daniel");
    names.add("Brian");
    names.add("Eugene");
    names.add("Adam");
    names.add("Cate");
    
    // ���� ���
    System.out.printf("names.size() -> %d\n", 5/* 2. ũ�⸦ ���ϼ���. */);
    System.out.printf("names.first() -> %s\n", "Adam"/* 3. ù ��Ҹ� ��������. */);
    System.out.printf("names.last() -> %s\n", "Eugene"/* 4. �� ��Ҹ� ���ϼ���. */);
    
    // Set�� ��� ��� ���
    System.out.println("== for each ���� ��� ==");
    for (String str : names) {
      System.out.println(str);
    }
  }
}