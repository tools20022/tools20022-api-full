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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.BaselineStatus3Code;
import com.tools20022.repository.entity.BaselineStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the status of the transaction by means of a code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionStatus4#Status
 * TransactionStatus4.Status}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BaselineStatus
 * BaselineStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#TransactionStatus
 * AcknowledgementV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#TransactionStatus
 * AmendmentAcceptanceNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#TransactionStatus
 * AmendmentRejectionNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#TransactionStatus
 * BaselineMatchReportV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#TransactionStatus
 * BaselineReportV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#TransactionStatus
 * DataSetMatchReportV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#TransactionStatus
 * DeltaReportV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#TransactionStatus
 * ErrorReportV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#TransactionStatus
 * FullPushThroughReportV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#TransactionStatus
 * MisMatchAcceptanceNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#TransactionStatus
 * MisMatchRejectionNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#TransactionStatus
 * ActionReminderV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#TransactionStatus
 * StatusChangeNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#TransactionStatus
 * StatusChangeRequestNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#TransactionStatus
 * StatusChangeRequestRejectionNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#ExtendedStatus
 * StatusExtensionRequestAcceptanceV03.ExtendedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#StatusNotToBeExtended
 * StatusExtensionRequestRejectionV03.StatusNotToBeExtended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#NonExtendedStatus
 * StatusExtensionRejectionNotificationV03.NonExtendedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#TransactionStatus
 * TimeOutNotificationV03.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#TransactionStatus
 * ForwardIntentToPayNotificationV01.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#TransactionStatus
 * SpecialNotificationV01.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#TransactionStatus
 * RoleAndBaselineAcceptanceNotificationV01.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#TransactionStatus
 * RoleAndBaselineRejectionNotificationV01.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#TransactionStatus
 * FullPushThroughReportV04.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#TransactionStatus
 * ForwardIntentToPayNotificationV02.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#TransactionStatus
 * BaselineReportV04.TransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#TransactionStatus
 * FullPushThroughReportV05.TransactionStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionStatus4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of the transaction by means of a code."</li>
 * </ul>
 */
public class TransactionStatus4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the status of the transaction by means of a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BaselineStatus#Status
	 * BaselineStatus.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus4
	 * TransactionStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status of the transaction by means of a code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Status = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionStatus4.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.BaselineStatus.Status;
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Identifies the status of the transaction by means of a code.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaselineStatus3Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionStatus4.Status);
				trace_lazy = () -> BaselineStatus.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.AcknowledgementV03.TransactionStatus, com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.TransactionStatus,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.TransactionStatus, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.TransactionStatus,
						com.tools20022.repository.area.tsmt.BaselineReportV03.TransactionStatus, com.tools20022.repository.area.tsmt.DataSetMatchReportV03.TransactionStatus,
						com.tools20022.repository.area.tsmt.DeltaReportV03.TransactionStatus, com.tools20022.repository.area.tsmt.ErrorReportV03.TransactionStatus,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV03.TransactionStatus, com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.TransactionStatus,
						com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.TransactionStatus, com.tools20022.repository.area.tsmt.ActionReminderV03.TransactionStatus,
						com.tools20022.repository.area.tsmt.StatusChangeNotificationV03.TransactionStatus, com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03.TransactionStatus,
						com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03.TransactionStatus, com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03.ExtendedStatus,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.StatusNotToBeExtended, com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03.NonExtendedStatus,
						com.tools20022.repository.area.tsmt.TimeOutNotificationV03.TransactionStatus, com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.TransactionStatus,
						com.tools20022.repository.area.tsmt.SpecialNotificationV01.TransactionStatus, com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01.TransactionStatus,
						com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01.TransactionStatus, com.tools20022.repository.area.tsmt.FullPushThroughReportV04.TransactionStatus,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.TransactionStatus, com.tools20022.repository.area.tsmt.BaselineReportV04.TransactionStatus,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.TransactionStatus);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionStatus4";
				definition = "Identifies the status of the transaction by means of a code.";
			}
		});
		return mmObject_lazy.get();
	}
}