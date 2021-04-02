package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV1 {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;

	public ScoreServiceV1() {

		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();

	}

	public void menuNum() {
		while (true) {
			System.out.println("==================================================");
			System.out.println("빚고을 고등학교 성적처리 프로젝트 2012");
			System.out.println("==================================================");
			System.out.println("1. 학생별 성적 입력");
			System.out.println("2. 학생 성적 리스트 출력");
			System.out.println("QUIT . 업무종료");
			System.out.println("==================================================");
			System.out.print("업무선택 >>");
			String strMenu = scan.nextLine();
			Integer intNum;
			if (strMenu.equals("QUIT")) {
				System.out.println("업무를 종료합니다///////////////////////////");
				break;
			}
			intNum = Integer.valueOf(strMenu);
			if (intNum == 1) {
				this.inputNum();
			} else if (intNum == 2) {
				this.printAllList();
			}
		}
	}

	public void inputNum() {
		ScoreVO vo = new ScoreVO();
		String stuName;
		System.out.println("=================================================");
		System.out.println("학생 이름을 입력하세요(입력을 중단하려면 QUIT)");
		System.out.println("=================================================");
		System.out.print("이름>>");
		stuName = scan.nextLine();
		while (true) {

			if (stuName.equals("QUIT")) {
				System.out.println("업무를 종료합니다///////////////////////////");
				return;
			} else if (stuName.equals(" ")) {
				System.out.println("이름을 입력하세요");
				continue;
			} else {
				vo.setStuName(stuName);
				scoreList.add(vo);
				break;
			}
		}

		while (true) {
			System.out.println("================================================================================");
			System.out.println(stuName + "의 성적을 입력하세요(성적범위: 0~ 100, 입력을 중단하려면 QUIT)");
			System.out.println("================================================================================");
			System.out.print("국어>>");
			Integer intNum2 = 0;
			String scoreKor = scan.nextLine();
			intNum2 = Integer.valueOf(scoreKor);
			if (scoreKor.equals("QUIT")) {
				System.out.println("업무를 종료합니다///////////////////////////");
				return;
			}
			if(intNum2 < 0 || intNum2 > 100) {
				continue;
			}
			System.out.print("영어>>");
			String scoreEng = scan.nextLine();
			intNum2 = Integer.valueOf(scoreEng);
			if(intNum2 < 0 || intNum2 > 100) {
				continue;
			}
			System.out.print("수학>>");
			String scoreMath = scan.nextLine();
			intNum2 = Integer.valueOf(scoreMath);
			if(intNum2 < 0 || intNum2 > 100) {
				continue;
			}
			System.out.print("과학>>");
			String scoreSc = scan.nextLine();
			intNum2 = Integer.valueOf(scoreSc);
			if(intNum2 < 0 || intNum2 > 100) {
				continue;
			}
			System.out.print("국사>>");
			String scoreKuk = scan.nextLine();
			intNum2 = Integer.valueOf(scoreKuk);
			if(intNum2 < 0 || intNum2 > 100) {
				continue;
			}
			
			System.out.println("================================================");
			System.out.println(stuName + "학생의 성적이 추가 되었습니다");
			System.out.println("================================================");
			System.out.println("국어 : " + scoreKor);
			System.out.println("영어 : " + scoreEng);
			System.out.println("수학 : " + scoreMath);
			System.out.println("과학 : " + scoreSc);
			System.out.println("국사 : " + scoreKuk);
			
			

			vo.setScoreKor(scoreKor);
			vo.setScoreEng(scoreEng);
			vo.setScoreMath(scoreMath);
			vo.setScoreSc(scoreSc);
			vo.setScoreKuk(scoreKuk);
			scoreList.add(vo);
			break;
			
			
		}
		
}

	public void printAllList() {
		System.out.println("================================================================ ");
		System.out.println("순번\t국어\t영어\t수학\t과학\t국사\t총점\t평균\t");
		System.out.println("---------------------------------------------------------------- ");
		for(int i = 0; i < scoreList.size(); i++) {
			
		}

	}

}
