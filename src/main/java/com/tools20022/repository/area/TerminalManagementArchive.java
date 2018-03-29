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
import com.tools20022.repository.area.catm.*;
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
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV01
 * ManagementPlanReplacementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV02
 * ManagementPlanReplacementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV01
 * StatusReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV02
 * StatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01
 * AcceptorConfigurationUpdateV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02
 * AcceptorConfigurationUpdateV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV01
 * TerminalManagementRejectionV01}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04
 * AcceptorConfigurationUpdateV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV04
 * ManagementPlanReplacementV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV04
 * StatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01
 * MaintenanceDelegationResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01
 * MaintenanceDelegationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02
 * MaintenanceDelegationRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05
 * AcceptorConfigurationUpdateV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV05
 * StatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV05
 * ManagementPlanReplacementV05}</li>
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
 * "Terminal Management - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card related terminal management services between a Terminal Management System (TMS) and a Point of Interaction (POI) system."
 * </li>
 * </ul>
 */
public class TerminalManagementArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Terminal Management - Archive - master";
				definition = "Messages that support any card related terminal management services between a Terminal Management System (TMS) and a Point of Interaction (POI) system.";
				messageDefinition_lazy = () -> Arrays.asList(ManagementPlanReplacementV01.mmObject(), ManagementPlanReplacementV02.mmObject(), StatusReportV01.mmObject(), StatusReportV02.mmObject(),
						AcceptorConfigurationUpdateV01.mmObject(), AcceptorConfigurationUpdateV02.mmObject(), TerminalManagementRejectionV01.mmObject(), TerminalManagementRejectionV02.mmObject(), AcceptorConfigurationUpdateV03.mmObject(),
						ManagementPlanReplacementV03.mmObject(), StatusReportV03.mmObject(), AcceptorConfigurationUpdateV04.mmObject(), ManagementPlanReplacementV04.mmObject(), StatusReportV04.mmObject(),
						MaintenanceDelegationResponseV01.mmObject(), MaintenanceDelegationRequestV01.mmObject(), MaintenanceDelegationRequestV02.mmObject(), AcceptorConfigurationUpdateV05.mmObject(), StatusReportV05.mmObject(),
						ManagementPlanReplacementV05.mmObject());
				code = "catm";
			}
		});
		return mmObject_lazy.get();
	}
}