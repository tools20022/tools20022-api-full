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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationCancellationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about business parties involved in the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties18#mmInvestor
 * OtherParties18.mmInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties18#mmStockExchange
 * OtherParties18.mmStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties18#mmTradeRegulator
 * OtherParties18.mmTradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties18#mmTripartyAgent
 * OtherParties18.mmTripartyAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties18#mmQualifiedForeignIntermediary
 * OtherParties18.mmQualifiedForeignIntermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationCancellationV01#mmOtherBusinessParties
 * SecuritiesTradeConfirmationCancellationV01.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmOtherBusinessParties
 * SecuritiesTradeConfirmationV01.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmOtherBusinessParties
 * SecuritiesTradeConfirmationV02.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmOtherBusinessParties
 * SecuritiesTradeConfirmationV03.mmOtherBusinessParties}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorUsageRule#forOtherParties18
 * ConstraintInvestorUsageRule.forOtherParties18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule#forOtherParties18
 * ConstraintQualifiedForeignIntermediaryRule.forOtherParties18}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OtherParties18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about business parties involved in the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OtherParties18", propOrder = {"investor", "stockExchange", "tradeRegulator", "tripartyAgent", "qualifiedForeignIntermediary"})
public class OtherParties18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Invstr")
	protected List<com.tools20022.repository.msg.PartyIdentificationAndAccount79> investor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79
	 * PartyIdentificationAndAccount79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452, FIXSynonym: 448, FIXSynonym: 447</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that identifies the underlying investor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties18.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party that identifies the underlying investor.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount79.mmObject();
		}
	};
	@XmlElement(name = "StockXchg")
	protected PartyIdentificationAndAccount87 stockExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87
	 * PartyIdentificationAndAccount87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 447, FIXSynonym: 448, FIXSynonym: 452</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that identifies the stock exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStockExchange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties18.mmObject();
			isDerived = false;
			xmlTag = "StockXchg";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "447"), new FIXSynonym(this, "448"), new FIXSynonym(this, "452"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Party that identifies the stock exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount87.mmObject();
		}
	};
	@XmlElement(name = "TradRgltr")
	protected PartyIdentificationAndAccount87 tradeRegulator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87
	 * PartyIdentificationAndAccount87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 447, FIXSynonym: 448, FIXSynonym: 452</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that identifies the trade regulator."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeRegulator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties18.mmObject();
			isDerived = false;
			xmlTag = "TradRgltr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "447"), new FIXSynonym(this, "448"), new FIXSynonym(this, "452"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulator";
			definition = "Party that identifies the trade regulator.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount87.mmObject();
		}
	};
	@XmlElement(name = "TrptyAgt")
	protected PartyIdentificationAndAccount83 tripartyAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83
	 * PartyIdentificationAndAccount83}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 447, FIXSynonym: 448, FIXSynonym: 452</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that handles tri-party transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTripartyAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties18.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "447"), new FIXSynonym(this, "448"), new FIXSynonym(this, "452"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgent";
			definition = "Party that handles tri-party transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount83.mmObject();
		}
	};
	@XmlElement(name = "QlfdFrgnIntrmy")
	protected PartyIdentificationAndAccount77 qualifiedForeignIntermediary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77
	 * PartyIdentificationAndAccount77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
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
	public static final MMMessageAttribute mmQualifiedForeignIntermediary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OtherParties18.mmObject();
			isDerived = false;
			xmlTag = "QlfdFrgnIntrmy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::QFIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediary";
			definition = "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount77.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherParties18.mmInvestor, com.tools20022.repository.msg.OtherParties18.mmStockExchange, com.tools20022.repository.msg.OtherParties18.mmTradeRegulator,
						com.tools20022.repository.msg.OtherParties18.mmTripartyAgent, com.tools20022.repository.msg.OtherParties18.mmQualifiedForeignIntermediary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationCancellationV01.mmOtherBusinessParties, SecuritiesTradeConfirmationV01.mmOtherBusinessParties,
						SecuritiesTradeConfirmationV02.mmOtherBusinessParties, SecuritiesTradeConfirmationV03.mmOtherBusinessParties);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestorUsageRule.forOtherParties18, com.tools20022.repository.constraints.ConstraintQualifiedForeignIntermediaryRule.forOtherParties18);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherParties18";
				definition = "Provides details about business parties involved in the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentificationAndAccount79> getInvestor() {
		return investor == null ? investor = new ArrayList<>() : investor;
	}

	public OtherParties18 setInvestor(List<com.tools20022.repository.msg.PartyIdentificationAndAccount79> investor) {
		this.investor = Objects.requireNonNull(investor);
		return this;
	}

	public Optional<PartyIdentificationAndAccount87> getStockExchange() {
		return stockExchange == null ? Optional.empty() : Optional.of(stockExchange);
	}

	public OtherParties18 setStockExchange(com.tools20022.repository.msg.PartyIdentificationAndAccount87 stockExchange) {
		this.stockExchange = stockExchange;
		return this;
	}

	public Optional<PartyIdentificationAndAccount87> getTradeRegulator() {
		return tradeRegulator == null ? Optional.empty() : Optional.of(tradeRegulator);
	}

	public OtherParties18 setTradeRegulator(com.tools20022.repository.msg.PartyIdentificationAndAccount87 tradeRegulator) {
		this.tradeRegulator = tradeRegulator;
		return this;
	}

	public Optional<PartyIdentificationAndAccount83> getTripartyAgent() {
		return tripartyAgent == null ? Optional.empty() : Optional.of(tripartyAgent);
	}

	public OtherParties18 setTripartyAgent(com.tools20022.repository.msg.PartyIdentificationAndAccount83 tripartyAgent) {
		this.tripartyAgent = tripartyAgent;
		return this;
	}

	public Optional<PartyIdentificationAndAccount77> getQualifiedForeignIntermediary() {
		return qualifiedForeignIntermediary == null ? Optional.empty() : Optional.of(qualifiedForeignIntermediary);
	}

	public OtherParties18 setQualifiedForeignIntermediary(com.tools20022.repository.msg.PartyIdentificationAndAccount77 qualifiedForeignIntermediary) {
		this.qualifiedForeignIntermediary = qualifiedForeignIntermediary;
		return this;
	}
}