
package co.edu.uniandes.csw.country.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.country.logic.api.ICountryLogicService;

@Alternative
@Singleton
public class CountryMockLogicService extends _CountryMockLogicService implements ICountryLogicService {
	
}