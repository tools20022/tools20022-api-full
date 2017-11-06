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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.msg.NonDisclosedBid1;
import com.tools20022.repository.msg.NonDisclosedBid2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List trading by which the buy-side provides details to the sell-side
 * information about the sector, country, index and potential market impact of
 * the financial instrument to be bought or sold. Using this information, the
 * sell-side firms bid for the trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="NonDisclosedListTrading"
 * src="doc-files/NonDisclosedListTrading.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidByCurrency
 * NonDisclosedListTrading.mmBidByCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidBySector
 * NonDisclosedListTrading.mmBidBySector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmBidByIndex
 * NonDisclosedListTrading.mmBidByIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmNumberOfBidders
 * NonDisclosedListTrading.mmNumberOfBidders}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmSideValue
 * NonDisclosedListTrading.mmSideValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BidResponsePrice2#mmNonDisclosedBidDetails
 * BidResponsePrice2.mmNonDisclosedBidDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ListTrading
 * ListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid2
 * NonDisclosedBid2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonDisclosedBid1
 * NonDisclosedBid1}</li>
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
 * "NonDisclosedListTrading"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade."
 * </li>
 * </ul>
 */
public class NonDisclosedListTrading extends ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode bidByCurrency;
	/**
	 * Identifies a type of bid based on a common characteristic (the currency)
	 * of all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2#mmBidByCurrency
	 * NonDisclosedBid2.mmBidByCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmBidByCurrency
	 * NonDisclosedBid1.mmBidByCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBidByCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDisclosedBid2.mmBidByCurrency, com.tools20022.repository.msg.NonDisclosedBid1.mmBidByCurrency);
			elementContext_lazy = () -> NonDisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidByCurrency";
			definition = "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max140Text bidBySector;
	/**
	 * Identifies a type of bid based on a common characteristic (the sector) of
	 * all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2#mmBidBySector
	 * NonDisclosedBid2.mmBidBySector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmBidBySector
	 * NonDisclosedBid1.mmBidBySector}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidBySector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBidBySector = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDisclosedBid2.mmBidBySector, com.tools20022.repository.msg.NonDisclosedBid1.mmBidBySector);
			elementContext_lazy = () -> NonDisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidBySector";
			definition = "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max140Text bidByIndex;
	/**
	 * Identifies a type of bid based on a common characteristic (the index) of
	 * all securities of a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid2#mmBidByIndex
	 * NonDisclosedBid2.mmBidByIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonDisclosedBid1#mmBidByIndex
	 * NonDisclosedBid1.mmBidByIndex}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the index) of all securities of a list."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBidByIndex = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDisclosedBid2.mmBidByIndex, com.tools20022.repository.msg.NonDisclosedBid1.mmBidByIndex);
			elementContext_lazy = () -> NonDisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidByIndex";
			definition = "Identifies a type of bid based on a common characteristic (the index) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Number numberOfBidders;
	/**
	 * Indicates the total number of bidders participating to a list trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#mmTotalNumberOfBidders
	 * Bid1.mmTotalNumberOfBidders}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfBidders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total number of bidders participating to a list trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNumberOfBidders = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Bid1.mmTotalNumberOfBidders);
			elementContext_lazy = () -> NonDisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfBidders";
			definition = "Indicates the total number of bidders participating to a list trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected CurrencyAndAmount sideValue;
	/**
	 * Indicates the monetary value in either direction (buy or sell) without
	 * revealing whether it is the intention to buy or sell.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmSideValue1
	 * LiquidityAndStatistics1.mmSideValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1#mmSideValue2
	 * LiquidityAndStatistics1.mmSideValue2}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the monetary value in either direction (buy or sell) without revealing whether it is the intention to buy or sell."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSideValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityAndStatistics1.mmSideValue1, com.tools20022.repository.msg.LiquidityAndStatistics1.mmSideValue2);
			elementContext_lazy = () -> NonDisclosedListTrading.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SideValue";
			definition = "Indicates the monetary value in either direction (buy or sell) without revealing whether it is the intention to buy or sell.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NonDisclosedListTrading";
				definition = "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BidResponsePrice2.mmNonDisclosedBidDetails);
				superType_lazy = () -> ListTrading.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.NonDisclosedListTrading.mmBidByCurrency, com.tools20022.repository.entity.NonDisclosedListTrading.mmBidBySector,
								com.tools20022.repository.entity.NonDisclosedListTrading.mmBidByIndex, com.tools20022.repository.entity.NonDisclosedListTrading.mmNumberOfBidders,
								com.tools20022.repository.entity.NonDisclosedListTrading.mmSideValue);
				derivationComponent_lazy = () -> Arrays.asList(NonDisclosedBid2.mmObject(), NonDisclosedBid1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getBidByCurrency() {
		return bidByCurrency;
	}

	public void setBidByCurrency(CountryCode bidByCurrency) {
		this.bidByCurrency = bidByCurrency;
	}

	public Max140Text getBidBySector() {
		return bidBySector;
	}

	public void setBidBySector(Max140Text bidBySector) {
		this.bidBySector = bidBySector;
	}

	public Max140Text getBidByIndex() {
		return bidByIndex;
	}

	public void setBidByIndex(Max140Text bidByIndex) {
		this.bidByIndex = bidByIndex;
	}

	public Number getNumberOfBidders() {
		return numberOfBidders;
	}

	public void setNumberOfBidders(Number numberOfBidders) {
		this.numberOfBidders = numberOfBidders;
	}

	public CurrencyAndAmount getSideValue() {
		return sideValue;
	}

	public void setSideValue(CurrencyAndAmount sideValue) {
		this.sideValue = sideValue;
	}
}