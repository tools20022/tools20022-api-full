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
import com.tools20022.repository.choice.SecuredCollateral1Choice;
import com.tools20022.repository.choice.SecuredCollateral2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralValuation" src="doc-files/CollateralValuation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#Collateral
 * CollateralValuation.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#CollateralValuationDate
 * CollateralValuation.CollateralValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#RelatedManagementProcess
 * CollateralValuation.RelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#ReportedCurrencyAndAmount
 * CollateralValuation.ReportedCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#MarketValueAmount
 * CollateralValuation.MarketValueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#AdjustedRate
 * CollateralValuation.AdjustedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#CollateralValuationCurrency
 * CollateralValuation.CollateralValuationCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#Valuation
 * Collateral.Valuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#CollateralValuation
 * CollateralManagement.CollateralValuation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#SingleCollateral
 * SecuredCollateral1Choice.SingleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#MultipleCollateral
 * SecuredCollateral1Choice.MultipleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#PoolCollateral
 * SecuredCollateral1Choice.PoolCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#OtherCollateral
 * SecuredCollateral1Choice.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#SingleCollateral
 * SecuredCollateral2Choice.SingleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#MultipleCollateral
 * SecuredCollateral2Choice.MultipleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#PoolCollateral
 * SecuredCollateral2Choice.PoolCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#OtherCollateral
 * SecuredCollateral2Choice.OtherCollateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation1
 * CollateralValuation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuePosition1
 * CollateralValuePosition1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValue1
 * CollateralValue1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation2
 * CollateralValuation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice
 * SecuredCollateral1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation3
 * CollateralValuation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation4
 * CollateralValuation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation5
 * CollateralValuation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation7
 * CollateralValuation7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice
 * SecuredCollateral2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation6
 * CollateralValuation6}</li>
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
 * "CollateralValuation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the valuation of each piece of collateral that is posted."
 * </li>
 * </ul>
 */
