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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.reda.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Work in Progress Message Set for the updated messages prepared for
 * registration with ISO 20022.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01
 * PartyAuditTrailQueryV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyActivityAdviceV01
 * PartyActivityAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyCreationRequestV01
 * PartyCreationRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyReportV01
 * PartyReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyAuditTrailReportV02
 * PartyAuditTrailReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyDeletionRequestV01
 * PartyDeletionRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyQueryV01
 * PartyQueryV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PartyStatusAdviceV01
 * PartyStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyModificationRequestV01
 * PartyModificationRequestV01}</li>
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
 * "_T2S_Party_Reference_Data_ForRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Work in Progress Message Set for the updated messages prepared for registration with ISO 20022."
 * </li>
 * </ul>
 */
public class _T2S_Party_Reference_Data_ForRegistration {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "_T2S_Party_Reference_Data_ForRegistration";
				definition = "Work in Progress Message Set for the updated messages prepared for registration with ISO 20022.";
				messageDefinition_lazy = () -> Arrays.asList(PartyAuditTrailQueryV01.mmObject(), PartyActivityAdviceV01.mmObject(), PartyCreationRequestV01.mmObject(), PartyReportV01.mmObject(), PartyAuditTrailReportV02.mmObject(),
						PartyDeletionRequestV01.mmObject(), PartyQueryV01.mmObject(), PartyStatusAdviceV01.mmObject(), PartyModificationRequestV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}