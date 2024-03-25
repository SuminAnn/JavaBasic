package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주문의 개수를 입력하세요 : ");
        int n =scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[n];
        createOrder(n, scanner, orders);

        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static void createOrder(int num, Scanner sc, ProductOrder[] orders){
        for(int i=0; i<num; i++){
            ProductOrder order = new ProductOrder();
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            order.productName = sc.next();
            System.out.print("가격 : ");
            order.price = sc.nextInt();
            System.out.print("수량 : ");
            order.quantity = sc.nextInt();
            orders[i] = order;
            sc.nextLine();
        }
        sc.close();
    }
    
    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price+", 수량: " + order.quantity);
        } 
    }

    static int getTotalAmount(ProductOrder[] orders){
        int tot = 0;
        for(ProductOrder order : orders){
            tot += order.price * order.quantity;
        }
        return tot;
    }
}
