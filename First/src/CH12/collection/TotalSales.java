package CH12.collection;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.text.html.ListView;

public class TotalSales {
  public static void main(String[] args) {
    /* 1. 메뉴 객체를 생성하세요.  */
    Menu kimbob = new Menu("김밥", 2000, 57);
    Menu dongas = new Menu("돈가스", 6000, 29);
    Menu nangmyun = new Menu("냉면", 5000, 34);
    /* 2. 스토어 객체에 메뉴를 추가하세요.  */
    Store st = new Store(); 
    	st.add(nangmyun);
    	st.add(dongas);
    	st.add(kimbob);
    /* 3. 하루 총 매출을 계산하세요. */
    	System.out.printf("하루매출  %d 원", st.totalSales());
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
  
  /* 4. 총 매출액 계산 메소드를 만드세요. */
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
  private String name; // 메뉴명
  private int price;   // 가격
  private int count;   // 하루 판매량
  
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
    
  /* 5. price의 게터를 만드세요. */
  
  /* 6. count의 게터를 만드세요. */
}