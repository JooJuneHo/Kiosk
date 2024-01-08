package Screendata;

public class OrderScreen {
    // 주문 화면 출력
    public String Order_Selector(){
        String str = "아래와 같이 주문 하시겠습니까?\n" +
                "\n" +
                "[ Orders ]\n" +
                "ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                "SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                "\n" +
                "[ Total ]\n" +
                "W 15.8\n" +
                "\n" +
                "1. 주문      2. 메뉴판";
        return str;
    }

    // 주문 완료 화면 출력 3추뒤 초기화면으로 돌아가야함
    public String CompleteOrder(){
        String str = "주문이 완료되었습니다!\n" +
                "\n" +
                "대기번호는 [ 1 ] 번 입니다.\n" +
                "(3초후 메뉴판으로 돌아갑니다.)";
        return str;
    }

    public String OrderCancle_Selector(){
        String str = "진행하던 주문을 취소하시겠습니까?\n" +
                "1. 확인        2. 취소";
        return str;
    }

    public String OrderCancle(){
        String str = "진행하던 주문이 취소되었습니다.\n" +
                "\n" +
                "\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ SHAKESHACK MENU ]\n" +
                "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                "\n" +
                "[ ORDER MENU ]\n" +
                "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                "6. Cancel      | 진행중인 주문을 취소합니다.";
        return str;
    }
}
