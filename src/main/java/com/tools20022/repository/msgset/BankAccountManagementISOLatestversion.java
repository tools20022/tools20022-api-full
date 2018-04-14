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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages that allows an organisation to open, maintain and close cash
 * accounts serviced by a financial institution. It is designed for existing
 * customers that have an established relationship with a bank or for a new
 * legal entity of this customer. It covers mandates, allows electronic
 * signature, and references to supporting documents.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02
 * AccountAdditionalInformationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02
 * AccountClosingAdditionalInformationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02
 * AccountClosingAmendmentRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02
 * AccountClosingRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02
 * AccountExcludedMandateMaintenanceAmendmentRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02
 * AccountExcludedMandateMaintenanceRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02
 * AccountMandateMaintenanceAmendmentRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02
 * AccountMandateMaintenanceRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02
 * AccountOpeningAdditionalInformationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02
 * AccountOpeningAmendmentRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02
 * AccountOpeningRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02
 * AccountReportRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountReportV02
 * AccountReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02
 * AccountRequestAcknowledgementV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02
 * AccountRequestRejectionV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Bank Account Management - ISO - Latest version "</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages that allows an organisation to open, maintain and close cash accounts serviced by a financial institution. It is designed for existing customers that have an established relationship with a bank or for a new legal entity of this customer. It covers mandates, allows electronic signature, and references to supporting documents.\r\n"
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class BankAccountManagementISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Bank Account Management - ISO - Latest version ";
				definition = "Set of messages that allows an organisation to open, maintain and close cash accounts serviced by a financial institution. It is designed for existing customers that have an established relationship with a bank or for a new legal entity of this customer. It covers mandates, allows electronic signature, and references to supporting documents.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(AccountAdditionalInformationRequestV02.mmObject(), AccountClosingAdditionalInformationRequestV02.mmObject(), AccountClosingAmendmentRequestV02.mmObject(),
						AccountClosingRequestV02.mmObject(), AccountExcludedMandateMaintenanceAmendmentRequestV02.mmObject(), AccountExcludedMandateMaintenanceRequestV02.mmObject(), AccountMandateMaintenanceAmendmentRequestV02.mmObject(),
						AccountMandateMaintenanceRequestV02.mmObject(), AccountOpeningAdditionalInformationRequestV02.mmObject(), AccountOpeningAmendmentRequestV02.mmObject(), AccountOpeningRequestV02.mmObject(),
						AccountReportRequestV02.mmObject(), AccountReportV02.mmObject(), AccountRequestAcknowledgementV02.mmObject(), AccountRequestRejectionV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}