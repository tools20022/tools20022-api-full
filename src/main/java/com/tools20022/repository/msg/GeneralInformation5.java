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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.Trading1MethodCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AgreementConditions1;
import com.tools20022.repository.msg.ContactInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information concerning the negotiation process leading to a treasury trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBlockIndicator
 * GeneralInformation5.mmBlockIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmRelatedTradeReference
 * GeneralInformation5.mmRelatedTradeReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDealingMethod
 * GeneralInformation5.mmDealingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBrokerIdentification
 * GeneralInformation5.mmBrokerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmCounterpartyReference
 * GeneralInformation5.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBrokersCommission
 * GeneralInformation5.mmBrokersCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmSenderToReceiverInformation
 * GeneralInformation5.mmSenderToReceiverInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDealingBranchTradingSide
 * GeneralInformation5.mmDealingBranchTradingSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDealingBranchCounterpartySide
 * GeneralInformation5.mmDealingBranchCounterpartySide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmContactInformation
 * GeneralInformation5.mmContactInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmAgreementDetails
 * GeneralInformation5.mmAgreementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDefinitionsYear
 * GeneralInformation5.mmDefinitionsYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBrokersReference
 * GeneralInformation5.mmBrokersReference}</li>
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
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionV04.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionCancellationV04.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionAmendmentV04.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmGeneralInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmGeneralInformation}</li>
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
 * "GeneralInformation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information concerning the negotiation process leading to a treasury trade."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
 * GeneralInformation4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeneralInformation5", propOrder = {"blockIndicator", "relatedTradeReference", "dealingMethod", "brokerIdentification", "counterpartyReference", "brokersCommission", "senderToReceiverInformation",
		"dealingBranchTradingSide", "dealingBranchCounterpartySide", "contactInformation", "agreementDetails", "definitionsYear", "brokersReference"})
