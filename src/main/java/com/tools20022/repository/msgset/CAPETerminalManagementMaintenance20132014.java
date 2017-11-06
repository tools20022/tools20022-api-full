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
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03;
import com.tools20022.repository.area.catm.ManagementPlanReplacementV03;
import com.tools20022.repository.area.catm.StatusReportV03;
import com.tools20022.repository.area.catm.TerminalManagementRejectionV02;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Message set defined for the implementation of the CRs related the SR2014 Card
 * Payments Exchanges
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV02
 * TerminalManagementRejectionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03
 * AcceptorConfigurationUpdateV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV03
 * ManagementPlanReplacementV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV03
 * StatusReportV03}</li>
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
 * "CAPE - Terminal Management - Maintenance 2013 - 2014"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message set defined for the implementation of the CRs related the SR2014 Card Payments Exchanges"
 * </li>
 * </ul>
 */
public class CAPETerminalManagementMaintenance20132014 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> com.tools20022.repository.GeneratedRepository.mmcatalogue;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CAPE - Terminal Management - Maintenance 2013 - 2014";
				definition = "Message set defined for the implementation of the CRs related the SR2014 Card Payments Exchanges";
				messageDefinition_lazy = () -> Arrays.asList(TerminalManagementRejectionV02.mmObject(), AcceptorConfigurationUpdateV03.mmObject(), ManagementPlanReplacementV03.mmObject(), StatusReportV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}