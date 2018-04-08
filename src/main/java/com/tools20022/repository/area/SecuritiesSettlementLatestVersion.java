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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04
 * SecuritiesStatusOrStatementQueryStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV07
 * SecuritiesSettlementConditionModificationStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV04
 * SecuritiesTransactionStatusQueryV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV04
 * SecuritiesSettlementAllegementRemovalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05
 * SecuritiesTransactionCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05
 * SecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02
 * SecuritiesSettlementTransactionCounterpartyResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07
 * SecuritiesSettlementConditionsModificationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV06
 * SecuritiesFinancingModificationInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07
 * SecuritiesFinancingStatusAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08
 * ReversalOfTransferOutConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08
 * TransferInConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08
 * PortfolioTransferInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08
 * PortfolioTransferCancellationRequestV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08
 * TransferOutCancellationRequestV08}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08
 * TransferInInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08
 * PortfolioTransferConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06
 * AccountHoldingInformationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08
 * TransferOutConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08
 * TransferInCancellationRequestV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08
 * TransferOutInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
 * TransferCancellationStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05
 * AccountHoldingInformationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08
 * ReversalOfTransferInConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV06
 * RequestForTransferStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06
 * TransferInstructionStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08
 * SecuritiesSettlementTransactionGenerationNotificationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06
 * SecuritiesSettlementTransactionModificationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08
 * SecuritiesSettlementTransactionConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV05
 * PortfolioTransferNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
 * SecuritiesFinancingInstructionV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV08
 * SecuritiesFinancingConfirmationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09
 * SecuritiesSettlementTransactionStatusAdviceV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV07
 * SecuritiesSettlementTransactionReversalAdviceV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
 * SecuritiesSettlementTransactionInstructionV08}</li>
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
 * "Securities Settlement - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the settlement process for securities and report its status and confirmation."
 * </li>
 * </ul>
 */
public class SecuritiesSettlementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Settlement - Latest version - master";
				definition = "Messages that support the settlement process for securities and report its status and confirmation.";
				code = "sese";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesStatusOrStatementQueryStatusAdviceV04.mmObject(), SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmObject(),
						SecuritiesSettlementConditionModificationStatusAdviceV07.mmObject(), SecuritiesTransactionStatusQueryV04.mmObject(), SecuritiesSettlementAllegementRemovalAdviceV04.mmObject(),
						SecuritiesTransactionCancellationRequestV05.mmObject(), SecuritiesTransactionCancellationRequestStatusAdviceV05.mmObject(), SecuritiesSettlementTransactionCounterpartyResponseV02.mmObject(),
						SecuritiesSettlementConditionsModificationRequestV07.mmObject(), SecuritiesFinancingModificationInstructionV06.mmObject(), SecuritiesFinancingStatusAdviceV07.mmObject(),
						ReversalOfTransferOutConfirmationV08.mmObject(), TransferInConfirmationV08.mmObject(), PortfolioTransferInstructionV08.mmObject(), PortfolioTransferCancellationRequestV08.mmObject(),
						TransferOutCancellationRequestV08.mmObject(), TransferInInstructionV08.mmObject(), PortfolioTransferConfirmationV08.mmObject(), AccountHoldingInformationV06.mmObject(), TransferOutConfirmationV08.mmObject(),
						TransferInCancellationRequestV08.mmObject(), TransferOutInstructionV08.mmObject(), TransferCancellationStatusReportV06.mmObject(), AccountHoldingInformationRequestV05.mmObject(),
						ReversalOfTransferInConfirmationV08.mmObject(), RequestForTransferStatusReportV06.mmObject(), TransferInstructionStatusReportV06.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV08.mmObject(),
						SecuritiesSettlementTransactionAllegementNotificationV07.mmObject(), SecuritiesSettlementTransactionModificationRequestV06.mmObject(), SecuritiesSettlementTransactionConfirmationV08.mmObject(),
						PortfolioTransferNotificationV05.mmObject(), SecuritiesFinancingInstructionV08.mmObject(), SecuritiesFinancingConfirmationV08.mmObject(), SecuritiesSettlementTransactionStatusAdviceV09.mmObject(),
						SecuritiesSettlementTransactionReversalAdviceV07.mmObject(), SecuritiesSettlementTransactionInstructionV08.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}