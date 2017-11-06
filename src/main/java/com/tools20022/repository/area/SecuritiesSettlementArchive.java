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
import com.tools20022.repository.area.sese.*;
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
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01
 * PEPOrISAOrPortfolioInformationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02
 * AccountHoldingInformationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV03
 * AccountHoldingInformationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferCancellationRequestV02
 * PEPOrISAOrPortfolioTransferCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV03
 * PortfolioTransferCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV04
 * PortfolioTransferCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02
 * PEPOrISAOrPortfolioTransferConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV03
 * PortfolioTransferConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV04
 * PortfolioTransferConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02
 * PEPOrISAOrPortfolioTransferInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03
 * PortfolioTransferInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV04
 * PortfolioTransferInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmation
 * ReversalOfTransferInConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV02
 * ReversalOfTransferInConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV03
 * ReversalOfTransferInConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV04
 * ReversalOfTransferInConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmation
 * ReversalOfTransferOutConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV02
 * ReversalOfTransferOutConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV03
 * ReversalOfTransferOutConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV04
 * ReversalOfTransferOutConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV01
 * SecuritiesSettlementTransactionModificationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationInstruction
 * TransferInCancellationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV02
 * TransferInCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV03
 * TransferInCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV04
 * TransferInCancellationRequestV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInConfirmation
 * TransferInConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV02
 * TransferInConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV03
 * TransferInConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04
 * TransferInConfirmationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstruction
 * TransferInInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV02
 * TransferInInstructionV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV03
 * TransferInInstructionV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04
 * TransferInInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationInstruction
 * TransferOutCancellationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV02
 * TransferOutCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV03
 * TransferOutCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV04
 * TransferOutCancellationRequestV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferOutConfirmation
 * TransferOutConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV02
 * TransferOutConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV03
 * TransferOutConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04
 * TransferOutConfirmationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferOutInstruction
 * TransferOutInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV02
 * TransferOutInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV03
 * TransferOutInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04
 * TransferOutInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01
 * SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV02
 * SecuritiesFinancingConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03
 * SecuritiesFinancingConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04
 * SecuritiesFinancingConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01
 * SecuritiesFinancingInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02
 * SecuritiesFinancingInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03
 * SecuritiesFinancingInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV01
 * SecuritiesSettlementConditionModificationStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV02
 * SecuritiesSettlementConditionModificationStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03
 * SecuritiesSettlementConditionModificationStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV04
 * SecuritiesSettlementConditionModificationStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01
 * SecuritiesSettlementConditionsModificationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02
 * SecuritiesSettlementConditionsModificationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03
 * SecuritiesSettlementConditionsModificationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04
 * SecuritiesSettlementConditionsModificationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01
 * SecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02
 * SecuritiesSettlementTransactionConfirmationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03
 * SecuritiesSettlementTransactionConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04
 * SecuritiesSettlementTransactionConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01
 * SecuritiesSettlementTransactionGenerationNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV02
 * SecuritiesSettlementTransactionGenerationNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV03
 * SecuritiesSettlementTransactionGenerationNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04
 * SecuritiesSettlementTransactionGenerationNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
 * SecuritiesSettlementTransactionInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
 * SecuritiesSettlementTransactionInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
 * SecuritiesSettlementTransactionInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
 * SecuritiesSettlementTransactionInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV02
 * SecuritiesSettlementTransactionModificationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01
 * SecuritiesSettlementTransactionStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV02
 * SecuritiesSettlementTransactionStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03
 * SecuritiesSettlementTransactionStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04
 * SecuritiesSettlementTransactionStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04
 * SecuritiesFinancingInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReport
 * RequestForTransferStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV02
 * RequestForTransferStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV03
 * RequestForTransferStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReport
 * TransferCancellationStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02
 * TransferCancellationStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03
 * TransferCancellationStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReport
 * TransferInstructionStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02
 * TransferInstructionStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03
 * TransferInstructionStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForPEPOrISAOrPortfolioInformationV01
 * RequestForPEPOrISAOrPortfolioInformationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV02
 * AccountHoldingInformationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01
 * PortfolioTransferNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02
 * PortfolioTransferNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01
 * SecuritiesFinancingModificationInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV02
 * SecuritiesFinancingModificationInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01
 * SecuritiesFinancingStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02
 * SecuritiesFinancingStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV01
 * SecuritiesSettlementAllegementRemovalAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV02
 * SecuritiesSettlementAllegementRemovalAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01
 * SecuritiesSettlementTransactionAllegementNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02
 * SecuritiesSettlementTransactionAllegementNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01
 * SecuritiesSettlementTransactionReversalAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02
 * SecuritiesSettlementTransactionReversalAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV01
 * SecuritiesStatusOrStatementQueryStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV02
 * SecuritiesStatusOrStatementQueryStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01
 * SecuritiesTransactionCancellationRequestStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV02
 * SecuritiesTransactionCancellationRequestStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV01
 * SecuritiesTransactionCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV02
 * SecuritiesTransactionCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV01
 * SecuritiesTransactionStatusQueryV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV02
 * SecuritiesTransactionStatusQueryV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV03
 * SecuritiesFinancingModificationInstructionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03
 * SecuritiesFinancingStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03
 * SecuritiesSettlementTransactionAllegementNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03
 * SecuritiesSettlementTransactionReversalAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV03
 * SecuritiesTransactionCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV03
 * SecuritiesTransactionCancellationRequestStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV05
 * ReversalOfTransferInConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05
 * TransferInConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05
 * TransferOutInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV05
 * PortfolioTransferCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV05
 * PortfolioTransferInstructionV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05
 * TransferInInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV05
 * TransferInCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05
 * PortfolioTransferConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05
 * TransferOutConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV05
 * ReversalOfTransferOutConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05
 * TransferOutCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04
 * SecuritiesSettlementTransactionAllegementNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04
 * SecuritiesFinancingStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05
 * SecuritiesFinancingConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05
 * SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04
 * SecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05
 * SecuritiesFinancingInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
 * SecuritiesSettlementTransactionInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05
 * SecuritiesSettlementTransactionConfirmationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV05
 * SecuritiesSettlementConditionModificationStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV04
 * SecuritiesFinancingModificationInstructionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05
 * SecuritiesSettlementConditionsModificationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05
 * SecuritiesSettlementTransactionStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV03
 * SecuritiesSettlementTransactionModificationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05
 * SecuritiesFinancingStatusAdviceV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06
 * SecuritiesSettlementTransactionStatusAdviceV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Settlement - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the settlement process for securities and report its status and confirmation."
 * </li>
 * </ul>
 */
