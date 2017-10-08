package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import reports.GeoWeatherReport;
import repositories.GeoWeatherRepository;
import weather.WeatherRequest;

public class GeoWeatherRepositoryTest {
	@Test
    void checkGeoWeatherResponse() {
        try {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            GeoWeatherRepository repository = new GeoWeatherRepository();

            GeoWeatherReport report = repository.getGeoWeather(request);

            fail("Not implimented");
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }
}

