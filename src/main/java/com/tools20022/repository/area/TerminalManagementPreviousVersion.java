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
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03;
import com.tools20022.repository.area.catm.ManagementPlanReplacementV03;
import com.tools20022.repository.area.catm.StatusReportV03;
import com.tools20022.repository.area.catm.TerminalManagementRejectionV02;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support any card related terminal management services between a
 * Terminal Management System (TMS) and a Point of Interaction (POI) system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "catm"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
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
 * "Terminal Management - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card related terminal management services between a Terminal Management System (TMS) and a Point of Interaction (POI) system."
 * </li>
 * </ul>
 */
public class TerminalManagementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Terminal Management - Previous version - master";
				definition = "Messages that support any card related terminal management services between a Terminal Management System (TMS) and a Point of Interaction (POI) system.";
				messageDefinition_lazy = () -> Arrays.asList(TerminalManagementRejectionV02.mmObject(), AcceptorConfigurationUpdateV03.mmObject(), ManagementPlanReplacementV03.mmObject(), StatusReportV03.mmObject());
				code = "catm";
			}
		});
		return mmObject_lazy.get();
	}
}