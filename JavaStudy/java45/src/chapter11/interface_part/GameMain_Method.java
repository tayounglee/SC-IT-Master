package chapter11.interface_part;

import java.util.*;

public class GameMain_Method {
	boolean isCreate = true;
	boolean isReset = true;
	boolean isSelect = true;
	boolean isClassup = false;
	boolean isLoop = true;
	Scanner scan = new Scanner(System.in);
	Novice novice = new Novice();
	Knight knight = new Knight();
	Thief thief = new Thief();
	Magician magician = new Magician();
	Random random = new Random();
	
	private String name;		//캐릭터 이름
	private int str;		//힘 스탯
	private int dex;		//민첩 스탯
	private int intelligence;	//지능 스탯
	private String answer;
	private int sum;
	private int job;
	
	void printMenu() {
		System.out.println("=== ABCDE_rpg ===");
		for(int i = 1; i < 7; i++ ) {
			if(i >= 6) {
				System.out.println("0. 종료");
			}
			else {
				System.out.print(i + ". ");
				switch(i) {
					case 1:
						System.out.println("캐릭터 생성");
						break;
					case 2:
						System.out.println("캐릭터 정보");
						break;
					case 3:
						System.out.println("전직하기");
						break;
					case 4:
						System.out.println("기본 공격");
						break;
					case 5:
						System.out.println("스킬 사용");
						break;
					default:
						break;
				}	
			}
		}
		System.out.println("=================");
		System.out.print("번호를 선택하세요 : ");
	}
	boolean characterCheck() {
		if(isCreate) {
			System.out.println("캐릭터를 생성하세요.\n");
			return false;
		}
		else {
			return true;
		}
	}
	
	void createCharacter() {
		System.out.println("캐릭터를 생성합니다.");
		System.out.print("사용하실 아이디를 입력해 주세요 : ");
		name = scan.next();
		
		while(isReset) {
			novice.setName(name);
			str = random.nextInt(10);
			novice.setStrength(str);
			dex = random.nextInt(10);
			novice.setDexterity(dex);
			intelligence = random.nextInt(10);
			novice.setIntelligence(intelligence);
			sum = novice.getStrength() + novice.getDexterity() + novice.getIntelligence();
			if(sum >= 15) {
				System.out.println("스탯을 부여합니다.");
				System.out.println("부여된 스탯정보: 힘[" + novice.getStrength() + "],"
					+ " 민첩[" + novice.getDexterity() + "],"
					+ " 지능[" + novice.getIntelligence() + "]");
			
				while(isSelect) {
					System.out.print("스탯을 다시 받으시겠습니까? (y/n) : ");
					answer = scan.next();
					if(answer.equals("y") || answer.equals("Y")) {
						isReset = true;
						break;
					}
					else if (answer.equals("n") || answer.equals("N")) {
						isReset = false;
						isSelect = false;
						System.out.println(novice.toString());
						System.out.println("현재 정보로 저장합니다.\n");
						isCreate = false;
					}
					else {
						System.out.println("잘못 입력하였습니다.");
					}	
				}
			}
		}
	}
	
	void characterInfo() {
		if(isClassup) {
			switch(job) {
				case 1:
					knight = new Knight(novice.getName(),novice.getStrength(),novice.getDexterity(),novice.getIntelligence());
					System.out.println(knight.toString() + "\n");
					break;
				case 2:
					thief = new Thief(novice.getName(),novice.getStrength(),novice.getDexterity(),novice.getIntelligence());
					System.out.println(thief.toString() + "\n");
					break;
				case 3:
					magician = new Magician(novice.getName(),novice.getStrength(),novice.getDexterity(),novice.getIntelligence());
					System.out.println(magician.toString() + "\n");
					break;
			}
		}
		else {
			System.out.println(novice.toString() + "\n");	
		}
	}
	
	void characterAttack() {
		if(isClassup) {
			switch(job) {
				case 1:
					knight.attack();
					break;
				case 2:
					thief.attack();
					break;
				case 3:
					magician.attack();
					break;
			}
		}
		else {
			novice.attack();	
		}
	}
	
	void characterSkill() {
		if(isClassup) {
			switch(job) {
				case 1:
					knight.skill();
					break;
				case 2:
					thief.skill();
					break;
				case 3:
					magician.skill();
					break;
			}
		}
		else {
			System.out.println("스킬을 배우지 않았습니다. \n");	
		}
	}
	
	void classUp() {
		isLoop = true;
		while(isLoop) {
			System.out.println("=== 직업 종류 ===");
			isClassup = false;
			job = 0;
			for(int i = 1; i < 4; i++ ) {
				System.out.print(i + ". ");
				switch(i) {
					case 1:
						System.out.println("기사");
						isLoop = false;
						break;
					case 2:
						System.out.println("도적");
						isLoop = false;
						break;
					case 3:
						System.out.println("마법사");
						isLoop = false;
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
						break;
				}	
			}
			System.out.print("전직할 직업의 번호를 선택하세요 : ");
			job = scan.nextInt();
			
			switch(job) {
				case 1:
					System.out.print("기사");
					break;
				case 2:
					System.out.print("도적");
					break;
				case 3:
					System.out.print("마법사");
					break;
				default:
					break;
				}	
			
			System.out.println("로 전직합니다.\n");
		}
		isClassup = true;
	}
}
