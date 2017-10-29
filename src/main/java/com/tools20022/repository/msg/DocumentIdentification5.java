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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.FinancialInstitution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies a document by a unique identification and its issuer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5#Identification
 * DocumentIdentification5.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5#IdentificationIssuer
 * DocumentIdentification5.IdentificationIssuer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#UserTransactionReference
 * AcknowledgementV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#UserTransactionReference
 * AmendmentAcceptanceNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#UserTransactionReference
 * AmendmentRejectionNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#UserTransactionReference
 * BaselineMatchReportV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#UserTransactionReference
 * BaselineReportV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#UserTransactionReference
 * DataSetMatchReportV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#UserTransactionReference
 * DeltaReportV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#UserTransactionReference
 * ErrorReportV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#UserTransactionReference
 * FullPushThroughReportV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#UserTransactionReference
 * MisMatchAcceptanceNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#UserTransactionReference
 * MisMatchRejectionNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#UserTransactionReference
 * ActionReminderV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#UserTransactionReference
 * StatusChangeNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#UserTransactionReference
 * StatusChangeRequestNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#UserTransactionReference
 * StatusChangeRequestRejectionNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#UserTransactionReference
 * StatusExtensionNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#UserTransactionReference
 * StatusExtensionRejectionNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#UserTransactionReference
 * StatusExtensionRequestNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#UserTransactionReference
 * TimeOutNotificationV03.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#UserTransactionReference
 * ForwardIntentToPayNotificationV01.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#UserTransactionReference
 * SpecialNotificationV01.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#UserTransactionReference
 * RoleAndBaselineAcceptanceNotificationV01.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#UserTransactionReference
 * RoleAndBaselineRejectionNotificationV01.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#UserTransactionReference
 * FullPushThroughReportV04.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#UserTransactionReference
 * ForwardIntentToPayNotificationV02.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#UserTransactionReference
 * BaselineReportV04.UserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#UserTransactionReference
 * FullPushThroughReportV05.UserTransactionReference}</li>
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
 * "DocumentIdentification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a document by a unique identification and its issuer."</li>
 * </ul>
 */
public class DocumentIdentification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of a set of data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a set of data."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a set of data.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Uniquely identifies the financial institution which has issued the
	 * identification of the set of data by using a BIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Uniquely identifies the financial institution which has issued the identification of the set of data by using a BIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IdentificationIssuer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DocumentIdentification5.mmObject();
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			isDerived = false;
			xmlTag = "IdIssr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationIssuer";
			definition = "Uniquely identifies the financial institution which has issued the identification of the set of data by using a BIC.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BICIdentification1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification5.Identification, com.tools20022.repository.msg.DocumentIdentification5.IdentificationIssuer);
				trace_lazy = () -> Document.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.AcknowledgementV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.UserTransactionReference, com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.UserTransactionReference, com.tools20022.repository.area.tsmt.BaselineReportV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.DataSetMatchReportV03.UserTransactionReference, com.tools20022.repository.area.tsmt.DeltaReportV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.ErrorReportV03.UserTransactionReference, com.tools20022.repository.area.tsmt.FullPushThroughReportV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.UserTransactionReference, com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.ActionReminderV03.UserTransactionReference, com.tools20022.repository.area.tsmt.StatusChangeNotificationV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03.UserTransactionReference, com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03.UserTransactionReference, com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03.UserTransactionReference, com.tools20022.repository.area.tsmt.TimeOutNotificationV03.UserTransactionReference,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.UserTransactionReference, com.tools20022.repository.area.tsmt.SpecialNotificationV01.UserTransactionReference,
						com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01.UserTransactionReference, com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01.UserTransactionReference,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV04.UserTransactionReference, com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.UserTransactionReference,
						com.tools20022.repository.area.tsmt.BaselineReportV04.UserTransactionReference, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.UserTransactionReference);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification5";
				definition = "Identifies a document by a unique identification and its issuer.";
			}
		});
		return mmObject_lazy.get();
	}
}