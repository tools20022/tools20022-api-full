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
import com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02;
import com.tools20022.repository.choice.Status5Choice;
import com.tools20022.repository.codeset.StatusSubType1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.entity.TreasuryTradeSettlementStatus;
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
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmMatchingSystemUniqueReference
 * TradeData9.mmMatchingSystemUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmMatchingSystemMatchingReference
 * TradeData9.mmMatchingSystemMatchingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmMatchingSystemMatchedSideReference
 * TradeData9.mmMatchingSystemMatchedSideReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#mmStatusOriginator
 * TradeData9.mmStatusOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#mmCurrentStatus
 * TradeData9.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmCurrentStatusSubType
 * TradeData9.mmCurrentStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmCurrentStatusDateTime
 * TradeData9.mmCurrentStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#mmPreviousStatus
 * TradeData9.mmPreviousStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#mmAllegedTrade
 * TradeData9.mmAllegedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmPreviousStatusSubType
 * TradeData9.mmPreviousStatusSubType}</li>
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
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmStatusDetails
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmStatusDetails}</li>
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
 * "TradeData9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the status of a trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14 TradeData14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16 TradeData16}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeData3
 * TradeData3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeData9", propOrder = {"matchingSystemUniqueReference", "matchingSystemMatchingReference", "matchingSystemMatchedSideReference", "statusOriginator", "currentStatus", "currentStatusSubType", "currentStatusDateTime",
		"previousStatus", "allegedTrade", "previousStatusSubType"})
