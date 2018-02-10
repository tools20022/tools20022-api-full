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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support asset servicing, including proxy voting, income and
 * corporate actions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "seev"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPendingReport002V08
 * SecuritiesTransactionPendingReport002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.IntraPositionMovementConfirmation002V06
 * IntraPositionMovementConfirmation002V06}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.IntraPositionMovementPostingReport002V06
 * IntraPositionMovementPostingReport002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdvice002V07
 * CorporateActionInstructionCancellationRequestStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07
 * CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesSettlementTransactionAllegementReport002V06
 * SecuritiesSettlementTransactionAllegementReport002V06}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPostingReport002V07
 * SecuritiesTransactionPostingReport002V07}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Events - Previous version - subset / variant"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support asset servicing, including proxy voting, income and corporate actions."
 * </li>
 * </ul>
 */
public class SecuritiesEventsPreviousversionsubsetvariant {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Events - Previous version - subset / variant";
				definition = "Messages that support asset servicing, including proxy voting, income and corporate actions.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReport002V08.mmObject(), IntraPositionMovementConfirmation002V06.mmObject(), CorporateActionInstruction002V07.mmObject(),
						CorporateActionMovementPreliminaryAdvice002V08.mmObject(), CorporateActionCancellationAdvice002V07.mmObject(), CorporateActionMovementReversalAdvice002V08.mmObject(),
						IntraPositionMovementPostingReport002V06.mmObject(), CorporateActionInstructionCancellationRequestStatusAdvice002V07.mmObject(), CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07.mmObject(),
						SecuritiesSettlementTransactionAllegementReport002V06.mmObject(), CorporateActionNotification002V07.mmObject(), CorporateActionInstructionStatementReport002V06.mmObject(),
						CorporateActionInstructionStatusAdvice002V08.mmObject(), SecuritiesTransactionPostingReport002V07.mmObject(), CorporateActionMovementConfirmation002V08.mmObject());
				code = "seev";
			}
		});
		return mmObject_lazy.get();
	}
}