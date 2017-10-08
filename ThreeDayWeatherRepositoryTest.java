package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import reports.ThreeDayWeatherReport;
import repositories.ThreeDayWeatherRepository;
import weather.WeatherRequest;

public class ThreeDayWeatherRepositoryTest {
	@Test
    void checkThreeDayWeatherResponse() {
        try {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            ThreeDayWeatherRepository repository = new ThreeDayWeatherRepository();

            ThreeDayWeatherReport report = repository.getThreeDayWeather(request);

            fail("Not implimented");
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }
}
