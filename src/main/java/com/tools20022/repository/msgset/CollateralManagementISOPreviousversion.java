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
 * The Collateral Management message set includes all messages exchanged between
 * a collateral taker and a collateral giver to support collateral management
 * activities such as collateral claim, collateral substitution, collateral
 * recall, collateral reporting and collateral interest payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03
 * CollateralSubstitutionRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentStatementV03
 * InterestPaymentStatementV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02
 * CollateralAndExposureReportV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03
 * MarginCallResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03
 * CollateralManagementCancellationStatusV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV03
 * CollateralProposalResponseV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03
 * MarginCallRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.colr.CollateralProposalV03
 * CollateralProposalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallDisputeNotificationV03
 * MarginCallDisputeNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV03
 * CollateralManagementCancellationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03
 * CollateralSubstitutionResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03
 * InterestPaymentResponseV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03
 * InterestPaymentRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV03
 * CollateralSubstitutionConfirmationV03}</li>
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
 * "Collateral Management - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Collateral Management message set includes all messages exchanged between a collateral taker and a collateral giver to support collateral management activities such as collateral claim, collateral substitution, collateral recall, collateral reporting and collateral interest payment."
 * </li>
 * </ul>
 */
public class CollateralManagementISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Collateral Management - ISO - Previous version";
				definition = "The Collateral Management message set includes all messages exchanged between a collateral taker and a collateral giver to support collateral management activities such as collateral claim, collateral substitution, collateral recall, collateral reporting and collateral interest payment.";
				messageDefinition_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV03.mmObject(), InterestPaymentStatementV03.mmObject(), CollateralAndExposureReportV02.mmObject(), MarginCallResponseV03.mmObject(),
						CollateralManagementCancellationStatusV03.mmObject(), CollateralProposalResponseV03.mmObject(), MarginCallRequestV03.mmObject(), CollateralProposalV03.mmObject(), MarginCallDisputeNotificationV03.mmObject(),
						CollateralManagementCancellationRequestV03.mmObject(), CollateralSubstitutionResponseV03.mmObject(), InterestPaymentResponseV03.mmObject(), InterestPaymentRequestV03.mmObject(),
						CollateralSubstitutionConfirmationV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}