
package co.edu.uniandes.csw.documenttype.logic.mock;
import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

import co.edu.uniandes.csw.documenttype.logic.api.IDocumentTypeLogicService;

@Alternative
@Singleton
public class DocumentTypeMockLogicService extends _DocumentTypeMockLogicService implements IDocumentTypeLogicService {
	
}