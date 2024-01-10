package Screendata;

import domain.Item;

import java.util.List;

public class BuyScreen {

    public void Order_Selector (List<Item> itemList){
        for(Item item : itemList) {
            System.out.println(item.getName() + "\t| w"
                    + item.getPrice() + " | "
                    + item.getDescription()
            );
        }
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?\n");
        System.out.println("1. 확인        2. 취소");
    }


}
