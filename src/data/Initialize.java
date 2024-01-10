package data;

import domain.*;

import java.util.ArrayList;
import java.util.List;

public class Initialize {

    public List<Item> initBurger(){
        List<Item> burgerList = new ArrayList<>();
        burgerList.add(new Item("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거",6.9));
        burgerList.add(new Item("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",8.9));
        burgerList.add(new Item("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",9.4));
        burgerList.add(new Item("Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",6.9));
        burgerList.add(new Item("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거",5.4));
        return burgerList;
    }

    public List<Item> initCustard(){
        List<Item> custardList = new ArrayList<>();
        custardList.add(new Item("Classic Hand-Spun Shakes","쫀득하고 진한 커스터드가 들어간 클래식 쉐이크(바닐라/초콜릿/스트로베리/블랙 & 화이트/솔티드 카라멜/피넛 버터/커피",6.5));
        custardList.add(new Item("Floats","부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료(루트 비어/퍼플 카우/크림시클)",6.5));
        custardList.add(new Item("Cup & Cones","매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림 (바닐라/초콜릿)",6.5));
        return custardList;
    }

    public List<Item> initDrinks(){
        List<Item> drinksList = new ArrayList<>();
        drinksList.add(new Item("Lemonade","매장에서 직접 만드는 상큼한 레몬에이드",5.0));
        drinksList.add(new Item("Fresh Brewed Iced Tea","직접 유기농 홍차를 우려낸 아이스 티",4.2));
        drinksList.add(new Item("Initialize","레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 쉐이크쉑의 시그니처 음료",4.5));
        drinksList.add(new Item("Fountain soda","코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플",3.6));
        drinksList.add(new Item("Abita Root Beer","청량감 있는 독특한 미국식 무알콜 탄산음료",4.8));
        return drinksList;
    }

    public List<Item> initChicken(){
        List<Item> chickenList = new ArrayList<>();
        chickenList.add(new Item("Hot Chicken","바삭하고 두툼한 치킨 통살과 스파이시 슬로, 핫 스파이시 시즈닝이 토핑된 치킨 버거 (닭가슴살/닭다리살 선택 가능)",9.5));
        chickenList.add(new Item("Chicken Shack","바삭하고 두툼한 치킨 통살과 양상추, 피클, 허브 마요 소스가 토핑된 치킨 버거 (닭가슴살/닭다리살 선택 가능)",8.0));
        chickenList.add(new Item("Chink'n Bites","한 입에 먹기 좋은 바삭한 치킨 바이트와 허니 머스터드 또는 BBQ 소스를 선택하여 함께 즐기는 메뉴",8.2));
        return chickenList;
    }
//    public void initializeMenu(){
//        List<Item> burgerList = new ArrayList<>();
//        burgerList.add(new Item("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거",6.9));
//        burgerList.add(new Item("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",8.9));
//        burgerList.add(new Item("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",9.4));
//        burgerList.add(new Item("Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",6.9));
//        burgerList.add(new Item("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거",5.4));
//
//        List<Item> custardList = new ArrayList<>();
//        custardList.add(new Item("Classic Hand-Spun Shakes","쫀득하고 진한 커스터드가 들어간 클래식 쉐이크(바닐라/초콜릿/스트로베리/블랙 & 화이트/솔티드 카라멜/피넛 버터/커피",6.5));
//        custardList.add(new Item("Floats","부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료(루트 비어/퍼플 카우/크림시클)",6.5));
//        custardList.add(new Item("Cup & Cones","매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림 (바닐라/초콜릿)",6.5));
//
//        List<Item> drinksList = new ArrayList<>();
//        drinksList.add(new Item("Lemonade","매장에서 직접 만드는 상큼한 레몬에이드",5.0));
//        drinksList.add(new Item("Fresh Brewed Iced Tea","직접 유기농 홍차를 우려낸 아이스 티",4.2));
//        drinksList.add(new Item("Initialize","레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 쉐이크쉑의 시그니처 음료",4.5));
//        drinksList.add(new Item("Fountain soda","코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플",3.6));
//        drinksList.add(new Item("Abita Root Beer","청량감 있는 독특한 미국식 무알콜 탄산음료",4.8));
//
//        List<Item> chickenList = new ArrayList<>();
//        chickenList.add(new Item("Hot Chicken","바삭하고 두툼한 치킨 통살과 스파이시 슬로, 핫 스파이시 시즈닝이 토핑된 치킨 버거 (닭가슴살/닭다리살 선택 가능)",9.5));
//        chickenList.add(new Item("Chicken Shack","바삭하고 두툼한 치킨 통살과 양상추, 피클, 허브 마요 소스가 토핑된 치킨 버거 (닭가슴살/닭다리살 선택 가능)",8.0));
//        chickenList.add(new Item("Chink'n Bites","한 입에 먹기 좋은 바삭한 치킨 바이트와 허니 머스터드 또는 BBQ 소스를 선택하여 함께 즐기는 메뉴",8.2));
//    }

}
