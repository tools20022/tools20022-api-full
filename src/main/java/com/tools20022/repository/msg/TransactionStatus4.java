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
import com.tools20022.repository.codeset.BaselineStatus3Code;
import com.tools20022.repository.entity.BaselineStatus;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.TransactionStatus4#mmStatus
 * TransactionStatus4.mmStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmTransactionStatus
 * AcknowledgementV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmTransactionStatus
 * AmendmentAcceptanceNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmTransactionStatus
 * AmendmentRejectionNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmTransactionStatus
 * BaselineMatchReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmTransactionStatus
 * BaselineReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmTransactionStatus
 * DataSetMatchReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmTransactionStatus
 * DeltaReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmTransactionStatus
 * ErrorReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#mmTransactionStatus
 * FullPushThroughReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmTransactionStatus
 * MisMatchAcceptanceNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmTransactionStatus
 * MisMatchRejectionNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmTransactionStatus
 * ActionReminderV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#mmTransactionStatus
 * StatusChangeNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#mmTransactionStatus
 * StatusChangeRequestNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#mmTransactionStatus
 * StatusChangeRequestRejectionNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#mmExtendedStatus
 * StatusExtensionRequestAcceptanceV03.mmExtendedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmStatusNotToBeExtended
 * StatusExtensionRequestRejectionV03.mmStatusNotToBeExtended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#mmNonExtendedStatus
 * StatusExtensionRejectionNotificationV03.mmNonExtendedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#mmTransactionStatus
 * TimeOutNotificationV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmTransactionStatus
 * ForwardIntentToPayNotificationV01.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#mmTransactionStatus
 * SpecialNotificationV01.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#mmTransactionStatus
 * RoleAndBaselineAcceptanceNotificationV01.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#mmTransactionStatus
 * RoleAndBaselineRejectionNotificationV01.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmTransactionStatus
 * FullPushThroughReportV04.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmTransactionStatus
 * ForwardIntentToPayNotificationV02.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmTransactionStatus
 * BaselineReportV04.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmTransactionStatus
 * FullPushThroughReportV05.mmTransactionStatus}</li>
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
 * "TransactionStatus4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of the transaction by means of a code."</li>
 * </ul>
 */
public class TransactionStatus4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BaselineStatus3Code status;
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
	 * {@linkplain com.tools20022.repository.entity.BaselineStatus#mmStatus
	 * BaselineStatus.mmStatus}</li>
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
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BaselineStatus.mmStatus;
			componentContext_lazy = () -> TransactionStatus4.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Identifies the status of the transaction by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaselineStatus3Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionStatus4.mmStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcknowledgementV03.mmTransactionStatus, AmendmentAcceptanceNotificationV03.mmTransactionStatus, AmendmentRejectionNotificationV03.mmTransactionStatus,
						BaselineMatchReportV03.mmTransactionStatus, BaselineReportV03.mmTransactionStatus, DataSetMatchReportV03.mmTransactionStatus, DeltaReportV03.mmTransactionStatus, ErrorReportV03.mmTransactionStatus,
						FullPushThroughReportV03.mmTransactionStatus, MisMatchAcceptanceNotificationV03.mmTransactionStatus, MisMatchRejectionNotificationV03.mmTransactionStatus, ActionReminderV03.mmTransactionStatus,
						StatusChangeNotificationV03.mmTransactionStatus, StatusChangeRequestNotificationV03.mmTransactionStatus, StatusChangeRequestRejectionNotificationV03.mmTransactionStatus,
						StatusExtensionRequestAcceptanceV03.mmExtendedStatus, StatusExtensionRequestRejectionV03.mmStatusNotToBeExtended, StatusExtensionRejectionNotificationV03.mmNonExtendedStatus,
						TimeOutNotificationV03.mmTransactionStatus, ForwardIntentToPayNotificationV01.mmTransactionStatus, SpecialNotificationV01.mmTransactionStatus, RoleAndBaselineAcceptanceNotificationV01.mmTransactionStatus,
						RoleAndBaselineRejectionNotificationV01.mmTransactionStatus, FullPushThroughReportV04.mmTransactionStatus, ForwardIntentToPayNotificationV02.mmTransactionStatus, BaselineReportV04.mmTransactionStatus,
						FullPushThroughReportV05.mmTransactionStatus);
				trace_lazy = () -> BaselineStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionStatus4";
				definition = "Identifies the status of the transaction by means of a code.";
			}
		});
		return mmObject_lazy.get();
	}

	public BaselineStatus3Code getStatus() {
		return status;
	}

	public void setStatus(BaselineStatus3Code status) {
		this.status = status;
	}
}