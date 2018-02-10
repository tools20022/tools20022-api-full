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

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.CustomerPaymentReversalV08;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * SR2018 MX Maintenance message set for the Payments messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV07
 * FIToFICustomerCreditTransferV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07
 * FinancialInstitutionCreditTransferV07}</li>
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
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV08
 * FIToFIPaymentReversalV08}</li>
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
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08
 * PaymentReturnV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV09
 * FIToFIPaymentStatusReportV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08
 * AdditionalPaymentInformationV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09
 * CustomerPaymentStatusReportV09}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV07
 * CustomerPaymentCancellationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08
 * CustomerPaymentReversalV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02
 * FIToFIPaymentStatusRequestV02}</li>
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
 * "_SR2018_MX_Payments_Maintenance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "SR2018 MX Maintenance message set for the Payments messages."</li>
 * </ul>
 */
public class _SR2018_MX_Payments_Maintenance {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "_SR2018_MX_Payments_Maintenance";
				definition = "SR2018 MX Maintenance message set for the Payments messages.";
				messageDefinition_lazy = () -> Arrays.asList(FIToFICustomerCreditTransferV07.mmObject(), FinancialInstitutionCreditTransferV07.mmObject(), BankToCustomerAccountReportV07.mmObject(),
						FIToFIPaymentCancellationRequestV07.mmObject(), DuplicateV05.mmObject(), RejectInvestigationV05.mmObject(), ProprietaryFormatInvestigationV04.mmObject(), RequestForDuplicateV05.mmObject(),
						FIToFIPaymentReversalV08.mmObject(), RequestToModifyPaymentV05.mmObject(), ClaimNonReceiptV06.mmObject(), BankToCustomerStatementV07.mmObject(), DebitAuthorisationRequestV06.mmObject(),
						ResolutionOfInvestigationV08.mmObject(), DebitAuthorisationResponseV04.mmObject(), UnableToApplyV06.mmObject(), AccountReportingRequestV04.mmObject(), BankToCustomerDebitCreditNotificationV07.mmObject(),
						PaymentReturnV08.mmObject(), FIToFIPaymentStatusReportV09.mmObject(), AdditionalPaymentInformationV08.mmObject(), CustomerPaymentStatusReportV09.mmObject(), CustomerPaymentCancellationRequestV07.mmObject(),
						CustomerPaymentReversalV08.mmObject(), FIToFIPaymentStatusRequestV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}