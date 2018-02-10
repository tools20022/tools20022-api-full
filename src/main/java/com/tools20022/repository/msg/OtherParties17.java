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
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
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
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties17#mmInvestor
 * OtherParties17.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties17#mmQualifiedForeignIntermediary
 * OtherParties17.mmQualifiedForeignIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties17#mmStockExchange
 * OtherParties17.mmStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties17#mmTradeRegulator
 * OtherParties17.mmTradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties17#mmTripartyAgent
 * OtherParties17.mmTripartyAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties17#mmBroker
 * OtherParties17.mmBroker}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule#forOtherParties17
 * ConstraintInvestorCountryCodeRule.forOtherParties17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule#forOtherParties17
 * ConstraintQualifiedForeignIntermediaryRule.forOtherParties17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule#forOtherParties17
 * ConstraintCoexistencePartyProprietaryIdentificationRule.forOtherParties17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherParties17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Other parties information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherParties17", propOrder = {"investor", "qualifiedForeignIntermediary", "stockExchange", "tradeRegulator", "tripartyAgent", "broker"})
public class OtherParties17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Invstr")
	protected List<com.tools20022.repository.msg.PartyIdentificationAndAccount73> investor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73
	 * PartyIdentificationAndAccount73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties17.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::INVE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount73.mmObject();
		}
	};
	@XmlElement(name = "QlfdFrgnIntrmy")
	protected PartyIdentificationAndAccount74 qualifiedForeignIntermediary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74
	 * PartyIdentificationAndAccount74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQualifiedForeignIntermediary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties17.mmObject();
			isDerived = false;
			xmlTag = "QlfdFrgnIntrmy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::QFIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediary";
			definition = "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount74.mmObject();
		}
	};
	@XmlElement(name = "StockXchg")
	protected PartyIdentificationAndAccount74 stockExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74
	 * PartyIdentificationAndAccount74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStockExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties17.mmObject();
			isDerived = false;
			xmlTag = "StockXchg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Identification of the stock exchange to which transaction reporting will be done.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount74.mmObject();
		}
	};
	@XmlElement(name = "TradRgltr")
	protected PartyIdentificationAndAccount74 tradeRegulator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74
	 * PartyIdentificationAndAccount74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeRegulator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties17.mmObject();
			isDerived = false;
			xmlTag = "TradRgltr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::TRRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulator";
			definition = "Institution to which a trade must be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount74.mmObject();
		}
	};
	@XmlElement(name = "TrptyAgt")
	protected PartyIdentificationAndAccount74 tripartyAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74
	 * PartyIdentificationAndAccount74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTripartyAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties17.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::TRAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgent";
			definition = "Party responsible for the administration of a tri-party collateral transaction including collateral allocation, marking to market and substitution of collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount74.mmObject();
		}
	};
	@XmlElement(name = "Brkr")
	protected PartyIdentificationAndAccount67 broker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67
	 * PartyIdentificationAndAccount67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties17.mmObject();
			isDerived = false;
			xmlTag = "Brkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Party that identifies a broker when required (for example, authorised broker, prime broker, etc).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount67.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherParties17.mmInvestor, com.tools20022.repository.msg.OtherParties17.mmQualifiedForeignIntermediary,
						com.tools20022.repository.msg.OtherParties17.mmStockExchange, com.tools20022.repository.msg.OtherParties17.mmTradeRegulator, com.tools20022.repository.msg.OtherParties17.mmTripartyAgent,
						com.tools20022.repository.msg.OtherParties17.mmBroker);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorCountryCodeRule.forOtherParties17,
						com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule.forOtherParties17, com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule.forOtherParties17);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OtherParties17";
				definition = "Other parties information.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentificationAndAccount73> getInvestor() {
		return investor == null ? investor = new ArrayList<>() : investor;
	}

	public OtherParties17 setInvestor(List<com.tools20022.repository.msg.PartyIdentificationAndAccount73> investor) {
		this.investor = Objects.requireNonNull(investor);
		return this;
	}

	public Optional<PartyIdentificationAndAccount74> getQualifiedForeignIntermediary() {
		return qualifiedForeignIntermediary == null ? Optional.empty() : Optional.of(qualifiedForeignIntermediary);
	}

	public OtherParties17 setQualifiedForeignIntermediary(com.tools20022.repository.msg.PartyIdentificationAndAccount74 qualifiedForeignIntermediary) {
		this.qualifiedForeignIntermediary = qualifiedForeignIntermediary;
		return this;
	}

	public Optional<PartyIdentificationAndAccount74> getStockExchange() {
		return stockExchange == null ? Optional.empty() : Optional.of(stockExchange);
	}

	public OtherParties17 setStockExchange(com.tools20022.repository.msg.PartyIdentificationAndAccount74 stockExchange) {
		this.stockExchange = stockExchange;
		return this;
	}

	public Optional<PartyIdentificationAndAccount74> getTradeRegulator() {
		return tradeRegulator == null ? Optional.empty() : Optional.of(tradeRegulator);
	}

	public OtherParties17 setTradeRegulator(com.tools20022.repository.msg.PartyIdentificationAndAccount74 tradeRegulator) {
		this.tradeRegulator = tradeRegulator;
		return this;
	}

	public Optional<PartyIdentificationAndAccount74> getTripartyAgent() {
		return tripartyAgent == null ? Optional.empty() : Optional.of(tripartyAgent);
	}

	public OtherParties17 setTripartyAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount74 tripartyAgent) {
		this.tripartyAgent = tripartyAgent;
		return this;
	}

	public Optional<PartyIdentificationAndAccount67> getBroker() {
		return broker == null ? Optional.empty() : Optional.of(broker);
	}

	public OtherParties17 setBroker(com.tools20022.repository.msg.PartyIdentificationAndAccount67 broker) {
		this.broker = broker;
		return this;
	}
}