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
 * {@linkplain com.tools20022.repository.area.camt.AccountReportingRequestV03
 * AccountReportingRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV03
 * NotificationOfCaseAssignmentV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV02
 * CancelCaseAssignmentV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV02
 * CaseStatusReportRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV03
 * CaseStatusReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04
 * RejectInvestigationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RequestForDuplicateV04
 * RequestForDuplicateV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.DuplicateV04
 * DuplicateV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ProprietaryFormatInvestigationV03
 * ProprietaryFormatInvestigationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03
 * DebitAuthorisationResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankServicesBillingStatementV01
 * BankServicesBillingStatementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveCancellationAdviceV04
 * NotificationToReceiveCancellationAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveStatusReportV04
 * NotificationToReceiveStatusReportV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV04
 * NotificationToReceiveV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06
 * BankToCustomerAccountReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06
 * BankToCustomerStatementV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06
 * BankToCustomerDebitCreditNotificationV06}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV05
 * UnableToApplyV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06
 * CustomerPaymentCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV07
 * AdditionalPaymentInformationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07
 * ResolutionOfInvestigationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06
 * FIToFIPaymentCancellationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV05
 * DebitAuthorisationRequestV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05
 * ClaimNonReceiptV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04
 * RequestToModifyPaymentV04}</li>
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
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cash Management - Previous version - master";
				definition = "Messages that support the reporting and advicing of the cash side of any financial transactions, including cash movements, transactions and balances, plus any exceptions and investigations related to cash transactions.";
				code = "camt";
				messageDefinition_lazy = () -> Arrays.asList(FundConfirmedCashForecastReportCancellationV02.mmObject(), FundConfirmedCashForecastReportV03.mmObject(), FundDetailedConfirmedCashForecastReportCancellationV02.mmObject(),
						FundDetailedConfirmedCashForecastReportV03.mmObject(), FundDetailedEstimatedCashForecastReportV03.mmObject(), FundEstimatedCashForecastReportV03.mmObject(), AccountReportingRequestV03.mmObject(),
						NotificationOfCaseAssignmentV03.mmObject(), CancelCaseAssignmentV02.mmObject(), CaseStatusReportRequestV02.mmObject(), CaseStatusReportV03.mmObject(), RejectInvestigationV04.mmObject(),
						RequestForDuplicateV04.mmObject(), DuplicateV04.mmObject(), ProprietaryFormatInvestigationV03.mmObject(), DebitAuthorisationResponseV03.mmObject(), BankServicesBillingStatementV01.mmObject(),
						NotificationToReceiveCancellationAdviceV04.mmObject(), NotificationToReceiveStatusReportV04.mmObject(), NotificationToReceiveV04.mmObject(), BankToCustomerAccountReportV06.mmObject(),
						BankToCustomerStatementV06.mmObject(), BankToCustomerDebitCreditNotificationV06.mmObject(), UnableToApplyV05.mmObject(), CustomerPaymentCancellationRequestV06.mmObject(), AdditionalPaymentInformationV07.mmObject(),
						ResolutionOfInvestigationV07.mmObject(), FIToFIPaymentCancellationRequestV06.mmObject(), DebitAuthorisationRequestV05.mmObject(), ClaimNonReceiptV05.mmObject(), RequestToModifyPaymentV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}