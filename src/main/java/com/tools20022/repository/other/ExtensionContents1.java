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

import com.tools20022.metamodel.MMNamespace;
import com.tools20022.metamodel.MMProcessContent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMUserDefined;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Technical extension structure that allows to specify any valid XML Structure
 * (e.g. through an XML Schema). The property namespace is set to 'any'. <br>
 * The content of the extension MUST NOT be validated by the receiver
 * (processContent=lax).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMUserDefined#getNamespace
 * namespace} = com.tools20022.metamodel.MMNamespace.any</li>
 * <li>{@linkplain com.tools20022.metamodel.MMUserDefined#getProcessContents
 * processContents} = com.tools20022.metamodel.MMProcessContent.LAX</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtensionContents1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Technical extension structure that allows to specify any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'. \r\nThe content of the extension MUST NOT be validated by the receiver (processContent=lax)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class ExtensionContents1 {

	final static private AtomicReference<MMUserDefined> mmObject_lazy = new AtomicReference<>();

	final static public MMUserDefined mmObject() {
		mmObject_lazy.compareAndSet(null, new MMUserDefined() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtensionContents1";
				definition = "Technical extension structure that allows to specify any valid XML Structure (e.g. through an XML Schema). The property namespace is set to 'any'. \r\nThe content of the extension MUST NOT be validated by the receiver (processContent=lax).";
				namespace = MMNamespace.any;
				processContents = MMProcessContent.LAX;
			}
		});
		return mmObject_lazy.get();
	}
}