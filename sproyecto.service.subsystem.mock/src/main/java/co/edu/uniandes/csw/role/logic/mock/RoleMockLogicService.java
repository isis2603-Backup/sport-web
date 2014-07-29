
package co.edu.uniandes.csw.role.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.role.logic.api.IRoleLogicService;

@Alternative
@Singleton
public class RoleMockLogicService extends _RoleMockLogicService implements IRoleLogicService {
	
}