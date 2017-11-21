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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Other parties information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties29#mmInvestor
 * OtherParties29.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties29#mmQualifiedForeignIntermediary
 * OtherParties29.mmQualifiedForeignIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties29#mmStockExchange
 * OtherParties29.mmStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties29#mmTradeRegulator
 * OtherParties29.mmTradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties29#mmTripartyAgent
 * OtherParties29.mmTripartyAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties29#mmBroker
 * OtherParties29.mmBroker}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05#mmOtherBusinessParties
 * SecuritiesSettlementTransactionReversalAdvice002V05.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionConfirmation002V06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionGenerationNotification002V06.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionInstruction002V06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmOtherBusinessParties
 * SecuritiesFinancingInstruction002V06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06#mmOtherBusinessParties
 * SecuritiesFinancingConfirmation002V06.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionInstruction002V07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmOtherBusinessParties
 * SecuritiesFinancingConfirmation002V07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07#mmOtherBusinessParties
 * SecuritiesFinancingInstruction002V07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionGenerationNotification002V07.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionConfirmation002V07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06#mmOtherBusinessParties
 * SecuritiesSettlementTransactionReversalAdvice002V06.mmOtherBusinessParties}</li>
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
 * "OtherParties29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Other parties information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OtherParties29", propOrder = {"investor", "qualifiedForeignIntermediary", "stockExchange", "tradeRegulator", "tripartyAgent", "broker"})
public class OtherParties29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.PartyIdentificationAndAccount135> investor;
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135
	 * PartyIdentificationAndAccount135}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, either an individual or organisation, whose assets are being invested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties29.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount135.mmObject();
		}
	};
	protected PartyIdentificationAndAccount136 qualifiedForeignIntermediary;
	/**
	 * Foreign Financial Institution which has been authorised by local
	 * authorities to act as account management institution in the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136
	 * PartyIdentificationAndAccount136}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QlfdFrgnIntrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedForeignIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQualifiedForeignIntermediary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties29.mmObject();
			isDerived = false;
			xmlTag = "QlfdFrgnIntrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediary";
			definition = "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount136.mmObject();
		}
	};
	protected PartyIdentificationAndAccount137 stockExchange;
	/**
	 * Identification of the stock exchange to which transaction reporting will
	 * be done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount137
	 * PartyIdentificationAndAccount137}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the stock exchange to which transaction reporting will be done."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStockExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties29.mmObject();
			isDerived = false;
			xmlTag = "StockXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Identification of the stock exchange to which transaction reporting will be done.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount137.mmObject();
		}
	};
	protected PartyIdentificationAndAccount137 tradeRegulator;
	/**
	 * Institution to which a trade must be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount137
	 * PartyIdentificationAndAccount137}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Institution to which a trade must be reported."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeRegulator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties29.mmObject();
			isDerived = false;
			xmlTag = "TradRgltr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulator";
			definition = "Institution to which a trade must be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount137.mmObject();
		}
	};
	protected PartyIdentificationAndAccount136 tripartyAgent;
	/**
	 * Party responsible for the administration of a tri-party collateral
	 * transaction including collateral allocation, marking to market and
	 * substitution of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136
	 * PartyIdentificationAndAccount136}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party responsible for the administration of a tri-party collateral transaction including collateral allocation, marking to market and substitution of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTripartyAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties29.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgent";
			definition = "Party responsible for the administration of a tri-party collateral transaction including collateral allocation, marking to market and substitution of collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount136.mmObject();
		}
	};
	protected PartyIdentificationAndAccount136 broker;
	/**
	 * Party that identifies a broker when required (for example, authorised
	 * broker, prime broker, etc).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136
	 * PartyIdentificationAndAccount136}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that identifies a broker when required (for example, authorised broker, prime broker, etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBroker = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties29.mmObject();
			isDerived = false;
			xmlTag = "Brkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Party that identifies a broker when required (for example, authorised broker, prime broker, etc).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount136.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OtherParties29.mmInvestor, OtherParties29.mmQualifiedForeignIntermediary, OtherParties29.mmStockExchange, OtherParties29.mmTradeRegulator, OtherParties29.mmTripartyAgent,
						OtherParties29.mmBroker);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdvice002V05.mmOtherBusinessParties, SecuritiesSettlementTransactionConfirmation002V06.mmOtherBusinessParties,
						SecuritiesSettlementTransactionGenerationNotification002V06.mmOtherBusinessParties, SecuritiesSettlementTransactionInstruction002V06.mmOtherBusinessParties,
						SecuritiesFinancingInstruction002V06.mmOtherBusinessParties, SecuritiesFinancingConfirmation002V06.mmOtherBusinessParties, SecuritiesSettlementTransactionInstruction002V07.mmOtherBusinessParties,
						SecuritiesFinancingConfirmation002V07.mmOtherBusinessParties, SecuritiesFinancingInstruction002V07.mmOtherBusinessParties, SecuritiesSettlementTransactionGenerationNotification002V07.mmOtherBusinessParties,
						SecuritiesSettlementTransactionConfirmation002V07.mmOtherBusinessParties, SecuritiesSettlementTransactionReversalAdvice002V06.mmOtherBusinessParties);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherParties29";
				definition = "Other parties information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Invstr")
	public List<PartyIdentificationAndAccount135> getInvestor() {
		return investor;
	}

	public void setInvestor(List<com.tools20022.repository.msg.PartyIdentificationAndAccount135> investor) {
		this.investor = investor;
	}

	@XmlElement(name = "QlfdFrgnIntrmy")
	public PartyIdentificationAndAccount136 getQualifiedForeignIntermediary() {
		return qualifiedForeignIntermediary;
	}

	public void setQualifiedForeignIntermediary(com.tools20022.repository.msg.PartyIdentificationAndAccount136 qualifiedForeignIntermediary) {
		this.qualifiedForeignIntermediary = qualifiedForeignIntermediary;
	}

	@XmlElement(name = "StockXchg")
	public PartyIdentificationAndAccount137 getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(com.tools20022.repository.msg.PartyIdentificationAndAccount137 stockExchange) {
		this.stockExchange = stockExchange;
	}

	@XmlElement(name = "TradRgltr")
	public PartyIdentificationAndAccount137 getTradeRegulator() {
		return tradeRegulator;
	}

	public void setTradeRegulator(com.tools20022.repository.msg.PartyIdentificationAndAccount137 tradeRegulator) {
		this.tradeRegulator = tradeRegulator;
	}

	@XmlElement(name = "TrptyAgt")
	public PartyIdentificationAndAccount136 getTripartyAgent() {
		return tripartyAgent;
	}

	public void setTripartyAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount136 tripartyAgent) {
		this.tripartyAgent = tripartyAgent;
	}

	@XmlElement(name = "Brkr")
	public PartyIdentificationAndAccount136 getBroker() {
		return broker;
	}

	public void setBroker(com.tools20022.repository.msg.PartyIdentificationAndAccount136 broker) {
		this.broker = broker;
	}
}