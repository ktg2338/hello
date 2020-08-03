package ch09;

import java.util.ArrayList;

public class TotalChickenPrice {
  public static void main(String[] args) {
    // ArrayList ����
    ArrayList<Chicken> order = new ArrayList<Chicken>();
    
    /* 1. �ֹ��� ġŲ�� ArrayList�� �߰��ϼ���. */ 
    order.add(new Chicken("�Ķ��̵�", 9900));
    order.add(new Chicken("�ν�Ʈ", 9900));
    order.add(new Chicken("���", 10900));
    order.add(new Chicken("����", 10900));
    order.add(new Chicken("�Ĵ�", 12900));
    order.add(new Chicken("����", 13900));
  
    /* 2. ArrayList�� ��ȸ�Ͽ� ������ ���ϼ���. */
    int sum = 0;
    for(int i = 0; i<order.size(); i++) {
    	sum += order.get(i).getPrice();
    }
    // ��� ���
    System.out.printf("����: %d��\n", sum);
}
}

class Chicken {
  private String name;
  private int price;
  
  public Chicken(String name, int price) {
    this.name = name;
    this.price = price;
  }
  
  public int getPrice() {
    return price;
  }
}