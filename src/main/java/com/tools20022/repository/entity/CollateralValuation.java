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
import com.tools20022.repository.choice.SecuredCollateral1Choice;
import com.tools20022.repository.choice.SecuredCollateral2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmValuation
 * Collateral.mmValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralValuation
 * CollateralManagement.mmCollateralValuation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmSingleCollateral
 * SecuredCollateral1Choice.mmSingleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmMultipleCollateral
 * SecuredCollateral1Choice.mmMultipleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmPoolCollateral
 * SecuredCollateral1Choice.mmPoolCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmOtherCollateral
 * SecuredCollateral1Choice.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmSingleCollateral
 * SecuredCollateral2Choice.mmSingleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmMultipleCollateral
 * SecuredCollateral2Choice.mmMultipleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmPoolCollateral
 * SecuredCollateral2Choice.mmPoolCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmOtherCollateral
 * SecuredCollateral2Choice.mmOtherCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
 * CollateralValuation.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
 * CollateralValuation.mmCollateralValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmRelatedManagementProcess
 * CollateralValuation.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmReportedCurrencyAndAmount
 * CollateralValuation.mmReportedCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmMarketValueAmount
 * CollateralValuation.mmMarketValueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmAdjustedRate
 * CollateralValuation.mmAdjustedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationCurrency
 * CollateralValuation.mmCollateralValuationCurrency}</li>
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
 * "CollateralValuation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the valuation of each piece of collateral that is posted."
 * </li>
 * </ul>
 */
