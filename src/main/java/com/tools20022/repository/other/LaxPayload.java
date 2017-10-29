/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.other;

import com.tools20022.metamodel.MMExternalSchema;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a data structure that allows to include any valid XML Structure
 * (e.g. through an XML Schema). The property namespace is set to 'any'.<br>
 * The processContents value is 'lax' which according to the above specification
 * and to Iso20022:2013 means: If the item has a uniquely determined declaration
 * available, it must be ·valid· with respect to that definition, that is,
 * ·validate· if you can, don't worry if you can't, i.e. it MAY be validated or
 * not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMExternalSchema#getProcessContent
 * processContent} = com.tools20022.metamodel.MMProcessContent.LAX</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LaxPayload"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a data structure that allows to include any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'.\r\nThe processContents value is 'lax' which according to the above specification and to Iso20022:2013 means: If the item has a uniquely determined declaration available, it must be ·valid· with respect to that definition, that is, ·validate· if you can, don't worry if you can't, i.e. it MAY be validated or not."
 * </li>
 * </ul>
 */
public class LaxPayload {

	final static private AtomicReference<MMExternalSchema> mmObject_lazy = new AtomicReference<>();

	final static public MMExternalSchema mmObject() {
		mmObject_lazy.compareAndSet(null, new MMExternalSchema() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LaxPayload";
				definition = "Specifies a data structure that allows to include any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'.\r\nThe processContents value is 'lax' which according to the above specification and to Iso20022:2013 means: If the item has a uniquely determined declaration available, it must be ·valid· with respect to that definition, that is, ·validate· if you can, don't worry if you can't, i.e. it MAY be validated or not.";
				processContent = com.tools20022.metamodel.MMProcessContent.LAX;
			}
		});
		return mmObject_lazy.get();
	}
}