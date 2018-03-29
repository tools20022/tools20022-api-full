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
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to an identification, eg, party identification or account
 * identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation#mmIdentification
 * SimpleIdentificationInformation.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmTransactionIdentification
 * AcknowledgementV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#mmTransactionIdentification
 * AmendmentAcceptanceV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#mmSubmitterTransactionReference
 * AmendmentAcceptanceV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmTransactionIdentification
 * AmendmentAcceptanceNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmTransactionIdentification
 * AmendmentRejectionV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmSubmitterTransactionReference
 * AmendmentRejectionV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmTransactionIdentification
 * AmendmentRejectionNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmTransactionIdentification
 * BaselineAmendmentRequestV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#mmSubmitterTransactionReference
 * BaselineAmendmentRequestV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmTransactionIdentification
 * BaselineMatchReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#mmTransactionIdentification
 * BaselineReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmTransactionIdentification
 * BaselineReSubmissionV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSubmitterTransactionReference
 * BaselineReSubmissionV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmTransactionIdentification
 * DataSetMatchReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmCommonSubmissionReference
 * DataSetSubmissionV03.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmTransactionIdentification
 * DeltaReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmTransactionIdentification
 * ErrorReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmCommonSubmissionReference
 * ForwardDataSetSubmissionReportV03.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#mmTransactionIdentification
 * FullPushThroughReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmSubmitterTransactionReference
 * InitialBaselineSubmissionV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#mmTransactionIdentification
 * MisMatchAcceptanceV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#mmSubmitterTransactionReference
 * MisMatchAcceptanceV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmTransactionIdentification
 * MisMatchAcceptanceNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmTransactionIdentification
 * MisMatchRejectionV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmSubmitterTransactionReference
 * MisMatchRejectionV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmTransactionIdentification
 * MisMatchRejectionNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmTransactionIdentification
 * ActionReminderV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#mmTransactionIdentification
 * StatusChangeNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmTransactionIdentification
 * StatusChangeRequestV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmSubmitterTransactionReference
 * StatusChangeRequestV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02#mmTransactionIdentification
 * StatusChangeRequestAcceptanceV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02#mmSubmitterTransactionReference
 * StatusChangeRequestAcceptanceV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#mmTransactionIdentification
 * StatusChangeRequestNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmTransactionIdentification
 * StatusChangeRequestRejectionV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmSubmitterTransactionReference
 * StatusChangeRequestRejectionV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#mmTransactionIdentification
 * StatusChangeRequestRejectionNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#mmTransactionIdentification
 * StatusExtensionRequestAcceptanceV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#mmSubmitterTransactionReference
 * StatusExtensionRequestAcceptanceV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#mmTransactionIdentification
 * StatusExtensionNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmTransactionIdentification
 * StatusExtensionRequestRejectionV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmSubmitterTransactionReference
 * StatusExtensionRequestRejectionV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#mmTransactionIdentification
 * StatusExtensionRejectionNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03#mmTransactionIdentification
 * StatusExtensionRequestV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03#mmSubmitterTransactionReference
 * StatusExtensionRequestV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#mmTransactionIdentification
 * StatusExtensionRequestNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#mmTransactionIdentification
 * TimeOutNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#mmTransactionIdentification
 * IntentToPayNotificationV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#mmSubmitterTransactionReference
 * IntentToPayNotificationV01.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmTransactionIdentification
 * ForwardIntentToPayNotificationV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmTransactionIdentification
 * SpecialRequestV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmSubmitterTransactionReference
 * SpecialRequestV01.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#mmTransactionIdentification
 * SpecialNotificationV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#mmTransactionIdentification
 * RoleAndBaselineAcceptanceV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmTransactionIdentification
 * RoleAndBaselineRejectionV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#mmTransactionIdentification
 * RoleAndBaselineAcceptanceNotificationV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#mmTransactionIdentification
 * RoleAndBaselineRejectionNotificationV01.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmTransactionIdentification
 * BaselineReSubmissionV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSubmitterTransactionReference
 * BaselineReSubmissionV04.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmCommonSubmissionReference
 * DataSetSubmissionV04.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmTransactionIdentification
 * FullPushThroughReportV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmTransactionIdentification
 * BaselineAmendmentRequestV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#mmSubmitterTransactionReference
 * BaselineAmendmentRequestV04.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCommonSubmissionReference
 * ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmSubmitterTransactionReference
 * InitialBaselineSubmissionV04.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#mmTransactionIdentification
 * IntentToPayNotificationV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#mmSubmitterTransactionReference
 * IntentToPayNotificationV02.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmTransactionIdentification
 * ForwardIntentToPayNotificationV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmTransactionIdentification
 * BaselineReportV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSubmitterTransactionReference
 * InitialBaselineSubmissionV05.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmTransactionIdentification
 * BaselineAmendmentRequestV05.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmSubmitterTransactionReference
 * BaselineAmendmentRequestV05.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmTransactionIdentification
 * FullPushThroughReportV05.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCommonSubmissionReference
 * ForwardDataSetSubmissionReportV05.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmCommonSubmissionReference
 * DataSetSubmissionV05.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmTransactionIdentification
 * BaselineReSubmissionV05.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmSubmitterTransactionReference
 * BaselineReSubmissionV05.mmSubmitterTransactionReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SimpleIdentificationInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to an identification, eg, party identification or account identification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4
 * SimpleIdentificationInformation4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SimpleIdentificationInformation", propOrder = "identification")
