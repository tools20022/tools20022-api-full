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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies a document by a unique identification and a version.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#Identification
 * DocumentIdentification3.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#Version
 * DocumentIdentification3.Version}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#EstablishedBaselineIdentification
 * AcknowledgementV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#EstablishedBaselineIdentification
 * AmendmentAcceptanceNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#EstablishedBaselineIdentification
 * AmendmentRejectionNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#EstablishedBaselineIdentification
 * BaselineMatchReportV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#EstablishedBaselineIdentification
 * DataSetMatchReportV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#EstablishedBaselineIdentification
 * DeltaReportV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#EstablishedBaselineIdentification
 * ErrorReportV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#EstablishedBaselineIdentification
 * FullPushThroughReportV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#EstablishedBaselineIdentification
 * MisMatchAcceptanceNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#EstablishedBaselineIdentification
 * MisMatchRejectionNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#EstablishedBaselineIdentification
 * ActionReminderV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#EstablishedBaselineIdentification
 * StatusChangeNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#EstablishedBaselineIdentification
 * StatusChangeRequestNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#EstablishedBaselineIdentification
 * StatusChangeRequestRejectionNotificationV03.EstablishedBaselineIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#EstablishedBaselineIdentification
 * StatusExtensionNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#EstablishedBaselineIdentification
 * StatusExtensionRejectionNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#EstablishedBaselineIdentification
 * StatusExtensionRequestNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#EstablishedBaselineIdentification
 * TimeOutNotificationV03.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#EstablishedBaselineIdentification
 * ForwardIntentToPayNotificationV01.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#EstablishedBaselineIdentification
 * SpecialNotificationV01.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#EstablishedBaselineIdentification
 * RoleAndBaselineAcceptanceNotificationV01.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#EstablishedBaselineIdentification
 * RoleAndBaselineRejectionNotificationV01.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#EstablishedBaselineIdentification
 * FullPushThroughReportV04.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#EstablishedBaselineIdentification
 * ForwardIntentToPayNotificationV02.EstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#EstablishedBaselineIdentification
 * FullPushThroughReportV05.EstablishedBaselineIdentification}</li>
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
 * "DocumentIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a document by a unique identification and a version."</li>
 * </ul>
 */
public class DocumentIdentification3 {

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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3
	 * DocumentIdentification3}</li>
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
			componentContext_lazy = () -> DocumentIdentification3.mmObject();
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
	 * Unambiguous identification of the version of a set of data. Example:
	 * Version 1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#DocumentVersion
	 * Document.DocumentVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3
	 * DocumentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the version of a set of data. Example: Version 1."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Version = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.DocumentVersion;
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Unambiguous identification of the version of a set of data. Example: Version 1.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification3.Identification, com.tools20022.repository.msg.DocumentIdentification3.Version);
				trace_lazy = () -> Document.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.AcknowledgementV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.DataSetMatchReportV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.DeltaReportV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.ErrorReportV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.ActionReminderV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeNotificationV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.TimeOutNotificationV03.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.SpecialNotificationV01.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.FullPushThroughReportV04.EstablishedBaselineIdentification,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.EstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.EstablishedBaselineIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification3";
				definition = "Identifies a document by a unique identification and a version.";
			}
		});
		return mmObject_lazy.get();
	}
}