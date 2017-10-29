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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.msg.Option1;
import com.tools20022.repository.msg.Option12;
import com.tools20022.repository.msg.Option7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contracts which grant to the holder either the privilege to purchase or the
 * privilege to sell the assets specified at a predetermined price or formula at
 * or within a time in the future.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Option" src="doc-files/Option.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#InstrumentAssignmentMethod
 * Option.InstrumentAssignmentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettleStyle
 * Option.SettleStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#Standardisation
 * Option.Standardisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#PositionLimit
 * Option.PositionLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#UnderlyingType
 * Option.UnderlyingType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#CoverIndicator
 * Option.CoverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#OptionConversionInformation
 * Option.OptionConversionInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionRatio
 * Option.OptionRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#SecuritiesOptionTrade
 * Option.SecuritiesOptionTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettlementType
 * Option.SettlementType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#StrikeMultiplier
 * Option.StrikeMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#ExpiryLocation
 * Option.ExpiryLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#FinalSettlementDate
 * Option.FinalSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionStyle
 * Option.OptionStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#CurrencyOption
 * Option.CurrencyOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#EarliestExerciseDate
 * Option.EarliestExerciseDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettlementDays
 * Option.SettlementDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#StrikePrice
 * Option.StrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionStartDate
 * Option.OptionStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#ExpiryDateAndTime
 * Option.ExpiryDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionType
 * Option.OptionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#StrikeValue
 * Option.StrikeValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettlementPeriodType
 * Option.SettlementPeriodType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Price#Option Price.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#RelatedOption
 * SecuritiesConversion.RelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#OptionDefinition
 * CurrencyOption.OptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#Option
 * SecuritiesOptionTrade.Option}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Option
 * FinancialInstrumentProperties1Choice.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#CallPutOption
 * UnsecuredMarketTransaction1.CallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#CallPutOption
 * UnsecuredMarketTransaction2.CallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#CallPutOption
 * UnsecuredMarketTransaction3.CallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#CallPutOption
 * UnsecuredMarketTransaction4.CallPutOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Derivative
 * Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle4Choice
 * OptionStyle4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType1Choice
 * OptionType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType2Choice
 * OptionType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle5Choice
 * OptionStyle5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType3Choice
 * OptionType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle1Choice
 * OptionStyle1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1 Option1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle6Choice
 * OptionStyle6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType4Choice
 * OptionType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettleStyle1Choice
 * SettleStyle1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType5Choice
 * OptionType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssignmentMethod1Choice
 * AssignmentMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option7 Option7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle2Choice
 * OptionStyle2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option12 Option12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice
 * OptionDateOrPeriod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle8Choice
 * OptionStyle8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType6Choice
 * OptionType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle9Choice
 * OptionStyle9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType7Choice
 * OptionType7Choice}</li>
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
 * "Option"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future."
 * </li>
 * </ul>
 */
