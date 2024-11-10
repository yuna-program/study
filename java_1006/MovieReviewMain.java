package java_1006;

public class MovieReviewMain {
	
	public static void main(String[] args) {
		// 영화 리뷰 정보 초기화
		// 영화 리뷰 정보 출력
		
		// 인사이드 아웃 2, 리뷰 : 넘 재미있어요 !
		// 사랑의 하츄핑, 리뷰 : 너무 귀여워요
		
		MovieReview moviereview1 = new MovieReview();
		MovieReview moviereview2 = new MovieReview();

		
		MovieReview[] mr = {moviereview1, moviereview2};
		
		mr[0].title = "인사이드 아웃2";
		mr[0].review = "넘 재미있어요 ! ";
		
		mr[1].title = "사랑의 하츄핑";
		mr[1].review = "너무 귀여워요";
		
		for(int i = 0; i < mr.length; i++) {
			System.out.println("영화 제목 : " + mr[i].title + " 영화 리뷰 : " + mr[i].review);
		}
		
	}

}
