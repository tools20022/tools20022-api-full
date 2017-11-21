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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#mmIdentification
 * DocumentIdentification3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#mmVersion
 * DocumentIdentification3.mmVersion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmEstablishedBaselineIdentification
 * AcknowledgementV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmEstablishedBaselineIdentification
 * AmendmentAcceptanceNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmEstablishedBaselineIdentification
 * AmendmentRejectionNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmEstablishedBaselineIdentification
 * BaselineMatchReportV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmEstablishedBaselineIdentification
 * DataSetMatchReportV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmEstablishedBaselineIdentification
 * DeltaReportV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmEstablishedBaselineIdentification
 * ErrorReportV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#mmEstablishedBaselineIdentification
 * FullPushThroughReportV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmEstablishedBaselineIdentification
 * MisMatchAcceptanceNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmEstablishedBaselineIdentification
 * MisMatchRejectionNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmEstablishedBaselineIdentification
 * ActionReminderV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#mmEstablishedBaselineIdentification
 * StatusChangeNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#mmEstablishedBaselineIdentification
 * StatusChangeRequestNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#mmEstablishedBaselineIdentification
 * StatusChangeRequestRejectionNotificationV03.
 * mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#mmEstablishedBaselineIdentification
 * StatusExtensionNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#mmEstablishedBaselineIdentification
 * StatusExtensionRejectionNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#mmEstablishedBaselineIdentification
 * StatusExtensionRequestNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#mmEstablishedBaselineIdentification
 * TimeOutNotificationV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmEstablishedBaselineIdentification
 * ForwardIntentToPayNotificationV01.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#mmEstablishedBaselineIdentification
 * SpecialNotificationV01.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#mmEstablishedBaselineIdentification
 * RoleAndBaselineAcceptanceNotificationV01.mmEstablishedBaselineIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#mmEstablishedBaselineIdentification
 * RoleAndBaselineRejectionNotificationV01.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmEstablishedBaselineIdentification
 * FullPushThroughReportV04.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmEstablishedBaselineIdentification
 * ForwardIntentToPayNotificationV02.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmEstablishedBaselineIdentification
 * FullPushThroughReportV05.mmEstablishedBaselineIdentification}</li>
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
 * "DocumentIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a document by a unique identification and a version."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DocumentIdentification3", propOrder = {"identification", "version"})
public class DocumentIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
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
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> DocumentIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a set of data.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number version;
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentVersion
	 * Document.mmDocumentVersion}</li>
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
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmDocumentVersion;
			componentContext_lazy = () -> DocumentIdentification3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Unambiguous identification of the version of a set of data. Example: Version 1.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DocumentIdentification3.mmIdentification, DocumentIdentification3.mmVersion);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcknowledgementV03.mmEstablishedBaselineIdentification, AmendmentAcceptanceNotificationV03.mmEstablishedBaselineIdentification,
						AmendmentRejectionNotificationV03.mmEstablishedBaselineIdentification, BaselineMatchReportV03.mmEstablishedBaselineIdentification, DataSetMatchReportV03.mmEstablishedBaselineIdentification,
						DeltaReportV03.mmEstablishedBaselineIdentification, ErrorReportV03.mmEstablishedBaselineIdentification, FullPushThroughReportV03.mmEstablishedBaselineIdentification,
						MisMatchAcceptanceNotificationV03.mmEstablishedBaselineIdentification, MisMatchRejectionNotificationV03.mmEstablishedBaselineIdentification, ActionReminderV03.mmEstablishedBaselineIdentification,
						StatusChangeNotificationV03.mmEstablishedBaselineIdentification, StatusChangeRequestNotificationV03.mmEstablishedBaselineIdentification,
						StatusChangeRequestRejectionNotificationV03.mmEstablishedBaselineIdentification, StatusExtensionNotificationV03.mmEstablishedBaselineIdentification,
						StatusExtensionRejectionNotificationV03.mmEstablishedBaselineIdentification, StatusExtensionRequestNotificationV03.mmEstablishedBaselineIdentification, TimeOutNotificationV03.mmEstablishedBaselineIdentification,
						ForwardIntentToPayNotificationV01.mmEstablishedBaselineIdentification, SpecialNotificationV01.mmEstablishedBaselineIdentification, RoleAndBaselineAcceptanceNotificationV01.mmEstablishedBaselineIdentification,
						RoleAndBaselineRejectionNotificationV01.mmEstablishedBaselineIdentification, FullPushThroughReportV04.mmEstablishedBaselineIdentification, ForwardIntentToPayNotificationV02.mmEstablishedBaselineIdentification,
						FullPushThroughReportV05.mmEstablishedBaselineIdentification);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification3";
				definition = "Identifies a document by a unique identification and a version.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Vrsn", required = true)
	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}
}