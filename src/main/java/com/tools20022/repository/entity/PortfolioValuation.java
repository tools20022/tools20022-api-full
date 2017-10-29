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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.msg.TotalPortfolioValuation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Valuation information of the portfolio.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PortfolioValuation" src="doc-files/PortfolioValuation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#TotalPortfolioValue
 * PortfolioValuation.TotalPortfolioValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#TotalBookValue
 * PortfolioValuation.TotalBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#TotalReceipts
 * PortfolioValuation.TotalReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#TotalDisbursements
 * PortfolioValuation.TotalDisbursements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#IncomeReceived
 * PortfolioValuation.IncomeReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#ExpensesPaid
 * PortfolioValuation.ExpensesPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#Portfolio
 * PortfolioValuation.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#ValuationPeriod
 * PortfolioValuation.ValuationPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPortfolioValuation
 * DateTimePeriod.RelatedPortfolioValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Valuation
 * Portfolio.Valuation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
 * TotalPortfolioValuation1}</li>
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
 * "PortfolioValuation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Valuation information of the portfolio."</li>
 * </ul>
 */
public class PortfolioValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total value of the portfolio. It is derived from the sum of the values of
	 * the asset holdings, of the unrealised gain/loss and of the liabilities.
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#TotalPortfolioValue
	 * TotalPortfolioValuation1.TotalPortfolioValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#PreviousTotalPortfolioValue
	 * TotalPortfolioValuation1.PreviousTotalPortfolioValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPortfolioValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the portfolio. It is derived from the sum of the values of the asset holdings, of the unrealised gain/loss and of the liabilities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalPortfolioValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.TotalPortfolioValue, com.tools20022.repository.msg.TotalPortfolioValuation1.PreviousTotalPortfolioValue);
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalPortfolioValue";
			definition = "Total value of the portfolio. It is derived from the sum of the values of the asset holdings, of the unrealised gain/loss and of the liabilities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Net asset on balance sheet - total portfolio value minus or plus the
	 * unrealised gain or loss.
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#TotalBookValue
	 * TotalPortfolioValuation1.TotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#PreviousTotalBookValue
	 * TotalPortfolioValuation1.PreviousTotalBookValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalBookValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.TotalBookValue, com.tools20022.repository.msg.TotalPortfolioValuation1.PreviousTotalBookValue);
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total receipts attributable to the portfolio.
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#TotalReceipts
	 * TotalPortfolioValuation1.TotalReceipts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReceipts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total receipts attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalReceipts = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.TotalReceipts);
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalReceipts";
			definition = "Total receipts attributable to the portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total disbursements attributable to the portfolio.
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#TotalDisbursements
	 * TotalPortfolioValuation1.TotalDisbursements}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDisbursements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total disbursements attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalDisbursements = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.TotalDisbursements);
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalDisbursements";
			definition = "Total disbursements attributable to the portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Income attributable to the portfolio.
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#IncomeReceived
	 * TotalPortfolioValuation1.IncomeReceived}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncomeReceived = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.IncomeReceived);
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncomeReceived";
			definition = "Income attributable to the portfolio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Expenses attributable to the portfolio
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
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#ExpensesPaid
	 * TotalPortfolioValuation1.ExpensesPaid}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpensesPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expenses attributable to the portfolio"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpensesPaid = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.ExpensesPaid);
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpensesPaid";
			definition = "Expenses attributable to the portfolio";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the portfolio for which a valuation is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#Valuation
	 * Portfolio.Valuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the portfolio for which a valuation is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Specifies the portfolio for which a valuation is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Valuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period for which the valuation is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedPortfolioValuation
	 * DateTimePeriod.RelatedPortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation
	 * PortfolioValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period for which the valuation is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValuationPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationPeriod";
			definition = "Period for which the valuation is calculated.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedPortfolioValuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioValuation";
				definition = "Valuation information of the portfolio.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedPortfolioValuation, com.tools20022.repository.entity.Portfolio.Valuation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioValuation.TotalPortfolioValue, com.tools20022.repository.entity.PortfolioValuation.TotalBookValue,
						com.tools20022.repository.entity.PortfolioValuation.TotalReceipts, com.tools20022.repository.entity.PortfolioValuation.TotalDisbursements, com.tools20022.repository.entity.PortfolioValuation.IncomeReceived,
						com.tools20022.repository.entity.PortfolioValuation.ExpensesPaid, com.tools20022.repository.entity.PortfolioValuation.Portfolio, com.tools20022.repository.entity.PortfolioValuation.ValuationPeriod);
				derivationComponent_lazy = () -> Arrays.asList(TotalPortfolioValuation1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}