package com.mozss.pattern23.design11behavior.behavior04state.sample_01;

public class Context {
	private Weather weather;
	
	public Weather getWeather() {
		return weather;
	}
	
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	
	public String weatherMessage() {
		return weather.getWeather();
	}
}
