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

    public String CustardMenu(){
        String str = " \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ Custard MENU ]\n" +
                "1. Classic Hand-Spun Shakes   | W 6.5 | 쫀득하고 진한 커스터드가 들어간 클래식 쉐이크(바닐라/초콜릿/스트로베리/블랙 & 화이트/솔티드 카라멜/피넛 버터/커피)\n" +
                "2. Floats    | W 6.5 | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료(루트 비어/퍼플 카우/크림시클)\n" +
                "3. Cup & Cones | W 6.5 | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림 (바닐라/초콜릿)";
        return str;
    }

    public String DrinksMenu(){
        String str = " \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ Drinks MENU ]\n" +
                "1. Lemonade   | W 5.0 | 매장에서 직접 만드는 상큼한 레몬에이드\n" +
                "2. Fresh Brewed Iced Tea    | W 4.2 | 직접 유기농 홍차를 우려낸 아이스 티\n" +
                "3. Fifty/Fifty | W 4.5 | 레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 쉐이크쉑의 시그니처 음료\n" +
                "4. Fountain soda  | W 3.6 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플\n" +
                "5. Abita Root Beer     | W 4.8 | 청량감 있는 독특한 미국식 무알콜 탄산음료";
        return str;
    }

    public String ChickenMenu(){
        String str = " \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                "\n" +
                "[ CHICKEN MENU ]\n" +
                "1. Hot Chicken   | W 9.5 | 바삭하고 두툼한 치킨 통살과 스파이시 슬로, 핫 스파이시 시즈닝이 토핑된 치킨 버거 (닭가슴살/닭다리살 선택 가능)\n" +
                "2. Chicken Shack    | W 8.0 | 바삭하고 두툼한 치킨 통살과 양상추, 피클, 허브 마요 소스가 토핑된 치킨 버거 (닭가슴살/닭다리살 선택 가능)\n" +
                "3. Chink'n Bites | W 8.2 | 한 입에 먹기 좋은 바삭한 치킨 바이트와 허니 머스터드 또는 BBQ 소스를 선택하여 함께 즐기는 메뉴\n";
        return str;
    }
}
