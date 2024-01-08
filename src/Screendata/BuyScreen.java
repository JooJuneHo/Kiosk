package Screendata;

import domain.Burger;

import java.util.List;

public class BuyScreen {

    public void Order_Selector (List<Burger> itemList){
        int i=1;
        for(Burger item : itemList) {
            System.out.println(item.getName() + "\t| w"
                    + item.getPrice() + "| "
                    + item.getDescription()
            );
            i++;
        }
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?\n");
        System.out.println("1. 확인        2. 취소");
    }

    public void Order (List<Burger> itemList){
//        String str = burger.getBurgerName(number) + " 가 장바구니에 추가되었습니다.\n" +
//                "\n" +
//                "\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
//                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
//                "\n" +
//                "[ SHAKESHACK MENU ]\n" +
//                "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
//                "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
//                "3. Drinks          | 매장에서 직접 만드는 음료\n" +
//                "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
//                "\n" +
//                "[ ORDER MENU ]\n" +
//                "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
//                "6. Cancel      | 진행중인 주문을 취소합니다.";
    }
}
