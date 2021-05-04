package javaPractice;

public class Party {
	String name;
	int FavoritePeopleCount = 0;

	int Favorite20Count = 0;
	int Favorite30Count = 0;
	int Favorite40Count = 0;
	int Favorite50Count = 0;
	int Favorite60Count = 0;

	int seoulCount = 0;
	int gyeongGiCount = 0;
	int busanCount = 0;
	int jejuCount = 0;

	Party(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String printData = this.name + "당\n"
				+ "선호하는 유권자 수 : " + this.FavoritePeopleCount + "\n"
				+ "선호하는 유권자 수(20대) : " + this.Favorite20Count + "\n"
				+ "선호하는 유권자 수(30대) : " + this.Favorite30Count + "\n"
				+ "선호하는 유권자 수(40대) : " + this.Favorite40Count + "\n"
				+ "선호하는 유권자 수(50대) : " + this.Favorite50Count + "\n" 
				+ "선호하는 유권자 수(50대) : " + this.Favorite50Count + "\n"
				+ "서울 지역 선호하는 유권자 수 : " + this.seoulCount + "\n"
				+ "경기 지역 선호하는 유권자 수 : " + this.gyeongGiCount + "\n"
				+ "부산 지역 선호하는 유권자 수 : " + this.busanCount + "\n"
				+ "제주 지역 선호하는 유권자 수 : " + this.jejuCount + "\n\n\n";
				return printData;
	}

}
