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
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The Trade Services Management business area contains messages that support
 * ancillary commercial trade services functions, including checking, matching
 * and reporting, plus any exceptions and investigations related to trade
 * services transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "tsmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.ActivityReportV03
 * ActivityReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03
 * BaselineReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01
 * IntentToPayNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01
 * ForwardIntentToPayNotificationV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04
 * BaselineReSubmissionV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04
 * DataSetSubmissionV04}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04
 * FullPushThroughReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04
 * BaselineAmendmentRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04
 * ForwardDataSetSubmissionReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04
 * InitialBaselineSubmissionV04}</li>
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
 * "Trade Services Management - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The Trade Services Management business area contains messages that support ancillary commercial trade services functions, including checking, matching and reporting, plus any exceptions and investigations related to trade services transactions."
 * </li>
 * </ul>
 */
public class TradeServicesManagementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Trade Services Management - Previous version - master";
				definition = "The Trade Services Management business area contains messages that support ancillary commercial trade services functions, including checking, matching and reporting, plus any exceptions and investigations related to trade services transactions.";
				messageDefinition_lazy = () -> Arrays.asList(ActivityReportV03.mmObject(), BaselineReportV03.mmObject(), IntentToPayNotificationV01.mmObject(), ForwardIntentToPayNotificationV01.mmObject(),
						BaselineReSubmissionV04.mmObject(), DataSetSubmissionV04.mmObject(), FullPushThroughReportV04.mmObject(), BaselineAmendmentRequestV04.mmObject(), ForwardDataSetSubmissionReportV04.mmObject(),
						InitialBaselineSubmissionV04.mmObject());
				code = "tsmt";
			}
		});
		return mmObject_lazy.get();
	}
}