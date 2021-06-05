
public abstract class Match {
	private int currentscore;
	private float currentover;
	private int target;
	
	public int getCurrentscore() {
		return currentscore;
	}
	
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	
	public float getCurrentover() {
		return currentover;
	}
	
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	
	public int getTarget() {
		return target;
	}
	
	public void setTarget(int target) {
		this.target = target;
	}
	
    abstract public float calculateRunRate();

    abstract public int calculateBalls();

    abstract public void display(double reqRunrate, int balls);
}

class ODIMatch extends Match {

    public float calculateRunRate() {
        float rrate = getTarget() - getCurrentscore();
        return (rrate / calculateBalls()) * 6;

    }

    public int calculateBalls() {
        return 300 - ((int) getCurrentover() * 6);
    }

    public void display(double reqRunrate, int balls) {
        System.out.println("Requirements:");
        System.out.println("Need " + (getTarget() - getCurrentscore()) + " runs in " + balls + " balls");
        System.out.printf("Required Runrate: %.2f\n", reqRunrate);
    }
}

class T20Match extends Match {

    public float calculateRunRate() {
        float rr = getTarget() - getCurrentscore();
        return (rr / calculateBalls()) * 6;

    }

    public int calculateBalls() {
        return 120 - ((int) getCurrentover() * 6);
    }

    public void display(double reqRunrate, int balls) {
        System.out.println("Requirements:");

        System.out.println("Need " + (getTarget() - getCurrentscore()) + " runs in " + balls + " balls");

        System.out.printf("Required Runrate: %.2f\n", reqRunrate);
    }
}

class TestMatch extends Match {

    public float calculateRunRate() {
        float rr = getTarget() - getCurrentscore();
        return (rr / calculateBalls()) * 6;

    }

    public int calculateBalls() {
        return 540 - ((int) getCurrentover() * 6);
    }

    public void display(double reqRunrate, int balls) {
        System.out.println("Requirements:");

        System.out.println("Need " + (getTarget() - getCurrentscore()) + " runs in " + balls + " balls");

        System.out.printf("Required Runrate: %.2f\n", reqRunrate);
    }
}

