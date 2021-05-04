package project0323;

public class SaveBox1 {
	int coins = 0; // 내부적으로 가지고 있는 변수를 property 라고 함(== 속성값, 선택값 으로 통용)
	public void deposit(int coin) {
		// 돈을 넣는 것(입금)
		coins = coins + coin; // 들어온 코인을 합산해서 deposit에 넣어줌
	}
	public void withdraw( ) {
		// 돈을 찾는 것(출금)은 프린트로 잔액 확인하게 출력함
		System.out.println("전액 : " + coins);
	}
}
