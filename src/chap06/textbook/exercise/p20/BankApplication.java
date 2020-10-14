package chap06.textbook.exercise.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);	
	private static int num = 0;
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성하기
	private static void createAccount() {
		String ano;
		String owner;
		int money;
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("계좌주: ");
		owner = scanner.next();
		System.out.print("초기입금액: ");
		money = scanner.nextInt();
		
		Account account = new Account(ano, owner, money);
		accountArray[num] = account;
		num ++;
		System.out.println("계좌가 생성되었습니다.");
	}
	//계좌목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (int i = 0; i < num ; i++) {	
		System.out.println(accountArray[i].getAno()+accountArray[i].getOwner()+accountArray[i].getBalance());
		}
	}
	//예금하기
	private static void deposit() {
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");
		
		String ano;
		int money;
		System.out.print("계좌번호");
		ano = scanner.next();
		System.out.print("예금액");
		money = scanner.nextInt();
		
		Account acc = findAccount(ano);
		int sum = acc.getBalance() + money;
		acc.setBalance(sum);
	}
	//출금하기
	private static void withdraw() {
		System.out.println("----------------");
		System.out.println("출금");
		System.out.println("----------------");
		
		String ano;
		int money;
		
		System.out.print("계좌번호");
		ano = scanner.next();
		System.out.print("출금액");
		money = scanner.nextInt();
		
		Account acc = findAccount(ano);
		int sum = acc.getBalance() - money;
		acc.setBalance(sum);
		
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (int i = 0; i < i; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
