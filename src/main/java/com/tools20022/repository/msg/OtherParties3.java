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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.choice.PartyIdentification14Choice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties3#mmInvestor
 * OtherParties3.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherParties3#mmQualifiedForeignIntermediary
 * OtherParties3.mmQualifiedForeignIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties3#mmStockExchange
 * OtherParties3.mmStockExchange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties3#mmTradeRegulator
 * OtherParties3.mmTradeRegulator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties3#mmTripartyAgent
 * OtherParties3.mmTripartyAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#mmOtherBusinessParties
 * SecuritiesSettlementTransactionAllegementNotificationV01.
 * mmOtherBusinessParties}</li>
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
 * "OtherParties3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Other parties information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OtherParties3", propOrder = {"investor", "qualifiedForeignIntermediary", "stockExchange", "tradeRegulator", "tripartyAgent"})
public class OtherParties3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification14Choice investor;
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice
	 * PartyIdentification14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties3 OtherParties3}</li>
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
	public static final MMMessageAttribute mmInvestor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties3.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification14Choice.mmObject();
		}
	};
	protected PartyIdentification10Choice qualifiedForeignIntermediary;
	/**
	 * Foreign Financial Institution which has been authorised by local
	 * authorities to act as account management institution in the country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties3 OtherParties3}</li>
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
	public static final MMMessageAttribute mmQualifiedForeignIntermediary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties3.mmObject();
			isDerived = false;
			xmlTag = "QlfdFrgnIntrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedForeignIntermediary";
			definition = "Foreign Financial Institution which has been authorised by local authorities to act as account management institution in the country.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}
	};
	protected PartyIdentification10Choice stockExchange;
	/**
	 * Identification of the stock exchange to which transaction reporting will
	 * be done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties3 OtherParties3}</li>
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
	public static final MMMessageAttribute mmStockExchange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties3.mmObject();
			isDerived = false;
			xmlTag = "StockXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			definition = "Identification of the stock exchange to which transaction reporting will be done.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}
	};
	protected PartyIdentification10Choice tradeRegulator;
	/**
	 * Institution to which a trade must be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties3 OtherParties3}</li>
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
	public static final MMMessageAttribute mmTradeRegulator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties3.mmObject();
			isDerived = false;
			xmlTag = "TradRgltr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulator";
			definition = "Institution to which a trade must be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}
	};
	protected PartyIdentification10Choice tripartyAgent;
	/**
	 * Party responsible for the administration of a tri-party collateral
	 * transaction including collateral allocation, marking to market and
	 * substitution of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OtherParties3 OtherParties3}</li>
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
	public static final MMMessageAttribute mmTripartyAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> OtherParties3.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgent";
			definition = "Party responsible for the administration of a tri-party collateral transaction including collateral allocation, marking to market and substitution of collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OtherParties3.mmInvestor, OtherParties3.mmQualifiedForeignIntermediary, OtherParties3.mmStockExchange, OtherParties3.mmTradeRegulator, OtherParties3.mmTripartyAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAllegementNotificationV01.mmOtherBusinessParties);
				trace_lazy = () -> Role.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OtherParties3";
				definition = "Other parties information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Invstr")
	public PartyIdentification14Choice getInvestor() {
		return investor;
	}

	public void setInvestor(PartyIdentification14Choice investor) {
		this.investor = investor;
	}

	@XmlElement(name = "QlfdFrgnIntrmy")
	public PartyIdentification10Choice getQualifiedForeignIntermediary() {
		return qualifiedForeignIntermediary;
	}

	public void setQualifiedForeignIntermediary(PartyIdentification10Choice qualifiedForeignIntermediary) {
		this.qualifiedForeignIntermediary = qualifiedForeignIntermediary;
	}

	@XmlElement(name = "StockXchg")
	public PartyIdentification10Choice getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(PartyIdentification10Choice stockExchange) {
		this.stockExchange = stockExchange;
	}

	@XmlElement(name = "TradRgltr")
	public PartyIdentification10Choice getTradeRegulator() {
		return tradeRegulator;
	}

	public void setTradeRegulator(PartyIdentification10Choice tradeRegulator) {
		this.tradeRegulator = tradeRegulator;
	}

	@XmlElement(name = "TrptyAgt")
	public PartyIdentification10Choice getTripartyAgent() {
		return tripartyAgent;
	}

	public void setTripartyAgent(PartyIdentification10Choice tripartyAgent) {
		this.tripartyAgent = tripartyAgent;
	}
}