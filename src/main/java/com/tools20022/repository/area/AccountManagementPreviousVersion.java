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
import com.tools20022.repository.area.acmt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the management of account related activities, such as
 * the opening and maintenance of an account
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "acmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV01
 * AccountAdditionalInformationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV01
 * AccountClosingAdditionalInformationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV01
 * AccountClosingAmendmentRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01
 * AccountClosingRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV01
 * AccountExcludedMandateMaintenanceAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01
 * AccountExcludedMandateMaintenanceRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV01
 * AccountMandateMaintenanceAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01
 * AccountMandateMaintenanceRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV01
 * AccountOpeningAdditionalInformationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01
 * AccountOpeningAmendmentRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV01
 * AccountOpeningRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV01
 * AccountReportRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportV01
 * AccountReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV01
 * AccountRequestAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV01
 * AccountRequestRejectionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationModificationAdviceV01
 * IdentificationModificationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationRequestV01
 * IdentificationVerificationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.IdentificationVerificationReportV01
 * IdentificationVerificationReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06
 * AccountOpeningInstructionV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06
 * AccountDetailsConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.RequestForAccountManagementStatusReportV04
 * RequestForAccountManagementStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05
 * AccountManagementStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06
 * AccountModificationInstructionV06}</li>
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
 * "Account Management - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the management of account related activities, such as the opening and maintenance of an account"
 * </li>
 * </ul>
 */
public class AccountManagementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Account Management - Previous version - master";
				definition = "Messages that support the management of account related activities, such as the opening and maintenance of an account";
				messageDefinition_lazy = () -> Arrays.asList(AccountAdditionalInformationRequestV01.mmObject(), AccountClosingAdditionalInformationRequestV01.mmObject(), AccountClosingAmendmentRequestV01.mmObject(),
						AccountClosingRequestV01.mmObject(), AccountExcludedMandateMaintenanceAmendmentRequestV01.mmObject(), AccountExcludedMandateMaintenanceRequestV01.mmObject(), AccountMandateMaintenanceAmendmentRequestV01.mmObject(),
						AccountMandateMaintenanceRequestV01.mmObject(), AccountOpeningAdditionalInformationRequestV01.mmObject(), AccountOpeningAmendmentRequestV01.mmObject(), AccountOpeningRequestV01.mmObject(),
						AccountReportRequestV01.mmObject(), AccountReportV01.mmObject(), AccountRequestAcknowledgementV01.mmObject(), AccountRequestRejectionV01.mmObject(), IdentificationModificationAdviceV01.mmObject(),
						IdentificationVerificationRequestV01.mmObject(), IdentificationVerificationReportV01.mmObject(), AccountOpeningInstructionV06.mmObject(), AccountDetailsConfirmationV06.mmObject(),
						RequestForAccountManagementStatusReportV04.mmObject(), AccountManagementStatusReportV05.mmObject(), AccountModificationInstructionV06.mmObject());
				code = "acmt";
			}
		});
		return mmObject_lazy.get();
	}
}