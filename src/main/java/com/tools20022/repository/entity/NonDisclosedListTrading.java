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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ListTrading
 * ListTrading}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonDisclosedListTrading"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class NonDisclosedListTrading extends ListTrading {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode bidByCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 399 and 400</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<NonDisclosedListTrading, CountryCode> mmBidByCurrency = new MMBusinessAttribute<NonDisclosedListTrading, CountryCode>() {
		{
			derivation_lazy = () -> Arrays.asList(NonDisclosedBid2.mmBidByCurrency, NonDisclosedBid1.mmBidByCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "399 and 400"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidByCurrency";
			definition = "Identifies a type of bid based on a common characteristic (the currency) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(NonDisclosedListTrading obj) {
			return obj.getBidByCurrency();
		}

		@Override
		public void setValue(NonDisclosedListTrading obj, CountryCode value) {
			obj.setBidByCurrency(value);
		}
	};
	protected Max140Text bidBySector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidBySector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 399 and 400</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<NonDisclosedListTrading, Max140Text> mmBidBySector = new MMBusinessAttribute<NonDisclosedListTrading, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(NonDisclosedBid2.mmBidBySector, NonDisclosedBid1.mmBidBySector);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "399 and 400"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidBySector";
			definition = "Identifies a type of bid based on a common characteristic (the sector) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(NonDisclosedListTrading obj) {
			return obj.getBidBySector();
		}

		@Override
		public void setValue(NonDisclosedListTrading obj, Max140Text value) {
			obj.setBidBySector(value);
		}
	};
	protected Max140Text bidByIndex;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidByIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a type of bid based on a common characteristic (the index) of all securities of a list."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 399 and 400</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<NonDisclosedListTrading, Max140Text> mmBidByIndex = new MMBusinessAttribute<NonDisclosedListTrading, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(NonDisclosedBid2.mmBidByIndex, NonDisclosedBid1.mmBidByIndex);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "399 and 400"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidByIndex";
			definition = "Identifies a type of bid based on a common characteristic (the index) of all securities of a list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(NonDisclosedListTrading obj) {
			return obj.getBidByIndex();
		}

		@Override
		public void setValue(NonDisclosedListTrading obj, Max140Text value) {
			obj.setBidByIndex(value);
		}
	};
	protected Number numberOfBidders;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Bid1#mmTotalNumberOfBidders
	 * Bid1.mmTotalNumberOfBidders}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfBidders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total number of bidders participating to a list trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<NonDisclosedListTrading, Number> mmNumberOfBidders = new MMBusinessAttribute<NonDisclosedListTrading, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(Bid1.mmTotalNumberOfBidders);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfBidders";
			definition = "Indicates the total number of bidders participating to a list trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(NonDisclosedListTrading obj) {
			return obj.getNumberOfBidders();
		}

		@Override
		public void setValue(NonDisclosedListTrading obj, Number value) {
			obj.setNumberOfBidders(value);
		}
	};
	protected CurrencyAndAmount sideValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading
	 * NonDisclosedListTrading}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the monetary value in either direction (buy or sell) without revealing whether it is the intention to buy or sell."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 396, FIXSynonym: 397</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<NonDisclosedListTrading, CurrencyAndAmount> mmSideValue = new MMBusinessAttribute<NonDisclosedListTrading, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(LiquidityAndStatistics1.mmSideValue1, LiquidityAndStatistics1.mmSideValue2);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "396"), new FIXSynonym(this, "397"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SideValue";
			definition = "Indicates the monetary value in either direction (buy or sell) without revealing whether it is the intention to buy or sell.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(NonDisclosedListTrading obj) {
			return obj.getSideValue();
		}

		@Override
		public void setValue(NonDisclosedListTrading obj, CurrencyAndAmount value) {
			obj.setSideValue(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonDisclosedListTrading";
				definition = "List trading by which the buy-side provides details to the sell-side information about the sector, country, index and potential market impact of the financial instrument to be bought or sold. Using this information, the sell-side firms bid for the trade.";
				derivationElement_lazy = () -> Arrays.asList(BidResponsePrice2.mmNonDisclosedBidDetails);
				superType_lazy = () -> ListTrading.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.NonDisclosedListTrading.mmBidByCurrency, com.tools20022.repository.entity.NonDisclosedListTrading.mmBidBySector,
								com.tools20022.repository.entity.NonDisclosedListTrading.mmBidByIndex, com.tools20022.repository.entity.NonDisclosedListTrading.mmNumberOfBidders,
								com.tools20022.repository.entity.NonDisclosedListTrading.mmSideValue);
				derivationComponent_lazy = () -> Arrays.asList(NonDisclosedBid2.mmObject(), NonDisclosedBid1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return NonDisclosedListTrading.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getBidByCurrency() {
		return bidByCurrency;
	}

	public NonDisclosedListTrading setBidByCurrency(CountryCode bidByCurrency) {
		this.bidByCurrency = Objects.requireNonNull(bidByCurrency);
		return this;
	}

	public Max140Text getBidBySector() {
		return bidBySector;
	}

	public NonDisclosedListTrading setBidBySector(Max140Text bidBySector) {
		this.bidBySector = Objects.requireNonNull(bidBySector);
		return this;
	}

	public Max140Text getBidByIndex() {
		return bidByIndex;
	}

	public NonDisclosedListTrading setBidByIndex(Max140Text bidByIndex) {
		this.bidByIndex = Objects.requireNonNull(bidByIndex);
		return this;
	}

	public Number getNumberOfBidders() {
		return numberOfBidders;
	}

	public NonDisclosedListTrading setNumberOfBidders(Number numberOfBidders) {
		this.numberOfBidders = Objects.requireNonNull(numberOfBidders);
		return this;
	}

	public CurrencyAndAmount getSideValue() {
		return sideValue;
	}

	public NonDisclosedListTrading setSideValue(CurrencyAndAmount sideValue) {
		this.sideValue = Objects.requireNonNull(sideValue);
		return this;
	}
}