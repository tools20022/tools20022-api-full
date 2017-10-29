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
import com.tools20022.repository.codeset.Action2Code;
import com.tools20022.repository.datatype.Max140Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the event that require an action from one of the parties to the
 * trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PendingActivity2#Type
 * PendingActivity2.Type}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingActivity2#Description
 * PendingActivity2.Description}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#RequestForAction
 * AcknowledgementV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#RequestForAction
 * AmendmentAcceptanceNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#RequestForAction
 * AmendmentRejectionNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#RequestForAction
 * BaselineMatchReportV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#RequestForAction
 * BaselineReportV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#RequestForAction
 * DataSetMatchReportV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#RequestForAction
 * DeltaReportV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#RequestForAction
 * ErrorReportV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#RequestForAction
 * ForwardDataSetSubmissionReportV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#RequestForAction
 * FullPushThroughReportV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#RequestForAction
 * MisMatchAcceptanceNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#RequestForAction
 * MisMatchRejectionNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#PendingRequestForAction
 * ActionReminderV03.PendingRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#RequestForAction
 * StatusChangeNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#RequestForAction
 * StatusChangeRequestNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#RequestForAction
 * StatusChangeRequestRejectionNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#RequestForAction
 * StatusExtensionNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#RequestForAction
 * StatusExtensionRejectionNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#RequestForAction
 * StatusExtensionRequestNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#RequestForAction
 * TimeOutNotificationV03.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#RequestForAction
 * ForwardIntentToPayNotificationV01.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#RequestForAction
 * SpecialNotificationV01.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#RequestForAction
 * RoleAndBaselineAcceptanceNotificationV01.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#RequestForAction
 * RoleAndBaselineRejectionNotificationV01.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#RequestForAction
 * FullPushThroughReportV04.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#RequestForAction
 * ForwardDataSetSubmissionReportV04.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#RequestForAction
 * ForwardIntentToPayNotificationV02.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#RequestForAction
 * BaselineReportV04.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#RequestForAction
 * FullPushThroughReportV05.RequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#RequestForAction
 * ForwardDataSetSubmissionReportV05.RequestForAction}</li>
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
 * "PendingActivity2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the event that require an action from one of the parties to the trade transaction."
 * </li>
 * </ul>
 */
public class PendingActivity2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code which specifies the next course of action that the receiver of the
	 * message must take.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Action2Code
	 * Action2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingActivity2
	 * PendingActivity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code which specifies the next course of action that the receiver of the message must take."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PendingActivity2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Code which specifies the next course of action that the receiver of the message must take.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Action2Code.mmObject();
		}
	};
	/**
	 * Further information on the course of action that the receiver of the
	 * message must take.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingActivity2
	 * PendingActivity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information on the course of action that the receiver of the message must take."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Description = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PendingActivity2.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Further information on the course of action that the receiver of the message must take.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PendingActivity2.Type, com.tools20022.repository.msg.PendingActivity2.Description);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.AcknowledgementV03.RequestForAction, com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.RequestForAction,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.RequestForAction, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.RequestForAction,
						com.tools20022.repository.area.tsmt.BaselineReportV03.RequestForAction, com.tools20022.repository.area.tsmt.DataSetMatchReportV03.RequestForAction,
						com.tools20022.repository.area.tsmt.DeltaReportV03.RequestForAction, com.tools20022.repository.area.tsmt.ErrorReportV03.RequestForAction,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.RequestForAction, com.tools20022.repository.area.tsmt.FullPushThroughReportV03.RequestForAction,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.RequestForAction, com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.RequestForAction,
						com.tools20022.repository.area.tsmt.ActionReminderV03.PendingRequestForAction, com.tools20022.repository.area.tsmt.StatusChangeNotificationV03.RequestForAction,
						com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03.RequestForAction, com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03.RequestForAction,
						com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03.RequestForAction, com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03.RequestForAction,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03.RequestForAction, com.tools20022.repository.area.tsmt.TimeOutNotificationV03.RequestForAction,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.RequestForAction, com.tools20022.repository.area.tsmt.SpecialNotificationV01.RequestForAction,
						com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01.RequestForAction, com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01.RequestForAction,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV04.RequestForAction, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.RequestForAction,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.RequestForAction, com.tools20022.repository.area.tsmt.BaselineReportV04.RequestForAction,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.RequestForAction, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.RequestForAction);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PendingActivity2";
				definition = "Specifies the event that require an action from one of the parties to the trade transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}