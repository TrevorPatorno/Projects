// Trevor Patorno
public class Time {
	long second, minute, hour, allSeconds, allMinutes, allHours;
	
	public Time() {
		allSeconds = System.currentTimeMillis() / 1000;
		allMinutes = allSeconds / 60;
		allHours = allMinutes / 60;
		
		this.second = allSeconds % 60;
		this.minute = allMinutes % 60;
		this.hour = allHours % 24;
	
	}
	public Time(long hour, long minute, long second) {
		this.second = second;	this.minute = minute;	this.hour = hour;
		
	}
	public Time(long pastTime) {
		allSeconds = pastTime / 1000;
		allMinutes = allSeconds / 60;
		allHours = allMinutes / 60;
		
		this.second = allSeconds % 60;
		this.minute = allMinutes % 60;
		this.hour = allHours % 24;
		
	}
	public long getSecond() {
		return second;
		
	}
	public long getMinute() {
		return minute;
		
	}
	public long getHour() {
		return hour;
		
	}
}
