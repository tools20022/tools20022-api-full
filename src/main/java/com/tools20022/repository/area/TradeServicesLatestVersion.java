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
import com.tools20022.repository.area.tsrv.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the issuance of a trade services instrument, execution
 * and/or settlement of a trade transaction, including any related
 * reimbursement, acceptance, authorisation, claims, enquiries, invoicing,
 * financing or other undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "tsrv"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01
 * DemandRefusalNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandWithdrawalNotificationV01
 * DemandWithdrawalNotificationV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01
 * ExtendOrPayRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01
 * ExtendOrPayResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsrv.TradeStatusReportV01
 * TradeStatusReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01
 * UndertakingAmendmentAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentNotificationV01
 * UndertakingAmendmentNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01
 * UndertakingAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01
 * UndertakingAmendmentResponseNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseV01
 * UndertakingAmendmentResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentV01
 * UndertakingAmendmentV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsrv.UndertakingDemandV01
 * UndertakingDemandV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01
 * UndertakingIssuanceAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01
 * UndertakingIssuanceNotificationV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01
 * UndertakingIssuanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01
 * UndertakingNonExtensionNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingNonExtensionRequestV01
 * UndertakingNonExtensionRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingStatusReportV01
 * UndertakingStatusReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingTerminationNotificationV01
 * UndertakingTerminationNotificationV01}</li>
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
 * "Trade Services -  Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the issuance of a trade services instrument, execution and/or settlement of a trade transaction, including any related reimbursement, acceptance, authorisation, claims, enquiries, invoicing, financing or other undertaking."
 * </li>
 * </ul>
 */
public class TradeServicesLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Trade Services -  Latest version - master";
				definition = "Messages that support the issuance of a trade services instrument, execution and/or settlement of a trade transaction, including any related reimbursement, acceptance, authorisation, claims, enquiries, invoicing, financing or other undertaking.";
				code = "tsrv";
				messageDefinition_lazy = () -> Arrays.asList(DemandRefusalNotificationV01.mmObject(), DemandWithdrawalNotificationV01.mmObject(), ExtendOrPayRequestV01.mmObject(), ExtendOrPayResponseV01.mmObject(),
						TradeStatusReportV01.mmObject(), UndertakingAmendmentAdviceV01.mmObject(), UndertakingAmendmentNotificationV01.mmObject(), UndertakingAmendmentRequestV01.mmObject(),
						UndertakingAmendmentResponseNotificationV01.mmObject(), UndertakingAmendmentResponseV01.mmObject(), UndertakingAmendmentV01.mmObject(), UndertakingDemandV01.mmObject(), UndertakingIssuanceAdviceV01.mmObject(),
						UndertakingIssuanceNotificationV01.mmObject(), UndertakingIssuanceV01.mmObject(), UndertakingNonExtensionNotificationV01.mmObject(), UndertakingNonExtensionRequestV01.mmObject(),
						UndertakingStatusReportV01.mmObject(), UndertakingTerminationNotificationV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}