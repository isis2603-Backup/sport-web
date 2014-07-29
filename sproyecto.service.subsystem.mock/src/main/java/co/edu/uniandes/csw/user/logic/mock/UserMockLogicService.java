
package co.edu.uniandes.csw.user.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.user.logic.api.IUserLogicService;

@Alternative
@Singleton
public class UserMockLogicService extends _UserMockLogicService implements IUserLogicService {
	
}