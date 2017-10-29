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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01;
import com.tools20022.repository.area.acmt.IdentificationVerificationReportV01;
import com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages used by a financial institution to inform another financial
 * institution of the change of a client’s bank and/or the change of a client’s
 * account identification. These messages may also be used to ask a bank to
 * verify one of its banks and/or to verify its account identification.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01
 * IdentificationModificationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01
 * IdentificationVerificationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01
 * IdentificationVerificationReportV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Change or Verify Account Identification - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages used by a financial institution to inform another financial institution of the change of a client’s bank and/or the change of a client’s account identification. These messages may also be used to ask a bank to verify one of its banks and/or to verify its account identification.\r\n"
 * </li>
 * </ul>
 */
public class ChangeorVerifyAccountIdentificationISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Change or Verify Account Identification - ISO - Previous version";
				definition = "Set of messages used by a financial institution to inform another financial institution of the change of a client’s bank and/or the change of a client’s account identification. These messages may also be used to ask a bank to verify one of its banks and/or to verify its account identification.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(IdentificationModificationAdviceV01.mmObject(), IdentificationVerificationRequestV01.mmObject(), IdentificationVerificationReportV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}