public class TradeData9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * "Reference to the unique system identification assigned to the trade by the central matching system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmMatchingSystemUniqueReference
	 * TradeData14.mmMatchingSystemUniqueReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmMatchingSystemUniqueReference
	 * TradeData16.mmMatchingSystemUniqueReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemUniqueReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemUniqueReference";
			definition = "Reference to the unique system identification assigned to the trade by the central matching system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmMatchingSystemUniqueReference, TradeData16.mmMatchingSystemUniqueReference);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * "Reference to the unique matching identification assigned to the trade and to the matching trade from the counterparty by the central matching system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmMatchingSystemMatchingReference
	 * TradeData14.mmMatchingSystemMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmMatchingSystemMatchingReference
	 * TradeData16.mmMatchingSystemMatchingReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemMatchingReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysMtchgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemMatchingReference";
			definition = "Reference to the unique matching identification assigned to the trade and to the matching trade from the counterparty by the central matching system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmMatchingSystemMatchingReference, TradeData16.mmMatchingSystemMatchingReference);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * "Unique reference from the central settlement system that allows the removal of alleged trades once the matched status notification for the matching side has been received."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmMatchingSystemMatchedSideReference
	 * TradeData14.mmMatchingSystemMatchedSideReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmMatchingSystemMatchedSideReference
	 * TradeData16.mmMatchingSystemMatchedSideReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemMatchedSideReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysMtchdSdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemMatchedSideReference";
			definition = "Unique reference from the central settlement system that allows the removal of alleged trades once the matched status notification for the matching side has been received.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmMatchingSystemMatchedSideReference, TradeData16.mmMatchingSystemMatchedSideReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "StsOrgtr")
	protected Max35Text statusOriginator;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * definition} = "Party that assigned the status to the trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmStatusOriginator
	 * TradeData14.mmStatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmStatusOriginator
	 * TradeData16.mmStatusOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusOriginator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Party that assigned the status to the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmStatusOriginator, TradeData16.mmStatusOriginator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * definition} = "Specifies the new status of the trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatus
	 * TradeData14.mmCurrentStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Specifies the new status of the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmCurrentStatus);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * "Additional information about the current status of the trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatusSubType
	 * TradeData14.mmCurrentStatusSubType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusSubType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "CurStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusSubType";
			definition = "Additional information about the current status of the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmCurrentStatusSubType);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatusDateTime
	 * TradeData14.mmCurrentStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData16#mmCurrentStatusDateTime
	 * TradeData16.mmCurrentStatusDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "CurStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusDateTime";
			definition = "Specifies the date and time at which the current status was assigned.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmCurrentStatusDateTime, TradeData16.mmCurrentStatusDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PrvsSts")
	protected Status5Choice previousStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status5Choice Status5Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * definition} = "Specifies the previous status of the trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmPreviousStatus
	 * TradeData14.mmPreviousStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "PrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatus";
			definition = "Specifies the previous status of the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmPreviousStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Status5Choice.mmObject();
		}
	};
	@XmlElement(name = "AllgdTrad")
	protected YesNoIndicator allegedTrade;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmAllegedTrade
	 * TreasuryTradeSettlementStatus.mmAllegedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllgdTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether a trade is alleged or not."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#mmAllegedTrade
	 * TradeData14.mmAllegedTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllegedTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmAllegedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "AllgdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegedTrade";
			definition = "Specifies whether a trade is alleged or not.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmAllegedTrade);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData9
	 * TradeData9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeData14#mmPreviousStatusSubType
	 * TradeData14.mmPreviousStatusSubType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatusSubType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData9.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusSubType";
			definition = "Additional information on the previous status of a trade in a central system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData14.mmPreviousStatusSubType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatusSubType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData9.mmMatchingSystemUniqueReference, com.tools20022.repository.msg.TradeData9.mmMatchingSystemMatchingReference,
						com.tools20022.repository.msg.TradeData9.mmMatchingSystemMatchedSideReference, com.tools20022.repository.msg.TradeData9.mmStatusOriginator, com.tools20022.repository.msg.TradeData9.mmCurrentStatus,
						com.tools20022.repository.msg.TradeData9.mmCurrentStatusSubType, com.tools20022.repository.msg.TradeData9.mmCurrentStatusDateTime, com.tools20022.repository.msg.TradeData9.mmPreviousStatus,
						com.tools20022.repository.msg.TradeData9.mmAllegedTrade, com.tools20022.repository.msg.TradeData9.mmPreviousStatusSubType);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeStatusAndDetailsNotificationV02.mmStatusDetails);
				trace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeData9";
				definition = "Provides information on the status of a trade.";
				nextVersions_lazy = () -> Arrays.asList(TradeData14.mmObject(), TradeData16.mmObject());
				previousVersion_lazy = () -> TradeData3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMatchingSystemUniqueReference() {
		return matchingSystemUniqueReference;
	}

	public TradeData9 setMatchingSystemUniqueReference(Max35Text matchingSystemUniqueReference) {
		this.matchingSystemUniqueReference = Objects.requireNonNull(matchingSystemUniqueReference);
		return this;
	}

	public Optional<Max35Text> getMatchingSystemMatchingReference() {
		return matchingSystemMatchingReference == null ? Optional.empty() : Optional.of(matchingSystemMatchingReference);
	}

	public TradeData9 setMatchingSystemMatchingReference(Max35Text matchingSystemMatchingReference) {
		this.matchingSystemMatchingReference = matchingSystemMatchingReference;
		return this;
	}

	public Optional<Max35Text> getMatchingSystemMatchedSideReference() {
		return matchingSystemMatchedSideReference == null ? Optional.empty() : Optional.of(matchingSystemMatchedSideReference);
	}

	public TradeData9 setMatchingSystemMatchedSideReference(Max35Text matchingSystemMatchedSideReference) {
		this.matchingSystemMatchedSideReference = matchingSystemMatchedSideReference;
		return this;
	}

	public Optional<Max35Text> getStatusOriginator() {
		return statusOriginator == null ? Optional.empty() : Optional.of(statusOriginator);
	}

	public TradeData9 setStatusOriginator(Max35Text statusOriginator) {
		this.statusOriginator = statusOriginator;
		return this;
	}

	public StatusAndSubStatus1 getCurrentStatus() {
		return currentStatus;
	}

	public TradeData9 setCurrentStatus(com.tools20022.repository.msg.StatusAndSubStatus1 currentStatus) {
		this.currentStatus = Objects.requireNonNull(currentStatus);
		return this;
	}

	public Optional<StatusSubType1Code> getCurrentStatusSubType() {
		return currentStatusSubType == null ? Optional.empty() : Optional.of(currentStatusSubType);
	}

	public TradeData9 setCurrentStatusSubType(StatusSubType1Code currentStatusSubType) {
		this.currentStatusSubType = currentStatusSubType;
		return this;
	}

	public Optional<ISODateTime> getCurrentStatusDateTime() {
		return currentStatusDateTime == null ? Optional.empty() : Optional.of(currentStatusDateTime);
	}

	public TradeData9 setCurrentStatusDateTime(ISODateTime currentStatusDateTime) {
		this.currentStatusDateTime = currentStatusDateTime;
		return this;
	}

	public Optional<Status5Choice> getPreviousStatus() {
		return previousStatus == null ? Optional.empty() : Optional.of(previousStatus);
	}

	public TradeData9 setPreviousStatus(Status5Choice previousStatus) {
		this.previousStatus = previousStatus;
		return this;
	}

	public Optional<YesNoIndicator> getAllegedTrade() {
		return allegedTrade == null ? Optional.empty() : Optional.of(allegedTrade);
	}

	public TradeData9 setAllegedTrade(YesNoIndicator allegedTrade) {
		this.allegedTrade = allegedTrade;
		return this;
	}

	public Optional<StatusSubType1Code> getPreviousStatusSubType() {
		return previousStatusSubType == null ? Optional.empty() : Optional.of(previousStatusSubType);
	}

	public TradeData9 setPreviousStatusSubType(StatusSubType1Code previousStatusSubType) {
		this.previousStatusSubType = previousStatusSubType;
		return this;
	}
}