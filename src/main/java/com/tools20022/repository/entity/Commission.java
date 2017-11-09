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
import com.tools20022.repository.codeset.CommissionTypeV2Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Amount of money due to a party as compensation for a service.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Commission" src="doc-files/Commission.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission12 Commission12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommissionType1Choice
 * CommissionType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission2 Commission2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommissionType2Choice
 * CommissionType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionType1
 * CommissionType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission4 Commission4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission9 Commission9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission7 Commission7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission11 Commission11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission6 Commission6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission10 Commission10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCommissions2
 * TotalCommissions2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCommissions3
 * TotalCommissions3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission14 Commission14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission13 Commission13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalCommissions4
 * TotalCommissions4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommissionType3Choice
 * CommissionType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission17 Commission17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommissionBasis1Choice
 * CommissionBasis1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission18 Commission18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission19 Commission19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission21 Commission21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission22 Commission22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommissionType5Choice
 * CommissionType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission23 Commission23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1
 * ChargeOrCommissionDiscount1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCommission
 * CashAccount.mmCommission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
 * Trade.mmTradeCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmCommission
 * CommissionWaiver.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCommission
 * CorporateActionFeesAndCharges.mmCommission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Broker#mmCommission
 * Broker.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionPartyRole#mmCommission
 * CommissionPartyRole.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmCommission
 * SecuritiesQuoteVariable.mmCommission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission2#mmCommission
 * Commission2.mmCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmCommission
 * Commission16.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions2#mmRepairedCommission
 * RepairedConditions2.mmRepairedCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions3#mmRepairedCommission
 * RepairedConditions3.mmRepairedCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalCommissions2#mmCommissionDetails
 * TotalCommissions2.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalCommissions3#mmCommissionDetails
 * TotalCommissions3.mmCommissionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalFees
 * SummaryAmounts1.mmTotalFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalCommissions4#mmCommissionDetails
 * TotalCommissions4.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmCommissionDetails
 * CurrencyConversion1.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmMarkUpDetails
 * CurrencyConversion1.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmCommissionDetails
 * CurrencyConversion2.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmMarkUpDetails
 * CurrencyConversion2.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmCommissionDetails
 * CurrencyConversion4.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmMarkUpDetails
 * CurrencyConversion4.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmCommissionDetails
 * CurrencyConversion6.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmMarkUpDetails
 * CurrencyConversion6.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmCommissionDetails
 * CurrencyConversion9.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmMarkUpDetails
 * CurrencyConversion9.mmMarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmCommissionDetails
 * CurrencyConversion12.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmMarkUpDetails
 * CurrencyConversion12.mmMarkUpDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionWaiving
 * Commission.mmCommissionWaiving}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmTrade
 * Commission.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmCommissionType
 * Commission.mmCommissionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmBasis
 * Commission.mmBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCommercialAgreementReference
 * Commission.mmCommercialAgreementReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCalculationDate
 * Commission.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmRate
 * Commission.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionAmount
 * Commission.mmCommissionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmBroker
 * Commission.mmBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionPartyRole
 * Commission.mmCommissionPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmAccount
 * Commission.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmRelatedQuote
 * Commission.mmRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmSplitRate
 * Commission.mmSplitRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmCurrency
 * Commission.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCorporateActionFeesAndCharges
 * Commission.mmCorporateActionFeesAndCharges}</li>
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
 * "Commission"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money due to a party as compensation for a service."
 * </li>
 * </ul>
 */
