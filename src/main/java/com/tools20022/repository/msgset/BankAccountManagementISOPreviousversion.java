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
import com.tools20022.repository.area.acmt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages that allows an organisation to open, maintain and close cash
 * accounts serviced by a financial institution. It is designed for existing
 * customers that have an established relationship with a bank or for a new
 * legal entity of this customer. It covers mandates, allows electronic
 * signature, and references to supporting documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
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
 * "Bank Account Management - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages that allows an organisation to open, maintain and close cash accounts serviced by a financial institution. It is designed for existing customers that have an established relationship with a bank or for a new legal entity of this customer. It covers mandates, allows electronic signature, and references to supporting documents."
 * </li>
 * </ul>
 */
public class BankAccountManagementISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.catalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Bank Account Management - ISO - Previous version";
				definition = "Set of messages that allows an organisation to open, maintain and close cash accounts serviced by a financial institution. It is designed for existing customers that have an established relationship with a bank or for a new legal entity of this customer. It covers mandates, allows electronic signature, and references to supporting documents.";
				messageDefinition_lazy = () -> Arrays.asList(AccountAdditionalInformationRequestV01.mmObject(), AccountClosingAdditionalInformationRequestV01.mmObject(), AccountClosingAmendmentRequestV01.mmObject(),
						AccountClosingRequestV01.mmObject(), AccountExcludedMandateMaintenanceAmendmentRequestV01.mmObject(), AccountExcludedMandateMaintenanceRequestV01.mmObject(), AccountMandateMaintenanceAmendmentRequestV01.mmObject(),
						AccountMandateMaintenanceRequestV01.mmObject(), AccountOpeningAdditionalInformationRequestV01.mmObject(), AccountOpeningAmendmentRequestV01.mmObject(), AccountOpeningRequestV01.mmObject(),
						AccountReportRequestV01.mmObject(), AccountReportV01.mmObject(), AccountRequestAcknowledgementV01.mmObject(), AccountRequestRejectionV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}