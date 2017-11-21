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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.BlockedReasonCode;
import com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode;
import com.tools20022.repository.codeset.UnrealisedCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
 * AssetHolding.mmHoldingValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
 * AssetHolding.mmBookValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
 * AssetHolding.mmFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
 * AssetHolding.mmAmortisedFaceValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
 * AssetHolding.mmMarketValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmBalance
 * AssetHolding.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedGainOrLoss
 * AssetHolding.mmUnrealisedGainOrLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
 * AssetHolding.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
 * AssetHolding.mmHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmEligibleCollateralValue
 * AssetHolding.mmEligibleCollateralValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
 * AssetHolding.mmExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmCapValue
 * AssetHolding.mmCapValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRiskAdjustedValue
 * AssetHolding.mmRiskAdjustedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRealisedGainOrLoss
 * AssetHolding.mmRealisedGainOrLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedType
 * AssetHolding.mmUnrealisedType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmPostHaircutValue
 * AssetHolding.mmPostHaircutValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
 * AssetHolding.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmCollateral
 * AssetHolding.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFinancialAssetType
 * AssetHolding.mmFinancialAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmVariationMarginCollateral
 * AssetHolding.mmVariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmIndependentAmountCollateral
 * AssetHolding.mmIndependentAmountCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingType
 * AssetHolding.mmHoldingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmGuaranteeAmount
 * AssetHolding.mmGuaranteeAmount}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
 * Asset.mmAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
 * Balance.mmAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
 * Interest.mmRelatedAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCalculatedAssetValue
 * CurrencyExchange.mmCalculatedAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmAssetHolding
 * Collateral.mmAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmVariationMarginAssetHolding
 * Collateral.mmVariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmSegregatedIndependentAmountAssetHolding
 * Collateral.mmSegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmAssetHolding
 * HaircutValuation.mmAssetHolding}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#mmHoldings
 * FinancialInstrumentAggregateBalance1.mmHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmBalanceForFinancialInstrument
 * AggregateHoldingBalance1.mmBalanceForFinancialInstrument}</li>
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
 * "AssetHolding"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies in terms of value and quantity the assets."</li>
 * </ul>
 */
