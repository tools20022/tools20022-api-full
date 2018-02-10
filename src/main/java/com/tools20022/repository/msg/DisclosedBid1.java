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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.DisclosedListTrading;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
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
 * List trading by which the buy-side details the exact stocks and sizes to be
 * traded and the sell-side offers the buy-side a two-way price, to buy or to
 * sell the indicated stocks. All sell-side firms see all of the stocks and
 * quantities in the portfolio during the bidding phase regardless of whether or
 * not they win the business.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DisclosedBid1#mmSide
 * DisclosedBid1.mmSide}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisclosedBid1#mmGrossIndicator
 * DisclosedBid1.mmGrossIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#mmListIdentification
 * DisclosedBid1.mmListIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisclosedBid1#mmTradingSession
 * DisclosedBid1.mmTradingSession}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DisclosedBid1#mmBiddingAccount
 * DisclosedBid1.mmBiddingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisclosedBid1#mmSettlementDetails
 * DisclosedBid1.mmSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DisclosedListTrading
 * DisclosedListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisclosedBid1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List trading by which the buy-side details the exact stocks and sizes to be traded and the sell-side offers the buy-side a two-way price, to buy or to sell the indicated stocks. All sell-side firms see all of the stocks and quantities in the portfolio during the bidding phase regardless of whether or not they win the business."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DisclosedBid1", propOrder = {"side", "grossIndicator", "listIdentification", "tradingSession", "biddingAccount", "settlementDetails"})
public class DisclosedBid1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sd")
	protected Side1Code side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1 DisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used in request for a \"Disclosed\" bid indicates that bid is required on assumption that SideValue1 is Buy or Sell. SideValue2 can be derived by inference."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "When used in request for a \"Disclosed\" bid indicates that bid is required on assumption that SideValue1 is Buy or Sell. SideValue2 can be derived by inference.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	@XmlElement(name = "GrssInd", required = true)
	protected TrueFalseIndicator grossIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmGrossAmountIndicator
	 * ListTrading.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1 DisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 430</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmGrossAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "GrssInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "430"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossIndicator";
			definition = "Indicates whether an amount is a gross amount (including all charges, commissions and tax), or a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "ListId")
	protected Max35Text listIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListIdentification
	 * ListTrading.mmListIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1 DisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 66</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "ListId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "66"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListIdentification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, eg, account identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TradgSsn")
	protected TradingSession1 tradingSession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListTradingSession
	 * ListTrading.mmListTradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1 DisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Established constraints under which a market operates"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingSession = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListTradingSession;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "TradgSsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSession";
			definition = "Established constraints under which a market operates";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradingSession1.mmObject();
		}
	};
	@XmlElement(name = "BiddgAcct")
	protected SecuritiesAccount2 biddingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount2
	 * SecuritiesAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
	 * SecuritiesOrder.mmOrderingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1 DisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BiddgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BiddingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBiddingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderingAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "BiddgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BiddingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount2.mmObject();
		}
	};
	@XmlElement(name = "SttlmDtls")
	protected SecuritiesSettlement2 settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesSettlement2
	 * SecuritiesSettlement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisclosedBid1 DisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Parameters applied to the settlement of a security transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesSettlement2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisclosedBid1.mmSide, com.tools20022.repository.msg.DisclosedBid1.mmGrossIndicator, com.tools20022.repository.msg.DisclosedBid1.mmListIdentification,
						com.tools20022.repository.msg.DisclosedBid1.mmTradingSession, com.tools20022.repository.msg.DisclosedBid1.mmBiddingAccount, com.tools20022.repository.msg.DisclosedBid1.mmSettlementDetails);
				trace_lazy = () -> DisclosedListTrading.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DisclosedBid1";
				definition = "List trading by which the buy-side details the exact stocks and sizes to be traded and the sell-side offers the buy-side a two-way price, to buy or to sell the indicated stocks. All sell-side firms see all of the stocks and quantities in the portfolio during the bidding phase regardless of whether or not they win the business.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Side1Code> getSide() {
		return side == null ? Optional.empty() : Optional.of(side);
	}

	public DisclosedBid1 setSide(Side1Code side) {
		this.side = side;
		return this;
	}

	public TrueFalseIndicator getGrossIndicator() {
		return grossIndicator;
	}

	public DisclosedBid1 setGrossIndicator(TrueFalseIndicator grossIndicator) {
		this.grossIndicator = Objects.requireNonNull(grossIndicator);
		return this;
	}

	public Optional<Max35Text> getListIdentification() {
		return listIdentification == null ? Optional.empty() : Optional.of(listIdentification);
	}

	public DisclosedBid1 setListIdentification(Max35Text listIdentification) {
		this.listIdentification = listIdentification;
		return this;
	}

	public Optional<TradingSession1> getTradingSession() {
		return tradingSession == null ? Optional.empty() : Optional.of(tradingSession);
	}

	public DisclosedBid1 setTradingSession(com.tools20022.repository.msg.TradingSession1 tradingSession) {
		this.tradingSession = tradingSession;
		return this;
	}

	public Optional<SecuritiesAccount2> getBiddingAccount() {
		return biddingAccount == null ? Optional.empty() : Optional.of(biddingAccount);
	}

	public DisclosedBid1 setBiddingAccount(com.tools20022.repository.msg.SecuritiesAccount2 biddingAccount) {
		this.biddingAccount = biddingAccount;
		return this;
	}

	public Optional<SecuritiesSettlement2> getSettlementDetails() {
		return settlementDetails == null ? Optional.empty() : Optional.of(settlementDetails);
	}

	public DisclosedBid1 setSettlementDetails(com.tools20022.repository.msg.SecuritiesSettlement2 settlementDetails) {
		this.settlementDetails = settlementDetails;
		return this;
	}
}