import java.util.*;
public class MatchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int curr, score, ball;
        float over, rrr;
        
		System.out.println("Enter the match format");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        int match = sc.nextInt();
        
        System.out.println("Enter the Current Score");
        curr = sc.nextInt();
        System.out.println("Enter the Current Over");
        over = sc.nextFloat();
        System.out.println("Enter the Target Score");
        score = sc.nextInt();

        switch(match)
        {
        	case 1:
        		ODIMatch od = new ODIMatch();
        		od.setCurrentscore(curr);
        		od.setCurrentover(over);
        		od.setTarget(score);
        		rrr = od.calculateRunRate();
        		ball = od.calculateBalls();
        		od.display(rrr, ball);
        	break;
        	case 2:
        		T20Match tm = new T20Match();
        		tm.setCurrentscore(curr);
        		tm.setCurrentover(over);
        		tm.setTarget(score);
        		rrr = tm.calculateRunRate();
        		ball = tm.calculateBalls();
        		tm.display(rrr, ball);
        		break;
        	case 3:
        		TestMatch testm = new TestMatch();
        		testm.setCurrentscore(curr);
        		testm.setCurrentover(over);
        		testm.setTarget(score);
        		rrr = testm.calculateRunRate();
        		ball = testm.calculateBalls();
        		testm.display(rrr, ball);
        		break;
        	default:
        		System.out.println("Invalid Choice");
        }
	}

}
