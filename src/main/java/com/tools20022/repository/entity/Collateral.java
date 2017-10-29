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
import com.tools20022.repository.choice.CollateralPurpose1Choice;
import com.tools20022.repository.choice.CollateralType1Choice;
import com.tools20022.repository.codeset.CollateralPurposeCode;
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#CollateralAmount
 * Collateral.CollateralAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#Valuation
 * Collateral.Valuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#CollateralType
 * Collateral.CollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#BaseCurrencyAmount
 * Collateral.BaseCurrencyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralPurpose
 * Collateral.CollateralPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralBalance
 * Collateral.CollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAccount
 * Collateral.CollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralManagement
 * Collateral.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralPartyRole
 * Collateral.CollateralPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#Status
 * Collateral.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#AssetHolding
 * Collateral.AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#VariationMarginAssetHolding
 * Collateral.VariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#SegregatedIndependentAmountAssetHolding
 * Collateral.SegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAgreement
 * Collateral.CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralOwnership
 * Collateral.CollateralOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#RelatedCollateralSubstitution
 * Collateral.RelatedCollateralSubstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedCollateralProcess
 * Account.RelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Collateral
 * AssetHolding.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#VariationMarginCollateral
 * AssetHolding.VariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#IndependentAmountCollateral
 * AssetHolding.IndependentAmountCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#Collateral
 * CollateralValuation.Collateral}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus#Collateral
 * CollateralStatus.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#Collateral
 * CollateralAgreement.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#Collateral
 * CollateralPartyRole.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#Collateral
 * CollateralManagement.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#NewCollateral
 * CollateralSubstitution.NewCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralDescription
 * CollateralBalance.CollateralDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractCollateral1#CollateralDescription
 * ContractCollateral1.CollateralDescription}</li>
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
	/**
	 * Value of the collateral as an amount.
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
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts12#Margin
	 * OtherAmounts12.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts14#Margin
	 * OtherAmounts14.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts20#Margin
	 * OtherAmounts20.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts4#Margin
	 * OtherAmounts4.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts5#Margin
	 * OtherAmounts5.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts17#Margin
	 * OtherAmounts17.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts23#Margin
	 * OtherAmounts23.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts3#Margin
	 * OtherAmounts3.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts7#Margin
	 * OtherAmounts7.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts9#Margin
	 * OtherAmounts9.Margin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#CollateralMonitorAmount
	 * OtherAmounts9.CollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts10#Margin
	 * OtherAmounts10.Margin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#CollateralMonitorAmount
	 * OtherAmounts10.CollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts18#Margin
	 * OtherAmounts18.Margin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#CollateralMonitorAmount
	 * OtherAmounts18.CollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts24#Margin
	 * OtherAmounts24.Margin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#CollateralMonitorAmount
	 * OtherAmounts24.CollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts13#Margin
	 * OtherAmounts13.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts1#Margin
	 * OtherAmounts1.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts16#Margin
	 * OtherAmounts16.Margin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#CollateralAmount
	 * CollateralAmount1.CollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation3#NominalAmount
	 * CollateralValuation3.NominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4#NominalAmount
	 * CollateralValuation4.NominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractCollateral1#TotalAmount
	 * ContractCollateral1.TotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts28#Margin
	 * OtherAmounts28.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts30#Margin
	 * OtherAmounts30.Margin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#CollateralMonitorAmount
	 * OtherAmounts30.CollateralMonitorAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts31#Margin
	 * OtherAmounts31.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts35#Margin
	 * OtherAmounts35.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts34#Margin
	 * OtherAmounts34.Margin}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAmounts38#Margin
	 * OtherAmounts38.Margin}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#CollateralMonitorAmount
	 * OtherAmounts38.CollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#NominalAmount
	 * CollateralValuation7.NominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation6#NominalAmount
	 * CollateralValuation6.NominalAmount}</li>
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
	public static final MMBusinessAttribute CollateralAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.Margin, com.tools20022.repository.msg.OtherAmounts14.Margin, com.tools20022.repository.msg.OtherAmounts20.Margin,
					com.tools20022.repository.msg.OtherAmounts4.Margin, com.tools20022.repository.msg.OtherAmounts5.Margin, com.tools20022.repository.msg.OtherAmounts17.Margin, com.tools20022.repository.msg.OtherAmounts23.Margin,
					com.tools20022.repository.msg.OtherAmounts3.Margin, com.tools20022.repository.msg.OtherAmounts7.Margin, com.tools20022.repository.msg.OtherAmounts9.Margin,
					com.tools20022.repository.msg.OtherAmounts9.CollateralMonitorAmount, com.tools20022.repository.msg.OtherAmounts10.Margin, com.tools20022.repository.msg.OtherAmounts10.CollateralMonitorAmount,
					com.tools20022.repository.msg.OtherAmounts18.Margin, com.tools20022.repository.msg.OtherAmounts18.CollateralMonitorAmount, com.tools20022.repository.msg.OtherAmounts24.Margin,
					com.tools20022.repository.msg.OtherAmounts24.CollateralMonitorAmount, com.tools20022.repository.msg.OtherAmounts13.Margin, com.tools20022.repository.msg.OtherAmounts1.Margin,
					com.tools20022.repository.msg.OtherAmounts16.Margin, com.tools20022.repository.msg.CollateralAmount1.CollateralAmount, com.tools20022.repository.msg.CollateralValuation3.NominalAmount,
					com.tools20022.repository.msg.CollateralValuation4.NominalAmount, com.tools20022.repository.msg.ContractCollateral1.TotalAmount, com.tools20022.repository.msg.OtherAmounts28.Margin,
					com.tools20022.repository.msg.OtherAmounts30.Margin, com.tools20022.repository.msg.OtherAmounts30.CollateralMonitorAmount, com.tools20022.repository.msg.OtherAmounts31.Margin,
					com.tools20022.repository.msg.OtherAmounts35.Margin, com.tools20022.repository.msg.OtherAmounts34.Margin, com.tools20022.repository.msg.OtherAmounts38.Margin,
					com.tools20022.repository.msg.OtherAmounts38.CollateralMonitorAmount, com.tools20022.repository.msg.CollateralValuation7.NominalAmount, com.tools20022.repository.msg.CollateralValuation6.NominalAmount);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral as an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Valuation process of specific collateral elements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#Collateral
	 * CollateralValuation.Collateral}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#StartValue
	 * UnderlyingAttributes.StartValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#CurrentValue
	 * UnderlyingAttributes.CurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#EndValue
	 * UnderlyingAttributes.EndValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#StartValue
	 * UnderlyingAttributes2.StartValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#CurrentValue
	 * UnderlyingAttributes2.CurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#EndValue
	 * UnderlyingAttributes2.EndValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral10#Valuation
	 * Collateral10.Valuation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral14#Valuation
	 * Collateral14.Valuation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral18#Valuation
	 * Collateral18.Valuation}</li>
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
	 * name} = "Valuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation process of specific collateral elements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Valuation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingAttributes.StartValue, com.tools20022.repository.msg.UnderlyingAttributes.CurrentValue, com.tools20022.repository.msg.UnderlyingAttributes.EndValue,
					com.tools20022.repository.msg.UnderlyingAttributes2.StartValue, com.tools20022.repository.msg.UnderlyingAttributes2.CurrentValue, com.tools20022.repository.msg.UnderlyingAttributes2.EndValue,
					com.tools20022.repository.msg.Collateral10.Valuation, com.tools20022.repository.msg.Collateral14.Valuation, com.tools20022.repository.msg.Collateral18.Valuation);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Valuation";
			definition = "Valuation process of specific collateral elements.";
			minOccurs = 0;
			type_lazy = () -> CollateralValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralValuation.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of collateral.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.CollateralType1Choice#Code
	 * CollateralType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralType1Choice#Proprietary
	 * CollateralType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#CollateralType
	 * SecuritiesFinancing10.CollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#CollateralType
	 * CollateralValuation1.CollateralType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral3#CollateralType
	 * Collateral3.CollateralType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Collateral6#CollateralType
	 * Collateral6.CollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#CollateralType
	 * CollateralValuation2.CollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral10#SpecialCollateralIndicator
	 * Collateral10.SpecialCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#CollateralType
	 * CollateralValuation5.CollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement9#CollateralType
	 * CollateralMovement9.CollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral14#SpecialCollateralIndicator
	 * Collateral14.SpecialCollateralIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral18#SpecialCollateralIndicator
	 * Collateral18.SpecialCollateralIndicator}</li>
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
	public static final MMBusinessAttribute CollateralType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralType1Choice.Code, com.tools20022.repository.choice.CollateralType1Choice.Proprietary,
					com.tools20022.repository.msg.SecuritiesFinancing10.CollateralType, com.tools20022.repository.msg.CollateralValuation1.CollateralType, com.tools20022.repository.msg.Collateral3.CollateralType,
					com.tools20022.repository.msg.Collateral6.CollateralType, com.tools20022.repository.msg.CollateralValuation2.CollateralType, com.tools20022.repository.msg.Collateral10.SpecialCollateralIndicator,
					com.tools20022.repository.msg.CollateralValuation5.CollateralType, com.tools20022.repository.msg.CollateralMovement9.CollateralType, com.tools20022.repository.msg.Collateral14.SpecialCollateralIndicator,
					com.tools20022.repository.msg.Collateral18.SpecialCollateralIndicator);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	/**
	 * Value of the collateral in the currency used for reporting.
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
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#SubstitutionRequirement
	 * CollateralSubstitution1.SubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#SubstitutionRequirement
	 * CollateralSubstitution2.SubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#SubstitutionRequirement
	 * CollateralSubstitution3.SubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#SubstitutionRequirement
	 * CollateralSubstitution5.SubstitutionRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#SubstitutionRequirement
	 * CollateralSubstitution4.SubstitutionRequirement}</li>
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
	public static final MMBusinessAttribute BaseCurrencyAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralSubstitution1.SubstitutionRequirement, com.tools20022.repository.msg.CollateralSubstitution2.SubstitutionRequirement,
					com.tools20022.repository.msg.CollateralSubstitution3.SubstitutionRequirement, com.tools20022.repository.msg.CollateralSubstitution5.SubstitutionRequirement,
					com.tools20022.repository.msg.CollateralSubstitution4.SubstitutionRequirement);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseCurrencyAmount";
			definition = "Value of the collateral in the currency used for reporting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the collateral has been posted against the variation
	 * margin or the segregated independent amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.CollateralPurpose1Choice#Code
	 * CollateralPurpose1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralPurpose1Choice#Proprietary
	 * CollateralPurpose1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#CollateralPurpose
	 * InterestAmount1.CollateralPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#CollateralPurpose
	 * InterestAmount2.CollateralPurpose}</li>
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
	public static final MMBusinessAttribute CollateralPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralPurpose1Choice.Code, com.tools20022.repository.choice.CollateralPurpose1Choice.Proprietary,
					com.tools20022.repository.msg.InterestAmount1.CollateralPurpose, com.tools20022.repository.msg.InterestAmount2.CollateralPurpose);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralPurpose";
			definition = "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralPurposeCode.mmObject();
		}
	};
	/**
	 * Collateral balance which contain specific collateral elements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralDescription
	 * CollateralBalance.CollateralDescription}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#OpeningCollateralBalance
	 * InterestAmount1.OpeningCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#ClosingCollateralBalance
	 * InterestAmount1.ClosingCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#OpeningCollateralBalance
	 * InterestAmount2.OpeningCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#ClosingCollateralBalance
	 * InterestAmount2.ClosingCollateralBalance}</li>
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
	public static final MMBusinessAssociationEnd CollateralBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestAmount1.OpeningCollateralBalance, com.tools20022.repository.msg.InterestAmount1.ClosingCollateralBalance,
					com.tools20022.repository.msg.InterestAmount2.OpeningCollateralBalance, com.tools20022.repository.msg.InterestAmount2.ClosingCollateralBalance);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBalance";
			definition = "Collateral balance which contain specific collateral elements.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.CollateralDescription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account from or to which collateral is delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#RelatedCollateralProcess
	 * Account.RelatedCollateralProcess}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Obligation2#CollateralAccountIdentification
	 * Obligation2.CollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral5#AccountIdentification
	 * Collateral5.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation3#CollateralAccountIdentification
	 * Obligation3.CollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral9#AccountIdentification
	 * Collateral9.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation4#CollateralAccountIdentification
	 * Obligation4.CollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCall2#CollateralAccountIdentification
	 * MarginCall2.CollateralAccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Collateral13#AccountIdentification
	 * Collateral13.AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Obligation5#CollateralAccountIdentification
	 * Obligation5.CollateralAccountIdentification}</li>
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
	public static final MMBusinessAssociationEnd CollateralAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Obligation2.CollateralAccountIdentification, com.tools20022.repository.msg.Collateral5.AccountIdentification,
					com.tools20022.repository.msg.Obligation3.CollateralAccountIdentification, com.tools20022.repository.msg.Collateral9.AccountIdentification, com.tools20022.repository.msg.Obligation4.CollateralAccountIdentification,
					com.tools20022.repository.msg.MarginCall2.CollateralAccountIdentification, com.tools20022.repository.msg.Collateral13.AccountIdentification, com.tools20022.repository.msg.Obligation5.CollateralAccountIdentification);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAccount";
			definition = "Account from or to which collateral is delivered.";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedCollateralProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Series of processes which are related to the collateral processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#Collateral
	 * CollateralManagement.Collateral}</li>
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
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Series of processes which are related to the collateral processes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the roles played by a party in the context of collateral
	 * processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#Collateral
	 * CollateralPartyRole.Collateral}</li>
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
	public static final MMBusinessAssociationEnd CollateralPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPartyRole";
			definition = "Specifies the roles played by a party in the context of collateral processes.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of the collateral or of an event related to
	 * collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#Collateral
	 * CollateralStatus.Collateral}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#SecuritiesCollateralResponse
	 * CollateralResponse1.SecuritiesCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#CashCollateralResponse
	 * CollateralResponse1.CashCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse1#OtherCollateralResponse
	 * CollateralResponse1.OtherCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#SecuritiesCollateralResponse
	 * CollateralResponse2.SecuritiesCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#CashCollateralResponse
	 * CollateralResponse2.CashCollateralResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralResponse2#OtherCollateralResponse
	 * CollateralResponse2.OtherCollateralResponse}</li>
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
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralResponse1.SecuritiesCollateralResponse, com.tools20022.repository.msg.CollateralResponse1.CashCollateralResponse,
					com.tools20022.repository.msg.CollateralResponse1.OtherCollateralResponse, com.tools20022.repository.msg.CollateralResponse2.SecuritiesCollateralResponse,
					com.tools20022.repository.msg.CollateralResponse2.CashCollateralResponse, com.tools20022.repository.msg.CollateralResponse2.OtherCollateralResponse);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the collateral or of an event related to collateral.";
			minOccurs = 0;
			type_lazy = () -> CollateralStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralStatus.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the securities or physical entities given as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Collateral
	 * AssetHolding.Collateral}</li>
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
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetHolding";
			definition = "Specifies the securities or physical entities given as collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#VariationMarginCollateral
	 * AssetHolding.VariationMarginCollateral}</li>
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
	public static final MMBusinessAssociationEnd VariationMarginAssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariationMarginAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the variation margin.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#IndependentAmountCollateral
	 * AssetHolding.IndependentAmountCollateral}</li>
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
	public static final MMBusinessAssociationEnd SegregatedIndependentAmountAssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SegregatedIndependentAmountAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral agreement which governs the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#Collateral
	 * CollateralAgreement.Collateral}</li>
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
	public static final MMBusinessAssociationEnd CollateralAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which governs the collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies who is the owner of the collateral.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#CollateralOwnership
	 * SecuritiesCollateral2.CollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails88#CollateralOwnership
	 * SettlementDetails88.CollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#CollateralOwnership
	 * OtherCollateral3.CollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails102#CollateralOwnership
	 * SettlementDetails102.CollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#CollateralOwnership
	 * OtherCollateral6.CollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#CollateralOwnership
	 * SecuritiesCollateral6.CollateralOwnership}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails118#CollateralOwnership
	 * SettlementDetails118.CollateralOwnership}</li>
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
	public static final MMBusinessAttribute CollateralOwnership = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesCollateral2.CollateralOwnership, com.tools20022.repository.msg.SettlementDetails88.CollateralOwnership,
					com.tools20022.repository.msg.OtherCollateral3.CollateralOwnership, com.tools20022.repository.msg.SettlementDetails102.CollateralOwnership, com.tools20022.repository.msg.OtherCollateral6.CollateralOwnership,
					com.tools20022.repository.msg.SecuritiesCollateral6.CollateralOwnership, com.tools20022.repository.msg.SettlementDetails118.CollateralOwnership);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralOwnership";
			definition = "Specifies who is the owner of the collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Collateral substitution for which new collateral is replacing the
	 * returned one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#NewCollateral
	 * CollateralSubstitution.NewCollateral}</li>
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
	public static final MMBusinessAssociationEnd RelatedCollateralSubstitution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralSubstitution";
			definition = "Collateral substitution for which new collateral is replacing the returned one.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralSubstitution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.NewCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Collateral";
				definition = "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.RelatedCollateralProcess, com.tools20022.repository.entity.AssetHolding.Collateral,
						com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral, com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral, com.tools20022.repository.entity.CollateralValuation.Collateral,
						com.tools20022.repository.entity.CollateralStatus.Collateral, com.tools20022.repository.entity.CollateralAgreement.Collateral, com.tools20022.repository.entity.CollateralPartyRole.Collateral,
						com.tools20022.repository.entity.CollateralManagement.Collateral, com.tools20022.repository.entity.CollateralSubstitution.NewCollateral, com.tools20022.repository.entity.CollateralBalance.CollateralDescription);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractCollateral1.CollateralDescription);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.CollateralAmount, com.tools20022.repository.entity.Collateral.Valuation, com.tools20022.repository.entity.Collateral.CollateralType,
						com.tools20022.repository.entity.Collateral.BaseCurrencyAmount, com.tools20022.repository.entity.Collateral.CollateralPurpose, com.tools20022.repository.entity.Collateral.CollateralBalance,
						com.tools20022.repository.entity.Collateral.CollateralAccount, com.tools20022.repository.entity.Collateral.CollateralManagement, com.tools20022.repository.entity.Collateral.CollateralPartyRole,
						com.tools20022.repository.entity.Collateral.Status, com.tools20022.repository.entity.Collateral.AssetHolding, com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.Collateral.CollateralAgreement, com.tools20022.repository.entity.Collateral.CollateralOwnership,
						com.tools20022.repository.entity.Collateral.RelatedCollateralSubstitution);
				derivationComponent_lazy = () -> Arrays.asList(CollateralType1Choice.mmObject(), Collateral2.mmObject(), Collateral4.mmObject(), CollateralPurpose1Choice.mmObject(), CollateralAmount1.mmObject(), Collateral5.mmObject(),
						Collateral3.mmObject(), Collateral6.mmObject(), Collateral9.mmObject(), Collateral7.mmObject(), Collateral8.mmObject(), Collateral10.mmObject(), ContractCollateral1.mmObject(), Collateral13.mmObject(),
						Collateral11.mmObject(), CollateralMovement9.mmObject(), Collateral12.mmObject(), Collateral14.mmObject(), Collateral16.mmObject(), Collateral17.mmObject(), Collateral18.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}