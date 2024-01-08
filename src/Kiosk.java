import Screendata.BuyScreen;
import Screendata.MainScreen;
import Screendata.MenuScreen;
import Screendata.OrderScreen;
import data.Initialize;
import domain.Burger;
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
    List<Burger> burger = initialize.initBurger();

    Orders orders = new Orders();

    Scanner sc = new Scanner(System.in);

    public void ScreenOn() throws InterruptedException {

        while(true){
            mainScreen.mainScreen(orders.getItemList());
            int mainSelector = sc.nextInt();


            switch(mainSelector) {
                case 1 :
                    menuScreen.BurgerMenu(burger);
                    int burgerSelector = sc.nextInt();
                    Burger burger1 = initialize.initBurger().get(burgerSelector-1);

                    // 장바구니에 담기
                    orders.addItem(burger1);
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

//                    mainSelector = sc.nextInt();
//                    if(mainSelector == 5){
//                        orderScreen.Order_Selector(orders.getItemList());
//                        // 주문 확인 입력
//                        int orderSelector = sc.nextInt();
//
//                        if(orderSelector == 1){
//                            int orderNum = orders.getOrderNumber();
//                            orderScreen.CompleteOrder(orderNum);
//                        } else if(orderSelector == 2){
//                            break;
//                        }
//
//                    }

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
            }
        }


    }
}
