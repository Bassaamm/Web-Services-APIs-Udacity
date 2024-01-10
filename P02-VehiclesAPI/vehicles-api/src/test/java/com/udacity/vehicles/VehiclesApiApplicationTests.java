package com.udacity.vehicles;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import com.udacity.vehicles.domain.car.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehiclesApiApplicationTests {

    @Test
    public void contextLoads() {
    }
@Test
public void getPrice_returnsPrice() {
    Long vehicleId = 1L;

    Price price = null;
    try {
        price = PricingService.getPrice(vehicleId);
    } catch (PriceException e) {
        fail("PriceException was not expected to be thrown.");
    }

    assertNotNull(price);
    assertEquals(vehicleId, price.getVehicleId());
}
}
