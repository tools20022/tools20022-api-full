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
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.Trading1MethodCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.MasterAgreement;
import com.tools20022.repository.entity.TreasuryTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class GeneralInformation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator blockIndicator;
	/**
	 * Indicates whether the trade is a block or single trade.
	 * <p>
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
	public static final MMMessageAttribute mmBlockIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmBlockIndicator;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BlckInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmBlockIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text relatedTradeReference;
	/**
	 * Reference to a preceding transaction, for example, an option or swap.
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
	public static final MMMessageAttribute mmRelatedTradeReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "RltdTradRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTradeReference";
			definition = "Reference to a preceding transaction, for example, an option or swap.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmRelatedTradeReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Trading1MethodCode dealingMethod;
	/**
	 * Method used by the trading parties to negotiate and/or execute a deal.
	 * <p>
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
	 * "Method used by the trading parties to negotiate and/or execute a deal. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmDealingMethod
	 * GeneralInformation4.mmDealingMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealingMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Negotiation.mmTradingMethod;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DealgMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingMethod";
			definition = "Method used by the trading parties to negotiate and/or execute a deal. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmDealingMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Trading1MethodCode.mmObject();
		}
	};
	protected PartyIdentification73Choice brokerIdentification;
	/**
	 * Specifies the broker which arranged the deal between the trading side and
	 * the counterparty side or, when two money brokers are involved, between
	 * the trading side and the other money broker.
	 * <p>
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
	public static final MMMessageAssociationEnd mmBrokerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BrkrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerIdentification";
			definition = "Specifies the broker which arranged the deal between the trading side and the counterparty side or, when two money brokers are involved, between the trading side and the other money broker.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmBrokerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected Max35Text counterpartyReference;
	/**
	 * Counterparty's reference for the trade.
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
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Counterparty's reference for the trade.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmCounterpartyReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount brokersCommission;
	/**
	 * Brokerage fee for a broker confirmation.
	 * <p>
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
	public static final MMMessageAttribute mmBrokersCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Commission.mmCommissionAmount;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BrkrsComssn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokersCommission";
			definition = "Brokerage fee for a broker confirmation.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmBrokersCommission;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Max210Text senderToReceiverInformation;
	/**
	 * Specifies additional information for the receiver and applies to the
	 * whole message.
	 * <p>
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
	public static final MMMessageAttribute mmSenderToReceiverInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "SndrToRcvrInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderToReceiverInformation";
			definition = "Specifies additional information for the receiver and applies to the whole message.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmSenderToReceiverInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};
	protected PartyIdentification73Choice dealingBranchTradingSide;
	/**
	 * Specifies the branch at the trading side with which the deal was done.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDealingBranchTradingSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DealgBrnchTradgSd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingBranchTradingSide";
			definition = "Specifies the branch at the trading side with which the deal was done.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmDealingBranchTradingSide;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected PartyIdentification73Choice dealingBranchCounterpartySide;
	/**
	 * Specifies the branch at the counterparty side with which the deal was
	 * done.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDealingBranchCounterpartySide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DealgBrnchCtrPtySd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingBranchCounterpartySide";
			definition = "Specifies the branch at the counterparty side with which the deal was done.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmDealingBranchCounterpartySide;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected ContactInformation1 contactInformation;
	/**
	 * Specifies the name and/or electronic address of the receiver of the
	 * message who may be contacted for any queries concerning this trade.
	 * <p>
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
	public static final MMMessageAssociationEnd mmContactInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmContactPoint;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "CtctInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactInformation";
			definition = "Specifies the name and/or electronic address of the receiver of the message who may be contacted for any queries concerning this trade.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.GeneralInformation4.mmContactInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactInformation1.mmObject();
		}
	};
	protected AgreementConditions1 agreementDetails;
	/**
	 * Specifies the type, date and version of the agreement used in a trade.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAgreementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MasterAgreement.mmObject();
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "AgrmtDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementDetails";
			definition = "Specifies the type, date and version of the agreement used in a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AgreementConditions1.mmObject();
		}
	};
	protected ISOYear definitionsYear;
	/**
	 * Specifies the year of definitions of the agreement.
	 * <p>
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
	public static final MMMessageAttribute mmDefinitionsYear = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.mmDateSigned;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "DefsYr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinitionsYear";
			definition = "Specifies the year of definitions of the agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYear.mmObject();
		}
	};
	protected Max35Text brokersReference;
	/**
	 * Specifies a reference applied to the trade instruction by a broker.
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
	public static final MMMessageAttribute mmBrokersReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> GeneralInformation5.mmObject();
			isDerived = false;
			xmlTag = "BrkrsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokersReference";
			definition = "Specifies a reference applied to the trade instruction by a broker.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04.mmOptionalGeneralInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmOptionalGeneralInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04.mmOptionalGeneralInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmGeneralInformation);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GeneralInformation5";
				definition = "Information concerning the negotiation process leading to a treasury trade.";
				previousVersion_lazy = () -> GeneralInformation4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getBlockIndicator() {
		return blockIndicator;
	}

	public void setBlockIndicator(YesNoIndicator blockIndicator) {
		this.blockIndicator = blockIndicator;
	}

	public Max35Text getRelatedTradeReference() {
		return relatedTradeReference;
	}

	public void setRelatedTradeReference(Max35Text relatedTradeReference) {
		this.relatedTradeReference = relatedTradeReference;
	}

	public Trading1MethodCode getDealingMethod() {
		return dealingMethod;
	}

	public void setDealingMethod(Trading1MethodCode dealingMethod) {
		this.dealingMethod = dealingMethod;
	}

	public PartyIdentification73Choice getBrokerIdentification() {
		return brokerIdentification;
	}

	public void setBrokerIdentification(PartyIdentification73Choice brokerIdentification) {
		this.brokerIdentification = brokerIdentification;
	}

	public Max35Text getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(Max35Text counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}

	public ActiveCurrencyAndAmount getBrokersCommission() {
		return brokersCommission;
	}

	public void setBrokersCommission(ActiveCurrencyAndAmount brokersCommission) {
		this.brokersCommission = brokersCommission;
	}

	public Max210Text getSenderToReceiverInformation() {
		return senderToReceiverInformation;
	}

	public void setSenderToReceiverInformation(Max210Text senderToReceiverInformation) {
		this.senderToReceiverInformation = senderToReceiverInformation;
	}

	public PartyIdentification73Choice getDealingBranchTradingSide() {
		return dealingBranchTradingSide;
	}

	public void setDealingBranchTradingSide(PartyIdentification73Choice dealingBranchTradingSide) {
		this.dealingBranchTradingSide = dealingBranchTradingSide;
	}

	public PartyIdentification73Choice getDealingBranchCounterpartySide() {
		return dealingBranchCounterpartySide;
	}

	public void setDealingBranchCounterpartySide(PartyIdentification73Choice dealingBranchCounterpartySide) {
		this.dealingBranchCounterpartySide = dealingBranchCounterpartySide;
	}

	public ContactInformation1 getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(com.tools20022.repository.msg.ContactInformation1 contactInformation) {
		this.contactInformation = contactInformation;
	}

	public AgreementConditions1 getAgreementDetails() {
		return agreementDetails;
	}

	public void setAgreementDetails(com.tools20022.repository.msg.AgreementConditions1 agreementDetails) {
		this.agreementDetails = agreementDetails;
	}

	public ISOYear getDefinitionsYear() {
		return definitionsYear;
	}

	public void setDefinitionsYear(ISOYear definitionsYear) {
		this.definitionsYear = definitionsYear;
	}

	public Max35Text getBrokersReference() {
		return brokersReference;
	}

	public void setBrokersReference(Max35Text brokersReference) {
		this.brokersReference = brokersReference;
	}
}