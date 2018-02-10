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
import com.tools20022.repository.area.other.ForeignExchangeTradeStatusNotificationV04;
import com.tools20022.repository.choice.Status6Choice;
import com.tools20022.repository.codeset.StatusSubType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the status of a trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmMessageIdentification
 * TradeData7.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmOriginatorReference
 * TradeData7.mmOriginatorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmMatchingSystemUniqueReference
 * TradeData7.mmMatchingSystemUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmMatchingSystemMatchingReference
 * TradeData7.mmMatchingSystemMatchingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmMatchingSystemMatchedSideReference
 * TradeData7.mmMatchingSystemMatchedSideReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#mmStatusOriginator
 * TradeData7.mmStatusOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#mmCurrentStatus
 * TradeData7.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmCurrentStatusSubType
 * TradeData7.mmCurrentStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmCurrentStatusDateTime
 * TradeData7.mmCurrentStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#mmPreviousStatus
 * TradeData7.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmPreviousStatusSubType
 * TradeData7.mmPreviousStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmPreviousStatusDateTime
 * TradeData7.mmPreviousStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#mmProductType
 * TradeData7.mmProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmSettlementSessionIdentifier
 * TradeData7.mmSettlementSessionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmSplitTradeIndicator
 * TradeData7.mmSplitTradeIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusNotificationV04#mmTradeData
 * ForeignExchangeTradeStatusNotificationV04.mmTradeData}</li>
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
 * "TradeData7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the status of a trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15 TradeData15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeData6
 * TradeData6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeData7", propOrder = {"messageIdentification", "originatorReference", "matchingSystemUniqueReference", "matchingSystemMatchingReference", "matchingSystemMatchedSideReference", "statusOriginator", "currentStatus",
		"currentStatusSubType", "currentStatusDateTime", "previousStatus", "previousStatusSubType", "previousStatusDateTime", "productType", "settlementSessionIdentifier", "splitTradeIndicator"})
