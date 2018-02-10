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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the settlement process for securities and report its
 * status and confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "sese"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03
 * SecuritiesSettlementAllegementRemovalAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03
 * SecuritiesStatusOrStatementQueryStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03
 * SecuritiesTransactionStatusQueryV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03
 * PortfolioTransferNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV01
 * SecuritiesSettlementTransactionCounterpartyResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04
 * TransferInstructionStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03
 * AccountHoldingInformationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04
 * AccountHoldingInformationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04
 * TransferCancellationStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV04
 * RequestForTransferStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04
 * SecuritiesTransactionCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV06
 * PortfolioTransferCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06
 * PortfolioTransferConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06
 * PortfolioTransferInstructionV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06
 * TransferInInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06
 * TransferOutConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06
 * TransferOutInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV06
 * TransferOutCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06
 * TransferInConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV06
 * ReversalOfTransferOutConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV06
 * TransferInCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV06
 * ReversalOfTransferInConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04
 * SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06
 * SecuritiesSettlementConditionModificationStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
 * SecuritiesSettlementTransactionInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06
 * SecuritiesFinancingStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV06
 * SecuritiesSettlementConditionsModificationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06
 * SecuritiesSettlementTransactionConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06
 * SecuritiesFinancingInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07
 * SecuritiesSettlementTransactionStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06
 * SecuritiesSettlementTransactionGenerationNotificationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05
 * SecuritiesSettlementTransactionReversalAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06
 * SecuritiesFinancingConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05
 * SecuritiesFinancingModificationInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV04
 * SecuritiesSettlementTransactionModificationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05
 * SecuritiesSettlementTransactionAllegementNotificationV05}</li>
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
 * "Securities Settlement - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the settlement process for securities and report its status and confirmation."
 * </li>
 * </ul>
 */
public class SecuritiesSettlementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Settlement - Previous version - master";
				definition = "Messages that support the settlement process for securities and report its status and confirmation.";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesSettlementAllegementRemovalAdviceV03.mmObject(), SecuritiesStatusOrStatementQueryStatusAdviceV03.mmObject(), SecuritiesTransactionStatusQueryV03.mmObject(),
						PortfolioTransferNotificationV03.mmObject(), SecuritiesSettlementTransactionCounterpartyResponseV01.mmObject(), TransferInstructionStatusReportV04.mmObject(), AccountHoldingInformationRequestV03.mmObject(),
						AccountHoldingInformationV04.mmObject(), TransferCancellationStatusReportV04.mmObject(), RequestForTransferStatusReportV04.mmObject(), SecuritiesTransactionCancellationRequestV04.mmObject(),
						PortfolioTransferCancellationRequestV06.mmObject(), PortfolioTransferConfirmationV06.mmObject(), PortfolioTransferInstructionV06.mmObject(), TransferInInstructionV06.mmObject(),
						TransferOutConfirmationV06.mmObject(), TransferOutInstructionV06.mmObject(), TransferOutCancellationRequestV06.mmObject(), TransferInConfirmationV06.mmObject(), ReversalOfTransferOutConfirmationV06.mmObject(),
						TransferInCancellationRequestV06.mmObject(), ReversalOfTransferInConfirmationV06.mmObject(), SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject(),
						SecuritiesSettlementConditionModificationStatusAdviceV06.mmObject(), SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmObject(), SecuritiesSettlementTransactionInstructionV06.mmObject(),
						SecuritiesFinancingStatusAdviceV06.mmObject(), SecuritiesSettlementConditionsModificationRequestV06.mmObject(), SecuritiesSettlementTransactionConfirmationV06.mmObject(),
						SecuritiesFinancingInstructionV06.mmObject(), SecuritiesSettlementTransactionStatusAdviceV07.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV06.mmObject(),
						SecuritiesSettlementTransactionReversalAdviceV05.mmObject(), SecuritiesFinancingConfirmationV06.mmObject(), SecuritiesFinancingModificationInstructionV05.mmObject(),
						SecuritiesSettlementTransactionModificationRequestV04.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV05.mmObject());
				code = "sese";
			}
		});
		return mmObject_lazy.get();
	}
}