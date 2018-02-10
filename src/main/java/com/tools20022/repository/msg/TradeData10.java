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
import com.tools20022.repository.area.other.ForeignExchangeTradeBulkStatusNotificationV02;
import com.tools20022.repository.choice.Status5Choice;
import com.tools20022.repository.codeset.StatusSubType1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Status;
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
 * {@linkplain com.tools20022.repository.msg.TradeData10#mmMessageIdentification
 * TradeData10.mmMessageIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#mmStatusOriginator
 * TradeData10.mmStatusOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#mmCurrentStatus
 * TradeData10.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData10#mmCurrentStatusSubType
 * TradeData10.mmCurrentStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData10#mmCurrentStatusDateTime
 * TradeData10.mmCurrentStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#mmPreviousStatus
 * TradeData10.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData10#mmPreviousStatusSubType
 * TradeData10.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#mmProductType
 * TradeData10.mmProductType}</li>
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
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeBulkStatusNotificationV02#mmStatusDetails
 * ForeignExchangeTradeBulkStatusNotificationV02.mmStatusDetails}</li>
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
 * "TradeData10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the status of a trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeData4
 * TradeData4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeData10", propOrder = {"messageIdentification", "statusOriginator", "currentStatus", "currentStatusSubType", "currentStatusDateTime", "previousStatus", "previousStatusSubType", "productType"})
public class TradeData10 {

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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmMessageIdentification
	 * TradeData12.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identification of the present message assigned by the party issuing the message. This identification must be unique amongst all messages of same type sent by the same party.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * "Party that assigned the status to the foreign exchange trade."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmStatusOriginator
	 * TradeData12.mmStatusOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusOriginator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Party that assigned the status to the foreign exchange trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmStatusOriginator);
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatus
	 * TradeData12.mmCurrentStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Specifies the new status of the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmCurrentStatus);
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusSubType
	 * TradeData12.mmCurrentStatusSubType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusSubType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "CurStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusSubType";
			definition = "Additional information about the current status of the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmCurrentStatusSubType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatusSubType1Code.mmObject();
		}
	};
	@XmlElement(name = "CurStsDtTm", required = true)
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * "Specifies the date and time at which the current status was assigned to all the trades, unless overwritten by a date and time assigned to an individual trade."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusDateTime
	 * TradeData12.mmCurrentStatusDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "CurStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusDateTime";
			definition = "Specifies the date and time at which the current status was assigned to all the trades, unless overwritten by a date and time assigned to an individual trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmCurrentStatusDateTime);
			maxOccurs = 1;
			minOccurs = 1;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatus
	 * TradeData12.mmPreviousStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "PrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatus";
			definition = "Specifies the previous status of a trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmPreviousStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Status5Choice.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatusSubType
	 * TradeData12.mmPreviousStatusSubType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatusSubType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusSubType";
			definition = "Additional information on the previous status of a trade in a central system.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmPreviousStatusSubType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StatusSubType1Code.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
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
	 * "Specifies the product for which the status of the confirmation is reported, unless overwritten by a product type assigned to an individual trade."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmProductType
	 * TradeData12.mmProductType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmTypeOfProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData10.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Specifies the product for which the status of the confirmation is reported, unless overwritten by a product type assigned to an individual trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeData12.mmProductType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData10.mmMessageIdentification, com.tools20022.repository.msg.TradeData10.mmStatusOriginator,
						com.tools20022.repository.msg.TradeData10.mmCurrentStatus, com.tools20022.repository.msg.TradeData10.mmCurrentStatusSubType, com.tools20022.repository.msg.TradeData10.mmCurrentStatusDateTime,
						com.tools20022.repository.msg.TradeData10.mmPreviousStatus, com.tools20022.repository.msg.TradeData10.mmPreviousStatusSubType, com.tools20022.repository.msg.TradeData10.mmProductType);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeBulkStatusNotificationV02.mmStatusDetails);
				trace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeData10";
				definition = "Provides information on the status of a trade.";
				nextVersions_lazy = () -> Arrays.asList(TradeData12.mmObject());
				previousVersion_lazy = () -> TradeData4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public TradeData10 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<Max35Text> getStatusOriginator() {
		return statusOriginator == null ? Optional.empty() : Optional.of(statusOriginator);
	}

	public TradeData10 setStatusOriginator(Max35Text statusOriginator) {
		this.statusOriginator = statusOriginator;
		return this;
	}

	public StatusAndSubStatus1 getCurrentStatus() {
		return currentStatus;
	}

	public TradeData10 setCurrentStatus(com.tools20022.repository.msg.StatusAndSubStatus1 currentStatus) {
		this.currentStatus = Objects.requireNonNull(currentStatus);
		return this;
	}

	public Optional<StatusSubType1Code> getCurrentStatusSubType() {
		return currentStatusSubType == null ? Optional.empty() : Optional.of(currentStatusSubType);
	}

	public TradeData10 setCurrentStatusSubType(StatusSubType1Code currentStatusSubType) {
		this.currentStatusSubType = currentStatusSubType;
		return this;
	}

	public ISODateTime getCurrentStatusDateTime() {
		return currentStatusDateTime;
	}

	public TradeData10 setCurrentStatusDateTime(ISODateTime currentStatusDateTime) {
		this.currentStatusDateTime = Objects.requireNonNull(currentStatusDateTime);
		return this;
	}

	public Optional<Status5Choice> getPreviousStatus() {
		return previousStatus == null ? Optional.empty() : Optional.of(previousStatus);
	}

	public TradeData10 setPreviousStatus(Status5Choice previousStatus) {
		this.previousStatus = previousStatus;
		return this;
	}

	public Optional<StatusSubType1Code> getPreviousStatusSubType() {
		return previousStatusSubType == null ? Optional.empty() : Optional.of(previousStatusSubType);
	}

	public TradeData10 setPreviousStatusSubType(StatusSubType1Code previousStatusSubType) {
		this.previousStatusSubType = previousStatusSubType;
		return this;
	}

	public Optional<Max35Text> getProductType() {
		return productType == null ? Optional.empty() : Optional.of(productType);
	}

	public TradeData10 setProductType(Max35Text productType) {
		this.productType = productType;
		return this;
	}
}