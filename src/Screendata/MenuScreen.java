package Screendata;

import domain.Item;

import java.util.List;

public class MenuScreen {

    // 중복코드 없애기!!
    //
    public void Menu(List<Item> itemList){
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ Burgers MENU ]\n");
        int i = 1; // 변수명 잘알아들을수 있도록 정하기!!
        for(Item item : itemList) {
            System.out.println(i + ". " + item.getName() + "\t| w"
                    + item.getPrice() + " | "
                    + item.getDescription()
            );
            i++;
        }
        System.out.println("한개의 번호를 입력해 주세요 : ");
    }

}
