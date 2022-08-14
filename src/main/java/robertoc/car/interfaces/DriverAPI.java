/**
 * 
 */
package robertoc.car.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import robertoc.car.domain.Driver;

/**
 * @author Roberto
 *
 */
@Service
@RestController
public class DriverAPI {
	
	public List<Driver> liDrivers(){
		return new ArrayList<>();
		
	}

}
