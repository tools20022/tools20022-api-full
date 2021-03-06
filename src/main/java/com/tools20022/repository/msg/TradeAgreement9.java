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
 * Date and identification of a trade together with references to previous
 * events in its life.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement9#mmTradeDate
 * TradeAgreement9.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmMessageIdentification
 * TradeAgreement9.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmOriginatorReference
 * TradeAgreement9.mmOriginatorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmCommonReference
 * TradeAgreement9.mmCommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmAmendOrCancelReason
 * TradeAgreement9.mmAmendOrCancelReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmRelatedReference
 * TradeAgreement9.mmRelatedReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement9#mmProductType
 * TradeAgreement9.mmProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmOperationType
 * TradeAgreement9.mmOperationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmOperationScope
 * TradeAgreement9.mmOperationScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmSettlementSessionIdentifier
 * TradeAgreement9.mmSettlementSessionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement9#mmSplitTradeIndicator
 * TradeAgreement9.mmSplitTradeIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
 * TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmTradeInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeAgreement9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Date and identification of a trade together with references to previous events in its life."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement12
 * TradeAgreement12}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeAgreement9", propOrder = {"tradeDate", "messageIdentification", "originatorReference", "commonReference", "amendOrCancelReason", "relatedReference", "productType", "operationType", "operationScope",
		"settlementSessionIdentifier", "splitTradeIndicator"})
