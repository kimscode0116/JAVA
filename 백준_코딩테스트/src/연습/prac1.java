package 연습;

import java.util.Arrays;

public class prac1 {
	public static void main(String[] args) {
		int N = 3;
		int M = 3;
		int K = 2;

		prac1 pb = new prac1();
		int answer = pb.calc(N, M, K);
		System.out.println(answer);
	}

	public int calc(int N, int M, int K) {

		int[] arr = new int[N];
		int currentLocation = 0; //출발 위치(배열 인덱스)
		int cnt = 0; // 몇번 도는지 확인하는 count
		arr[currentLocation] = 1; //배열에서 0번인덱스 == 1번사람의 값을 1로 설정(폭탄 안고 시작)

		while (true) {
			if (arr[currentLocation] == M) { //탈출 조건 : 배열의 값이 M=3이되면 반복문 끝남
				break;
			} else if (arr[currentLocation] % 2 == 1) { // 홀수 일때 = 양방향으로 순서 진행
				currentLocation += K; // 양방향 진행 = K만큼 이동
				if (currentLocation >= arr.length) { // 현재 위치가 arr.length보다 커졌을때, 즉 0,1,2번 인덱스까진 돌고 3번부턴 돌면 X
					currentLocation -= arr.length; 
				} // 다시 길이만큼 빼준다 그러면 ? 예) 2번사람이 +K만큼 가면 4번 사람이 되는데 4번 없으므로 다시 1번순서됨
				arr[currentLocation]++; 
			} else if (arr[currentLocation] % 2 == 0) { // 짝수 일때 = 음의 방향으로 순서 진행
				currentLocation -= K;
				if (currentLocation < 0) { //0번째 인덱스보다 작아지는 경우
					currentLocation += arr.length; //ex) 0번 인덱스의 사람(=1번)이 -K하면 ? -2번 인덱스가 되니까 +length(=3)하면 1번사람됨
				}
				arr[currentLocation]++;
			}
			cnt += 1; // 반복문 1번 돌때마다 count 하나씩 늘려주기
		}
		return cnt;
	}
}
