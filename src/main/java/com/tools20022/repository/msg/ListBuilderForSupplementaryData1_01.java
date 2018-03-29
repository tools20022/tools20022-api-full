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

package com.tools20022.repository.msg;

import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.admi.ReceiptAcknowledgementV01;
import com.tools20022.repository.area.admi.ReportQueryRequestV01;
import com.tools20022.repository.area.admi.ResendRequestV01;
import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.other.DerivativesTradeReportQueryV01;
import com.tools20022.repository.area.other.DerivativesTradeReportV01;
import com.tools20022.repository.area.pacs.FIToFIPaymentReversalV08;
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV09;
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02;
import com.tools20022.repository.area.pacs.PaymentReturnV08;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV08;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09;
import com.tools20022.repository.area.pain.MandateCopyRequestV01;
import com.tools20022.repository.area.reda.*;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V07;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07;
import com.tools20022.repository.area.semt.IntraPositionMovementStatusAdvice002V05;
import com.tools20022.repository.area.sese.*;
import java.util.List;

class ListBuilderForSupplementaryData1_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) MandateCopyRequestV01.mmSupplementaryData);
		list.add((T) IntraPositionMovementConfirmation002V06.mmSupplementaryData);
		list.add((T) IntraPositionMovementStatusAdvice002V05.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionAllegementNotification002V06.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionInstruction002V07.mmSupplementaryData);
		list.add((T) CorporateActionInstructionCancellationRequest002V07.mmSupplementaryData);
		list.add((T) CorporateActionEventProcessingStatusAdvice002V06.mmSupplementaryData);
		list.add((T) SecuritiesFinancingConfirmation002V07.mmSupplementaryData);
		list.add((T) SecuritiesFinancingStatusAdvice002V07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementConditionsModificationRequest002V07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionStatusAdvice002V08.mmSupplementaryData);
		list.add((T) SecuritiesFinancingInstruction002V07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionGenerationNotification002V07.mmSupplementaryData);
		list.add((T) SecuritiesFinancingModificationInstruction002V06.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionConfirmation002V07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionReversalAdvice002V06.mmSupplementaryData);
		list.add((T) MoneyMarketUnsecuredMarketStatisticalReportV02.mmSupplementaryData);
		list.add((T) MoneyMarketForeignExchangeSwapsStatisticalReportV02.mmSupplementaryData);
		list.add((T) MoneyMarketSecuredMarketStatisticalReportV02.mmSupplementaryData);
		list.add((T) MoneyMarketOvernightIndexSwapsStatisticalReportV02.mmSupplementaryData);
		list.add((T) com.tools20022.repository.area.other.FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData);
		list.add((T) DerivativesTradeReportV01.mmSupplementaryData);
		list.add((T) DerivativesTradeReportQueryV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingTradingVolumeCapDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingInstrumentClassificationReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonEquityTradingActivityResultV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingEquityTradingActivityResultV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingEquityTransparencyDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingReferenceDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingInvalidReferenceDataReportV01.mmSupplementaryData);
		list.add((T) com.tools20022.repository.area.auth.FinancialInstrumentReportingStatusAdviceV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonWorkingDayReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingTransactionReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingEquityTradingActivityReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingCurrencyCodeReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingReferenceDataIndexReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingMarketIdentificationCodeReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonEquityTransparencyDataReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingReferenceDataDeltaReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingCountryCodeReportV01.mmSupplementaryData);
		list.add((T) FinancialInstrumentReportingNonEquityTradingActivityReportV01.mmSupplementaryData);
		list.add((T) CCPIncomeStatementAndCapitalAdequacyReportV01.mmSupplementaryData);
		list.add((T) CCPMemberObligationsReportV01.mmSupplementaryData);
		list.add((T) CCPClearedProductReportV01.mmSupplementaryData);
		list.add((T) CCPCollateralReportV01.mmSupplementaryData);
		list.add((T) CCPAvailableFinancialResourcesReportV01.mmSupplementaryData);
		list.add((T) CCPDailyCashFlowsReportV01.mmSupplementaryData);
		list.add((T) CCPPortfolioStressTestingDefinitionReportV01.mmSupplementaryData);
		list.add((T) CCPInvestmentsReportV01.mmSupplementaryData);
		list.add((T) CCPBackTestingDefinitionReportV01.mmSupplementaryData);
		list.add((T) CCPAccountPositionReportV01.mmSupplementaryData);
		list.add((T) CCPPortfolioStressTestingResultReportV01.mmSupplementaryData);
		list.add((T) CCPLiquidityStressTestingDefinitionReportV01.mmSupplementaryData);
		list.add((T) CCPClearingMemberReportV01.mmSupplementaryData);
		list.add((T) CCPMemberRequirementsReportV01.mmSupplementaryData);
		list.add((T) CCPLiquidityStressTestingResultReportV01.mmSupplementaryData);
		list.add((T) CCPBackTestingResultReportV01.mmSupplementaryData);
		list.add((T) BankToCustomerAccountReportV07.mmSupplementaryData);
		list.add((T) FIToFIPaymentCancellationRequestV07.mmSupplementaryData);
		list.add((T) DuplicateV05.mmSupplementaryData);
		list.add((T) RejectInvestigationV05.mmSupplementaryData);
		list.add((T) ProprietaryFormatInvestigationV04.mmSupplementaryData);
		list.add((T) RequestForDuplicateV05.mmSupplementaryData);
		list.add((T) FIToFIPaymentReversalV08.mmSupplementaryData);
		list.add((T) RequestToModifyPaymentV05.mmSupplementaryData);
		list.add((T) ClaimNonReceiptV06.mmSupplementaryData);
		list.add((T) BankToCustomerStatementV07.mmSupplementaryData);
		list.add((T) DebitAuthorisationRequestV06.mmSupplementaryData);
		list.add((T) ResolutionOfInvestigationV08.mmSupplementaryData);
		list.add((T) DebitAuthorisationResponseV04.mmSupplementaryData);
		list.add((T) UnableToApplyV06.mmSupplementaryData);
		list.add((T) AccountReportingRequestV04.mmSupplementaryData);
		list.add((T) BankToCustomerDebitCreditNotificationV07.mmSupplementaryData);
		list.add((T) PaymentReturnV08.mmSupplementaryData);
		list.add((T) FIToFIPaymentStatusReportV09.mmSupplementaryData);
		list.add((T) AdditionalPaymentInformationV08.mmSupplementaryData);
		list.add((T) GetLimitV06.mmSupplementaryData);
		list.add((T) ReturnStandingOrderV03.mmSupplementaryData);
		list.add((T) ModifyMemberV03.mmSupplementaryData);
		list.add((T) DeleteLimitV06.mmSupplementaryData);
		list.add((T) GetStandingOrderV02.mmSupplementaryData);
		list.add((T) ReturnTransactionV07.mmSupplementaryData);
		list.add((T) LiquidityDebitTransferV04.mmSupplementaryData);
		list.add((T) ModifyLimitV06.mmSupplementaryData);
		list.add((T) ReturnAccountV07.mmSupplementaryData);
		list.add((T) ReturnCurrencyExchangeRateV03.mmSupplementaryData);
		list.add((T) GetGeneralBusinessInformationV03.mmSupplementaryData);
		list.add((T) GetMemberV03.mmSupplementaryData);
		list.add((T) BackupPaymentV06.mmSupplementaryData);
		list.add((T) DeleteReservationV04.mmSupplementaryData);
		list.add((T) ModifyReservationV04.mmSupplementaryData);
		list.add((T) LiquidityCreditTransferV04.mmSupplementaryData);
		list.add((T) GetCurrencyExchangeRateV03.mmSupplementaryData);
		list.add((T) ReturnLimitV07.mmSupplementaryData);
		list.add((T) GetReservationV04.mmSupplementaryData);
		list.add((T) ReturnMemberV03.mmSupplementaryData);
		list.add((T) ReturnBusinessDayInformationV06.mmSupplementaryData);
		list.add((T) ReturnGeneralBusinessInformationV05.mmSupplementaryData);
		list.add((T) ReturnReservationV05.mmSupplementaryData);
		list.add((T) GetBusinessDayInformationV04.mmSupplementaryData);
		list.add((T) ModifyTransactionV07.mmSupplementaryData);
		list.add((T) GetTransactionV07.mmSupplementaryData);
		list.add((T) ReceiptV04.mmSupplementaryData);
		list.add((T) ModifyStandingOrderV05.mmSupplementaryData);
		list.add((T) GetAccountV06.mmSupplementaryData);
		list.add((T) DeleteStandingOrderV02.mmSupplementaryData);
		list.add((T) AccountSwitchInformationResponseV01.mmSupplementaryData);
		list.add((T) AccountSwitchBalanceTransferAcknowledgementV01.mmSupplementaryData);
		list.add((T) AccountSwitchTechnicalRejectionV01.mmSupplementaryData);
		list.add((T) AccountSwitchPaymentResponseV01.mmSupplementaryData);
		list.add((T) AccountSwitchNotifyAccountSwitchCompleteV01.mmSupplementaryData);
		list.add((T) AccountSwitchRequestBalanceTransferV01.mmSupplementaryData);
		list.add((T) AccountSwitchInformationRequestV01.mmSupplementaryData);
		list.add((T) AccountSwitchRequestRedirectionV01.mmSupplementaryData);
		list.add((T) AccountSwitchTerminationSwitchV01.mmSupplementaryData);
		list.add((T) AccountSwitchCancelExistingPaymentV01.mmSupplementaryData);
		list.add((T) AccountSwitchRequestPaymentV01.mmSupplementaryData);
		list.add((T) IntraPositionMovementConfirmationV07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionGenerationNotificationV08.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionAllegementNotificationV07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionConfirmationV08.mmSupplementaryData);
		list.add((T) SecuritiesFinancingInstructionV08.mmSupplementaryData);
		list.add((T) SecuritiesFinancingConfirmationV08.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionStatusAdviceV09.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionReversalAdviceV07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionInstructionV08.mmSupplementaryData);
		list.add((T) CorporateActionInstructionStatementReportV07.mmSupplementaryData);
		list.add((T) CorporateActionMovementReversalAdviceV09.mmSupplementaryData);
		list.add((T) CorporateActionNotificationV08.mmSupplementaryData);
		list.add((T) CorporateActionInstructionV08.mmSupplementaryData);
		list.add((T) CorporateActionMovementConfirmationV09.mmSupplementaryData);
		list.add((T) CorporateActionMovementPreliminaryAdviceCancellationAdviceV08.mmSupplementaryData);
		list.add((T) CorporateActionMovementPreliminaryAdviceV09.mmSupplementaryData);
		list.add((T) CorporateActionInstructionStatusAdviceV09.mmSupplementaryData);
		list.add((T) CorporateActionCancellationAdviceV08.mmSupplementaryData);
		list.add((T) CorporateActionInstructionCancellationRequestStatusAdviceV08.mmSupplementaryData);
		list.add((T) CustomerPaymentStatusReportV09.mmSupplementaryData);
		list.add((T) CustomerPaymentCancellationRequestV07.mmSupplementaryData);
		list.add((T) CustomerPaymentReversalV08.mmSupplementaryData);
		list.add((T) FIToFIPaymentStatusRequestV02.mmSupplementaryData);
		list.add((T) CorporateActionCancellationAdvice002V08.mmSupplementaryData);
		list.add((T) CorporateActionInstructionCancellationRequestStatusAdvice002V08.mmSupplementaryData);
		list.add((T) CorporateActionInstructionStatementReport002V07.mmSupplementaryData);
		list.add((T) CorporateActionInstructionStatusAdvice002V09.mmSupplementaryData);
		list.add((T) CorporateActionInstruction002V08.mmSupplementaryData);
		list.add((T) CorporateActionMovementConfirmation002V09.mmSupplementaryData);
		list.add((T) CorporateActionMovementPreliminaryAdviceCancellationAdvice002V08.mmSupplementaryData);
		list.add((T) CorporateActionMovementPreliminaryAdvice002V09.mmSupplementaryData);
		list.add((T) CorporateActionMovementReversalAdvice002V09.mmSupplementaryData);
		list.add((T) CorporateActionNotification002V08.mmSupplementaryData);
		list.add((T) IntraPositionMovementConfirmation002V07.mmSupplementaryData);
		list.add((T) SecuritiesFinancingConfirmation002V08.mmSupplementaryData);
		list.add((T) SecuritiesFinancingInstruction002V08.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionAllegementNotification002V07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionConfirmation002V08.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionGenerationNotification002V08.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionInstruction002V08.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionReversalAdvice002V07.mmSupplementaryData);
		list.add((T) SecuritiesSettlementTransactionStatusAdvice002V09.mmSupplementaryData);
		list.add((T) PartyAuditTrailQueryV01.mmSupplementaryData);
		list.add((T) PartyActivityAdviceV01.mmSupplementaryData);
		list.add((T) PartyCreationRequestV01.mmSupplementaryData);
		list.add((T) PartyReportV01.mmSupplementaryData);
		list.add((T) PartyAuditTrailReportV02.mmSupplementaryData);
		list.add((T) PartyDeletionRequestV01.mmSupplementaryData);
		list.add((T) PartyQueryV01.mmSupplementaryData);
		list.add((T) PartyStatusAdviceV01.mmSupplementaryData);
		list.add((T) PartyModificationRequestV01.mmSupplementaryData);
		list.add((T) ReportQueryRequestV01.mmSupplementaryData);
		list.add((T) ResendRequestV01.mmSupplementaryData);
		list.add((T) ReceiptAcknowledgementV01.mmSupplementaryData);
		return list;
	}
}