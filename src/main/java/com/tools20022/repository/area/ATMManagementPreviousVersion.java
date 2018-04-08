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
import com.tools20022.repository.area.caam.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support card related terminal management services between an
 * Automated Teller Machine (ATM) and an<br>
 * Acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "caam"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01
 * ATMReconciliationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01
 * ATMReconciliationAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01
 * ATMDiagnosticResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01
 * ATMDiagnosticRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV02
 * ATMDeviceControlV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV02
 * ATMDeviceReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02
 * ATMKeyDownloadRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02
 * ATMKeyDownloadResponseV02}</li>
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
 * "ATM Management - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support card related terminal management services between an Automated Teller Machine (ATM) and an\r\nAcquirer."
 * </li>
 * </ul>
 */
public class ATMManagementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATM Management - Previous version - master";
				definition = "Messages that support card related terminal management services between an Automated Teller Machine (ATM) and an\r\nAcquirer.";
				code = "caam";
				messageDefinition_lazy = () -> Arrays.asList(ATMReconciliationAdviceV01.mmObject(), ATMReconciliationAcknowledgementV01.mmObject(), ATMDiagnosticResponseV01.mmObject(), ATMDiagnosticRequestV01.mmObject(),
						ATMDeviceControlV02.mmObject(), ATMDeviceReportV02.mmObject(), ATMKeyDownloadRequestV02.mmObject(), ATMKeyDownloadResponseV02.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}