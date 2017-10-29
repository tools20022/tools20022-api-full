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
import com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice;
import com.tools20022.repository.codeset.BlockedReasonCode;
import com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode;
import com.tools20022.repository.codeset.UnrealisedCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies in terms of value and quantity the assets.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetHolding" src="doc-files/AssetHolding.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#HoldingValue
 * AssetHolding.HoldingValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#BookValue
 * AssetHolding.BookValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#FaceAmount
 * AssetHolding.FaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#AmortisedFaceValue
 * AssetHolding.AmortisedFaceValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#MarketValue
 * AssetHolding.MarketValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Balance
 * AssetHolding.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#UnrealisedGainOrLoss
 * AssetHolding.UnrealisedGainOrLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Asset
 * AssetHolding.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Haircut
 * AssetHolding.Haircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#EligibleCollateralValue
 * AssetHolding.EligibleCollateralValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#ExchangeRate
 * AssetHolding.ExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#CapValue
 * AssetHolding.CapValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#RiskAdjustedValue
 * AssetHolding.RiskAdjustedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#RealisedGainOrLoss
 * AssetHolding.RealisedGainOrLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#UnrealisedType
 * AssetHolding.UnrealisedType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#PostHaircutValue
 * AssetHolding.PostHaircutValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Interest
 * AssetHolding.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Collateral
 * AssetHolding.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#FinancialAssetType
 * AssetHolding.FinancialAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#VariationMarginCollateral
 * AssetHolding.VariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#IndependentAmountCollateral
 * AssetHolding.IndependentAmountCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#HoldingType
 * AssetHolding.HoldingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#GuaranteeAmount
 * AssetHolding.GuaranteeAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetValue
 * Asset.AssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#AssetHolding
 * Balance.AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAssetHolding
 * Interest.RelatedAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CalculatedAssetValue
 * CurrencyExchange.CalculatedAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#AssetHolding
 * Collateral.AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#VariationMarginAssetHolding
 * Collateral.VariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#SegregatedIndependentAmountAssetHolding
 * Collateral.SegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#AssetHolding
 * HaircutValuation.AssetHolding}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#Holdings
 * FinancialInstrumentAggregateBalance1.Holdings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#BalanceForFinancialInstrument
 * AggregateHoldingBalance1.BalanceForFinancialInstrument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts1
 * BalanceAmounts1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts2
 * BalanceAmounts2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts5
 * BalanceAmounts5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts6
 * BalanceAmounts6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts3
 * BalanceAmounts3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts4
 * BalanceAmounts4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1
 * FinancialInstrumentAggregateBalance1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentAggregateBalance1Choice
 * FinancialInstrumentAggregateBalance1Choice}</li>
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
 * "AssetHolding"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies in terms of value and quantity the assets."</li>
 * </ul>
 */
