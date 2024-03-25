package class1.ex;

public class MovieReviewMain {
    
    public static void main(String[] args) {
        MovieReview inception = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview about = new MovieReview("어바웃 타임", "인생 시간 영화!");

        MovieReview[] movieReviews = {inception, about};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목 : " + movieReview.titile + ", 리뷰 : " + movieReview.review);
        }

    }
}
