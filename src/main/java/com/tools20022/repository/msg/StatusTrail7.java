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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the history of status and reasons for a pending, posted or cancelled
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#mmStatusDate
 * StatusTrail7.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmSendingOrganisationIdentification
 * StatusTrail7.mmSendingOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmUserIdentification
 * StatusTrail7.mmUserIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmProcessingStatus
 * StatusTrail7.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmInferredMatchingStatus
 * StatusTrail7.mmInferredMatchingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#mmMatchingStatus
 * StatusTrail7.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmSettlementStatus
 * StatusTrail7.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmModificationProcessingStatus
 * StatusTrail7.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmCancellationStatus
 * StatusTrail7.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail7#mmSettled
 * StatusTrail7.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmSupplementaryData
 * StatusTrail7.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmStatusTrail
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmStatusTrail}</li>
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
 * "StatusTrail7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the history of status and reasons for a pending, posted or cancelled transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusTrail7", propOrder = {"statusDate", "sendingOrganisationIdentification", "userIdentification", "processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "modificationProcessingStatus",
		"cancellationStatus", "settled", "supplementaryData"})
public class StatusTrail7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsDt", required = true)
	protected ISODateTime statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "SndgOrgId")
	protected OrganisationIdentification9 sendingOrganisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification9
	 * OrganisationIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndgOrgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendingOrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous way to identify the organisation that sent the message instance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSendingOrganisationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "SndgOrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingOrganisationIdentification";
			definition = "Unique and unambiguous way to identify the organisation that sent the message instance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.OrganisationIdentification9.mmObject();
		}
	};
	@XmlElement(name = "UsrId")
	protected RestrictedFINXMax35Text userIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous way to identify the user that created the message instance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUserIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "UsrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserIdentification";
			definition = "Unique and unambiguous way to identify the user that created the message instance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus60Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus60Choice
	 * ProcessingStatus60Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the processing status of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus60Choice.mmObject();
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus30Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice
	 * MatchingStatus30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as per the account servicer or the Market Infrastructure based on an allegement. At this time no matching took place on the market (at the CSD/ICSD/MI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInferredMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer or the Market Infrastructure based on an allegement. At this time no matching took place on the market (at the CSD/ICSD/MI).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus30Choice.mmObject();
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus30Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice
	 * MatchingStatus30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus30Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus22Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
	 * SettlementStatus22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmSettlementStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementStatus22Choice.mmObject();
		}
	};
	@XmlElement(name = "ModPrcgSts")
	protected ModificationProcessingStatus8Choice modificationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus8Choice
	 * ModificationProcessingStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the modification processing status of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModificationProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "ModPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides details on the modification processing status of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationProcessingStatus8Choice.mmObject();
		}
	};
	@XmlElement(name = "CxlSts")
	protected ProcessingStatus61Choice cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus61Choice
	 * ProcessingStatus61Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the processing status of the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Provides details on the processing status of the cancellation request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus61Choice.mmObject();
		}
	};
	@XmlElement(name = "Sttld")
	protected ProprietaryReason5 settled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason5
	 * ProprietaryReason5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status is settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettled = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "Sttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Status is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProprietaryReason5.mmObject();
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7 StatusTrail7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail7.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusTrail7.mmStatusDate, com.tools20022.repository.msg.StatusTrail7.mmSendingOrganisationIdentification,
						com.tools20022.repository.msg.StatusTrail7.mmUserIdentification, com.tools20022.repository.msg.StatusTrail7.mmProcessingStatus, com.tools20022.repository.msg.StatusTrail7.mmInferredMatchingStatus,
						com.tools20022.repository.msg.StatusTrail7.mmMatchingStatus, com.tools20022.repository.msg.StatusTrail7.mmSettlementStatus, com.tools20022.repository.msg.StatusTrail7.mmModificationProcessingStatus,
						com.tools20022.repository.msg.StatusTrail7.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail7.mmSettled, com.tools20022.repository.msg.StatusTrail7.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReport002V03.mmStatusTrail);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusTrail7";
				definition = "Provides the history of status and reasons for a pending, posted or cancelled transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getStatusDate() {
		return statusDate;
	}

	public StatusTrail7 setStatusDate(ISODateTime statusDate) {
		this.statusDate = Objects.requireNonNull(statusDate);
		return this;
	}

	public Optional<OrganisationIdentification9> getSendingOrganisationIdentification() {
		return sendingOrganisationIdentification == null ? Optional.empty() : Optional.of(sendingOrganisationIdentification);
	}

	public StatusTrail7 setSendingOrganisationIdentification(com.tools20022.repository.msg.OrganisationIdentification9 sendingOrganisationIdentification) {
		this.sendingOrganisationIdentification = sendingOrganisationIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax35Text> getUserIdentification() {
		return userIdentification == null ? Optional.empty() : Optional.of(userIdentification);
	}

	public StatusTrail7 setUserIdentification(RestrictedFINXMax35Text userIdentification) {
		this.userIdentification = userIdentification;
		return this;
	}

	public Optional<ProcessingStatus60Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public StatusTrail7 setProcessingStatus(ProcessingStatus60Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus30Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public StatusTrail7 setInferredMatchingStatus(MatchingStatus30Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<MatchingStatus30Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public StatusTrail7 setMatchingStatus(MatchingStatus30Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<SettlementStatus22Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public StatusTrail7 setSettlementStatus(SettlementStatus22Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<ModificationProcessingStatus8Choice> getModificationProcessingStatus() {
		return modificationProcessingStatus == null ? Optional.empty() : Optional.of(modificationProcessingStatus);
	}

	public StatusTrail7 setModificationProcessingStatus(ModificationProcessingStatus8Choice modificationProcessingStatus) {
		this.modificationProcessingStatus = modificationProcessingStatus;
		return this;
	}

	public Optional<ProcessingStatus61Choice> getCancellationStatus() {
		return cancellationStatus == null ? Optional.empty() : Optional.of(cancellationStatus);
	}

	public StatusTrail7 setCancellationStatus(ProcessingStatus61Choice cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
		return this;
	}

	public Optional<ProprietaryReason5> getSettled() {
		return settled == null ? Optional.empty() : Optional.of(settled);
	}

	public StatusTrail7 setSettled(com.tools20022.repository.msg.ProprietaryReason5 settled) {
		this.settled = settled;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public StatusTrail7 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}