public class AssetHolding {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyAndAmount holdingValue;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#mmAverageAcquisitionPrice
	 * FinancialInstrument26.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#mmAverageAcquisitionPrice
	 * FinancialInstrument30.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#mmAverageAcquisitionPrice
	 * FinancialInstrument24.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#mmAverageAcquisitionPrice
	 * FinancialInstrument33.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#mmAverageAcquisitionPrice
	 * FinancialInstrument23.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmHoldingValue
	 * BalanceAmounts1.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmPreviousHoldingValue
	 * BalanceAmounts1.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts2#mmHoldingValue
	 * BalanceAmounts2.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmHoldingValue
	 * BalanceAmounts5.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmPreviousHoldingValue
	 * BalanceAmounts5.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts6#mmHoldingValue
	 * BalanceAmounts6.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmHoldingValue
	 * AggregateBalancePerSafekeepingPlace2.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmHoldingValue
	 * AggregateBalanceInformation2.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmHoldingValue
	 * AggregateBalancePerSafekeepingPlace4.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmPreviousHoldingValue
	 * AggregateBalancePerSafekeepingPlace4.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmHoldingValue
	 * AggregateBalanceInformation3.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmPreviousHoldingValue
	 * AggregateBalanceInformation3.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmHoldingValue
	 * BalanceAmounts3.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmPreviousHoldingValue
	 * BalanceAmounts3.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#mmHoldingValue
	 * BalanceAmounts4.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#mmPreviousHoldingValue
	 * BalanceAmounts4.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmHoldingValue
	 * AggregateBalancePerSafekeepingPlace1.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmHoldingValue
	 * AggregateBalanceInformation1.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmHoldingValue
	 * AggregateBalancePerSafekeepingPlace3.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmPreviousHoldingValue
	 * AggregateBalancePerSafekeepingPlace3.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmHoldingValue
	 * AggregateBalanceInformation4.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmPreviousHoldingValue
	 * AggregateBalanceInformation4.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral1#mmAmount
	 * OtherTypeOfCollateral1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmHoldingValue
	 * AggregateBalanceInformation5.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmPreviousHoldingValue
	 * AggregateBalanceInformation5.mmPreviousHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmAverageAcquisitionPrice
	 * FinancialInstrument37.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmAverageAcquisitionPrice
	 * FinancialInstrument35.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmAverageAcquisitionPrice
	 * FinancialInstrument40.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmNominalValuePerUnit
	 * DebtInstrument2.mmNominalValuePerUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmAverageAcquisitionPrice
	 * FinancialInstrument48.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmAverageAcquisitionPrice
	 * FinancialInstrument47.mmAverageAcquisitionPrice}</li>
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
	public static final MMBusinessAttribute mmHoldingValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument26.mmAverageAcquisitionPrice, FinancialInstrument30.mmAverageAcquisitionPrice, FinancialInstrument24.mmAverageAcquisitionPrice,
					FinancialInstrument33.mmAverageAcquisitionPrice, FinancialInstrument23.mmAverageAcquisitionPrice, BalanceAmounts1.mmHoldingValue, BalanceAmounts1.mmPreviousHoldingValue, BalanceAmounts2.mmHoldingValue,
					BalanceAmounts5.mmHoldingValue, BalanceAmounts5.mmPreviousHoldingValue, BalanceAmounts6.mmHoldingValue, AggregateBalancePerSafekeepingPlace2.mmHoldingValue, AggregateBalanceInformation2.mmHoldingValue,
					AggregateBalancePerSafekeepingPlace4.mmHoldingValue, AggregateBalancePerSafekeepingPlace4.mmPreviousHoldingValue, AggregateBalanceInformation3.mmHoldingValue, AggregateBalanceInformation3.mmPreviousHoldingValue,
					BalanceAmounts3.mmHoldingValue, BalanceAmounts3.mmPreviousHoldingValue, BalanceAmounts4.mmHoldingValue, BalanceAmounts4.mmPreviousHoldingValue, AggregateBalancePerSafekeepingPlace1.mmHoldingValue,
					AggregateBalanceInformation1.mmHoldingValue, AggregateBalancePerSafekeepingPlace3.mmHoldingValue, AggregateBalancePerSafekeepingPlace3.mmPreviousHoldingValue, AggregateBalanceInformation4.mmHoldingValue,
					AggregateBalanceInformation4.mmPreviousHoldingValue, OtherTypeOfCollateral1.mmAmount, AggregateBalanceInformation5.mmHoldingValue, AggregateBalanceInformation5.mmPreviousHoldingValue,
					FinancialInstrument37.mmAverageAcquisitionPrice, FinancialInstrument35.mmAverageAcquisitionPrice, FinancialInstrument40.mmAverageAcquisitionPrice, DebtInstrument2.mmNominalValuePerUnit,
					FinancialInstrument48.mmAverageAcquisitionPrice, FinancialInstrument47.mmAverageAcquisitionPrice);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingValue";
			definition = "Value of the balance of an individual securities holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getHoldingValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount bookValue;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#mmTotalBookValue
	 * FinancialInstrument26.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#mmTotalBookValue
	 * FinancialInstrument30.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#mmTotalBookValue
	 * FinancialInstrument24.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#mmTotalBookValue
	 * FinancialInstrument33.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#mmTotalBookValue
	 * FinancialInstrument23.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#mmAverageAcquisitionPrice
	 * FinancialInstrument31.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#mmTotalBookValue
	 * FinancialInstrument31.mmTotalBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer4#mmAveragePrice
	 * Transfer4.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer7#mmAveragePrice
	 * Transfer7.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer17#mmAveragePrice
	 * Transfer17.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer2#mmAveragePrice
	 * Transfer2.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer10#mmAveragePrice
	 * Transfer10.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer14#mmAveragePrice
	 * Transfer14.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer24#mmAveragePrice
	 * Transfer24.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer25#mmAveragePrice
	 * Transfer25.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer1#mmAveragePrice
	 * Transfer1.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer9#mmAveragePrice
	 * Transfer9.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer12#mmAveragePrice
	 * Transfer12.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer20#mmAveragePrice
	 * Transfer20.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer18#mmAveragePrice
	 * Transfer18.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer26#mmAveragePrice
	 * Transfer26.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer13#mmAveragePrice
	 * Transfer13.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer23#mmAveragePrice
	 * Transfer23.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer8#mmAveragePrice
	 * Transfer8.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer11#mmAveragePrice
	 * Transfer11.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer19#mmAveragePrice
	 * Transfer19.mmAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmBookValue
	 * BalanceAmounts1.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts2#mmBookValue
	 * BalanceAmounts2.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmBookValue
	 * BalanceAmounts5.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts6#mmBookValue
	 * BalanceAmounts6.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmBookValue
	 * AggregateBalancePerSafekeepingPlace2.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmBookValue
	 * AggregateBalanceInformation2.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmBookValue
	 * AggregateBalancePerSafekeepingPlace4.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmBookValue
	 * AggregateBalanceInformation3.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmBookValue
	 * BalanceAmounts3.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#mmBookValue
	 * BalanceAmounts4.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmBookValue
	 * AggregateBalancePerSafekeepingPlace1.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmBookValue
	 * AggregateBalanceInformation1.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmBookValue
	 * AggregateBalancePerSafekeepingPlace3.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmBookValue
	 * AggregateBalanceInformation4.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#mmBookValue
	 * OtherAmounts4.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#mmBookValue
	 * OtherAmounts5.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmBookValue
	 * OtherAmounts17.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#mmBookValue
	 * OtherAmounts23.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmBookValue
	 * OtherAmounts9.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#mmBookValue
	 * OtherAmounts10.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#mmBookValue
	 * OtherAmounts18.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#mmBookValue
	 * OtherAmounts24.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmBookValue
	 * OtherAmounts16.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRemainingBookValue
	 * OtherAmounts16.mmRemainingBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation5#mmBookValue
	 * AggregateBalanceInformation5.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer27#mmAveragePrice
	 * Transfer27.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer28#mmAveragePrice
	 * Transfer28.mmAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmNewAveragePrice
	 * Transfer28.mmNewAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer29#mmAveragePrice
	 * Transfer29.mmAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#mmNewAveragePrice
	 * Transfer29.mmNewAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmTotalBookValue
	 * FinancialInstrument37.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmTotalBookValue
	 * FinancialInstrument35.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmAverageAcquisitionPrice
	 * FinancialInstrument34.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmTotalBookValue
	 * FinancialInstrument34.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmTotalBookValue
	 * FinancialInstrument40.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmAverageAcquisitionPrice
	 * FinancialInstrument39.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmTotalBookValue
	 * FinancialInstrument39.mmTotalBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#mmBookValue
	 * OtherAmounts30.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmBookValue
	 * OtherAmounts31.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmAveragePrice
	 * Transfer31.mmAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#mmNewAveragePrice
	 * Transfer31.mmNewAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmAveragePrice
	 * Transfer30.mmAveragePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer33#mmAveragePrice
	 * Transfer33.mmAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#mmNewAveragePrice
	 * Transfer33.mmNewAveragePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmTotalBookValue
	 * FinancialInstrument48.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmTotalBookValue
	 * FinancialInstrument47.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmAverageAcquisitionPrice
	 * FinancialInstrument46.mmAverageAcquisitionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmTotalBookValue
	 * FinancialInstrument46.mmTotalBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#mmBookValue
	 * OtherAmounts34.mmBookValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#mmBookValue
	 * OtherAmounts38.mmBookValue}</li>
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
	public static final MMBusinessAttribute mmBookValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument26.mmTotalBookValue, FinancialInstrument30.mmTotalBookValue, FinancialInstrument24.mmTotalBookValue, FinancialInstrument33.mmTotalBookValue,
					FinancialInstrument23.mmTotalBookValue, FinancialInstrument31.mmAverageAcquisitionPrice, FinancialInstrument31.mmTotalBookValue, Transfer4.mmAveragePrice, Transfer7.mmAveragePrice, Transfer17.mmAveragePrice,
					Transfer2.mmAveragePrice, Transfer10.mmAveragePrice, Transfer14.mmAveragePrice, Transfer24.mmAveragePrice, Transfer25.mmAveragePrice, Transfer1.mmAveragePrice, Transfer9.mmAveragePrice, Transfer12.mmAveragePrice,
					Transfer20.mmAveragePrice, Transfer18.mmAveragePrice, Transfer26.mmAveragePrice, Transfer13.mmAveragePrice, Transfer23.mmAveragePrice, Transfer8.mmAveragePrice, Transfer11.mmAveragePrice, Transfer19.mmAveragePrice,
					BalanceAmounts1.mmBookValue, BalanceAmounts2.mmBookValue, BalanceAmounts5.mmBookValue, BalanceAmounts6.mmBookValue, AggregateBalancePerSafekeepingPlace2.mmBookValue, AggregateBalanceInformation2.mmBookValue,
					AggregateBalancePerSafekeepingPlace4.mmBookValue, AggregateBalanceInformation3.mmBookValue, BalanceAmounts3.mmBookValue, BalanceAmounts4.mmBookValue, AggregateBalancePerSafekeepingPlace1.mmBookValue,
					AggregateBalanceInformation1.mmBookValue, AggregateBalancePerSafekeepingPlace3.mmBookValue, AggregateBalanceInformation4.mmBookValue, OtherAmounts4.mmBookValue, OtherAmounts5.mmBookValue, OtherAmounts17.mmBookValue,
					OtherAmounts23.mmBookValue, OtherAmounts9.mmBookValue, OtherAmounts10.mmBookValue, OtherAmounts18.mmBookValue, OtherAmounts24.mmBookValue, OtherAmounts16.mmBookValue, OtherAmounts16.mmRemainingBookValue,
					AggregateBalanceInformation5.mmBookValue, Transfer27.mmAveragePrice, Transfer28.mmAveragePrice, Transfer28.mmNewAveragePrice, Transfer29.mmAveragePrice, Transfer29.mmNewAveragePrice,
					FinancialInstrument37.mmTotalBookValue, FinancialInstrument35.mmTotalBookValue, FinancialInstrument34.mmAverageAcquisitionPrice, FinancialInstrument34.mmTotalBookValue, FinancialInstrument40.mmTotalBookValue,
					FinancialInstrument39.mmAverageAcquisitionPrice, FinancialInstrument39.mmTotalBookValue, OtherAmounts30.mmBookValue, OtherAmounts31.mmBookValue, Transfer31.mmAveragePrice, Transfer31.mmNewAveragePrice,
					Transfer30.mmAveragePrice, Transfer33.mmAveragePrice, Transfer33.mmNewAveragePrice, FinancialInstrument48.mmTotalBookValue, FinancialInstrument47.mmTotalBookValue, FinancialInstrument46.mmAverageAcquisitionPrice,
					FinancialInstrument46.mmTotalBookValue, OtherAmounts34.mmBookValue, OtherAmounts38.mmBookValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookValue";
			definition = "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getBookValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount faceAmount;
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice#mmFaceAmount
	 * FinancialInstrumentQuantity1Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#mmFaceAmount
	 * OriginalAndCurrentQuantities1.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice#mmFaceAmount
	 * FinancialInstrumentQuantity15Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities4#mmFaceAmount
	 * OriginalAndCurrentQuantities4.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities2#mmFaceAmount
	 * OriginalAndCurrentQuantities2.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity4Choice#mmOriginalAndCurrentFaceAmount
	 * Quantity4Choice.mmOriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3#mmFaceAmount
	 * OriginalAndCurrentQuantities3.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity9Choice#mmOriginalAndCurrentFaceAmount
	 * Quantity9Choice.mmOriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmFaceAmount
	 * FinancialInstrumentQuantity2Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#mmFaceAmount
	 * FinancialInstrumentQuantity14Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#mmFaceAmount
	 * FinancialInstrumentQuantity16Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#mmFaceAmount
	 * FinancialInstrumentQuantity17Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#mmFaceAmount
	 * FinancialInstrumentQuantity19Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#mmFaceAmount
	 * FinancialInstrumentQuantity20Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#mmFaceAmount
	 * FinancialInstrumentQuantity21Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#mmFaceAmount
	 * FinancialInstrumentQuantity22Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmFaceAmount
	 * FinancialInstrumentQuantityChoice.mmFaceAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmFaceAmount
	 * Debt1.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountChoice#mmFaceAmount
	 * UnitOrFaceAmountChoice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity18Choice#mmFaceAmount
	 * FinancialInstrumentQuantity18Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmFaceAmount
	 * FinancialInstrumentAttributes31.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmFaceAmount
	 * FinancialInstrumentAttributes44.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice#mmFaceAmount
	 * UnitOrFaceAmount1Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCodeChoice#mmFaceAmount
	 * UnitOrFaceAmountOrCodeChoice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmountOrCode1Choice#mmFaceAmount
	 * UnitOrFaceAmountOrCode1Choice.mmFaceAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmFaceAmount
	 * Debt2.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#mmFaceAmount
	 * FinancialInstrumentQuantitySearch1Choice.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1#mmFaceAmount
	 * FinancialInstrumentQuantitySearch1.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity16Choice#mmOriginalAndCurrentFaceAmount
	 * Quantity16Choice.mmOriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities5#mmFaceAmount
	 * OriginalAndCurrentQuantities5.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity18Choice#mmOriginalAndCurrentFaceAmount
	 * Quantity18Choice.mmOriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities6#mmFaceAmount
	 * OriginalAndCurrentQuantities6.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Quantity23Choice#mmOriginalAndCurrentFaceAmount
	 * Quantity23Choice.mmOriginalAndCurrentFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities7#mmFaceAmount
	 * OriginalAndCurrentQuantities7.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#mmNominalValue
	 * FinancialInstrumentQuantity25Choice.mmNominalValue}</li>
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
	public static final MMBusinessAttribute mmFaceAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentQuantity1Choice.mmFaceAmount, OriginalAndCurrentQuantities1.mmFaceAmount, FinancialInstrumentQuantity15Choice.mmFaceAmount, OriginalAndCurrentQuantities4.mmFaceAmount,
					OriginalAndCurrentQuantities2.mmFaceAmount, Quantity4Choice.mmOriginalAndCurrentFaceAmount, OriginalAndCurrentQuantities3.mmFaceAmount, Quantity9Choice.mmOriginalAndCurrentFaceAmount,
					FinancialInstrumentQuantity2Choice.mmFaceAmount, FinancialInstrumentQuantity14Choice.mmFaceAmount, FinancialInstrumentQuantity16Choice.mmFaceAmount, FinancialInstrumentQuantity17Choice.mmFaceAmount,
					FinancialInstrumentQuantity19Choice.mmFaceAmount, FinancialInstrumentQuantity20Choice.mmFaceAmount, FinancialInstrumentQuantity21Choice.mmFaceAmount, FinancialInstrumentQuantity22Choice.mmFaceAmount,
					FinancialInstrumentQuantityChoice.mmFaceAmount, Debt1.mmFaceAmount, UnitOrFaceAmountChoice.mmFaceAmount, FinancialInstrumentQuantity18Choice.mmFaceAmount, FinancialInstrumentAttributes31.mmFaceAmount,
					FinancialInstrumentAttributes44.mmFaceAmount, UnitOrFaceAmount1Choice.mmFaceAmount, UnitOrFaceAmountOrCodeChoice.mmFaceAmount, UnitOrFaceAmountOrCode1Choice.mmFaceAmount, Debt2.mmFaceAmount,
					FinancialInstrumentQuantitySearch1Choice.mmFaceAmount, FinancialInstrumentQuantitySearch1.mmFaceAmount, Quantity16Choice.mmOriginalAndCurrentFaceAmount, OriginalAndCurrentQuantities5.mmFaceAmount,
					Quantity18Choice.mmOriginalAndCurrentFaceAmount, OriginalAndCurrentQuantities6.mmFaceAmount, Quantity23Choice.mmOriginalAndCurrentFaceAmount, OriginalAndCurrentQuantities7.mmFaceAmount,
					FinancialInstrumentQuantity25Choice.mmNominalValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getFaceAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amortisedFaceValue;
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
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity1Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities1#mmAmortisedValue
	 * OriginalAndCurrentQuantities1.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity15Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities4#mmAmortisedValue
	 * OriginalAndCurrentQuantities4.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities2#mmAmortisedValue
	 * OriginalAndCurrentQuantities2.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities3#mmAmortisedValue
	 * OriginalAndCurrentQuantities3.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity2Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity2Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity14Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity14Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity16Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity16Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity17Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity17Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity19Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity19Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity20Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity20Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity21Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity21Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity22Choice#mmAmortisedValue
	 * FinancialInstrumentQuantity22Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmAmortisedValue
	 * FinancialInstrumentQuantityChoice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRemainingFaceValue
	 * OtherAmounts16.mmRemainingFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantitySearch1Choice#mmAmortisedValue
	 * FinancialInstrumentQuantitySearch1Choice.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantitySearch1#mmAmortisedValue
	 * FinancialInstrumentQuantitySearch1.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities5#mmAmortisedValue
	 * OriginalAndCurrentQuantities5.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities6#mmAmortisedValue
	 * OriginalAndCurrentQuantities6.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAndCurrentQuantities7#mmAmortisedValue
	 * OriginalAndCurrentQuantities7.mmAmortisedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#mmMonetaryValue
	 * FinancialInstrumentQuantity25Choice.mmMonetaryValue}</li>
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
	public static final MMBusinessAttribute mmAmortisedFaceValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentQuantity1Choice.mmAmortisedValue, OriginalAndCurrentQuantities1.mmAmortisedValue, FinancialInstrumentQuantity15Choice.mmAmortisedValue,
					OriginalAndCurrentQuantities4.mmAmortisedValue, OriginalAndCurrentQuantities2.mmAmortisedValue, OriginalAndCurrentQuantities3.mmAmortisedValue, FinancialInstrumentQuantity2Choice.mmAmortisedValue,
					FinancialInstrumentQuantity14Choice.mmAmortisedValue, FinancialInstrumentQuantity16Choice.mmAmortisedValue, FinancialInstrumentQuantity17Choice.mmAmortisedValue, FinancialInstrumentQuantity19Choice.mmAmortisedValue,
					FinancialInstrumentQuantity20Choice.mmAmortisedValue, FinancialInstrumentQuantity21Choice.mmAmortisedValue, FinancialInstrumentQuantity22Choice.mmAmortisedValue, FinancialInstrumentQuantityChoice.mmAmortisedValue,
					OtherAmounts16.mmRemainingFaceValue, FinancialInstrumentQuantitySearch1Choice.mmAmortisedValue, FinancialInstrumentQuantitySearch1.mmAmortisedValue, OriginalAndCurrentQuantities5.mmAmortisedValue,
					OriginalAndCurrentQuantities6.mmAmortisedValue, OriginalAndCurrentQuantities7.mmAmortisedValue, FinancialInstrumentQuantity25Choice.mmMonetaryValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmortisedFaceValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getAmortisedFaceValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount marketValue;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmMarketPrice
	 * FinancialInstrumentAttributes3.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmMarketPrice
	 * FinancialInstrumentAttributes12.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmMarketPrice
	 * FinancialInstrumentAttributes17.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmMarketPrice
	 * FinancialInstrumentAttributes25.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmMarketPrice
	 * FinancialInstrumentAttributes46.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmMarketPrice
	 * FinancialInstrumentAttributes47.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmNetMarketValue
	 * OtherAmounts16.mmNetMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#mmMarketValue
	 * SecuritiesCollateral1.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmMarketValue
	 * OtherCollateral1.mmMarketValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral3#mmMarketValue
	 * Collateral3.mmMarketValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral6#mmMarketValue
	 * Collateral6.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmMarketValue
	 * SecuritiesCollateral2.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmMarketValue
	 * OtherCollateral2.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmMarketValue
	 * SecuritiesCollateral3.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmMarketValue
	 * OtherCollateral3.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmMarketValue
	 * OtherCollateral4.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmMarketValue
	 * SecuritiesCollateral4.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmMarketPrice
	 * FinancialInstrumentAttributes68.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmMarketValue
	 * OtherCollateral7.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmMarketValue
	 * OtherCollateral6.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmMarketValue
	 * SecuritiesCollateral6.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmMarketValue
	 * SecuritiesCollateral5.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmMarketValue
	 * OtherCollateral5.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmMarketValue
	 * SecuritiesCollateral7.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmMarketPrice
	 * FinancialInstrumentAttributes73.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmMarketValue
	 * SecuritiesCollateral8.mmMarketValue}</li>
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
	public static final MMBusinessAttribute mmMarketValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes3.mmMarketPrice, FinancialInstrumentAttributes12.mmMarketPrice, FinancialInstrumentAttributes17.mmMarketPrice, FinancialInstrumentAttributes25.mmMarketPrice,
					FinancialInstrumentAttributes46.mmMarketPrice, FinancialInstrumentAttributes47.mmMarketPrice, OtherAmounts16.mmNetMarketValue, SecuritiesCollateral1.mmMarketValue, OtherCollateral1.mmMarketValue,
					Collateral3.mmMarketValue, Collateral6.mmMarketValue, SecuritiesCollateral2.mmMarketValue, OtherCollateral2.mmMarketValue, SecuritiesCollateral3.mmMarketValue, OtherCollateral3.mmMarketValue,
					OtherCollateral4.mmMarketValue, SecuritiesCollateral4.mmMarketValue, FinancialInstrumentAttributes68.mmMarketPrice, OtherCollateral7.mmMarketValue, OtherCollateral6.mmMarketValue, SecuritiesCollateral6.mmMarketValue,
					SecuritiesCollateral5.mmMarketValue, OtherCollateral5.mmMarketValue, SecuritiesCollateral7.mmMarketValue, FinancialInstrumentAttributes73.mmMarketPrice, SecuritiesCollateral8.mmMarketValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketValue";
			definition = "Value of the asset holding based on current market prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getMarketValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Balance> balance;
	/**
	 * Specifies the balance of the asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAssetHolding
	 * Balance.mmAssetHolding}</li>
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
	public static final MMBusinessAssociationEnd mmBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Specifies the balance of the asset holding.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.mmAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	protected CurrencyAndAmount unrealisedGainOrLoss;
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmUnrealisedGainLoss
	 * BalanceAmounts1.mmUnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts2#mmUnrealisedGainLoss
	 * BalanceAmounts2.mmUnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts5#mmUnrealisedGainLoss
	 * BalanceAmounts5.mmUnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts6#mmUnrealisedGainLoss
	 * BalanceAmounts6.mmUnrealisedGainLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmUnrealisedGainOrLoss
	 * TotalPortfolioValuation1.mmUnrealisedGainOrLoss}</li>
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
	public static final MMBusinessAttribute mmUnrealisedGainOrLoss = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAmounts1.mmUnrealisedGainLoss, BalanceAmounts2.mmUnrealisedGainLoss, BalanceAmounts5.mmUnrealisedGainLoss, BalanceAmounts6.mmUnrealisedGainLoss,
					TotalPortfolioValuation1.mmUnrealisedGainOrLoss);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnrealisedGainOrLoss";
			definition = "Difference between the holding value and the book value of the asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getUnrealisedGainOrLoss", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Asset asset;
	/**
	 * Specifies the asset included in the holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
	 * Asset.mmAssetValue}</li>
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
	 * {@linkplain com.tools20022.repository.choice.ProposalType1Choice#mmOtherCollateral
	 * ProposalType1Choice.mmOtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral4#mmOtherCollateral
	 * Collateral4.mmOtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral7#mmOtherCollateral
	 * Collateral7.mmOtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral8#mmOtherCollateral
	 * Collateral8.mmOtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral11#mmOtherCollateral
	 * Collateral11.mmOtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral12#mmOtherCollateral
	 * Collateral12.mmOtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral16#mmOtherCollateral
	 * Collateral16.mmOtherCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral17#mmOtherCollateral
	 * Collateral17.mmOtherCollateral}</li>
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
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ProposalType1Choice.mmOtherCollateral, Collateral4.mmOtherCollateral, Collateral7.mmOtherCollateral, Collateral8.mmOtherCollateral, Collateral11.mmOtherCollateral,
					Collateral12.mmOtherCollateral, Collateral16.mmOtherCollateral, Collateral17.mmOtherCollateral);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Specifies the asset included in the holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmAssetValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.HaircutValuation> haircut;
	/**
	 * Percentage by which an asset's market value is reduced for the purpose of
	 * calculating capital requirement, margin and collateral levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmAssetHolding
	 * HaircutValuation.mmAssetHolding}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmValuationHaircutDetails
	 * AggregateBalanceInformation9.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmValuationHaircutDetails
	 * AggregateBalanceInformation10.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmValuationHaircutDetails
	 * AggregateBalanceInformation12.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmValuationHaircutDetails
	 * AggregateBalanceInformation14.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmValuationHaircutDetails
	 * AggregateBalanceInformation16.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmValuationHaircutDetails
	 * AggregateBalanceInformation18.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmValuationHaircutDetails
	 * AggregateBalanceInformation21.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmValuationHaircutDetails
	 * AggregateBalanceInformation24.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails11.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails14.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmHaircut
	 * FinancialInstrumentStipulations.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmSecuritiesHaircut
	 * SecuritiesFinancing10.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails19.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails20.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails17.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails18.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmValuationHaircutDetails
	 * AggregateBalanceInformation20.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmSecuritiesHaircut
	 * SecuritiesFinancing1.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument1#mmValuationHaircutDetails
	 * FinancialInstrument1.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails21.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails22.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails24.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmValuationHaircutDetails
	 * AggregateBalanceInformation25.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmValuationHaircutDetails
	 * AggregateBalanceInformation28.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails25.mmSecuritiesHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral10#mmHaircut
	 * Collateral10.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmValuationHaircutDetails
	 * AggregateBalanceInformation30.mmValuationHaircutDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails26.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails28.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails27.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails33.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails32.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails30.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmValuationHaircutDetails
	 * AggregateBalanceInformation33.mmValuationHaircutDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral14#mmHaircut
	 * Collateral14.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails35.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails36.mmSecuritiesHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral18#mmHaircut
	 * Collateral18.mmHaircut}</li>
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
	public static final MMBusinessAssociationEnd mmHaircut = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalanceInformation9.mmValuationHaircutDetails, AggregateBalanceInformation10.mmValuationHaircutDetails, AggregateBalanceInformation12.mmValuationHaircutDetails,
					AggregateBalanceInformation14.mmValuationHaircutDetails, AggregateBalanceInformation16.mmValuationHaircutDetails, AggregateBalanceInformation18.mmValuationHaircutDetails,
					AggregateBalanceInformation21.mmValuationHaircutDetails, AggregateBalanceInformation24.mmValuationHaircutDetails, SecuritiesFinancingTransactionDetails11.mmSecuritiesHaircut,
					SecuritiesFinancingTransactionDetails14.mmSecuritiesHaircut, FinancialInstrumentStipulations.mmHaircut, SecuritiesFinancing10.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails19.mmSecuritiesHaircut,
					SecuritiesFinancingTransactionDetails20.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails17.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails18.mmSecuritiesHaircut,
					AggregateBalanceInformation20.mmValuationHaircutDetails, SecuritiesFinancing1.mmSecuritiesHaircut, FinancialInstrument1.mmValuationHaircutDetails, SecuritiesFinancingTransactionDetails21.mmSecuritiesHaircut,
					SecuritiesFinancingTransactionDetails22.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails24.mmSecuritiesHaircut, AggregateBalanceInformation25.mmValuationHaircutDetails,
					AggregateBalanceInformation28.mmValuationHaircutDetails, SecuritiesFinancingTransactionDetails25.mmSecuritiesHaircut, Collateral10.mmHaircut, AggregateBalanceInformation30.mmValuationHaircutDetails,
					SecuritiesFinancingTransactionDetails26.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails28.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails27.mmSecuritiesHaircut,
					SecuritiesFinancingTransactionDetails33.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails32.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails30.mmSecuritiesHaircut,
					AggregateBalanceInformation33.mmValuationHaircutDetails, Collateral14.mmHaircut, SecuritiesFinancingTransactionDetails35.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails36.mmSecuritiesHaircut,
					Collateral18.mmHaircut);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount eligibleCollateralValue;
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmEligibleCollateralValue
	 * BalanceAmounts3.mmEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalEligibleCollateralValue
	 * TotalValueInPageAndStatement1.mmTotalEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts4#mmEligibleCollateralValue
	 * BalanceAmounts4.mmEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3#mmTotalEligibleCollateralValue
	 * TotalValueInPageAndStatement3.mmTotalEligibleCollateralValue}</li>
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
	public static final MMBusinessAttribute mmEligibleCollateralValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAmounts3.mmEligibleCollateralValue, TotalValueInPageAndStatement1.mmTotalEligibleCollateralValue, BalanceAmounts4.mmEligibleCollateralValue,
					TotalValueInPageAndStatement3.mmTotalEligibleCollateralValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleCollateralValue";
			definition = "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getEligibleCollateralValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyExchange exchangeRate;
	/**
	 * Specifies the exchange rate between the currency of the asset and the
	 * reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCalculatedAssetValue
	 * CurrencyExchange.mmCalculatedAssetValue}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmExchangeRate
	 * UnderlyingAttributes.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#mmExchangeRate
	 * CashCollateral1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmExchangeRate
	 * OtherCollateral1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmExchangeRate
	 * UnderlyingAttributes2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmExchangeRate
	 * OtherCollateral2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmExchangeRate
	 * CashCollateral3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmExchangeRate
	 * OtherCollateral3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmExchangeRate
	 * CashCollateral4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmExchangeRate
	 * CashCollateral2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmExchangeRate
	 * OtherCollateral4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmExchangeRate
	 * CashCollateral5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmExchangeRate
	 * OtherCollateral7.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmExchangeRate
	 * OtherCollateral6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmExchangeRate
	 * OtherCollateral5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#mmForeignExchange
	 * AssetClassAttributes1Choice.mmForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassAttributes1#mmForeignExchange
	 * AssetClassAttributes1.mmForeignExchange}</li>
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
	public static final MMBusinessAssociationEnd mmExchangeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(UnderlyingAttributes.mmExchangeRate, CashCollateral1.mmExchangeRate, OtherCollateral1.mmExchangeRate, UnderlyingAttributes2.mmExchangeRate, OtherCollateral2.mmExchangeRate,
					CashCollateral3.mmExchangeRate, OtherCollateral3.mmExchangeRate, CashCollateral4.mmExchangeRate, CashCollateral2.mmExchangeRate, OtherCollateral4.mmExchangeRate, CashCollateral5.mmExchangeRate,
					OtherCollateral7.mmExchangeRate, OtherCollateral6.mmExchangeRate, OtherCollateral5.mmExchangeRate, AssetClassAttributes1Choice.mmForeignExchange, AssetClassAttributes1.mmForeignExchange);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the asset and the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmCalculatedAssetValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected CurrencyAndAmount capValue;
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmCapValue
	 * UnderlyingAttributes.mmCapValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmCapValue
	 * UnderlyingAttributes2.mmCapValue}</li>
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
	public static final MMBusinessAttribute mmCapValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnderlyingAttributes.mmCapValue, UnderlyingAttributes2.mmCapValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapValue";
			definition = "Maximum notional value for a financial instrument that is capped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getCapValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount riskAdjustedValue;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#mmCollateralValue
	 * SecuritiesCollateral1.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#mmCollateralValue
	 * CashCollateral1.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmCollateralValue
	 * OtherCollateral1.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmCollateralValue
	 * SecuritiesCollateral2.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmCollateralValue
	 * OtherCollateral2.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmCollateralValue
	 * CashCollateral3.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmCollateralValue
	 * SecuritiesCollateral3.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmCollateralValue
	 * OtherCollateral3.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmCollateralValue
	 * CashCollateral4.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmCollateralValue
	 * CashCollateral2.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmCollateralValue
	 * OtherCollateral4.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmCollateralValue
	 * SecuritiesCollateral4.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmCollateralValue
	 * CashCollateral5.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmCollateralValue
	 * OtherCollateral7.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmCollateralValue
	 * OtherCollateral6.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmCollateralValue
	 * SecuritiesCollateral6.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmCollateralValue
	 * SecuritiesCollateral5.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmCollateralValue
	 * OtherCollateral5.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmCollateralValue
	 * SecuritiesCollateral7.mmCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmCollateralValue
	 * SecuritiesCollateral8.mmCollateralValue}</li>
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
	public static final MMBusinessAttribute mmRiskAdjustedValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesCollateral1.mmCollateralValue, CashCollateral1.mmCollateralValue, OtherCollateral1.mmCollateralValue, SecuritiesCollateral2.mmCollateralValue, OtherCollateral2.mmCollateralValue,
					CashCollateral3.mmCollateralValue, SecuritiesCollateral3.mmCollateralValue, OtherCollateral3.mmCollateralValue, CashCollateral4.mmCollateralValue, CashCollateral2.mmCollateralValue, OtherCollateral4.mmCollateralValue,
					SecuritiesCollateral4.mmCollateralValue, CashCollateral5.mmCollateralValue, OtherCollateral7.mmCollateralValue, OtherCollateral6.mmCollateralValue, SecuritiesCollateral6.mmCollateralValue,
					SecuritiesCollateral5.mmCollateralValue, OtherCollateral5.mmCollateralValue, SecuritiesCollateral7.mmCollateralValue, SecuritiesCollateral8.mmCollateralValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskAdjustedValue";
			definition = "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getRiskAdjustedValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount realisedGainOrLoss;
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmRealisedGainOrLoss
	 * TotalPortfolioValuation1.mmRealisedGainOrLoss}</li>
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
	public static final MMBusinessAttribute mmRealisedGainOrLoss = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TotalPortfolioValuation1.mmRealisedGainOrLoss);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RealisedGainOrLoss";
			definition = "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getRealisedGainOrLoss", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UnrealisedCode unrealisedType;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails6#mmUnrealised
	 * BalanceDetails6.mmUnrealised}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails5#mmUnrealised
	 * BalanceDetails5.mmUnrealised}</li>
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
	public static final MMBusinessAttribute mmUnrealisedType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceDetails6.mmUnrealised, BalanceDetails5.mmUnrealised);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnrealisedType";
			definition = "Specifies whether the unrealised amount is a gain or a loss.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnrealisedCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getUnrealisedType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount postHaircutValue;
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
	 * {@linkplain com.tools20022.repository.msg.Collateral3#mmPostHaircutValue
	 * Collateral3.mmPostHaircutValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral6#mmPostHaircutValue
	 * Collateral6.mmPostHaircutValue}</li>
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
	public static final MMBusinessAttribute mmPostHaircutValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Collateral3.mmPostHaircutValue, Collateral6.mmPostHaircutValue);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostHaircutValue";
			definition = "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getPostHaircutValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * interest relative to the asset and the parameters used to calculate it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
	 * Interest.mmRelatedAssetHolding}</li>
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
	 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#mmInterest
	 * AssetClassAttributes1Choice.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AssetClassAttributes1#mmInterest
	 * AssetClassAttributes1.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmInflationIndex
	 * InterestRateDerivative5.mmInflationIndex}</li>
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
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AssetClassAttributes1Choice.mmInterest, AssetClassAttributes1.mmInterest, InterestRateDerivative5.mmInflationIndex);
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "interest relative to the asset and the parameters used to calculate it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Collateral> collateral;
	/**
	 * Specifies the collateral information in relation with some assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmAssetHolding
	 * Collateral.mmAssetHolding}</li>
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
	public static final MMBusinessAssociationEnd mmCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral information in relation with some assets.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected FinancialAssetBalanceTypeCode financialAssetType;
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
	public static final MMBusinessAttribute mmFinancialAssetType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetType";
			definition = "Specifies the asset type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getFinancialAssetType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Collateral variationMarginCollateral;
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmVariationMarginAssetHolding
	 * Collateral.mmVariationMarginAssetHolding}</li>
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
	public static final MMBusinessAssociationEnd mmVariationMarginCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariationMarginCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmVariationMarginAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected Collateral independentAmountCollateral;
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmSegregatedIndependentAmountAssetHolding
	 * Collateral.mmSegregatedIndependentAmountAssetHolding}</li>
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
	public static final MMBusinessAssociationEnd mmIndependentAmountCollateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmSegregatedIndependentAmountAssetHolding;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected BlockedReasonCode holdingType;
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
	public static final MMBusinessAttribute mmHoldingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingType";
			definition = "Specifies the type of holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockedReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getHoldingType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount guaranteeAmount;
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
	public static final MMBusinessAttribute mmGuaranteeAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteeAmount";
			definition = "Amount of the bank guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetHolding.class.getMethod("getGuaranteeAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetHolding";
				definition = "Specifies in terms of value and quantity the assets.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmAssetValue, com.tools20022.repository.entity.Balance.mmAssetHolding, com.tools20022.repository.entity.Interest.mmRelatedAssetHolding,
						com.tools20022.repository.entity.CurrencyExchange.mmCalculatedAssetValue, com.tools20022.repository.entity.Collateral.mmAssetHolding, com.tools20022.repository.entity.Collateral.mmVariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.mmSegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.HaircutValuation.mmAssetHolding);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentAggregateBalance1.mmHoldings, AggregateHoldingBalance1.mmBalanceForFinancialInstrument);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetHolding.mmHoldingValue, com.tools20022.repository.entity.AssetHolding.mmBookValue, com.tools20022.repository.entity.AssetHolding.mmFaceAmount,
						com.tools20022.repository.entity.AssetHolding.mmAmortisedFaceValue, com.tools20022.repository.entity.AssetHolding.mmMarketValue, com.tools20022.repository.entity.AssetHolding.mmBalance,
						com.tools20022.repository.entity.AssetHolding.mmUnrealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.mmAsset, com.tools20022.repository.entity.AssetHolding.mmHaircut,
						com.tools20022.repository.entity.AssetHolding.mmEligibleCollateralValue, com.tools20022.repository.entity.AssetHolding.mmExchangeRate, com.tools20022.repository.entity.AssetHolding.mmCapValue,
						com.tools20022.repository.entity.AssetHolding.mmRiskAdjustedValue, com.tools20022.repository.entity.AssetHolding.mmRealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.mmUnrealisedType,
						com.tools20022.repository.entity.AssetHolding.mmPostHaircutValue, com.tools20022.repository.entity.AssetHolding.mmInterest, com.tools20022.repository.entity.AssetHolding.mmCollateral,
						com.tools20022.repository.entity.AssetHolding.mmFinancialAssetType, com.tools20022.repository.entity.AssetHolding.mmVariationMarginCollateral,
						com.tools20022.repository.entity.AssetHolding.mmIndependentAmountCollateral, com.tools20022.repository.entity.AssetHolding.mmHoldingType, com.tools20022.repository.entity.AssetHolding.mmGuaranteeAmount);
				derivationComponent_lazy = () -> Arrays.asList(BalanceAmounts1.mmObject(), BalanceAmounts2.mmObject(), BalanceAmounts5.mmObject(), BalanceAmounts6.mmObject(), BalanceAmounts3.mmObject(), BalanceAmounts4.mmObject(),
						FinancialInstrumentAggregateBalance1.mmObject(), FinancialInstrumentAggregateBalance1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AssetHolding.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getHoldingValue() {
		return holdingValue;
	}

	public void setHoldingValue(ActiveOrHistoricCurrencyAndAmount holdingValue) {
		this.holdingValue = holdingValue;
	}

	public CurrencyAndAmount getBookValue() {
		return bookValue;
	}

	public void setBookValue(CurrencyAndAmount bookValue) {
		this.bookValue = bookValue;
	}

	public CurrencyAndAmount getFaceAmount() {
		return faceAmount;
	}

	public void setFaceAmount(CurrencyAndAmount faceAmount) {
		this.faceAmount = faceAmount;
	}

	public CurrencyAndAmount getAmortisedFaceValue() {
		return amortisedFaceValue;
	}

	public void setAmortisedFaceValue(CurrencyAndAmount amortisedFaceValue) {
		this.amortisedFaceValue = amortisedFaceValue;
	}

	public ActiveCurrencyAndAmount getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(ActiveCurrencyAndAmount marketValue) {
		this.marketValue = marketValue;
	}

	public List<Balance> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.entity.Balance> balance) {
		this.balance = balance;
	}

	public CurrencyAndAmount getUnrealisedGainOrLoss() {
		return unrealisedGainOrLoss;
	}

	public void setUnrealisedGainOrLoss(CurrencyAndAmount unrealisedGainOrLoss) {
		this.unrealisedGainOrLoss = unrealisedGainOrLoss;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(com.tools20022.repository.entity.Asset asset) {
		this.asset = asset;
	}

	public List<HaircutValuation> getHaircut() {
		return haircut;
	}

	public void setHaircut(List<com.tools20022.repository.entity.HaircutValuation> haircut) {
		this.haircut = haircut;
	}

	public ActiveCurrencyAndAmount getEligibleCollateralValue() {
		return eligibleCollateralValue;
	}

	public void setEligibleCollateralValue(ActiveCurrencyAndAmount eligibleCollateralValue) {
		this.eligibleCollateralValue = eligibleCollateralValue;
	}

	public CurrencyExchange getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(com.tools20022.repository.entity.CurrencyExchange exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public CurrencyAndAmount getCapValue() {
		return capValue;
	}

	public void setCapValue(CurrencyAndAmount capValue) {
		this.capValue = capValue;
	}

	public ActiveCurrencyAndAmount getRiskAdjustedValue() {
		return riskAdjustedValue;
	}

	public void setRiskAdjustedValue(ActiveCurrencyAndAmount riskAdjustedValue) {
		this.riskAdjustedValue = riskAdjustedValue;
	}

	public CurrencyAndAmount getRealisedGainOrLoss() {
		return realisedGainOrLoss;
	}

	public void setRealisedGainOrLoss(CurrencyAndAmount realisedGainOrLoss) {
		this.realisedGainOrLoss = realisedGainOrLoss;
	}

	public UnrealisedCode getUnrealisedType() {
		return unrealisedType;
	}

	public void setUnrealisedType(UnrealisedCode unrealisedType) {
		this.unrealisedType = unrealisedType;
	}

	public CurrencyAndAmount getPostHaircutValue() {
		return postHaircutValue;
	}

	public void setPostHaircutValue(CurrencyAndAmount postHaircutValue) {
		this.postHaircutValue = postHaircutValue;
	}

	public List<Interest> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = interest;
	}

	public List<Collateral> getCollateral() {
		return collateral;
	}

	public void setCollateral(List<com.tools20022.repository.entity.Collateral> collateral) {
		this.collateral = collateral;
	}

	public FinancialAssetBalanceTypeCode getFinancialAssetType() {
		return financialAssetType;
	}

	public void setFinancialAssetType(FinancialAssetBalanceTypeCode financialAssetType) {
		this.financialAssetType = financialAssetType;
	}

	public Collateral getVariationMarginCollateral() {
		return variationMarginCollateral;
	}

	public void setVariationMarginCollateral(com.tools20022.repository.entity.Collateral variationMarginCollateral) {
		this.variationMarginCollateral = variationMarginCollateral;
	}

	public Collateral getIndependentAmountCollateral() {
		return independentAmountCollateral;
	}

	public void setIndependentAmountCollateral(com.tools20022.repository.entity.Collateral independentAmountCollateral) {
		this.independentAmountCollateral = independentAmountCollateral;
	}

	public BlockedReasonCode getHoldingType() {
		return holdingType;
	}

	public void setHoldingType(BlockedReasonCode holdingType) {
		this.holdingType = holdingType;
	}

	public CurrencyAndAmount getGuaranteeAmount() {
		return guaranteeAmount;
	}

	public void setGuaranteeAmount(CurrencyAndAmount guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
	}
}