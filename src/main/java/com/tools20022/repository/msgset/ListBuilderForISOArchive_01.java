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

import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03;
import com.tools20022.repository.area.catm.ManagementPlanReplacementV03;
import com.tools20022.repository.area.catm.StatusReportV03;
import com.tools20022.repository.area.catm.TerminalManagementRejectionV02;
import com.tools20022.repository.area.colr.*;
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.area.remt.RemittanceAdviceV01;
import com.tools20022.repository.area.remt.RemittanceLocationAdviceV01;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.tsmt.*;
import java.util.List;

class ListBuilderForISOArchive_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) BaselineReSubmissionV04.mmObject());
		list.add((T) DataSetSubmissionV04.mmObject());
		list.add((T) FullPushThroughReportV04.mmObject());
		list.add((T) BaselineAmendmentRequestV04.mmObject());
		list.add((T) ForwardDataSetSubmissionReportV04.mmObject());
		list.add((T) InitialBaselineSubmissionV04.mmObject());
		list.add((T) ReversalOfTransferInConfirmationV05.mmObject());
		list.add((T) TransferInConfirmationV05.mmObject());
		list.add((T) TransferInstructionStatusReportV04.mmObject());
		list.add((T) AccountHoldingInformationRequestV03.mmObject());
		list.add((T) TransferOutInstructionV05.mmObject());
		list.add((T) AccountHoldingInformationV04.mmObject());
		list.add((T) PortfolioTransferCancellationRequestV05.mmObject());
		list.add((T) TransferCancellationStatusReportV04.mmObject());
		list.add((T) PortfolioTransferInstructionV05.mmObject());
		list.add((T) TransferInInstructionV05.mmObject());
		list.add((T) TransferInCancellationRequestV05.mmObject());
		list.add((T) PortfolioTransferConfirmationV05.mmObject());
		list.add((T) TransferOutConfirmationV05.mmObject());
		list.add((T) RequestForTransferStatusReportV04.mmObject());
		list.add((T) ReversalOfTransferOutConfirmationV05.mmObject());
		list.add((T) TransferOutCancellationRequestV05.mmObject());
		list.add((T) CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmObject());
		list.add((T) CorporateActionCancellationAdviceV05.mmObject());
		list.add((T) CorporateActionMovementConfirmationV05.mmObject());
		list.add((T) CorporateActionNotificationV05.mmObject());
		list.add((T) CorporateActionInstructionStatusAdviceV05.mmObject());
		list.add((T) CorporateActionMovementPreliminaryAdviceV05.mmObject());
		list.add((T) CorporateActionInstructionV05.mmObject());
		list.add((T) CorporateActionMovementReversalAdviceV05.mmObject());
		list.add((T) CorporateActionInstructionCancellationRequestV05.mmObject());
		list.add((T) AccountManagementStatusReportV04.mmObject());
		list.add((T) SecuritiesSettlementTransactionAllegementNotificationV04.mmObject());
		list.add((T) SecuritiesFinancingStatusAdviceV04.mmObject());
		list.add((T) SecuritiesFinancingConfirmationV05.mmObject());
		list.add((T) SecuritiesSettlementTransactionGenerationNotificationV05.mmObject());
		list.add((T) SecuritiesSettlementTransactionReversalAdviceV04.mmObject());
		list.add((T) SecuritiesFinancingInstructionV05.mmObject());
		list.add((T) SecuritiesSettlementTransactionInstructionV05.mmObject());
		list.add((T) SecuritiesSettlementTransactionConfirmationV05.mmObject());
		list.add((T) SecuritiesTransactionCancellationRequestV04.mmObject());
		list.add((T) SecuritiesSettlementConditionModificationStatusAdviceV05.mmObject());
		list.add((T) SecuritiesTransactionPendingReportV05.mmObject());
		list.add((T) SecuritiesTransactionPostingReportV05.mmObject());
		list.add((T) SecuritiesFinancingModificationInstructionV04.mmObject());
		list.add((T) SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmObject());
		list.add((T) SecuritiesSettlementConditionsModificationRequestV05.mmObject());
		list.add((T) SecuritiesBalanceCustodyReportV07.mmObject());
		list.add((T) SecuritiesBalanceAccountingReportV07.mmObject());
		list.add((T) SecuritiesSettlementTransactionStatusAdviceV05.mmObject());
		list.add((T) SecuritiesSettlementTransactionModificationRequestV03.mmObject());
		list.add((T) SecuritiesSettlementTransactionAllegementReportV04.mmObject());
		list.add((T) SecuritiesStatementQueryV04.mmObject());
		list.add((T) TerminalManagementRejectionV02.mmObject());
		list.add((T) AcceptorCancellationAdviceResponseV03.mmObject());
		list.add((T) AcceptorDiagnosticResponseV03.mmObject());
		list.add((T) AcceptorCurrencyConversionResponseV01.mmObject());
		list.add((T) AcceptorCancellationResponseV03.mmObject());
		list.add((T) AcceptorCancellationRequestV03.mmObject());
		list.add((T) AcceptorCurrencyConversionRequestV01.mmObject());
		list.add((T) AcceptorReconciliationResponseV03.mmObject());
		list.add((T) AcceptorBatchTransferResponseV03.mmObject());
		list.add((T) AcceptorCompletionAdviceResponseV03.mmObject());
		list.add((T) AcceptorRejectionV03.mmObject());
		list.add((T) AcceptorDiagnosticRequestV03.mmObject());
		list.add((T) AcceptorAuthorisationRequestV03.mmObject());
		list.add((T) AcceptorBatchTransferV03.mmObject());
		list.add((T) AcceptorCompletionAdviceV03.mmObject());
		list.add((T) AcceptorCancellationAdviceV03.mmObject());
		list.add((T) AcceptorReconciliationRequestV03.mmObject());
		list.add((T) AcceptorConfigurationUpdateV03.mmObject());
		list.add((T) ManagementPlanReplacementV03.mmObject());
		list.add((T) AcceptorAuthorisationResponseV03.mmObject());
		list.add((T) StatusReportV03.mmObject());
		list.add((T) RemittanceLocationAdviceV01.mmObject());
		list.add((T) RemittanceAdviceV01.mmObject());
		list.add((T) AccountOpeningInstructionV05.mmObject());
		list.add((T) AccountModificationInstructionV05.mmObject());
		list.add((T) RequestForAccountManagementStatusReportV03.mmObject());
		list.add((T) AccountDetailsConfirmationV05.mmObject());
		list.add((T) PortfolioTransferCancellationRequestV06.mmObject());
		list.add((T) PortfolioTransferConfirmationV06.mmObject());
		list.add((T) PortfolioTransferInstructionV06.mmObject());
		list.add((T) ResolutionOfInvestigationV05.mmObject());
		list.add((T) BankToCustomerStatementV05.mmObject());
		list.add((T) FinancialInstitutionCreditTransferV05.mmObject());
		list.add((T) BankToCustomerAccountReportV05.mmObject());
		list.add((T) CustomerPaymentReversalV05.mmObject());
		list.add((T) NotificationToReceiveCancellationAdviceV04.mmObject());
		list.add((T) FIToFIPaymentStatusReportV06.mmObject());
		list.add((T) CustomerCreditTransferInitiationV06.mmObject());
		list.add((T) FIToFICustomerDirectDebitV05.mmObject());
		list.add((T) FIToFIPaymentReversalV05.mmObject());
		list.add((T) FIToFIPaymentCancellationRequestV04.mmObject());
		list.add((T) CustomerPaymentStatusReportV06.mmObject());
		list.add((T) NotificationToReceiveStatusReportV04.mmObject());
		list.add((T) PaymentReturnV05.mmObject());
		list.add((T) CustomerDirectDebitInitiationV05.mmObject());
		list.add((T) NotificationToReceiveV04.mmObject());
		list.add((T) FIToFICustomerCreditTransferV05.mmObject());
		list.add((T) CustomerPaymentCancellationRequestV04.mmObject());
		list.add((T) AdditionalPaymentInformationV05.mmObject());
		list.add((T) BankToCustomerDebitCreditNotificationV05.mmObject());
		list.add((T) TransferInInstructionV06.mmObject());
		list.add((T) TransferOutConfirmationV06.mmObject());
		list.add((T) TransferOutInstructionV06.mmObject());
		list.add((T) TransferOutCancellationRequestV06.mmObject());
		list.add((T) TransferInConfirmationV06.mmObject());
		list.add((T) ReversalOfTransferOutConfirmationV06.mmObject());
		list.add((T) TransferInCancellationRequestV06.mmObject());
		list.add((T) ReversalOfTransferInConfirmationV06.mmObject());
		list.add((T) RequestToModifyPaymentV02.mmObject());
		list.add((T) SecuritiesBalanceCustodyReportV08.mmObject());
		list.add((T) SecuritiesTransactionPendingReportV06.mmObject());
		list.add((T) SecuritiesStatementQueryV05.mmObject());
		list.add((T) SecuritiesFinancingStatusAdviceV05.mmObject());
		list.add((T) SecuritiesBalanceAccountingReportV08.mmObject());
		list.add((T) SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject());
		list.add((T) SecuritiesSettlementConditionModificationStatusAdviceV06.mmObject());
		list.add((T) SecuritiesSettlementTransactionStatusAdviceV06.mmObject());
		list.add((T) SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmObject());
		list.add((T) SecuritiesSettlementTransactionAuditTrailReportV02.mmObject());
		list.add((T) CorporateActionMovementConfirmationV06.mmObject());
		list.add((T) CorporateActionInstructionCancellationRequestStatusAdviceV05.mmObject());
		list.add((T) CorporateActionInstructionStatusAdviceV06.mmObject());
		list.add((T) CorporateActionMovementPreliminaryAdviceV06.mmObject());
		list.add((T) CorporateActionMovementReversalAdviceV06.mmObject());
		list.add((T) CreditorPaymentActivationRequestStatusReportV04.mmObject());
		list.add((T) CreditorPaymentActivationRequestV04.mmObject());
		list.add((T) CollateralSubstitutionRequestV03.mmObject());
		list.add((T) InterestPaymentStatementV03.mmObject());
		list.add((T) CollateralAndExposureReportV02.mmObject());
		list.add((T) MarginCallResponseV03.mmObject());
		list.add((T) CollateralManagementCancellationStatusV03.mmObject());
		list.add((T) CollateralProposalResponseV03.mmObject());
		list.add((T) MarginCallRequestV03.mmObject());
		list.add((T) CollateralProposalV03.mmObject());
		list.add((T) MarginCallDisputeNotificationV03.mmObject());
		list.add((T) CollateralManagementCancellationRequestV03.mmObject());
		list.add((T) CollateralSubstitutionResponseV03.mmObject());
		list.add((T) InterestPaymentResponseV03.mmObject());
		list.add((T) InterestPaymentRequestV03.mmObject());
		list.add((T) CollateralSubstitutionConfirmationV03.mmObject());
		list.add((T) AdditionalPaymentInformationV06.mmObject());
		list.add((T) FIToFIPaymentCancellationRequestV05.mmObject());
		list.add((T) RequestToModifyPaymentV03.mmObject());
		list.add((T) ResolutionOfInvestigationV06.mmObject());
		list.add((T) CustomerPaymentCancellationRequestV05.mmObject());
		return list;
	}
}