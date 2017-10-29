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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.AssetClassAttributes1Choice;
import com.tools20022.repository.choice.CommodityDerivate2Choice;
import com.tools20022.repository.choice.Derivative2Choice;
import com.tools20022.repository.choice.EquityDerivative3Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the parameters of a derivative instrument based on a specific
 * asset.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Derivative" src="doc-files/Derivative.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#UnderlyingAsset
 * Derivative.UnderlyingAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#NotionalCurrencyAndAmount
 * Derivative.NotionalCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#DerivativeCovered
 * Derivative.DerivativeCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#ExerciseDate
 * Derivative.ExerciseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#InterestIncludedInPrice
 * Derivative.InterestIncludedInPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#Tick
 * Derivative.Tick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#ExercisePrice
 * Derivative.ExercisePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#NotionalCurrency
 * Derivative.NotionalCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#VersionNumber
 * Derivative.VersionNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Derivative
 * Asset.Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Derivative
 * SecuritiesPricing.Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedFuture
 * SecuritiesPricing.RelatedFuture}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#Both
 * AssetClassAttributes1Choice.Both}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#Commodity
 * AssetClass2.Commodity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#Interest
 * AssetClass2.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#ForeignExchange
 * AssetClass2.ForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#AssetClassSpecificAttributes
 * DerivativeInstrument6.AssetClassSpecificAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#EmissionAllowance
 * Derivative2Choice.EmissionAllowance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Option Option}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future Future}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Swaps Swaps}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes1
 * DerivativeBasicAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2
 * DerivativeBasicAttributes2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
 * FutureOrOptionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
 * UnsecuredMarketTransaction1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2
 * UnsecuredMarketTransaction2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
 * UnsecuredMarketTransaction3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice
 * AssetClassAttributes1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInterest2
 * DerivativeInterest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClassAttributes1
 * AssetClassAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeForeignExchange2
 * DerivativeForeignExchange2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInterest3
 * DerivativeInterest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3
 * DerivativeForeignExchange3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInstrument5
 * DerivativeInstrument5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EquityDerivative2
 * EquityDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
 * EquityDerivative3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeDerivative2
 * ForeignExchangeDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractForDifference2
 * ContractForDifference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateDerivative5
 * InterestRateDerivative5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BondDerivative2
 * BondDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommodityDerivate4
 * CommodityDerivate4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice
 * CommodityDerivate2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInstrument6
 * DerivativeInstrument6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Derivative2Choice
 * Derivative2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4
 * UnsecuredMarketTransaction4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Derivative"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters of a derivative instrument based on a specific asset."
 * </li>
 * </ul>
 */
