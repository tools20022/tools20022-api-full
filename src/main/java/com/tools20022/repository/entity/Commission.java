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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CommissionTypeV2Code;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money due to a party as compensation for a service.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Commission" src="doc-files/Commission.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#CommissionWaiving
 * Commission.CommissionWaiving}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Trade
 * Commission.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#CommissionType
 * Commission.CommissionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Basis
 * Commission.Basis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#CommercialAgreementReference
 * Commission.CommercialAgreementReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#CalculationDate
 * Commission.CalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Rate
 * Commission.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#CommissionAmount
 * Commission.CommissionAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Broker
 * Commission.Broker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#CommissionPartyRole
 * Commission.CommissionPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Account
 * Commission.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#RelatedQuote
 * Commission.RelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#SplitRate
 * Commission.SplitRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#Currency
 * Commission.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#CorporateActionFeesAndCharges
 * Commission.CorporateActionFeesAndCharges}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Commission
 * CashAccount.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#TradeCommission
 * Trade.TradeCommission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommissionWaiver#Commission
 * CommissionWaiver.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#Commission
 * CorporateActionFeesAndCharges.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Broker#Commission
 * Broker.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionPartyRole#Commission
 * CommissionPartyRole.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#Commission
 * SecuritiesQuoteVariable.Commission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission2#Commission
 * Commission2.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#Commission
 * Commission16.Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions2#RepairedCommission
 * RepairedConditions2.RepairedCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions3#RepairedCommission
 * RepairedConditions3.RepairedCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalCommissions2#CommissionDetails
 * TotalCommissions2.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalCommissions3#CommissionDetails
 * TotalCommissions3.CommissionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SummaryAmounts1#TotalFees
 * SummaryAmounts1.TotalFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalCommissions4#CommissionDetails
 * TotalCommissions4.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#CommissionDetails
 * CurrencyConversion1.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#MarkUpDetails
 * CurrencyConversion1.MarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#CommissionDetails
 * CurrencyConversion2.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#MarkUpDetails
 * CurrencyConversion2.MarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#CommissionDetails
 * CurrencyConversion4.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#MarkUpDetails
 * CurrencyConversion4.MarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#CommissionDetails
 * CurrencyConversion6.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#MarkUpDetails
 * CurrencyConversion6.MarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#CommissionDetails
 * CurrencyConversion9.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#MarkUpDetails
 * CurrencyConversion9.MarkUpDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#CommissionDetails
 * CurrencyConversion12.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#MarkUpDetails
 * CurrencyConversion12.MarkUpDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Adjustment
 * Adjustment}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Voluntary non-enforcement of the right to all or part of a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#Commission
	 * CommissionWaiver.Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary5#WaivedTrailerCommissionIndicator
	 * Intermediary5.WaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary12#WaivedTrailerCommissionIndicator
	 * Intermediary12.WaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary6#WaivedTrailerCommissionIndicator
	 * Intermediary6.WaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary13#WaivedTrailerCommissionIndicator
	 * Intermediary13.WaivedTrailerCommissionIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#WaivingDetails
	 * Commission6.WaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#WaivingDetails
	 * Commission10.WaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary24#WaivedTrailerCommissionIndicator
	 * Intermediary24.WaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission17#WaivingDetails
	 * Commission17.WaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission22#WaivingDetails
	 * Commission22.WaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary36#WaivedTrailerCommissionIndicator
	 * Intermediary36.WaivedTrailerCommissionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission23#WaivingDetails
	 * Commission23.WaivingDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#Basis
	 * ChargeOrCommissionDiscount1.Basis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
	public static final MMBusinessAssociationEnd CommissionWaiving = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary5.WaivedTrailerCommissionIndicator, com.tools20022.repository.msg.Intermediary12.WaivedTrailerCommissionIndicator,
					com.tools20022.repository.msg.Intermediary6.WaivedTrailerCommissionIndicator, com.tools20022.repository.msg.Intermediary13.WaivedTrailerCommissionIndicator, com.tools20022.repository.msg.Commission6.WaivingDetails,
					com.tools20022.repository.msg.Commission10.WaivingDetails, com.tools20022.repository.msg.Intermediary24.WaivedTrailerCommissionIndicator, com.tools20022.repository.msg.Commission17.WaivingDetails,
					com.tools20022.repository.msg.Commission22.WaivingDetails, com.tools20022.repository.msg.Intermediary36.WaivedTrailerCommissionIndicator, com.tools20022.repository.msg.Commission23.WaivingDetails,
					com.tools20022.repository.msg.ChargeOrCommissionDiscount1.Basis);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionWaiving";
			definition = "Voluntary non-enforcement of the right to all or part of a commission.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CommissionWaiver.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommissionWaiver.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade for which commission parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#TradeCommission
	 * Trade.TradeCommission}</li>
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
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which commission parameters are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.TradeCommission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#Type
	 * Commission12.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#ExtendedType
	 * Commission12.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType1Choice#Code
	 * CommissionType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType1Choice#Proprietary
	 * CommissionType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission2#Type
	 * Commission2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType2Choice#Code
	 * CommissionType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType2Choice#Proprietary
	 * CommissionType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission16#Type
	 * Commission16.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CommissionType1#Structured
	 * CommissionType1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionType1#AdditionalInformation
	 * CommissionType1.AdditionalInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission4#Type
	 * Commission4.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#Type
	 * Commission9.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#ExtendedType
	 * Commission9.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission7#Type
	 * Commission7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission11#Type
	 * Commission11.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission11#ExtendedType
	 * Commission11.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#Type
	 * Commission6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#Type
	 * Commission10.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#ExtendedType
	 * Commission10.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission14#Type
	 * Commission14.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType3Choice#Code
	 * CommissionType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommissionType3Choice#Proprietary
	 * CommissionType3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission17#Type
	 * Commission17.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission21#CommissionType
	 * Commission21.CommissionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#Type
	 * Commission22.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission23#Type
	 * Commission23.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
	public static final MMBusinessAttribute CommissionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission12.Type, com.tools20022.repository.msg.Commission12.ExtendedType, com.tools20022.repository.choice.CommissionType1Choice.Code,
					com.tools20022.repository.choice.CommissionType1Choice.Proprietary, com.tools20022.repository.msg.Commission2.Type, com.tools20022.repository.choice.CommissionType2Choice.Code,
					com.tools20022.repository.choice.CommissionType2Choice.Proprietary, com.tools20022.repository.msg.Commission16.Type, com.tools20022.repository.msg.CommissionType1.Structured,
					com.tools20022.repository.msg.CommissionType1.AdditionalInformation, com.tools20022.repository.msg.Commission4.Type, com.tools20022.repository.msg.Commission9.Type,
					com.tools20022.repository.msg.Commission9.ExtendedType, com.tools20022.repository.msg.Commission7.Type, com.tools20022.repository.msg.Commission11.Type, com.tools20022.repository.msg.Commission11.ExtendedType,
					com.tools20022.repository.msg.Commission6.Type, com.tools20022.repository.msg.Commission10.Type, com.tools20022.repository.msg.Commission10.ExtendedType, com.tools20022.repository.msg.Commission14.Type,
					com.tools20022.repository.choice.CommissionType3Choice.Code, com.tools20022.repository.choice.CommissionType3Choice.Proprietary, com.tools20022.repository.msg.Commission17.Type,
					com.tools20022.repository.msg.Commission21.CommissionType, com.tools20022.repository.msg.Commission22.Type, com.tools20022.repository.msg.Commission23.Type);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionType";
			definition = "Service for which the commission is asked or paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CommissionTypeV2Code.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#Basis
	 * Commission12.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission12#ExtendedBasis
	 * Commission12.ExtendedBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#Basis
	 * Commission6.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#Basis
	 * Commission10.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#ExtendedBasis
	 * Commission10.ExtendedBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission17#Basis
	 * Commission17.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#Basis
	 * Commission22.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission23#Basis
	 * Commission23.Basis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
	public static final MMBusinessAttribute Basis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission12.Basis, com.tools20022.repository.msg.Commission12.ExtendedBasis, com.tools20022.repository.msg.Commission6.Basis,
					com.tools20022.repository.msg.Commission10.Basis, com.tools20022.repository.msg.Commission10.ExtendedBasis, com.tools20022.repository.msg.Commission17.Basis, com.tools20022.repository.msg.Commission22.Basis,
					com.tools20022.repository.msg.Commission23.Basis);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis upon which a commission is charged, eg, flat fee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission12#CommercialAgreementReference
	 * Commission12.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission11#CommercialAgreementReference
	 * Commission11.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission6#CommercialAgreementReference
	 * Commission6.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission10#CommercialAgreementReference
	 * Commission10.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission14#CommercialAgreementReference
	 * Commission14.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission13#CommercialAgreementReference
	 * Commission13.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission17#CommercialAgreementReference
	 * Commission17.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission22#CommercialAgreementReference
	 * Commission22.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission23#CommercialAgreementReference
	 * Commission23.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#CommercialAgreementReference
	 * TotalFeesAndTaxes40.CommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#CommercialAgreementReference
	 * Fee3.CommercialAgreementReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
	public static final MMBusinessAttribute CommercialAgreementReference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission12.CommercialAgreementReference, com.tools20022.repository.msg.Commission11.CommercialAgreementReference,
					com.tools20022.repository.msg.Commission6.CommercialAgreementReference, com.tools20022.repository.msg.Commission10.CommercialAgreementReference, com.tools20022.repository.msg.Commission14.CommercialAgreementReference,
					com.tools20022.repository.msg.Commission13.CommercialAgreementReference, com.tools20022.repository.msg.Commission17.CommercialAgreementReference, com.tools20022.repository.msg.Commission22.CommercialAgreementReference,
					com.tools20022.repository.msg.Commission23.CommercialAgreementReference, com.tools20022.repository.msg.TotalFeesAndTaxes40.CommercialAgreementReference, com.tools20022.repository.msg.Fee3.CommercialAgreementReference);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialAgreementReference";
			definition = "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time at which the commission is calculated.
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails11.CommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails14.CommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission16#CalculationDate
	 * Commission16.CalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails19.CommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails20.CommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails28.CommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails27.CommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails32.CommissionCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30#CommissionCalculationDate
	 * SecuritiesFinancingTransactionDetails30.CommissionCalculationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11.CommissionCalculationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails14.CommissionCalculationDate, com.tools20022.repository.msg.Commission16.CalculationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails19.CommissionCalculationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails20.CommissionCalculationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails28.CommissionCalculationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27.CommissionCalculationDate,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails32.CommissionCalculationDate, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30.CommissionCalculationDate);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date/time at which the commission is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission4#Rate
	 * Commission4.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission9#Rate
	 * Commission9.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission7#Rate
	 * Commission7.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission11#Rate
	 * Commission11.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission6#Rate
	 * Commission6.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission10#Rate
	 * Commission10.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission14#Rate
	 * Commission14.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission18#Rate
	 * Commission18.Rate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission4.Rate, com.tools20022.repository.msg.Commission9.Rate, com.tools20022.repository.msg.Commission7.Rate,
					com.tools20022.repository.msg.Commission11.Rate, com.tools20022.repository.msg.Commission6.Rate, com.tools20022.repository.msg.Commission10.Rate, com.tools20022.repository.msg.Commission14.Rate,
					com.tools20022.repository.msg.Commission18.Rate);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Commission expressed as a percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation1#BrokersCommission
	 * GeneralInformation1.BrokersCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation4#BrokersCommission
	 * GeneralInformation4.BrokersCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation2#BrokersCommission
	 * GeneralInformation2.BrokersCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#Amount
	 * ChargeOrCommissionDiscount1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralInformation5#BrokersCommission
	 * GeneralInformation5.BrokersCommission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
	public static final MMBusinessAttribute CommissionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralInformation1.BrokersCommission, com.tools20022.repository.msg.GeneralInformation4.BrokersCommission,
					com.tools20022.repository.msg.GeneralInformation2.BrokersCommission, com.tools20022.repository.msg.ChargeOrCommissionDiscount1.Amount, com.tools20022.repository.msg.GeneralInformation5.BrokersCommission);
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionAmount";
			definition = "Commission expressed as an amount of money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Broker to which a commission is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Broker#Commission
	 * Broker.Commission}</li>
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
	public static final MMBusinessAssociationEnd Broker = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Broker";
			definition = "Broker to which a commission is paid.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Broker.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Broker.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of commissions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommissionPartyRole#Commission
	 * CommissionPartyRole.Commission}</li>
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
	public static final MMBusinessAssociationEnd CommissionPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommissionPartyRole";
			definition = "Role played by a party in the context of commissions.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CommissionPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommissionPartyRole.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account used for the commission fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#Commission
	 * CashAccount.Commission}</li>
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
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account used for the commission fees.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which includes a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#Commission
	 * SecuritiesQuoteVariable.Commission}</li>
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
	public static final MMBusinessAssociationEnd RelatedQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote which includes a commission.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute SplitRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitRate";
			definition = "Percentage of the total commission received by an intermediary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the commission has to be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action fees to which commission fees are added.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#Commission
	 * CorporateActionFeesAndCharges.Commission}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionFeesAndCharges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Commission.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionFeesAndCharges";
			definition = "Corporate action fees to which commission fees are added.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.Commission;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Commission";
				definition = "Amount of money due to a party as compensation for a service.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Commission, com.tools20022.repository.entity.Trade.TradeCommission, com.tools20022.repository.entity.CommissionWaiver.Commission,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.Commission, com.tools20022.repository.entity.Broker.Commission, com.tools20022.repository.entity.CommissionPartyRole.Commission,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.Commission);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission2.Commission, com.tools20022.repository.msg.Commission16.Commission, com.tools20022.repository.msg.RepairedConditions2.RepairedCommission,
						com.tools20022.repository.msg.RepairedConditions3.RepairedCommission, com.tools20022.repository.msg.TotalCommissions2.CommissionDetails, com.tools20022.repository.msg.TotalCommissions3.CommissionDetails,
						com.tools20022.repository.msg.SummaryAmounts1.TotalFees, com.tools20022.repository.msg.TotalCommissions4.CommissionDetails, com.tools20022.repository.msg.CurrencyConversion1.CommissionDetails,
						com.tools20022.repository.msg.CurrencyConversion1.MarkUpDetails, com.tools20022.repository.msg.CurrencyConversion2.CommissionDetails, com.tools20022.repository.msg.CurrencyConversion2.MarkUpDetails,
						com.tools20022.repository.msg.CurrencyConversion4.CommissionDetails, com.tools20022.repository.msg.CurrencyConversion4.MarkUpDetails, com.tools20022.repository.msg.CurrencyConversion6.CommissionDetails,
						com.tools20022.repository.msg.CurrencyConversion6.MarkUpDetails, com.tools20022.repository.msg.CurrencyConversion9.CommissionDetails, com.tools20022.repository.msg.CurrencyConversion9.MarkUpDetails,
						com.tools20022.repository.msg.CurrencyConversion12.CommissionDetails, com.tools20022.repository.msg.CurrencyConversion12.MarkUpDetails);
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.CommissionWaiving, com.tools20022.repository.entity.Commission.Trade, com.tools20022.repository.entity.Commission.CommissionType,
						com.tools20022.repository.entity.Commission.Basis, com.tools20022.repository.entity.Commission.CommercialAgreementReference, com.tools20022.repository.entity.Commission.CalculationDate,
						com.tools20022.repository.entity.Commission.Rate, com.tools20022.repository.entity.Commission.CommissionAmount, com.tools20022.repository.entity.Commission.Broker,
						com.tools20022.repository.entity.Commission.CommissionPartyRole, com.tools20022.repository.entity.Commission.Account, com.tools20022.repository.entity.Commission.RelatedQuote,
						com.tools20022.repository.entity.Commission.SplitRate, com.tools20022.repository.entity.Commission.Currency, com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges);
				derivationComponent_lazy = () -> Arrays.asList(Commission12.mmObject(), CommissionType1Choice.mmObject(), Commission2.mmObject(), CommissionType2Choice.mmObject(), Commission16.mmObject(), CommissionType1.mmObject(),
						Commission4.mmObject(), Commission9.mmObject(), Commission7.mmObject(), Commission11.mmObject(), Commission6.mmObject(), Commission10.mmObject(), TotalCommissions2.mmObject(), TotalCommissions3.mmObject(),
						Commission14.mmObject(), Commission13.mmObject(), TotalCommissions4.mmObject(), CommissionType3Choice.mmObject(), Commission17.mmObject(), CommissionBasis1Choice.mmObject(), Commission18.mmObject(),
						Commission19.mmObject(), Commission21.mmObject(), Commission22.mmObject(), CommissionType5Choice.mmObject(), Commission23.mmObject(), ChargeOrCommissionDiscount1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}