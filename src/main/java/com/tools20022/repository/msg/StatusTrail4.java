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
import com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
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
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#mmStatusDate
 * StatusTrail4.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmSendingOrganisationIdentification
 * StatusTrail4.mmSendingOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmUserIdentification
 * StatusTrail4.mmUserIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmProcessingStatus
 * StatusTrail4.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmInferredMatchingStatus
 * StatusTrail4.mmInferredMatchingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#mmMatchingStatus
 * StatusTrail4.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmSettlementStatus
 * StatusTrail4.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmModificationProcessingStatus
 * StatusTrail4.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmCancellationStatus
 * StatusTrail4.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail4#mmSettled
 * StatusTrail4.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmSupplementaryData
 * StatusTrail4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReportV02#mmStatusTrail
 * SecuritiesSettlementTransactionAuditTrailReportV02.mmStatusTrail}</li>
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
 * "StatusTrail4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the history of status and reasons for a pending, posted or cancelled transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6 StatusTrail6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.StatusTrail2
 * StatusTrail2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusTrail4", propOrder = {"statusDate", "sendingOrganisationIdentification", "userIdentification", "processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "modificationProcessingStatus",
		"cancellationStatus", "settled", "supplementaryData"})
public class StatusTrail4 {

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
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmStatusDate
	 * StatusTrail6.mmStatusDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmStatusDate
	 * StatusTrail2.mmStatusDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmStatusDate);
			previousVersion_lazy = () -> StatusTrail2.mmStatusDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "SndgOrgId")
	protected OrganisationIdentification7 sendingOrganisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7
	 * OrganisationIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmSendingOrganisationIdentification
	 * StatusTrail6.mmSendingOrganisationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmSendingOrganisationIdentification
	 * StatusTrail2.mmSendingOrganisationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSendingOrganisationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "SndgOrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingOrganisationIdentification";
			definition = "Unique and unambiguous way to identify the organisation that sent the message instance.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmSendingOrganisationIdentification);
			previousVersion_lazy = () -> StatusTrail2.mmSendingOrganisationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.OrganisationIdentification7.mmObject();
		}
	};
	@XmlElement(name = "UsrId")
	protected Max35Text userIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmUserIdentification
	 * StatusTrail6.mmUserIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmUserIdentification
	 * StatusTrail2.mmUserIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUserIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "UsrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserIdentification";
			definition = "Unique and unambiguous way to identify the user that created the message instance.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmUserIdentification);
			previousVersion_lazy = () -> StatusTrail2.mmUserIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus19Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus19Choice
	 * ProcessingStatus19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmProcessingStatus
	 * StatusTrail6.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmProcessingStatus
	 * StatusTrail2.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmProcessingStatus);
			previousVersion_lazy = () -> StatusTrail2.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus19Choice.mmObject();
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus7Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice
	 * MatchingStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmInferredMatchingStatus
	 * StatusTrail6.mmInferredMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmInferredMatchingStatus
	 * StatusTrail2.mmInferredMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInferredMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer or the Market Infrastructure based on an allegement. At this time no matching took place on the market (at the CSD/ICSD/MI).";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmInferredMatchingStatus);
			previousVersion_lazy = () -> StatusTrail2.mmInferredMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus7Choice.mmObject();
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus7Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice
	 * MatchingStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmMatchingStatus
	 * StatusTrail6.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmMatchingStatus
	 * StatusTrail2.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmMatchingStatus);
			previousVersion_lazy = () -> StatusTrail2.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus7Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus7Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
	 * SettlementStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettlementStatus
	 * StatusTrail6.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmSettlementStatus
	 * StatusTrail2.mmSettlementStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmSettlementStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmSettlementStatus);
			previousVersion_lazy = () -> StatusTrail2.mmSettlementStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementStatus7Choice.mmObject();
		}
	};
	@XmlElement(name = "ModPrcgSts")
	protected ModificationProcessingStatus4Choice modificationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice
	 * ModificationProcessingStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmModificationProcessingStatus
	 * StatusTrail6.mmModificationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmModificationProcessingStatus
	 * StatusTrail2.mmModificationProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModificationProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "ModPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides details on the modification processing status of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmModificationProcessingStatus);
			previousVersion_lazy = () -> StatusTrail2.mmModificationProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationProcessingStatus4Choice.mmObject();
		}
	};
	@XmlElement(name = "CxlSts")
	protected ProcessingStatus20Choice cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus20Choice
	 * ProcessingStatus20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmCancellationStatus
	 * StatusTrail6.mmCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmCancellationStatus
	 * StatusTrail2.mmCancellationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Provides details on the processing status of the cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmCancellationStatus);
			previousVersion_lazy = () -> StatusTrail2.mmCancellationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus20Choice.mmObject();
		}
	};
	@XmlElement(name = "Sttld")
	protected ProprietaryReason1 settled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail6#mmSettled
	 * StatusTrail6.mmSettled}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmSettled
	 * StatusTrail2.mmSettled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettled = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "Sttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Status is settled.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmSettled);
			previousVersion_lazy = () -> StatusTrail2.mmSettled;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProprietaryReason1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4 StatusTrail4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmSupplementaryData
	 * StatusTrail6.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmSupplementaryData
	 * StatusTrail2.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmSupplementaryData);
			previousVersion_lazy = () -> StatusTrail2.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusTrail4.mmStatusDate, com.tools20022.repository.msg.StatusTrail4.mmSendingOrganisationIdentification,
						com.tools20022.repository.msg.StatusTrail4.mmUserIdentification, com.tools20022.repository.msg.StatusTrail4.mmProcessingStatus, com.tools20022.repository.msg.StatusTrail4.mmInferredMatchingStatus,
						com.tools20022.repository.msg.StatusTrail4.mmMatchingStatus, com.tools20022.repository.msg.StatusTrail4.mmSettlementStatus, com.tools20022.repository.msg.StatusTrail4.mmModificationProcessingStatus,
						com.tools20022.repository.msg.StatusTrail4.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail4.mmSettled, com.tools20022.repository.msg.StatusTrail4.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAuditTrailReportV02.mmStatusTrail);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusTrail4";
				definition = "Provides the history of status and reasons for a pending, posted or cancelled transaction.";
				nextVersions_lazy = () -> Arrays.asList(StatusTrail6.mmObject());
				previousVersion_lazy = () -> StatusTrail2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getStatusDate() {
		return statusDate;
	}

	public StatusTrail4 setStatusDate(ISODateTime statusDate) {
		this.statusDate = Objects.requireNonNull(statusDate);
		return this;
	}

	public Optional<OrganisationIdentification7> getSendingOrganisationIdentification() {
		return sendingOrganisationIdentification == null ? Optional.empty() : Optional.of(sendingOrganisationIdentification);
	}

	public StatusTrail4 setSendingOrganisationIdentification(com.tools20022.repository.msg.OrganisationIdentification7 sendingOrganisationIdentification) {
		this.sendingOrganisationIdentification = sendingOrganisationIdentification;
		return this;
	}

	public Optional<Max35Text> getUserIdentification() {
		return userIdentification == null ? Optional.empty() : Optional.of(userIdentification);
	}

	public StatusTrail4 setUserIdentification(Max35Text userIdentification) {
		this.userIdentification = userIdentification;
		return this;
	}

	public Optional<ProcessingStatus19Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public StatusTrail4 setProcessingStatus(ProcessingStatus19Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus7Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public StatusTrail4 setInferredMatchingStatus(MatchingStatus7Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<MatchingStatus7Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public StatusTrail4 setMatchingStatus(MatchingStatus7Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<SettlementStatus7Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public StatusTrail4 setSettlementStatus(SettlementStatus7Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<ModificationProcessingStatus4Choice> getModificationProcessingStatus() {
		return modificationProcessingStatus == null ? Optional.empty() : Optional.of(modificationProcessingStatus);
	}

	public StatusTrail4 setModificationProcessingStatus(ModificationProcessingStatus4Choice modificationProcessingStatus) {
		this.modificationProcessingStatus = modificationProcessingStatus;
		return this;
	}

	public Optional<ProcessingStatus20Choice> getCancellationStatus() {
		return cancellationStatus == null ? Optional.empty() : Optional.of(cancellationStatus);
	}

	public StatusTrail4 setCancellationStatus(ProcessingStatus20Choice cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
		return this;
	}

	public Optional<ProprietaryReason1> getSettled() {
		return settled == null ? Optional.empty() : Optional.of(settled);
	}

	public StatusTrail4 setSettled(com.tools20022.repository.msg.ProprietaryReason1 settled) {
		this.settled = settled;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public StatusTrail4 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}