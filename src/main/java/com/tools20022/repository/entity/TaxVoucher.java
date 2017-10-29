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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.TaxVoucher1;
import com.tools20022.repository.msg.TaxVoucher2;
import com.tools20022.repository.msg.TaxVoucher3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Statement showing the amount or value of a distribution and either the tax
 * credit to which the recipient is entitled in respect of that distribution; or
 * the amount of tax deducted from the distribution.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TaxVoucher" src="doc-files/TaxVoucher.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RequestedTaxationRate
 * TaxVoucher.RequestedTaxationRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#CreditRate
 * TaxVoucher.CreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RelatedSecurityTax
 * TaxVoucher.RelatedSecurityTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#SundryOrOtherAmount
 * TaxVoucher.SundryOrOtherAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#CreditAmount
 * TaxVoucher.CreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#CashAmountBroughtForward
 * TaxVoucher.CashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#CashAmountCarriedForward
 * TaxVoucher.CashAmountCarriedForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#NotionalTaxAmount
 * TaxVoucher.NotionalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#Distribution
 * TaxVoucher.Distribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#Identification
 * TaxVoucher.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#BargainDate
 * TaxVoucher.BargainDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#BargainSettlementDate
 * TaxVoucher.BargainSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#TaxVoucherRate
 * TaxVoucher.TaxVoucherRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RecordDateHolding
 * TaxVoucher.RecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ScripDividendReinvestmentPricePerShare
 * TaxVoucher.ScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#AllotedSharesCost
 * TaxVoucher.AllotedSharesCost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#ForeignExchangeTransaction
 * TaxVoucher.ForeignExchangeTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TaxVoucher
 * SecuritiesPricing.TaxVoucher}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxVoucher
 * SecuritiesTax.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#TaxVoucher
 * SecuritiesQuantity.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.CurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#TaxVoucher
 * CorporateActionDistribution.TaxVoucher}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher2 TaxVoucher2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher3 TaxVoucher3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
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
 * "TaxVoucher"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution."
 * </li>
 * </ul>
 */
