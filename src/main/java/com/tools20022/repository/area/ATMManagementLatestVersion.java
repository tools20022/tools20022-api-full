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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV01
 * ATMReconciliationAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV01
 * ATMReconciliationAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01
 * HostToATMAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01
 * ATMDiagnosticResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01
 * ATMDiagnosticRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01
 * ATMKeyDownloadResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01
 * ATMDeviceReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01
 * HostToATMRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV01
 * ATMKeyDownloadRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV01
 * ATMDeviceControlV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01
 * ATMExceptionAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01
 * ATMExceptionAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV02
 * ATMDeviceControlV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02
 * ATMReconciliationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02
 * ATMReconciliationAcknowledgementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV02
 * ATMDeviceReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02
 * ATMDiagnosticResponseV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02
 * ATMDiagnosticRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02
 * ATMKeyDownloadRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV02
 * ATMKeyDownloadResponseV02}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "caam"</li>
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
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATM Management - Latest version - master";
				definition = "Messages that support card related terminal management services between an Automated Teller Machine (ATM) and an\r\nAcquirer.";
				messageDefinition_lazy = () -> Arrays.asList(ATMReconciliationAdviceV01.mmObject(), ATMReconciliationAcknowledgementV01.mmObject(), HostToATMAcknowledgementV01.mmObject(), ATMDiagnosticResponseV01.mmObject(),
						ATMDiagnosticRequestV01.mmObject(), ATMKeyDownloadResponseV01.mmObject(), ATMDeviceReportV01.mmObject(), HostToATMRequestV01.mmObject(), ATMKeyDownloadRequestV01.mmObject(), ATMDeviceControlV01.mmObject(),
						ATMExceptionAcknowledgementV01.mmObject(), ATMExceptionAdviceV01.mmObject(), ATMDeviceControlV02.mmObject(), ATMReconciliationAdviceV02.mmObject(), ATMReconciliationAcknowledgementV02.mmObject(),
						ATMDeviceReportV02.mmObject(), ATMDiagnosticResponseV02.mmObject(), ATMDiagnosticRequestV02.mmObject(), ATMKeyDownloadRequestV02.mmObject(), ATMKeyDownloadResponseV02.mmObject());
				code = "caam";
			}
		});
		return mmObject_lazy.get();
	}
}