public class Commission extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CommissionWaiver commissionWaiving;
	/**
	 * Voluntary non-enforcement of the right to all or part of a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmCommission
	 * CommissionWaiver.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary5#mmWaivedTrailerCommissionIndicator
	 * Intermediary5.mmWaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary12#mmWaivedTrailerCommissionIndicator
	 * Intermediary12.mmWaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary6#mmWaivedTrailerCommissionIndicator
	 * Intermediary6.mmWaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary13#mmWaivedTrailerCommissionIndicator
	 * Intermediary13.mmWaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission6#mmWaivingDetails
	 * Commission6.mmWaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#mmWaivingDetails
	 * Commission10.mmWaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary24#mmWaivedTrailerCommissionIndicator
	 * Intermediary24.mmWaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission17#mmWaivingDetails
	 * Commission17.mmWaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission22#mmWaivingDetails
	 * Commission22.mmWaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary36#mmWaivedTrailerCommissionIndicator
	 * Intermediary36.mmWaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission23#mmWaivingDetails
	 * Commission23.mmWaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#mmBasis
	 * ChargeOrCommissionDiscount1.mmBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiving"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Voluntary non-enforcement of the right to all or part of a commission."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommissionWaiving = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Intermediary5.mmWaivedTrailerCommissionIndicator, Intermediary12.mmWaivedTrailerCommissionIndicator, Intermediary6.mmWaivedTrailerCommissionIndicator,
					Intermediary13.mmWaivedTrailerCommissionIndicator, Commission6.mmWaivingDetails, Commission10.mmWaivingDetails, Intermediary24.mmWaivedTrailerCommissionIndicator, Commission17.mmWaivingDetails,
					Commission22.mmWaivingDetails, Intermediary36.mmWaivedTrailerCommissionIndicator, Commission23.mmWaivingDetails, ChargeOrCommissionDiscount1.mmBasis);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiving";
			definition = "Voluntary non-enforcement of the right to all or part of a commission.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommissionWaiver.mmCommission;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommissionWaiver.mmObject();
		}
	};
	protected Trade trade;
	/**
	 * Trade for which commission parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which commission parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which commission parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeCommission;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected CommissionTypeV2Code commissionType;
	/**
	 * Service for which the commission is asked or paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
	 * CommissionTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#mmType
	 * Commission12.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission12#mmExtendedType
	 * Commission12.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType1Choice#mmCode
	 * CommissionType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType1Choice#mmProprietary
	 * CommissionType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission2#mmType
	 * Commission2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType2Choice#mmCode
	 * CommissionType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType2Choice#mmProprietary
	 * CommissionType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmType
	 * Commission16.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionType1#mmStructured
	 * CommissionType1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionType1#mmAdditionalInformation
	 * CommissionType1.mmAdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission4#mmType
	 * Commission4.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#mmType
	 * Commission9.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#mmExtendedType
	 * Commission9.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission7#mmType
	 * Commission7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission11#mmType
	 * Commission11.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission11#mmExtendedType
	 * Commission11.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#mmType
	 * Commission6.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmType
	 * Commission10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#mmExtendedType
	 * Commission10.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission14#mmType
	 * Commission14.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType3Choice#mmCode
	 * CommissionType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType3Choice#mmProprietary
	 * CommissionType3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission17#mmType
	 * Commission17.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission21#mmCommissionType
	 * Commission21.mmCommissionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#mmType
	 * Commission22.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission23#mmType
	 * Commission23.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service for which the commission is asked or paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCommissionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Commission12.mmType, Commission12.mmExtendedType, CommissionType1Choice.mmCode, CommissionType1Choice.mmProprietary, Commission2.mmType, CommissionType2Choice.mmCode,
					CommissionType2Choice.mmProprietary, Commission16.mmType, CommissionType1.mmStructured, CommissionType1.mmAdditionalInformation, Commission4.mmType, Commission9.mmType, Commission9.mmExtendedType, Commission7.mmType,
					Commission11.mmType, Commission11.mmExtendedType, Commission6.mmType, Commission10.mmType, Commission10.mmExtendedType, Commission14.mmType, CommissionType3Choice.mmCode, CommissionType3Choice.mmProprietary,
					Commission17.mmType, Commission21.mmCommissionType, Commission22.mmType, Commission23.mmType);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionType";
			definition = "Service for which the commission is asked or paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommissionTypeV2Code.mmObject();
		}
	};
	protected TaxationBasisCode basis;
	/**
	 * Basis upon which a commission is charged, eg, flat fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#mmBasis
	 * Commission12.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission12#mmExtendedBasis
	 * Commission12.mmExtendedBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#mmBasis
	 * Commission6.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmBasis
	 * Commission10.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#mmExtendedBasis
	 * Commission10.mmExtendedBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission17#mmBasis
	 * Commission17.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#mmBasis
	 * Commission22.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission23#mmBasis
	 * Commission23.mmBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Basis upon which a commission is charged, eg, flat fee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(Commission12.mmBasis, Commission12.mmExtendedBasis, Commission6.mmBasis, Commission10.mmBasis, Commission10.mmExtendedBasis, Commission17.mmBasis, Commission22.mmBasis, Commission23.mmBasis);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis upon which a commission is charged, eg, flat fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	protected Max35Text commercialAgreementReference;
	/**
	 * Reference to the agreement established between the fund and another
	 * party. This element, amongst others, defines the conditions of the
	 * commissions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission12#mmCommercialAgreementReference
	 * Commission12.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission11#mmCommercialAgreementReference
	 * Commission11.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission6#mmCommercialAgreementReference
	 * Commission6.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#mmCommercialAgreementReference
	 * Commission10.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission14#mmCommercialAgreementReference
	 * Commission14.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission13#mmCommercialAgreementReference
	 * Commission13.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission17#mmCommercialAgreementReference
	 * Commission17.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission22#mmCommercialAgreementReference
	 * Commission22.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission23#mmCommercialAgreementReference
	 * Commission23.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmCommercialAgreementReference
	 * TotalFeesAndTaxes40.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmCommercialAgreementReference
	 * Fee3.mmCommercialAgreementReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialAgreementReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCommercialAgreementReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Commission12.mmCommercialAgreementReference, Commission11.mmCommercialAgreementReference, Commission6.mmCommercialAgreementReference, Commission10.mmCommercialAgreementReference,
					Commission14.mmCommercialAgreementReference, Commission13.mmCommercialAgreementReference, Commission17.mmCommercialAgreementReference, Commission22.mmCommercialAgreementReference,
					Commission23.mmCommercialAgreementReference, TotalFeesAndTaxes40.mmCommercialAgreementReference, Fee3.mmCommercialAgreementReference);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialAgreementReference";
			definition = "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime calculationDate;
	/**
	 * Date/time at which the commission is calculated.
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
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails11.mmCommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails14.mmCommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission16#mmCalculationDate
	 * Commission16.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails19.mmCommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails20.mmCommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails28.mmCommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails27.mmCommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails32.mmCommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#mmCommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails30.mmCommissionCalculationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the commission is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails11.mmCommissionCalculationDate, SecuritiesFinancingTransactionDetails14.mmCommissionCalculationDate, Commission16.mmCalculationDate,
					SecuritiesFinancingTransactionDetails19.mmCommissionCalculationDate, SecuritiesFinancingTransactionDetails20.mmCommissionCalculationDate, SecuritiesFinancingTransactionDetails28.mmCommissionCalculationDate,
					SecuritiesFinancingTransactionDetails27.mmCommissionCalculationDate, SecuritiesFinancingTransactionDetails32.mmCommissionCalculationDate, SecuritiesFinancingTransactionDetails30.mmCommissionCalculationDate);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date/time at which the commission is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected PercentageRate rate;
	/**
	 * Commission expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission4#mmRate
	 * Commission4.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#mmRate
	 * Commission9.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission7#mmRate
	 * Commission7.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission11#mmRate
	 * Commission11.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#mmRate
	 * Commission6.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#mmRate
	 * Commission10.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission14#mmRate
	 * Commission14.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission18#mmRate
	 * Commission18.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Commission4.mmRate, Commission9.mmRate, Commission7.mmRate, Commission11.mmRate, Commission6.mmRate, Commission10.mmRate, Commission14.mmRate, Commission18.mmRate);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Commission expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount commissionAmount;
	/**
	 * Commission expressed as an amount of money.
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
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation1#mmBrokersCommission
	 * GeneralInformation1.mmBrokersCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#mmBrokersCommission
	 * GeneralInformation4.mmBrokersCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation2#mmBrokersCommission
	 * GeneralInformation2.mmBrokersCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#mmAmount
	 * ChargeOrCommissionDiscount1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#mmBrokersCommission
	 * GeneralInformation5.mmBrokersCommission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission expressed as an amount of money."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCommissionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GeneralInformation1.mmBrokersCommission, GeneralInformation4.mmBrokersCommission, GeneralInformation2.mmBrokersCommission, ChargeOrCommissionDiscount1.mmAmount,
					GeneralInformation5.mmBrokersCommission);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionAmount";
			definition = "Commission expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Broker> broker;
	/**
	 * Broker to which a commission is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Broker#mmCommission
	 * Broker.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Broker to which a commission is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBroker = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Broker";
			definition = "Broker to which a commission is paid.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Broker.mmCommission;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Broker.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommissionPartyRole> commissionPartyRole;
	/**
	 * Role played by a party in the context of commissions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommissionPartyRole#mmCommission
	 * CommissionPartyRole.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommissionPartyRole
	 * CommissionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of commissions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommissionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommissionPartyRole";
			definition = "Role played by a party in the context of commissions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommissionPartyRole.mmCommission;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommissionPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> account;
	/**
	 * Account used for the commission fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCommission
	 * CashAccount.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for the commission fees."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account used for the commission fees.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCommission;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected SecuritiesQuoteVariable relatedQuote;
	/**
	 * Quote which includes a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmCommission
	 * SecuritiesQuoteVariable.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which includes a commission."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote which includes a commission.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmCommission;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.mmObject();
		}
	};
	protected PercentageRate splitRate;
	/**
	 * Percentage of the total commission received by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the total commission received by an intermediary."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSplitRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitRate";
			definition = "Percentage of the total commission received by an intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency in which the commission has to be settled.
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
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the commission has to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the commission has to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected CorporateActionFeesAndCharges corporateActionFeesAndCharges;
	/**
	 * Corporate action fees to which commission fees are added.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCommission
	 * CorporateActionFeesAndCharges.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionFeesAndCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate action fees to which commission fees are added."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionFeesAndCharges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionFeesAndCharges";
			definition = "Corporate action fees to which commission fees are added.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCommission;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Commission";
				definition = "Amount of money due to a party as compensation for a service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCommission, com.tools20022.repository.entity.Trade.mmTradeCommission,
						com.tools20022.repository.entity.CommissionWaiver.mmCommission, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCommission, com.tools20022.repository.entity.Broker.mmCommission,
						com.tools20022.repository.entity.CommissionPartyRole.mmCommission, com.tools20022.repository.entity.SecuritiesQuoteVariable.mmCommission);
				derivationElement_lazy = () -> Arrays.asList(Commission2.mmCommission, Commission16.mmCommission, RepairedConditions2.mmRepairedCommission, RepairedConditions3.mmRepairedCommission, TotalCommissions2.mmCommissionDetails,
						TotalCommissions3.mmCommissionDetails, SummaryAmounts1.mmTotalFees, TotalCommissions4.mmCommissionDetails, CurrencyConversion1.mmCommissionDetails, CurrencyConversion1.mmMarkUpDetails,
						CurrencyConversion2.mmCommissionDetails, CurrencyConversion2.mmMarkUpDetails, CurrencyConversion4.mmCommissionDetails, CurrencyConversion4.mmMarkUpDetails, CurrencyConversion6.mmCommissionDetails,
						CurrencyConversion6.mmMarkUpDetails, CurrencyConversion9.mmCommissionDetails, CurrencyConversion9.mmMarkUpDetails, CurrencyConversion12.mmCommissionDetails, CurrencyConversion12.mmMarkUpDetails);
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(Commission.mmCommissionWaiving, Commission.mmTrade, Commission.mmCommissionType, Commission.mmBasis, Commission.mmCommercialAgreementReference, Commission.mmCalculationDate,
						Commission.mmRate, Commission.mmCommissionAmount, Commission.mmBroker, Commission.mmCommissionPartyRole, Commission.mmAccount, Commission.mmRelatedQuote, Commission.mmSplitRate, Commission.mmCurrency,
						Commission.mmCorporateActionFeesAndCharges);
				derivationComponent_lazy = () -> Arrays.asList(Commission12.mmObject(), CommissionType1Choice.mmObject(), Commission2.mmObject(), CommissionType2Choice.mmObject(), Commission16.mmObject(), CommissionType1.mmObject(),
						Commission4.mmObject(), Commission9.mmObject(), Commission7.mmObject(), Commission11.mmObject(), Commission6.mmObject(), Commission10.mmObject(), TotalCommissions2.mmObject(), TotalCommissions3.mmObject(),
						Commission14.mmObject(), Commission13.mmObject(), TotalCommissions4.mmObject(), CommissionType3Choice.mmObject(), Commission17.mmObject(), CommissionBasis1Choice.mmObject(), Commission18.mmObject(),
						Commission19.mmObject(), Commission21.mmObject(), Commission22.mmObject(), CommissionType5Choice.mmObject(), Commission23.mmObject(), ChargeOrCommissionDiscount1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CommissionWaiver getCommissionWaiving() {
		return commissionWaiving;
	}

	public void setCommissionWaiving(com.tools20022.repository.entity.CommissionWaiver commissionWaiving) {
		this.commissionWaiving = commissionWaiving;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public CommissionTypeV2Code getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(CommissionTypeV2Code commissionType) {
		this.commissionType = commissionType;
	}

	public TaxationBasisCode getBasis() {
		return basis;
	}

	public void setBasis(TaxationBasisCode basis) {
		this.basis = basis;
	}

	public Max35Text getCommercialAgreementReference() {
		return commercialAgreementReference;
	}

	public void setCommercialAgreementReference(Max35Text commercialAgreementReference) {
		this.commercialAgreementReference = commercialAgreementReference;
	}

	public ISODateTime getCalculationDate() {
		return calculationDate;
	}

	public void setCalculationDate(ISODateTime calculationDate) {
		this.calculationDate = calculationDate;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public CurrencyAndAmount getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(CurrencyAndAmount commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public List<Broker> getBroker() {
		return broker;
	}

	public void setBroker(List<com.tools20022.repository.entity.Broker> broker) {
		this.broker = broker;
	}

	public List<CommissionPartyRole> getCommissionPartyRole() {
		return commissionPartyRole;
	}

	public void setCommissionPartyRole(List<com.tools20022.repository.entity.CommissionPartyRole> commissionPartyRole) {
		this.commissionPartyRole = commissionPartyRole;
	}

	public List<CashAccount> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.CashAccount> account) {
		this.account = account;
	}

	public SecuritiesQuoteVariable getRelatedQuote() {
		return relatedQuote;
	}

	public void setRelatedQuote(com.tools20022.repository.entity.SecuritiesQuoteVariable relatedQuote) {
		this.relatedQuote = relatedQuote;
	}

	public PercentageRate getSplitRate() {
		return splitRate;
	}

	public void setSplitRate(PercentageRate splitRate) {
		this.splitRate = splitRate;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public CorporateActionFeesAndCharges getCorporateActionFeesAndCharges() {
		return corporateActionFeesAndCharges;
	}

	public void setCorporateActionFeesAndCharges(com.tools20022.repository.entity.CorporateActionFeesAndCharges corporateActionFeesAndCharges) {
		this.corporateActionFeesAndCharges = corporateActionFeesAndCharges;
	}
}