package quizGame;

/* 
 * ���� �޼ҵ尡 �����ϴ� �ڹ����� 
 * ���⼭ RUN(CTRL+F11) �ϸ� ������ ���� ���� �����ϴ�
 * 
 * �ڵ� ���� 
 * �� 5���� ȭ�� Page�� ���� �� �������� ���������� ���� �������� �θ��Ƿ� ���� ����Ǿ�����
 * 0. Main.java ->����
 * 1. QuizGame.java -> ���� ȭ�� 
 * 2. startGame.java -> �帣 ����
 * 3. sideScene.java -> ���� �� ���, ��Ʈ��+ �غ� ȭ��
 * 4. OnGame.java -> ���� ���� 
 * 5. gameEnding.java -> ������ ������ �� ȭ��   
 * */
public class Main {
	public static final int SCREEN_WIDTH =1280;
	public static final int SCREEN_HEIGHT =720;
	public static int Now_QuizNum = 1;
	public static int Game_Score = 0;
	public static int Remain_Question = 10;
	public static int Life_Remain = 10;
	
	public static void main(String[] args) {	
		new QuizGame();
	}

}
