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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the document by providing a unique identification and optionally
 * the date/time of the creation of the document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#Identification
 * DocumentIdentification8.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#CreationDateTime
 * DocumentIdentification8.CreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationAdviceV01#Identification
 * AgentCANotificationAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#Identification
 * AgentCANotificationCancellationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#Identification
 * AgentCANotificationStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#AgentCANotificationAdviceIdentification
 * AgentCANotificationStatusAdviceV01.AgentCANotificationAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#AgentCANotificationCancellationRequestIdentification
 * AgentCANotificationStatusAdviceV01.
 * AgentCANotificationCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#Identification
 * AgentCAElectionAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#Identification
 * AgentCAElectionAmendmentRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01#AgentCAElectionAdviceIdentification
 * AgentCAElectionAmendmentRequestV01.AgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#Identification
 * AgentCAElectionCancellationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01#AgentCAElectionAdviceIdentification
 * AgentCAElectionCancellationRequestV01.AgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#Identification
 * AgentCAElectionStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionAdviceIdentification
 * AgentCAElectionStatusAdviceV01.AgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionCancellationRequestIdentification
 * AgentCAElectionStatusAdviceV01.
 * AgentCAElectionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01#AgentCAElectionAmendmentRequestIdentification
 * AgentCAElectionStatusAdviceV01.AgentCAElectionAmendmentRequestIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADistributionBreakdownAdviceV01#Identification
 * AgentCADistributionBreakdownAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01#Identification
 * AgentCAGlobalDistributionAuthorisationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#Identification
 * AgentCAGlobalDistributionStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#AgentCAGlobalDistributionAuthorisationRequestIdentification
 * AgentCAGlobalDistributionStatusAdviceV01.
 * AgentCAGlobalDistributionAuthorisationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#Identification
 * AgentCAMovementInstructionV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#AgentCAElectionAdviceIdentification
 * AgentCAMovementInstructionV01.AgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01#Identification
 * AgentCAMovementCancellationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01#AgentCAMovementInstructionIdentification
 * AgentCAMovementCancellationRequestV01.
 * AgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#Identification
 * AgentCAMovementConfirmationV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#AgentCAMovementInstructionIdentification
 * AgentCAMovementConfirmationV01.AgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#AgentCAElectionStatusAdviceIdentification
 * AgentCAMovementConfirmationV01.AgentCAElectionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01#AgentCAGlobalDistributionStatusAdviceIdentification
 * AgentCAMovementConfirmationV01.
 * AgentCAGlobalDistributionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#Identification
 * AgentCAMovementStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAElectionStatusAdviceIdentification
 * AgentCAMovementStatusAdviceV01.AgentCAElectionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAGlobalDistributionStatusAdviceIdentification
 * AgentCAMovementStatusAdviceV01.
 * AgentCAGlobalDistributionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAMovementInstructionIdentification
 * AgentCAMovementStatusAdviceV01.AgentCAMovementInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01#AgentCAMovementCancellationRequestIdentification
 * AgentCAMovementStatusAdviceV01.
 * AgentCAMovementCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#Identification
 * AgentCAInformationAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#AgentCAElectionAdviceIdentification
 * AgentCAInformationAdviceV01.AgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#Identification
 * AgentCAInformationStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#AgentCAInformationAdviceIdentification
 * AgentCAInformationStatusAdviceV01.AgentCAInformationAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#Identification
 * AgentCAStandingInstructionRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#Identification
 * AgentCAStandingInstructionCancellationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01#AgentCAStandingInstructionRequestIdentification
 * AgentCAStandingInstructionCancellationRequestV01.
 * AgentCAStandingInstructionRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#Identification
 * AgentCAStandingInstructionStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#AgentCAStandingInstructionRequestIdentification
 * AgentCAStandingInstructionStatusAdviceV01.
 * AgentCAStandingInstructionRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01#AgentCAStandingInstructionCancellationRequestIdentification
 * AgentCAStandingInstructionStatusAdviceV01.
 * AgentCAStandingInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01#Identification
 * AgentCADeactivationInstructionV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#Identification
 * AgentCADeactivationCancellationRequestV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#AgentCADeactivationInstructionIdentification
 * AgentCADeactivationCancellationRequestV01.
 * AgentCADeactivationInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#Identification
 * AgentCADeactivationStatusAdviceV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#AgentCADeactivationInstructionIdentification
 * AgentCADeactivationStatusAdviceV01.
 * AgentCADeactivationInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#AgentCADeactivationCancellationRequestIdentification
 * AgentCADeactivationStatusAdviceV01.
 * AgentCADeactivationCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportV02#Identification
 * RegulatoryTransactionReportV02.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#Identification
 * RegulatoryTransactionReportCancellationRequestV02.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#Identification
 * RegulatoryTransactionReportStatusV01.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#Identification
 * RegulatoryTransactionReportCancellationStatusV01.Identification}</li>
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
 * "DocumentIdentification8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the document by providing a unique identification and optionally the date/time of the creation of the document."
 * </li>
 * </ul>
 */
public class DocumentIdentification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification of the document.
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
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
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
	 * definition} = "Unique identification of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Identification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of the document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time of the creation of the document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#IssueDate
	 * Document.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the creation of the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DocumentIdentification8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.IssueDate;
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date/time of the creation of the document.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentIdentification8.Identification, com.tools20022.repository.msg.DocumentIdentification8.CreationDateTime);
				trace_lazy = () -> Document.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCANotificationAdviceV01.Identification, com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01.Identification,
						com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.Identification, com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.AgentCANotificationAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01.AgentCANotificationCancellationRequestIdentification, com.tools20022.repository.area.seev.AgentCAElectionAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.Identification, com.tools20022.repository.area.seev.AgentCAElectionAmendmentRequestV01.AgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01.Identification, com.tools20022.repository.area.seev.AgentCAElectionCancellationRequestV01.AgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.Identification, com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAElectionStatusAdviceV01.AgentCAElectionAmendmentRequestIdentification, com.tools20022.repository.area.seev.AgentCADistributionBreakdownAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01.Identification, com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.AgentCAGlobalDistributionAuthorisationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.Identification, com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.AgentCAElectionAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01.Identification, com.tools20022.repository.area.seev.AgentCAMovementCancellationRequestV01.AgentCAMovementInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.Identification, com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.AgentCAMovementInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.AgentCAElectionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementConfirmationV01.AgentCAGlobalDistributionStatusAdviceIdentification, com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAElectionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAGlobalDistributionStatusAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAMovementInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementStatusAdviceV01.AgentCAMovementCancellationRequestIdentification, com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.AgentCAElectionAdviceIdentification, com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.AgentCAInformationAdviceIdentification, com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01.Identification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01.Identification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionCancellationRequestV01.AgentCAStandingInstructionRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.AgentCAStandingInstructionRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionStatusAdviceV01.AgentCAStandingInstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01.Identification, com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01.Identification,
						com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01.AgentCADeactivationInstructionIdentification, com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.Identification,
						com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.AgentCADeactivationInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01.AgentCADeactivationCancellationRequestIdentification, com.tools20022.repository.area.auth.RegulatoryTransactionReportV02.Identification,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.Identification, com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01.Identification,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.Identification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentIdentification8";
				definition = "Identifies the document by providing a unique identification and optionally the date/time of the creation of the document.";
			}
		});
		return mmObject_lazy.get();
	}
}