public class SecuritiesSettlementArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Settlement - Archive - master";
				definition = "Messages that support the settlement process for securities and report its status and confirmation.";
				messageDefinition_lazy = () -> Arrays.asList(PEPOrISAOrPortfolioInformationV01.mmObject(), AccountHoldingInformationV02.mmObject(), AccountHoldingInformationV03.mmObject(),
						PEPOrISAOrPortfolioTransferCancellationRequestV02.mmObject(), PortfolioTransferCancellationRequestV03.mmObject(), PortfolioTransferCancellationRequestV04.mmObject(),
						PEPOrISAOrPortfolioTransferConfirmationV02.mmObject(), PortfolioTransferConfirmationV03.mmObject(), PortfolioTransferConfirmationV04.mmObject(), PEPOrISAOrPortfolioTransferInstructionV02.mmObject(),
						PortfolioTransferInstructionV03.mmObject(), PortfolioTransferInstructionV04.mmObject(), ReversalOfTransferInConfirmation.mmObject(), ReversalOfTransferInConfirmationV02.mmObject(),
						ReversalOfTransferInConfirmationV03.mmObject(), ReversalOfTransferInConfirmationV04.mmObject(), ReversalOfTransferOutConfirmation.mmObject(), ReversalOfTransferOutConfirmationV02.mmObject(),
						ReversalOfTransferOutConfirmationV03.mmObject(), ReversalOfTransferOutConfirmationV04.mmObject(), SecuritiesSettlementTransactionModificationRequestV01.mmObject(), TransferInCancellationInstruction.mmObject(),
						TransferInCancellationRequestV02.mmObject(), TransferInCancellationRequestV03.mmObject(), TransferInCancellationRequestV04.mmObject(), TransferInConfirmation.mmObject(), TransferInConfirmationV02.mmObject(),
						TransferInConfirmationV03.mmObject(), TransferInConfirmationV04.mmObject(), TransferInInstruction.mmObject(), TransferInInstructionV02.mmObject(), TransferInInstructionV03.mmObject(),
						TransferInInstructionV04.mmObject(), TransferOutCancellationInstruction.mmObject(), TransferOutCancellationRequestV02.mmObject(), TransferOutCancellationRequestV03.mmObject(),
						TransferOutCancellationRequestV04.mmObject(), TransferOutConfirmation.mmObject(), TransferOutConfirmationV02.mmObject(), TransferOutConfirmationV03.mmObject(), TransferOutConfirmationV04.mmObject(),
						TransferOutInstruction.mmObject(), TransferOutInstructionV02.mmObject(), TransferOutInstructionV03.mmObject(), TransferOutInstructionV04.mmObject(), SecuritiesFinancingConfirmationV01.mmObject(),
						SecuritiesFinancingConfirmationV02.mmObject(), SecuritiesFinancingConfirmationV03.mmObject(), SecuritiesFinancingConfirmationV04.mmObject(), SecuritiesFinancingInstructionV01.mmObject(),
						SecuritiesFinancingInstructionV02.mmObject(), SecuritiesFinancingInstructionV03.mmObject(), SecuritiesSettlementConditionModificationStatusAdviceV01.mmObject(),
						SecuritiesSettlementConditionModificationStatusAdviceV02.mmObject(), SecuritiesSettlementConditionModificationStatusAdviceV03.mmObject(), SecuritiesSettlementConditionModificationStatusAdviceV04.mmObject(),
						SecuritiesSettlementConditionsModificationRequestV01.mmObject(), SecuritiesSettlementConditionsModificationRequestV02.mmObject(), SecuritiesSettlementConditionsModificationRequestV03.mmObject(),
						SecuritiesSettlementConditionsModificationRequestV04.mmObject(), SecuritiesSettlementTransactionConfirmationV01.mmObject(), SecuritiesSettlementTransactionConfirmationV02.mmObject(),
						SecuritiesSettlementTransactionConfirmationV03.mmObject(), SecuritiesSettlementTransactionConfirmationV04.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV01.mmObject(),
						SecuritiesSettlementTransactionGenerationNotificationV02.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV03.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV04.mmObject(),
						SecuritiesSettlementTransactionInstructionV01.mmObject(), SecuritiesSettlementTransactionInstructionV02.mmObject(), SecuritiesSettlementTransactionInstructionV03.mmObject(),
						SecuritiesSettlementTransactionInstructionV04.mmObject(), SecuritiesSettlementTransactionModificationRequestV02.mmObject(), SecuritiesSettlementTransactionStatusAdviceV01.mmObject(),
						SecuritiesSettlementTransactionStatusAdviceV02.mmObject(), SecuritiesSettlementTransactionStatusAdviceV03.mmObject(), SecuritiesSettlementTransactionStatusAdviceV04.mmObject(),
						SecuritiesFinancingInstructionV04.mmObject(), RequestForTransferStatusReport.mmObject(), RequestForTransferStatusReportV02.mmObject(), RequestForTransferStatusReportV03.mmObject(),
						TransferCancellationStatusReport.mmObject(), TransferCancellationStatusReportV02.mmObject(), TransferCancellationStatusReportV03.mmObject(), TransferInstructionStatusReport.mmObject(),
						TransferInstructionStatusReportV02.mmObject(), TransferInstructionStatusReportV03.mmObject(), RequestForPEPOrISAOrPortfolioInformationV01.mmObject(), AccountHoldingInformationRequestV02.mmObject(),
						PortfolioTransferNotificationV01.mmObject(), PortfolioTransferNotificationV02.mmObject(), SecuritiesFinancingModificationInstructionV01.mmObject(), SecuritiesFinancingModificationInstructionV02.mmObject(),
						SecuritiesFinancingStatusAdviceV01.mmObject(), SecuritiesFinancingStatusAdviceV02.mmObject(), SecuritiesSettlementAllegementRemovalAdviceV01.mmObject(), SecuritiesSettlementAllegementRemovalAdviceV02.mmObject(),
						SecuritiesSettlementTransactionAllegementNotificationV01.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV02.mmObject(), SecuritiesSettlementTransactionReversalAdviceV01.mmObject(),
						SecuritiesSettlementTransactionReversalAdviceV02.mmObject(), SecuritiesStatusOrStatementQueryStatusAdviceV01.mmObject(), SecuritiesStatusOrStatementQueryStatusAdviceV02.mmObject(),
						SecuritiesTransactionCancellationRequestStatusAdviceV01.mmObject(), SecuritiesTransactionCancellationRequestStatusAdviceV02.mmObject(), SecuritiesTransactionCancellationRequestV01.mmObject(),
						SecuritiesTransactionCancellationRequestV02.mmObject(), SecuritiesTransactionStatusQueryV01.mmObject(), SecuritiesTransactionStatusQueryV02.mmObject(), SecuritiesFinancingModificationInstructionV03.mmObject(),
						SecuritiesFinancingStatusAdviceV03.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV03.mmObject(), SecuritiesSettlementTransactionReversalAdviceV03.mmObject(),
						SecuritiesTransactionCancellationRequestV03.mmObject(), SecuritiesTransactionCancellationRequestStatusAdviceV03.mmObject(), SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmObject(),
						ReversalOfTransferInConfirmationV05.mmObject(), TransferInConfirmationV05.mmObject(), TransferOutInstructionV05.mmObject(), PortfolioTransferCancellationRequestV05.mmObject(),
						PortfolioTransferInstructionV05.mmObject(), TransferInInstructionV05.mmObject(), TransferInCancellationRequestV05.mmObject(), PortfolioTransferConfirmationV05.mmObject(), TransferOutConfirmationV05.mmObject(),
						ReversalOfTransferOutConfirmationV05.mmObject(), TransferOutCancellationRequestV05.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV04.mmObject(), SecuritiesFinancingStatusAdviceV04.mmObject(),
						SecuritiesFinancingConfirmationV05.mmObject(), SecuritiesSettlementTransactionGenerationNotificationV05.mmObject(), SecuritiesSettlementTransactionReversalAdviceV04.mmObject(),
						SecuritiesFinancingInstructionV05.mmObject(), SecuritiesSettlementTransactionInstructionV05.mmObject(), SecuritiesSettlementTransactionConfirmationV05.mmObject(),
						SecuritiesSettlementConditionModificationStatusAdviceV05.mmObject(), SecuritiesFinancingModificationInstructionV04.mmObject(), SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmObject(),
						SecuritiesSettlementConditionsModificationRequestV05.mmObject(), SecuritiesSettlementTransactionStatusAdviceV05.mmObject(), SecuritiesSettlementTransactionModificationRequestV03.mmObject(),
						SecuritiesFinancingStatusAdviceV05.mmObject(), SecuritiesSettlementTransactionStatusAdviceV06.mmObject());
				code = "sese";
			}
		});
		return mmObject_lazy.get();
	}
}