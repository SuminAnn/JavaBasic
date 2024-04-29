package extends1.ex;

public class ShopMain {
    
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
/*
 * 클래스에 final
 *  - 상속 끝, final로 선언된 클래스는 확장될 수 없다. 다른 클래스가 final로 선언된 클래스를 상속받을 수 없다
 *
 * 메서드에 final
 *  - 오버라이딩 끝, final로 선언된 메서드는 오버라이드 될 수 없다. 상속받은 서브 클래스에서 이 메서드를 변경할 수 없다
 */
