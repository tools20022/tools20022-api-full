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
 * Messages that support ancillary commercial trade services functions,
 * including checking, matching and reporting, plus any exceptions and
 * investigations related to trade services transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03
 * AcknowledgementV03}</li>
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
 * <li>{@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04
 * ActivityReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02
 * IntentToPayNotificationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02
 * ForwardIntentToPayNotificationV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04
 * BaselineReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05
 * InitialBaselineSubmissionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05
 * BaselineAmendmentRequestV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05
 * FullPushThroughReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05
 * ForwardDataSetSubmissionReportV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05
 * DataSetSubmissionV05}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05
 * BaselineReSubmissionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationAdviceV01
 * InvoicePaymentReconciliationAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01
 * PartyEventAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InvoicePaymentReconciliationStatusV01
 * InvoicePaymentReconciliationStatusV01}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "tsmt"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmcatalogue
 * GeneratedRepository.mmcatalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Trade Services Management - Latest version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support ancillary commercial trade services functions, including checking, matching and reporting, plus any exceptions and investigations related to trade services transactions."
 * </li>
 * </ul>
 */
public class TradeServicesManagementLatestVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.mmcatalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trade Services Management - Latest version - master";
				definition = "Messages that support ancillary commercial trade services functions, including checking, matching and reporting, plus any exceptions and investigations related to trade services transactions.";
				messageDefinition_lazy = () -> Arrays.asList(AcknowledgementV03.mmObject(), ActivityReportRequestV03.mmObject(), ActivityReportSetUpRequestV02.mmObject(), AmendmentAcceptanceV02.mmObject(),
						AmendmentAcceptanceNotificationV03.mmObject(), AmendmentRejectionV02.mmObject(), AmendmentRejectionNotificationV03.mmObject(), BaselineMatchReportV03.mmObject(), DataSetMatchReportV03.mmObject(),
						DeltaReportV03.mmObject(), ErrorReportV03.mmObject(), MisMatchAcceptanceV02.mmObject(), MisMatchAcceptanceNotificationV03.mmObject(), MisMatchRejectionV02.mmObject(), MisMatchRejectionNotificationV03.mmObject(),
						ActionReminderV03.mmObject(), StatusChangeNotificationV03.mmObject(), StatusChangeRequestV02.mmObject(), StatusChangeRequestAcceptanceV02.mmObject(), StatusChangeRequestNotificationV03.mmObject(),
						StatusChangeRequestRejectionV02.mmObject(), StatusChangeRequestRejectionNotificationV03.mmObject(), StatusExtensionRequestAcceptanceV03.mmObject(), StatusExtensionNotificationV03.mmObject(),
						StatusExtensionRequestRejectionV03.mmObject(), StatusExtensionRejectionNotificationV03.mmObject(), StatusExtensionRequestV03.mmObject(), StatusExtensionRequestNotificationV03.mmObject(), StatusReportV03.mmObject(),
						StatusReportRequestV03.mmObject(), TimeOutNotificationV03.mmObject(), TransactionReportV03.mmObject(), TransactionReportRequestV03.mmObject(), IntentToPayReportV01.mmObject(), SpecialRequestV01.mmObject(),
						SpecialNotificationV01.mmObject(), RoleAndBaselineAcceptanceV01.mmObject(), RoleAndBaselineRejectionV01.mmObject(), RoleAndBaselineAcceptanceNotificationV01.mmObject(),
						RoleAndBaselineRejectionNotificationV01.mmObject(), ActivityReportV04.mmObject(), IntentToPayNotificationV02.mmObject(), ForwardIntentToPayNotificationV02.mmObject(), BaselineReportV04.mmObject(),
						InitialBaselineSubmissionV05.mmObject(), BaselineAmendmentRequestV05.mmObject(), FullPushThroughReportV05.mmObject(), ForwardDataSetSubmissionReportV05.mmObject(), DataSetSubmissionV05.mmObject(),
						BaselineReSubmissionV05.mmObject(), InvoicePaymentReconciliationAdviceV01.mmObject(), PartyEventAdviceV01.mmObject(), InvoicePaymentReconciliationStatusV01.mmObject());
				code = "tsmt";
			}
		});
		return mmObject_lazy.get();
	}
}