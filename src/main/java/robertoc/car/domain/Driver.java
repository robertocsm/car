/**
 * 
 */
package robertoc.car.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Roberto
 *
 */

@Data
@Entity
public class Driver {
	
	@Id
	Long id;
	String name;
	Date birthdate;
	
	
}
