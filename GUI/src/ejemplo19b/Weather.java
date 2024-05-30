package ejemplo19b;

public class Weather{
	
	public int cloud_pct;
	public int temp;
	public int feels_like;
	public int humidity;
	public int min_temp;
	public int max_temp;
	public double wind_speed;
	public int wind_degrees;
	public int sunrise;
	public int sunset;
	
	@Override
	public String toString() {
		return "Weather [cloud_pct=" + cloud_pct + ", temp=" + temp + ", feels_like=" + feels_like + ", humidity="
				+ humidity + ", min_temp=" + min_temp + ", max_temp=" + max_temp + ", wind_speed=" + wind_speed
				+ ", wind_degrees=" + wind_degrees + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}
	
}