public class Derivative extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the underlying asset of the derivative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#Derivative
	 * Asset.Derivative}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Future2#AdditionalUnderlyingAttributes
	 * Future2.AdditionalUnderlyingAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#UnderlyingInstrumentAssetClass
	 * TransparencyDataReport10.UnderlyingInstrumentAssetClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#UnderlyingInstrument
	 * DerivativeInstrument5.UnderlyingInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EquityDerivative2#UnderlyingType
	 * EquityDerivative2.UnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractForDifference2#UnderlyingType
	 * ContractForDifference2.UnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#UnderlyingType
	 * InterestRateDerivative5.UnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#UnderlyingInstrument
	 * DerivativeInstrument6.UnderlyingInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#Commodity
	 * Derivative2Choice.Commodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#InterestRate
	 * Derivative2Choice.InterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#ForeignExchange
	 * Derivative2Choice.ForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#Equity
	 * Derivative2Choice.Equity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAsset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying asset of the derivative."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UnderlyingAsset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Future2.AdditionalUnderlyingAttributes, com.tools20022.repository.msg.TransparencyDataReport10.UnderlyingInstrumentAssetClass,
					com.tools20022.repository.msg.DerivativeInstrument5.UnderlyingInstrument, com.tools20022.repository.msg.EquityDerivative2.UnderlyingType, com.tools20022.repository.msg.ContractForDifference2.UnderlyingType,
					com.tools20022.repository.msg.InterestRateDerivative5.UnderlyingType, com.tools20022.repository.msg.DerivativeInstrument6.UnderlyingInstrument, com.tools20022.repository.choice.Derivative2Choice.Commodity,
					com.tools20022.repository.choice.Derivative2Choice.InterestRate, com.tools20022.repository.choice.Derivative2Choice.ForeignExchange, com.tools20022.repository.choice.Derivative2Choice.Equity);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAsset";
			definition = "Specifies the underlying asset of the derivative.";
			minOccurs = 0;
			type_lazy = () -> Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Derivative;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount underlying a financial derivatives contract necessary for
	 * calculating payments or receipts.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes1#NotionalCurrencyAndAmount
	 * DerivativeBasicAttributes1.NotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes2#NotionalCurrencyAndAmount
	 * DerivativeBasicAttributes2.NotionalCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#CashAmount
	 * UnderlyingAttributes.CashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#CashAmount
	 * UnderlyingAttributes2.CashAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount underlying a financial derivatives contract necessary for calculating payments or receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotionalCurrencyAndAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeBasicAttributes1.NotionalCurrencyAndAmount, com.tools20022.repository.msg.DerivativeBasicAttributes2.NotionalCurrencyAndAmount,
					com.tools20022.repository.msg.UnderlyingAttributes.CashAmount, com.tools20022.repository.msg.UnderlyingAttributes2.CashAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalCurrencyAndAmount";
			definition = "Amount underlying a financial derivatives contract necessary for calculating payments or receipts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether the derivative product is covered or not by an
	 * underlying financial instrument position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#CoveredIndicator
	 * FinancialInstrumentAttributes1.CoveredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order3#DerivativeCovered
	 * Order3.DerivativeCovered}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#DerivativeCovered
	 * Order16.DerivativeCovered}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#DerivativeCovered
	 * Order14.DerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#CoveredIndicator
	 * FinancialInstrumentAttributes31.CoveredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order9#DerivativeCovered
	 * Order9.DerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#LegDerivativeCoveredIndicator
	 * InstrumentLeg3.LegDerivativeCoveredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#CoveredIndicator
	 * FinancialInstrumentAttributes2.CoveredIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order6#DerivativeCovered
	 * Order6.DerivativeCovered}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#DerivativeCovered
	 * Order17.DerivativeCovered}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#DerivativeCovered
	 * Order18.DerivativeCovered}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DerivativeCovered = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.CoveredIndicator, com.tools20022.repository.msg.Order3.DerivativeCovered,
					com.tools20022.repository.msg.Order16.DerivativeCovered, com.tools20022.repository.msg.Order14.DerivativeCovered, com.tools20022.repository.msg.FinancialInstrumentAttributes31.CoveredIndicator,
					com.tools20022.repository.msg.Order9.DerivativeCovered, com.tools20022.repository.msg.InstrumentLeg3.LegDerivativeCoveredIndicator, com.tools20022.repository.msg.FinancialInstrumentAttributes2.CoveredIndicator,
					com.tools20022.repository.msg.Order6.DerivativeCovered, com.tools20022.repository.msg.Order17.DerivativeCovered, com.tools20022.repository.msg.Order18.DerivativeCovered);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DerivativeCovered";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which the derivative is exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#ExerciseDate
	 * SecurityInstrumentDescription1.ExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#ExerciseDate
	 * SecurityInstrumentDescription2.ExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#ExpiryDate
	 * DerivativeInstrument5.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#ExpiryDate
	 * DerivativeInstrument6.ExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the derivative is exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExerciseDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityInstrumentDescription1.ExerciseDate, com.tools20022.repository.msg.SecurityInstrumentDescription2.ExerciseDate,
					com.tools20022.repository.msg.DerivativeInstrument5.ExpiryDate, com.tools20022.repository.msg.DerivativeInstrument6.ExpiryDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExerciseDate";
			definition = "Date on which the derivative is exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the given derivative price includes a prorated accrued
	 * interest component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestIncludedInPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the given derivative price includes a prorated accrued interest component."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InterestIncludedInPrice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestIncludedInPrice";
			definition = "Indicates whether the given derivative price includes a prorated accrued interest component.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Minimum price increment with which the contract may be traded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedFuture
	 * SecuritiesPricing.RelatedFuture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tick"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum price increment with which the contract may be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tick = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tick";
			definition = "Minimum price increment with which the contract may be traded.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedFuture;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Predetermined price at which the holder of a derivative will have to buy
	 * or sell the underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Derivative
	 * SecuritiesPricing.Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#ExercisePrice
	 * FinancialInstrumentAttributes8.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#ExercisePrice
	 * FinancialInstrumentAttributes20.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#ExercisePrice
	 * FinancialInstrumentAttributes35.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#ExercisePrice
	 * FinancialInstrumentAttributes41.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#ExercisePrice
	 * PriceDetails2.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#ExercisePrice
	 * PriceDetails4.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#ExercisePrice
	 * PriceDetails3.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#ExercisePrice
	 * PriceDetails5.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#ExercisePrice
	 * FinancialInstrumentAttributes4.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#ExercisePrice
	 * FinancialInstrumentAttributes13.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#ExercisePrice
	 * FinancialInstrumentAttributes21.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#ExercisePrice
	 * FinancialInstrumentAttributes26.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#ExercisePrice
	 * FinancialInstrumentAttributes36.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#ExercisePrice
	 * FinancialInstrumentAttributes42.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#ExercisePrice
	 * FinancialInstrumentAttributes27.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#ExercisePrice
	 * FinancialInstrumentAttributes14.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#ExercisePrice
	 * FinancialInstrumentAttributes30.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#ExercisePrice
	 * FinancialInstrumentAttributes28.ExercisePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#ExercisePrice
	 * Future1.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#ExercisePrice
	 * FinancialInstrumentAttributes31.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#ExercisePrice
	 * FinancialInstrumentAttributes44.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#ExercisePrice
	 * FinancialInstrumentAttributes15.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#ExercisePrice
	 * FinancialInstrumentAttributes29.ExercisePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#ExercisePrice
	 * Future2.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ExercisePrice
	 * FinancialInstrumentAttributes2.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#ExercisePrice
	 * FinancialInstrumentAttributes63.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#ExercisePrice
	 * FinancialInstrumentAttributes64.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#ExercisePrice
	 * FinancialInstrumentAttributes75.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#ExercisePrice
	 * FinancialInstrumentAttributes78.ExercisePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder of a derivative will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExercisePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes20.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes41.ExercisePrice, com.tools20022.repository.msg.PriceDetails2.ExercisePrice,
					com.tools20022.repository.msg.PriceDetails4.ExercisePrice, com.tools20022.repository.msg.PriceDetails3.ExercisePrice, com.tools20022.repository.msg.PriceDetails5.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes13.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes26.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes42.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes14.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes28.ExercisePrice, com.tools20022.repository.msg.Future1.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes44.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes29.ExercisePrice, com.tools20022.repository.msg.Future2.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes63.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.ExercisePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes75.ExercisePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.ExercisePrice);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a derivative will have to buy or sell the underlying instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Derivative;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency of the underlying a financial derivatives contract necessary for
	 * calculating payments or receipts.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#NotionalCurrency
	 * SecurityInstrumentDescription9.NotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest2#OtherNotionalCurrency
	 * DerivativeInterest2.OtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#NotionalCurrency
	 * SecurityInstrumentDescription11.NotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange2#OtherNotionalCurrency
	 * DerivativeForeignExchange2.OtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#OtherNotionalCurrency
	 * DerivativeInterest3.OtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#OtherNotionalCurrency
	 * DerivativeForeignExchange3.OtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#NotionalCurrency
	 * CreditDefaultSwapSingleName2.NotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#NotionalCurrency
	 * CreditDefaultSwapIndex2.NotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4#NotionalCurrency
	 * CommodityDerivate4.NotionalCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the underlying a financial derivatives contract necessary for calculating payments or receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotionalCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityInstrumentDescription9.NotionalCurrency, com.tools20022.repository.msg.DerivativeInterest2.OtherNotionalCurrency,
					com.tools20022.repository.msg.SecurityInstrumentDescription11.NotionalCurrency, com.tools20022.repository.msg.DerivativeForeignExchange2.OtherNotionalCurrency,
					com.tools20022.repository.msg.DerivativeInterest3.OtherNotionalCurrency, com.tools20022.repository.msg.DerivativeForeignExchange3.OtherNotionalCurrency,
					com.tools20022.repository.msg.CreditDefaultSwapSingleName2.NotionalCurrency, com.tools20022.repository.msg.CreditDefaultSwapIndex2.NotionalCurrency, com.tools20022.repository.msg.CommodityDerivate4.NotionalCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency of the underlying a financial derivatives contract necessary for calculating payments or receipts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Number allocated by options exchanges to record that an option has
	 * undergone a change in its contract specifications (particularly
	 * adjustment of the strike price)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#VersionNumber
	 * Option1.VersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#VersionNumber
	 * FinancialInstrumentAttributes31.VersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#VersionNumber
	 * FinancialInstrumentAttributes44.VersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#VersionNumber
	 * FinancialInstrumentAttributes2.VersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#Version
	 * CreditDefaultSwapIndex2.Version}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VersionNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.VersionNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes31.VersionNumber,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.VersionNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes2.VersionNumber, com.tools20022.repository.msg.CreditDefaultSwapIndex2.Version);
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VersionNumber";
			definition = "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Derivative";
				definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
				associationDomain_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.Asset.Derivative, com.tools20022.repository.entity.SecuritiesPricing.Derivative, com.tools20022.repository.entity.SecuritiesPricing.RelatedFuture);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassAttributes1Choice.Both, com.tools20022.repository.msg.AssetClass2.Commodity, com.tools20022.repository.msg.AssetClass2.Interest,
						com.tools20022.repository.msg.AssetClass2.ForeignExchange, com.tools20022.repository.msg.DerivativeInstrument6.AssetClassSpecificAttributes, com.tools20022.repository.choice.Derivative2Choice.EmissionAllowance);
				subType_lazy = () -> Arrays.asList(Option.mmObject(), Future.mmObject(), Swaps.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Derivative.UnderlyingAsset, com.tools20022.repository.entity.Derivative.NotionalCurrencyAndAmount,
						com.tools20022.repository.entity.Derivative.DerivativeCovered, com.tools20022.repository.entity.Derivative.ExerciseDate, com.tools20022.repository.entity.Derivative.InterestIncludedInPrice,
						com.tools20022.repository.entity.Derivative.Tick, com.tools20022.repository.entity.Derivative.ExercisePrice, com.tools20022.repository.entity.Derivative.NotionalCurrency,
						com.tools20022.repository.entity.Derivative.VersionNumber);
				derivationComponent_lazy = () -> Arrays.asList(DerivativeBasicAttributes1.mmObject(), DerivativeBasicAttributes2.mmObject(), FutureOrOptionDetails1.mmObject(), UnsecuredMarketTransaction1.mmObject(),
						UnsecuredMarketTransaction2.mmObject(), UnsecuredMarketTransaction3.mmObject(), AssetClassAttributes1Choice.mmObject(), DerivativeInterest2.mmObject(), AssetClassAttributes1.mmObject(),
						DerivativeForeignExchange2.mmObject(), DerivativeInterest3.mmObject(), DerivativeForeignExchange3.mmObject(), DerivativeInstrument5.mmObject(), EquityDerivative2.mmObject(), EquityDerivative3Choice.mmObject(),
						ForeignExchangeDerivative2.mmObject(), ContractForDifference2.mmObject(), InterestRateDerivative5.mmObject(), BondDerivative2.mmObject(), CommodityDerivate4.mmObject(), CommodityDerivate2Choice.mmObject(),
						DerivativeInstrument6.mmObject(), Derivative2Choice.mmObject(), UnsecuredMarketTransaction4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}