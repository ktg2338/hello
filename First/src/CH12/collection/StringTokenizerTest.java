package CH12.collection;

import java.util.StringTokenizer;

public class StringTokenizerTest {
  public static void main(String[] args) {
    // �Է� ���ڿ�
    String str = "ġŲ,����,����,����,�ʹ�,������,������";
    String delim = ",";
    
    /* 1. �����ڸ� ","�� �ϴ�StringTokenizer�� �����ϼ���. */
    StringTokenizer st = new StringTokenizer(str,delim);
    while (st.hasMoreTokens()) {
    /* 2. ��� ��ū�� ����ϼ���. */
    System.out.println(st.nextToken());
  }
}}