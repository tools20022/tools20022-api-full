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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportCancellationV02
 * FundConfirmedCashForecastReportCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundConfirmedCashForecastReportV03
 * FundConfirmedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportCancellationV02
 * FundDetailedConfirmedCashForecastReportCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedConfirmedCashForecastReportV03
 * FundDetailedConfirmedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03
 * FundDetailedEstimatedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03
 * FundEstimatedCashForecastReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV02
 * AccountReportingRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03
 * RequestToModifyPaymentV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03
 * NotificationOfCaseAssignmentV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectInvestigationV03
 * RejectInvestigationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV02
 * CancelCaseAssignmentV02}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV02
 * CaseStatusReportRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03
 * CaseStatusReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV04
 * UnableToApplyV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04
 * ClaimNonReceiptV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04
 * DebitAuthorisationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV01
 * BankServicesBillingStatementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05
 * BankToCustomerStatementV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05
 * BankToCustomerAccountReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04
 * NotificationToReceiveCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV04
 * NotificationToReceiveStatusReportV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV04
 * NotificationToReceiveV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05
 * BankToCustomerDebitCreditNotificationV05}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "camt"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cash Management - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions."
 * </li>
 * </ul>
 */
public class CashManagementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cash Management - Previous version - master";
				definition = "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions.";
				messageDefinition_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV02.mmObject(), FundConfirmedCashForecastReportV03.mmObject(), FundDetailedConfirmedCashForecastReportCancellationV02.mmObject(),
						FundDetailedConfirmedCashForecastReportV03.mmObject(), FundDetailedEstimatedCashForecastReportV03.mmObject(), FundEstimatedCashForecastReportV03.mmObject(), AccountReportingRequestV02.mmObject(),
						RequestToModifyPaymentV03.mmObject(), NotificationOfCaseAssignmentV03.mmObject(), RejectInvestigationV03.mmObject(), CancelCaseAssignmentV02.mmObject(), RequestForDuplicateV03.mmObject(), DuplicateV03.mmObject(),
						ProprietaryFormatInvestigationV02.mmObject(), DebitAuthorisationResponseV02.mmObject(), CaseStatusReportRequestV02.mmObject(), CaseStatusReportV03.mmObject(), UnableToApplyV04.mmObject(),
						ClaimNonReceiptV04.mmObject(), DebitAuthorisationRequestV04.mmObject(), BankServicesBillingStatementV01.mmObject(), BankToCustomerStatementV05.mmObject(), BankToCustomerAccountReportV05.mmObject(),
						NotificationToReceiveCancellationAdviceV04.mmObject(), NotificationToReceiveStatusReportV04.mmObject(), NotificationToReceiveV04.mmObject(), BankToCustomerDebitCreditNotificationV05.mmObject(),
						AdditionalPaymentInformationV06.mmObject(), FIToFIPaymentCancellationRequestV05.mmObject(), RequestToModifyPaymentV03.mmObject(), ResolutionOfInvestigationV06.mmObject(),
						CustomerPaymentCancellationRequestV05.mmObject());
				code = "camt";
			}
		});
		return mmObject_lazy.get();
	}
}