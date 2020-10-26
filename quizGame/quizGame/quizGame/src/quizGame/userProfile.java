package quizGame;
import java.util.*;

public class userProfile {
	public static int num=0; //num =���� ���� 
    public static int life=10;
    public static final int life_max=10;
    public static int count=0;
	public static String[] quiz_Database= {
			"�ڹٸ� â���� ����� �����Դϱ�?"
			,"��ϴ� �ְ��� ������ ����Դϱ�?"
			,"�߱���� xingbake�� ���� �ǹ��Դϱ�?"
			, "��ϴ� ����������� �����Դϱ�?"
			," '�������'�� �����?"
			};
	
	static int max_quiz_length=5;
	
	static boolean[] isCorrect=new boolean[max_quiz_length];
		
	static String[][] quiz_Bogi= 
		{
				{"������ ����","���ӽ� ����",	"���̿� ����","�κ����� ����"}
				,{"�긮��","����Ĵ�","������ġ","����"}
				,{"��Ӿ� �ܾ�","��Ÿ����","��������","�����"}
				,{"1�� 1��","5�� 28��","6�� 1��","12�� 25��"}
				,{"�Ұ��縮","��","ũ��","��� �븥��"}
				};		
	static int[] quiz_Ans= {2,2,2,2,2};
	
	static int[]  cnt =new int[max_quiz_length];
  	
	static void startQuiz(int num) {
		System.out.println("��� ������\n");	
	}
	
	static void getQuiz(int num) {
		if(cnt[num]==0) 
		{
		
		System.out.println("\n\n\n\n\n------���� "+(num+1)+"�� -------");
		System.out.println(quiz_Database[num]+"\n");
		int n=quiz_Bogi[num].length;
		for(int i=1;i<=n;i++) {
			System.out.println("("+i+")"+quiz_Bogi[num][i-1]);
		}
		System.out.print("\n\n\n\n\n\n\n");
	}
	}
	static void runQuiz(int num) {
		cnt[num]++;userProfile.count++;
		Scanner sc=new Scanner(System.in);

		System.out.println("������ �Է��ϼ���: ");
		int ans=sc.nextInt();
		if(ans==quiz_Ans[num]) {
			System.out.println("�����Դϴ� ���� ������ �Ѿ�ϴ� !");
			isCorrect[num]=true;  
		}
		else {
	        userProfile.life--;
			System.out.println("Ʋ�Ƚ��ϴ�. ������ �ٽ� �Է��ϼ���.");
		}
	}
	
			
	static void goNext(int num) {
   //���� ������ ��� num�� ������Ų��  
		
		if(life<0) System.out.print("����� ������ �� ����.\n����� ����ϼ̽��ϴ�.");
	    if(isCorrect[num]==true)userProfile.num++;
	}
  	
	static void getProfile(int num) {
		System.out.println("-------������--------");
		System.out.println("\n\n\n�õ� Ƚ��:"+count);
		System.out.println("���� ���:("+life+"/"+life_max+")\n");
		System.out.println("���� ����:("+(max_quiz_length-num)+"/"+max_quiz_length+")\n");	
		System.out.println("-------------------");
		
	}
	
	static void getGrade() {
		if(userProfile.life>0)System.out.println("��� �����̽��ϴ�.\n���� �ϼ̽��ϴ�\n");
		if(userProfile.life>=9)System.out.println("����� ��� :A");
		else if(userProfile.life>=7)System.out.println("����� ���: B");
		else if(userProfile.life>=5)System.out.println("����� ���: C");
		else System.out.println("����� ���: F");
	}
	static boolean reGame() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �ٽ� �Ͻðڽ��ϱ�?(yes:0)/(no:1)");
		int n=sc.nextInt();
		if(n==0) return false;
		else {
			System.out.println("������ ����˴ϴ�.");
			return true;
		}
		
	}
	
	
	static void initialSet() {
		userProfile.num=0;
		userProfile.life=10;
	   userProfile.count=0;
	   for(int i=0;i<max_quiz_length;i++)
		   cnt[i]=0;
			
	}
	public static void main(String[] args) {
        
		while(true) {
	        initialSet();
	        
		   startQuiz(num);
		while(num<max_quiz_length) {
		
			getQuiz(num);	
			runQuiz(num);
			getProfile(num);
			goNext(num);
			if(life<0) break;
		
		}
		System.out.println("���� ������ �����ϴ� \n");
		getGrade();
     
		if(reGame()==true) {
			break;
		}
	}
	}
}