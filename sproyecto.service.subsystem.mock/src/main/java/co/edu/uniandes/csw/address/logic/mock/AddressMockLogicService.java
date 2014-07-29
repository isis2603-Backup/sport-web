
package co.edu.uniandes.csw.address.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.address.logic.api.IAddressLogicService;

@Alternative
@Singleton
public class AddressMockLogicService extends _AddressMockLogicService implements IAddressLogicService {
	
}