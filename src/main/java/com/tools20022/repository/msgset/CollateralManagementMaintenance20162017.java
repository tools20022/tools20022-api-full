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
import com.tools20022.repository.area.colr.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This document describes the Collateral Management message set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04
 * MarginCallRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04
 * InterestPaymentResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV04
 * MarginCallDisputeNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04
 * CollateralSubstitutionResponseV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04
 * MarginCallResponseV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV04
 * InterestPaymentStatementV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04
 * CollateralManagementCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04
 * CollateralSubstitutionConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04
 * InterestPaymentRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04
 * CollateralManagementCancellationStatusV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04
 * CollateralSubstitutionRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03
 * CollateralAndExposureReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV05
 * CollateralProposalResponseV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.colr.CollateralProposalV05
 * CollateralProposalV05}</li>
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
 * "Collateral Management - Maintenance 2016 - 2017"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This document describes the Collateral Management message set. "</li>
 * </ul>
 */
public class CollateralManagementMaintenance20162017 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Collateral Management - Maintenance 2016 - 2017";
				definition = "This document describes the Collateral Management message set. ";
				messageDefinition_lazy = () -> Arrays.asList(MarginCallRequestV04.mmObject(), InterestPaymentResponseV04.mmObject(), MarginCallDisputeNotificationV04.mmObject(), CollateralSubstitutionResponseV04.mmObject(),
						MarginCallResponseV04.mmObject(), InterestPaymentStatementV04.mmObject(), CollateralManagementCancellationRequestV04.mmObject(), CollateralSubstitutionConfirmationV04.mmObject(),
						InterestPaymentRequestV04.mmObject(), CollateralManagementCancellationStatusV04.mmObject(), CollateralSubstitutionRequestV04.mmObject(), CollateralAndExposureReportV03.mmObject(),
						CollateralProposalResponseV05.mmObject(), CollateralProposalV05.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}