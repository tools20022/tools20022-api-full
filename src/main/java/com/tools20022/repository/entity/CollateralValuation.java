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
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralManagement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValue2
 * CollateralValue2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuePosition2
 * CollateralValuePosition2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractValuationData4
 * ContractValuationData4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractValuationData5
 * ContractValuationData5}</li>
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
	protected List<Collateral> collateral;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CollateralValuation, List<Collateral>> mmCollateral = new MMBusinessAssociationEnd<CollateralValuation, List<Collateral>>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValuation1.mmAmountDetails, CollateralValuation2.mmValuationAmounts, CollateralValuation5.mmValuationAmounts);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Collateral which is the subject of the valuation.";
			minOccurs = 0;
			opposite_lazy = () -> Collateral.mmValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Collateral.mmObject();
		}

		@Override
		public List<Collateral> getValue(CollateralValuation obj) {
			return obj.getCollateral();
		}

		@Override
		public void setValue(CollateralValuation obj, List<Collateral> value) {
			obj.setCollateral(value);
		}
	};
	protected ISODateTime collateralValuationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralValue2#mmValuationDate
	 * CollateralValue2.mmValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmValueDate
	 * SecuritiesCollateral8.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractValuationData4#mmTimeStamp
	 * ContractValuationData4.mmTimeStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractValuationData5#mmTimeStamp
	 * ContractValuationData5.mmTimeStamp}</li>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation date of the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, ISODateTime> mmCollateralValuationDate = new MMBusinessAttribute<CollateralValuation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesCollateral1.mmValueDate, CashCollateral1.mmValueDate, OtherCollateral1.mmValueDate, CollateralValue1.mmValuationDate, SecuritiesCollateral2.mmValueDate,
					OtherCollateral2.mmValueDate, CashCollateral3.mmValueDate, SecuritiesCollateral3.mmValueDate, OtherCollateral3.mmValueDate, CashCollateral4.mmValueDate, CashCollateral2.mmValueDate, OtherCollateral4.mmValueDate,
					SecuritiesCollateral4.mmValueDate, CashCollateral5.mmValueDate, OtherCollateral7.mmValueDate, OtherCollateral6.mmValueDate, SecuritiesCollateral6.mmValueDate, SecuritiesCollateral5.mmValueDate,
					OtherCollateral5.mmValueDate, SecuritiesCollateral7.mmValueDate, CollateralValue2.mmValuationDate, SecuritiesCollateral8.mmValueDate, ContractValuationData4.mmTimeStamp, ContractValuationData5.mmTimeStamp);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralValuationDate";
			definition = "Valuation date of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CollateralValuation obj) {
			return obj.getCollateralValuationDate();
		}

		@Override
		public void setValue(CollateralValuation obj, ISODateTime value) {
			obj.setCollateralValuationDate(value);
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<CollateralValuation, Optional<CollateralManagement>> mmRelatedManagementProcess = new MMBusinessAssociationEnd<CollateralValuation, Optional<CollateralManagement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CollateralManagement.mmCollateralValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public Optional<CollateralManagement> getValue(CollateralValuation obj) {
			return obj.getRelatedManagementProcess();
		}

		@Override
		public void setValue(CollateralValuation obj, Optional<CollateralManagement> value) {
			obj.setRelatedManagementProcess(value.orElse(null));
		}
	};
	protected CurrencyAndAmount reportedCurrencyAndAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmReportedCurrencyAndAmount
	 * CollateralAmount1.mmReportedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1#mmTotalCollateralValuation
	 * CollateralValuePosition1.mmTotalCollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition2#mmTotalCollateralValuation
	 * CollateralValuePosition2.mmTotalCollateralValuation}</li>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of the collateral in the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, CurrencyAndAmount> mmReportedCurrencyAndAmount = new MMBusinessAttribute<CollateralValuation, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralAmount1.mmReportedCurrencyAndAmount, CollateralValuePosition1.mmTotalCollateralValuation, CollateralValuePosition2.mmTotalCollateralValuation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportedCurrencyAndAmount";
			definition = "Specifies the total amount of the collateral in the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CollateralValuation obj) {
			return obj.getReportedCurrencyAndAmount();
		}

		@Override
		public void setValue(CollateralValuation obj, CurrencyAndAmount value) {
			obj.setReportedCurrencyAndAmount(value);
		}
	};
	protected CurrencyAndAmount marketValueAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmMarketValueAmount
	 * CollateralAmount1.mmMarketValueAmount}</li>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, CurrencyAndAmount> mmMarketValueAmount = new MMBusinessAttribute<CollateralValuation, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralAmount1.mmMarketValueAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketValueAmount";
			definition = "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CollateralValuation obj) {
			return obj.getMarketValueAmount();
		}

		@Override
		public void setValue(CollateralValuation obj, CurrencyAndAmount value) {
			obj.setMarketValueAmount(value);
		}
	};
	protected BaseOneRate adjustedRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which the collateral amount needs to be adjusted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, BaseOneRate> mmAdjustedRate = new MMBusinessAttribute<CollateralValuation, BaseOneRate>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValuation1.mmAdjustedRate, CollateralValuation2.mmAdjustedRate, CollateralValuation5.mmAdjustedRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(CollateralValuation obj) {
			return obj.getAdjustedRate();
		}

		@Override
		public void setValue(CollateralValuation obj, BaseOneRate value) {
			obj.setAdjustedRate(value);
		}
	};
	protected CurrencyCode collateralValuationCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralValue1#mmValuationCurrency
	 * CollateralValue1.mmValuationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValue2#mmValuationCurrency
	 * CollateralValue2.mmValuationCurrency}</li>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency used for the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, CurrencyCode> mmCollateralValuationCurrency = new MMBusinessAttribute<CollateralValuation, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralValue1.mmValuationCurrency, CollateralValue2.mmValuationCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralValuationCurrency";
			definition = "Currency used for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CollateralValuation obj) {
			return obj.getCollateralValuationCurrency();
		}

		@Override
		public void setValue(CollateralValuation obj, CurrencyCode value) {
			obj.setCollateralValuationCurrency(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
				associationDomain_lazy = () -> Arrays.asList(Collateral.mmValuation, CollateralManagement.mmCollateralValuation);
				derivationElement_lazy = () -> Arrays.asList(SecuredCollateral1Choice.mmSingleCollateral, SecuredCollateral1Choice.mmMultipleCollateral, SecuredCollateral1Choice.mmPoolCollateral, SecuredCollateral1Choice.mmOtherCollateral,
						SecuredCollateral2Choice.mmSingleCollateral, SecuredCollateral2Choice.mmMultipleCollateral, SecuredCollateral2Choice.mmPoolCollateral, SecuredCollateral2Choice.mmOtherCollateral);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralValuation.mmCollateral, com.tools20022.repository.entity.CollateralValuation.mmCollateralValuationDate,
						com.tools20022.repository.entity.CollateralValuation.mmRelatedManagementProcess, com.tools20022.repository.entity.CollateralValuation.mmReportedCurrencyAndAmount,
						com.tools20022.repository.entity.CollateralValuation.mmMarketValueAmount, com.tools20022.repository.entity.CollateralValuation.mmAdjustedRate,
						com.tools20022.repository.entity.CollateralValuation.mmCollateralValuationCurrency);
				derivationComponent_lazy = () -> Arrays.asList(CollateralValuation1.mmObject(), CollateralValuePosition1.mmObject(), CollateralValue1.mmObject(), CollateralValuation2.mmObject(), SecuredCollateral1Choice.mmObject(),
						CollateralValuation3.mmObject(), CollateralValuation4.mmObject(), CollateralValuation5.mmObject(), CollateralValuation7.mmObject(), SecuredCollateral2Choice.mmObject(), CollateralValuation6.mmObject(),
						CollateralValue2.mmObject(), CollateralValuePosition2.mmObject(), ContractValuationData4.mmObject(), ContractValuationData5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralValuation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Collateral> getCollateral() {
		return collateral == null ? collateral = new ArrayList<>() : collateral;
	}

	public CollateralValuation setCollateral(List<Collateral> collateral) {
		this.collateral = Objects.requireNonNull(collateral);
		return this;
	}

	public ISODateTime getCollateralValuationDate() {
		return collateralValuationDate;
	}

	public CollateralValuation setCollateralValuationDate(ISODateTime collateralValuationDate) {
		this.collateralValuationDate = Objects.requireNonNull(collateralValuationDate);
		return this;
	}

	public Optional<CollateralManagement> getRelatedManagementProcess() {
		return relatedManagementProcess == null ? Optional.empty() : Optional.of(relatedManagementProcess);
	}

	public CollateralValuation setRelatedManagementProcess(CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
		return this;
	}

	public CurrencyAndAmount getReportedCurrencyAndAmount() {
		return reportedCurrencyAndAmount;
	}

	public CollateralValuation setReportedCurrencyAndAmount(CurrencyAndAmount reportedCurrencyAndAmount) {
		this.reportedCurrencyAndAmount = Objects.requireNonNull(reportedCurrencyAndAmount);
		return this;
	}

	public CurrencyAndAmount getMarketValueAmount() {
		return marketValueAmount;
	}

	public CollateralValuation setMarketValueAmount(CurrencyAndAmount marketValueAmount) {
		this.marketValueAmount = Objects.requireNonNull(marketValueAmount);
		return this;
	}

	public BaseOneRate getAdjustedRate() {
		return adjustedRate;
	}

	public CollateralValuation setAdjustedRate(BaseOneRate adjustedRate) {
		this.adjustedRate = Objects.requireNonNull(adjustedRate);
		return this;
	}

	public CurrencyCode getCollateralValuationCurrency() {
		return collateralValuationCurrency;
	}

	public CollateralValuation setCollateralValuationCurrency(CurrencyCode collateralValuationCurrency) {
		this.collateralValuationCurrency = Objects.requireNonNull(collateralValuationCurrency);
		return this;
	}
}