public class TradeAgreement9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradDt", required = true)
	protected ISODate tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the trading parties agreed on the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmTradeDate
	 * TradeAgreement12.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, ISODate> mmTradeDate = new MMMessageAttribute<TradeAgreement9, ISODate>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date on which the trading parties agreed on the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TradeAgreement9 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(TradeAgreement9 obj, ISODate value) {
			obj.setTradeDate(value);
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the present message assigned by the party issuing the message. This identification must be unique amongst all messages of same type sent by the same party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmMessageIdentification
	 * TradeAgreement12.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Max35Text> mmMessageIdentification = new MMMessageAttribute<TradeAgreement9, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identification of the present message assigned by the party issuing the message. This identification must be unique amongst all messages of same type sent by the same party.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeAgreement9 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrgtrRef", required = true)
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the original reference of the instruction for which the status is given, as assigned by the participant that submitted the foreign exchange trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmOriginatorReference
	 * TradeAgreement12.mmOriginatorReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Max35Text> mmOriginatorReference = new MMMessageAttribute<TradeAgreement9, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "OrgtrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatorReference";
			definition = "Represents the original reference of the instruction for which the status is given, as assigned by the participant that submitted the foreign exchange trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmOriginatorReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeAgreement9 obj) {
			return obj.getOriginatorReference();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Max35Text value) {
			obj.setOriginatorReference(value);
		}
	};
	@XmlElement(name = "CmonRef")
	protected Max35Text commonReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference common to both parties of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmCommonReference
	 * TradeAgreement12.mmCommonReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Optional<Max35Text>> mmCommonReference = new MMMessageAttribute<TradeAgreement9, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "CmonRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			definition = "Reference common to both parties of the trade.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmCommonReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeAgreement9 obj) {
			return obj.getCommonReference();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Optional<Max35Text> value) {
			obj.setCommonReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdOrCclRsn")
	protected Max35Text amendOrCancelReason;
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
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdOrCclRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendOrCancelReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the cancellation or the amendment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmAmendOrCancelReason
	 * TradeAgreement12.mmAmendOrCancelReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Optional<Max35Text>> mmAmendOrCancelReason = new MMMessageAttribute<TradeAgreement9, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "AmdOrCclRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendOrCancelReason";
			definition = "Specifies the reason for the cancellation or the amendment.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmAmendOrCancelReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeAgreement9 obj) {
			return obj.getAmendOrCancelReason();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Optional<Max35Text> value) {
			obj.setAmendOrCancelReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected Max35Text relatedReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of a previous event in the life of a trade which is amended or cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmRelatedReference
	 * TradeAgreement12.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Optional<Max35Text>> mmRelatedReference = new MMMessageAttribute<TradeAgreement9, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to the identification of a previous event in the life of a trade which is amended or cancelled.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeAgreement9 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Optional<Max35Text> value) {
			obj.setRelatedReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product for which the status of the confirmation is reported."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmProductType
	 * TradeAgreement12.mmProductType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Optional<Max35Text>> mmProductType = new MMMessageAttribute<TradeAgreement9, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmTypeOfProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Specifies the product for which the status of the confirmation is reported.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmProductType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeAgreement9 obj) {
			return obj.getProductType();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Optional<Max35Text> value) {
			obj.setProductType(value.orElse(null));
		}
	};
	@XmlElement(name = "OprTp")
	protected Max4Text operationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying transaction, for example cancellation (CANC)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmOperationType
	 * TradeAgreement12.mmOperationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Optional<Max4Text>> mmOperationType = new MMMessageAttribute<TradeAgreement9, Optional<Max4Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "OprTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationType";
			definition = "Specifies the type of underlying transaction, for example cancellation (CANC).";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmOperationType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Optional<Max4Text> getValue(TradeAgreement9 obj) {
			return obj.getOperationType();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Optional<Max4Text> value) {
			obj.setOperationType(value.orElse(null));
		}
	};
	@XmlElement(name = "OprScp")
	protected Max4Text operationScope;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprScp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the business role between the submitter and the trade party, for example, agent (AGNT)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmOperationScope
	 * TradeAgreement12.mmOperationScope}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Optional<Max4Text>> mmOperationScope = new MMMessageAttribute<TradeAgreement9, Optional<Max4Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "OprScp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationScope";
			definition = "Specifies the business role between the submitter and the trade party, for example, agent (AGNT).";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmOperationScope);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Optional<Max4Text> getValue(TradeAgreement9 obj) {
			return obj.getOperationScope();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Optional<Max4Text> value) {
			obj.setOperationScope(value.orElse(null));
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSsnIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSessionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To indicate the requested CLS Settlement Session that the related trade is part of."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmSettlementSessionIdentifier
	 * TradeAgreement12.mmSettlementSessionIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, Optional<Exact4AlphaNumericText>> mmSettlementSessionIdentifier = new MMMessageAttribute<TradeAgreement9, Optional<Exact4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "SttlmSsnIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSessionIdentifier";
			definition = "To indicate the requested CLS Settlement Session that the related trade is part of.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmSettlementSessionIdentifier);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact4AlphaNumericText> getValue(TradeAgreement9 obj) {
			return obj.getSettlementSessionIdentifier();
		}

		@Override
		public void setValue(TradeAgreement9 obj, Optional<Exact4AlphaNumericText> value) {
			obj.setSettlementSessionIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "SpltTradInd", required = true)
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement9
	 * TradeAgreement9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltTradInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "To indicate if the trade is split."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement12#mmSplitTradeIndicator
	 * TradeAgreement12.mmSplitTradeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement9, YesNoIndicator> mmSplitTradeIndicator = new MMMessageAttribute<TradeAgreement9, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement9.mmObject();
			isDerived = false;
			xmlTag = "SpltTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTradeIndicator";
			definition = "To indicate if the trade is split.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmSplitTradeIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(TradeAgreement9 obj) {
			return obj.getSplitTradeIndicator();
		}

		@Override
		public void setValue(TradeAgreement9 obj, YesNoIndicator value) {
			obj.setSplitTradeIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeAgreement9.mmTradeDate, com.tools20022.repository.msg.TradeAgreement9.mmMessageIdentification,
						com.tools20022.repository.msg.TradeAgreement9.mmOriginatorReference, com.tools20022.repository.msg.TradeAgreement9.mmCommonReference, com.tools20022.repository.msg.TradeAgreement9.mmAmendOrCancelReason,
						com.tools20022.repository.msg.TradeAgreement9.mmRelatedReference, com.tools20022.repository.msg.TradeAgreement9.mmProductType, com.tools20022.repository.msg.TradeAgreement9.mmOperationType,
						com.tools20022.repository.msg.TradeAgreement9.mmOperationScope, com.tools20022.repository.msg.TradeAgreement9.mmSettlementSessionIdentifier, com.tools20022.repository.msg.TradeAgreement9.mmSplitTradeIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeInformation);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeAgreement9";
				definition = "Date and identification of a trade together with references to previous events in its life.";
				nextVersions_lazy = () -> Arrays.asList(TradeAgreement12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getTradeDate() {
		return tradeDate;
	}

	public TradeAgreement9 setTradeDate(ISODate tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public TradeAgreement9 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Max35Text getOriginatorReference() {
		return originatorReference;
	}

	public TradeAgreement9 setOriginatorReference(Max35Text originatorReference) {
		this.originatorReference = Objects.requireNonNull(originatorReference);
		return this;
	}

	public Optional<Max35Text> getCommonReference() {
		return commonReference == null ? Optional.empty() : Optional.of(commonReference);
	}

	public TradeAgreement9 setCommonReference(Max35Text commonReference) {
		this.commonReference = commonReference;
		return this;
	}

	public Optional<Max35Text> getAmendOrCancelReason() {
		return amendOrCancelReason == null ? Optional.empty() : Optional.of(amendOrCancelReason);
	}

	public TradeAgreement9 setAmendOrCancelReason(Max35Text amendOrCancelReason) {
		this.amendOrCancelReason = amendOrCancelReason;
		return this;
	}

	public Optional<Max35Text> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public TradeAgreement9 setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<Max35Text> getProductType() {
		return productType == null ? Optional.empty() : Optional.of(productType);
	}

	public TradeAgreement9 setProductType(Max35Text productType) {
		this.productType = productType;
		return this;
	}

	public Optional<Max4Text> getOperationType() {
		return operationType == null ? Optional.empty() : Optional.of(operationType);
	}

	public TradeAgreement9 setOperationType(Max4Text operationType) {
		this.operationType = operationType;
		return this;
	}

	public Optional<Max4Text> getOperationScope() {
		return operationScope == null ? Optional.empty() : Optional.of(operationScope);
	}

	public TradeAgreement9 setOperationScope(Max4Text operationScope) {
		this.operationScope = operationScope;
		return this;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return settlementSessionIdentifier == null ? Optional.empty() : Optional.of(settlementSessionIdentifier);
	}

	public TradeAgreement9 setSettlementSessionIdentifier(Exact4AlphaNumericText settlementSessionIdentifier) {
		this.settlementSessionIdentifier = settlementSessionIdentifier;
		return this;
	}

	public YesNoIndicator getSplitTradeIndicator() {
		return splitTradeIndicator;
	}

	public TradeAgreement9 setSplitTradeIndicator(YesNoIndicator splitTradeIndicator) {
		this.splitTradeIndicator = Objects.requireNonNull(splitTradeIndicator);
		return this;
	}
}