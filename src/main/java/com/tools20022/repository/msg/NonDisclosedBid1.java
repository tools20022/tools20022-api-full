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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max128Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.NonDisclosedListTrading;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * List trading by which the buy-side provides details to the sell-side
 * information about the sector, country, index and potential market impact of
 * the financial instrument to be bought or sold. Using this information, the
 * sell-side firms bid for the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmBidByCurrency
 * NonDisclosedBid1.mmBidByCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmBidBySector
 * NonDisclosedBid1.mmBidBySector}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmBidByIndex
 * NonDisclosedBid1.mmBidByIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmSideIndicator
 * NonDisclosedBid1.mmSideIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmLiquidity
 * NonDisclosedBid1.mmLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmExchangeForPhysicalTrade
 * NonDisclosedBid1.mmExchangeForPhysicalTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
 * NonDisclosedListTrading}</li>
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
 * "NonDisclosedBid1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonDisclosedBid1", propOrder = {"bidByCurrency", "bidBySector", "bidByIndex", "sideIndicator", "liquidity", "exchangeForPhysicalTrade"})
public class NonDisclosedBid1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BidByCcy")
	protected CountryCode bidByCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidByCurrency
	 * NonDisclosedListTrading.mmBidByCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidByCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 399, FIXSynonym: 400</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidByCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmBidByCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "BidByCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "399"), new FIXSynonym(this, "400"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidByCurrency";
			definition = "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "BidBySctr")
	protected Max128Text bidBySector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidBySector
	 * NonDisclosedListTrading.mmBidBySector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidBySctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 400, FIXSynonym: 399</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidBySector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidBySector = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmBidBySector;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "BidBySctr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "400"), new FIXSynonym(this, "399"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidBySector";
			definition = "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	@XmlElement(name = "BidByIndx")
	protected Max128Text bidByIndex;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidByIndex
	 * NonDisclosedListTrading.mmBidByIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidByIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 399, FIXSynonym: 400</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the index) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidByIndex = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmBidByIndex;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "BidByIndx";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "399"), new FIXSynonym(this, "400"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidByIndex";
			definition = "Identifies a type of bid based on a common characteristic (the index) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	@XmlElement(name = "SdInd")
	protected TrueFalseIndicator sideIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 401</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the side of the bid in the case of a non disclosed bidding process. Used instead of buy and sell side.\nTrue = Side 1\nFalse = Side 2"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSideIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "SdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "401"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideIndicator";
			definition = "Indicates the side of the bid in the case of a non disclosed bidding process. Used instead of buy and sell side.\nTrue = Side 1\nFalse = Side 2";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "Lqdty")
	protected Liquidity1 liquidity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Liquidity1 Liquidity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmLiquidity
	 * ListTrading.mmLiquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lqdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additionnal details about the liquidity of a financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiquidity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmLiquidity;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "Lqdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			definition = "Provides additionnal details about the liquidity of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Liquidity1.mmObject();
		}
	};
	@XmlElement(name = "XchgForPhysTrad")
	protected ExchangeForPhysicalTradeParameters1 exchangeForPhysicalTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1
	 * ExchangeForPhysicalTradeParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExchangeForPhysicalTrade
	 * SecuritiesOrder.mmExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1
	 * NonDisclosedBid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgForPhysTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details about the exchange for physical trade parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExchangeForPhysicalTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmExchangeForPhysicalTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDisclosedBid1.mmObject();
			isDerived = false;
			xmlTag = "XchgForPhysTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalTrade";
			definition = "Details about the exchange for physical trade parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDisclosedBid1.mmBidByCurrency, com.tools20022.repository.msg.NonDisclosedBid1.mmBidBySector,
						com.tools20022.repository.msg.NonDisclosedBid1.mmBidByIndex, com.tools20022.repository.msg.NonDisclosedBid1.mmSideIndicator, com.tools20022.repository.msg.NonDisclosedBid1.mmLiquidity,
						com.tools20022.repository.msg.NonDisclosedBid1.mmExchangeForPhysicalTrade);
				trace_lazy = () -> NonDisclosedListTrading.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonDisclosedBid1";
				definition = "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CountryCode> getBidByCurrency() {
		return bidByCurrency == null ? Optional.empty() : Optional.of(bidByCurrency);
	}

	public NonDisclosedBid1 setBidByCurrency(CountryCode bidByCurrency) {
		this.bidByCurrency = bidByCurrency;
		return this;
	}

	public Optional<Max128Text> getBidBySector() {
		return bidBySector == null ? Optional.empty() : Optional.of(bidBySector);
	}

	public NonDisclosedBid1 setBidBySector(Max128Text bidBySector) {
		this.bidBySector = bidBySector;
		return this;
	}

	public Optional<Max128Text> getBidByIndex() {
		return bidByIndex == null ? Optional.empty() : Optional.of(bidByIndex);
	}

	public NonDisclosedBid1 setBidByIndex(Max128Text bidByIndex) {
		this.bidByIndex = bidByIndex;
		return this;
	}

	public Optional<TrueFalseIndicator> getSideIndicator() {
		return sideIndicator == null ? Optional.empty() : Optional.of(sideIndicator);
	}

	public NonDisclosedBid1 setSideIndicator(TrueFalseIndicator sideIndicator) {
		this.sideIndicator = sideIndicator;
		return this;
	}

	public Optional<Liquidity1> getLiquidity() {
		return liquidity == null ? Optional.empty() : Optional.of(liquidity);
	}

	public NonDisclosedBid1 setLiquidity(com.tools20022.repository.msg.Liquidity1 liquidity) {
		this.liquidity = liquidity;
		return this;
	}

	public Optional<ExchangeForPhysicalTradeParameters1> getExchangeForPhysicalTrade() {
		return exchangeForPhysicalTrade == null ? Optional.empty() : Optional.of(exchangeForPhysicalTrade);
	}

	public NonDisclosedBid1 setExchangeForPhysicalTrade(com.tools20022.repository.msg.ExchangeForPhysicalTradeParameters1 exchangeForPhysicalTrade) {
		this.exchangeForPhysicalTrade = exchangeForPhysicalTrade;
		return this;
	}
}