public class Option extends Derivative {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method under which assignment was conducted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssignmentMethodCode
	 * AssignmentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option1#InstrumentAssignmentMethod
	 * Option1.InstrumentAssignmentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssignmentMethod1Choice#Code
	 * AssignmentMethod1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssignmentMethod1Choice#Proprietary
	 * AssignmentMethod1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option7#InstrumentAssignmentMethod
	 * Option7.InstrumentAssignmentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentAssignmentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method under which assignment was conducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstrumentAssignmentMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.InstrumentAssignmentMethod, com.tools20022.repository.choice.AssignmentMethod1Choice.Code,
					com.tools20022.repository.choice.AssignmentMethod1Choice.Proprietary, com.tools20022.repository.msg.Option7.InstrumentAssignmentMethod);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstrumentAssignmentMethod";
			definition = "Method under which assignment was conducted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AssignmentMethodCode.mmObject();
		}
	};
	/**
	 * Specifies whether the option contract settles at the open or close of the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettleStyleCode
	 * SettleStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#SettleStyle
	 * Option1.SettleStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#SettleStyle
	 * FinancialInstrumentAttributes1.SettleStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.SettleStyle1Choice#Code
	 * SettleStyle1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettleStyle1Choice#Proprietary
	 * SettleStyle1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option7#OptionSettlementStyle
	 * Option7.OptionSettlementStyle}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option contract settles at the open or close of the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettleStyle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.SettleStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes1.SettleStyle, com.tools20022.repository.choice.SettleStyle1Choice.Code,
					com.tools20022.repository.choice.SettleStyle1Choice.Proprietary, com.tools20022.repository.msg.Option7.OptionSettlementStyle);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettleStyle";
			definition = "Specifies whether the option contract settles at the open or close of the market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettleStyleCode.mmObject();
		}
	};
	/**
	 * Specifies whether the terms of the security (underlying instruments,
	 * expiration date, contract size) are defined according to the exchange
	 * specifications or whether they can be user defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#Standardisation
	 * Option1.Standardisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Standardisation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.Standardisation);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}
	};
	/**
	 * Indicates the maximum number of listed option contracts on a single
	 * security which can be held by an investor or group of investors acting
	 * jointly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#PositionLimit
	 * FinancialInstrumentAttributes1.PositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#PositionLimit
	 * FutureOrOptionDetails1.PositionLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PositionLimit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.PositionLimit, com.tools20022.repository.msg.FutureOrOptionDetails1.PositionLimit);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the type of underlying to which the option relates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying to which the option relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnderlyingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the underlying financial instrument of an option is
	 * owned by the writer of the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying financial instrument of an option is owned by the writer of the option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CoverIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverIndicator";
			definition = "Indicates whether the underlying financial instrument of an option is owned by the writer of the option.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information on the conversion exchange of an option into another form of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#RelatedOption
	 * SecuritiesConversion.RelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionConversionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the conversion exchange of an option into another form of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OptionConversionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionConversionInformation";
			definition = "Information on the conversion exchange of an option into another form of securities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Expresses the risk of an option leg. Value must be between -1 and 1. A
	 * Call Option will require a ratio value between 0 and 1. A Put Option will
	 * require a ratio value between -1 and 0.
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#LegOptionRatio
	 * InstrumentLeg2.LegOptionRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#LegOptionRatio
	 * InstrumentLeg3.LegOptionRatio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionRatio = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstrumentLeg2.LegOptionRatio, com.tools20022.repository.msg.InstrumentLeg3.LegOptionRatio);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionRatio";
			definition = "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies the trade elements for the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#Option
	 * SecuritiesOptionTrade.Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
	 * SecuritiesOptionTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOptionTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade elements for the option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOptionTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOptionTrade";
			definition = "Specifies the trade elements for the option.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the trade is to be settled as principal or netted off
	 * against another trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTypeCode
	 * SettlementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#SettlementType
	 * UnderlyingAttributes.SettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#SettlementType
	 * Option2.SettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#SettlementType
	 * Option3.SettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#SettlementType
	 * UnderlyingAttributes2.SettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#SettlementType
	 * Option4.SettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#SettlementType
	 * Option5.SettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#SettlementType
	 * Option6.SettlementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is to be settled as principal or netted off against another trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingAttributes.SettlementType, com.tools20022.repository.msg.Option2.SettlementType, com.tools20022.repository.msg.Option3.SettlementType,
					com.tools20022.repository.msg.UnderlyingAttributes2.SettlementType, com.tools20022.repository.msg.Option4.SettlementType, com.tools20022.repository.msg.Option5.SettlementType,
					com.tools20022.repository.msg.Option6.SettlementType);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementTypeCode.mmObject();
		}
	};
	/**
	 * Multiplier applied to the strike price for the purpose of calculating the
	 * settlement value (Used for derivatives).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#StrikeMultiplier
	 * Option1.StrikeMultiplier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#StrikeMultiplier
	 * Option7.StrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#PriceMultiplier
	 * DerivativeInstrument5.PriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#PriceMultiplier
	 * DerivativeInstrument6.PriceMultiplier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrikeMultiplier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.StrikeMultiplier, com.tools20022.repository.msg.Option7.StrikeMultiplier, com.tools20022.repository.msg.DerivativeInstrument5.PriceMultiplier,
					com.tools20022.repository.msg.DerivativeInstrument6.PriceMultiplier);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeMultiplier";
			definition = "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Financial center where option expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#ExpiryLocation
	 * Option1.ExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#ExpiryLocation
	 * Option2.ExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#ExpiryLocation
	 * Option3.ExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#ExpiryLocation
	 * Option7.ExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#ExpiryLocation
	 * Option4.ExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#ExpiryLocation
	 * Option5.ExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#ExpiryLocation
	 * Option6.ExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#ExpiryLocation
	 * Option10.ExpiryLocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial center where option expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryLocation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.ExpiryLocation, com.tools20022.repository.msg.Option2.ExpiryLocation, com.tools20022.repository.msg.Option3.ExpiryLocation,
					com.tools20022.repository.msg.Option7.ExpiryLocation, com.tools20022.repository.msg.Option4.ExpiryLocation, com.tools20022.repository.msg.Option5.ExpiryLocation, com.tools20022.repository.msg.Option6.ExpiryLocation,
					com.tools20022.repository.msg.Option10.ExpiryLocation);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Date on which the trade is settled. i.e., the amounts are due.
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
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate2#FinalSettlementDate
	 * AmountsAndValueDate2.FinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3#FinalSettlementDate
	 * AmountsAndValueDate3.FinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate4#FinalSettlementDate
	 * AmountsAndValueDate4.FinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#FinalSettlementDate
	 * AmountsAndValueDate5.FinalSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled. i.e., the amounts are due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinalSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate2.FinalSettlementDate, com.tools20022.repository.msg.AmountsAndValueDate3.FinalSettlementDate,
					com.tools20022.repository.msg.AmountsAndValueDate4.FinalSettlementDate, com.tools20022.repository.msg.AmountsAndValueDate5.FinalSettlementDate);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled. i.e., the amounts are due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies how an option can be exercised (American, European, Bermudan)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle4Choice#Code
	 * OptionStyle4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle4Choice#Proprietary
	 * OptionStyle4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#OptionStyle
	 * FinancialInstrumentAttributes8.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#OptionStyle
	 * FinancialInstrumentAttributes20.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#OptionStyle
	 * FinancialInstrumentAttributes35.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle5Choice#Code
	 * OptionStyle5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle5Choice#Proprietary
	 * OptionStyle5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#OptionStyle
	 * FinancialInstrumentAttributes41.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#OptionStyle
	 * FinancialInstrumentAttributes7.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#OptionStyle
	 * FinancialInstrumentAttributes5.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#OptionStyle
	 * FinancialInstrumentAttributes11.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#OptionStyle
	 * FinancialInstrumentAttributes10.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#OptionStyle
	 * FinancialInstrumentAttributes19.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#OptionStyle
	 * FinancialInstrumentAttributes16.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#OptionStyle
	 * FinancialInstrumentAttributes23.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#OptionStyle
	 * FinancialInstrumentAttributes24.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#OptionStyle
	 * FinancialInstrumentAttributes33.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#OptionStyle
	 * FinancialInstrumentAttributes34.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#OptionStyle
	 * FinancialInstrumentAttributes39.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#OptionStyle
	 * FinancialInstrumentAttributes40.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#OptionStyle
	 * FinancialInstrumentAttributes43.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#OptionStyle
	 * FinancialInstrumentAttributes45.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#OptionStyle
	 * FinancialInstrumentAttributes4.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#OptionStyle
	 * FinancialInstrumentAttributes13.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#OptionStyle
	 * FinancialInstrumentAttributes21.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#OptionStyle
	 * FinancialInstrumentAttributes26.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#OptionStyle
	 * FinancialInstrumentAttributes36.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#OptionStyle
	 * FinancialInstrumentAttributes42.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#OptionStyle
	 * FinancialInstrumentAttributes27.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#OptionStyle
	 * FinancialInstrumentAttributes14.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#OptionStyle
	 * FinancialInstrumentAttributes30.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#OptionStyle
	 * FinancialInstrumentAttributes28.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle1Choice#Code
	 * OptionStyle1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle1Choice#Proprietary
	 * OptionStyle1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#OptionStyle
	 * Option1.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle6Choice#Code
	 * OptionStyle6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle6Choice#Proprietary
	 * OptionStyle6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#OptionStyle
	 * FinancialInstrumentAttributes31.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#OptionStyle
	 * FinancialInstrumentAttributes44.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#OptionStyle
	 * FinancialInstrumentAttributes15.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#ExerciseStyle
	 * Option2.ExerciseStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#ExerciseStyle
	 * Option3.ExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#OptionStyle
	 * FinancialInstrumentAttributes29.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#OptionStyle
	 * Option7.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle2Choice#Code
	 * OptionStyle2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle2Choice#Proprietary
	 * OptionStyle2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#OptionStyle
	 * FinancialInstrumentAttributes2.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#ExerciseStyle
	 * Option4.ExerciseStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#ExerciseStyle
	 * Option5.ExerciseStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#ExerciseStyle
	 * Option6.ExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#OptionStyle
	 * FinancialInstrumentAttributes48.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#OptionStyle
	 * FinancialInstrumentAttributes49.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#OptionStyle
	 * FinancialInstrumentAttributes55.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#OptionStyle
	 * FinancialInstrumentAttributes56.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle8Choice#Code
	 * OptionStyle8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle8Choice#Proprietary
	 * OptionStyle8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#OptionStyle
	 * FinancialInstrumentAttributes63.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#OptionStyle
	 * FinancialInstrumentAttributes64.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#OptionStyle
	 * FinancialInstrumentAttributes66.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#OptionStyle
	 * FinancialInstrumentAttributes67.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#OptionStyle
	 * FinancialInstrumentAttributes70.OptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionStyle9Choice#Code
	 * OptionStyle9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle9Choice#Proprietary
	 * OptionStyle9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#OptionStyle
	 * FinancialInstrumentAttributes71.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#OptionStyle
	 * FinancialInstrumentAttributes75.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#OptionStyle
	 * FinancialInstrumentAttributes78.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#OptionExerciseStyle
	 * DerivativeInstrument5.OptionExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#OptionExerciseStyle
	 * DerivativeInstrument6.OptionExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#OptionStyle
	 * FinancialInstrumentAttributes79.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#OptionStyle
	 * FinancialInstrumentAttributes80.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#OptionStyle
	 * FinancialInstrumentAttributes85.OptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#OptionStyle
	 * FinancialInstrumentAttributes83.OptionStyle}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how an option can be exercised (American, European, Bermudan)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionStyle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OptionStyle4Choice.Code, com.tools20022.repository.choice.OptionStyle4Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes20.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.OptionStyle, com.tools20022.repository.choice.OptionStyle5Choice.Code, com.tools20022.repository.choice.OptionStyle5Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes41.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes7.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes5.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes11.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes10.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes19.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes16.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes23.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes33.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes34.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes39.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes40.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes43.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes4.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes21.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes36.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes27.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes30.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.OptionStyle, com.tools20022.repository.choice.OptionStyle1Choice.Code, com.tools20022.repository.choice.OptionStyle1Choice.Proprietary,
					com.tools20022.repository.msg.Option1.OptionStyle, com.tools20022.repository.choice.OptionStyle6Choice.Code, com.tools20022.repository.choice.OptionStyle6Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes44.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.OptionStyle, com.tools20022.repository.msg.Option2.ExerciseStyle, com.tools20022.repository.msg.Option3.ExerciseStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.OptionStyle, com.tools20022.repository.msg.Option7.OptionStyle, com.tools20022.repository.choice.OptionStyle2Choice.Code,
					com.tools20022.repository.choice.OptionStyle2Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes2.OptionStyle, com.tools20022.repository.msg.Option4.ExerciseStyle,
					com.tools20022.repository.msg.Option5.ExerciseStyle, com.tools20022.repository.msg.Option6.ExerciseStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes48.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes55.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.OptionStyle, com.tools20022.repository.choice.OptionStyle8Choice.Code, com.tools20022.repository.choice.OptionStyle8Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes64.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes67.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.OptionStyle, com.tools20022.repository.choice.OptionStyle9Choice.Code, com.tools20022.repository.choice.OptionStyle9Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes75.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.OptionStyle, com.tools20022.repository.msg.DerivativeInstrument5.OptionExerciseStyle,
					com.tools20022.repository.msg.DerivativeInstrument6.OptionExerciseStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes79.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.OptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes85.OptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.OptionStyle);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}
	};
	/**
	 * Information specific to a currency option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#OptionDefinition
	 * CurrencyOption.OptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to a currency option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Information specific to a currency option.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.OptionDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * First date on which an american option can be exercised.
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
	 * {@linkplain com.tools20022.repository.msg.Option2#EarliestExerciseDate
	 * Option2.EarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option3#EarliestExerciseDate
	 * Option3.EarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option4#EarliestExerciseDate
	 * Option4.EarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option5#EarliestExerciseDate
	 * Option5.EarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option6#EarliestExerciseDate
	 * Option6.EarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice#EarliestExerciseDate
	 * OptionDateOrPeriod1Choice.EarliestExerciseDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an american option can be exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarliestExerciseDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.EarliestExerciseDate, com.tools20022.repository.msg.Option3.EarliestExerciseDate, com.tools20022.repository.msg.Option4.EarliestExerciseDate,
					com.tools20022.repository.msg.Option5.EarliestExerciseDate, com.tools20022.repository.msg.Option6.EarliestExerciseDate, com.tools20022.repository.choice.OptionDateOrPeriod1Choice.EarliestExerciseDate);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Number of business days between the hit date and the payment date in case
	 * of settlement at hit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of business days between the hit date and the payment date in case of settlement at hit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDays";
			definition = "Number of business days between the hit date and the payment date in case of settlement at hit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Predetermined price at which the holder will have to buy or sell the
	 * underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Price#Option
	 * Price.Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#StrikePrice
	 * DerivativeInstrument5.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#StrikePrice
	 * DerivativeInstrument6.StrikePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StrikePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeInstrument5.StrikePrice, com.tools20022.repository.msg.DerivativeInstrument6.StrikePrice);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * First date on which an option becomes effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an option becomes effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionStartDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStartDate";
			definition = "First date on which an option becomes effective.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * For European options, date on which the option holder can only exercise
	 * the right or let it lapse. For American options, the option holder can
	 * exercise the right up to the expiry date.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#ExpiryDateAndTime
	 * Option2.ExpiryDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#ExpiryDateAndTime
	 * Option3.ExpiryDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#ExpiryDateAndTime
	 * Option4.ExpiryDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#ExpiryDateAndTime
	 * Option5.ExpiryDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#ExpiryDateAndTime
	 * Option6.ExpiryDateAndTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#ExpiryDateAndTime
	 * Option10.ExpiryDateAndTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDateAndTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.ExpiryDateAndTime, com.tools20022.repository.msg.Option3.ExpiryDateAndTime, com.tools20022.repository.msg.Option4.ExpiryDateAndTime,
					com.tools20022.repository.msg.Option5.ExpiryDateAndTime, com.tools20022.repository.msg.Option6.ExpiryDateAndTime, com.tools20022.repository.msg.Option10.ExpiryDateAndTime);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether it is a Call option (right to purchase a specific
	 * underlying asset) or a Put option (right to sell a specific underlying
	 * asset).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode
	 * OptionDefinitionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionType1Choice#Code
	 * OptionType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType1Choice#Proprietary
	 * OptionType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionType2Choice#Code
	 * OptionType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType2Choice#Proprietary
	 * OptionType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#OptionType
	 * FinancialInstrumentAttributes8.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#OptionType
	 * FinancialInstrumentAttributes20.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#OptionType
	 * FinancialInstrumentAttributes35.OptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionType3Choice#Code
	 * OptionType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType3Choice#Proprietary
	 * OptionType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#OptionType
	 * FinancialInstrumentAttributes41.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#OptionType
	 * FinancialInstrumentAttributes4.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#OptionType
	 * FinancialInstrumentAttributes13.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#OptionType
	 * FinancialInstrumentAttributes21.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#OptionType
	 * FinancialInstrumentAttributes26.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#OptionType
	 * FinancialInstrumentAttributes36.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#OptionType
	 * FinancialInstrumentAttributes42.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#OptionType
	 * FinancialInstrumentAttributes27.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#OptionType
	 * FinancialInstrumentAttributes14.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#OptionType
	 * FinancialInstrumentAttributes30.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#OptionType
	 * FinancialInstrumentAttributes28.OptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#OptionType
	 * Option1.OptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionType4Choice#Code
	 * OptionType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType4Choice#Proprietary
	 * OptionType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#OptionType
	 * FinancialInstrumentAttributes31.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#OptionType
	 * FinancialInstrumentAttributes44.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#OptionType
	 * SecurityInstrumentDescription1.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#OptionType
	 * SecurityInstrumentDescription2.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#OptionType
	 * FinancialInstrumentAttributes15.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#OptionType
	 * FinancialInstrumentAttributes29.OptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionType5Choice#Code
	 * OptionType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType5Choice#Proprietary
	 * OptionType5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#OptionType
	 * Option7.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#OptionType
	 * FinancialInstrumentAttributes2.OptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option12#Type
	 * Option12.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#OptionType
	 * Option10.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#OptionType
	 * FinancialInstrumentAttributes63.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#OptionType
	 * FinancialInstrumentAttributes64.OptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionType6Choice#Code
	 * OptionType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType6Choice#Proprietary
	 * OptionType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#OptionType
	 * FinancialInstrumentAttributes75.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#OptionType
	 * FinancialInstrumentAttributes78.OptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.OptionType7Choice#Code
	 * OptionType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType7Choice#Proprietary
	 * OptionType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#OptionType
	 * DerivativeInstrument5.OptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#OptionType
	 * DerivativeInstrument6.OptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OptionType1Choice.Code, com.tools20022.repository.choice.OptionType1Choice.Proprietary, com.tools20022.repository.choice.OptionType2Choice.Code,
					com.tools20022.repository.choice.OptionType2Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes8.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes20.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.OptionType, com.tools20022.repository.choice.OptionType3Choice.Code, com.tools20022.repository.choice.OptionType3Choice.Proprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes41.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes4.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes21.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes36.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes27.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes30.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.OptionType, com.tools20022.repository.msg.Option1.OptionType, com.tools20022.repository.choice.OptionType4Choice.Code,
					com.tools20022.repository.choice.OptionType4Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes31.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes44.OptionType,
					com.tools20022.repository.msg.SecurityInstrumentDescription1.OptionType, com.tools20022.repository.msg.SecurityInstrumentDescription2.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes15.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.OptionType, com.tools20022.repository.choice.OptionType5Choice.Code, com.tools20022.repository.choice.OptionType5Choice.Proprietary,
					com.tools20022.repository.msg.Option7.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes2.OptionType, com.tools20022.repository.msg.Option12.Type, com.tools20022.repository.msg.Option10.OptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes64.OptionType, com.tools20022.repository.choice.OptionType6Choice.Code,
					com.tools20022.repository.choice.OptionType6Choice.Proprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes75.OptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes78.OptionType,
					com.tools20022.repository.choice.OptionType7Choice.Code, com.tools20022.repository.choice.OptionType7Choice.Proprietary, com.tools20022.repository.msg.DerivativeInstrument5.OptionType,
					com.tools20022.repository.msg.DerivativeInstrument6.OptionType);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionDefinitionTypeCode.mmObject();
		}
	};
	/**
	 * Number of shares/units for the financial instrument involved in the
	 * option trade (Used for derivatives).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#StrikeValue
	 * Option1.StrikeValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#StrikeValue
	 * Option7.StrikeValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrikeValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.StrikeValue, com.tools20022.repository.msg.Option7.StrikeValue);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeValue";
			definition = "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies how settlement will take place for instance at expiration or at
	 * hit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPeriodType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how settlement will take place for instance at expiration or at hit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementPeriodType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPeriodType";
			definition = "Specifies how settlement will take place for instance at expiration or at hit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Option";
				definition = "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.Option, com.tools20022.repository.entity.SecuritiesConversion.RelatedOption,
						com.tools20022.repository.entity.CurrencyOption.OptionDefinition, com.tools20022.repository.entity.SecuritiesOptionTrade.Option);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Option, com.tools20022.repository.msg.UnsecuredMarketTransaction1.CallPutOption,
						com.tools20022.repository.msg.UnsecuredMarketTransaction2.CallPutOption, com.tools20022.repository.msg.UnsecuredMarketTransaction3.CallPutOption,
						com.tools20022.repository.msg.UnsecuredMarketTransaction4.CallPutOption);
				superType_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Option.InstrumentAssignmentMethod, com.tools20022.repository.entity.Option.SettleStyle, com.tools20022.repository.entity.Option.Standardisation,
						com.tools20022.repository.entity.Option.PositionLimit, com.tools20022.repository.entity.Option.UnderlyingType, com.tools20022.repository.entity.Option.CoverIndicator,
						com.tools20022.repository.entity.Option.OptionConversionInformation, com.tools20022.repository.entity.Option.OptionRatio, com.tools20022.repository.entity.Option.SecuritiesOptionTrade,
						com.tools20022.repository.entity.Option.SettlementType, com.tools20022.repository.entity.Option.StrikeMultiplier, com.tools20022.repository.entity.Option.ExpiryLocation,
						com.tools20022.repository.entity.Option.FinalSettlementDate, com.tools20022.repository.entity.Option.OptionStyle, com.tools20022.repository.entity.Option.CurrencyOption,
						com.tools20022.repository.entity.Option.EarliestExerciseDate, com.tools20022.repository.entity.Option.SettlementDays, com.tools20022.repository.entity.Option.StrikePrice,
						com.tools20022.repository.entity.Option.OptionStartDate, com.tools20022.repository.entity.Option.ExpiryDateAndTime, com.tools20022.repository.entity.Option.OptionType,
						com.tools20022.repository.entity.Option.StrikeValue, com.tools20022.repository.entity.Option.SettlementPeriodType);
				derivationComponent_lazy = () -> Arrays.asList(OptionStyle4Choice.mmObject(), OptionType1Choice.mmObject(), OptionType2Choice.mmObject(), OptionStyle5Choice.mmObject(), OptionType3Choice.mmObject(),
						OptionStyle1Choice.mmObject(), Option1.mmObject(), OptionStyle6Choice.mmObject(), OptionType4Choice.mmObject(), SettleStyle1Choice.mmObject(), OptionType5Choice.mmObject(), AssignmentMethod1Choice.mmObject(),
						Option7.mmObject(), OptionStyle2Choice.mmObject(), Option12.mmObject(), OptionDateOrPeriod1Choice.mmObject(), OptionStyle8Choice.mmObject(), OptionType6Choice.mmObject(), OptionStyle9Choice.mmObject(),
						OptionType7Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}