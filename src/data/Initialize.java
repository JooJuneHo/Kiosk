package data;

import domain.Burger;
import domain.Item;
import domain.Menu;

import java.util.ArrayList;
import java.util.List;

public class Initialize {

    public List<Burger> initBurger(){
        List<Burger> burgerList = new ArrayList<>();
        burgerList.add(new Burger("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거",6.9,1));
        burgerList.add(new Burger("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",8.9,1));
        burgerList.add(new Burger("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",9.4,1));
        burgerList.add(new Burger("Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",6.9,1));
        burgerList.add(new Burger("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거",5.4,1));
        return burgerList;
    }

}
