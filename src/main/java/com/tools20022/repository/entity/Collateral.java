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
import com.tools20022.repository.choice.CollateralPurpose1Choice;
import com.tools20022.repository.choice.CollateralType1Choice;
import com.tools20022.repository.codeset.CollateralPurposeCode;
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Assets pledged by a debtor to secure a loan or an exposure and subject to
 * seizure in the event of default.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Collateral" src="doc-files/Collateral.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
 * Collateral.mmCollateralAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmValuation
 * Collateral.mmValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmCollateralType
 * Collateral.mmCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmBaseCurrencyAmount
 * Collateral.mmBaseCurrencyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralPurpose
 * Collateral.mmCollateralPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
 * Collateral.mmCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
 * Collateral.mmCollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralManagement
 * Collateral.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralPartyRole
 * Collateral.mmCollateralPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmStatus
 * Collateral.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmAssetHolding
 * Collateral.mmAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmVariationMarginAssetHolding
 * Collateral.mmVariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmSegregatedIndependentAmountAssetHolding
 * Collateral.mmSegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAgreement
 * Collateral.mmCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralOwnership
 * Collateral.mmCollateralOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmRelatedCollateralSubstitution
 * Collateral.mmRelatedCollateralSubstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCollateralProcess
 * Account.mmRelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmCollateral
 * AssetHolding.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmVariationMarginCollateral
 * AssetHolding.mmVariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmIndependentAmountCollateral
 * AssetHolding.mmIndependentAmountCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
 * CollateralValuation.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCollateral
 * CollateralStatus.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmCollateral
 * CollateralAgreement.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#mmCollateral
 * CollateralPartyRole.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateral
 * CollateralManagement.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmNewCollateral
 * CollateralSubstitution.mmNewCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralDescription
 * CollateralBalance.mmCollateralDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractCollateral1#mmCollateralDescription
 * ContractCollateral1.mmCollateralDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralType1Choice
 * CollateralType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral2 Collateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral4 Collateral4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralPurpose1Choice
 * CollateralPurpose1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAmount1
 * CollateralAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral5 Collateral5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral3 Collateral3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral6 Collateral6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral9 Collateral9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral7 Collateral7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral8 Collateral8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral10 Collateral10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractCollateral1
 * ContractCollateral1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral13 Collateral13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral11 Collateral11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement9
 * CollateralMovement9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral12 Collateral12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral14 Collateral14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral16 Collateral16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral17 Collateral17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Collateral18 Collateral18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount4
 * CollateralAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetHolding1 AssetHolding1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralAccount5
 * CollateralAccount5}</li>
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
 * "Collateral"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default."
 * </li>
 * </ul>
 */
