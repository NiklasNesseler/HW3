package Main;

public class Elv_States {
	
	public  String Moving_up = "Moving_up";
	public  String Moving_down = "Moving_down";
	public  String Idle = "Idle";
	

	public String current_state;
	
	public Elv_States() {
		current_state = Idle;
	}

	public String getMoving_up() {
		return Moving_up;
	}

	
	public String getMoving_down() {
		return Moving_down;
	}


	public String getIdle() {
		return Idle;
	}

	

	public String getCurrent_state() {
		return current_state;
	}

	public void setCurrent_state(String current_state) {
		this.current_state = current_state;
	}

	
}