public class AssetHolding {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Value of the balance of an individual securities holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#AverageAcquisitionPrice
	 * FinancialInstrument26.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#AverageAcquisitionPrice
	 * FinancialInstrument30.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#AverageAcquisitionPrice
	 * FinancialInstrument24.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#AverageAcquisitionPrice
	 * FinancialInstrument33.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#AverageAcquisitionPrice
	 * FinancialInstrument23.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#HoldingValue
	 * BalanceAmounts1.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#PreviousHoldingValue
	 * BalanceAmounts1.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts2#HoldingValue
	 * BalanceAmounts2.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#HoldingValue
	 * BalanceAmounts5.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#PreviousHoldingValue
	 * BalanceAmounts5.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts6#HoldingValue
	 * BalanceAmounts6.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#HoldingValue
	 * AggregateBalancePerSafekeepingPlace2.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#HoldingValue
	 * AggregateBalanceInformation2.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#HoldingValue
	 * AggregateBalancePerSafekeepingPlace4.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#PreviousHoldingValue
	 * AggregateBalancePerSafekeepingPlace4.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#HoldingValue
	 * AggregateBalanceInformation3.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#PreviousHoldingValue
	 * AggregateBalanceInformation3.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#HoldingValue
	 * BalanceAmounts3.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#PreviousHoldingValue
	 * BalanceAmounts3.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#HoldingValue
	 * BalanceAmounts4.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#PreviousHoldingValue
	 * BalanceAmounts4.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#HoldingValue
	 * AggregateBalancePerSafekeepingPlace1.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#HoldingValue
	 * AggregateBalanceInformation1.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#HoldingValue
	 * AggregateBalancePerSafekeepingPlace3.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#PreviousHoldingValue
	 * AggregateBalancePerSafekeepingPlace3.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#HoldingValue
	 * AggregateBalanceInformation4.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#PreviousHoldingValue
	 * AggregateBalanceInformation4.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral1#Amount
	 * OtherTypeOfCollateral1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#HoldingValue
	 * AggregateBalanceInformation5.HoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#PreviousHoldingValue
	 * AggregateBalanceInformation5.PreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#AverageAcquisitionPrice
	 * FinancialInstrument37.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#AverageAcquisitionPrice
	 * FinancialInstrument35.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#AverageAcquisitionPrice
	 * FinancialInstrument40.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#NominalValuePerUnit
	 * DebtInstrument2.NominalValuePerUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#AverageAcquisitionPrice
	 * FinancialInstrument48.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#AverageAcquisitionPrice
	 * FinancialInstrument47.AverageAcquisitionPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the balance of an individual securities holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument26.AverageAcquisitionPrice, com.tools20022.repository.msg.FinancialInstrument30.AverageAcquisitionPrice,
					com.tools20022.repository.msg.FinancialInstrument24.AverageAcquisitionPrice, com.tools20022.repository.msg.FinancialInstrument33.AverageAcquisitionPrice,
					com.tools20022.repository.msg.FinancialInstrument23.AverageAcquisitionPrice, com.tools20022.repository.msg.BalanceAmounts1.HoldingValue, com.tools20022.repository.msg.BalanceAmounts1.PreviousHoldingValue,
					com.tools20022.repository.msg.BalanceAmounts2.HoldingValue, com.tools20022.repository.msg.BalanceAmounts5.HoldingValue, com.tools20022.repository.msg.BalanceAmounts5.PreviousHoldingValue,
					com.tools20022.repository.msg.BalanceAmounts6.HoldingValue, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.HoldingValue, com.tools20022.repository.msg.AggregateBalanceInformation2.HoldingValue,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.HoldingValue, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.PreviousHoldingValue,
					com.tools20022.repository.msg.AggregateBalanceInformation3.HoldingValue, com.tools20022.repository.msg.AggregateBalanceInformation3.PreviousHoldingValue, com.tools20022.repository.msg.BalanceAmounts3.HoldingValue,
					com.tools20022.repository.msg.BalanceAmounts3.PreviousHoldingValue, com.tools20022.repository.msg.BalanceAmounts4.HoldingValue, com.tools20022.repository.msg.BalanceAmounts4.PreviousHoldingValue,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.HoldingValue, com.tools20022.repository.msg.AggregateBalanceInformation1.HoldingValue,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.HoldingValue, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.PreviousHoldingValue,
					com.tools20022.repository.msg.AggregateBalanceInformation4.HoldingValue, com.tools20022.repository.msg.AggregateBalanceInformation4.PreviousHoldingValue, com.tools20022.repository.msg.OtherTypeOfCollateral1.Amount,
					com.tools20022.repository.msg.AggregateBalanceInformation5.HoldingValue, com.tools20022.repository.msg.AggregateBalanceInformation5.PreviousHoldingValue,
					com.tools20022.repository.msg.FinancialInstrument37.AverageAcquisitionPrice, com.tools20022.repository.msg.FinancialInstrument35.AverageAcquisitionPrice,
					com.tools20022.repository.msg.FinancialInstrument40.AverageAcquisitionPrice, com.tools20022.repository.msg.DebtInstrument2.NominalValuePerUnit,
					com.tools20022.repository.msg.FinancialInstrument48.AverageAcquisitionPrice, com.tools20022.repository.msg.FinancialInstrument47.AverageAcquisitionPrice);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingValue";
			definition = "Value of the balance of an individual securities holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of a security, as booked/acquired in an account. Book value is
	 * often different from the current market value of the security.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#TotalBookValue
	 * FinancialInstrument26.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#TotalBookValue
	 * FinancialInstrument30.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#TotalBookValue
	 * FinancialInstrument24.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#TotalBookValue
	 * FinancialInstrument33.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#TotalBookValue
	 * FinancialInstrument23.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#AverageAcquisitionPrice
	 * FinancialInstrument31.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#TotalBookValue
	 * FinancialInstrument31.TotalBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer4#AveragePrice
	 * Transfer4.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#AveragePrice
	 * Transfer7.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#AveragePrice
	 * Transfer17.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer2#AveragePrice
	 * Transfer2.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#AveragePrice
	 * Transfer10.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#AveragePrice
	 * Transfer14.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#AveragePrice
	 * Transfer24.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer25#AveragePrice
	 * Transfer25.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer1#AveragePrice
	 * Transfer1.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#AveragePrice
	 * Transfer9.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#AveragePrice
	 * Transfer12.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#AveragePrice
	 * Transfer20.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#AveragePrice
	 * Transfer18.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#AveragePrice
	 * Transfer26.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#AveragePrice
	 * Transfer13.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#AveragePrice
	 * Transfer23.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#AveragePrice
	 * Transfer8.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#AveragePrice
	 * Transfer11.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#AveragePrice
	 * Transfer19.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts1#BookValue
	 * BalanceAmounts1.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts2#BookValue
	 * BalanceAmounts2.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts5#BookValue
	 * BalanceAmounts5.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts6#BookValue
	 * BalanceAmounts6.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#BookValue
	 * AggregateBalancePerSafekeepingPlace2.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#BookValue
	 * AggregateBalanceInformation2.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#BookValue
	 * AggregateBalancePerSafekeepingPlace4.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#BookValue
	 * AggregateBalanceInformation3.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts3#BookValue
	 * BalanceAmounts3.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAmounts4#BookValue
	 * BalanceAmounts4.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#BookValue
	 * AggregateBalancePerSafekeepingPlace1.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#BookValue
	 * AggregateBalanceInformation1.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#BookValue
	 * AggregateBalancePerSafekeepingPlace3.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#BookValue
	 * AggregateBalanceInformation4.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#BookValue
	 * OtherAmounts4.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#BookValue
	 * OtherAmounts5.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#BookValue
	 * OtherAmounts17.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#BookValue
	 * OtherAmounts23.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#BookValue
	 * OtherAmounts9.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#BookValue
	 * OtherAmounts10.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#BookValue
	 * OtherAmounts18.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#BookValue
	 * OtherAmounts24.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#BookValue
	 * OtherAmounts16.BookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#RemainingBookValue
	 * OtherAmounts16.RemainingBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#BookValue
	 * AggregateBalanceInformation5.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#AveragePrice
	 * Transfer27.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#AveragePrice
	 * Transfer28.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#NewAveragePrice
	 * Transfer28.NewAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#AveragePrice
	 * Transfer29.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#NewAveragePrice
	 * Transfer29.NewAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#TotalBookValue
	 * FinancialInstrument37.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#TotalBookValue
	 * FinancialInstrument35.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#AverageAcquisitionPrice
	 * FinancialInstrument34.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#TotalBookValue
	 * FinancialInstrument34.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#TotalBookValue
	 * FinancialInstrument40.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#AverageAcquisitionPrice
	 * FinancialInstrument39.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#TotalBookValue
	 * FinancialInstrument39.TotalBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#BookValue
	 * OtherAmounts30.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#BookValue
	 * OtherAmounts31.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#AveragePrice
	 * Transfer31.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#NewAveragePrice
	 * Transfer31.NewAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#AveragePrice
	 * Transfer30.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#AveragePrice
	 * Transfer33.AveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#NewAveragePrice
	 * Transfer33.NewAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#TotalBookValue
	 * FinancialInstrument48.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#TotalBookValue
	 * FinancialInstrument47.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#AverageAcquisitionPrice
	 * FinancialInstrument46.AverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#TotalBookValue
	 * FinancialInstrument46.TotalBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#BookValue
	 * OtherAmounts34.BookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#BookValue
	 * OtherAmounts38.BookValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BookValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument26.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument30.TotalBookValue,
					com.tools20022.repository.msg.FinancialInstrument24.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument33.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument23.TotalBookValue,
					com.tools20022.repository.msg.FinancialInstrument31.AverageAcquisitionPrice, com.tools20022.repository.msg.FinancialInstrument31.TotalBookValue, com.tools20022.repository.msg.Transfer4.AveragePrice,
					com.tools20022.repository.msg.Transfer7.AveragePrice, com.tools20022.repository.msg.Transfer17.AveragePrice, com.tools20022.repository.msg.Transfer2.AveragePrice, com.tools20022.repository.msg.Transfer10.AveragePrice,
					com.tools20022.repository.msg.Transfer14.AveragePrice, com.tools20022.repository.msg.Transfer24.AveragePrice, com.tools20022.repository.msg.Transfer25.AveragePrice, com.tools20022.repository.msg.Transfer1.AveragePrice,
					com.tools20022.repository.msg.Transfer9.AveragePrice, com.tools20022.repository.msg.Transfer12.AveragePrice, com.tools20022.repository.msg.Transfer20.AveragePrice, com.tools20022.repository.msg.Transfer18.AveragePrice,
					com.tools20022.repository.msg.Transfer26.AveragePrice, com.tools20022.repository.msg.Transfer13.AveragePrice, com.tools20022.repository.msg.Transfer23.AveragePrice, com.tools20022.repository.msg.Transfer8.AveragePrice,
					com.tools20022.repository.msg.Transfer11.AveragePrice, com.tools20022.repository.msg.Transfer19.AveragePrice, com.tools20022.repository.msg.BalanceAmounts1.BookValue,
					com.tools20022.repository.msg.BalanceAmounts2.BookValue, com.tools20022.repository.msg.BalanceAmounts5.BookValue, com.tools20022.repository.msg.BalanceAmounts6.BookValue,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.BookValue, com.tools20022.repository.msg.AggregateBalanceInformation2.BookValue,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.BookValue, com.tools20022.repository.msg.AggregateBalanceInformation3.BookValue, com.tools20022.repository.msg.BalanceAmounts3.BookValue,
					com.tools20022.repository.msg.BalanceAmounts4.BookValue, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.BookValue, com.tools20022.repository.msg.AggregateBalanceInformation1.BookValue,
					com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.BookValue, com.tools20022.repository.msg.AggregateBalanceInformation4.BookValue, com.tools20022.repository.msg.OtherAmounts4.BookValue,
					com.tools20022.repository.msg.OtherAmounts5.BookValue, com.tools20022.repository.msg.OtherAmounts17.BookValue, com.tools20022.repository.msg.OtherAmounts23.BookValue,
					com.tools20022.repository.msg.OtherAmounts9.BookValue, com.tools20022.repository.msg.OtherAmounts10.BookValue, com.tools20022.repository.msg.OtherAmounts18.BookValue,
					com.tools20022.repository.msg.OtherAmounts24.BookValue, com.tools20022.repository.msg.OtherAmounts16.BookValue, com.tools20022.repository.msg.OtherAmounts16.RemainingBookValue,
					com.tools20022.repository.msg.AggregateBalanceInformation5.BookValue, com.tools20022.repository.msg.Transfer27.AveragePrice, com.tools20022.repository.msg.Transfer28.AveragePrice,
					com.tools20022.repository.msg.Transfer28.NewAveragePrice, com.tools20022.repository.msg.Transfer29.AveragePrice, com.tools20022.repository.msg.Transfer29.NewAveragePrice,
					com.tools20022.repository.msg.FinancialInstrument37.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument35.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument34.AverageAcquisitionPrice,
					com.tools20022.repository.msg.FinancialInstrument34.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument40.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument39.AverageAcquisitionPrice,
					com.tools20022.repository.msg.FinancialInstrument39.TotalBookValue, com.tools20022.repository.msg.OtherAmounts30.BookValue, com.tools20022.repository.msg.OtherAmounts31.BookValue,
					com.tools20022.repository.msg.Transfer31.AveragePrice, com.tools20022.repository.msg.Transfer31.NewAveragePrice, com.tools20022.repository.msg.Transfer30.AveragePrice,
					com.tools20022.repository.msg.Transfer33.AveragePrice, com.tools20022.repository.msg.Transfer33.NewAveragePrice, com.tools20022.repository.msg.FinancialInstrument48.TotalBookValue,
					com.tools20022.repository.msg.FinancialInstrument47.TotalBookValue, com.tools20022.repository.msg.FinancialInstrument46.AverageAcquisitionPrice, com.tools20022.repository.msg.FinancialInstrument46.TotalBookValue,
					com.tools20022.repository.msg.OtherAmounts34.BookValue, com.tools20022.repository.msg.OtherAmounts38.BookValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookValue";
			definition = "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity expressed as an amount representing the face amount, ie, the
	 * principal, of a debt instrument.
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice#FaceAmount
	 * FinancialInstrumentQuantity1Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#FaceAmount
	 * OriginalAndCurrentQuantities1.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice#FaceAmount
	 * FinancialInstrumentQuantity15Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities4#FaceAmount
	 * OriginalAndCurrentQuantities4.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities2#FaceAmount
	 * OriginalAndCurrentQuantities2.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity4Choice#OriginalAndCurrentFaceAmount
	 * Quantity4Choice.OriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3#FaceAmount
	 * OriginalAndCurrentQuantities3.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity9Choice#OriginalAndCurrentFaceAmount
	 * Quantity9Choice.OriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#FaceAmount
	 * FinancialInstrumentQuantity2Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#FaceAmount
	 * FinancialInstrumentQuantity14Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#FaceAmount
	 * FinancialInstrumentQuantity16Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#FaceAmount
	 * FinancialInstrumentQuantity17Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#FaceAmount
	 * FinancialInstrumentQuantity19Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#FaceAmount
	 * FinancialInstrumentQuantity20Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#FaceAmount
	 * FinancialInstrumentQuantity21Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#FaceAmount
	 * FinancialInstrumentQuantity22Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#FaceAmount
	 * FinancialInstrumentQuantityChoice.FaceAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#FaceAmount
	 * Debt1.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice#FaceAmount
	 * UnitOrFaceAmountChoice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity18Choice#FaceAmount
	 * FinancialInstrumentQuantity18Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#FaceAmount
	 * FinancialInstrumentAttributes31.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#FaceAmount
	 * FinancialInstrumentAttributes44.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice#FaceAmount
	 * UnitOrFaceAmount1Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice#FaceAmount
	 * UnitOrFaceAmountOrCodeChoice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice#FaceAmount
	 * UnitOrFaceAmountOrCode1Choice.FaceAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#FaceAmount
	 * Debt2.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#FaceAmount
	 * FinancialInstrumentQuantitySearch1Choice.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1#FaceAmount
	 * FinancialInstrumentQuantitySearch1.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity16Choice#OriginalAndCurrentFaceAmount
	 * Quantity16Choice.OriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities5#FaceAmount
	 * OriginalAndCurrentQuantities5.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity18Choice#OriginalAndCurrentFaceAmount
	 * Quantity18Choice.OriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities6#FaceAmount
	 * OriginalAndCurrentQuantities6.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity23Choice#OriginalAndCurrentFaceAmount
	 * Quantity23Choice.OriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities7#FaceAmount
	 * OriginalAndCurrentQuantities7.FaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#NominalValue
	 * FinancialInstrumentQuantity25Choice.NominalValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FaceAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice.FaceAmount, com.tools20022.repository.msg.OriginalAndCurrentQuantities1.FaceAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice.FaceAmount, com.tools20022.repository.msg.OriginalAndCurrentQuantities4.FaceAmount,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities2.FaceAmount, com.tools20022.repository.choice.Quantity4Choice.OriginalAndCurrentFaceAmount,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities3.FaceAmount, com.tools20022.repository.choice.Quantity9Choice.OriginalAndCurrentFaceAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.FaceAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice.FaceAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice.FaceAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice.FaceAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice.FaceAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice.FaceAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice.FaceAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice.FaceAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.FaceAmount, com.tools20022.repository.msg.Debt1.FaceAmount, com.tools20022.repository.choice.UnitOrFaceAmountChoice.FaceAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity18Choice.FaceAmount, com.tools20022.repository.msg.FinancialInstrumentAttributes31.FaceAmount,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.FaceAmount, com.tools20022.repository.choice.UnitOrFaceAmount1Choice.FaceAmount, com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice.FaceAmount,
					com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice.FaceAmount, com.tools20022.repository.msg.Debt2.FaceAmount, com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice.FaceAmount,
					com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1.FaceAmount, com.tools20022.repository.choice.Quantity16Choice.OriginalAndCurrentFaceAmount,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities5.FaceAmount, com.tools20022.repository.choice.Quantity18Choice.OriginalAndCurrentFaceAmount,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities6.FaceAmount, com.tools20022.repository.choice.Quantity23Choice.OriginalAndCurrentFaceAmount,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities7.FaceAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice.NominalValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity expressed as an amount representing the current amortised face
	 * amount of a bond, for example, a periodic reduction/increase of a bond's
	 * principal amount.
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice#AmortisedValue
	 * FinancialInstrumentQuantity1Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#AmortisedValue
	 * OriginalAndCurrentQuantities1.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice#AmortisedValue
	 * FinancialInstrumentQuantity15Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities4#AmortisedValue
	 * OriginalAndCurrentQuantities4.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities2#AmortisedValue
	 * OriginalAndCurrentQuantities2.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3#AmortisedValue
	 * OriginalAndCurrentQuantities3.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#AmortisedValue
	 * FinancialInstrumentQuantity2Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#AmortisedValue
	 * FinancialInstrumentQuantity14Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#AmortisedValue
	 * FinancialInstrumentQuantity16Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#AmortisedValue
	 * FinancialInstrumentQuantity17Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#AmortisedValue
	 * FinancialInstrumentQuantity19Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#AmortisedValue
	 * FinancialInstrumentQuantity20Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#AmortisedValue
	 * FinancialInstrumentQuantity21Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#AmortisedValue
	 * FinancialInstrumentQuantity22Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#AmortisedValue
	 * FinancialInstrumentQuantityChoice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#RemainingFaceValue
	 * OtherAmounts16.RemainingFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#AmortisedValue
	 * FinancialInstrumentQuantitySearch1Choice.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1#AmortisedValue
	 * FinancialInstrumentQuantitySearch1.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities5#AmortisedValue
	 * OriginalAndCurrentQuantities5.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities6#AmortisedValue
	 * OriginalAndCurrentQuantities6.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities7#AmortisedValue
	 * OriginalAndCurrentQuantities7.AmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#MonetaryValue
	 * FinancialInstrumentQuantity25Choice.MonetaryValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedFaceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmortisedFaceValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice.AmortisedValue, com.tools20022.repository.msg.OriginalAndCurrentQuantities1.AmortisedValue,
					com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice.AmortisedValue, com.tools20022.repository.msg.OriginalAndCurrentQuantities4.AmortisedValue,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities2.AmortisedValue, com.tools20022.repository.msg.OriginalAndCurrentQuantities3.AmortisedValue,
					com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice.AmortisedValue, com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice.AmortisedValue,
					com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice.AmortisedValue, com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice.AmortisedValue,
					com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice.AmortisedValue, com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice.AmortisedValue,
					com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice.AmortisedValue, com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice.AmortisedValue,
					com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.AmortisedValue, com.tools20022.repository.msg.OtherAmounts16.RemainingFaceValue,
					com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice.AmortisedValue, com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1.AmortisedValue,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities5.AmortisedValue, com.tools20022.repository.msg.OriginalAndCurrentQuantities6.AmortisedValue,
					com.tools20022.repository.msg.OriginalAndCurrentQuantities7.AmortisedValue, com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice.MonetaryValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisedFaceValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the asset holding based on current market prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#MarketPrice
	 * FinancialInstrumentAttributes3.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#MarketPrice
	 * FinancialInstrumentAttributes12.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#MarketPrice
	 * FinancialInstrumentAttributes17.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#MarketPrice
	 * FinancialInstrumentAttributes25.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#MarketPrice
	 * FinancialInstrumentAttributes46.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#MarketPrice
	 * FinancialInstrumentAttributes47.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#NetMarketValue
	 * OtherAmounts16.NetMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#MarketValue
	 * SecuritiesCollateral1.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#MarketValue
	 * OtherCollateral1.MarketValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral3#MarketValue
	 * Collateral3.MarketValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral6#MarketValue
	 * Collateral6.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#MarketValue
	 * SecuritiesCollateral2.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#MarketValue
	 * OtherCollateral2.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#MarketValue
	 * SecuritiesCollateral3.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#MarketValue
	 * OtherCollateral3.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#MarketValue
	 * OtherCollateral4.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#MarketValue
	 * SecuritiesCollateral4.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#MarketPrice
	 * FinancialInstrumentAttributes68.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#MarketValue
	 * OtherCollateral7.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#MarketValue
	 * OtherCollateral6.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#MarketValue
	 * SecuritiesCollateral6.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#MarketValue
	 * SecuritiesCollateral5.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#MarketValue
	 * OtherCollateral5.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#MarketValue
	 * SecuritiesCollateral7.MarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#MarketPrice
	 * FinancialInstrumentAttributes73.MarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#MarketValue
	 * SecuritiesCollateral8.MarketValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the asset holding based on current market prices."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarketValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes3.MarketPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes12.MarketPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes17.MarketPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes25.MarketPrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes46.MarketPrice, com.tools20022.repository.msg.FinancialInstrumentAttributes47.MarketPrice, com.tools20022.repository.msg.OtherAmounts16.NetMarketValue,
					com.tools20022.repository.msg.SecuritiesCollateral1.MarketValue, com.tools20022.repository.msg.OtherCollateral1.MarketValue, com.tools20022.repository.msg.Collateral3.MarketValue,
					com.tools20022.repository.msg.Collateral6.MarketValue, com.tools20022.repository.msg.SecuritiesCollateral2.MarketValue, com.tools20022.repository.msg.OtherCollateral2.MarketValue,
					com.tools20022.repository.msg.SecuritiesCollateral3.MarketValue, com.tools20022.repository.msg.OtherCollateral3.MarketValue, com.tools20022.repository.msg.OtherCollateral4.MarketValue,
					com.tools20022.repository.msg.SecuritiesCollateral4.MarketValue, com.tools20022.repository.msg.FinancialInstrumentAttributes68.MarketPrice, com.tools20022.repository.msg.OtherCollateral7.MarketValue,
					com.tools20022.repository.msg.OtherCollateral6.MarketValue, com.tools20022.repository.msg.SecuritiesCollateral6.MarketValue, com.tools20022.repository.msg.SecuritiesCollateral5.MarketValue,
					com.tools20022.repository.msg.OtherCollateral5.MarketValue, com.tools20022.repository.msg.SecuritiesCollateral7.MarketValue, com.tools20022.repository.msg.FinancialInstrumentAttributes73.MarketPrice,
					com.tools20022.repository.msg.SecuritiesCollateral8.MarketValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketValue";
			definition = "Value of the asset holding based on current market prices.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the balance of the asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#AssetHolding
	 * Balance.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the balance of the asset holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Specifies the balance of the asset holding.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Difference between the holding value and the book value of the asset.
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#UnrealisedGainLoss
	 * BalanceAmounts1.UnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts2#UnrealisedGainLoss
	 * BalanceAmounts2.UnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#UnrealisedGainLoss
	 * BalanceAmounts5.UnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts6#UnrealisedGainLoss
	 * BalanceAmounts6.UnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#UnrealisedGainOrLoss
	 * TotalPortfolioValuation1.UnrealisedGainOrLoss}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the holding value and the book value of the asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnrealisedGainOrLoss = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAmounts1.UnrealisedGainLoss, com.tools20022.repository.msg.BalanceAmounts2.UnrealisedGainLoss,
					com.tools20022.repository.msg.BalanceAmounts5.UnrealisedGainLoss, com.tools20022.repository.msg.BalanceAmounts6.UnrealisedGainLoss, com.tools20022.repository.msg.TotalPortfolioValuation1.UnrealisedGainOrLoss);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrealisedGainOrLoss";
			definition = "Difference between the holding value and the book value of the asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the asset included in the holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#AssetValue
	 * Asset.AssetValue}</li>
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
	 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#OtherCollateral
	 * ProposalType1Choice.OtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral4#OtherCollateral
	 * Collateral4.OtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral7#OtherCollateral
	 * Collateral7.OtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral8#OtherCollateral
	 * Collateral8.OtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral11#OtherCollateral
	 * Collateral11.OtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral12#OtherCollateral
	 * Collateral12.OtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral16#OtherCollateral
	 * Collateral16.OtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#OtherCollateral
	 * Collateral17.OtherCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the asset included in the holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProposalType1Choice.OtherCollateral, com.tools20022.repository.msg.Collateral4.OtherCollateral, com.tools20022.repository.msg.Collateral7.OtherCollateral,
					com.tools20022.repository.msg.Collateral8.OtherCollateral, com.tools20022.repository.msg.Collateral11.OtherCollateral, com.tools20022.repository.msg.Collateral12.OtherCollateral,
					com.tools20022.repository.msg.Collateral16.OtherCollateral, com.tools20022.repository.msg.Collateral17.OtherCollateral);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Specifies the asset included in the holding.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.AssetValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Percentage by which an asset's market value is reduced for the purpose of
	 * calculating capital requirement, margin and collateral levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#AssetHolding
	 * HaircutValuation.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#ValuationHaircutDetails
	 * AggregateBalanceInformation9.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#ValuationHaircutDetails
	 * AggregateBalanceInformation10.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#ValuationHaircutDetails
	 * AggregateBalanceInformation12.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#ValuationHaircutDetails
	 * AggregateBalanceInformation14.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#ValuationHaircutDetails
	 * AggregateBalanceInformation16.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#ValuationHaircutDetails
	 * AggregateBalanceInformation18.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#ValuationHaircutDetails
	 * AggregateBalanceInformation21.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#ValuationHaircutDetails
	 * AggregateBalanceInformation24.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails11.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails14.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#Haircut
	 * FinancialInstrumentStipulations.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#SecuritiesHaircut
	 * SecuritiesFinancing10.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails19.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails20.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails17.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails18.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#ValuationHaircutDetails
	 * AggregateBalanceInformation20.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#SecuritiesHaircut
	 * SecuritiesFinancing1.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument1#ValuationHaircutDetails
	 * FinancialInstrument1.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails21.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails22.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails24.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#ValuationHaircutDetails
	 * AggregateBalanceInformation25.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#ValuationHaircutDetails
	 * AggregateBalanceInformation28.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails25.SecuritiesHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral10#Haircut
	 * Collateral10.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#ValuationHaircutDetails
	 * AggregateBalanceInformation30.ValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails26.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails28.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails27.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails33.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails32.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails30.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#ValuationHaircutDetails
	 * AggregateBalanceInformation33.ValuationHaircutDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral14#Haircut
	 * Collateral14.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails35.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails36.SecuritiesHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral18#Haircut
	 * Collateral18.Haircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Haircut = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalanceInformation9.ValuationHaircutDetails, com.tools20022.repository.msg.AggregateBalanceInformation10.ValuationHaircutDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation12.ValuationHaircutDetails, com.tools20022.repository.msg.AggregateBalanceInformation14.ValuationHaircutDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation16.ValuationHaircutDetails, com.tools20022.repository.msg.AggregateBalanceInformation18.ValuationHaircutDetails,
					com.tools20022.repository.msg.AggregateBalanceInformation21.ValuationHaircutDetails, com.tools20022.repository.msg.AggregateBalanceInformation24.ValuationHaircutDetails,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.SecuritiesHaircut,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.Haircut, com.tools20022.repository.msg.SecuritiesFinancing10.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.SecuritiesHaircut,
					com.tools20022.repository.msg.AggregateBalanceInformation20.ValuationHaircutDetails, com.tools20022.repository.msg.SecuritiesFinancing1.SecuritiesHaircut,
					com.tools20022.repository.msg.FinancialInstrument1.ValuationHaircutDetails, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.SecuritiesHaircut,
					com.tools20022.repository.msg.AggregateBalanceInformation25.ValuationHaircutDetails, com.tools20022.repository.msg.AggregateBalanceInformation28.ValuationHaircutDetails,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.SecuritiesHaircut, com.tools20022.repository.msg.Collateral10.Haircut,
					com.tools20022.repository.msg.AggregateBalanceInformation30.ValuationHaircutDetails, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.SecuritiesHaircut, com.tools20022.repository.msg.AggregateBalanceInformation33.ValuationHaircutDetails,
					com.tools20022.repository.msg.Collateral14.Haircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.SecuritiesHaircut, com.tools20022.repository.msg.Collateral18.Haircut);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels.";
			minOccurs = 0;
			type_lazy = () -> HaircutValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value of the position eligible for collateral purposes. This corresponds
	 * to the sub balance with a type AvailableForCollateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#EligibleCollateralValue
	 * BalanceAmounts3.EligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#TotalEligibleCollateralValue
	 * TotalValueInPageAndStatement1.TotalEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#EligibleCollateralValue
	 * BalanceAmounts4.EligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3#TotalEligibleCollateralValue
	 * TotalValueInPageAndStatement3.TotalEligibleCollateralValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EligibleCollateralValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAmounts3.EligibleCollateralValue, com.tools20022.repository.msg.TotalValueInPageAndStatement1.TotalEligibleCollateralValue,
					com.tools20022.repository.msg.BalanceAmounts4.EligibleCollateralValue, com.tools20022.repository.msg.TotalValueInPageAndStatement3.TotalEligibleCollateralValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleCollateralValue";
			definition = "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exchange rate between the currency of the asset and the
	 * reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CalculatedAssetValue
	 * CurrencyExchange.CalculatedAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#ExchangeRate
	 * UnderlyingAttributes.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#ExchangeRate
	 * CashCollateral1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#ExchangeRate
	 * OtherCollateral1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#ExchangeRate
	 * UnderlyingAttributes2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#ExchangeRate
	 * OtherCollateral2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#ExchangeRate
	 * CashCollateral3.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#ExchangeRate
	 * OtherCollateral3.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#ExchangeRate
	 * CashCollateral4.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#ExchangeRate
	 * CashCollateral2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#ExchangeRate
	 * OtherCollateral4.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#ExchangeRate
	 * CashCollateral5.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#ExchangeRate
	 * OtherCollateral7.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#ExchangeRate
	 * OtherCollateral6.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#ExchangeRate
	 * OtherCollateral5.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#ForeignExchange
	 * AssetClassAttributes1Choice.ForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassAttributes1#ForeignExchange
	 * AssetClassAttributes1.ForeignExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate between the currency of the asset and the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingAttributes.ExchangeRate, com.tools20022.repository.msg.CashCollateral1.ExchangeRate, com.tools20022.repository.msg.OtherCollateral1.ExchangeRate,
					com.tools20022.repository.msg.UnderlyingAttributes2.ExchangeRate, com.tools20022.repository.msg.OtherCollateral2.ExchangeRate, com.tools20022.repository.msg.CashCollateral3.ExchangeRate,
					com.tools20022.repository.msg.OtherCollateral3.ExchangeRate, com.tools20022.repository.msg.CashCollateral4.ExchangeRate, com.tools20022.repository.msg.CashCollateral2.ExchangeRate,
					com.tools20022.repository.msg.OtherCollateral4.ExchangeRate, com.tools20022.repository.msg.CashCollateral5.ExchangeRate, com.tools20022.repository.msg.OtherCollateral7.ExchangeRate,
					com.tools20022.repository.msg.OtherCollateral6.ExchangeRate, com.tools20022.repository.msg.OtherCollateral5.ExchangeRate, com.tools20022.repository.choice.AssetClassAttributes1Choice.ForeignExchange,
					com.tools20022.repository.msg.AssetClassAttributes1.ForeignExchange);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the asset and the reporting currency.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum notional value for a financial instrument that is capped.
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#CapValue
	 * UnderlyingAttributes.CapValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#CapValue
	 * UnderlyingAttributes2.CapValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum notional value for a financial instrument that is capped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CapValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingAttributes.CapValue, com.tools20022.repository.msg.UnderlyingAttributes2.CapValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapValue";
			definition = "Maximum notional value for a financial instrument that is capped.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the asset holding after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#CollateralValue
	 * SecuritiesCollateral1.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#CollateralValue
	 * CashCollateral1.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#CollateralValue
	 * OtherCollateral1.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#CollateralValue
	 * SecuritiesCollateral2.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#CollateralValue
	 * OtherCollateral2.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#CollateralValue
	 * CashCollateral3.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#CollateralValue
	 * SecuritiesCollateral3.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#CollateralValue
	 * OtherCollateral3.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#CollateralValue
	 * CashCollateral4.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#CollateralValue
	 * CashCollateral2.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#CollateralValue
	 * OtherCollateral4.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#CollateralValue
	 * SecuritiesCollateral4.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#CollateralValue
	 * CashCollateral5.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#CollateralValue
	 * OtherCollateral7.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#CollateralValue
	 * OtherCollateral6.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#CollateralValue
	 * SecuritiesCollateral6.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#CollateralValue
	 * SecuritiesCollateral5.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#CollateralValue
	 * OtherCollateral5.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#CollateralValue
	 * SecuritiesCollateral7.CollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#CollateralValue
	 * SecuritiesCollateral8.CollateralValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskAdjustedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RiskAdjustedValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesCollateral1.CollateralValue, com.tools20022.repository.msg.CashCollateral1.CollateralValue,
					com.tools20022.repository.msg.OtherCollateral1.CollateralValue, com.tools20022.repository.msg.SecuritiesCollateral2.CollateralValue, com.tools20022.repository.msg.OtherCollateral2.CollateralValue,
					com.tools20022.repository.msg.CashCollateral3.CollateralValue, com.tools20022.repository.msg.SecuritiesCollateral3.CollateralValue, com.tools20022.repository.msg.OtherCollateral3.CollateralValue,
					com.tools20022.repository.msg.CashCollateral4.CollateralValue, com.tools20022.repository.msg.CashCollateral2.CollateralValue, com.tools20022.repository.msg.OtherCollateral4.CollateralValue,
					com.tools20022.repository.msg.SecuritiesCollateral4.CollateralValue, com.tools20022.repository.msg.CashCollateral5.CollateralValue, com.tools20022.repository.msg.OtherCollateral7.CollateralValue,
					com.tools20022.repository.msg.OtherCollateral6.CollateralValue, com.tools20022.repository.msg.SecuritiesCollateral6.CollateralValue, com.tools20022.repository.msg.SecuritiesCollateral5.CollateralValue,
					com.tools20022.repository.msg.OtherCollateral5.CollateralValue, com.tools20022.repository.msg.SecuritiesCollateral7.CollateralValue, com.tools20022.repository.msg.SecuritiesCollateral8.CollateralValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskAdjustedValue";
			definition = "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Difference between the realised value caused by the actual
	 * trade/re-evaluation and the book value of the asset.
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#RealisedGainOrLoss
	 * TotalPortfolioValuation1.RealisedGainOrLoss}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RealisedGainOrLoss = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.RealisedGainOrLoss);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealisedGainOrLoss";
			definition = "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the unrealised amount is a gain or a loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnrealisedCode
	 * UnrealisedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#Unrealised
	 * BalanceDetails6.Unrealised}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#Unrealised
	 * BalanceDetails5.Unrealised}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the unrealised amount is a gain or a loss."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnrealisedType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails6.Unrealised, com.tools20022.repository.msg.BalanceDetails5.Unrealised);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrealisedType";
			definition = "Specifies whether the unrealised amount is a gain or a loss.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnrealisedCode.mmObject();
		}
	};
	/**
	 * Value of the collateral after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this collateral.
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
	 * {@linkplain com.tools20022.repository.msg.Collateral3#PostHaircutValue
	 * Collateral3.PostHaircutValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral6#PostHaircutValue
	 * Collateral6.PostHaircutValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostHaircutValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostHaircutValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Collateral3.PostHaircutValue, com.tools20022.repository.msg.Collateral6.PostHaircutValue);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostHaircutValue";
			definition = "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * interest relative to the asset and the parameters used to calculate it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#RelatedAssetHolding
	 * Interest.RelatedAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#Interest
	 * AssetClassAttributes1Choice.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassAttributes1#Interest
	 * AssetClassAttributes1.Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#InflationIndex
	 * InterestRateDerivative5.InflationIndex}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "interest relative to the asset and the parameters used to calculate it."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassAttributes1Choice.Interest, com.tools20022.repository.msg.AssetClassAttributes1.Interest,
					com.tools20022.repository.msg.InterestRateDerivative5.InflationIndex);
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "interest relative to the asset and the parameters used to calculate it.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the collateral information in relation with some assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#AssetHolding
	 * Collateral.AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with some assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral information in relation with some assets.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the asset type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the asset type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialAssetType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetType";
			definition = "Specifies the asset type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#VariationMarginAssetHolding
	 * Collateral.VariationMarginAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with the segregated independent amount asset holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariationMarginCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariationMarginCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#SegregatedIndependentAmountAssetHolding
	 * Collateral.SegregatedIndependentAmountAssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral information in relation with the segregated independent amount asset holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IndependentAmountCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
	 * BlockedReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of holding."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingType";
			definition = "Specifies the type of holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BlockedReasonCode.mmObject();
		}
	};
	/**
	 * Amount of the bank guarantee.
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the bank guarantee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GuaranteeAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteeAmount";
			definition = "Amount of the bank guarantee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetHolding";
				definition = "Specifies in terms of value and quantity the assets.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.AssetValue, com.tools20022.repository.entity.Balance.AssetHolding, com.tools20022.repository.entity.Interest.RelatedAssetHolding,
						com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue, com.tools20022.repository.entity.Collateral.AssetHolding, com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.HaircutValuation.AssetHolding);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1.Holdings, com.tools20022.repository.msg.AggregateHoldingBalance1.BalanceForFinancialInstrument);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetHolding.HoldingValue, com.tools20022.repository.entity.AssetHolding.BookValue, com.tools20022.repository.entity.AssetHolding.FaceAmount,
						com.tools20022.repository.entity.AssetHolding.AmortisedFaceValue, com.tools20022.repository.entity.AssetHolding.MarketValue, com.tools20022.repository.entity.AssetHolding.Balance,
						com.tools20022.repository.entity.AssetHolding.UnrealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.Asset, com.tools20022.repository.entity.AssetHolding.Haircut,
						com.tools20022.repository.entity.AssetHolding.EligibleCollateralValue, com.tools20022.repository.entity.AssetHolding.ExchangeRate, com.tools20022.repository.entity.AssetHolding.CapValue,
						com.tools20022.repository.entity.AssetHolding.RiskAdjustedValue, com.tools20022.repository.entity.AssetHolding.RealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.UnrealisedType,
						com.tools20022.repository.entity.AssetHolding.PostHaircutValue, com.tools20022.repository.entity.AssetHolding.Interest, com.tools20022.repository.entity.AssetHolding.Collateral,
						com.tools20022.repository.entity.AssetHolding.FinancialAssetType, com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral, com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral,
						com.tools20022.repository.entity.AssetHolding.HoldingType, com.tools20022.repository.entity.AssetHolding.GuaranteeAmount);
				derivationComponent_lazy = () -> Arrays.asList(BalanceAmounts1.mmObject(), BalanceAmounts2.mmObject(), BalanceAmounts5.mmObject(), BalanceAmounts6.mmObject(), BalanceAmounts3.mmObject(), BalanceAmounts4.mmObject(),
						FinancialInstrumentAggregateBalance1.mmObject(), FinancialInstrumentAggregateBalance1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}