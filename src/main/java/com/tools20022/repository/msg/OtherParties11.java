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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04;
import com.tools20022.repository.choice.PartyIdentification37Choice;
import com.tools20022.repository.choice.PartyIdentification43Choice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties11#mmInvestor
 * OtherParties11.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties11#mmQualifiedForeignIntermediary
 * OtherParties11.mmQualifiedForeignIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties11#mmStockExchange
 * OtherParties11.mmStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties11#mmTradeRegulator
 * OtherParties11.mmTradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties11#mmTripartyAgent
 * OtherParties11.mmTripartyAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02#mmOtherBusinessParties
 * SecuritiesSettlementTransactionAllegementNotificationV02.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03#mmOtherBusinessParties
 * SecuritiesSettlementTransactionAllegementNotificationV03.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04#mmOtherBusinessParties
 * SecuritiesSettlementTransactionAllegementNotificationV04.
 * mmOtherBusinessParties}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties11
 * ConstraintInvestorCountryCodeRule.forOtherParties11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherParties11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Other parties information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties28 OtherParties28}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherParties11", propOrder = {"investor", "qualifiedForeignIntermediary", "stockExchange", "tradeRegulator", "tripartyAgent"})
public class OtherParties11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Invstr")
	protected PartyIdentification37Choice investor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice
	 * PartyIdentification37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties11 OtherParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::INVE</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherParties28#mmInvestor
	 * OtherParties28.mmInvestor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties11.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::INVE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			nextVersions_lazy = () -> Arrays.asList(OtherParties28.mmInvestor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification37Choice.mmObject();
		}
	};
	@XmlElement(name = "QlfdFrgnIntrmy")
	protected PartyIdentification43Choice qualifiedForeignIntermediary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties11 OtherParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QlfdFrgnIntrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::QFIN</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmQualifiedForeignIntermediary
	 * OtherParties28.mmQualifiedForeignIntermediary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQualifiedForeignIntermediary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties11.mmObject();
			isDerived = false;
			xmlTag = "QlfdFrgnIntrmy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::QFIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediary";
			definition = "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country.";
			nextVersions_lazy = () -> Arrays.asList(OtherParties28.mmQualifiedForeignIntermediary);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43Choice.mmObject();
		}
	};
	@XmlElement(name = "StockXchg")
	protected PartyIdentification43Choice stockExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties11 OtherParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::EXCH</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmStockExchange
	 * OtherParties28.mmStockExchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStockExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties11.mmObject();
			isDerived = false;
			xmlTag = "StockXchg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Identification of the stock exchange to which transaction reporting will be done.";
			nextVersions_lazy = () -> Arrays.asList(OtherParties28.mmStockExchange);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43Choice.mmObject();
		}
	};
	@XmlElement(name = "TradRgltr")
	protected PartyIdentification43Choice tradeRegulator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties11 OtherParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::TRRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Institution to which a trade must be reported."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmTradeRegulator
	 * OtherParties28.mmTradeRegulator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeRegulator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties11.mmObject();
			isDerived = false;
			xmlTag = "TradRgltr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::TRRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulator";
			definition = "Institution to which a trade must be reported.";
			nextVersions_lazy = () -> Arrays.asList(OtherParties28.mmTradeRegulator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43Choice.mmObject();
		}
	};
	@XmlElement(name = "TrptyAgt")
	protected PartyIdentification43Choice tripartyAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
	 * PartyIdentification43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties11 OtherParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::TRAG</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherParties28#mmTripartyAgent
	 * OtherParties28.mmTripartyAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTripartyAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties11.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::TRAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgent";
			definition = "Party responsible for the administration of a tri-party collateral transaction including collateral allocation, marking to market and substitution of collateral.";
			nextVersions_lazy = () -> Arrays.asList(OtherParties28.mmTripartyAgent);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherParties11.mmInvestor, com.tools20022.repository.msg.OtherParties11.mmQualifiedForeignIntermediary,
						com.tools20022.repository.msg.OtherParties11.mmStockExchange, com.tools20022.repository.msg.OtherParties11.mmTradeRegulator, com.tools20022.repository.msg.OtherParties11.mmTripartyAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAllegementNotificationV02.mmOtherBusinessParties, SecuritiesSettlementTransactionAllegementNotificationV03.mmOtherBusinessParties,
						SecuritiesSettlementTransactionAllegementNotificationV04.mmOtherBusinessParties);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties11);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherParties11";
				definition = "Other parties information.";
				nextVersions_lazy = () -> Arrays.asList(OtherParties28.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification37Choice> getInvestor() {
		return investor == null ? Optional.empty() : Optional.of(investor);
	}

	public OtherParties11 setInvestor(PartyIdentification37Choice investor) {
		this.investor = investor;
		return this;
	}

	public Optional<PartyIdentification43Choice> getQualifiedForeignIntermediary() {
		return qualifiedForeignIntermediary == null ? Optional.empty() : Optional.of(qualifiedForeignIntermediary);
	}

	public OtherParties11 setQualifiedForeignIntermediary(PartyIdentification43Choice qualifiedForeignIntermediary) {
		this.qualifiedForeignIntermediary = qualifiedForeignIntermediary;
		return this;
	}

	public Optional<PartyIdentification43Choice> getStockExchange() {
		return stockExchange == null ? Optional.empty() : Optional.of(stockExchange);
	}

	public OtherParties11 setStockExchange(PartyIdentification43Choice stockExchange) {
		this.stockExchange = stockExchange;
		return this;
	}

	public Optional<PartyIdentification43Choice> getTradeRegulator() {
		return tradeRegulator == null ? Optional.empty() : Optional.of(tradeRegulator);
	}

	public OtherParties11 setTradeRegulator(PartyIdentification43Choice tradeRegulator) {
		this.tradeRegulator = tradeRegulator;
		return this;
	}

	public Optional<PartyIdentification43Choice> getTripartyAgent() {
		return tripartyAgent == null ? Optional.empty() : Optional.of(tripartyAgent);
	}

	public OtherParties11 setTripartyAgent(PartyIdentification43Choice tripartyAgent) {
		this.tripartyAgent = tripartyAgent;
		return this;
	}
}