public class Collateral {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount collateralAmount;
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
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts12#mmMargin
	 * OtherAmounts12.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts14#mmMargin
	 * OtherAmounts14.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts20#mmMargin
	 * OtherAmounts20.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#mmMargin
	 * OtherAmounts4.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#mmMargin
	 * OtherAmounts5.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#mmMargin
	 * OtherAmounts17.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#mmMargin
	 * OtherAmounts23.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts3#mmMargin
	 * OtherAmounts3.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#mmMargin
	 * OtherAmounts7.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#mmMargin
	 * OtherAmounts9.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmCollateralMonitorAmount
	 * OtherAmounts9.mmCollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#mmMargin
	 * OtherAmounts10.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmCollateralMonitorAmount
	 * OtherAmounts10.mmCollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#mmMargin
	 * OtherAmounts18.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmCollateralMonitorAmount
	 * OtherAmounts18.mmCollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#mmMargin
	 * OtherAmounts24.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmCollateralMonitorAmount
	 * OtherAmounts24.mmCollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts13#mmMargin
	 * OtherAmounts13.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts1#mmMargin
	 * OtherAmounts1.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#mmMargin
	 * OtherAmounts16.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmCollateralAmount
	 * CollateralAmount1.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation3#mmNominalAmount
	 * CollateralValuation3.mmNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4#mmNominalAmount
	 * CollateralValuation4.mmNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractCollateral1#mmTotalAmount
	 * ContractCollateral1.mmTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#mmMargin
	 * OtherAmounts28.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#mmMargin
	 * OtherAmounts30.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmCollateralMonitorAmount
	 * OtherAmounts30.mmCollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#mmMargin
	 * OtherAmounts31.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts35#mmMargin
	 * OtherAmounts35.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#mmMargin
	 * OtherAmounts34.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#mmMargin
	 * OtherAmounts38.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmCollateralMonitorAmount
	 * OtherAmounts38.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmNominalAmount
	 * CollateralValuation7.mmNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation6#mmNominalAmount
	 * CollateralValuation6.mmNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmCollateralMarketValue
	 * RepurchaseAgreement2.mmCollateralMarketValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts41#mmMargin
	 * OtherAmounts41.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts39#mmMargin
	 * OtherAmounts39.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts40#mmMargin
	 * OtherAmounts40.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmCollateralMonitorAmount
	 * OtherAmounts40.mmCollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts42#mmMargin
	 * OtherAmounts42.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts43#mmMargin
	 * OtherAmounts43.mmMargin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts44#mmMargin
	 * OtherAmounts44.mmMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts44#mmCollateralMonitorAmount
	 * OtherAmounts44.mmCollateralMonitorAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the collateral as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Collateral, CurrencyAndAmount> mmCollateralAmount = new MMBusinessAttribute<Collateral, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts12.mmMargin, OtherAmounts14.mmMargin, OtherAmounts20.mmMargin, OtherAmounts4.mmMargin, OtherAmounts5.mmMargin, OtherAmounts17.mmMargin, OtherAmounts23.mmMargin,
					OtherAmounts3.mmMargin, OtherAmounts7.mmMargin, OtherAmounts9.mmMargin, OtherAmounts9.mmCollateralMonitorAmount, OtherAmounts10.mmMargin, OtherAmounts10.mmCollateralMonitorAmount, OtherAmounts18.mmMargin,
					OtherAmounts18.mmCollateralMonitorAmount, OtherAmounts24.mmMargin, OtherAmounts24.mmCollateralMonitorAmount, OtherAmounts13.mmMargin, OtherAmounts1.mmMargin, OtherAmounts16.mmMargin,
					CollateralAmount1.mmCollateralAmount, CollateralValuation3.mmNominalAmount, CollateralValuation4.mmNominalAmount, ContractCollateral1.mmTotalAmount, OtherAmounts28.mmMargin, OtherAmounts30.mmMargin,
					OtherAmounts30.mmCollateralMonitorAmount, OtherAmounts31.mmMargin, OtherAmounts35.mmMargin, OtherAmounts34.mmMargin, OtherAmounts38.mmMargin, OtherAmounts38.mmCollateralMonitorAmount,
					CollateralValuation7.mmNominalAmount, CollateralValuation6.mmNominalAmount, RepurchaseAgreement2.mmCollateralMarketValue, OtherAmounts41.mmMargin, OtherAmounts39.mmMargin, OtherAmounts40.mmMargin,
					OtherAmounts40.mmCollateralMonitorAmount, OtherAmounts42.mmMargin, OtherAmounts43.mmMargin, OtherAmounts44.mmMargin, OtherAmounts44.mmCollateralMonitorAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Collateral obj) {
			return obj.getCollateralAmount();
		}

		@Override
		public void setValue(Collateral obj, CurrencyAndAmount value) {
			obj.setCollateralAmount(value);
		}
	};
	protected List<CollateralValuation> valuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
	 * CollateralValuation.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmStartValue
	 * UnderlyingAttributes.mmStartValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmCurrentValue
	 * UnderlyingAttributes.mmCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmEndValue
	 * UnderlyingAttributes.mmEndValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmStartValue
	 * UnderlyingAttributes2.mmStartValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmCurrentValue
	 * UnderlyingAttributes2.mmCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmEndValue
	 * UnderlyingAttributes2.mmEndValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral10#mmValuation
	 * Collateral10.mmValuation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral14#mmValuation
	 * Collateral14.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes3#mmStartValue
	 * UnderlyingAttributes3.mmStartValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes3#mmCurrentValue
	 * UnderlyingAttributes3.mmCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes3#mmEndValue
	 * UnderlyingAttributes3.mmEndValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral18#mmValuation
	 * Collateral18.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractValuationData4#mmValue
	 * ContractValuationData4.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractValuationData5#mmValue
	 * ContractValuationData5.mmValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation process of specific collateral elements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, List<CollateralValuation>> mmValuation = new MMBusinessAssociationEnd<Collateral, List<CollateralValuation>>() {
		{
			derivation_lazy = () -> Arrays.asList(UnderlyingAttributes.mmStartValue, UnderlyingAttributes.mmCurrentValue, UnderlyingAttributes.mmEndValue, UnderlyingAttributes2.mmStartValue, UnderlyingAttributes2.mmCurrentValue,
					UnderlyingAttributes2.mmEndValue, Collateral10.mmValuation, Collateral14.mmValuation, UnderlyingAttributes3.mmStartValue, UnderlyingAttributes3.mmCurrentValue, UnderlyingAttributes3.mmEndValue, Collateral18.mmValuation,
					ContractValuationData4.mmValue, ContractValuationData5.mmValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Valuation";
			definition = "Valuation process of specific collateral elements.";
			minOccurs = 0;
			opposite_lazy = () -> CollateralValuation.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralValuation.mmObject();
		}

		@Override
		public List<CollateralValuation> getValue(Collateral obj) {
			return obj.getValuation();
		}

		@Override
		public void setValue(Collateral obj, List<CollateralValuation> value) {
			obj.setValuation(value);
		}
	};
	protected CollateralTypeCode collateralType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralType1Choice#mmCode
	 * CollateralType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralType1Choice#mmProprietary
	 * CollateralType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmCollateralType
	 * SecuritiesFinancing10.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCollateralType
	 * CollateralValuation1.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral3#mmCollateralType
	 * Collateral3.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral6#mmCollateralType
	 * Collateral6.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCollateralType
	 * CollateralValuation2.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral10#mmSpecialCollateralIndicator
	 * Collateral10.mmSpecialCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCollateralType
	 * CollateralValuation5.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement9#mmCollateralType
	 * CollateralMovement9.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral14#mmSpecialCollateralIndicator
	 * Collateral14.mmSpecialCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral18#mmSpecialCollateralIndicator
	 * Collateral18.mmSpecialCollateralIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Collateral, CollateralTypeCode> mmCollateralType = new MMBusinessAttribute<Collateral, CollateralTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralType1Choice.mmCode, CollateralType1Choice.mmProprietary, SecuritiesFinancing10.mmCollateralType, CollateralValuation1.mmCollateralType, Collateral3.mmCollateralType,
					Collateral6.mmCollateralType, CollateralValuation2.mmCollateralType, Collateral10.mmSpecialCollateralIndicator, CollateralValuation5.mmCollateralType, CollateralMovement9.mmCollateralType,
					Collateral14.mmSpecialCollateralIndicator, Collateral18.mmSpecialCollateralIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}

		@Override
		public CollateralTypeCode getValue(Collateral obj) {
			return obj.getCollateralType();
		}

		@Override
		public void setValue(Collateral obj, CollateralTypeCode value) {
			obj.setCollateralType(value);
		}
	};
	protected ActiveCurrencyAndAmount baseCurrencyAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmSubstitutionRequirement
	 * CollateralSubstitution1.mmSubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmSubstitutionRequirement
	 * CollateralSubstitution2.mmSubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#mmSubstitutionRequirement
	 * CollateralSubstitution3.mmSubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmSubstitutionRequirement
	 * CollateralSubstitution5.mmSubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#mmSubstitutionRequirement
	 * CollateralSubstitution4.mmSubstitutionRequirement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral in the currency used for reporting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Collateral, ActiveCurrencyAndAmount> mmBaseCurrencyAmount = new MMBusinessAttribute<Collateral, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralSubstitution1.mmSubstitutionRequirement, CollateralSubstitution2.mmSubstitutionRequirement, CollateralSubstitution3.mmSubstitutionRequirement,
					CollateralSubstitution5.mmSubstitutionRequirement, CollateralSubstitution4.mmSubstitutionRequirement);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseCurrencyAmount";
			definition = "Value of the collateral in the currency used for reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Collateral obj) {
			return obj.getBaseCurrencyAmount();
		}

		@Override
		public void setValue(Collateral obj, ActiveCurrencyAndAmount value) {
			obj.setBaseCurrencyAmount(value);
		}
	};
	protected CollateralPurposeCode collateralPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralPurposeCode
	 * CollateralPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralPurpose1Choice#mmCode
	 * CollateralPurpose1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralPurpose1Choice#mmProprietary
	 * CollateralPurpose1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCollateralPurpose
	 * InterestAmount1.mmCollateralPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmCollateralPurpose
	 * InterestAmount2.mmCollateralPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Collateral, CollateralPurposeCode> mmCollateralPurpose = new MMBusinessAttribute<Collateral, CollateralPurposeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralPurpose1Choice.mmCode, CollateralPurpose1Choice.mmProprietary, InterestAmount1.mmCollateralPurpose, InterestAmount2.mmCollateralPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralPurpose";
			definition = "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralPurposeCode.mmObject();
		}

		@Override
		public CollateralPurposeCode getValue(Collateral obj) {
			return obj.getCollateralPurpose();
		}

		@Override
		public void setValue(Collateral obj, CollateralPurposeCode value) {
			obj.setCollateralPurpose(value);
		}
	};
	protected CollateralBalance collateralBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralDescription
	 * CollateralBalance.mmCollateralDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmOpeningCollateralBalance
	 * InterestAmount1.mmOpeningCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmClosingCollateralBalance
	 * InterestAmount1.mmClosingCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmOpeningCollateralBalance
	 * InterestAmount2.mmOpeningCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmClosingCollateralBalance
	 * InterestAmount2.mmClosingCollateralBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral balance which contain specific collateral elements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, Optional<CollateralBalance>> mmCollateralBalance = new MMBusinessAssociationEnd<Collateral, Optional<CollateralBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmOpeningCollateralBalance, InterestAmount1.mmClosingCollateralBalance, InterestAmount2.mmOpeningCollateralBalance, InterestAmount2.mmClosingCollateralBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBalance";
			definition = "Collateral balance which contain specific collateral elements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CollateralBalance.mmCollateralDescription;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralBalance.mmObject();
		}

		@Override
		public Optional<CollateralBalance> getValue(Collateral obj) {
			return obj.getCollateralBalance();
		}

		@Override
		public void setValue(Collateral obj, Optional<CollateralBalance> value) {
			obj.setCollateralBalance(value.orElse(null));
		}
	};
	protected List<Account> collateralAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCollateralProcess
	 * Account.mmRelatedCollateralProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation2#mmCollateralAccountIdentification
	 * Obligation2.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral5#mmAccountIdentification
	 * Collateral5.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation3#mmCollateralAccountIdentification
	 * Obligation3.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral9#mmAccountIdentification
	 * Collateral9.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation4#mmCollateralAccountIdentification
	 * Obligation4.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCall2#mmCollateralAccountIdentification
	 * MarginCall2.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral13#mmAccountIdentification
	 * Collateral13.mmAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#mmCollateralAccountIdentification
	 * Obligation5.mmCollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAccount5#mmRelatedMarginAccount
	 * CollateralAccount5.mmRelatedMarginAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account from or to which collateral is delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, List<Account>> mmCollateralAccount = new MMBusinessAssociationEnd<Collateral, List<Account>>() {
		{
			derivation_lazy = () -> Arrays.asList(Obligation2.mmCollateralAccountIdentification, Collateral5.mmAccountIdentification, Obligation3.mmCollateralAccountIdentification, Collateral9.mmAccountIdentification,
					Obligation4.mmCollateralAccountIdentification, MarginCall2.mmCollateralAccountIdentification, Collateral13.mmAccountIdentification, Obligation5.mmCollateralAccountIdentification,
					CollateralAccount5.mmRelatedMarginAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAccount";
			definition = "Account from or to which collateral is delivered.";
			minOccurs = 0;
			opposite_lazy = () -> Account.mmRelatedCollateralProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}

		@Override
		public List<Account> getValue(Collateral obj) {
			return obj.getCollateralAccount();
		}

		@Override
		public void setValue(Collateral obj, List<Account> value) {
			obj.setCollateralAccount(value);
		}
	};
	protected CollateralManagement collateralManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateral
	 * CollateralManagement.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Series of processes which are related to the collateral processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, CollateralManagement> mmCollateralManagement = new MMBusinessAssociationEnd<Collateral, CollateralManagement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Series of processes which are related to the collateral processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralManagement.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public CollateralManagement getValue(Collateral obj) {
			return obj.getCollateralManagement();
		}

		@Override
		public void setValue(Collateral obj, CollateralManagement value) {
			obj.setCollateralManagement(value);
		}
	};
	protected List<CollateralPartyRole> collateralPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#mmCollateral
	 * CollateralPartyRole.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralPartyRole
	 * CollateralPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the roles played by a party in the context of collateral processes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, List<CollateralPartyRole>> mmCollateralPartyRole = new MMBusinessAssociationEnd<Collateral, List<CollateralPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPartyRole";
			definition = "Specifies the roles played by a party in the context of collateral processes.";
			minOccurs = 0;
			opposite_lazy = () -> CollateralPartyRole.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralPartyRole.mmObject();
		}

		@Override
		public List<CollateralPartyRole> getValue(Collateral obj) {
			return obj.getCollateralPartyRole();
		}

		@Override
		public void setValue(Collateral obj, List<CollateralPartyRole> value) {
			obj.setCollateralPartyRole(value);
		}
	};
	protected List<CollateralStatus> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCollateral
	 * CollateralStatus.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmSecuritiesCollateralResponse
	 * CollateralResponse1.mmSecuritiesCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmCashCollateralResponse
	 * CollateralResponse1.mmCashCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#mmOtherCollateralResponse
	 * CollateralResponse1.mmOtherCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#mmSecuritiesCollateralResponse
	 * CollateralResponse2.mmSecuritiesCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#mmCashCollateralResponse
	 * CollateralResponse2.mmCashCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#mmOtherCollateralResponse
	 * CollateralResponse2.mmOtherCollateralResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the collateral or of an event related to collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, List<CollateralStatus>> mmStatus = new MMBusinessAssociationEnd<Collateral, List<CollateralStatus>>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralResponse1.mmSecuritiesCollateralResponse, CollateralResponse1.mmCashCollateralResponse, CollateralResponse1.mmOtherCollateralResponse,
					CollateralResponse2.mmSecuritiesCollateralResponse, CollateralResponse2.mmCashCollateralResponse, CollateralResponse2.mmOtherCollateralResponse);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the collateral or of an event related to collateral.";
			minOccurs = 0;
			opposite_lazy = () -> CollateralStatus.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralStatus.mmObject();
		}

		@Override
		public List<CollateralStatus> getValue(Collateral obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Collateral obj, List<CollateralStatus> value) {
			obj.setStatus(value);
		}
	};
	protected AssetHolding assetHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmCollateral
	 * AssetHolding.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities or physical entities given as collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, AssetHolding> mmAssetHolding = new MMBusinessAssociationEnd<Collateral, AssetHolding>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetHolding";
			definition = "Specifies the securities or physical entities given as collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AssetHolding.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}

		@Override
		public AssetHolding getValue(Collateral obj) {
			return obj.getAssetHolding();
		}

		@Override
		public void setValue(Collateral obj, AssetHolding value) {
			obj.setAssetHolding(value);
		}
	};
	protected List<AssetHolding> variationMarginAssetHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmVariationMarginCollateral
	 * AssetHolding.mmVariationMarginCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held as collateral against the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, List<AssetHolding>> mmVariationMarginAssetHolding = new MMBusinessAssociationEnd<Collateral, List<AssetHolding>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariationMarginAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the variation margin.";
			minOccurs = 0;
			opposite_lazy = () -> AssetHolding.mmVariationMarginCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}

		@Override
		public List<AssetHolding> getValue(Collateral obj) {
			return obj.getVariationMarginAssetHolding();
		}

		@Override
		public void setValue(Collateral obj, List<AssetHolding> value) {
			obj.setVariationMarginAssetHolding(value);
		}
	};
	protected List<AssetHolding> segregatedIndependentAmountAssetHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmIndependentAmountCollateral
	 * AssetHolding.mmIndependentAmountCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, List<AssetHolding>> mmSegregatedIndependentAmountAssetHolding = new MMBusinessAssociationEnd<Collateral, List<AssetHolding>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SegregatedIndependentAmountAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> AssetHolding.mmIndependentAmountCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}

		@Override
		public List<AssetHolding> getValue(Collateral obj) {
			return obj.getSegregatedIndependentAmountAssetHolding();
		}

		@Override
		public void setValue(Collateral obj, List<AssetHolding> value) {
			obj.setSegregatedIndependentAmountAssetHolding(value);
		}
	};
	protected CollateralAgreement collateralAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmCollateral
	 * CollateralAgreement.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral agreement which governs the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, CollateralAgreement> mmCollateralAgreement = new MMBusinessAssociationEnd<Collateral, CollateralAgreement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which governs the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralAgreement.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralAgreement.mmObject();
		}

		@Override
		public CollateralAgreement getValue(Collateral obj) {
			return obj.getCollateralAgreement();
		}

		@Override
		public void setValue(Collateral obj, CollateralAgreement value) {
			obj.setCollateralAgreement(value);
		}
	};
	protected Max35Text collateralOwnership;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmCollateralOwnership
	 * SecuritiesCollateral2.mmCollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails88#mmCollateralOwnership
	 * SettlementDetails88.mmCollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmCollateralOwnership
	 * OtherCollateral3.mmCollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails102#mmCollateralOwnership
	 * SettlementDetails102.mmCollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmCollateralOwnership
	 * OtherCollateral6.mmCollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmCollateralOwnership
	 * SecuritiesCollateral6.mmCollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#mmCollateralOwnership
	 * SettlementDetails118.mmCollateralOwnership}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies who is the owner of the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Collateral, Max35Text> mmCollateralOwnership = new MMBusinessAttribute<Collateral, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesCollateral2.mmCollateralOwnership, SettlementDetails88.mmCollateralOwnership, OtherCollateral3.mmCollateralOwnership, SettlementDetails102.mmCollateralOwnership,
					OtherCollateral6.mmCollateralOwnership, SecuritiesCollateral6.mmCollateralOwnership, SettlementDetails118.mmCollateralOwnership);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralOwnership";
			definition = "Specifies who is the owner of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Collateral obj) {
			return obj.getCollateralOwnership();
		}

		@Override
		public void setValue(Collateral obj, Max35Text value) {
			obj.setCollateralOwnership(value);
		}
	};
	protected CollateralSubstitution relatedCollateralSubstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmNewCollateral
	 * CollateralSubstitution.mmNewCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral substitution for which new collateral is replacing the returned one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Collateral, Optional<CollateralSubstitution>> mmRelatedCollateralSubstitution = new MMBusinessAssociationEnd<Collateral, Optional<CollateralSubstitution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralSubstitution";
			definition = "Collateral substitution for which new collateral is replacing the returned one.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CollateralSubstitution.mmNewCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralSubstitution.mmObject();
		}

		@Override
		public Optional<CollateralSubstitution> getValue(Collateral obj) {
			return obj.getRelatedCollateralSubstitution();
		}

		@Override
		public void setValue(Collateral obj, Optional<CollateralSubstitution> value) {
			obj.setRelatedCollateralSubstitution(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Collateral";
				definition = "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default.";
				associationDomain_lazy = () -> Arrays.asList(Account.mmRelatedCollateralProcess, AssetHolding.mmCollateral, AssetHolding.mmVariationMarginCollateral, AssetHolding.mmIndependentAmountCollateral,
						CollateralValuation.mmCollateral, CollateralStatus.mmCollateral, CollateralAgreement.mmCollateral, CollateralPartyRole.mmCollateral, CollateralManagement.mmCollateral, CollateralSubstitution.mmNewCollateral,
						CollateralBalance.mmCollateralDescription);
				derivationElement_lazy = () -> Arrays.asList(ContractCollateral1.mmCollateralDescription);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.mmCollateralAmount, com.tools20022.repository.entity.Collateral.mmValuation, com.tools20022.repository.entity.Collateral.mmCollateralType,
						com.tools20022.repository.entity.Collateral.mmBaseCurrencyAmount, com.tools20022.repository.entity.Collateral.mmCollateralPurpose, com.tools20022.repository.entity.Collateral.mmCollateralBalance,
						com.tools20022.repository.entity.Collateral.mmCollateralAccount, com.tools20022.repository.entity.Collateral.mmCollateralManagement, com.tools20022.repository.entity.Collateral.mmCollateralPartyRole,
						com.tools20022.repository.entity.Collateral.mmStatus, com.tools20022.repository.entity.Collateral.mmAssetHolding, com.tools20022.repository.entity.Collateral.mmVariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.mmSegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.Collateral.mmCollateralAgreement,
						com.tools20022.repository.entity.Collateral.mmCollateralOwnership, com.tools20022.repository.entity.Collateral.mmRelatedCollateralSubstitution);
				derivationComponent_lazy = () -> Arrays.asList(CollateralType1Choice.mmObject(), Collateral2.mmObject(), Collateral4.mmObject(), CollateralPurpose1Choice.mmObject(), CollateralAmount1.mmObject(), Collateral5.mmObject(),
						Collateral3.mmObject(), Collateral6.mmObject(), Collateral9.mmObject(), Collateral7.mmObject(), Collateral8.mmObject(), Collateral10.mmObject(), ContractCollateral1.mmObject(), Collateral13.mmObject(),
						Collateral11.mmObject(), CollateralMovement9.mmObject(), Collateral12.mmObject(), Collateral14.mmObject(), Collateral16.mmObject(), Collateral17.mmObject(), Collateral18.mmObject(), CollateralAccount4.mmObject(),
						AssetHolding1.mmObject(), CollateralAccount5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Collateral.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getCollateralAmount() {
		return collateralAmount;
	}

	public Collateral setCollateralAmount(CurrencyAndAmount collateralAmount) {
		this.collateralAmount = Objects.requireNonNull(collateralAmount);
		return this;
	}

	public List<CollateralValuation> getValuation() {
		return valuation == null ? valuation = new ArrayList<>() : valuation;
	}

	public Collateral setValuation(List<CollateralValuation> valuation) {
		this.valuation = Objects.requireNonNull(valuation);
		return this;
	}

	public CollateralTypeCode getCollateralType() {
		return collateralType;
	}

	public Collateral setCollateralType(CollateralTypeCode collateralType) {
		this.collateralType = Objects.requireNonNull(collateralType);
		return this;
	}

	public ActiveCurrencyAndAmount getBaseCurrencyAmount() {
		return baseCurrencyAmount;
	}

	public Collateral setBaseCurrencyAmount(ActiveCurrencyAndAmount baseCurrencyAmount) {
		this.baseCurrencyAmount = Objects.requireNonNull(baseCurrencyAmount);
		return this;
	}

	public CollateralPurposeCode getCollateralPurpose() {
		return collateralPurpose;
	}

	public Collateral setCollateralPurpose(CollateralPurposeCode collateralPurpose) {
		this.collateralPurpose = Objects.requireNonNull(collateralPurpose);
		return this;
	}

	public Optional<CollateralBalance> getCollateralBalance() {
		return collateralBalance == null ? Optional.empty() : Optional.of(collateralBalance);
	}

	public Collateral setCollateralBalance(CollateralBalance collateralBalance) {
		this.collateralBalance = collateralBalance;
		return this;
	}

	public List<Account> getCollateralAccount() {
		return collateralAccount == null ? collateralAccount = new ArrayList<>() : collateralAccount;
	}

	public Collateral setCollateralAccount(List<Account> collateralAccount) {
		this.collateralAccount = Objects.requireNonNull(collateralAccount);
		return this;
	}

	public CollateralManagement getCollateralManagement() {
		return collateralManagement;
	}

	public Collateral setCollateralManagement(CollateralManagement collateralManagement) {
		this.collateralManagement = Objects.requireNonNull(collateralManagement);
		return this;
	}

	public List<CollateralPartyRole> getCollateralPartyRole() {
		return collateralPartyRole == null ? collateralPartyRole = new ArrayList<>() : collateralPartyRole;
	}

	public Collateral setCollateralPartyRole(List<CollateralPartyRole> collateralPartyRole) {
		this.collateralPartyRole = Objects.requireNonNull(collateralPartyRole);
		return this;
	}

	public List<CollateralStatus> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public Collateral setStatus(List<CollateralStatus> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public AssetHolding getAssetHolding() {
		return assetHolding;
	}

	public Collateral setAssetHolding(AssetHolding assetHolding) {
		this.assetHolding = Objects.requireNonNull(assetHolding);
		return this;
	}

	public List<AssetHolding> getVariationMarginAssetHolding() {
		return variationMarginAssetHolding == null ? variationMarginAssetHolding = new ArrayList<>() : variationMarginAssetHolding;
	}

	public Collateral setVariationMarginAssetHolding(List<AssetHolding> variationMarginAssetHolding) {
		this.variationMarginAssetHolding = Objects.requireNonNull(variationMarginAssetHolding);
		return this;
	}

	public List<AssetHolding> getSegregatedIndependentAmountAssetHolding() {
		return segregatedIndependentAmountAssetHolding == null ? segregatedIndependentAmountAssetHolding = new ArrayList<>() : segregatedIndependentAmountAssetHolding;
	}

	public Collateral setSegregatedIndependentAmountAssetHolding(List<AssetHolding> segregatedIndependentAmountAssetHolding) {
		this.segregatedIndependentAmountAssetHolding = Objects.requireNonNull(segregatedIndependentAmountAssetHolding);
		return this;
	}

	public CollateralAgreement getCollateralAgreement() {
		return collateralAgreement;
	}

	public Collateral setCollateralAgreement(CollateralAgreement collateralAgreement) {
		this.collateralAgreement = Objects.requireNonNull(collateralAgreement);
		return this;
	}

	public Max35Text getCollateralOwnership() {
		return collateralOwnership;
	}

	public Collateral setCollateralOwnership(Max35Text collateralOwnership) {
		this.collateralOwnership = Objects.requireNonNull(collateralOwnership);
		return this;
	}

	public Optional<CollateralSubstitution> getRelatedCollateralSubstitution() {
		return relatedCollateralSubstitution == null ? Optional.empty() : Optional.of(relatedCollateralSubstitution);
	}

	public Collateral setRelatedCollateralSubstitution(CollateralSubstitution relatedCollateralSubstitution) {
		this.relatedCollateralSubstitution = relatedCollateralSubstitution;
		return this;
	}
}