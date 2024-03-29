package development;

import java.util.Scanner;

public class CrossWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

System.out.println(" ::::::::  :::::::::   ::::::::   ::::::::   ::::::::  :::       :::  ::::::::  :::::::::  :::::::::  ");
System.out.println(":+:    :+: :+:    :+: :+:    :+: :+:    :+: :+:    :+: :+:       :+: :+:    :+: :+:    :+: :+:    :+: ");
System.out.println("+:+        +:+    +:+ +:+    +:+ +:+        +:+        +:+       +:+ +:+    +:+ +:+    +:+ +:+    +:+ ");
System.out.println("+#+        +#++:++#:  +#+    +:+ +#++:++#++ +#++:++#++ +#+  +:+  +#+ +#+    +:+ +#++:++#:  +#+    +:+ ");
System.out.println("+#+        +#+    +#+ +#+    +#+        +#+        +#+ +#+ +#+#+ +#+ +#+    +#+ +#+    +#+ +#+    +#+ ");
System.out.println("#+#    #+# #+#    #+# #+#    #+# #+#    #+# #+#    #+#  #+#+# #+#+#  #+#    #+# #+#    #+# #+#    #+# ");
System.out.println(" ########  ###    ###  ########   ########   ########    ###   ###    ########  ###    ### #########  ");
System.out.println();
System.out.println("=====Start!=====");
System.out.println();

		// "_"는 앞으로 들어갈 공간, "■"는 바뀌지않는 공간
		// 가로세로 넣기엔 공간이 부족하고, 일반 숫자가 들어가면 숫자가 너무 커 혼선이 있을 수 있어 
        // 특수기호 [ㅈ]한자 중에 가장 작은 특수기호 숫자를 사용
		// 지금은 가로세로 숫자가 중복이 안됐지만, 후에 커지면서 가로세로 공용하는 숫자가 생긴다면
		// 따로 보기란 같은걸 만들어서..? 혹은 변수에 1_1, 1_2로 하거나..? 
		// 혹은 가로 입력하고 1을 입력하면 가로1, 세로 입력하고 1을 입력하면 세로1 문제가 출력되는 식으로
		String arr[] = { "１", "_", "２", "_", "■", "■", "_", "■", "■", "■", "３", "_", "４", "５", "_", "■", "■", "_", "■",
				"■", "６", "_", "■", "■" };

		int c = 1;

		System.out.print("    ");

		// 시작할 때 빈 퍼즐 한번 출력
		for (int i = 0; i < arr.length; i++) {
			if (i == c * 4 - 1) {
				System.out.print(arr[i] + " \n    ");
				c++;
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		
		// 정답 입력할 변수
		String input = "";
		// 문제 번호
		int num = 0;
		// 문제 정답
		String q1 = "with";
		String q2 = "this";
		String q3 = "in";
		String q4 = "was";
		String q5 = "are";
		String q6 = "he";

		while (true) {

			System.out.println();
			System.out.print("번호는? >> ");
			num = sc.nextInt();

			// 입력한 번호의 문제
			switch (num) {
			// 맞다면 if문 종료하고 break로 내려가서 바뀐 퍼즐 출력
			// 틀리다면 continue로 인해 while문 가장 위로 가서 번호부터 다시 물어보기
			// (풀다가 다른 문제 선택할 수 있도록)
			case 1:
				System.out.print("Will tou go outside _ _ _ _ me? : ");
				input = sc.next();
				if (input.equals(q1)) {
					arr[0] = "w";
					arr[1] = "i";
					arr[2] = "t";
					arr[3] = "h";
					System.out.println("====정답입니다====");
				} else {
					System.out.println("오답입니다");
					continue;
				}
				break;
			case 2:
				System.out.print("_ _ _ _ is my homework. : ");
				input = sc.next();
				if (input.equals(q2)) {
					arr[2] = "t";
					arr[6] = "h";
					arr[10] = "i";
					arr[14] = "s";
					System.out.println("====정답입니다====");
				} else {
					System.out.println("오답입니다");
					continue;
				}
				break;
			case 3:
				System.out.print("Stay _ _ your seat. : ");
				input = sc.next();
				if (input.equals(q3)) {
					arr[10] = "i";
					arr[11] = "n";
					System.out.println("====정답입니다====");
				} else {
					System.out.println("오답입니다");
					continue;
				}
				break;
			case 4:
				System.out.print("Yesterday _ _ _ my birthday. : ");
				input = sc.next();
				if (input.equals(q4)) {
					arr[12] = "w";
					arr[13] = "a";
					arr[14] = "s";
					System.out.println("====정답입니다====");
				} else {
					System.out.println("오답입니다");
					continue;
				}
				break;
			case 5:
				System.out.print("How old _ _ _ you? : ");
				input = sc.next();
				if (input.equals(q5)) {
					arr[13] = "a";
					arr[17] = "r";
					arr[21] = "e";
					System.out.println("====정답입니다====");
				} else {
					System.out.println("오답입니다");
					continue;
				}
				break;
			case 6:
				System.out.print("_ _ is my friend.");
				input = sc.next();
				if (input.equals(q6)) {
					arr[20] = "h";
					arr[21] = "e";
					System.out.println("====정답입니다====");
				} else {
					System.out.println("오답입니다");
					continue;
				}
				break;
			}

			// 맞다면 while문 빠져나오고 내려와서 밑의 바뀐 퍼즐 출력, 다시 올라가 반복
			c = 1;
			System.out.println();
			System.out.print("    ");
			for (int i = 0; i < arr.length; i++) {
				if (i == c * 4 - 1) {
					System.out.print(arr[i] + " \n    ");
					c++;
				} else {
					System.out.print(arr[i] + " ");
				}
			}

		}

	}

}