public class SimpleIdentificationInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
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
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SimpleIdentificationInformation, Max35Text> mmIdentification = new MMMessageAttribute<SimpleIdentificationInformation, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SimpleIdentificationInformation.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SimpleIdentificationInformation obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SimpleIdentificationInformation obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SimpleIdentificationInformation.mmIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcknowledgementV03.mmTransactionIdentification, AmendmentAcceptanceV02.mmTransactionIdentification, AmendmentAcceptanceV02.mmSubmitterTransactionReference,
						AmendmentAcceptanceNotificationV03.mmTransactionIdentification, AmendmentRejectionV02.mmTransactionIdentification, AmendmentRejectionV02.mmSubmitterTransactionReference,
						AmendmentRejectionNotificationV03.mmTransactionIdentification, BaselineAmendmentRequestV03.mmTransactionIdentification, BaselineAmendmentRequestV03.mmSubmitterTransactionReference,
						BaselineMatchReportV03.mmTransactionIdentification, BaselineReportV03.mmTransactionIdentification, BaselineReSubmissionV03.mmTransactionIdentification, BaselineReSubmissionV03.mmSubmitterTransactionReference,
						DataSetMatchReportV03.mmTransactionIdentification, DataSetSubmissionV03.mmCommonSubmissionReference, DeltaReportV03.mmTransactionIdentification, ErrorReportV03.mmTransactionIdentification,
						ForwardDataSetSubmissionReportV03.mmCommonSubmissionReference, FullPushThroughReportV03.mmTransactionIdentification, InitialBaselineSubmissionV03.mmSubmitterTransactionReference,
						MisMatchAcceptanceV02.mmTransactionIdentification, MisMatchAcceptanceV02.mmSubmitterTransactionReference, MisMatchAcceptanceNotificationV03.mmTransactionIdentification,
						MisMatchRejectionV02.mmTransactionIdentification, MisMatchRejectionV02.mmSubmitterTransactionReference, MisMatchRejectionNotificationV03.mmTransactionIdentification, ActionReminderV03.mmTransactionIdentification,
						StatusChangeNotificationV03.mmTransactionIdentification, StatusChangeRequestV02.mmTransactionIdentification, StatusChangeRequestV02.mmSubmitterTransactionReference,
						StatusChangeRequestAcceptanceV02.mmTransactionIdentification, StatusChangeRequestAcceptanceV02.mmSubmitterTransactionReference, StatusChangeRequestNotificationV03.mmTransactionIdentification,
						StatusChangeRequestRejectionV02.mmTransactionIdentification, StatusChangeRequestRejectionV02.mmSubmitterTransactionReference, StatusChangeRequestRejectionNotificationV03.mmTransactionIdentification,
						StatusExtensionRequestAcceptanceV03.mmTransactionIdentification, StatusExtensionRequestAcceptanceV03.mmSubmitterTransactionReference, StatusExtensionNotificationV03.mmTransactionIdentification,
						StatusExtensionRequestRejectionV03.mmTransactionIdentification, StatusExtensionRequestRejectionV03.mmSubmitterTransactionReference, StatusExtensionRejectionNotificationV03.mmTransactionIdentification,
						StatusExtensionRequestV03.mmTransactionIdentification, StatusExtensionRequestV03.mmSubmitterTransactionReference, StatusExtensionRequestNotificationV03.mmTransactionIdentification,
						TimeOutNotificationV03.mmTransactionIdentification, IntentToPayNotificationV01.mmTransactionIdentification, IntentToPayNotificationV01.mmSubmitterTransactionReference,
						ForwardIntentToPayNotificationV01.mmTransactionIdentification, SpecialRequestV01.mmTransactionIdentification, SpecialRequestV01.mmSubmitterTransactionReference, SpecialNotificationV01.mmTransactionIdentification,
						RoleAndBaselineAcceptanceV01.mmTransactionIdentification, RoleAndBaselineRejectionV01.mmTransactionIdentification, RoleAndBaselineAcceptanceNotificationV01.mmTransactionIdentification,
						RoleAndBaselineRejectionNotificationV01.mmTransactionIdentification, BaselineReSubmissionV04.mmTransactionIdentification, BaselineReSubmissionV04.mmSubmitterTransactionReference,
						DataSetSubmissionV04.mmCommonSubmissionReference, FullPushThroughReportV04.mmTransactionIdentification, BaselineAmendmentRequestV04.mmTransactionIdentification,
						BaselineAmendmentRequestV04.mmSubmitterTransactionReference, ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference, InitialBaselineSubmissionV04.mmSubmitterTransactionReference,
						IntentToPayNotificationV02.mmTransactionIdentification, IntentToPayNotificationV02.mmSubmitterTransactionReference, ForwardIntentToPayNotificationV02.mmTransactionIdentification,
						BaselineReportV04.mmTransactionIdentification, InitialBaselineSubmissionV05.mmSubmitterTransactionReference, BaselineAmendmentRequestV05.mmTransactionIdentification,
						BaselineAmendmentRequestV05.mmSubmitterTransactionReference, FullPushThroughReportV05.mmTransactionIdentification, ForwardDataSetSubmissionReportV05.mmCommonSubmissionReference,
						DataSetSubmissionV05.mmCommonSubmissionReference, BaselineReSubmissionV05.mmTransactionIdentification, BaselineReSubmissionV05.mmSubmitterTransactionReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SimpleIdentificationInformation";
				definition = "Information related to an identification, eg, party identification or account identification.";
				nextVersions_lazy = () -> Arrays.asList(SimpleIdentificationInformation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public SimpleIdentificationInformation setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}