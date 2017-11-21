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
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio.
 * 
 * One example is index arbitrage, which consists in the purchase or sale of a
 * basket of stocks in conjunction with the sale or purchase of a derivative
 * product (for example index futures) to profit from price differences between
 * the basket and the derivative product.
 * 
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmCommission
 * BidResponsePrice2.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmGrossIndicator
 * BidResponsePrice2.mmGrossIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmPrice
 * BidResponsePrice2.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmSide
 * BidResponsePrice2.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmNonDisclosedBidDetails
 * BidResponsePrice2.mmNonDisclosedBidDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BidResponsePrice2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BidResponsePrice2", propOrder = {"commission", "grossIndicator", "price", "side", "nonDisclosedBidDetails"})
public class BidResponsePrice2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Commission2 commission;
	/**
	 * Amount of money due to a party as compensation for a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Commission2
	 * Commission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmCommission
	 * SecuritiesQuoteVariable.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2
	 * BidResponsePrice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Comssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmCommission;
			componentContext_lazy = () -> BidResponsePrice2.mmObject();
			isDerived = false;
			xmlTag = "Comssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.Commission2.mmObject();
		}
	};
	protected TrueFalseIndicator grossIndicator;
	/**
	 * Indicates whether the price is gross of commission and tax.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2
	 * BidResponsePrice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is gross of commission and tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmGrossAmountIndicator;
			componentContext_lazy = () -> BidResponsePrice2.mmObject();
			isDerived = false;
			xmlTag = "GrssInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossIndicator";
			definition = "Indicates whether the price is gross of commission and tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Price1 price;
	/**
	 * Proposition of price for a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2
	 * BidResponsePrice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proposition of price for a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quote.mmPrice;
			componentContext_lazy = () -> BidResponsePrice2.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Proposition of price for a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected Side1Code side;
	/**
	 * Indicates the side of the bid.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2
	 * BidResponsePrice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the side of the bid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSide = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> BidResponsePrice2.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Indicates the side of the bid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side1Code.mmObject();
		}
	};
	protected NonDisclosedBid2 nonDisclosedBidDetails;
	/**
	 * List trading by which the buy-side provides details to the sell-side
	 * information about the sector, country, index and potential market impact
	 * of the financial instrument to be bought or sold. Using this information,
	 * the sell-side firms bid for the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NonDisclosedBid2
	 * NonDisclosedBid2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2
	 * BidResponsePrice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonDscldBidDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDisclosedBidDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonDisclosedBidDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> NonDisclosedListTrading.mmObject();
			componentContext_lazy = () -> BidResponsePrice2.mmObject();
			isDerived = false;
			xmlTag = "NonDscldBidDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDisclosedBidDetails";
			definition = "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NonDisclosedBid2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BidResponsePrice2.mmCommission, BidResponsePrice2.mmGrossIndicator, BidResponsePrice2.mmPrice, BidResponsePrice2.mmSide, BidResponsePrice2.mmNonDisclosedBidDetails);
				trace_lazy = () -> Quote.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BidResponsePrice2";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Comssn", required = true)
	public Commission2 getCommission() {
		return commission;
	}

	public void setCommission(com.tools20022.repository.msg.Commission2 commission) {
		this.commission = commission;
	}

	@XmlElement(name = "GrssInd", required = true)
	public TrueFalseIndicator getGrossIndicator() {
		return grossIndicator;
	}

	public void setGrossIndicator(TrueFalseIndicator grossIndicator) {
		this.grossIndicator = grossIndicator;
	}

	@XmlElement(name = "Pric")
	public Price1 getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.msg.Price1 price) {
		this.price = price;
	}

	@XmlElement(name = "Sd")
	public Side1Code getSide() {
		return side;
	}

	public void setSide(Side1Code side) {
		this.side = side;
	}

	@XmlElement(name = "NonDscldBidDtls")
	public NonDisclosedBid2 getNonDisclosedBidDetails() {
		return nonDisclosedBidDetails;
	}

	public void setNonDisclosedBidDetails(com.tools20022.repository.msg.NonDisclosedBid2 nonDisclosedBidDetails) {
		this.nonDisclosedBidDetails = nonDisclosedBidDetails;
	}
}