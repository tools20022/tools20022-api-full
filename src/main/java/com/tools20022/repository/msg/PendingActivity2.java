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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.codeset.Action2Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.PendingActivity2#mmType
 * PendingActivity2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PendingActivity2#mmDescription
 * PendingActivity2.mmDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmRequestForAction
 * AcknowledgementV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmRequestForAction
 * AmendmentAcceptanceNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmRequestForAction
 * AmendmentRejectionNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmRequestForAction
 * BaselineMatchReportV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmRequestForAction
 * BaselineReportV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmRequestForAction
 * DataSetMatchReportV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmRequestForAction
 * DeltaReportV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmRequestForAction
 * ErrorReportV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmRequestForAction
 * ForwardDataSetSubmissionReportV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#mmRequestForAction
 * FullPushThroughReportV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmRequestForAction
 * MisMatchAcceptanceNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmRequestForAction
 * MisMatchRejectionNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmPendingRequestForAction
 * ActionReminderV03.mmPendingRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#mmRequestForAction
 * StatusChangeNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#mmRequestForAction
 * StatusChangeRequestNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#mmRequestForAction
 * StatusChangeRequestRejectionNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#mmRequestForAction
 * StatusExtensionNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#mmRequestForAction
 * StatusExtensionRejectionNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#mmRequestForAction
 * StatusExtensionRequestNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#mmRequestForAction
 * TimeOutNotificationV03.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmRequestForAction
 * ForwardIntentToPayNotificationV01.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#mmRequestForAction
 * SpecialNotificationV01.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#mmRequestForAction
 * RoleAndBaselineAcceptanceNotificationV01.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#mmRequestForAction
 * RoleAndBaselineRejectionNotificationV01.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmRequestForAction
 * FullPushThroughReportV04.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmRequestForAction
 * ForwardDataSetSubmissionReportV04.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmRequestForAction
 * ForwardIntentToPayNotificationV02.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmRequestForAction
 * BaselineReportV04.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmRequestForAction
 * FullPushThroughReportV05.mmRequestForAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmRequestForAction
 * ForwardDataSetSubmissionReportV05.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Action2Code type;
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
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PendingActivity2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Code which specifies the next course of action that the receiver of the message must take.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Action2Code.mmObject();
		}
	};
	protected Max140Text description;
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
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PendingActivity2.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Further information on the course of action that the receiver of the message must take.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PendingActivity2.mmType, PendingActivity2.mmDescription);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcknowledgementV03.mmRequestForAction, AmendmentAcceptanceNotificationV03.mmRequestForAction, AmendmentRejectionNotificationV03.mmRequestForAction,
						BaselineMatchReportV03.mmRequestForAction, BaselineReportV03.mmRequestForAction, DataSetMatchReportV03.mmRequestForAction, DeltaReportV03.mmRequestForAction, ErrorReportV03.mmRequestForAction,
						ForwardDataSetSubmissionReportV03.mmRequestForAction, FullPushThroughReportV03.mmRequestForAction, MisMatchAcceptanceNotificationV03.mmRequestForAction, MisMatchRejectionNotificationV03.mmRequestForAction,
						ActionReminderV03.mmPendingRequestForAction, StatusChangeNotificationV03.mmRequestForAction, StatusChangeRequestNotificationV03.mmRequestForAction, StatusChangeRequestRejectionNotificationV03.mmRequestForAction,
						StatusExtensionNotificationV03.mmRequestForAction, StatusExtensionRejectionNotificationV03.mmRequestForAction, StatusExtensionRequestNotificationV03.mmRequestForAction, TimeOutNotificationV03.mmRequestForAction,
						ForwardIntentToPayNotificationV01.mmRequestForAction, SpecialNotificationV01.mmRequestForAction, RoleAndBaselineAcceptanceNotificationV01.mmRequestForAction,
						RoleAndBaselineRejectionNotificationV01.mmRequestForAction, FullPushThroughReportV04.mmRequestForAction, ForwardDataSetSubmissionReportV04.mmRequestForAction, ForwardIntentToPayNotificationV02.mmRequestForAction,
						BaselineReportV04.mmRequestForAction, FullPushThroughReportV05.mmRequestForAction, ForwardDataSetSubmissionReportV05.mmRequestForAction);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingActivity2";
				definition = "Specifies the event that require an action from one of the parties to the trade transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Action2Code getType() {
		return type;
	}

	public void setType(Action2Code type) {
		this.type = type;
	}

	public Max140Text getDescription() {
		return description;
	}

	public void setDescription(Max140Text description) {
		this.description = description;
	}
}