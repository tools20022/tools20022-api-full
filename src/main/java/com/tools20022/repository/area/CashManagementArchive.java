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
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV01
 * BankToCustomerAccountReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV02
 * BankToCustomerAccountReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV03
 * BankToCustomerAccountReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV04
 * BankToCustomerAccountReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV01
 * BankToCustomerDebitCreditNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV02
 * BankToCustomerDebitCreditNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV03
 * BankToCustomerDebitCreditNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04
 * BankToCustomerDebitCreditNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV01
 * BankToCustomerStatementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV02
 * BankToCustomerStatementV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV03
 * BankToCustomerStatementV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV04
 * BankToCustomerStatementV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV01
 * CustomerPaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV02
 * CustomerPaymentCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03
 * CustomerPaymentCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV01
 * FIToFIPaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV02
 * FIToFIPaymentCancellationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV03
 * FIToFIPaymentCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV01
 * FundConfirmedCashForecastReportCancellationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV02
 * FundConfirmedCashForecastReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV01
 * FundDetailedConfirmedCashForecastReportCancellationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV02
 * FundDetailedConfirmedCashForecastReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02
 * FundDetailedEstimatedCashForecastReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02
 * FundEstimatedCashForecastReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RequestToModifyPayment
 * RequestToModifyPayment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RequestToCancelPayment
 * RequestToCancelPayment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApply
 * UnableToApply}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceipt
 * ClaimNonReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformation
 * AdditionalPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigation
 * ResolutionOfInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignment
 * NotificationOfCaseAssignment}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectCaseAssignment
 * RejectCaseAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestForDuplicateInstruction
 * RequestForDuplicateInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponse
 * DebitAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequest
 * DebitAuthorisationRequest}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequest
 * CaseStatusReportRequest}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReport
 * CaseStatusReport}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelCaseAssignment
 * CancelCaseAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV02
 * AccountReportingRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV02
 * NotificationToReceiveV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV02
 * NotificationToReceiveCancellationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV02
 * NotificationToReceiveStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03_replaced
 * RequestToModifyPaymentV03_replaced}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV03
 * UnableToApplyV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03
 * ClaimNonReceiptV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV03
 * AdditionalPaymentInformationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03
 * ResolutionOfInvestigationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectInvestigationV03
 * RejectInvestigationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV03
 * RequestForDuplicateV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV03
 * DuplicateV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV02
 * ProprietaryFormatInvestigationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02
 * DebitAuthorisationResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV03
 * DebitAuthorisationRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV04
 * UnableToApplyV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04
 * ClaimNonReceiptV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV04
 * AdditionalPaymentInformationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04
 * ResolutionOfInvestigationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04
 * DebitAuthorisationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV01
 * RequestToModifyPaymentV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV03
 * NotificationToReceiveV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV03
 * NotificationToReceiveCancellationAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV03
 * NotificationToReceiveStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05
 * ResolutionOfInvestigationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05
 * BankToCustomerStatementV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05
 * BankToCustomerAccountReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV04
 * FIToFIPaymentCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04
 * CustomerPaymentCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV05
 * AdditionalPaymentInformationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05
 * BankToCustomerDebitCreditNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV02
 * RequestToModifyPaymentV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV06
 * AdditionalPaymentInformationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV05
 * FIToFIPaymentCancellationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03
 * RequestToModifyPaymentV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06
 * ResolutionOfInvestigationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV05
 * CustomerPaymentCancellationRequestV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cash Management - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CashManagementArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cash Management - Archive - master";
				definition = "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions.";
				code = "camt";
				messageDefinition_lazy = () -> Arrays.asList(BankToCustomerAccountReportV01.mmObject(), BankToCustomerAccountReportV02.mmObject(), BankToCustomerAccountReportV03.mmObject(), BankToCustomerAccountReportV04.mmObject(),
						BankToCustomerDebitCreditNotificationV01.mmObject(), BankToCustomerDebitCreditNotificationV02.mmObject(), BankToCustomerDebitCreditNotificationV03.mmObject(), BankToCustomerDebitCreditNotificationV04.mmObject(),
						BankToCustomerStatementV01.mmObject(), BankToCustomerStatementV02.mmObject(), BankToCustomerStatementV03.mmObject(), BankToCustomerStatementV04.mmObject(), CustomerPaymentCancellationRequestV01.mmObject(),
						CustomerPaymentCancellationRequestV02.mmObject(), CustomerPaymentCancellationRequestV03.mmObject(), FIToFIPaymentCancellationRequestV01.mmObject(), FIToFIPaymentCancellationRequestV02.mmObject(),
						FIToFIPaymentCancellationRequestV03.mmObject(), FundConfirmedCashForecastReportCancellationV01.mmObject(), FundConfirmedCashForecastReportV02.mmObject(),
						FundDetailedConfirmedCashForecastReportCancellationV01.mmObject(), FundDetailedConfirmedCashForecastReportV02.mmObject(), FundDetailedEstimatedCashForecastReportV02.mmObject(),
						FundEstimatedCashForecastReportV02.mmObject(), RequestToModifyPayment.mmObject(), RequestToCancelPayment.mmObject(), UnableToApply.mmObject(), ClaimNonReceipt.mmObject(), AdditionalPaymentInformation.mmObject(),
						ResolutionOfInvestigation.mmObject(), NotificationOfCaseAssignment.mmObject(), RejectCaseAssignment.mmObject(), RequestForDuplicateInstruction.mmObject(), DebitAuthorisationResponse.mmObject(),
						DebitAuthorisationRequest.mmObject(), CaseStatusReportRequest.mmObject(), CaseStatusReport.mmObject(), CancelCaseAssignment.mmObject(), AccountReportingRequestV02.mmObject(), NotificationToReceiveV02.mmObject(),
						NotificationToReceiveCancellationAdviceV02.mmObject(), NotificationToReceiveStatusReportV02.mmObject(), RequestToModifyPaymentV03_replaced.mmObject(), UnableToApplyV03.mmObject(), ClaimNonReceiptV03.mmObject(),
						AdditionalPaymentInformationV03.mmObject(), ResolutionOfInvestigationV03.mmObject(), RejectInvestigationV03.mmObject(), RequestForDuplicateV03.mmObject(), DuplicateV03.mmObject(),
						ProprietaryFormatInvestigationV02.mmObject(), DebitAuthorisationResponseV02.mmObject(), DebitAuthorisationRequestV03.mmObject(), UnableToApplyV04.mmObject(), ClaimNonReceiptV04.mmObject(),
						AdditionalPaymentInformationV04.mmObject(), ResolutionOfInvestigationV04.mmObject(), DebitAuthorisationRequestV04.mmObject(), RequestToModifyPaymentV01.mmObject(), NotificationToReceiveV03.mmObject(),
						NotificationToReceiveCancellationAdviceV03.mmObject(), NotificationToReceiveStatusReportV03.mmObject(), ResolutionOfInvestigationV05.mmObject(), BankToCustomerStatementV05.mmObject(),
						BankToCustomerAccountReportV05.mmObject(), FIToFIPaymentCancellationRequestV04.mmObject(), CustomerPaymentCancellationRequestV04.mmObject(), AdditionalPaymentInformationV05.mmObject(),
						BankToCustomerDebitCreditNotificationV05.mmObject(), RequestToModifyPaymentV02.mmObject(), AdditionalPaymentInformationV06.mmObject(), FIToFIPaymentCancellationRequestV05.mmObject(),
						RequestToModifyPaymentV03.mmObject(), ResolutionOfInvestigationV06.mmObject(), CustomerPaymentCancellationRequestV05.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}