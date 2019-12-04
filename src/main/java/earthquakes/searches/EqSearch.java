package earthquakes.searches;

public class EqSearch {
	private int distance;
	private int minmag;
	private double lat;
	private double lon;
	private String location;

	EqSearch() {
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int x) {
		distance = x;
	}

	public int getMinmag() {
		return minmag;
	}

	public void setMinmag(int x) {
		minmag = x;
	}

	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}

	public String getLocation() {
		return location;
	}

	public void setLat(double x) {
		lat = x;
	}

	public void setLon(double x) {
		lon = x;
	}

	public void setLocation(String x) {
		location = x;
	}

}