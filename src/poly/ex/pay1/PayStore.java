package poly.ex.pay1;

public abstract class PayStore {

    //결제 수단 추가시 변하는 부분
    static Pay findPay(String payOption){
        if(payOption.equals("kakao")){
            return new KakaoPay();
        }else if(payOption.equals("naver")){
            return new NaverPay();
        }else{
            return new DefaultPay();
        }
    }
}