public class TaxVoucher {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Requested tax rate in case of breakdown of tax rate, for example, used
	 * for adjustment of tax rate. This is the new requested applicable rate.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#RequestedTaxationRate
	 * CorporateActionRate8.RequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate9#RequestedTaxationRate
	 * CorporateActionRate9.RequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#RequestedTaxationRate
	 * CorporateActionRate47.RequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate59#RequestedTaxationRate
	 * CorporateActionRate59.RequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#RequestedWithholdingTaxRate
	 * CorporateActionRate71.RequestedWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#RequestedWithholdingTaxRate
	 * CorporateActionRate73.RequestedWithholdingTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTaxationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RequestedTaxationRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate8.RequestedTaxationRate, com.tools20022.repository.msg.CorporateActionRate9.RequestedTaxationRate,
					com.tools20022.repository.msg.CorporateActionRate47.RequestedTaxationRate, com.tools20022.repository.msg.CorporateActionRate59.RequestedTaxationRate,
					com.tools20022.repository.msg.CorporateActionRate71.RequestedWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate73.RequestedWithholdingTaxRate);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedTaxationRate";
			definition = "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Applicable tax rate on the tax credit amount.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#TaxCreditRate
	 * CorporateActionRate4.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#TaxCreditRate
	 * CorporateActionRate10.TaxCreditRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#TaxCreditRate
	 * RateDetails2.TaxCreditRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#TaxCreditRate
	 * RateDetails4.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#TaxCreditRate
	 * CorporateActionRate29.TaxCreditRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#TaxCreditRate
	 * RateDetails7.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#TaxCreditRate
	 * CorporateActionRate34.TaxCreditRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#TaxCreditRate
	 * RateDetails9.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#TaxCreditRate
	 * RateDetails11.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#TaxCreditRate
	 * RateDetails12.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#TaxCreditRate
	 * CorporateActionRate5.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#TaxCreditRate
	 * CorporateActionRate12.TaxCreditRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#TaxCreditRate
	 * RateDetails3.TaxCreditRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#TaxCreditRate
	 * RateDetails5.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#TaxCreditRate
	 * CorporateActionRate28.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#TaxCreditRate
	 * CorporateActionRate33.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#TaxCreditRate
	 * RateDetails10.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#TaxCreditRate
	 * RateDetails13.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#TaxCreditRate
	 * RateDetails15.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#TaxCreditRate
	 * CorporateActionRate48.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#TaxCreditRate
	 * CorporateActionRate49.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#TaxCreditRate
	 * RateDetails14.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#TaxCreditRate
	 * CorporateActionRate58.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#TaxCreditRate
	 * RateDetails18.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#TaxCreditRate
	 * RateDetails21.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#TaxCreditRate
	 * CorporateActionRate65.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#TaxCreditRate
	 * RateDetails23.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#TaxCreditRate
	 * CorporateActionRate69.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#TaxCreditRate
	 * RateDetails22.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#TaxCreditRate
	 * CorporateActionRate72.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#TaxCreditRate
	 * RateDetails24.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#TaxCreditRate
	 * RateDetails25.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#TaxCreditRate
	 * CorporateActionRate77.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#TaxCreditRate
	 * CorporateActionRate75.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#TaxCreditRate
	 * RateDetails26.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#TaxCreditRate
	 * RateDetails27.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#TaxCreditRate
	 * RateDetails28.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#TaxCreditRate
	 * RateDetails30.TaxCreditRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Applicable tax rate on the tax credit amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate10.TaxCreditRate,
					com.tools20022.repository.msg.RateDetails2.TaxCreditRate, com.tools20022.repository.msg.RateDetails4.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate29.TaxCreditRate,
					com.tools20022.repository.msg.RateDetails7.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate34.TaxCreditRate, com.tools20022.repository.msg.RateDetails9.TaxCreditRate,
					com.tools20022.repository.msg.RateDetails11.TaxCreditRate, com.tools20022.repository.msg.RateDetails12.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate5.TaxCreditRate,
					com.tools20022.repository.msg.CorporateActionRate12.TaxCreditRate, com.tools20022.repository.msg.RateDetails3.TaxCreditRate, com.tools20022.repository.msg.RateDetails5.TaxCreditRate,
					com.tools20022.repository.msg.CorporateActionRate28.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate33.TaxCreditRate, com.tools20022.repository.msg.RateDetails10.TaxCreditRate,
					com.tools20022.repository.msg.RateDetails13.TaxCreditRate, com.tools20022.repository.msg.RateDetails15.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate48.TaxCreditRate,
					com.tools20022.repository.msg.CorporateActionRate49.TaxCreditRate, com.tools20022.repository.msg.RateDetails14.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate58.TaxCreditRate,
					com.tools20022.repository.msg.RateDetails18.TaxCreditRate, com.tools20022.repository.msg.RateDetails21.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate65.TaxCreditRate,
					com.tools20022.repository.msg.RateDetails23.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate69.TaxCreditRate, com.tools20022.repository.msg.RateDetails22.TaxCreditRate,
					com.tools20022.repository.msg.CorporateActionRate72.TaxCreditRate, com.tools20022.repository.msg.RateDetails24.TaxCreditRate, com.tools20022.repository.msg.RateDetails25.TaxCreditRate,
					com.tools20022.repository.msg.CorporateActionRate77.TaxCreditRate, com.tools20022.repository.msg.CorporateActionRate75.TaxCreditRate, com.tools20022.repository.msg.RateDetails26.TaxCreditRate,
					com.tools20022.repository.msg.RateDetails27.TaxCreditRate, com.tools20022.repository.msg.RateDetails28.TaxCreditRate, com.tools20022.repository.msg.RateDetails30.TaxCreditRate);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditRate";
			definition = "Applicable tax rate on the tax credit amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies tax elements on the security which is involved in the corporate
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxVoucher
	 * SecuritiesTax.TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#WithholdingOfForeignTax
	 * CorporateActionRate4.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#WithholdingOfLocalTax
	 * CorporateActionRate4.WithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#WithholdingOfForeignTax
	 * CorporateActionRate10.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#WithholdingOfLocalTax
	 * CorporateActionRate10.WithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#WithholdingOfForeignTax
	 * CorporateActionRate26.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#WithholdingOfForeignTax
	 * CorporateActionRate31.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#WithholdingOfForeignTax
	 * CorporateActionRate38.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#WithholdingOfForeignTax
	 * CorporateActionRate39.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#WithholdingOfForeignTax
	 * CorporateActionRate5.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#WithholdingOfLocalTax
	 * CorporateActionRate5.WithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#WithholdingOfForeignTax
	 * CorporateActionRate12.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#WithholdingOfLocalTax
	 * CorporateActionRate12.WithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#WithholdingOfForeignTax
	 * CorporateActionRate25.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#WithholdingOfForeignTax
	 * CorporateActionRate30.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#WithholdingOfForeignTax
	 * CorporateActionRate37.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#WithholdingOfForeignTax
	 * CorporateActionRate40.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#WithholdingOfForeignTax
	 * CorporateActionRate36.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#WithholdingOfForeignTax
	 * CorporateActionRate42.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#WithholdingOfForeignTax
	 * CorporateActionRate2.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#WithholdingOfLocalTax
	 * CorporateActionRate2.WithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#RelatedTax
	 * CorporateActionRate2.RelatedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#WithholdingOfForeignTax
	 * CorporateActionRate46.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#WithholdingOfForeignTax
	 * CorporateActionRate45.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#WithholdingOfForeignTax
	 * CorporateActionRate44.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#WithholdingOfForeignTax
	 * CorporateActionRate60.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#WithholdingOfForeignTax
	 * CorporateActionRate64.WithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#WithholdingOfForeignTax
	 * CorporateActionRate57.WithholdingOfForeignTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecurityTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies tax elements on the security which is involved in the corporate event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecurityTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate4.WithholdingOfLocalTax,
					com.tools20022.repository.msg.CorporateActionRate10.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate10.WithholdingOfLocalTax,
					com.tools20022.repository.msg.CorporateActionRate26.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate31.WithholdingOfForeignTax,
					com.tools20022.repository.msg.CorporateActionRate38.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate39.WithholdingOfForeignTax,
					com.tools20022.repository.msg.CorporateActionRate5.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate5.WithholdingOfLocalTax,
					com.tools20022.repository.msg.CorporateActionRate12.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate12.WithholdingOfLocalTax,
					com.tools20022.repository.msg.CorporateActionRate25.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate30.WithholdingOfForeignTax,
					com.tools20022.repository.msg.CorporateActionRate37.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate40.WithholdingOfForeignTax,
					com.tools20022.repository.msg.CorporateActionRate36.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate42.WithholdingOfForeignTax,
					com.tools20022.repository.msg.CorporateActionRate2.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate2.WithholdingOfLocalTax, com.tools20022.repository.msg.CorporateActionRate2.RelatedTax,
					com.tools20022.repository.msg.CorporateActionRate46.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate45.WithholdingOfForeignTax,
					com.tools20022.repository.msg.CorporateActionRate44.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate60.WithholdingOfForeignTax,
					com.tools20022.repository.msg.CorporateActionRate64.WithholdingOfForeignTax, com.tools20022.repository.msg.CorporateActionRate57.WithholdingOfForeignTax);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityTax";
			definition = "Specifies tax elements on the security which is involved in the corporate event.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money related to taxable income that cannot be categorised.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#SundryOrOtherAmount
	 * CorporateActionAmounts2.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#SundryOrOtherAmount
	 * CorporateActionAmounts5.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#SundryOrOtherAmount
	 * CorporateActionAmounts11.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#SundryOrOtherAmount
	 * CorporateActionAmounts12.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#SundryOrOtherAmount
	 * CorporateActionAmounts17.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#SundryOrOtherAmount
	 * CorporateActionAmounts20.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#SundryOrOtherAmount
	 * CorporateActionAmounts23.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#SundryOrOtherAmount
	 * CorporateActionAmounts24.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#SundryOrOtherAmount
	 * CorporateActionAmounts3.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#SundryOrOtherAmount
	 * CorporateActionAmounts6.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#SundryOrOtherAmount
	 * CorporateActionAmounts9.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#SundryOrOtherAmount
	 * CorporateActionAmounts13.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#SundryOrOtherAmount
	 * CorporateActionAmounts16.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#SundryOrOtherAmount
	 * CorporateActionAmounts19.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#SundryOrOtherAmount
	 * CorporateActionAmounts22.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#SundryOrOtherAmount
	 * CorporateActionAmounts25.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#SundryOrOtherAmount
	 * CorporateActionAmounts4.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#SundryOrOtherAmount
	 * CorporateActionAmounts7.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#SundryOrOtherAmount
	 * CorporateActionAmounts10.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#SundryOrOtherAmount
	 * CorporateActionAmounts14.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#SundryOrOtherAmount
	 * CorporateActionAmounts15.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#SundryOrOtherAmount
	 * CorporateActionAmounts18.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#SundryOrOtherAmount
	 * CorporateActionAmounts21.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#SundryOrOtherAmount
	 * CorporateActionAmounts26.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#SundryOrOtherAmount
	 * CorporateActionAmounts1.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#SundryOrOtherAmount
	 * CorporateActionAmounts29.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#SundryOrOtherAmount
	 * CorporateActionAmounts27.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#SundryOrOtherAmount
	 * CorporateActionAmounts28.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#SundryOrOtherAmount
	 * CorporateActionAmounts33.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#SundryOrOtherAmount
	 * CorporateActionAmounts32.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#SundryOrOtherAmount
	 * CorporateActionAmounts35.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#SundryOrOtherAmount
	 * CorporateActionAmounts37.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#SundryOrOtherAmount
	 * CorporateActionAmounts36.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#SundryOrOtherAmount
	 * CorporateActionAmounts38.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#SundryOrOtherAmount
	 * CorporateActionAmounts39.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#SundryOrOtherAmount
	 * CorporateActionAmounts41.SundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#SundryOrOtherAmount
	 * CorporateActionAmounts40.SundryOrOtherAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money related to taxable income that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SundryOrOtherAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts5.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts12.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts20.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts24.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts6.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts13.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts19.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts25.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts7.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts14.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts18.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts26.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts1.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts29.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts28.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts32.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts37.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts38.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.SundryOrOtherAmount, com.tools20022.repository.msg.CorporateActionAmounts41.SundryOrOtherAmount,
					com.tools20022.repository.msg.CorporateActionAmounts40.SundryOrOtherAmount);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money per equity allocated as the result of a tax credit.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#TaxCreditAmount
	 * CorporateActionAmounts2.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#TaxCreditAmount
	 * CorporateActionAmounts5.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#TaxCreditAmount
	 * CorporateActionAmounts11.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#TaxCreditAmount
	 * CorporateActionAmounts12.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#TaxCreditAmount
	 * CorporateActionAmounts17.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#TaxCreditAmount
	 * CorporateActionAmounts20.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#TaxCreditAmount
	 * CorporateActionAmounts23.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#TaxCreditAmount
	 * CorporateActionAmounts24.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#TaxCreditAmount
	 * CorporateActionAmounts3.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#TaxCreditAmount
	 * CorporateActionAmounts6.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#TaxCreditAmount
	 * CorporateActionAmounts9.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#TaxCreditAmount
	 * CorporateActionAmounts13.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#TaxCreditAmount
	 * CorporateActionAmounts16.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#TaxCreditAmount
	 * CorporateActionAmounts19.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#TaxCreditAmount
	 * CorporateActionAmounts22.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#TaxCreditAmount
	 * CorporateActionAmounts25.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#TaxCreditAmount
	 * CorporateActionAmounts4.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#TaxCreditAmount
	 * CorporateActionAmounts7.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#TaxCreditAmount
	 * CorporateActionAmounts10.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#TaxCreditAmount
	 * CorporateActionAmounts14.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#TaxCreditAmount
	 * CorporateActionAmounts15.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#TaxCreditAmount
	 * CorporateActionAmounts18.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#TaxCreditAmount
	 * CorporateActionAmounts21.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#TaxCreditAmount
	 * CorporateActionAmounts26.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#TaxCreditAmount
	 * CorporateActionAmounts1.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#TaxCreditAmount
	 * CorporateActionAmounts29.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#TaxCreditAmount
	 * CorporateActionAmounts27.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#TaxCreditAmount
	 * CorporateActionAmounts28.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#TaxCreditAmount
	 * CorporateActionAmounts33.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#TaxCreditAmount
	 * CorporateActionAmounts32.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#TaxCreditAmount
	 * CorporateActionAmounts35.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#TaxCreditAmount
	 * CorporateActionAmounts37.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#TaxCreditAmount
	 * CorporateActionAmounts36.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#TaxCreditAmount
	 * CorporateActionAmounts38.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#TaxCreditAmount
	 * CorporateActionAmounts39.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#TaxCreditAmount
	 * CorporateActionAmounts41.TaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#TaxCreditAmount
	 * CorporateActionAmounts40.TaxCreditAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money per equity allocated as the result of a tax credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreditAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts5.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts12.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts17.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts23.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts24.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts6.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts9.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts16.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts19.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts25.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts4.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts10.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts14.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts18.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts21.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts1.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts29.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts28.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts33.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts35.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts37.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts38.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts39.TaxCreditAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.TaxCreditAmount, com.tools20022.repository.msg.CorporateActionAmounts40.TaxCreditAmount);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAmount";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount retained from previous dividend or interest payment.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#CashAmountBroughtForward
	 * CorporateActionAmounts2.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#CashAmountBroughtForward
	 * CorporateActionAmounts5.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#CashAmountBroughtForward
	 * CorporateActionAmounts11.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#CashAmountBroughtForward
	 * CorporateActionAmounts12.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#CashAmountBroughtForward
	 * CorporateActionAmounts17.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#CashAmountBroughtForward
	 * CorporateActionAmounts20.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#CashAmountBroughtForward
	 * CorporateActionAmounts23.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#CashAmountBroughtForward
	 * CorporateActionAmounts24.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#CashAmountBroughtForward
	 * TaxVoucher1.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#CashAmountBroughtForward
	 * CorporateActionAmounts29.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#CashAmountBroughtForward
	 * CorporateActionAmounts35.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#CashAmountBroughtForward
	 * CorporateActionAmounts37.CashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#CashAmountBroughtForward
	 * CorporateActionAmounts39.CashAmountBroughtForward}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountBroughtForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount retained from previous dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashAmountBroughtForward = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.CashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts5.CashAmountBroughtForward,
					com.tools20022.repository.msg.CorporateActionAmounts11.CashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts12.CashAmountBroughtForward,
					com.tools20022.repository.msg.CorporateActionAmounts17.CashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts20.CashAmountBroughtForward,
					com.tools20022.repository.msg.CorporateActionAmounts23.CashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts24.CashAmountBroughtForward,
					com.tools20022.repository.msg.TaxVoucher1.CashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts29.CashAmountBroughtForward,
					com.tools20022.repository.msg.CorporateActionAmounts35.CashAmountBroughtForward, com.tools20022.repository.msg.CorporateActionAmounts37.CashAmountBroughtForward,
					com.tools20022.repository.msg.CorporateActionAmounts39.CashAmountBroughtForward);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Cash amount retained from previous dividend or interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash amount carried forward to next dividend or interest payment.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#CashAmountCarriedForward
	 * CorporateActionAmounts2.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#CashAmountCarriedForward
	 * CorporateActionAmounts5.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#CashAmountCarriedForward
	 * CorporateActionAmounts11.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#CashAmountCarriedForward
	 * CorporateActionAmounts12.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#CashAmountCarriedForward
	 * CorporateActionAmounts17.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#CashAmountCarriedForward
	 * CorporateActionAmounts20.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#CashAmountCarriedForward
	 * CorporateActionAmounts23.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#CashAmountCarriedForward
	 * CorporateActionAmounts24.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#CashAmountCarriedForward
	 * TaxVoucher1.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#CashAmountCarriedForward
	 * CorporateActionAmounts29.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#CashAmountCarriedForward
	 * CorporateActionAmounts35.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#CashAmountCarriedForward
	 * CorporateActionAmounts37.CashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#CashAmountCarriedForward
	 * CorporateActionAmounts39.CashAmountCarriedForward}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountCarriedForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount carried forward to next dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashAmountCarriedForward = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.CashAmountCarriedForward, com.tools20022.repository.msg.CorporateActionAmounts5.CashAmountCarriedForward,
					com.tools20022.repository.msg.CorporateActionAmounts11.CashAmountCarriedForward, com.tools20022.repository.msg.CorporateActionAmounts12.CashAmountCarriedForward,
					com.tools20022.repository.msg.CorporateActionAmounts17.CashAmountCarriedForward, com.tools20022.repository.msg.CorporateActionAmounts20.CashAmountCarriedForward,
					com.tools20022.repository.msg.CorporateActionAmounts23.CashAmountCarriedForward, com.tools20022.repository.msg.CorporateActionAmounts24.CashAmountCarriedForward,
					com.tools20022.repository.msg.TaxVoucher1.CashAmountCarriedForward, com.tools20022.repository.msg.CorporateActionAmounts29.CashAmountCarriedForward,
					com.tools20022.repository.msg.CorporateActionAmounts35.CashAmountCarriedForward, com.tools20022.repository.msg.CorporateActionAmounts37.CashAmountCarriedForward,
					com.tools20022.repository.msg.CorporateActionAmounts39.CashAmountCarriedForward);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Cash amount carried forward to next dividend or interest payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Tax on the amount of cash that would have been paid when new securities
	 * are issued in lieu of a cash dividend.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#NotionalTaxAmount
	 * CorporateActionAmounts2.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#NotionalTaxAmount
	 * CorporateActionAmounts5.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#NotionalTaxAmount
	 * CorporateActionAmounts11.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#NotionalTaxAmount
	 * CorporateActionAmounts12.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#NotionalTaxAmount
	 * CorporateActionAmounts17.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#NotionalTaxAmount
	 * CorporateActionAmounts20.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#NotionalTaxAmount
	 * CorporateActionAmounts23.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#NotionalTaxAmount
	 * CorporateActionAmounts24.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#NotionalTaxAmount
	 * CorporateActionAmounts29.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#NotionalTaxAmount
	 * CorporateActionAmounts35.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#NotionalTaxAmount
	 * CorporateActionAmounts37.NotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#NotionalTaxAmount
	 * CorporateActionAmounts39.NotionalTaxAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotionalTaxAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.NotionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts5.NotionalTaxAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.NotionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts12.NotionalTaxAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.NotionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts20.NotionalTaxAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.NotionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts24.NotionalTaxAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.NotionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts35.NotionalTaxAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.NotionalTaxAmount, com.tools20022.repository.msg.CorporateActionAmounts39.NotionalTaxAmount);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Corporate action distribution process for which tax voucher information
	 * is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#TaxVoucher
	 * CorporateActionDistribution.TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action distribution process for which tax voucher information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Corporate action distribution process for which tax voucher information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique and unambiguous identification for the tax voucher.
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
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher2#Identification
	 * TaxVoucher2.Identification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher3#Identification
	 * TaxVoucher3.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the tax voucher."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher2.Identification, com.tools20022.repository.msg.TaxVoucher3.Identification);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the tax voucher.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which DRIP purchase completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher2#BargainDate
	 * TaxVoucher2.BargainDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher3#BargainDate
	 * TaxVoucher3.BargainDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#BargainDate
	 * TaxVoucher1.BargainDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which DRIP purchase completed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BargainDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher2.BargainDate, com.tools20022.repository.msg.TaxVoucher3.BargainDate, com.tools20022.repository.msg.TaxVoucher1.BargainDate);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BargainDate";
			definition = "Date on which DRIP purchase completed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Settlement date of the DRIP purchase transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher2#BargainSettlementDate
	 * TaxVoucher2.BargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher3#BargainSettlementDate
	 * TaxVoucher3.BargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#BargainSettlementDate
	 * TaxVoucher1.BargainSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement date of the DRIP purchase transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BargainSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher2.BargainSettlementDate, com.tools20022.repository.msg.TaxVoucher3.BargainSettlementDate,
					com.tools20022.repository.msg.TaxVoucher1.BargainSettlementDate);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BargainSettlementDate";
			definition = "Settlement date of the DRIP purchase transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Distribution rate per share.
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
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#TaxVoucherRate
	 * TaxVoucher1.TaxVoucherRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucherRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution rate per share."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxVoucherRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.TaxVoucherRate);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucherRate";
			definition = "Distribution rate per share.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Securities holding on record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#TaxVoucher
	 * SecuritiesQuantity.TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#RecordDateHolding
	 * TaxVoucher1.RecordDateHolding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDateHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities holding on record date."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RecordDateHolding = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.RecordDateHolding);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecordDateHolding";
			definition = "Securities holding on record date.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cost per share of new shares allotted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TaxVoucher
	 * SecuritiesPricing.TaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#ScripDividendReinvestmentPricePerShare
	 * TaxVoucher1.ScripDividendReinvestmentPricePerShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividendReinvestmentPricePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cost per share of new shares allotted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ScripDividendReinvestmentPricePerShare = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.ScripDividendReinvestmentPricePerShare);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ScripDividendReinvestmentPricePerShare";
			definition = "Cost per share of new shares allotted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.TaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total cash amount required to purchase shares allotted.
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#AllotedSharesCost
	 * TaxVoucher1.AllotedSharesCost}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllotedSharesCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total cash amount required to purchase shares allotted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllotedSharesCost = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.AllotedSharesCost);
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllotedSharesCost";
			definition = "Total cash amount required to purchase shares allotted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides information about the foreign exchange transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForTaxVoucher
	 * ForeignExchangeTrade.CurrencyExchangeForTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the foreign exchange transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ForeignExchangeTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TaxVoucher.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeTransaction";
			definition = "Provides information about the foreign exchange transaction.";
			minOccurs = 0;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForTaxVoucher;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxVoucher";
				definition = "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.TaxVoucher, com.tools20022.repository.entity.SecuritiesTax.TaxVoucher,
						com.tools20022.repository.entity.SecuritiesQuantity.TaxVoucher, com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForTaxVoucher,
						com.tools20022.repository.entity.CorporateActionDistribution.TaxVoucher);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxVoucher.RequestedTaxationRate, com.tools20022.repository.entity.TaxVoucher.CreditRate, com.tools20022.repository.entity.TaxVoucher.RelatedSecurityTax,
						com.tools20022.repository.entity.TaxVoucher.SundryOrOtherAmount, com.tools20022.repository.entity.TaxVoucher.CreditAmount, com.tools20022.repository.entity.TaxVoucher.CashAmountBroughtForward,
						com.tools20022.repository.entity.TaxVoucher.CashAmountCarriedForward, com.tools20022.repository.entity.TaxVoucher.NotionalTaxAmount, com.tools20022.repository.entity.TaxVoucher.Distribution,
						com.tools20022.repository.entity.TaxVoucher.Identification, com.tools20022.repository.entity.TaxVoucher.BargainDate, com.tools20022.repository.entity.TaxVoucher.BargainSettlementDate,
						com.tools20022.repository.entity.TaxVoucher.TaxVoucherRate, com.tools20022.repository.entity.TaxVoucher.RecordDateHolding, com.tools20022.repository.entity.TaxVoucher.ScripDividendReinvestmentPricePerShare,
						com.tools20022.repository.entity.TaxVoucher.AllotedSharesCost, com.tools20022.repository.entity.TaxVoucher.ForeignExchangeTransaction);
				derivationComponent_lazy = () -> Arrays.asList(TaxVoucher2.mmObject(), TaxVoucher3.mmObject(), TaxVoucher1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}