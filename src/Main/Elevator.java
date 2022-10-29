package Main;


public class Elevator{
	
	public int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	
	if (current_Floor < dest_floor) {
			go_up();
	} else if 
		(current_Floor > dest_floor) {
			go_down();
		}
	else {
			exit();
	}
	}
	
	
	

	
	

	private void arrive_toFloor() {
		State.current_state = State.getIdle();
		System.out.println("Current Floor " + current_Floor);
		System.out.println("Current State " + State.getCurrent_state());
		exit();
		
		
	}
	
	private void go_up() {
		State.current_state = State.getMoving_up();
		System.out.println("Current Floor " + current_Floor);
		System.out.println("Current State " + State.getCurrent_state());
		current_Floor += 1;
		if (current_Floor < dest_Floor) {
			go_up();
		}
		else {
			arrive_toFloor();
		}
		
	}
	
	private void go_down() {
		State.current_state = State.getMoving_down();
		System.out.println("Current Floor " + current_Floor);
		System.out.println("Current State " + State.getCurrent_state());
		current_Floor -= 1;
		if (current_Floor > dest_Floor) {
			go_down();
		}
		else {
			arrive_toFloor();
		}
	}

	private void exit() {
		
		System.out.println("Exit Elevator");
	
	}
	
	

	public int getCurrent_Floor() {
		return current_Floor;
	}

	public void setCurrent_Floor(int current_Floor) {
		this.current_Floor = current_Floor;
	}

	public int getDest_Floor() {
		return dest_Floor;
	}

	public void setDest_Floor(int dest_Floor) {
		this.dest_Floor = dest_Floor;
	}

	public Elv_States getState() {
		return State;
	}

	public void setState(Elv_States state) {
		State = state;
	}
	
	
	

	
}
