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
import com.tools20022.repository.entity.GenericIdentification;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation#Identification
 * SimpleIdentificationInformation.Identification}</li>
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
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#TransactionIdentification
 * AcknowledgementV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#TransactionIdentification
 * AmendmentAcceptanceV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#SubmitterTransactionReference
 * AmendmentAcceptanceV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#TransactionIdentification
 * AmendmentAcceptanceNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#TransactionIdentification
 * AmendmentRejectionV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#SubmitterTransactionReference
 * AmendmentRejectionV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#TransactionIdentification
 * AmendmentRejectionNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#TransactionIdentification
 * BaselineAmendmentRequestV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03#SubmitterTransactionReference
 * BaselineAmendmentRequestV03.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#TransactionIdentification
 * BaselineMatchReportV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV03#TransactionIdentification
 * BaselineReportV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#TransactionIdentification
 * BaselineReSubmissionV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#SubmitterTransactionReference
 * BaselineReSubmissionV03.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#TransactionIdentification
 * DataSetMatchReportV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#CommonSubmissionReference
 * DataSetSubmissionV03.CommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#TransactionIdentification
 * DeltaReportV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#TransactionIdentification
 * ErrorReportV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#CommonSubmissionReference
 * ForwardDataSetSubmissionReportV03.CommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV03#TransactionIdentification
 * FullPushThroughReportV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#SubmitterTransactionReference
 * InitialBaselineSubmissionV03.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#TransactionIdentification
 * MisMatchAcceptanceV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#SubmitterTransactionReference
 * MisMatchAcceptanceV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#TransactionIdentification
 * MisMatchAcceptanceNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#TransactionIdentification
 * MisMatchRejectionV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#SubmitterTransactionReference
 * MisMatchRejectionV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#TransactionIdentification
 * MisMatchRejectionNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#TransactionIdentification
 * ActionReminderV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#TransactionIdentification
 * StatusChangeNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#TransactionIdentification
 * StatusChangeRequestV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#SubmitterTransactionReference
 * StatusChangeRequestV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02#TransactionIdentification
 * StatusChangeRequestAcceptanceV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02#SubmitterTransactionReference
 * StatusChangeRequestAcceptanceV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#TransactionIdentification
 * StatusChangeRequestNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#TransactionIdentification
 * StatusChangeRequestRejectionV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#SubmitterTransactionReference
 * StatusChangeRequestRejectionV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#TransactionIdentification
 * StatusChangeRequestRejectionNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#TransactionIdentification
 * StatusExtensionRequestAcceptanceV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#SubmitterTransactionReference
 * StatusExtensionRequestAcceptanceV03.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#TransactionIdentification
 * StatusExtensionNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#TransactionIdentification
 * StatusExtensionRequestRejectionV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#SubmitterTransactionReference
 * StatusExtensionRequestRejectionV03.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#TransactionIdentification
 * StatusExtensionRejectionNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03#TransactionIdentification
 * StatusExtensionRequestV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03#SubmitterTransactionReference
 * StatusExtensionRequestV03.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#TransactionIdentification
 * StatusExtensionRequestNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#TransactionIdentification
 * TimeOutNotificationV03.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#TransactionIdentification
 * IntentToPayNotificationV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#SubmitterTransactionReference
 * IntentToPayNotificationV01.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#TransactionIdentification
 * ForwardIntentToPayNotificationV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#TransactionIdentification
 * SpecialRequestV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#SubmitterTransactionReference
 * SpecialRequestV01.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#TransactionIdentification
 * SpecialNotificationV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#TransactionIdentification
 * RoleAndBaselineAcceptanceV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#TransactionIdentification
 * RoleAndBaselineRejectionV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#TransactionIdentification
 * RoleAndBaselineAcceptanceNotificationV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#TransactionIdentification
 * RoleAndBaselineRejectionNotificationV01.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#TransactionIdentification
 * BaselineReSubmissionV04.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#SubmitterTransactionReference
 * BaselineReSubmissionV04.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#CommonSubmissionReference
 * DataSetSubmissionV04.CommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#TransactionIdentification
 * FullPushThroughReportV04.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#TransactionIdentification
 * BaselineAmendmentRequestV04.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04#SubmitterTransactionReference
 * BaselineAmendmentRequestV04.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#CommonSubmissionReference
 * ForwardDataSetSubmissionReportV04.CommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#SubmitterTransactionReference
 * InitialBaselineSubmissionV04.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#TransactionIdentification
 * IntentToPayNotificationV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#SubmitterTransactionReference
 * IntentToPayNotificationV02.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#TransactionIdentification
 * ForwardIntentToPayNotificationV02.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#TransactionIdentification
 * BaselineReportV04.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#SubmitterTransactionReference
 * InitialBaselineSubmissionV05.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#TransactionIdentification
 * BaselineAmendmentRequestV05.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#SubmitterTransactionReference
 * BaselineAmendmentRequestV05.SubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#TransactionIdentification
 * FullPushThroughReportV05.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#CommonSubmissionReference
 * ForwardDataSetSubmissionReportV05.CommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#CommonSubmissionReference
 * DataSetSubmissionV05.CommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#TransactionIdentification
 * BaselineReSubmissionV05.TransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#SubmitterTransactionReference
 * BaselineReSubmissionV05.SubmitterTransactionReference}</li>
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
public class SimpleIdentificationInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name or number assigned by an entity to enable recognition of that
	 * entity, eg, account identifier.
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
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SimpleIdentificationInformation.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SimpleIdentificationInformation.Identification);
				trace_lazy = () -> GenericIdentification.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.AcknowledgementV03.TransactionIdentification, com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02.TransactionIdentification,
						com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.AmendmentRejectionV02.TransactionIdentification, com.tools20022.repository.area.tsmt.AmendmentRejectionV02.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03.TransactionIdentification, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV03.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineReportV03.TransactionIdentification, com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.DataSetMatchReportV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV03.CommonSubmissionReference, com.tools20022.repository.area.tsmt.DeltaReportV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.ErrorReportV03.TransactionIdentification, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.CommonSubmissionReference,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV03.TransactionIdentification, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02.TransactionIdentification, com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03.TransactionIdentification, com.tools20022.repository.area.tsmt.MisMatchRejectionV02.TransactionIdentification,
						com.tools20022.repository.area.tsmt.MisMatchRejectionV02.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.ActionReminderV03.TransactionIdentification, com.tools20022.repository.area.tsmt.StatusChangeNotificationV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeRequestV02.TransactionIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestV02.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02.TransactionIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03.TransactionIdentification, com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.TransactionIdentification,
						com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03.TransactionIdentification, com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03.TransactionIdentification, com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestV03.TransactionIdentification, com.tools20022.repository.area.tsmt.StatusExtensionRequestV03.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03.TransactionIdentification, com.tools20022.repository.area.tsmt.TimeOutNotificationV03.TransactionIdentification,
						com.tools20022.repository.area.tsmt.IntentToPayNotificationV01.TransactionIdentification, com.tools20022.repository.area.tsmt.IntentToPayNotificationV01.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01.TransactionIdentification, com.tools20022.repository.area.tsmt.SpecialRequestV01.TransactionIdentification,
						com.tools20022.repository.area.tsmt.SpecialRequestV01.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.SpecialNotificationV01.TransactionIdentification,
						com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01.TransactionIdentification, com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01.TransactionIdentification,
						com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01.TransactionIdentification, com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01.TransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.TransactionIdentification, com.tools20022.repository.area.tsmt.BaselineReSubmissionV04.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV04.CommonSubmissionReference, com.tools20022.repository.area.tsmt.FullPushThroughReportV04.TransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.TransactionIdentification, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV04.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.CommonSubmissionReference, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.IntentToPayNotificationV02.TransactionIdentification, com.tools20022.repository.area.tsmt.IntentToPayNotificationV02.SubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02.TransactionIdentification, com.tools20022.repository.area.tsmt.BaselineReportV04.TransactionIdentification,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.TransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05.SubmitterTransactionReference, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.TransactionIdentification,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.CommonSubmissionReference, com.tools20022.repository.area.tsmt.DataSetSubmissionV05.CommonSubmissionReference,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.TransactionIdentification, com.tools20022.repository.area.tsmt.BaselineReSubmissionV05.SubmitterTransactionReference);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
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
}