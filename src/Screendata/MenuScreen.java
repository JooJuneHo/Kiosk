package Screendata;

import domain.Item;

import java.util.List;

public class MenuScreen {
    public void BurgerMenu(List<Item> itemList){
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ Burgers MENU ]\n");
        int i=1;
        for(Item item : itemList) {
            System.out.println(i + ". " + item.getName() + "\t| w"
                    + item.getPrice() + " | "
                    + item.getDescription()
            );
            i++;
        }
        System.out.println("한개의 번호를 입력해 주세요 : ");
    }

    public void CustardMenu(List<Item> itemList){
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ Custard MENU ]\n");
        int i=1;
        for(Item item : itemList){
            System.out.println(i + ". " + item.getName() + "\t| w"
                    + item.getPrice() + " | "
                    + item.getDescription()
            );
            i++;
        }

    }

    public void DrinksMenu(List<Item> itemList){
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ Drinks MENU ]\n");

        int i=1;
        for(Item item : itemList){
            System.out.println(i + ". " + item.getName() + "\t| w"
                    + item.getPrice() + " | "
                    + item.getDescription()
            );
            i++;
        }
//
    }

    public void ChickenMenu(List<Item> itemList){
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ CHICKEN MENU ]\n");
        int i=1;
        for(Item item : itemList){
            System.out.println(i + ". " + item.getName() + "\t| w"
                    + item.getPrice() + " | "
                    + item.getDescription()
            );
            i++;
        }

    }
}
