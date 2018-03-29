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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRequestedTaxationRate
 * TaxVoucher.mmRequestedTaxationRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
 * TaxVoucher.mmCreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
 * TaxVoucher.mmRelatedSecurityTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmSundryOrOtherAmount
 * TaxVoucher.mmSundryOrOtherAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditAmount
 * TaxVoucher.mmCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountBroughtForward
 * TaxVoucher.mmCashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountCarriedForward
 * TaxVoucher.mmCashAmountCarriedForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmNotionalTaxAmount
 * TaxVoucher.mmNotionalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmDistribution
 * TaxVoucher.mmDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmIdentification
 * TaxVoucher.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainDate
 * TaxVoucher.mmBargainDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainSettlementDate
 * TaxVoucher.mmBargainSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmTaxVoucherRate
 * TaxVoucher.mmTaxVoucherRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
 * TaxVoucher.mmRecordDateHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmAllotedSharesCost
 * TaxVoucher.mmAllotedSharesCost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmForeignExchangeTransaction
 * TaxVoucher.mmForeignExchangeTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
 * SecuritiesPricing.mmTaxVoucher}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
 * SecuritiesTax.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
 * SecuritiesQuantity.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
 * CorporateActionDistribution.mmTaxVoucher}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher2 TaxVoucher2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher3 TaxVoucher3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher4 TaxVoucher4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher5 TaxVoucher5}</li>
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
	protected PercentageRate requestedTaxationRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#mmRequestedTaxationRate
	 * CorporateActionRate8.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate9#mmRequestedTaxationRate
	 * CorporateActionRate9.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmRequestedTaxationRate
	 * CorporateActionRate47.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate59#mmRequestedTaxationRate
	 * CorporateActionRate59.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmRequestedWithholdingTaxRate
	 * CorporateActionRate71.mmRequestedWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmRequestedWithholdingTaxRate
	 * CorporateActionRate73.mmRequestedWithholdingTaxRate}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, PercentageRate> mmRequestedTaxationRate = new MMBusinessAttribute<TaxVoucher, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate8.mmRequestedTaxationRate, CorporateActionRate9.mmRequestedTaxationRate, CorporateActionRate47.mmRequestedTaxationRate, CorporateActionRate59.mmRequestedTaxationRate,
					CorporateActionRate71.mmRequestedWithholdingTaxRate, CorporateActionRate73.mmRequestedWithholdingTaxRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedTaxationRate";
			definition = "Requested tax rate in case of breakdown of tax rate, for example, used for adjustment of tax rate. This is the new requested applicable rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(TaxVoucher obj) {
			return obj.getRequestedTaxationRate();
		}

		@Override
		public void setValue(TaxVoucher obj, PercentageRate value) {
			obj.setRequestedTaxationRate(value);
		}
	};
	protected PercentageRate creditRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmTaxCreditRate
	 * CorporateActionRate4.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmTaxCreditRate
	 * CorporateActionRate10.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxCreditRate
	 * RateDetails2.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmTaxCreditRate
	 * RateDetails4.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#mmTaxCreditRate
	 * CorporateActionRate29.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmTaxCreditRate
	 * RateDetails7.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#mmTaxCreditRate
	 * CorporateActionRate34.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmTaxCreditRate
	 * RateDetails9.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmTaxCreditRate
	 * RateDetails11.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmTaxCreditRate
	 * RateDetails12.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxCreditRate
	 * CorporateActionRate5.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmTaxCreditRate
	 * CorporateActionRate12.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmTaxCreditRate
	 * RateDetails3.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmTaxCreditRate
	 * RateDetails5.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmTaxCreditRate
	 * CorporateActionRate28.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmTaxCreditRate
	 * CorporateActionRate33.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxCreditRate
	 * RateDetails10.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmTaxCreditRate
	 * RateDetails13.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmTaxCreditRate
	 * RateDetails15.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmTaxCreditRate
	 * CorporateActionRate48.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmTaxCreditRate
	 * CorporateActionRate49.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxCreditRate
	 * RateDetails14.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmTaxCreditRate
	 * CorporateActionRate58.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmTaxCreditRate
	 * RateDetails18.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmTaxCreditRate
	 * RateDetails21.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmTaxCreditRate
	 * CorporateActionRate65.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmTaxCreditRate
	 * RateDetails23.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmTaxCreditRate
	 * CorporateActionRate69.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxCreditRate
	 * RateDetails22.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmTaxCreditRate
	 * CorporateActionRate72.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmTaxCreditRate
	 * RateDetails24.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmTaxCreditRate
	 * RateDetails25.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmTaxCreditRate
	 * CorporateActionRate77.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmTaxCreditRate
	 * CorporateActionRate75.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmTaxCreditRate
	 * RateDetails26.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmTaxCreditRate
	 * RateDetails27.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxCreditRate
	 * RateDetails28.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmTaxCreditRate
	 * RateDetails30.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmTaxCreditRate
	 * RateDetails31.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmTaxCreditRate
	 * RateDetails32.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate90#mmTaxCreditRate
	 * CorporateActionRate90.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate89#mmTaxCreditRate
	 * CorporateActionRate89.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate93#mmTaxCreditRate
	 * CorporateActionRate93.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails33#mmTaxCreditRate
	 * RateDetails33.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate95#mmTaxCreditRate
	 * CorporateActionRate95.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails34#mmTaxCreditRate
	 * RateDetails34.mmTaxCreditRate}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, PercentageRate> mmCreditRate = new MMBusinessAttribute<TaxVoucher, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmTaxCreditRate, CorporateActionRate10.mmTaxCreditRate, RateDetails2.mmTaxCreditRate, RateDetails4.mmTaxCreditRate, CorporateActionRate29.mmTaxCreditRate,
					RateDetails7.mmTaxCreditRate, CorporateActionRate34.mmTaxCreditRate, RateDetails9.mmTaxCreditRate, RateDetails11.mmTaxCreditRate, RateDetails12.mmTaxCreditRate, CorporateActionRate5.mmTaxCreditRate,
					CorporateActionRate12.mmTaxCreditRate, RateDetails3.mmTaxCreditRate, RateDetails5.mmTaxCreditRate, CorporateActionRate28.mmTaxCreditRate, CorporateActionRate33.mmTaxCreditRate, RateDetails10.mmTaxCreditRate,
					RateDetails13.mmTaxCreditRate, RateDetails15.mmTaxCreditRate, CorporateActionRate48.mmTaxCreditRate, CorporateActionRate49.mmTaxCreditRate, RateDetails14.mmTaxCreditRate, CorporateActionRate58.mmTaxCreditRate,
					RateDetails18.mmTaxCreditRate, RateDetails21.mmTaxCreditRate, CorporateActionRate65.mmTaxCreditRate, RateDetails23.mmTaxCreditRate, CorporateActionRate69.mmTaxCreditRate, RateDetails22.mmTaxCreditRate,
					CorporateActionRate72.mmTaxCreditRate, RateDetails24.mmTaxCreditRate, RateDetails25.mmTaxCreditRate, CorporateActionRate77.mmTaxCreditRate, CorporateActionRate75.mmTaxCreditRate, RateDetails26.mmTaxCreditRate,
					RateDetails27.mmTaxCreditRate, RateDetails28.mmTaxCreditRate, RateDetails30.mmTaxCreditRate, RateDetails31.mmTaxCreditRate, RateDetails32.mmTaxCreditRate, CorporateActionRate90.mmTaxCreditRate,
					CorporateActionRate89.mmTaxCreditRate, CorporateActionRate93.mmTaxCreditRate, RateDetails33.mmTaxCreditRate, CorporateActionRate95.mmTaxCreditRate, RateDetails34.mmTaxCreditRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditRate";
			definition = "Applicable tax rate on the tax credit amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(TaxVoucher obj) {
			return obj.getCreditRate();
		}

		@Override
		public void setValue(TaxVoucher obj, PercentageRate value) {
			obj.setCreditRate(value);
		}
	};
	protected List<SecuritiesTax> relatedSecurityTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
	 * SecuritiesTax.mmTaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmWithholdingOfForeignTax
	 * CorporateActionRate4.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmWithholdingOfLocalTax
	 * CorporateActionRate4.mmWithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmWithholdingOfForeignTax
	 * CorporateActionRate10.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmWithholdingOfLocalTax
	 * CorporateActionRate10.mmWithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmWithholdingOfForeignTax
	 * CorporateActionRate26.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmWithholdingOfForeignTax
	 * CorporateActionRate31.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmWithholdingOfForeignTax
	 * CorporateActionRate38.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmWithholdingOfForeignTax
	 * CorporateActionRate39.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmWithholdingOfForeignTax
	 * CorporateActionRate5.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmWithholdingOfLocalTax
	 * CorporateActionRate5.mmWithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmWithholdingOfForeignTax
	 * CorporateActionRate12.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmWithholdingOfLocalTax
	 * CorporateActionRate12.mmWithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmWithholdingOfForeignTax
	 * CorporateActionRate25.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmWithholdingOfForeignTax
	 * CorporateActionRate30.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmWithholdingOfForeignTax
	 * CorporateActionRate37.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmWithholdingOfForeignTax
	 * CorporateActionRate40.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmWithholdingOfForeignTax
	 * CorporateActionRate36.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmWithholdingOfForeignTax
	 * CorporateActionRate42.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingOfForeignTax
	 * CorporateActionRate2.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingOfLocalTax
	 * CorporateActionRate2.mmWithholdingOfLocalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmRelatedTax
	 * CorporateActionRate2.mmRelatedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmWithholdingOfForeignTax
	 * CorporateActionRate46.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmWithholdingOfForeignTax
	 * CorporateActionRate45.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmWithholdingOfForeignTax
	 * CorporateActionRate44.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmWithholdingOfForeignTax
	 * CorporateActionRate60.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmWithholdingOfForeignTax
	 * CorporateActionRate64.mmWithholdingOfForeignTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmWithholdingOfForeignTax
	 * CorporateActionRate57.mmWithholdingOfForeignTax}</li>
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
	public static final MMBusinessAssociationEnd<TaxVoucher, List<SecuritiesTax>> mmRelatedSecurityTax = new MMBusinessAssociationEnd<TaxVoucher, List<SecuritiesTax>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmWithholdingOfForeignTax, CorporateActionRate4.mmWithholdingOfLocalTax, CorporateActionRate10.mmWithholdingOfForeignTax, CorporateActionRate10.mmWithholdingOfLocalTax,
					CorporateActionRate26.mmWithholdingOfForeignTax, CorporateActionRate31.mmWithholdingOfForeignTax, CorporateActionRate38.mmWithholdingOfForeignTax, CorporateActionRate39.mmWithholdingOfForeignTax,
					CorporateActionRate5.mmWithholdingOfForeignTax, CorporateActionRate5.mmWithholdingOfLocalTax, CorporateActionRate12.mmWithholdingOfForeignTax, CorporateActionRate12.mmWithholdingOfLocalTax,
					CorporateActionRate25.mmWithholdingOfForeignTax, CorporateActionRate30.mmWithholdingOfForeignTax, CorporateActionRate37.mmWithholdingOfForeignTax, CorporateActionRate40.mmWithholdingOfForeignTax,
					CorporateActionRate36.mmWithholdingOfForeignTax, CorporateActionRate42.mmWithholdingOfForeignTax, CorporateActionRate2.mmWithholdingOfForeignTax, CorporateActionRate2.mmWithholdingOfLocalTax,
					CorporateActionRate2.mmRelatedTax, CorporateActionRate46.mmWithholdingOfForeignTax, CorporateActionRate45.mmWithholdingOfForeignTax, CorporateActionRate44.mmWithholdingOfForeignTax,
					CorporateActionRate60.mmWithholdingOfForeignTax, CorporateActionRate64.mmWithholdingOfForeignTax, CorporateActionRate57.mmWithholdingOfForeignTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityTax";
			definition = "Specifies tax elements on the security which is involved in the corporate event.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTax.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}

		@Override
		public List<SecuritiesTax> getValue(TaxVoucher obj) {
			return obj.getRelatedSecurityTax();
		}

		@Override
		public void setValue(TaxVoucher obj, List<SecuritiesTax> value) {
			obj.setRelatedSecurityTax(value);
		}
	};
	protected CurrencyAndAmount sundryOrOtherAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmSundryOrOtherAmount
	 * CorporateActionAmounts2.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmSundryOrOtherAmount
	 * CorporateActionAmounts5.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmSundryOrOtherAmount
	 * CorporateActionAmounts11.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmSundryOrOtherAmount
	 * CorporateActionAmounts12.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmSundryOrOtherAmount
	 * CorporateActionAmounts17.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmSundryOrOtherAmount
	 * CorporateActionAmounts20.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmSundryOrOtherAmount
	 * CorporateActionAmounts23.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmSundryOrOtherAmount
	 * CorporateActionAmounts24.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmSundryOrOtherAmount
	 * CorporateActionAmounts3.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmSundryOrOtherAmount
	 * CorporateActionAmounts6.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmSundryOrOtherAmount
	 * CorporateActionAmounts9.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmSundryOrOtherAmount
	 * CorporateActionAmounts13.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmSundryOrOtherAmount
	 * CorporateActionAmounts16.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmSundryOrOtherAmount
	 * CorporateActionAmounts19.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmSundryOrOtherAmount
	 * CorporateActionAmounts22.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmSundryOrOtherAmount
	 * CorporateActionAmounts25.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmSundryOrOtherAmount
	 * CorporateActionAmounts4.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmSundryOrOtherAmount
	 * CorporateActionAmounts7.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmSundryOrOtherAmount
	 * CorporateActionAmounts10.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmSundryOrOtherAmount
	 * CorporateActionAmounts14.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmSundryOrOtherAmount
	 * CorporateActionAmounts15.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmSundryOrOtherAmount
	 * CorporateActionAmounts18.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmSundryOrOtherAmount
	 * CorporateActionAmounts21.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmSundryOrOtherAmount
	 * CorporateActionAmounts26.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmSundryOrOtherAmount
	 * CorporateActionAmounts1.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmSundryOrOtherAmount
	 * CorporateActionAmounts29.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmSundryOrOtherAmount
	 * CorporateActionAmounts27.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmSundryOrOtherAmount
	 * CorporateActionAmounts28.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmSundryOrOtherAmount
	 * CorporateActionAmounts33.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmSundryOrOtherAmount
	 * CorporateActionAmounts32.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmSundryOrOtherAmount
	 * CorporateActionAmounts35.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmSundryOrOtherAmount
	 * CorporateActionAmounts37.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmSundryOrOtherAmount
	 * CorporateActionAmounts36.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmSundryOrOtherAmount
	 * CorporateActionAmounts38.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmSundryOrOtherAmount
	 * CorporateActionAmounts39.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmSundryOrOtherAmount
	 * CorporateActionAmounts41.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmSundryOrOtherAmount
	 * CorporateActionAmounts40.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmSundryOrOtherAmount
	 * CorporateActionAmounts42.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmSundryOrOtherAmount
	 * CorporateActionAmounts43.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmSundryOrOtherAmount
	 * CorporateActionAmounts44.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmSundryOrOtherAmount
	 * CorporateActionAmounts45.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmSundryOrOtherAmount
	 * CorporateActionAmounts46.mmSundryOrOtherAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmSundryOrOtherAmount
	 * CorporateActionAmounts47.mmSundryOrOtherAmount}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmSundryOrOtherAmount = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmSundryOrOtherAmount, CorporateActionAmounts5.mmSundryOrOtherAmount, CorporateActionAmounts11.mmSundryOrOtherAmount, CorporateActionAmounts12.mmSundryOrOtherAmount,
					CorporateActionAmounts17.mmSundryOrOtherAmount, CorporateActionAmounts20.mmSundryOrOtherAmount, CorporateActionAmounts23.mmSundryOrOtherAmount, CorporateActionAmounts24.mmSundryOrOtherAmount,
					CorporateActionAmounts3.mmSundryOrOtherAmount, CorporateActionAmounts6.mmSundryOrOtherAmount, CorporateActionAmounts9.mmSundryOrOtherAmount, CorporateActionAmounts13.mmSundryOrOtherAmount,
					CorporateActionAmounts16.mmSundryOrOtherAmount, CorporateActionAmounts19.mmSundryOrOtherAmount, CorporateActionAmounts22.mmSundryOrOtherAmount, CorporateActionAmounts25.mmSundryOrOtherAmount,
					CorporateActionAmounts4.mmSundryOrOtherAmount, CorporateActionAmounts7.mmSundryOrOtherAmount, CorporateActionAmounts10.mmSundryOrOtherAmount, CorporateActionAmounts14.mmSundryOrOtherAmount,
					CorporateActionAmounts15.mmSundryOrOtherAmount, CorporateActionAmounts18.mmSundryOrOtherAmount, CorporateActionAmounts21.mmSundryOrOtherAmount, CorporateActionAmounts26.mmSundryOrOtherAmount,
					CorporateActionAmounts1.mmSundryOrOtherAmount, CorporateActionAmounts29.mmSundryOrOtherAmount, CorporateActionAmounts27.mmSundryOrOtherAmount, CorporateActionAmounts28.mmSundryOrOtherAmount,
					CorporateActionAmounts33.mmSundryOrOtherAmount, CorporateActionAmounts32.mmSundryOrOtherAmount, CorporateActionAmounts35.mmSundryOrOtherAmount, CorporateActionAmounts37.mmSundryOrOtherAmount,
					CorporateActionAmounts36.mmSundryOrOtherAmount, CorporateActionAmounts38.mmSundryOrOtherAmount, CorporateActionAmounts39.mmSundryOrOtherAmount, CorporateActionAmounts41.mmSundryOrOtherAmount,
					CorporateActionAmounts40.mmSundryOrOtherAmount, CorporateActionAmounts42.mmSundryOrOtherAmount, CorporateActionAmounts43.mmSundryOrOtherAmount, CorporateActionAmounts44.mmSundryOrOtherAmount,
					CorporateActionAmounts45.mmSundryOrOtherAmount, CorporateActionAmounts46.mmSundryOrOtherAmount, CorporateActionAmounts47.mmSundryOrOtherAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SundryOrOtherAmount";
			definition = "Amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getSundryOrOtherAmount();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setSundryOrOtherAmount(value);
		}
	};
	protected CurrencyAndAmount creditAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmTaxCreditAmount
	 * CorporateActionAmounts2.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmTaxCreditAmount
	 * CorporateActionAmounts5.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmTaxCreditAmount
	 * CorporateActionAmounts11.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmTaxCreditAmount
	 * CorporateActionAmounts12.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmTaxCreditAmount
	 * CorporateActionAmounts17.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmTaxCreditAmount
	 * CorporateActionAmounts20.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmTaxCreditAmount
	 * CorporateActionAmounts23.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmTaxCreditAmount
	 * CorporateActionAmounts24.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmTaxCreditAmount
	 * CorporateActionAmounts3.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmTaxCreditAmount
	 * CorporateActionAmounts6.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmTaxCreditAmount
	 * CorporateActionAmounts9.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmTaxCreditAmount
	 * CorporateActionAmounts13.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmTaxCreditAmount
	 * CorporateActionAmounts16.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmTaxCreditAmount
	 * CorporateActionAmounts19.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmTaxCreditAmount
	 * CorporateActionAmounts22.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmTaxCreditAmount
	 * CorporateActionAmounts25.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmTaxCreditAmount
	 * CorporateActionAmounts4.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmTaxCreditAmount
	 * CorporateActionAmounts7.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmTaxCreditAmount
	 * CorporateActionAmounts10.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmTaxCreditAmount
	 * CorporateActionAmounts14.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmTaxCreditAmount
	 * CorporateActionAmounts15.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmTaxCreditAmount
	 * CorporateActionAmounts18.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmTaxCreditAmount
	 * CorporateActionAmounts21.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmTaxCreditAmount
	 * CorporateActionAmounts26.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmTaxCreditAmount
	 * CorporateActionAmounts1.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmTaxCreditAmount
	 * CorporateActionAmounts29.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmTaxCreditAmount
	 * CorporateActionAmounts27.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmTaxCreditAmount
	 * CorporateActionAmounts28.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmTaxCreditAmount
	 * CorporateActionAmounts33.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmTaxCreditAmount
	 * CorporateActionAmounts32.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmTaxCreditAmount
	 * CorporateActionAmounts35.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmTaxCreditAmount
	 * CorporateActionAmounts37.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmTaxCreditAmount
	 * CorporateActionAmounts36.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmTaxCreditAmount
	 * CorporateActionAmounts38.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmTaxCreditAmount
	 * CorporateActionAmounts39.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmTaxCreditAmount
	 * CorporateActionAmounts41.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmTaxCreditAmount
	 * CorporateActionAmounts40.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmTaxCreditAmount
	 * CorporateActionAmounts42.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmTaxCreditAmount
	 * CorporateActionAmounts43.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmTaxCreditAmount
	 * CorporateActionAmounts44.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmTaxCreditAmount
	 * CorporateActionAmounts45.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmTaxCreditAmount
	 * CorporateActionAmounts46.mmTaxCreditAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmTaxCreditAmount
	 * CorporateActionAmounts47.mmTaxCreditAmount}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmCreditAmount = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmTaxCreditAmount, CorporateActionAmounts5.mmTaxCreditAmount, CorporateActionAmounts11.mmTaxCreditAmount, CorporateActionAmounts12.mmTaxCreditAmount,
					CorporateActionAmounts17.mmTaxCreditAmount, CorporateActionAmounts20.mmTaxCreditAmount, CorporateActionAmounts23.mmTaxCreditAmount, CorporateActionAmounts24.mmTaxCreditAmount, CorporateActionAmounts3.mmTaxCreditAmount,
					CorporateActionAmounts6.mmTaxCreditAmount, CorporateActionAmounts9.mmTaxCreditAmount, CorporateActionAmounts13.mmTaxCreditAmount, CorporateActionAmounts16.mmTaxCreditAmount, CorporateActionAmounts19.mmTaxCreditAmount,
					CorporateActionAmounts22.mmTaxCreditAmount, CorporateActionAmounts25.mmTaxCreditAmount, CorporateActionAmounts4.mmTaxCreditAmount, CorporateActionAmounts7.mmTaxCreditAmount, CorporateActionAmounts10.mmTaxCreditAmount,
					CorporateActionAmounts14.mmTaxCreditAmount, CorporateActionAmounts15.mmTaxCreditAmount, CorporateActionAmounts18.mmTaxCreditAmount, CorporateActionAmounts21.mmTaxCreditAmount, CorporateActionAmounts26.mmTaxCreditAmount,
					CorporateActionAmounts1.mmTaxCreditAmount, CorporateActionAmounts29.mmTaxCreditAmount, CorporateActionAmounts27.mmTaxCreditAmount, CorporateActionAmounts28.mmTaxCreditAmount, CorporateActionAmounts33.mmTaxCreditAmount,
					CorporateActionAmounts32.mmTaxCreditAmount, CorporateActionAmounts35.mmTaxCreditAmount, CorporateActionAmounts37.mmTaxCreditAmount, CorporateActionAmounts36.mmTaxCreditAmount, CorporateActionAmounts38.mmTaxCreditAmount,
					CorporateActionAmounts39.mmTaxCreditAmount, CorporateActionAmounts41.mmTaxCreditAmount, CorporateActionAmounts40.mmTaxCreditAmount, CorporateActionAmounts42.mmTaxCreditAmount, CorporateActionAmounts43.mmTaxCreditAmount,
					CorporateActionAmounts44.mmTaxCreditAmount, CorporateActionAmounts45.mmTaxCreditAmount, CorporateActionAmounts46.mmTaxCreditAmount, CorporateActionAmounts47.mmTaxCreditAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditAmount";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getCreditAmount();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setCreditAmount(value);
		}
	};
	protected CurrencyAndAmount cashAmountBroughtForward;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashAmountBroughtForward
	 * CorporateActionAmounts2.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmCashAmountBroughtForward
	 * CorporateActionAmounts5.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmCashAmountBroughtForward
	 * CorporateActionAmounts11.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashAmountBroughtForward
	 * CorporateActionAmounts12.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmCashAmountBroughtForward
	 * CorporateActionAmounts17.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmCashAmountBroughtForward
	 * CorporateActionAmounts20.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmCashAmountBroughtForward
	 * CorporateActionAmounts23.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmCashAmountBroughtForward
	 * CorporateActionAmounts24.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCashAmountBroughtForward
	 * TaxVoucher1.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmCashAmountBroughtForward
	 * CorporateActionAmounts29.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmCashAmountBroughtForward
	 * CorporateActionAmounts35.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmCashAmountBroughtForward
	 * CorporateActionAmounts37.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmCashAmountBroughtForward
	 * CorporateActionAmounts39.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmCashAmountBroughtForward
	 * CorporateActionAmounts44.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCashAmountBroughtForward
	 * CorporateActionAmounts45.mmCashAmountBroughtForward}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmCashAmountBroughtForward = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmCashAmountBroughtForward, CorporateActionAmounts5.mmCashAmountBroughtForward, CorporateActionAmounts11.mmCashAmountBroughtForward,
					CorporateActionAmounts12.mmCashAmountBroughtForward, CorporateActionAmounts17.mmCashAmountBroughtForward, CorporateActionAmounts20.mmCashAmountBroughtForward, CorporateActionAmounts23.mmCashAmountBroughtForward,
					CorporateActionAmounts24.mmCashAmountBroughtForward, TaxVoucher1.mmCashAmountBroughtForward, CorporateActionAmounts29.mmCashAmountBroughtForward, CorporateActionAmounts35.mmCashAmountBroughtForward,
					CorporateActionAmounts37.mmCashAmountBroughtForward, CorporateActionAmounts39.mmCashAmountBroughtForward, CorporateActionAmounts44.mmCashAmountBroughtForward, CorporateActionAmounts45.mmCashAmountBroughtForward);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Cash amount retained from previous dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getCashAmountBroughtForward();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setCashAmountBroughtForward(value);
		}
	};
	protected CurrencyAndAmount cashAmountCarriedForward;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmCashAmountCarriedForward
	 * CorporateActionAmounts2.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmCashAmountCarriedForward
	 * CorporateActionAmounts5.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmCashAmountCarriedForward
	 * CorporateActionAmounts11.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmCashAmountCarriedForward
	 * CorporateActionAmounts12.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmCashAmountCarriedForward
	 * CorporateActionAmounts17.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmCashAmountCarriedForward
	 * CorporateActionAmounts20.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmCashAmountCarriedForward
	 * CorporateActionAmounts23.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmCashAmountCarriedForward
	 * CorporateActionAmounts24.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCashAmountCarriedForward
	 * TaxVoucher1.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmCashAmountCarriedForward
	 * CorporateActionAmounts29.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmCashAmountCarriedForward
	 * CorporateActionAmounts35.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmCashAmountCarriedForward
	 * CorporateActionAmounts37.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmCashAmountCarriedForward
	 * CorporateActionAmounts39.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmCashAmountCarriedForward
	 * CorporateActionAmounts44.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmCashAmountCarriedForward
	 * CorporateActionAmounts45.mmCashAmountCarriedForward}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmCashAmountCarriedForward = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmCashAmountCarriedForward, CorporateActionAmounts5.mmCashAmountCarriedForward, CorporateActionAmounts11.mmCashAmountCarriedForward,
					CorporateActionAmounts12.mmCashAmountCarriedForward, CorporateActionAmounts17.mmCashAmountCarriedForward, CorporateActionAmounts20.mmCashAmountCarriedForward, CorporateActionAmounts23.mmCashAmountCarriedForward,
					CorporateActionAmounts24.mmCashAmountCarriedForward, TaxVoucher1.mmCashAmountCarriedForward, CorporateActionAmounts29.mmCashAmountCarriedForward, CorporateActionAmounts35.mmCashAmountCarriedForward,
					CorporateActionAmounts37.mmCashAmountCarriedForward, CorporateActionAmounts39.mmCashAmountCarriedForward, CorporateActionAmounts44.mmCashAmountCarriedForward, CorporateActionAmounts45.mmCashAmountCarriedForward);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Cash amount carried forward to next dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getCashAmountCarriedForward();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setCashAmountCarriedForward(value);
		}
	};
	protected CurrencyAndAmount notionalTaxAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmNotionalTaxAmount
	 * CorporateActionAmounts2.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmNotionalTaxAmount
	 * CorporateActionAmounts5.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmNotionalTaxAmount
	 * CorporateActionAmounts11.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmNotionalTaxAmount
	 * CorporateActionAmounts12.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmNotionalTaxAmount
	 * CorporateActionAmounts17.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmNotionalTaxAmount
	 * CorporateActionAmounts20.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmNotionalTaxAmount
	 * CorporateActionAmounts23.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmNotionalTaxAmount
	 * CorporateActionAmounts24.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmNotionalTaxAmount
	 * CorporateActionAmounts29.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmNotionalTaxAmount
	 * CorporateActionAmounts35.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmNotionalTaxAmount
	 * CorporateActionAmounts37.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmNotionalTaxAmount
	 * CorporateActionAmounts39.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmNotionalTaxAmount
	 * CorporateActionAmounts44.mmNotionalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmNotionalTaxAmount
	 * CorporateActionAmounts45.mmNotionalTaxAmount}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, CurrencyAndAmount> mmNotionalTaxAmount = new MMBusinessAttribute<TaxVoucher, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmNotionalTaxAmount, CorporateActionAmounts5.mmNotionalTaxAmount, CorporateActionAmounts11.mmNotionalTaxAmount, CorporateActionAmounts12.mmNotionalTaxAmount,
					CorporateActionAmounts17.mmNotionalTaxAmount, CorporateActionAmounts20.mmNotionalTaxAmount, CorporateActionAmounts23.mmNotionalTaxAmount, CorporateActionAmounts24.mmNotionalTaxAmount,
					CorporateActionAmounts29.mmNotionalTaxAmount, CorporateActionAmounts35.mmNotionalTaxAmount, CorporateActionAmounts37.mmNotionalTaxAmount, CorporateActionAmounts39.mmNotionalTaxAmount,
					CorporateActionAmounts44.mmNotionalTaxAmount, CorporateActionAmounts45.mmNotionalTaxAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalTaxAmount";
			definition = "Tax on the amount of cash that would have been paid when new securities are issued in lieu of a cash dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getNotionalTaxAmount();
		}

		@Override
		public void setValue(TaxVoucher obj, CurrencyAndAmount value) {
			obj.setNotionalTaxAmount(value);
		}
	};
	protected CorporateActionDistribution distribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
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
	public static final MMBusinessAssociationEnd<TaxVoucher, Optional<CorporateActionDistribution>> mmDistribution = new MMBusinessAssociationEnd<TaxVoucher, Optional<CorporateActionDistribution>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Corporate action distribution process for which tax voucher information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionDistribution.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}

		@Override
		public Optional<CorporateActionDistribution> getValue(TaxVoucher obj) {
			return obj.getDistribution();
		}

		@Override
		public void setValue(TaxVoucher obj, Optional<CorporateActionDistribution> value) {
			obj.setDistribution(value.orElse(null));
		}
	};
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher2#mmIdentification
	 * TaxVoucher2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher3#mmIdentification
	 * TaxVoucher3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher4#mmIdentification
	 * TaxVoucher4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher5#mmIdentification
	 * TaxVoucher5.mmIdentification}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, Max35Text> mmIdentification = new MMBusinessAttribute<TaxVoucher, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher2.mmIdentification, TaxVoucher3.mmIdentification, TaxVoucher4.mmIdentification, TaxVoucher5.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the tax voucher.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TaxVoucher obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TaxVoucher obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected ISODate bargainDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher2#mmBargainDate
	 * TaxVoucher2.mmBargainDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher3#mmBargainDate
	 * TaxVoucher3.mmBargainDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmBargainDate
	 * TaxVoucher1.mmBargainDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher4#mmBargainDate
	 * TaxVoucher4.mmBargainDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher5#mmBargainDate
	 * TaxVoucher5.mmBargainDate}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, ISODate> mmBargainDate = new MMBusinessAttribute<TaxVoucher, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher2.mmBargainDate, TaxVoucher3.mmBargainDate, TaxVoucher1.mmBargainDate, TaxVoucher4.mmBargainDate, TaxVoucher5.mmBargainDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BargainDate";
			definition = "Date on which DRIP purchase completed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TaxVoucher obj) {
			return obj.getBargainDate();
		}

		@Override
		public void setValue(TaxVoucher obj, ISODate value) {
			obj.setBargainDate(value);
		}
	};
	protected ISODate bargainSettlementDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher2#mmBargainSettlementDate
	 * TaxVoucher2.mmBargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher3#mmBargainSettlementDate
	 * TaxVoucher3.mmBargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmBargainSettlementDate
	 * TaxVoucher1.mmBargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher4#mmBargainSettlementDate
	 * TaxVoucher4.mmBargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher5#mmBargainSettlementDate
	 * TaxVoucher5.mmBargainSettlementDate}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, ISODate> mmBargainSettlementDate = new MMBusinessAttribute<TaxVoucher, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher2.mmBargainSettlementDate, TaxVoucher3.mmBargainSettlementDate, TaxVoucher1.mmBargainSettlementDate, TaxVoucher4.mmBargainSettlementDate, TaxVoucher5.mmBargainSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BargainSettlementDate";
			definition = "Settlement date of the DRIP purchase transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TaxVoucher obj) {
			return obj.getBargainSettlementDate();
		}

		@Override
		public void setValue(TaxVoucher obj, ISODate value) {
			obj.setBargainSettlementDate(value);
		}
	};
	protected BaseOneRate taxVoucherRate;
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxVoucherRate
	 * TaxVoucher1.mmTaxVoucherRate}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, BaseOneRate> mmTaxVoucherRate = new MMBusinessAttribute<TaxVoucher, BaseOneRate>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmTaxVoucherRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucherRate";
			definition = "Distribution rate per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(TaxVoucher obj) {
			return obj.getTaxVoucherRate();
		}

		@Override
		public void setValue(TaxVoucher obj, BaseOneRate value) {
			obj.setTaxVoucherRate(value);
		}
	};
	protected SecuritiesQuantity recordDateHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTaxVoucher
	 * SecuritiesQuantity.mmTaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmRecordDateHolding
	 * TaxVoucher1.mmRecordDateHolding}</li>
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
	public static final MMBusinessAssociationEnd<TaxVoucher, SecuritiesQuantity> mmRecordDateHolding = new MMBusinessAssociationEnd<TaxVoucher, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmRecordDateHolding);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecordDateHolding";
			definition = "Securities holding on record date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(TaxVoucher obj) {
			return obj.getRecordDateHolding();
		}

		@Override
		public void setValue(TaxVoucher obj, SecuritiesQuantity value) {
			obj.setRecordDateHolding(value);
		}
	};
	protected SecuritiesPricing scripDividendReinvestmentPricePerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
	 * SecuritiesPricing.mmTaxVoucher}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmScripDividendReinvestmentPricePerShare
	 * TaxVoucher1.mmScripDividendReinvestmentPricePerShare}</li>
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
	public static final MMBusinessAssociationEnd<TaxVoucher, SecuritiesPricing> mmScripDividendReinvestmentPricePerShare = new MMBusinessAssociationEnd<TaxVoucher, SecuritiesPricing>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmScripDividendReinvestmentPricePerShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ScripDividendReinvestmentPricePerShare";
			definition = "Cost per share of new shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(TaxVoucher obj) {
			return obj.getScripDividendReinvestmentPricePerShare();
		}

		@Override
		public void setValue(TaxVoucher obj, SecuritiesPricing value) {
			obj.setScripDividendReinvestmentPricePerShare(value);
		}
	};
	protected ActiveCurrencyAndAmount allotedSharesCost;
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
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmAllotedSharesCost
	 * TaxVoucher1.mmAllotedSharesCost}</li>
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
	public static final MMBusinessAttribute<TaxVoucher, ActiveCurrencyAndAmount> mmAllotedSharesCost = new MMBusinessAttribute<TaxVoucher, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmAllotedSharesCost);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllotedSharesCost";
			definition = "Total cash amount required to purchase shares allotted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(TaxVoucher obj) {
			return obj.getAllotedSharesCost();
		}

		@Override
		public void setValue(TaxVoucher obj, ActiveCurrencyAndAmount value) {
			obj.setAllotedSharesCost(value);
		}
	};
	protected List<ForeignExchangeTrade> foreignExchangeTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForTaxVoucher
	 * ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher}</li>
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
	public static final MMBusinessAssociationEnd<TaxVoucher, List<ForeignExchangeTrade>> mmForeignExchangeTransaction = new MMBusinessAssociationEnd<TaxVoucher, List<ForeignExchangeTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeTransaction";
			definition = "Provides information about the foreign exchange transaction.";
			minOccurs = 0;
			opposite_lazy = () -> ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}

		@Override
		public List<ForeignExchangeTrade> getValue(TaxVoucher obj) {
			return obj.getForeignExchangeTransaction();
		}

		@Override
		public void setValue(TaxVoucher obj, List<ForeignExchangeTrade> value) {
			obj.setForeignExchangeTransaction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxVoucher";
				definition = "Statement showing the amount or value of a distribution and either the tax credit to which the recipient is entitled in respect of that distribution; or the amount of tax deducted from the distribution.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmTaxVoucher, SecuritiesTax.mmTaxVoucher, SecuritiesQuantity.mmTaxVoucher, ForeignExchangeTrade.mmCurrencyExchangeForTaxVoucher,
						CorporateActionDistribution.mmTaxVoucher);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxVoucher.mmRequestedTaxationRate, com.tools20022.repository.entity.TaxVoucher.mmCreditRate,
						com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax, com.tools20022.repository.entity.TaxVoucher.mmSundryOrOtherAmount, com.tools20022.repository.entity.TaxVoucher.mmCreditAmount,
						com.tools20022.repository.entity.TaxVoucher.mmCashAmountBroughtForward, com.tools20022.repository.entity.TaxVoucher.mmCashAmountCarriedForward, com.tools20022.repository.entity.TaxVoucher.mmNotionalTaxAmount,
						com.tools20022.repository.entity.TaxVoucher.mmDistribution, com.tools20022.repository.entity.TaxVoucher.mmIdentification, com.tools20022.repository.entity.TaxVoucher.mmBargainDate,
						com.tools20022.repository.entity.TaxVoucher.mmBargainSettlementDate, com.tools20022.repository.entity.TaxVoucher.mmTaxVoucherRate, com.tools20022.repository.entity.TaxVoucher.mmRecordDateHolding,
						com.tools20022.repository.entity.TaxVoucher.mmScripDividendReinvestmentPricePerShare, com.tools20022.repository.entity.TaxVoucher.mmAllotedSharesCost,
						com.tools20022.repository.entity.TaxVoucher.mmForeignExchangeTransaction);
				derivationComponent_lazy = () -> Arrays.asList(TaxVoucher2.mmObject(), TaxVoucher3.mmObject(), TaxVoucher1.mmObject(), TaxVoucher4.mmObject(), TaxVoucher5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TaxVoucher.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getRequestedTaxationRate() {
		return requestedTaxationRate;
	}

	public TaxVoucher setRequestedTaxationRate(PercentageRate requestedTaxationRate) {
		this.requestedTaxationRate = Objects.requireNonNull(requestedTaxationRate);
		return this;
	}

	public PercentageRate getCreditRate() {
		return creditRate;
	}

	public TaxVoucher setCreditRate(PercentageRate creditRate) {
		this.creditRate = Objects.requireNonNull(creditRate);
		return this;
	}

	public List<SecuritiesTax> getRelatedSecurityTax() {
		return relatedSecurityTax == null ? relatedSecurityTax = new ArrayList<>() : relatedSecurityTax;
	}

	public TaxVoucher setRelatedSecurityTax(List<SecuritiesTax> relatedSecurityTax) {
		this.relatedSecurityTax = Objects.requireNonNull(relatedSecurityTax);
		return this;
	}

	public CurrencyAndAmount getSundryOrOtherAmount() {
		return sundryOrOtherAmount;
	}

	public TaxVoucher setSundryOrOtherAmount(CurrencyAndAmount sundryOrOtherAmount) {
		this.sundryOrOtherAmount = Objects.requireNonNull(sundryOrOtherAmount);
		return this;
	}

	public CurrencyAndAmount getCreditAmount() {
		return creditAmount;
	}

	public TaxVoucher setCreditAmount(CurrencyAndAmount creditAmount) {
		this.creditAmount = Objects.requireNonNull(creditAmount);
		return this;
	}

	public CurrencyAndAmount getCashAmountBroughtForward() {
		return cashAmountBroughtForward;
	}

	public TaxVoucher setCashAmountBroughtForward(CurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = Objects.requireNonNull(cashAmountBroughtForward);
		return this;
	}

	public CurrencyAndAmount getCashAmountCarriedForward() {
		return cashAmountCarriedForward;
	}

	public TaxVoucher setCashAmountCarriedForward(CurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = Objects.requireNonNull(cashAmountCarriedForward);
		return this;
	}

	public CurrencyAndAmount getNotionalTaxAmount() {
		return notionalTaxAmount;
	}

	public TaxVoucher setNotionalTaxAmount(CurrencyAndAmount notionalTaxAmount) {
		this.notionalTaxAmount = Objects.requireNonNull(notionalTaxAmount);
		return this;
	}

	public Optional<CorporateActionDistribution> getDistribution() {
		return distribution == null ? Optional.empty() : Optional.of(distribution);
	}

	public TaxVoucher setDistribution(CorporateActionDistribution distribution) {
		this.distribution = distribution;
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public TaxVoucher setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODate getBargainDate() {
		return bargainDate;
	}

	public TaxVoucher setBargainDate(ISODate bargainDate) {
		this.bargainDate = Objects.requireNonNull(bargainDate);
		return this;
	}

	public ISODate getBargainSettlementDate() {
		return bargainSettlementDate;
	}

	public TaxVoucher setBargainSettlementDate(ISODate bargainSettlementDate) {
		this.bargainSettlementDate = Objects.requireNonNull(bargainSettlementDate);
		return this;
	}

	public BaseOneRate getTaxVoucherRate() {
		return taxVoucherRate;
	}

	public TaxVoucher setTaxVoucherRate(BaseOneRate taxVoucherRate) {
		this.taxVoucherRate = Objects.requireNonNull(taxVoucherRate);
		return this;
	}

	public SecuritiesQuantity getRecordDateHolding() {
		return recordDateHolding;
	}

	public TaxVoucher setRecordDateHolding(SecuritiesQuantity recordDateHolding) {
		this.recordDateHolding = Objects.requireNonNull(recordDateHolding);
		return this;
	}

	public SecuritiesPricing getScripDividendReinvestmentPricePerShare() {
		return scripDividendReinvestmentPricePerShare;
	}

	public TaxVoucher setScripDividendReinvestmentPricePerShare(SecuritiesPricing scripDividendReinvestmentPricePerShare) {
		this.scripDividendReinvestmentPricePerShare = Objects.requireNonNull(scripDividendReinvestmentPricePerShare);
		return this;
	}

	public ActiveCurrencyAndAmount getAllotedSharesCost() {
		return allotedSharesCost;
	}

	public TaxVoucher setAllotedSharesCost(ActiveCurrencyAndAmount allotedSharesCost) {
		this.allotedSharesCost = Objects.requireNonNull(allotedSharesCost);
		return this;
	}

	public List<ForeignExchangeTrade> getForeignExchangeTransaction() {
		return foreignExchangeTransaction == null ? foreignExchangeTransaction = new ArrayList<>() : foreignExchangeTransaction;
	}

	public TaxVoucher setForeignExchangeTransaction(List<ForeignExchangeTrade> foreignExchangeTransaction) {
		this.foreignExchangeTransaction = Objects.requireNonNull(foreignExchangeTransaction);
		return this;
	}
}