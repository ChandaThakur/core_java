package day6Sat.hashSet;
//deekshas code
public class PassengerBean {
	
	private String PassengerName;
	private int PassengerId;
	
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public int getPassengerId() {
		return PassengerId;
	}
	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}
	public PassengerBean(String passengerName, int i) {
		super();
		PassengerName = passengerName;
		PassengerId = i;
	}
	@Override
	public String toString() {
		return "Passenger [PassengerName=" + PassengerName + ", PassengerId=" + PassengerId + "]";
	}
	
	

}
