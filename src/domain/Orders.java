package domain;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private Double totalPrice;
    private List<Item> itemList = new ArrayList<>();
    private int orderNumber=0;

    // 장바구니에 담기
    public void addItem(Item item){
        itemList.add(item);
//        totalPrice += itemList.get(item).getPrice();

    }

    // 현재 장바구니에 담겨있는 item 리턴
    public List<Item> getItemList(){
        return itemList;
    }

    // 현재 주문번호 리턴
    public int getOrderNumber(){
        orderNumber++;
        return orderNumber;
    }

    // 장바구니 초기화
    public void clearItemList(){
        itemList.clear();
    }

    public double TotalOrderPrice(List<Item> itemList){
        double totalPrice = 0;
        for(int i=0; i<itemList.size(); i++){
            totalPrice += itemList.get(i).getPrice();
        }
        return totalPrice;
    }




}