public class CollateralValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Collateral> collateral;
	/**
	 * Collateral which is the subject of the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmValuation
	 * Collateral.mmValuation}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmAmountDetails
	 * CollateralValuation1.mmAmountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmValuationAmounts
	 * CollateralValuation2.mmValuationAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmValuationAmounts
	 * CollateralValuation5.mmValuationAmounts}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCollateral = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValuation1.mmAmountDetails, CollateralValuation2.mmValuationAmounts, CollateralValuation5.mmValuationAmounts);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Collateral which is the subject of the valuation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected ISODateTime collateralValuationDate;
	/**
	 * Valuation date of the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#mmValueDate
	 * SecuritiesCollateral1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#mmValueDate
	 * CashCollateral1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmValueDate
	 * OtherCollateral1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmValuationDate
	 * CollateralValue1.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmValueDate
	 * SecuritiesCollateral2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmValueDate
	 * OtherCollateral2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmValueDate
	 * CashCollateral3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmValueDate
	 * SecuritiesCollateral3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmValueDate
	 * OtherCollateral3.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmValueDate
	 * CashCollateral4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmValueDate
	 * CashCollateral2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmValueDate
	 * OtherCollateral4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmValueDate
	 * SecuritiesCollateral4.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmValueDate
	 * CashCollateral5.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmValueDate
	 * OtherCollateral7.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmValueDate
	 * OtherCollateral6.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmValueDate
	 * SecuritiesCollateral6.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmValueDate
	 * SecuritiesCollateral5.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmValueDate
	 * OtherCollateral5.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmValueDate
	 * SecuritiesCollateral7.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmValueDate
	 * SecuritiesCollateral8.mmValueDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCollateralValuationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesCollateral1.mmValueDate, CashCollateral1.mmValueDate, OtherCollateral1.mmValueDate, CollateralValue1.mmValuationDate, SecuritiesCollateral2.mmValueDate,
					OtherCollateral2.mmValueDate, CashCollateral3.mmValueDate, SecuritiesCollateral3.mmValueDate, OtherCollateral3.mmValueDate, CashCollateral4.mmValueDate, CashCollateral2.mmValueDate, OtherCollateral4.mmValueDate,
					SecuritiesCollateral4.mmValueDate, CashCollateral5.mmValueDate, OtherCollateral7.mmValueDate, OtherCollateral6.mmValueDate, SecuritiesCollateral6.mmValueDate, SecuritiesCollateral5.mmValueDate,
					OtherCollateral5.mmValueDate, SecuritiesCollateral7.mmValueDate, SecuritiesCollateral8.mmValueDate);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuationDate";
			definition = "Valuation date of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralValuation
	 * CollateralManagement.mmCollateralValuation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmCollateralValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount reportedCurrencyAndAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmReportedCurrencyAndAmount
	 * CollateralAmount1.mmReportedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmTotalCollateralValuation
	 * CollateralValuePosition1.mmTotalCollateralValuation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmReportedCurrencyAndAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralAmount1.mmReportedCurrencyAndAmount, CollateralValuePosition1.mmTotalCollateralValuation);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedCurrencyAndAmount";
			definition = "Specifies the total amount of the collateral in the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount marketValueAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmMarketValueAmount
	 * CollateralAmount1.mmMarketValueAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmMarketValueAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralAmount1.mmMarketValueAmount);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValueAmount";
			definition = "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected BaseOneRate adjustedRate;
	/**
	 * Percentage by which the collateral amount needs to be adjusted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmAdjustedRate
	 * CollateralValuation1.mmAdjustedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmAdjustedRate
	 * CollateralValuation2.mmAdjustedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmAdjustedRate
	 * CollateralValuation5.mmAdjustedRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAdjustedRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValuation1.mmAdjustedRate, CollateralValuation2.mmAdjustedRate, CollateralValuation5.mmAdjustedRate);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected CurrencyCode collateralValuationCurrency;
	/**
	 * Currency used for the valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmValuationCurrency
	 * CollateralValue1.mmValuationCurrency}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCollateralValuationCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValue1.mmValuationCurrency);
			elementContext_lazy = () -> CollateralValuation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuationCurrency";
			definition = "Currency used for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.mmValuation, com.tools20022.repository.entity.CollateralManagement.mmCollateralValuation);
				derivationElement_lazy = () -> Arrays.asList(SecuredCollateral1Choice.mmSingleCollateral, SecuredCollateral1Choice.mmMultipleCollateral, SecuredCollateral1Choice.mmPoolCollateral, SecuredCollateral1Choice.mmOtherCollateral,
						SecuredCollateral2Choice.mmSingleCollateral, SecuredCollateral2Choice.mmMultipleCollateral, SecuredCollateral2Choice.mmPoolCollateral, SecuredCollateral2Choice.mmOtherCollateral);
				element_lazy = () -> Arrays.asList(CollateralValuation.mmCollateral, CollateralValuation.mmCollateralValuationDate, CollateralValuation.mmRelatedManagementProcess, CollateralValuation.mmReportedCurrencyAndAmount,
						CollateralValuation.mmMarketValueAmount, CollateralValuation.mmAdjustedRate, CollateralValuation.mmCollateralValuationCurrency);
				derivationComponent_lazy = () -> Arrays.asList(CollateralValuation1.mmObject(), CollateralValuePosition1.mmObject(), CollateralValue1.mmObject(), CollateralValuation2.mmObject(), SecuredCollateral1Choice.mmObject(),
						CollateralValuation3.mmObject(), CollateralValuation4.mmObject(), CollateralValuation5.mmObject(), CollateralValuation7.mmObject(), SecuredCollateral2Choice.mmObject(), CollateralValuation6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Collateral> getCollateral() {
		return collateral;
	}

	public void setCollateral(List<com.tools20022.repository.entity.Collateral> collateral) {
		this.collateral = collateral;
	}

	public ISODateTime getCollateralValuationDate() {
		return collateralValuationDate;
	}

	public void setCollateralValuationDate(ISODateTime collateralValuationDate) {
		this.collateralValuationDate = collateralValuationDate;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return relatedManagementProcess;
	}

	public void setRelatedManagementProcess(com.tools20022.repository.entity.CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
	}

	public ActiveCurrencyAndAmount getReportedCurrencyAndAmount() {
		return reportedCurrencyAndAmount;
	}

	public void setReportedCurrencyAndAmount(ActiveCurrencyAndAmount reportedCurrencyAndAmount) {
		this.reportedCurrencyAndAmount = reportedCurrencyAndAmount;
	}

	public ActiveCurrencyAndAmount getMarketValueAmount() {
		return marketValueAmount;
	}

	public void setMarketValueAmount(ActiveCurrencyAndAmount marketValueAmount) {
		this.marketValueAmount = marketValueAmount;
	}

	public BaseOneRate getAdjustedRate() {
		return adjustedRate;
	}

	public void setAdjustedRate(BaseOneRate adjustedRate) {
		this.adjustedRate = adjustedRate;
	}

	public CurrencyCode getCollateralValuationCurrency() {
		return collateralValuationCurrency;
	}

	public void setCollateralValuationCurrency(CurrencyCode collateralValuationCurrency) {
		this.collateralValuationCurrency = collateralValuationCurrency;
	}
}