public class CollateralValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral which is the subject of the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#Valuation
	 * Collateral.Valuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#AmountDetails
	 * CollateralValuation1.AmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#ValuationAmounts
	 * CollateralValuation2.ValuationAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#ValuationAmounts
	 * CollateralValuation5.ValuationAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral which is the subject of the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuation1.AmountDetails, com.tools20022.repository.msg.CollateralValuation2.ValuationAmounts,
					com.tools20022.repository.msg.CollateralValuation5.ValuationAmounts);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Collateral which is the subject of the valuation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.Valuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Valuation date of the collateral.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#ValueDate
	 * SecuritiesCollateral1.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#ValueDate
	 * CashCollateral1.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral1#ValueDate
	 * OtherCollateral1.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#ValuationDate
	 * CollateralValue1.ValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#ValueDate
	 * SecuritiesCollateral2.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral2#ValueDate
	 * OtherCollateral2.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral3#ValueDate
	 * CashCollateral3.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#ValueDate
	 * SecuritiesCollateral3.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#ValueDate
	 * OtherCollateral3.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#ValueDate
	 * CashCollateral4.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral2#ValueDate
	 * CashCollateral2.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#ValueDate
	 * OtherCollateral4.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#ValueDate
	 * SecuritiesCollateral4.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral5#ValueDate
	 * CashCollateral5.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7#ValueDate
	 * OtherCollateral7.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6#ValueDate
	 * OtherCollateral6.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#ValueDate
	 * SecuritiesCollateral6.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#ValueDate
	 * SecuritiesCollateral5.ValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral5#ValueDate
	 * OtherCollateral5.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#ValueDate
	 * SecuritiesCollateral7.ValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#ValueDate
	 * SecuritiesCollateral8.ValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation date of the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralValuationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesCollateral1.ValueDate, com.tools20022.repository.msg.CashCollateral1.ValueDate, com.tools20022.repository.msg.OtherCollateral1.ValueDate,
					com.tools20022.repository.msg.CollateralValue1.ValuationDate, com.tools20022.repository.msg.SecuritiesCollateral2.ValueDate, com.tools20022.repository.msg.OtherCollateral2.ValueDate,
					com.tools20022.repository.msg.CashCollateral3.ValueDate, com.tools20022.repository.msg.SecuritiesCollateral3.ValueDate, com.tools20022.repository.msg.OtherCollateral3.ValueDate,
					com.tools20022.repository.msg.CashCollateral4.ValueDate, com.tools20022.repository.msg.CashCollateral2.ValueDate, com.tools20022.repository.msg.OtherCollateral4.ValueDate,
					com.tools20022.repository.msg.SecuritiesCollateral4.ValueDate, com.tools20022.repository.msg.CashCollateral5.ValueDate, com.tools20022.repository.msg.OtherCollateral7.ValueDate,
					com.tools20022.repository.msg.OtherCollateral6.ValueDate, com.tools20022.repository.msg.SecuritiesCollateral6.ValueDate, com.tools20022.repository.msg.SecuritiesCollateral5.ValueDate,
					com.tools20022.repository.msg.OtherCollateral5.ValueDate, com.tools20022.repository.msg.SecuritiesCollateral7.ValueDate, com.tools20022.repository.msg.SecuritiesCollateral8.ValueDate);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuationDate";
			definition = "Valuation date of the collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#CollateralValuation
	 * CollateralManagement.CollateralValuation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.CollateralValuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the total amount of the collateral in the reporting currency.
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
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#ReportedCurrencyAndAmount
	 * CollateralAmount1.ReportedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#TotalCollateralValuation
	 * CollateralValuePosition1.TotalCollateralValuation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of the collateral in the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReportedCurrencyAndAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralAmount1.ReportedCurrencyAndAmount, com.tools20022.repository.msg.CollateralValuePosition1.TotalCollateralValuation);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedCurrencyAndAmount";
			definition = "Specifies the total amount of the collateral in the reporting currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the total market to market value of the collateral in the
	 * reporting currency. It is the dirty price, that is, the accrued interest
	 * is included if any.
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
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#MarketValueAmount
	 * CollateralAmount1.MarketValueAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarketValueAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralAmount1.MarketValueAmount);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValueAmount";
			definition = "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage by which the collateral amount needs to be adjusted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#AdjustedRate
	 * CollateralValuation1.AdjustedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#AdjustedRate
	 * CollateralValuation2.AdjustedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#AdjustedRate
	 * CollateralValuation5.AdjustedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which the collateral amount needs to be adjusted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdjustedRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuation1.AdjustedRate, com.tools20022.repository.msg.CollateralValuation2.AdjustedRate,
					com.tools20022.repository.msg.CollateralValuation5.AdjustedRate);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Currency used for the valuation.
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
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#ValuationCurrency
	 * CollateralValue1.ValuationCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency used for the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralValuationCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValue1.ValuationCurrency);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuationCurrency";
			definition = "Currency used for the valuation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.Valuation, com.tools20022.repository.entity.CollateralManagement.CollateralValuation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuredCollateral1Choice.SingleCollateral, com.tools20022.repository.choice.SecuredCollateral1Choice.MultipleCollateral,
						com.tools20022.repository.choice.SecuredCollateral1Choice.PoolCollateral, com.tools20022.repository.choice.SecuredCollateral1Choice.OtherCollateral,
						com.tools20022.repository.choice.SecuredCollateral2Choice.SingleCollateral, com.tools20022.repository.choice.SecuredCollateral2Choice.MultipleCollateral,
						com.tools20022.repository.choice.SecuredCollateral2Choice.PoolCollateral, com.tools20022.repository.choice.SecuredCollateral2Choice.OtherCollateral);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralValuation.Collateral, com.tools20022.repository.entity.CollateralValuation.CollateralValuationDate,
						com.tools20022.repository.entity.CollateralValuation.RelatedManagementProcess, com.tools20022.repository.entity.CollateralValuation.ReportedCurrencyAndAmount,
						com.tools20022.repository.entity.CollateralValuation.MarketValueAmount, com.tools20022.repository.entity.CollateralValuation.AdjustedRate,
						com.tools20022.repository.entity.CollateralValuation.CollateralValuationCurrency);
				derivationComponent_lazy = () -> Arrays.asList(CollateralValuation1.mmObject(), CollateralValuePosition1.mmObject(), CollateralValue1.mmObject(), CollateralValuation2.mmObject(), SecuredCollateral1Choice.mmObject(),
						CollateralValuation3.mmObject(), CollateralValuation4.mmObject(), CollateralValuation5.mmObject(), CollateralValuation7.mmObject(), SecuredCollateral2Choice.mmObject(), CollateralValuation6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}