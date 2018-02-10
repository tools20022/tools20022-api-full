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
import com.tools20022.repository.area.admi.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Generic messages, ie, system event notifications, generic rejections, etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "admi"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.admi.StaticDataReportV02
 * StaticDataReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.StaticDataRequestV02
 * StaticDataRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventAcknowledgementV01
 * SystemEventAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.MessageRejectV01
 * MessageRejectV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.SystemEventNotificationV02
 * SystemEventNotificationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.admi.ProcessingRequestV01
 * ProcessingRequestV01}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Administration - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Generic messages, ie, system event notifications, generic rejections, etc."</li>
 * </ul>
 */
public class AdministrationLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Administration - Latest version - master";
				definition = "Generic messages, ie, system event notifications, generic rejections, etc.";
				messageDefinition_lazy = () -> Arrays.asList(StaticDataReportV02.mmObject(), StaticDataRequestV02.mmObject(), SystemEventAcknowledgementV01.mmObject(), MessageRejectV01.mmObject(), SystemEventNotificationV02.mmObject(),
						ProcessingRequestV01.mmObject());
				code = "admi";
			}
		});
		return mmObject_lazy.get();
	}
}