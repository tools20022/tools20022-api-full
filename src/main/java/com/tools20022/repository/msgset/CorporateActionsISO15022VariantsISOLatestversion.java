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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This Message Definition Report provides the description of the ISO15022
 * Variants of the current version of the Corporate Actions message definitions.
 * These variants have been developed by SWIFT to help ISO 20022 users who need
 * to be interoperable with the ISO 15022 Corporate Actions message types. This
 * has been done by restricting the ISO 20022 message components wherever
 * necessary to ensure compatibility with the equivalent fields in ISO 15022.
 * For more information, please refer to the ISO 15022 Variants Business
 * Justification that is available at
 * http://www.iso20022.org/documents/BJ/BJ096/
 * ISO20022BJ_15022_variants_v3_with_comments.doc<br>
 * <br>
 * These variants are maintained by SWIFT. Requests for changes to these
 * variants should be addressed directly to SWIFT.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrative002V04
 * CorporateActionNarrative002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V07
 * CorporateActionInstruction002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08
 * CorporateActionMovementPreliminaryAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdvice002V07
 * CorporateActionCancellationAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08
 * CorporateActionMovementReversalAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequest002V07
 * CorporateActionInstructionCancellationRequest002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdvice002V06
 * CorporateActionEventProcessingStatusAdvice002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdvice002V07
 * CorporateActionInstructionCancellationRequestStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07
 * CorporateActionNotification002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReport002V06
 * CorporateActionInstructionStatementReport002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdvice002V08
 * CorporateActionInstructionStatusAdvice002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08
 * CorporateActionMovementConfirmation002V08}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Corporate Actions - ISO 15022 Variants - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This Message Definition Report provides the description of the ISO15022 Variants of the current version of the Corporate Actions message definitions. These variants have been developed by SWIFT to help ISO 20022 users who need to be interoperable with the ISO 15022 Corporate Actions message types. This has been done by restricting the ISO 20022 message components wherever necessary to ensure compatibility with the equivalent fields in ISO 15022. For more information, please refer to the ISO 15022 Variants Business Justification that is available at http://www.iso20022.org/documents/BJ/BJ096/ISO20022BJ_15022_variants_v3_with_comments.doc\r\n\r\nThese variants are maintained by SWIFT. Requests for changes to these variants should be addressed directly to SWIFT. "
 * </li>
 * </ul>
 */
public class CorporateActionsISO15022VariantsISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Corporate Actions - ISO 15022 Variants - ISO - Latest version";
				definition = "This Message Definition Report provides the description of the ISO15022 Variants of the current version of the Corporate Actions message definitions. These variants have been developed by SWIFT to help ISO 20022 users who need to be interoperable with the ISO 15022 Corporate Actions message types. This has been done by restricting the ISO 20022 message components wherever necessary to ensure compatibility with the equivalent fields in ISO 15022. For more information, please refer to the ISO 15022 Variants Business Justification that is available at http://www.iso20022.org/documents/BJ/BJ096/ISO20022BJ_15022_variants_v3_with_comments.doc\r\n\r\nThese variants are maintained by SWIFT. Requests for changes to these variants should be addressed directly to SWIFT. ";
				messageDefinition_lazy = () -> Arrays.asList(CorporateActionNarrative002V04.mmObject(), CorporateActionInstruction002V07.mmObject(), CorporateActionMovementPreliminaryAdvice002V08.mmObject(),
						CorporateActionCancellationAdvice002V07.mmObject(), CorporateActionMovementReversalAdvice002V08.mmObject(), CorporateActionInstructionCancellationRequest002V07.mmObject(),
						CorporateActionEventProcessingStatusAdvice002V06.mmObject(), CorporateActionInstructionCancellationRequestStatusAdvice002V07.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmObject(),
						CorporateActionNotification002V07.mmObject(), CorporateActionInstructionStatementReport002V06.mmObject(), CorporateActionInstructionStatusAdvice002V08.mmObject(), CorporateActionMovementConfirmation002V08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}