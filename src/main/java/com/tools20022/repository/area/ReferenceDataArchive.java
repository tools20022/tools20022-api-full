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
import com.tools20022.repository.area.reda.PriceReportCancellationV02;
import com.tools20022.repository.area.reda.PriceReportCorrectionV02;
import com.tools20022.repository.area.reda.PriceReportCorrectionV03;
import com.tools20022.repository.area.reda.PriceReportV02;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the communication of reference data related to
 * financial instruments, parties, accounts, prices and other business
 * information required to support financial activities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "reda"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV02
 * PriceReportCancellationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportV02
 * PriceReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV02
 * PriceReportCorrectionV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.reda.PriceReportCorrectionV03
 * PriceReportCorrectionV03}</li>
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
 * "Reference Data - Archive - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the communication of reference data related to financial instruments, parties, accounts, prices and other business information required to support financial activities."
 * </li>
 * </ul>
 */
public class ReferenceDataArchive {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference Data - Archive - master";
				definition = "Messages that support the communication of reference data related to financial instruments, parties, accounts, prices and other business information required to support financial activities.";
				code = "reda";
				messageDefinition_lazy = () -> Arrays.asList(PriceReportCancellationV02.mmObject(), PriceReportV02.mmObject(), PriceReportCorrectionV02.mmObject(), PriceReportCorrectionV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}