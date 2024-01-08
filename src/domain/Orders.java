package domain;

import org.w3c.dom.stylesheets.LinkStyle;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Orders {
    private List<Burger> itemList = new ArrayList<>();
    private int orderNumber=0;

    // 장바구니에 담기
    public void addItem(Burger item){
        itemList.add(item);
    }

    // 현재 장바구니에 담겨있는 item 리턴
    public List<Burger> getItemList(){
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

    public double TotalOrderPrice(List<Burger> itemList){
        double totalPrice = 0;
        for(int i=0; i<itemList.size(); i++){
            totalPrice += itemList.get(i).getPrice();
        }
        return totalPrice;
    }




}