public class TradeData7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the present message assigned by the party issuing the message. This identification must be unique amongst all messages of same type sent by the same party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmMessageIdentification
	 * TradeData15.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identification of the present message assigned by the party issuing the message. This identification must be unique amongst all messages of same type sent by the same party.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgtrRef")
	protected Max35Text originatorReference;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the original reference of the instruction for which the status is given, as assigned by the participant that submitted the foreign exchange trade."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmOriginatorReference
	 * TradeData15.mmOriginatorReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginatorReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "OrgtrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatorReference";
			definition = "Represents the original reference of the instruction for which the status is given, as assigned by the participant that submitted the foreign exchange trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmOriginatorReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "MtchgSysUnqRef", required = true)
	protected Max35Text matchingSystemUniqueReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
	 * TradeIdentification.mmMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSysUnqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingSystemUniqueReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unique system identification assigned to the trade  by the central matching system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmMatchingSystemUniqueReference
	 * TradeData15.mmMatchingSystemUniqueReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemUniqueReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemUniqueReference";
			definition = "Reference to the unique system identification assigned to the trade  by the central matching system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmMatchingSystemUniqueReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "MtchgSysMtchgRef")
	protected Max35Text matchingSystemMatchingReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
	 * TradeIdentification.mmMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSysMtchgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingSystemMatchingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique matching identification assigned to the trade and to the matching trade from the counterparty by the central matching system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmMatchingSystemMatchingReference
	 * TradeData15.mmMatchingSystemMatchingReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemMatchingReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysMtchgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemMatchingReference";
			definition = "Unique matching identification assigned to the trade and to the matching trade from the counterparty by the central matching system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmMatchingSystemMatchingReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "MtchgSysMtchdSdRef")
	protected Max35Text matchingSystemMatchedSideReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
	 * TradeIdentification.mmMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSysMtchdSdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingSystemMatchedSideReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification to the unique reference from the central settlement system that allows the removal of alleged trades once the matched status notification for the matching side has been received."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmMatchingSystemMatchedSideReference
	 * TradeData15.mmMatchingSystemMatchedSideReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemMatchedSideReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysMtchdSdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemMatchedSideReference";
			definition = "Identification to the unique reference from the central settlement system that allows the removal of alleged trades once the matched status notification for the matching side has been received.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmMatchingSystemMatchedSideReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "StsOrgtr")
	protected Max20Text statusOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max20Text
	 * Max20Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that assigned the status to the foreign exchange or derivative trade."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmStatusOriginator
	 * TradeData15.mmStatusOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusOriginator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Party that assigned the status to the foreign exchange or derivative trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmStatusOriginator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20Text.mmObject();
		}
	};
	@XmlElement(name = "CurSts", required = true)
	protected StatusAndSubStatus1 currentStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus1
	 * StatusAndSubStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the new status of a trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatus
	 * TradeData15.mmCurrentStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Specifies the new status of a trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmCurrentStatus);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.StatusAndSubStatus1.mmObject();
		}
	};
	@XmlElement(name = "CurStsSubTp")
	protected StatusSubType1Code currentStatusSubType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurStsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the current status of a trade in a central system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatusSubType
	 * TradeData15.mmCurrentStatusSubType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusSubType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "CurStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusSubType";
			definition = "Additional information on the current status of a trade in a central system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmCurrentStatusSubType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatusSubType1Code.mmObject();
		}
	};
	@XmlElement(name = "CurStsDtTm")
	protected ISODateTime currentStatusDateTime;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurStsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time at which the current status was assigned."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatusDateTime
	 * TradeData15.mmCurrentStatusDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "CurStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusDateTime";
			definition = "Specifies the date and time at which the current status was assigned.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmCurrentStatusDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PrvsSts")
	protected Status6Choice previousStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status6Choice Status6Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the previous status of a trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatus
	 * TradeData15.mmPreviousStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "PrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatus";
			definition = "Specifies the previous status of a trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmPreviousStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Status6Choice.mmObject();
		}
	};
	@XmlElement(name = "PrvsStsSubTp")
	protected StatusSubType1Code previousStatusSubType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsStsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the previous status of a trade in a central system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatusSubType
	 * TradeData15.mmPreviousStatusSubType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatusSubType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusSubType";
			definition = "Additional information on the previous status of a trade in a central system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmPreviousStatusSubType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatusSubType1Code.mmObject();
		}
	};
	@XmlElement(name = "PrvsStsDtTm")
	protected ISODateTime previousStatusDateTime;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsStsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time at which the previous status was assigned."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatusDateTime
	 * TradeData15.mmPreviousStatusDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatusDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusDateTime";
			definition = "Specifies the date and time at which the previous status was assigned.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmPreviousStatusDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PdctTp")
	protected Max35Text productType;
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
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmTypeOfProduct
	 * ForeignExchangeTrade.mmTypeOfProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product for which the status of the confirmation is reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#mmProductType
	 * TradeData15.mmProductType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmTypeOfProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Specifies the product for which the status of the confirmation is reported.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmProductType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SttlmSsnIdr")
	protected Exact4AlphaNumericText settlementSessionIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSsnIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSessionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To indicate the requested CLS Settlement Session that the related trade is part of."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmSettlementSessionIdentifier
	 * TradeData15.mmSettlementSessionIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementSessionIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "SttlmSsnIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSessionIdentifier";
			definition = "To indicate the requested CLS Settlement Session that the related trade is part of.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmSettlementSessionIdentifier);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "SpltTradInd")
	protected YesNoIndicator splitTradeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData7
	 * TradeData7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltTradInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "To indicate if the trade is split."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData15#mmSplitTradeIndicator
	 * TradeData15.mmSplitTradeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitTradeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData7.mmObject();
			isDerived = false;
			xmlTag = "SpltTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTradeIndicator";
			definition = "To indicate if the trade is split.";
			nextVersions_lazy = () -> Arrays.asList(TradeData15.mmSplitTradeIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData7.mmMessageIdentification, com.tools20022.repository.msg.TradeData7.mmOriginatorReference,
						com.tools20022.repository.msg.TradeData7.mmMatchingSystemUniqueReference, com.tools20022.repository.msg.TradeData7.mmMatchingSystemMatchingReference,
						com.tools20022.repository.msg.TradeData7.mmMatchingSystemMatchedSideReference, com.tools20022.repository.msg.TradeData7.mmStatusOriginator, com.tools20022.repository.msg.TradeData7.mmCurrentStatus,
						com.tools20022.repository.msg.TradeData7.mmCurrentStatusSubType, com.tools20022.repository.msg.TradeData7.mmCurrentStatusDateTime, com.tools20022.repository.msg.TradeData7.mmPreviousStatus,
						com.tools20022.repository.msg.TradeData7.mmPreviousStatusSubType, com.tools20022.repository.msg.TradeData7.mmPreviousStatusDateTime, com.tools20022.repository.msg.TradeData7.mmProductType,
						com.tools20022.repository.msg.TradeData7.mmSettlementSessionIdentifier, com.tools20022.repository.msg.TradeData7.mmSplitTradeIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeStatusNotificationV04.mmTradeData);
				trace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeData7";
				definition = "Provides information on the status of a trade.";
				nextVersions_lazy = () -> Arrays.asList(TradeData15.mmObject());
				previousVersion_lazy = () -> TradeData6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public TradeData7 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<Max35Text> getOriginatorReference() {
		return originatorReference == null ? Optional.empty() : Optional.of(originatorReference);
	}

	public TradeData7 setOriginatorReference(Max35Text originatorReference) {
		this.originatorReference = originatorReference;
		return this;
	}

	public Max35Text getMatchingSystemUniqueReference() {
		return matchingSystemUniqueReference;
	}

	public TradeData7 setMatchingSystemUniqueReference(Max35Text matchingSystemUniqueReference) {
		this.matchingSystemUniqueReference = Objects.requireNonNull(matchingSystemUniqueReference);
		return this;
	}

	public Optional<Max35Text> getMatchingSystemMatchingReference() {
		return matchingSystemMatchingReference == null ? Optional.empty() : Optional.of(matchingSystemMatchingReference);
	}

	public TradeData7 setMatchingSystemMatchingReference(Max35Text matchingSystemMatchingReference) {
		this.matchingSystemMatchingReference = matchingSystemMatchingReference;
		return this;
	}

	public Optional<Max35Text> getMatchingSystemMatchedSideReference() {
		return matchingSystemMatchedSideReference == null ? Optional.empty() : Optional.of(matchingSystemMatchedSideReference);
	}

	public TradeData7 setMatchingSystemMatchedSideReference(Max35Text matchingSystemMatchedSideReference) {
		this.matchingSystemMatchedSideReference = matchingSystemMatchedSideReference;
		return this;
	}

	public Optional<Max20Text> getStatusOriginator() {
		return statusOriginator == null ? Optional.empty() : Optional.of(statusOriginator);
	}

	public TradeData7 setStatusOriginator(Max20Text statusOriginator) {
		this.statusOriginator = statusOriginator;
		return this;
	}

	public StatusAndSubStatus1 getCurrentStatus() {
		return currentStatus;
	}

	public TradeData7 setCurrentStatus(com.tools20022.repository.msg.StatusAndSubStatus1 currentStatus) {
		this.currentStatus = Objects.requireNonNull(currentStatus);
		return this;
	}

	public Optional<StatusSubType1Code> getCurrentStatusSubType() {
		return currentStatusSubType == null ? Optional.empty() : Optional.of(currentStatusSubType);
	}

	public TradeData7 setCurrentStatusSubType(StatusSubType1Code currentStatusSubType) {
		this.currentStatusSubType = currentStatusSubType;
		return this;
	}

	public Optional<ISODateTime> getCurrentStatusDateTime() {
		return currentStatusDateTime == null ? Optional.empty() : Optional.of(currentStatusDateTime);
	}

	public TradeData7 setCurrentStatusDateTime(ISODateTime currentStatusDateTime) {
		this.currentStatusDateTime = currentStatusDateTime;
		return this;
	}

	public Optional<Status6Choice> getPreviousStatus() {
		return previousStatus == null ? Optional.empty() : Optional.of(previousStatus);
	}

	public TradeData7 setPreviousStatus(Status6Choice previousStatus) {
		this.previousStatus = previousStatus;
		return this;
	}

	public Optional<StatusSubType1Code> getPreviousStatusSubType() {
		return previousStatusSubType == null ? Optional.empty() : Optional.of(previousStatusSubType);
	}

	public TradeData7 setPreviousStatusSubType(StatusSubType1Code previousStatusSubType) {
		this.previousStatusSubType = previousStatusSubType;
		return this;
	}

	public Optional<ISODateTime> getPreviousStatusDateTime() {
		return previousStatusDateTime == null ? Optional.empty() : Optional.of(previousStatusDateTime);
	}

	public TradeData7 setPreviousStatusDateTime(ISODateTime previousStatusDateTime) {
		this.previousStatusDateTime = previousStatusDateTime;
		return this;
	}

	public Optional<Max35Text> getProductType() {
		return productType == null ? Optional.empty() : Optional.of(productType);
	}

	public TradeData7 setProductType(Max35Text productType) {
		this.productType = productType;
		return this;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return settlementSessionIdentifier == null ? Optional.empty() : Optional.of(settlementSessionIdentifier);
	}

	public TradeData7 setSettlementSessionIdentifier(Exact4AlphaNumericText settlementSessionIdentifier) {
		this.settlementSessionIdentifier = settlementSessionIdentifier;
		return this;
	}

	public Optional<YesNoIndicator> getSplitTradeIndicator() {
		return splitTradeIndicator == null ? Optional.empty() : Optional.of(splitTradeIndicator);
	}

	public TradeData7 setSplitTradeIndicator(YesNoIndicator splitTradeIndicator) {
		this.splitTradeIndicator = splitTradeIndicator;
		return this;
	}
}