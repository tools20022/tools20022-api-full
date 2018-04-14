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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages to support payment-related investigation activities such as
 * cancellation, modification, unable to apply and claim of non-receipt.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
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
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformationV08
 * AdditionalPaymentInformationV08}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Exceptions and Investigations - ISO - Latest version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages to support payment-related investigation activities such as cancellation, modification, unable to apply and claim of non-receipt.\r\n"
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class ExceptionsandInvestigationsISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Exceptions and Investigations - ISO - Latest version";
				definition = "Set of messages to support payment-related investigation activities such as cancellation, modification, unable to apply and claim of non-receipt.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(NotificationOfCaseAssignmentV04.mmObject(), CancelCaseAssignmentV03.mmObject(), CaseStatusReportRequestV03.mmObject(), CaseStatusReportV04.mmObject(),
						FIToFIPaymentCancellationRequestV07.mmObject(), DuplicateV05.mmObject(), RejectInvestigationV05.mmObject(), ProprietaryFormatInvestigationV04.mmObject(), RequestForDuplicateV05.mmObject(),
						RequestToModifyPaymentV05.mmObject(), ClaimNonReceiptV06.mmObject(), DebitAuthorisationRequestV06.mmObject(), ResolutionOfInvestigationV08.mmObject(), DebitAuthorisationResponseV04.mmObject(),
						UnableToApplyV06.mmObject(), AdditionalPaymentInformationV08.mmObject(), CustomerPaymentCancellationRequestV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}