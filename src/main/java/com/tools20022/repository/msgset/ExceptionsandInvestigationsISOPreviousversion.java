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
 * <li>{@linkplain com.tools20022.repository.area.camt.UnableToApplyV04
 * UnableToApplyV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04
 * ClaimNonReceiptV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04
 * NotificationOfCaseAssignmentV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.RejectInvestigationV04
 * RejectInvestigationV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV03
 * CancelCaseAssignmentV03}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationRequestV04
 * DebitAuthorisationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CaseStatusReportRequestV03
 * CaseStatusReportRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.camt.CaseStatusReportV04
 * CaseStatusReportV04}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Exceptions and Investigations - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages to support payment-related investigation activities such as cancellation, modification, unable to apply and claim of non-receipt.\r\n"
 * </li>
 * </ul>
 */
public class ExceptionsandInvestigationsISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Exceptions and Investigations - ISO - Previous version";
				definition = "Set of messages to support payment-related investigation activities such as cancellation, modification, unable to apply and claim of non-receipt.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(UnableToApplyV04.mmObject(), ClaimNonReceiptV04.mmObject(), NotificationOfCaseAssignmentV04.mmObject(), RejectInvestigationV04.mmObject(), CancelCaseAssignmentV03.mmObject(),
						RequestForDuplicateV04.mmObject(), DuplicateV04.mmObject(), ProprietaryFormatInvestigationV03.mmObject(), DebitAuthorisationResponseV03.mmObject(), DebitAuthorisationRequestV04.mmObject(),
						CaseStatusReportRequestV03.mmObject(), CaseStatusReportV04.mmObject(), AdditionalPaymentInformationV06.mmObject(), FIToFIPaymentCancellationRequestV05.mmObject(), RequestToModifyPaymentV03.mmObject(),
						ResolutionOfInvestigationV06.mmObject(), CustomerPaymentCancellationRequestV05.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}