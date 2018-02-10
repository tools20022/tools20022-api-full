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
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the reporting and advicing of the cash side of any
 * financial transactions, including cash movements, transactions and balances,
 * plus any exceptions and investigations related to cash transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "camt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.PayInCallV02
 * PayInCallV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInEventAcknowledgementV02
 * PayInEventAcknowledgementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.PayInScheduleV03
 * PayInScheduleV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04
 * NotificationOfCaseAssignmentV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03
 * CancelCaseAssignmentV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03
 * CaseStatusReportRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04
 * CaseStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04
 * FundDetailedEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV04
 * FundConfirmedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV03
 * FundDetailedConfirmedCashForecastReportCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04
 * FundEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV03
 * FundConfirmedCashForecastReportCancellationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV04
 * FundDetailedConfirmedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV02
 * BankServicesBillingStatementV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV05
 * NotificationToReceiveStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV05
 * NotificationToReceiveCancellationAdviceV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV05
 * NotificationToReceiveV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NetReportV01
 * NetReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelTransactionV07
 * CancelTransactionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV07
 * BankToCustomerAccountReportV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV07
 * FIToFIPaymentCancellationRequestV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV05
 * DuplicateV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectInvestigationV05
 * RejectInvestigationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV04
 * ProprietaryFormatInvestigationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV05
 * RequestForDuplicateV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05
 * RequestToModifyPaymentV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV06
 * ClaimNonReceiptV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07
 * BankToCustomerStatementV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV06
 * DebitAuthorisationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08
 * ResolutionOfInvestigationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV04
 * DebitAuthorisationResponseV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV06
 * UnableToApplyV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV04
 * AccountReportingRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV07
 * BankToCustomerDebitCreditNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08
 * AdditionalPaymentInformationV08}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetLimitV06 GetLimitV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnStandingOrderV03
 * ReturnStandingOrderV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyMemberV03
 * ModifyMemberV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DeleteLimitV06
 * DeleteLimitV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetStandingOrderV02
 * GetStandingOrderV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnTransactionV07
 * ReturnTransactionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityDebitTransferV04
 * LiquidityDebitTransferV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyLimitV06
 * ModifyLimitV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnAccountV07
 * ReturnAccountV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnCurrencyExchangeRateV03
 * ReturnCurrencyExchangeRateV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetGeneralBusinessInformationV03
 * GetGeneralBusinessInformationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetMemberV03
 * GetMemberV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.BackupPaymentV06
 * BackupPaymentV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DeleteReservationV04
 * DeleteReservationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyReservationV04
 * ModifyReservationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.LiquidityCreditTransferV04
 * LiquidityCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetCurrencyExchangeRateV03
 * GetCurrencyExchangeRateV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnLimitV07
 * ReturnLimitV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetReservationV04
 * GetReservationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnMemberV03
 * ReturnMemberV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnBusinessDayInformationV06
 * ReturnBusinessDayInformationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnGeneralBusinessInformationV05
 * ReturnGeneralBusinessInformationV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReturnReservationV05
 * ReturnReservationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetBusinessDayInformationV04
 * GetBusinessDayInformationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyTransactionV07
 * ModifyTransactionV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetTransactionV07
 * GetTransactionV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ReceiptV04 ReceiptV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ModifyStandingOrderV05
 * ModifyStandingOrderV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.GetAccountV06
 * GetAccountV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DeleteStandingOrderV02
 * DeleteStandingOrderV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV07
 * CustomerPaymentCancellationRequestV07}</li>
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
 * "Cash Management - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions."
 * </li>
 * </ul>
 */
public class CashManagementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cash Management - Latest version - master";
				definition = "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions.";
				messageDefinition_lazy = () -> Arrays.asList(PayInCallV02.mmObject(), PayInEventAcknowledgementV02.mmObject(), PayInScheduleV03.mmObject(), NotificationOfCaseAssignmentV04.mmObject(), CancelCaseAssignmentV03.mmObject(),
						CaseStatusReportRequestV03.mmObject(), CaseStatusReportV04.mmObject(), FundDetailedEstimatedCashForecastReportV04.mmObject(), FundConfirmedCashForecastReportV04.mmObject(),
						FundDetailedConfirmedCashForecastReportCancellationV03.mmObject(), FundEstimatedCashForecastReportV04.mmObject(), FundConfirmedCashForecastReportCancellationV03.mmObject(),
						FundDetailedConfirmedCashForecastReportV04.mmObject(), BankServicesBillingStatementV02.mmObject(), NotificationToReceiveStatusReportV05.mmObject(), NotificationToReceiveCancellationAdviceV05.mmObject(),
						NotificationToReceiveV05.mmObject(), NetReportV01.mmObject(), CancelTransactionV07.mmObject(), BankToCustomerAccountReportV07.mmObject(), FIToFIPaymentCancellationRequestV07.mmObject(), DuplicateV05.mmObject(),
						RejectInvestigationV05.mmObject(), ProprietaryFormatInvestigationV04.mmObject(), RequestForDuplicateV05.mmObject(), RequestToModifyPaymentV05.mmObject(), ClaimNonReceiptV06.mmObject(),
						BankToCustomerStatementV07.mmObject(), DebitAuthorisationRequestV06.mmObject(), ResolutionOfInvestigationV08.mmObject(), DebitAuthorisationResponseV04.mmObject(), UnableToApplyV06.mmObject(),
						AccountReportingRequestV04.mmObject(), BankToCustomerDebitCreditNotificationV07.mmObject(), AdditionalPaymentInformationV08.mmObject(), GetLimitV06.mmObject(), ReturnStandingOrderV03.mmObject(),
						ModifyMemberV03.mmObject(), DeleteLimitV06.mmObject(), GetStandingOrderV02.mmObject(), ReturnTransactionV07.mmObject(), LiquidityDebitTransferV04.mmObject(), ModifyLimitV06.mmObject(), ReturnAccountV07.mmObject(),
						ReturnCurrencyExchangeRateV03.mmObject(), GetGeneralBusinessInformationV03.mmObject(), GetMemberV03.mmObject(), BackupPaymentV06.mmObject(), DeleteReservationV04.mmObject(), ModifyReservationV04.mmObject(),
						LiquidityCreditTransferV04.mmObject(), GetCurrencyExchangeRateV03.mmObject(), ReturnLimitV07.mmObject(), GetReservationV04.mmObject(), ReturnMemberV03.mmObject(), ReturnBusinessDayInformationV06.mmObject(),
						ReturnGeneralBusinessInformationV05.mmObject(), ReturnReservationV05.mmObject(), GetBusinessDayInformationV04.mmObject(), ModifyTransactionV07.mmObject(), GetTransactionV07.mmObject(), ReceiptV04.mmObject(),
						ModifyStandingOrderV05.mmObject(), GetAccountV06.mmObject(), DeleteStandingOrderV02.mmObject(), CustomerPaymentCancellationRequestV07.mmObject());
				code = "camt";
			}
		});
		return mmObject_lazy.get();
	}
}