public class GeneralInformation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BlckInd")
	protected YesNoIndicator blockIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmBlockIndicator
	 * Trade.mmBlockIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the trade is a block or single trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBlockIndicator
	 * GeneralInformation4.mmBlockIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<YesNoIndicator>> mmBlockIndicator = new MMMessageAttribute<GeneralInformation5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmBlockIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BlckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			previousVersion_lazy = () -> GeneralInformation4.mmBlockIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(GeneralInformation5 obj) {
			return obj.getBlockIndicator();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<YesNoIndicator> value) {
			obj.setBlockIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdTradRef")
	protected Max35Text relatedTradeReference;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdTradRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTradeReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a preceding transaction, for example, an option or swap."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmRelatedTradeReference
	 * GeneralInformation4.mmRelatedTradeReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<Max35Text>> mmRelatedTradeReference = new MMMessageAttribute<GeneralInformation5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "RltdTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTradeReference";
			definition = "Reference to a preceding transaction, for example, an option or swap.";
			previousVersion_lazy = () -> GeneralInformation4.mmRelatedTradeReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GeneralInformation5 obj) {
			return obj.getRelatedTradeReference();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<Max35Text> value) {
			obj.setRelatedTradeReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DealgMtd")
	protected Trading1MethodCode dealingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Trading1MethodCode
	 * Trading1MethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradingMethod
	 * Negotiation.mmTradingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used by the trading parties to negotiate and/or execute a deal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmDealingMethod
	 * GeneralInformation4.mmDealingMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<Trading1MethodCode>> mmDealingMethod = new MMMessageAttribute<GeneralInformation5, Optional<Trading1MethodCode>>() {
		{
			businessElementTrace_lazy = () -> Negotiation.mmTradingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DealgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingMethod";
			definition = "Method used by the trading parties to negotiate and/or execute a deal.";
			previousVersion_lazy = () -> GeneralInformation4.mmDealingMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Trading1MethodCode.mmObject();
		}

		@Override
		public Optional<Trading1MethodCode> getValue(GeneralInformation5 obj) {
			return obj.getDealingMethod();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<Trading1MethodCode> value) {
			obj.setDealingMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "BrkrId")
	protected PartyIdentification73Choice brokerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the broker which arranged the deal between the trading side and the counterparty side or, when two money brokers are involved, between the trading side and the other money broker."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBrokerIdentification
	 * GeneralInformation4.mmBrokerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeneralInformation5, Optional<PartyIdentification73Choice>> mmBrokerIdentification = new MMMessageAssociationEnd<GeneralInformation5, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerIdentification";
			definition = "Specifies the broker which arranged the deal between the trading side and the counterparty side or, when two money brokers are involved, between the trading side and the other money broker.";
			previousVersion_lazy = () -> GeneralInformation4.mmBrokerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(GeneralInformation5 obj) {
			return obj.getBrokerIdentification();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<PartyIdentification73Choice> value) {
			obj.setBrokerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtyRef")
	protected Max35Text counterpartyReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty's reference for the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmCounterpartyReference
	 * GeneralInformation4.mmCounterpartyReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<Max35Text>> mmCounterpartyReference = new MMMessageAttribute<GeneralInformation5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Counterparty's reference for the trade.";
			previousVersion_lazy = () -> GeneralInformation4.mmCounterpartyReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GeneralInformation5 obj) {
			return obj.getCounterpartyReference();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<Max35Text> value) {
			obj.setCounterpartyReference(value.orElse(null));
		}
	};
	@XmlElement(name = "BrkrsComssn")
	protected ActiveCurrencyAndAmount brokersCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionAmount
	 * Commission.mmCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkrsComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokersCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brokerage fee for a broker confirmation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBrokersCommission
	 * GeneralInformation4.mmBrokersCommission}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<ActiveCurrencyAndAmount>> mmBrokersCommission = new MMMessageAttribute<GeneralInformation5, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BrkrsComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokersCommission";
			definition = "Brokerage fee for a broker confirmation.";
			previousVersion_lazy = () -> GeneralInformation4.mmBrokersCommission;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(GeneralInformation5 obj) {
			return obj.getBrokersCommission();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setBrokersCommission(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrToRcvrInf")
	protected Max210Text senderToReceiverInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrToRcvrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information for the receiver and applies to the whole message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmSenderToReceiverInformation
	 * GeneralInformation4.mmSenderToReceiverInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<Max210Text>> mmSenderToReceiverInformation = new MMMessageAttribute<GeneralInformation5, Optional<Max210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "SndrToRcvrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderToReceiverInformation";
			definition = "Specifies additional information for the receiver and applies to the whole message.";
			previousVersion_lazy = () -> GeneralInformation4.mmSenderToReceiverInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(GeneralInformation5 obj) {
			return obj.getSenderToReceiverInformation();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<Max210Text> value) {
			obj.setSenderToReceiverInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "DealgBrnchTradgSd")
	protected PartyIdentification73Choice dealingBranchTradingSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgBrnchTradgSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingBranchTradingSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the branch at the trading side with which the deal was done."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmDealingBranchTradingSide
	 * GeneralInformation4.mmDealingBranchTradingSide}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeneralInformation5, Optional<PartyIdentification73Choice>> mmDealingBranchTradingSide = new MMMessageAssociationEnd<GeneralInformation5, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DealgBrnchTradgSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingBranchTradingSide";
			definition = "Specifies the branch at the trading side with which the deal was done.";
			previousVersion_lazy = () -> GeneralInformation4.mmDealingBranchTradingSide;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(GeneralInformation5 obj) {
			return obj.getDealingBranchTradingSide();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<PartyIdentification73Choice> value) {
			obj.setDealingBranchTradingSide(value.orElse(null));
		}
	};
	@XmlElement(name = "DealgBrnchCtrPtySd")
	protected PartyIdentification73Choice dealingBranchCounterpartySide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgBrnchCtrPtySd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingBranchCounterpartySide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the branch at the counterparty side with which the deal was done."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmDealingBranchCounterpartySide
	 * GeneralInformation4.mmDealingBranchCounterpartySide}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeneralInformation5, Optional<PartyIdentification73Choice>> mmDealingBranchCounterpartySide = new MMMessageAssociationEnd<GeneralInformation5, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DealgBrnchCtrPtySd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingBranchCounterpartySide";
			definition = "Specifies the branch at the counterparty side with which the deal was done.";
			previousVersion_lazy = () -> GeneralInformation4.mmDealingBranchCounterpartySide;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(GeneralInformation5 obj) {
			return obj.getDealingBranchCounterpartySide();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<PartyIdentification73Choice> value) {
			obj.setDealingBranchCounterpartySide(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctInf")
	protected ContactInformation1 contactInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactInformation1
	 * ContactInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the name and/or electronic address of the receiver of the message who may be contacted for any queries concerning this trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmContactInformation
	 * GeneralInformation4.mmContactInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeneralInformation5, Optional<ContactInformation1>> mmContactInformation = new MMMessageAssociationEnd<GeneralInformation5, Optional<ContactInformation1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "CtctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactInformation";
			definition = "Specifies the name and/or electronic address of the receiver of the message who may be contacted for any queries concerning this trade.";
			previousVersion_lazy = () -> GeneralInformation4.mmContactInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactInformation1.mmObject();
		}

		@Override
		public Optional<ContactInformation1> getValue(GeneralInformation5 obj) {
			return obj.getContactInformation();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<ContactInformation1> value) {
			obj.setContactInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AgrmtDtls")
	protected AgreementConditions1 agreementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreementConditions1
	 * AgreementConditions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type, date and version of the agreement used in a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeneralInformation5, Optional<AgreementConditions1>> mmAgreementDetails = new MMMessageAssociationEnd<GeneralInformation5, Optional<AgreementConditions1>>() {
		{
			businessComponentTrace_lazy = () -> MasterAgreement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "AgrmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementDetails";
			definition = "Specifies the type, date and version of the agreement used in a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AgreementConditions1.mmObject();
		}

		@Override
		public Optional<AgreementConditions1> getValue(GeneralInformation5 obj) {
			return obj.getAgreementDetails();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<AgreementConditions1> value) {
			obj.setAgreementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DefsYr")
	protected ISOYear definitionsYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOYear
	 * ISOYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DefsYr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinitionsYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the year of definitions of the agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<ISOYear>> mmDefinitionsYear = new MMMessageAttribute<GeneralInformation5, Optional<ISOYear>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DefsYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinitionsYear";
			definition = "Specifies the year of definitions of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYear.mmObject();
		}

		@Override
		public Optional<ISOYear> getValue(GeneralInformation5 obj) {
			return obj.getDefinitionsYear();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<ISOYear> value) {
			obj.setDefinitionsYear(value.orElse(null));
		}
	};
	@XmlElement(name = "BrkrsRef")
	protected Max35Text brokersReference;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
	 * TradeIdentification.mmClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5
	 * GeneralInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkrsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokersReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a reference applied to the trade instruction by a broker."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralInformation5, Optional<Max35Text>> mmBrokersReference = new MMMessageAttribute<GeneralInformation5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BrkrsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokersReference";
			definition = "Specifies a reference applied to the trade instruction by a broker.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GeneralInformation5 obj) {
			return obj.getBrokersReference();
		}

		@Override
		public void setValue(GeneralInformation5 obj, Optional<Max35Text> value) {
			obj.setBrokersReference(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralInformation5.mmBlockIndicator, com.tools20022.repository.msg.GeneralInformation5.mmRelatedTradeReference,
						com.tools20022.repository.msg.GeneralInformation5.mmDealingMethod, com.tools20022.repository.msg.GeneralInformation5.mmBrokerIdentification, com.tools20022.repository.msg.GeneralInformation5.mmCounterpartyReference,
						com.tools20022.repository.msg.GeneralInformation5.mmBrokersCommission, com.tools20022.repository.msg.GeneralInformation5.mmSenderToReceiverInformation,
						com.tools20022.repository.msg.GeneralInformation5.mmDealingBranchTradingSide, com.tools20022.repository.msg.GeneralInformation5.mmDealingBranchCounterpartySide,
						com.tools20022.repository.msg.GeneralInformation5.mmContactInformation, com.tools20022.repository.msg.GeneralInformation5.mmAgreementDetails, com.tools20022.repository.msg.GeneralInformation5.mmDefinitionsYear,
						com.tools20022.repository.msg.GeneralInformation5.mmBrokersReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionV04.mmOptionalGeneralInformation, ForeignExchangeTradeInstructionCancellationV04.mmOptionalGeneralInformation,
						ForeignExchangeTradeInstructionAmendmentV04.mmOptionalGeneralInformation, ForeignExchangeTradeStatusAndDetailsNotificationV04.mmGeneralInformation);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeneralInformation5";
				definition = "Information concerning the negotiation process leading to a treasury trade.";
				previousVersion_lazy = () -> GeneralInformation4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getBlockIndicator() {
		return blockIndicator == null ? Optional.empty() : Optional.of(blockIndicator);
	}

	public GeneralInformation5 setBlockIndicator(YesNoIndicator blockIndicator) {
		this.blockIndicator = blockIndicator;
		return this;
	}

	public Optional<Max35Text> getRelatedTradeReference() {
		return relatedTradeReference == null ? Optional.empty() : Optional.of(relatedTradeReference);
	}

	public GeneralInformation5 setRelatedTradeReference(Max35Text relatedTradeReference) {
		this.relatedTradeReference = relatedTradeReference;
		return this;
	}

	public Optional<Trading1MethodCode> getDealingMethod() {
		return dealingMethod == null ? Optional.empty() : Optional.of(dealingMethod);
	}

	public GeneralInformation5 setDealingMethod(Trading1MethodCode dealingMethod) {
		this.dealingMethod = dealingMethod;
		return this;
	}

	public Optional<PartyIdentification73Choice> getBrokerIdentification() {
		return brokerIdentification == null ? Optional.empty() : Optional.of(brokerIdentification);
	}

	public GeneralInformation5 setBrokerIdentification(PartyIdentification73Choice brokerIdentification) {
		this.brokerIdentification = brokerIdentification;
		return this;
	}

	public Optional<Max35Text> getCounterpartyReference() {
		return counterpartyReference == null ? Optional.empty() : Optional.of(counterpartyReference);
	}

	public GeneralInformation5 setCounterpartyReference(Max35Text counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getBrokersCommission() {
		return brokersCommission == null ? Optional.empty() : Optional.of(brokersCommission);
	}

	public GeneralInformation5 setBrokersCommission(ActiveCurrencyAndAmount brokersCommission) {
		this.brokersCommission = brokersCommission;
		return this;
	}

	public Optional<Max210Text> getSenderToReceiverInformation() {
		return senderToReceiverInformation == null ? Optional.empty() : Optional.of(senderToReceiverInformation);
	}

	public GeneralInformation5 setSenderToReceiverInformation(Max210Text senderToReceiverInformation) {
		this.senderToReceiverInformation = senderToReceiverInformation;
		return this;
	}

	public Optional<PartyIdentification73Choice> getDealingBranchTradingSide() {
		return dealingBranchTradingSide == null ? Optional.empty() : Optional.of(dealingBranchTradingSide);
	}

	public GeneralInformation5 setDealingBranchTradingSide(PartyIdentification73Choice dealingBranchTradingSide) {
		this.dealingBranchTradingSide = dealingBranchTradingSide;
		return this;
	}

	public Optional<PartyIdentification73Choice> getDealingBranchCounterpartySide() {
		return dealingBranchCounterpartySide == null ? Optional.empty() : Optional.of(dealingBranchCounterpartySide);
	}

	public GeneralInformation5 setDealingBranchCounterpartySide(PartyIdentification73Choice dealingBranchCounterpartySide) {
		this.dealingBranchCounterpartySide = dealingBranchCounterpartySide;
		return this;
	}

	public Optional<ContactInformation1> getContactInformation() {
		return contactInformation == null ? Optional.empty() : Optional.of(contactInformation);
	}

	public GeneralInformation5 setContactInformation(ContactInformation1 contactInformation) {
		this.contactInformation = contactInformation;
		return this;
	}

	public Optional<AgreementConditions1> getAgreementDetails() {
		return agreementDetails == null ? Optional.empty() : Optional.of(agreementDetails);
	}

	public GeneralInformation5 setAgreementDetails(AgreementConditions1 agreementDetails) {
		this.agreementDetails = agreementDetails;
		return this;
	}

	public Optional<ISOYear> getDefinitionsYear() {
		return definitionsYear == null ? Optional.empty() : Optional.of(definitionsYear);
	}

	public GeneralInformation5 setDefinitionsYear(ISOYear definitionsYear) {
		this.definitionsYear = definitionsYear;
		return this;
	}

	public Optional<Max35Text> getBrokersReference() {
		return brokersReference == null ? Optional.empty() : Optional.of(brokersReference);
	}

	public GeneralInformation5 setBrokersReference(Max35Text brokersReference) {
		this.brokersReference = brokersReference;
		return this;
	}
}