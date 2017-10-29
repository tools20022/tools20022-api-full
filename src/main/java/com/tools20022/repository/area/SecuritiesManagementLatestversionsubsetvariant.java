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
import com.tools20022.repository.area.semt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support post-settlement processes for securities (including
 * reporting on securities movements, trades and balances), the processes
 * required to protect beneficial owner's rights throughout settlement, plus any
 * exceptions and investigations related to securities transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "semt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03
 * SecuritiesSettlementTransactionAuditTrailReport002V03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdvice002V05
 * SecuritiesMessageCancellationAdvice002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09
 * SecuritiesBalanceAccountingReport002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQuery002V06
 * SecuritiesStatementQuery002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04
 * IntraPositionMovementInstruction002V04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09
 * SecuritiesBalanceCustodyReport002V09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V08
 * SecuritiesTransactionPendingReport002V08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V06
 * IntraPositionMovementConfirmation002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementStatusAdvice002V05
 * IntraPositionMovementStatusAdvice002V05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V06
 * IntraPositionMovementPostingReport002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V06
 * SecuritiesSettlementTransactionAllegementReport002V06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V07
 * SecuritiesTransactionPostingReport002V07}</li>
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
 * "Securities Management - Latest version - subset / variant"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions."
 * </li>
 * </ul>
 */
public class SecuritiesManagementLatestversionsubsetvariant {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Securities Management - Latest version - subset / variant";
				definition = "Messages that support post-settlement processes for securities (including reporting on securities movements, trades and balances), the processes required to protect beneficial owner's rights throughout settlement, plus any exceptions and investigations related to securities transactions.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReport002V03.mmObject(), SecuritiesMessageCancellationAdvice002V05.mmObject(), SecuritiesBalanceAccountingReport002V09.mmObject(),
						SecuritiesStatementQuery002V06.mmObject(), IntraPositionMovementInstruction002V04.mmObject(), SecuritiesBalanceCustodyReport002V09.mmObject(), SecuritiesTransactionPendingReport002V08.mmObject(),
						IntraPositionMovementConfirmation002V06.mmObject(), IntraPositionMovementStatusAdvice002V05.mmObject(), IntraPositionMovementPostingReport002V06.mmObject(),
						SecuritiesSettlementTransactionAllegementReport002V06.mmObject(), SecuritiesTransactionPostingReport002V07.mmObject());
				code = "semt";
			}
		});
		return mmObject_lazy.get();
	}
}