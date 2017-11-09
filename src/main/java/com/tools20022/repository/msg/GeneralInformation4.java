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
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.Trading1MethodCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBlockIndicator
 * GeneralInformation4.mmBlockIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmRelatedTradeReference
 * GeneralInformation4.mmRelatedTradeReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmDealingMethod
 * GeneralInformation4.mmDealingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBrokerIdentification
 * GeneralInformation4.mmBrokerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmCounterpartyReference
 * GeneralInformation4.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBrokersCommission
 * GeneralInformation4.mmBrokersCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmSenderToReceiverInformation
 * GeneralInformation4.mmSenderToReceiverInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmDealingBranchTradingSide
 * GeneralInformation4.mmDealingBranchTradingSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmDealingBranchCounterpartySide
 * GeneralInformation4.mmDealingBranchCounterpartySide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmContactInformation
 * GeneralInformation4.mmContactInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionAmendmentV02.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionCancellationV02.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmOptionalGeneralInformation
 * ForeignExchangeTradeInstructionV02.mmOptionalGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmGeneralInformation
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmGeneralInformation}</li>
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
 * "GeneralInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information concerning the negotiation process leading to a treasury trade."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralInformation5
 * GeneralInformation5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.GeneralInformation1
 * GeneralInformation1}</li>
 * </ul>
 */
public class GeneralInformation4 {

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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBlockIndicator
	 * GeneralInformation5.mmBlockIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmBlockIndicator;
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "BlckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockIndicator";
			definition = "Indicates whether the trade is a block or single trade.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmBlockIndicator);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmRelatedTradeReference
	 * GeneralInformation5.mmRelatedTradeReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedTradeReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "RltdTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTradeReference";
			definition = "Reference to a preceding transaction, for example, an option or swap.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmRelatedTradeReference);
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDealingMethod
	 * GeneralInformation5.mmDealingMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealingMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Negotiation.mmTradingMethod;
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "DealgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingMethod";
			definition = "Method used by the trading parties to negotiate and/or execute a deal. ";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmDealingMethod);
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBrokerIdentification
	 * GeneralInformation5.mmBrokerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBrokerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "BrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerIdentification";
			definition = "Specifies the broker which arranged the deal between the trading side and the counterparty side or, when two money brokers are involved, between the trading side and the other money broker.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmBrokerIdentification);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmCounterpartyReference
	 * GeneralInformation5.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Counterparty's reference for the trade.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmCounterpartyReference);
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBrokersCommission
	 * GeneralInformation5.mmBrokersCommission}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBrokersCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionAmount;
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "BrkrsComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokersCommission";
			definition = "Brokerage fee for a broker confirmation.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmBrokersCommission);
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmSenderToReceiverInformation
	 * GeneralInformation5.mmSenderToReceiverInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderToReceiverInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "SndrToRcvrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderToReceiverInformation";
			definition = "Specifies additional information for the receiver and applies to the whole message.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmSenderToReceiverInformation);
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDealingBranchTradingSide
	 * GeneralInformation5.mmDealingBranchTradingSide}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealingBranchTradingSide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "DealgBrnchTradgSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingBranchTradingSide";
			definition = "Specifies the branch at the trading side with which the deal was done.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmDealingBranchTradingSide);
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmDealingBranchCounterpartySide
	 * GeneralInformation5.mmDealingBranchCounterpartySide}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealingBranchCounterpartySide = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "DealgBrnchCtrPtySd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingBranchCounterpartySide";
			definition = "Specifies the branch at the counterparty side with which the deal was done.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmDealingBranchCounterpartySide);
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
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4
	 * GeneralInformation4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmContactInformation
	 * GeneralInformation5.mmContactInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContactInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> GeneralInformation4.mmObject();
			isDerived = false;
			xmlTag = "CtctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactInformation";
			definition = "Specifies the name and/or electronic address of the receiver of the message who may be contacted for any queries concerning this trade.";
			nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmContactInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GeneralInformation4.mmBlockIndicator, GeneralInformation4.mmRelatedTradeReference, GeneralInformation4.mmDealingMethod, GeneralInformation4.mmBrokerIdentification,
						GeneralInformation4.mmCounterpartyReference, GeneralInformation4.mmBrokersCommission, GeneralInformation4.mmSenderToReceiverInformation, GeneralInformation4.mmDealingBranchTradingSide,
						GeneralInformation4.mmDealingBranchCounterpartySide, GeneralInformation4.mmContactInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionAmendmentV02.mmOptionalGeneralInformation, ForeignExchangeTradeInstructionCancellationV02.mmOptionalGeneralInformation,
						ForeignExchangeTradeInstructionV02.mmOptionalGeneralInformation, ForeignExchangeTradeStatusAndDetailsNotificationV02.mmGeneralInformation);
				trace_lazy = () -> TreasuryTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeneralInformation4";
				definition = "Information concerning the negotiation process leading to a treasury trade.";
				nextVersions_lazy = () -> Arrays.asList(GeneralInformation5.mmObject());
				previousVersion_lazy = () -> GeneralInformation1.mmObject();
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
}