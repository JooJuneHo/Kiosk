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

    public void ScreenOn(){
        System.out.println(mainScreen.mainScreen());
        int selector = sc.nextInt();


        switch(selector) {
            case 1 :
                menuScreen.BurgerMenu(burger);
                int burgerSelector = sc.nextInt();
                Burger burger1 = initialize.initBurger().get(burgerSelector-1);

                // 장바구니에 담기
                orders.addItem(burger1);

                buyScreen.Order_Selector(orders.getItemList());


                break;
            case 2 :
                System.out.println(menuScreen.CustardMenu());
                break;
            case 3 :
                System.out.println(menuScreen.DrinksMenu());
                break;
            case 4 :
                System.out.println(menuScreen.ChickenMenu());
                break;
            case 5 :
                System.out.println(orderScreen.Order_Selector());
                break;
            case 6 :
                System.out.println(orderScreen.OrderCancle_Selector());
        }
    }
}
