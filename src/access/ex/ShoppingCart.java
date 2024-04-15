package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    
    public void addItem(Item item){
        if(isCartValid()){
            System.out.println("장바구니는 최대 10개까지 담을 수 있습니다.");
            return;
        }
        items.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(Item i : items){
            System.out.println("상품명: " + i.getName() + ", 합계: " + i.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private boolean isCartValid(){
        return items.size() >= 10;
    } 

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
