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
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01
 * HostToATMAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01
 * HostToATMRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01
 * ATMExceptionAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01
 * ATMExceptionAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02
 * ATMReconciliationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02
 * ATMReconciliationAcknowledgementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02
 * ATMDiagnosticResponseV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02
 * ATMDiagnosticRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV03
 * ATMDeviceControlV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV03
 * ATMDeviceReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV03
 * ATMKeyDownloadRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV03
 * ATMKeyDownloadResponseV03}</li>
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
 * "ATM Management - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support card related terminal management services between an Automated Teller Machine (ATM) and an\r\nAcquirer."
 * </li>
 * </ul>
 */
public class ATMManagementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATM Management - Latest version - master";
				definition = "Messages that support card related terminal management services between an Automated Teller Machine (ATM) and an\r\nAcquirer.";
				messageDefinition_lazy = () -> Arrays.asList(HostToATMAcknowledgementV01.mmObject(), HostToATMRequestV01.mmObject(), ATMExceptionAcknowledgementV01.mmObject(), ATMExceptionAdviceV01.mmObject(),
						ATMReconciliationAdviceV02.mmObject(), ATMReconciliationAcknowledgementV02.mmObject(), ATMDiagnosticResponseV02.mmObject(), ATMDiagnosticRequestV02.mmObject(), ATMDeviceControlV03.mmObject(),
						ATMDeviceReportV03.mmObject(), ATMKeyDownloadRequestV03.mmObject(), ATMKeyDownloadResponseV03.mmObject());
				code = "caam";
			}
		});
		return mmObject_lazy.get();
	}
}