import Screendata.BuyScreen;
import Screendata.MainScreen;
import Screendata.MenuScreen;
import Screendata.OrderScreen;
import data.Initialize;
import domain.Item;
import domain.Orders;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    BuyScreen buyScreen = new BuyScreen();
    MainScreen mainScreen = new MainScreen();
    MenuScreen menuScreen = new MenuScreen();
    OrderScreen orderScreen = new OrderScreen();

    // 메뉴 초기화
    Initialize initialize = new Initialize();
    List<Item> itemList = initialize.initBurger();
//    List<Item> itemList =  initialize.

    Orders orders = new Orders();

    Scanner sc = new Scanner(System.in);

    public void ScreenOn() throws InterruptedException {

        while(true){
            mainScreen.mainScreen(orders.getItemList());
            int mainSelector = sc.nextInt();
            if(mainSelector<1 || mainSelector >6){
                System.out.println("잘못된 입력값 입니다.");
            }

            switch(mainSelector) {
                case 1 :
                    menuScreen.BurgerMenu(itemList);
                    int burgerSelector = sc.nextInt();
                    Item burger = initialize.initBurger().get(burgerSelector-1);

                    // 장바구니에 담기
                    orders.addItem(burger);
                    // 장바구니 확인 출력
                    buyScreen.Order_Selector(orders.getItemList());

                    // 장바구니 확인 입력
                    int buySelector = sc.nextInt();

                    if(buySelector == 1){                  // 장바구니 확인
                        break;
                    } else if(buySelector == 2){                // 장바구니 취소
                        orders.clearItemList();
                        break;
                    }
                    break;


                case 2 :
                    menuScreen.CustardMenu();
                    break;
                case 3 :
                    menuScreen.DrinksMenu();
                    break;
                case 4 :
                    menuScreen.ChickenMenu();
                    break;
                case 5 :
                    orderScreen.Order_Selector(orders.getItemList());
                    // 주문 확인 입력
                    int orderSelector = sc.nextInt();

                    if(orderSelector == 1){
                        int orderNum = orders.getOrderNumber();
                        orderScreen.CompleteOrder(orderNum);
                        Thread.sleep(3000);
                    } else if(orderSelector == 2){
                        break;
                    }
                    break;
                case 6 :
                    orderScreen.OrderCancle_Selector();
                    int cancleSelector = sc.nextInt();

                    if(cancleSelector == 1){
                        orders.clearItemList();
                        System.out.println("진행하던 주문이 취소되었습니다.");
                        break;
                    } else if (cancleSelector == 2){
                        break;
                    }
            }
        }


    }
}
