package CH12.collection;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.text.html.ListView;

public class TotalSales {
  public static void main(String[] args) {
    /* 1. �޴� ��ü�� �����ϼ���.  */
    Menu kimbob = new Menu("���", 2000, 57);
    Menu dongas = new Menu("������", 6000, 29);
    Menu nangmyun = new Menu("�ø�", 5000, 34);
    /* 2. ����� ��ü�� �޴��� �߰��ϼ���.  */
    Store st = new Store(); 
    	st.add(nangmyun);
    	st.add(dongas);
    	st.add(kimbob);
    /* 3. �Ϸ� �� ������ ����ϼ���. */
    	System.out.printf("�Ϸ����  %d ��", st.totalSales());
  }
}

class Store {
  private ArrayList<Menu> list;
  
  public Store() {
    this.list = new ArrayList<Menu>();
  }
  
  public void add(Menu menu) {
    list.add(menu);
  }
  
  /* 4. �� ����� ��� �޼ҵ带 ���弼��. */
  public int totalSales() {
	  int total = 0;
	  for(int i=0; i<list.size(); i++) {
		  Menu temp = list.get(i);
		  total += temp.getPrice() * temp.getCount();
	  }
    return total;
  }
}

class Menu {
  private String name; // �޴���
  private int price;   // ����
  private int count;   // �Ϸ� �Ǹŷ�
  
  public Menu(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}
    
  /* 5. price�� ���͸� ���弼��. */
  
  /* 6. count�� ���͸� ���弼��. */
}