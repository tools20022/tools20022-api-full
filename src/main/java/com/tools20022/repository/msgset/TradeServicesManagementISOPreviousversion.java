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
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of messages exchanged between a matching application, with integrated
 * workflow management, and its users to cover the establishment of a
 * transaction (also referred to as baseline), the matching of data sets, the
 * amendment of a baseline and related reporting.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03
 * AcknowledgementV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.ActivityReportV03
 * ActivityReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03
 * ActivityReportRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportSetUpRequestV02
 * ActivityReportSetUpRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02
 * AmendmentAcceptanceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03
 * AmendmentAcceptanceNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02
 * AmendmentRejectionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03
 * AmendmentRejectionNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03
 * BaselineMatchReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03
 * BaselineReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03
 * DataSetMatchReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03
 * DeltaReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03
 * ErrorReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02
 * MisMatchAcceptanceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03
 * MisMatchAcceptanceNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02
 * MisMatchRejectionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03
 * MisMatchRejectionNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03
 * ActionReminderV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03
 * StatusChangeNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02
 * StatusChangeRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02
 * StatusChangeRequestAcceptanceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03
 * StatusChangeRequestNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02
 * StatusChangeRequestRejectionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03
 * StatusChangeRequestRejectionNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03
 * StatusExtensionRequestAcceptanceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03
 * StatusExtensionNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03
 * StatusExtensionRequestRejectionV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03
 * StatusExtensionRejectionNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03
 * StatusExtensionRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03
 * StatusExtensionRequestNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.StatusReportV03
 * StatusReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03
 * StatusReportRequestV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03
 * TimeOutNotificationV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03
 * TransactionReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportRequestV03
 * TransactionReportRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01
 * IntentToPayNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01
 * ForwardIntentToPayNotificationV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.IntentToPayReportV01
 * IntentToPayReportV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01
 * SpecialRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01
 * SpecialNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01
 * RoleAndBaselineAcceptanceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01
 * RoleAndBaselineRejectionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01
 * RoleAndBaselineAcceptanceNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01
 * RoleAndBaselineRejectionNotificationV01}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Trade Services Management - ISO - Previous version"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of messages exchanged between a matching application, with integrated workflow management, and its users to cover the establishment of a transaction (also referred to as baseline), the matching of data sets, the amendment of a baseline and related reporting.\r\n"
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class TradeServicesManagementISOPreviousversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Trade Services Management - ISO - Previous version";
				definition = "Set of messages exchanged between a matching application, with integrated workflow management, and its users to cover the establishment of a transaction (also referred to as baseline), the matching of data sets, the amendment of a baseline and related reporting.\r\n";
				messageDefinition_lazy = () -> Arrays.asList(AcknowledgementV03.mmObject(), ActivityReportV03.mmObject(), ActivityReportRequestV03.mmObject(), ActivityReportSetUpRequestV02.mmObject(), AmendmentAcceptanceV02.mmObject(),
						AmendmentAcceptanceNotificationV03.mmObject(), AmendmentRejectionV02.mmObject(), AmendmentRejectionNotificationV03.mmObject(), BaselineMatchReportV03.mmObject(), BaselineReportV03.mmObject(),
						DataSetMatchReportV03.mmObject(), DeltaReportV03.mmObject(), ErrorReportV03.mmObject(), MisMatchAcceptanceV02.mmObject(), MisMatchAcceptanceNotificationV03.mmObject(), MisMatchRejectionV02.mmObject(),
						MisMatchRejectionNotificationV03.mmObject(), ActionReminderV03.mmObject(), StatusChangeNotificationV03.mmObject(), StatusChangeRequestV02.mmObject(), StatusChangeRequestAcceptanceV02.mmObject(),
						StatusChangeRequestNotificationV03.mmObject(), StatusChangeRequestRejectionV02.mmObject(), StatusChangeRequestRejectionNotificationV03.mmObject(), StatusExtensionRequestAcceptanceV03.mmObject(),
						StatusExtensionNotificationV03.mmObject(), StatusExtensionRequestRejectionV03.mmObject(), StatusExtensionRejectionNotificationV03.mmObject(), StatusExtensionRequestV03.mmObject(),
						StatusExtensionRequestNotificationV03.mmObject(), StatusReportV03.mmObject(), StatusReportRequestV03.mmObject(), TimeOutNotificationV03.mmObject(), TransactionReportV03.mmObject(),
						TransactionReportRequestV03.mmObject(), IntentToPayNotificationV01.mmObject(), ForwardIntentToPayNotificationV01.mmObject(), IntentToPayReportV01.mmObject(), SpecialRequestV01.mmObject(),
						SpecialNotificationV01.mmObject(), RoleAndBaselineAcceptanceV01.mmObject(), RoleAndBaselineRejectionV01.mmObject(), RoleAndBaselineAcceptanceNotificationV01.mmObject(),
						RoleAndBaselineRejectionNotificationV01.mmObject(), BaselineReSubmissionV04.mmObject(), DataSetSubmissionV04.mmObject(), FullPushThroughReportV04.mmObject(), BaselineAmendmentRequestV04.mmObject(),
						ForwardDataSetSubmissionReportV04.mmObject(), InitialBaselineSubmissionV04.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}