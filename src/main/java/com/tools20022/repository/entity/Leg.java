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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.QuoteCancellation1Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Separate transactions which combined together form a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Leg" src="doc-files/Leg.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmRelatedAsset
 * Leg.mmRelatedAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmRatioQuantity
 * Leg.mmRatioQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmCurrency
 * Leg.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmSwapType
 * Leg.mmSwapType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmPool Leg.mmPool}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmTrade Leg.mmTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LegDetails1 LegDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg2 InstrumentLeg2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg3 InstrumentLeg3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg1 InstrumentLeg1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InstrumentLeg6 InstrumentLeg6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
 * Asset.mmLegAdditionalInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmLeg Trade.mmLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmInstrumentLegGroupDetails
 * SingleQuote1.mmInstrumentLegGroupDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmInstrumentLegGroupDetails
 * QuoteCancellation1Choice.mmInstrumentLegGroupDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmInstrumentLegGroupDetails
 * QuoteRequest1.mmInstrumentLegGroupDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmInstrumentLegGroupDetails
 * RequestForQuote.mmInstrumentLegGroupDetails}</li>
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
 * "Leg"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Separate transactions which combined together form a trade."</li>
 * </ul>
 */
public class Leg {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Asset relatedAsset;
	/**
	 * Asset for which leg information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
	 * Asset.mmLegAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegFinancialInstrumentAttributes
	 * InstrumentLeg2.mmLegFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegFinancialInstrumentAttributes
	 * InstrumentLeg3.mmLegFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg1#mmLegFinancialInstrumentAttributes
	 * InstrumentLeg1.mmLegFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAsset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset for which leg information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedAsset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InstrumentLeg2.mmLegFinancialInstrumentAttributes, InstrumentLeg3.mmLegFinancialInstrumentAttributes, InstrumentLeg1.mmLegFinancialInstrumentAttributes);
			elementContext_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAsset";
			definition = "Asset for which leg information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmLegAdditionalInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected PercentageRate ratioQuantity;
	/**
	 * Only for multileg instrument - Ratio of quantity for an individual leg
	 * relative to the entire multileg security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LegDetails1#mmRatioQuantity
	 * LegDetails1.mmRatioQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatioQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only for multileg instrument - Ratio of quantity for an individual leg relative to the entire multileg security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRatioQuantity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LegDetails1.mmRatioQuantity);
			elementContext_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatioQuantity";
			definition = "Only for multileg instrument - Ratio of quantity for an individual leg relative to the entire multileg security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Leg.class.getMethod("getRatioQuantity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currency;
	/**
	 * Only for multileg instrument - Currency associated with a particular
	 * Leg's quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LegDetails1#mmCurrency
	 * LegDetails1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg6#mmLegCurrency
	 * InstrumentLeg6.mmLegCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only for multileg instrument - Currency associated with a particular Leg's quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LegDetails1.mmCurrency, InstrumentLeg6.mmLegCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Only for multileg instrument - Currency associated with a particular Leg's quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Leg.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text swapType;
	/**
	 * For Fixed Income, used instead of LegQty or LegOrderQty to requests the
	 * respondent to calculate the quantity based on the quantity on the
	 * opposite side of the swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegSwapType
	 * InstrumentLeg2.mmLegSwapType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For Fixed Income, used instead of LegQty or LegOrderQty to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSwapType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InstrumentLeg2.mmLegSwapType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwapType";
			definition = "For Fixed Income, used instead of LegQty or LegOrderQty to requests the respondent to calculate the quantity based on the quantity on the opposite side of the swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Leg.class.getMethod("getSwapType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number pool;
	/**
	 * For Fixed Income, identifies MBS / ABS pool for a specific leg of a
	 * multi-leg instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For Fixed Income, identifies MBS / ABS pool for a specific leg of a multi-leg instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPool = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pool";
			definition = "For Fixed Income, identifies MBS / ABS pool for a specific leg of a multi-leg instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Leg.class.getMethod("getPool", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Trade trade;
	/**
	 * Trade which is composed of several legs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmLeg
	 * Trade.mmLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is composed of several legs."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade which is composed of several legs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Leg";
				definition = "Separate transactions which combined together form a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmLegAdditionalInformation, com.tools20022.repository.entity.Trade.mmLeg);
				derivationElement_lazy = () -> Arrays.asList(SingleQuote1.mmInstrumentLegGroupDetails, QuoteCancellation1Choice.mmInstrumentLegGroupDetails, QuoteRequest1.mmInstrumentLegGroupDetails,
						RequestForQuote.mmInstrumentLegGroupDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Leg.mmRelatedAsset, com.tools20022.repository.entity.Leg.mmRatioQuantity, com.tools20022.repository.entity.Leg.mmCurrency,
						com.tools20022.repository.entity.Leg.mmSwapType, com.tools20022.repository.entity.Leg.mmPool, com.tools20022.repository.entity.Leg.mmTrade);
				derivationComponent_lazy = () -> Arrays.asList(LegDetails1.mmObject(), InstrumentLeg2.mmObject(), InstrumentLeg3.mmObject(), InstrumentLeg1.mmObject(), InstrumentLeg6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Leg.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Asset getRelatedAsset() {
		return relatedAsset;
	}

	public void setRelatedAsset(com.tools20022.repository.entity.Asset relatedAsset) {
		this.relatedAsset = relatedAsset;
	}

	public PercentageRate getRatioQuantity() {
		return ratioQuantity;
	}

	public void setRatioQuantity(PercentageRate ratioQuantity) {
		this.ratioQuantity = ratioQuantity;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public Max35Text getSwapType() {
		return swapType;
	}

	public void setSwapType(Max35Text swapType) {
		this.swapType = swapType;
	}

	public Number getPool() {
		return pool;
	}

	public void setPool(Number pool) {
		this.pool = pool;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}
}