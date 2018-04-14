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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Derivative
 * Derivative}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmInstrumentAssignmentMethod
 * Option.mmInstrumentAssignmentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmSettleStyle
 * Option.mmSettleStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStandardisation
 * Option.mmStandardisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmPositionLimit
 * Option.mmPositionLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmUnderlyingType
 * Option.mmUnderlyingType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmCoverIndicator
 * Option.mmCoverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmOptionConversionInformation
 * Option.mmOptionConversionInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionRatio
 * Option.mmOptionRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmSecuritiesOptionTrade
 * Option.mmSecuritiesOptionTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmSettlementType
 * Option.mmSettlementType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikeMultiplier
 * Option.mmStrikeMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmExpiryLocation
 * Option.mmExpiryLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmFinalSettlementDate
 * Option.mmFinalSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
 * Option.mmOptionStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmCurrencyOption
 * Option.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmEarliestExerciseDate
 * Option.mmEarliestExerciseDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmSettlementDays
 * Option.mmSettlementDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
 * Option.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionStartDate
 * Option.mmOptionStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmExpiryDateAndTime
 * Option.mmExpiryDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmOptionType
 * Option.mmOptionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikeValue
 * Option.mmStrikeValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#mmSettlementPeriodType
 * Option.mmSettlementPeriodType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmOption
 * Price.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRelatedOption
 * SecuritiesConversion.mmRelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionDefinition
 * CurrencyOption.mmOptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#mmOption
 * SecuritiesOptionTrade.mmOption}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#mmOption
 * FinancialInstrumentProperties1Choice.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmCallPutOption
 * UnsecuredMarketTransaction1.mmCallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCallPutOption
 * UnsecuredMarketTransaction2.mmCallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmCallPutOption
 * UnsecuredMarketTransaction3.mmCallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmCallPutOption
 * UnsecuredMarketTransaction4.mmCallPutOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction15#mmOption
 * TradeTransaction15.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction17#mmOption
 * TradeTransaction17.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction14#mmOption
 * TradeTransaction14.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction18#mmOption
 * TradeTransaction18.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeTransaction16#mmOption
 * TradeTransaction16.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmEventType
 * Option14.mmEventType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Derivative3#mmOptionAttributes
 * Derivative3.mmOptionAttributes}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.Option13 Option13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssignmentMethod2Choice
 * AssignmentMethod2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.OptionType8Choice
 * OptionType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettleStyle2Choice
 * SettleStyle2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionOrSwaption6
 * OptionOrSwaption6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option14 Option14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OptionEvent2 OptionEvent2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Option"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Option extends Derivative {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AssignmentMethodCode instrumentAssignmentMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Option1#mmInstrumentAssignmentMethod
	 * Option1.mmInstrumentAssignmentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssignmentMethod1Choice#mmCode
	 * AssignmentMethod1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssignmentMethod1Choice#mmProprietary
	 * AssignmentMethod1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option7#mmInstrumentAssignmentMethod
	 * Option7.mmInstrumentAssignmentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option13#mmInstrumentAssignmentMethod
	 * Option13.mmInstrumentAssignmentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssignmentMethod2Choice#mmCode
	 * AssignmentMethod2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AssignmentMethod2Choice#mmProprietary
	 * AssignmentMethod2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentAssignmentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method under which assignment was conducted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, AssignmentMethodCode> mmInstrumentAssignmentMethod = new MMBusinessAttribute<Option, AssignmentMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Option1.mmInstrumentAssignmentMethod, AssignmentMethod1Choice.mmCode, AssignmentMethod1Choice.mmProprietary, Option7.mmInstrumentAssignmentMethod, Option13.mmInstrumentAssignmentMethod,
					AssignmentMethod2Choice.mmCode, AssignmentMethod2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstrumentAssignmentMethod";
			definition = "Method under which assignment was conducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssignmentMethodCode.mmObject();
		}

		@Override
		public AssignmentMethodCode getValue(Option obj) {
			return obj.getInstrumentAssignmentMethod();
		}

		@Override
		public void setValue(Option obj, AssignmentMethodCode value) {
			obj.setInstrumentAssignmentMethod(value);
		}
	};
	protected SettleStyleCode settleStyle;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmSettleStyle
	 * Option1.mmSettleStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmSettleStyle
	 * FinancialInstrumentAttributes1.mmSettleStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettleStyle1Choice#mmCode
	 * SettleStyle1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettleStyle1Choice#mmProprietary
	 * SettleStyle1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option7#mmOptionSettlementStyle
	 * Option7.mmOptionSettlementStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option13#mmOptionSettlementStyle
	 * Option13.mmOptionSettlementStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettleStyle2Choice#mmCode
	 * SettleStyle2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettleStyle2Choice#mmProprietary
	 * SettleStyle2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option contract settles at the open or close of the market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, SettleStyleCode> mmSettleStyle = new MMBusinessAttribute<Option, SettleStyleCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Option1.mmSettleStyle, FinancialInstrumentAttributes1.mmSettleStyle, SettleStyle1Choice.mmCode, SettleStyle1Choice.mmProprietary, Option7.mmOptionSettlementStyle,
					Option13.mmOptionSettlementStyle, SettleStyle2Choice.mmCode, SettleStyle2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettleStyle";
			definition = "Specifies whether the option contract settles at the open or close of the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettleStyleCode.mmObject();
		}

		@Override
		public SettleStyleCode getValue(Option obj) {
			return obj.getSettleStyle();
		}

		@Override
		public void setValue(Option obj, SettleStyleCode value) {
			obj.setSettleStyle(value);
		}
	};
	protected StandardisationCode standardisation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStandardisation
	 * Option1.mmStandardisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, StandardisationCode> mmStandardisation = new MMBusinessAttribute<Option, StandardisationCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Option1.mmStandardisation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}

		@Override
		public StandardisationCode getValue(Option obj) {
			return obj.getStandardisation();
		}

		@Override
		public void setValue(Option obj, StandardisationCode value) {
			obj.setStandardisation(value);
		}
	};
	protected Number positionLimit;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPositionLimit
	 * FinancialInstrumentAttributes1.mmPositionLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmPositionLimit
	 * FutureOrOptionDetails1.mmPositionLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmPositionLimit = new MMBusinessAttribute<Option, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmPositionLimit, FutureOrOptionDetails1.mmPositionLimit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getPositionLimit();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setPositionLimit(value);
		}
	};
	protected UnderlyingTypeCode underlyingType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying to which the option relates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, UnderlyingTypeCode> mmUnderlyingType = new MMBusinessAttribute<Option, UnderlyingTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}

		@Override
		public UnderlyingTypeCode getValue(Option obj) {
			return obj.getUnderlyingType();
		}

		@Override
		public void setValue(Option obj, UnderlyingTypeCode value) {
			obj.setUnderlyingType(value);
		}
	};
	protected YesNoIndicator coverIndicator;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying financial instrument of an option is owned by the writer of the option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::COVE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, YesNoIndicator> mmCoverIndicator = new MMBusinessAttribute<Option, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::COVE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverIndicator";
			definition = "Indicates whether the underlying financial instrument of an option is owned by the writer of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Option obj) {
			return obj.getCoverIndicator();
		}

		@Override
		public void setValue(Option obj, YesNoIndicator value) {
			obj.setCoverIndicator(value);
		}
	};
	protected List<SecuritiesConversion> optionConversionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRelatedOption
	 * SecuritiesConversion.mmRelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionConversionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the conversion exchange of an option into another form of securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, List<SecuritiesConversion>> mmOptionConversionInformation = new MMBusinessAssociationEnd<Option, List<SecuritiesConversion>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionConversionInformation";
			definition = "Information on the conversion exchange of an option into another form of securities.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesConversion.mmRelatedOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}

		@Override
		public List<SecuritiesConversion> getValue(Option obj) {
			return obj.getOptionConversionInformation();
		}

		@Override
		public void setValue(Option obj, List<SecuritiesConversion> value) {
			obj.setOptionConversionInformation(value);
		}
	};
	protected PercentageRate optionRatio;
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegOptionRatio
	 * InstrumentLeg2.mmLegOptionRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmLegOptionRatio
	 * InstrumentLeg3.mmLegOptionRatio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, PercentageRate> mmOptionRatio = new MMBusinessAttribute<Option, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(InstrumentLeg2.mmLegOptionRatio, InstrumentLeg3.mmLegOptionRatio);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionRatio";
			definition = "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Option obj) {
			return obj.getOptionRatio();
		}

		@Override
		public void setValue(Option obj, PercentageRate value) {
			obj.setOptionRatio(value);
		}
	};
	protected SecuritiesOptionTrade securitiesOptionTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
	 * SecuritiesOptionTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#mmOption
	 * SecuritiesOptionTrade.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOptionTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade elements for the option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, com.tools20022.repository.entity.SecuritiesOptionTrade> mmSecuritiesOptionTrade = new MMBusinessAssociationEnd<Option, com.tools20022.repository.entity.SecuritiesOptionTrade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOptionTrade";
			definition = "Specifies the trade elements for the option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesOptionTrade getValue(Option obj) {
			return obj.getSecuritiesOptionTrade();
		}

		@Override
		public void setValue(Option obj, com.tools20022.repository.entity.SecuritiesOptionTrade value) {
			obj.setSecuritiesOptionTrade(value);
		}
	};
	protected SettlementTypeCode settlementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes#mmSettlementType
	 * UnderlyingAttributes.mmSettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmSettlementType
	 * Option2.mmSettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#mmSettlementType
	 * Option3.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2#mmSettlementType
	 * UnderlyingAttributes2.mmSettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmSettlementType
	 * Option4.mmSettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#mmSettlementType
	 * Option5.mmSettlementType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#mmSettlementType
	 * Option6.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingAttributes3#mmSettlementType
	 * UnderlyingAttributes3.mmSettlementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is to be settled as principal or netted off against another trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, SettlementTypeCode> mmSettlementType = new MMBusinessAttribute<Option, SettlementTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(UnderlyingAttributes.mmSettlementType, Option2.mmSettlementType, Option3.mmSettlementType, UnderlyingAttributes2.mmSettlementType, Option4.mmSettlementType, Option5.mmSettlementType,
					Option6.mmSettlementType, UnderlyingAttributes3.mmSettlementType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTypeCode.mmObject();
		}

		@Override
		public SettlementTypeCode getValue(Option obj) {
			return obj.getSettlementType();
		}

		@Override
		public void setValue(Option obj, SettlementTypeCode value) {
			obj.setSettlementType(value);
		}
	};
	protected Number strikeMultiplier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikeMultiplier
	 * Option1.mmStrikeMultiplier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmStrikeMultiplier
	 * Option7.mmStrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option13#mmStrikeMultiplier
	 * Option13.mmStrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmPriceMultiplier
	 * DerivativeInstrument5.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmPriceMultiplier
	 * DerivativeInstrument6.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction15#mmPriceMultiplier
	 * TradeTransaction15.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction17#mmPriceMultiplier
	 * TradeTransaction17.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction14#mmPriceMultiplier
	 * TradeTransaction14.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmPriceMultiplier
	 * TradeTransaction18.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction16#mmPriceMultiplier
	 * TradeTransaction16.mmPriceMultiplier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmStrikeMultiplier = new MMBusinessAttribute<Option, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(Option1.mmStrikeMultiplier, Option7.mmStrikeMultiplier, Option13.mmStrikeMultiplier, DerivativeInstrument5.mmPriceMultiplier, DerivativeInstrument6.mmPriceMultiplier,
					TradeTransaction15.mmPriceMultiplier, TradeTransaction17.mmPriceMultiplier, TradeTransaction14.mmPriceMultiplier, TradeTransaction18.mmPriceMultiplier, TradeTransaction16.mmPriceMultiplier);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeMultiplier";
			definition = "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getStrikeMultiplier();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setStrikeMultiplier(value);
		}
	};
	protected Max4AlphaNumericText expiryLocation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmExpiryLocation
	 * Option1.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmExpiryLocation
	 * Option2.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#mmExpiryLocation
	 * Option3.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmExpiryLocation
	 * Option7.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmExpiryLocation
	 * Option4.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#mmExpiryLocation
	 * Option5.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#mmExpiryLocation
	 * Option6.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmExpiryLocation
	 * Option10.mmExpiryLocation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option13#mmExpiryLocation
	 * Option13.mmExpiryLocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial center where option expires."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Max4AlphaNumericText> mmExpiryLocation = new MMBusinessAttribute<Option, Max4AlphaNumericText>() {
		{
			derivation_lazy = () -> Arrays.asList(Option1.mmExpiryLocation, Option2.mmExpiryLocation, Option3.mmExpiryLocation, Option7.mmExpiryLocation, Option4.mmExpiryLocation, Option5.mmExpiryLocation, Option6.mmExpiryLocation,
					Option10.mmExpiryLocation, Option13.mmExpiryLocation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Option obj) {
			return obj.getExpiryLocation();
		}

		@Override
		public void setValue(Option obj, Max4AlphaNumericText value) {
			obj.setExpiryLocation(value);
		}
	};
	protected ISODate finalSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate2#mmFinalSettlementDate
	 * AmountsAndValueDate2.mmFinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3#mmFinalSettlementDate
	 * AmountsAndValueDate3.mmFinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate4#mmFinalSettlementDate
	 * AmountsAndValueDate4.mmFinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate5#mmFinalSettlementDate
	 * AmountsAndValueDate5.mmFinalSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled. i.e., the amounts are due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODate> mmFinalSettlementDate = new MMBusinessAttribute<Option, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(AmountsAndValueDate2.mmFinalSettlementDate, AmountsAndValueDate3.mmFinalSettlementDate, AmountsAndValueDate4.mmFinalSettlementDate, AmountsAndValueDate5.mmFinalSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled. i.e., the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Option obj) {
			return obj.getFinalSettlementDate();
		}

		@Override
		public void setValue(Option obj, ISODate value) {
			obj.setFinalSettlementDate(value);
		}
	};
	protected OptionStyleCode optionStyle;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle4Choice#mmCode
	 * OptionStyle4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle4Choice#mmProprietary
	 * OptionStyle4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmOptionStyle
	 * FinancialInstrumentAttributes8.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmOptionStyle
	 * FinancialInstrumentAttributes20.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmOptionStyle
	 * FinancialInstrumentAttributes35.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle5Choice#mmCode
	 * OptionStyle5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle5Choice#mmProprietary
	 * OptionStyle5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmOptionStyle
	 * FinancialInstrumentAttributes41.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmOptionStyle
	 * FinancialInstrumentAttributes7.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmOptionStyle
	 * FinancialInstrumentAttributes5.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmOptionStyle
	 * FinancialInstrumentAttributes11.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmOptionStyle
	 * FinancialInstrumentAttributes10.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmOptionStyle
	 * FinancialInstrumentAttributes19.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmOptionStyle
	 * FinancialInstrumentAttributes16.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmOptionStyle
	 * FinancialInstrumentAttributes23.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmOptionStyle
	 * FinancialInstrumentAttributes24.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmOptionStyle
	 * FinancialInstrumentAttributes33.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmOptionStyle
	 * FinancialInstrumentAttributes34.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmOptionStyle
	 * FinancialInstrumentAttributes39.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmOptionStyle
	 * FinancialInstrumentAttributes40.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmOptionStyle
	 * FinancialInstrumentAttributes43.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmOptionStyle
	 * FinancialInstrumentAttributes45.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmOptionStyle
	 * FinancialInstrumentAttributes4.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmOptionStyle
	 * FinancialInstrumentAttributes13.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmOptionStyle
	 * FinancialInstrumentAttributes21.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmOptionStyle
	 * FinancialInstrumentAttributes26.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmOptionStyle
	 * FinancialInstrumentAttributes36.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmOptionStyle
	 * FinancialInstrumentAttributes42.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmOptionStyle
	 * FinancialInstrumentAttributes27.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmOptionStyle
	 * FinancialInstrumentAttributes14.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmOptionStyle
	 * FinancialInstrumentAttributes30.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmOptionStyle
	 * FinancialInstrumentAttributes28.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle1Choice#mmCode
	 * OptionStyle1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle1Choice#mmProprietary
	 * OptionStyle1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmOptionStyle
	 * Option1.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle6Choice#mmCode
	 * OptionStyle6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle6Choice#mmProprietary
	 * OptionStyle6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmOptionStyle
	 * FinancialInstrumentAttributes31.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmOptionStyle
	 * FinancialInstrumentAttributes44.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmOptionStyle
	 * FinancialInstrumentAttributes15.mmOptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmExerciseStyle
	 * Option2.mmExerciseStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option3#mmExerciseStyle
	 * Option3.mmExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmOptionStyle
	 * FinancialInstrumentAttributes29.mmOptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmOptionStyle
	 * Option7.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle2Choice#mmCode
	 * OptionStyle2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle2Choice#mmProprietary
	 * OptionStyle2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmOptionStyle
	 * FinancialInstrumentAttributes2.mmOptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmExerciseStyle
	 * Option4.mmExerciseStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option5#mmExerciseStyle
	 * Option5.mmExerciseStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option6#mmExerciseStyle
	 * Option6.mmExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmOptionStyle
	 * FinancialInstrumentAttributes48.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmOptionStyle
	 * FinancialInstrumentAttributes49.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmOptionStyle
	 * FinancialInstrumentAttributes55.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmOptionStyle
	 * FinancialInstrumentAttributes56.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle8Choice#mmCode
	 * OptionStyle8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle8Choice#mmProprietary
	 * OptionStyle8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmOptionStyle
	 * FinancialInstrumentAttributes63.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmOptionStyle
	 * FinancialInstrumentAttributes64.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmOptionStyle
	 * FinancialInstrumentAttributes66.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmOptionStyle
	 * FinancialInstrumentAttributes67.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmOptionStyle
	 * FinancialInstrumentAttributes70.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle9Choice#mmCode
	 * OptionStyle9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionStyle9Choice#mmProprietary
	 * OptionStyle9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmOptionStyle
	 * FinancialInstrumentAttributes71.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmOptionStyle
	 * FinancialInstrumentAttributes75.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmOptionStyle
	 * FinancialInstrumentAttributes78.mmOptionStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option13#mmOptionStyle
	 * Option13.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmOptionExerciseStyle
	 * DerivativeInstrument5.mmOptionExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmOptionExerciseStyle
	 * DerivativeInstrument6.mmOptionExerciseStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmOptionStyle
	 * FinancialInstrumentAttributes79.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmOptionStyle
	 * FinancialInstrumentAttributes80.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmOptionStyle
	 * FinancialInstrumentAttributes85.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmOptionStyle
	 * FinancialInstrumentAttributes83.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6#mmOptionExerciseStyle
	 * OptionOrSwaption6.mmOptionExerciseStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmExpirationStyle
	 * Option14.mmExpirationStyle}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmOptionStyle
	 * Option14.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmOptionStyle
	 * FinancialInstrumentAttributes91.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmOptionStyle
	 * FinancialInstrumentAttributes92.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmOptionStyle
	 * FinancialInstrumentAttributes95.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmOptionStyle
	 * FinancialInstrumentAttributes97.mmOptionStyle}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how an option can be exercised (American, European, Bermudan)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, OptionStyleCode> mmOptionStyle = new MMBusinessAttribute<Option, OptionStyleCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OptionStyle4Choice.mmCode, OptionStyle4Choice.mmProprietary, FinancialInstrumentAttributes8.mmOptionStyle, FinancialInstrumentAttributes20.mmOptionStyle,
					FinancialInstrumentAttributes35.mmOptionStyle, OptionStyle5Choice.mmCode, OptionStyle5Choice.mmProprietary, FinancialInstrumentAttributes41.mmOptionStyle, FinancialInstrumentAttributes7.mmOptionStyle,
					FinancialInstrumentAttributes5.mmOptionStyle, FinancialInstrumentAttributes11.mmOptionStyle, FinancialInstrumentAttributes10.mmOptionStyle, FinancialInstrumentAttributes19.mmOptionStyle,
					FinancialInstrumentAttributes16.mmOptionStyle, FinancialInstrumentAttributes23.mmOptionStyle, FinancialInstrumentAttributes24.mmOptionStyle, FinancialInstrumentAttributes33.mmOptionStyle,
					FinancialInstrumentAttributes34.mmOptionStyle, FinancialInstrumentAttributes39.mmOptionStyle, FinancialInstrumentAttributes40.mmOptionStyle, FinancialInstrumentAttributes43.mmOptionStyle,
					FinancialInstrumentAttributes45.mmOptionStyle, FinancialInstrumentAttributes4.mmOptionStyle, FinancialInstrumentAttributes13.mmOptionStyle, FinancialInstrumentAttributes21.mmOptionStyle,
					FinancialInstrumentAttributes26.mmOptionStyle, FinancialInstrumentAttributes36.mmOptionStyle, FinancialInstrumentAttributes42.mmOptionStyle, FinancialInstrumentAttributes27.mmOptionStyle,
					FinancialInstrumentAttributes14.mmOptionStyle, FinancialInstrumentAttributes30.mmOptionStyle, FinancialInstrumentAttributes28.mmOptionStyle, OptionStyle1Choice.mmCode, OptionStyle1Choice.mmProprietary,
					Option1.mmOptionStyle, OptionStyle6Choice.mmCode, OptionStyle6Choice.mmProprietary, FinancialInstrumentAttributes31.mmOptionStyle, FinancialInstrumentAttributes44.mmOptionStyle,
					FinancialInstrumentAttributes15.mmOptionStyle, Option2.mmExerciseStyle, Option3.mmExerciseStyle, FinancialInstrumentAttributes29.mmOptionStyle, Option7.mmOptionStyle, OptionStyle2Choice.mmCode,
					OptionStyle2Choice.mmProprietary, FinancialInstrumentAttributes2.mmOptionStyle, Option4.mmExerciseStyle, Option5.mmExerciseStyle, Option6.mmExerciseStyle, FinancialInstrumentAttributes48.mmOptionStyle,
					FinancialInstrumentAttributes49.mmOptionStyle, FinancialInstrumentAttributes55.mmOptionStyle, FinancialInstrumentAttributes56.mmOptionStyle, OptionStyle8Choice.mmCode, OptionStyle8Choice.mmProprietary,
					FinancialInstrumentAttributes63.mmOptionStyle, FinancialInstrumentAttributes64.mmOptionStyle, FinancialInstrumentAttributes66.mmOptionStyle, FinancialInstrumentAttributes67.mmOptionStyle,
					FinancialInstrumentAttributes70.mmOptionStyle, OptionStyle9Choice.mmCode, OptionStyle9Choice.mmProprietary, FinancialInstrumentAttributes71.mmOptionStyle, FinancialInstrumentAttributes75.mmOptionStyle,
					FinancialInstrumentAttributes78.mmOptionStyle, Option13.mmOptionStyle, DerivativeInstrument5.mmOptionExerciseStyle, DerivativeInstrument6.mmOptionExerciseStyle, FinancialInstrumentAttributes79.mmOptionStyle,
					FinancialInstrumentAttributes80.mmOptionStyle, FinancialInstrumentAttributes85.mmOptionStyle, FinancialInstrumentAttributes83.mmOptionStyle, OptionOrSwaption6.mmOptionExerciseStyle, Option14.mmExpirationStyle,
					Option14.mmOptionStyle, FinancialInstrumentAttributes91.mmOptionStyle, FinancialInstrumentAttributes92.mmOptionStyle, FinancialInstrumentAttributes95.mmOptionStyle, FinancialInstrumentAttributes97.mmOptionStyle);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}

		@Override
		public OptionStyleCode getValue(Option obj) {
			return obj.getOptionStyle();
		}

		@Override
		public void setValue(Option obj, OptionStyleCode value) {
			obj.setOptionStyle(value);
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyOption> currencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionDefinition
	 * CurrencyOption.mmOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to a currency option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, List<CurrencyOption>> mmCurrencyOption = new MMBusinessAssociationEnd<Option, List<CurrencyOption>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Information specific to a currency option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmOptionDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}

		@Override
		public List<CurrencyOption> getValue(Option obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(Option obj, List<CurrencyOption> value) {
			obj.setCurrencyOption(value);
		}
	};
	protected ISODateTime earliestExerciseDate;
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
	 * {@linkplain com.tools20022.repository.msg.Option2#mmEarliestExerciseDate
	 * Option2.mmEarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option3#mmEarliestExerciseDate
	 * Option3.mmEarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option4#mmEarliestExerciseDate
	 * Option4.mmEarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option5#mmEarliestExerciseDate
	 * Option5.mmEarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option6#mmEarliestExerciseDate
	 * Option6.mmEarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionDateOrPeriod1Choice#mmEarliestExerciseDate
	 * OptionDateOrPeriod1Choice.mmEarliestExerciseDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an american option can be exercised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODateTime> mmEarliestExerciseDate = new MMBusinessAttribute<Option, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Option2.mmEarliestExerciseDate, Option3.mmEarliestExerciseDate, Option4.mmEarliestExerciseDate, Option5.mmEarliestExerciseDate, Option6.mmEarliestExerciseDate,
					OptionDateOrPeriod1Choice.mmEarliestExerciseDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option obj) {
			return obj.getEarliestExerciseDate();
		}

		@Override
		public void setValue(Option obj, ISODateTime value) {
			obj.setEarliestExerciseDate(value);
		}
	};
	protected Number settlementDays;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of business days between the hit date and the payment date in case of settlement at hit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmSettlementDays = new MMBusinessAttribute<Option, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDays";
			definition = "Number of business days between the hit date and the payment date in case of settlement at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getSettlementDays();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setSettlementDays(value);
		}
	};
	protected Price strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Price#mmOption
	 * Price.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmStrikePrice
	 * DerivativeInstrument5.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmStrikePrice
	 * DerivativeInstrument6.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6#mmStrikePrice
	 * OptionOrSwaption6.mmStrikePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Option, Price> mmStrikePrice = new MMBusinessAssociationEnd<Option, Price>() {
		{
			derivation_lazy = () -> Arrays.asList(DerivativeInstrument5.mmStrikePrice, DerivativeInstrument6.mmStrikePrice, OptionOrSwaption6.mmStrikePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Price.mmOption;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public Price getValue(Option obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(Option obj, Price value) {
			obj.setStrikePrice(value);
		}
	};
	protected ISODateTime optionStartDate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an option becomes effective."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODateTime> mmOptionStartDate = new MMBusinessAttribute<Option, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionStartDate";
			definition = "First date on which an option becomes effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option obj) {
			return obj.getOptionStartDate();
		}

		@Override
		public void setValue(Option obj, ISODateTime value) {
			obj.setOptionStartDate(value);
		}
	};
	protected ISODateTime expiryDateAndTime;
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
	 * {@linkplain com.tools20022.repository.msg.Option2#mmExpiryDateAndTime
	 * Option2.mmExpiryDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option3#mmExpiryDateAndTime
	 * Option3.mmExpiryDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option4#mmExpiryDateAndTime
	 * Option4.mmExpiryDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option5#mmExpiryDateAndTime
	 * Option5.mmExpiryDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option6#mmExpiryDateAndTime
	 * Option6.mmExpiryDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Option10#mmExpiryDateAndTime
	 * Option10.mmExpiryDateAndTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, ISODateTime> mmExpiryDateAndTime = new MMBusinessAttribute<Option, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Option2.mmExpiryDateAndTime, Option3.mmExpiryDateAndTime, Option4.mmExpiryDateAndTime, Option5.mmExpiryDateAndTime, Option6.mmExpiryDateAndTime, Option10.mmExpiryDateAndTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option obj) {
			return obj.getExpiryDateAndTime();
		}

		@Override
		public void setValue(Option obj, ISODateTime value) {
			obj.setExpiryDateAndTime(value);
		}
	};
	protected OptionDefinitionTypeCode optionType;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType1Choice#mmCode
	 * OptionType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType1Choice#mmProprietary
	 * OptionType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType2Choice#mmCode
	 * OptionType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType2Choice#mmProprietary
	 * OptionType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmOptionType
	 * FinancialInstrumentAttributes8.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmOptionType
	 * FinancialInstrumentAttributes20.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmOptionType
	 * FinancialInstrumentAttributes35.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType3Choice#mmCode
	 * OptionType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType3Choice#mmProprietary
	 * OptionType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmOptionType
	 * FinancialInstrumentAttributes41.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmOptionType
	 * FinancialInstrumentAttributes4.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmOptionType
	 * FinancialInstrumentAttributes13.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmOptionType
	 * FinancialInstrumentAttributes21.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmOptionType
	 * FinancialInstrumentAttributes26.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmOptionType
	 * FinancialInstrumentAttributes36.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmOptionType
	 * FinancialInstrumentAttributes42.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmOptionType
	 * FinancialInstrumentAttributes27.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmOptionType
	 * FinancialInstrumentAttributes14.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmOptionType
	 * FinancialInstrumentAttributes30.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmOptionType
	 * FinancialInstrumentAttributes28.mmOptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmOptionType
	 * Option1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType4Choice#mmCode
	 * OptionType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType4Choice#mmProprietary
	 * OptionType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmOptionType
	 * FinancialInstrumentAttributes31.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmOptionType
	 * FinancialInstrumentAttributes44.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#mmOptionType
	 * SecurityInstrumentDescription1.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#mmOptionType
	 * SecurityInstrumentDescription2.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmOptionType
	 * FinancialInstrumentAttributes15.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmOptionType
	 * FinancialInstrumentAttributes29.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType5Choice#mmCode
	 * OptionType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType5Choice#mmProprietary
	 * OptionType5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmOptionType
	 * Option7.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmOptionType
	 * FinancialInstrumentAttributes2.mmOptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option12#mmType
	 * Option12.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmOptionType
	 * Option10.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmOptionType
	 * FinancialInstrumentAttributes63.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmOptionType
	 * FinancialInstrumentAttributes64.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType6Choice#mmCode
	 * OptionType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType6Choice#mmProprietary
	 * OptionType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmOptionType
	 * FinancialInstrumentAttributes75.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmOptionType
	 * FinancialInstrumentAttributes78.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType7Choice#mmCode
	 * OptionType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType7Choice#mmProprietary
	 * OptionType7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option13#mmOptionType
	 * Option13.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType8Choice#mmCode
	 * OptionType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OptionType8Choice#mmProprietary
	 * OptionType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmOptionType
	 * DerivativeInstrument5.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmOptionType
	 * DerivativeInstrument6.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OptionOrSwaption6#mmOptionType
	 * OptionOrSwaption6.mmOptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option14#mmOptionType
	 * Option14.mmOptionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OptionEvent2#mmType
	 * OptionEvent2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmOptionType
	 * FinancialInstrumentAttributes91.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmOptionType
	 * FinancialInstrumentAttributes92.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmOptionType
	 * FinancialInstrumentAttributes95.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmOptionType
	 * FinancialInstrumentAttributes97.mmOptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, OptionDefinitionTypeCode> mmOptionType = new MMBusinessAttribute<Option, OptionDefinitionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(OptionType1Choice.mmCode, OptionType1Choice.mmProprietary, OptionType2Choice.mmCode, OptionType2Choice.mmProprietary, FinancialInstrumentAttributes8.mmOptionType,
					FinancialInstrumentAttributes20.mmOptionType, FinancialInstrumentAttributes35.mmOptionType, OptionType3Choice.mmCode, OptionType3Choice.mmProprietary, FinancialInstrumentAttributes41.mmOptionType,
					FinancialInstrumentAttributes4.mmOptionType, FinancialInstrumentAttributes13.mmOptionType, FinancialInstrumentAttributes21.mmOptionType, FinancialInstrumentAttributes26.mmOptionType,
					FinancialInstrumentAttributes36.mmOptionType, FinancialInstrumentAttributes42.mmOptionType, FinancialInstrumentAttributes27.mmOptionType, FinancialInstrumentAttributes14.mmOptionType,
					FinancialInstrumentAttributes30.mmOptionType, FinancialInstrumentAttributes28.mmOptionType, Option1.mmOptionType, OptionType4Choice.mmCode, OptionType4Choice.mmProprietary, FinancialInstrumentAttributes31.mmOptionType,
					FinancialInstrumentAttributes44.mmOptionType, SecurityInstrumentDescription1.mmOptionType, SecurityInstrumentDescription2.mmOptionType, FinancialInstrumentAttributes15.mmOptionType,
					FinancialInstrumentAttributes29.mmOptionType, OptionType5Choice.mmCode, OptionType5Choice.mmProprietary, Option7.mmOptionType, FinancialInstrumentAttributes2.mmOptionType, Option12.mmType, Option10.mmOptionType,
					FinancialInstrumentAttributes63.mmOptionType, FinancialInstrumentAttributes64.mmOptionType, OptionType6Choice.mmCode, OptionType6Choice.mmProprietary, FinancialInstrumentAttributes75.mmOptionType,
					FinancialInstrumentAttributes78.mmOptionType, OptionType7Choice.mmCode, OptionType7Choice.mmProprietary, Option13.mmOptionType, OptionType8Choice.mmCode, OptionType8Choice.mmProprietary,
					DerivativeInstrument5.mmOptionType, DerivativeInstrument6.mmOptionType, OptionOrSwaption6.mmOptionType, Option14.mmOptionType, OptionEvent2.mmType, FinancialInstrumentAttributes91.mmOptionType,
					FinancialInstrumentAttributes92.mmOptionType, FinancialInstrumentAttributes95.mmOptionType, FinancialInstrumentAttributes97.mmOptionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionDefinitionTypeCode.mmObject();
		}

		@Override
		public OptionDefinitionTypeCode getValue(Option obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(Option obj, OptionDefinitionTypeCode value) {
			obj.setOptionType(value);
		}
	};
	protected Number strikeValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikeValue
	 * Option1.mmStrikeValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmStrikeValue
	 * Option7.mmStrikeValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option13#mmStrikeValue
	 * Option13.mmStrikeValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Number> mmStrikeValue = new MMBusinessAttribute<Option, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(Option1.mmStrikeValue, Option7.mmStrikeValue, Option13.mmStrikeValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikeValue";
			definition = "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Option obj) {
			return obj.getStrikeValue();
		}

		@Override
		public void setValue(Option obj, Number value) {
			obj.setStrikeValue(value);
		}
	};
	protected Max35Text settlementPeriodType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPeriodType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how settlement will take place for instance at expiration or at hit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Option, Max35Text> mmSettlementPeriodType = new MMBusinessAttribute<Option, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementPeriodType";
			definition = "Specifies how settlement will take place for instance at expiration or at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Option obj) {
			return obj.getSettlementPeriodType();
		}

		@Override
		public void setValue(Option obj, Max35Text value) {
			obj.setSettlementPeriodType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Option";
				definition = "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
				associationDomain_lazy = () -> Arrays.asList(Price.mmOption, SecuritiesConversion.mmRelatedOption, com.tools20022.repository.entity.CurrencyOption.mmOptionDefinition,
						com.tools20022.repository.entity.SecuritiesOptionTrade.mmOption);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentProperties1Choice.mmOption, UnsecuredMarketTransaction1.mmCallPutOption, UnsecuredMarketTransaction2.mmCallPutOption,
						UnsecuredMarketTransaction3.mmCallPutOption, UnsecuredMarketTransaction4.mmCallPutOption, TradeTransaction15.mmOption, TradeTransaction17.mmOption, TradeTransaction14.mmOption, TradeTransaction18.mmOption,
						TradeTransaction16.mmOption, Option14.mmEventType, Derivative3.mmOptionAttributes);
				superType_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Option.mmInstrumentAssignmentMethod, com.tools20022.repository.entity.Option.mmSettleStyle, com.tools20022.repository.entity.Option.mmStandardisation,
						com.tools20022.repository.entity.Option.mmPositionLimit, com.tools20022.repository.entity.Option.mmUnderlyingType, com.tools20022.repository.entity.Option.mmCoverIndicator,
						com.tools20022.repository.entity.Option.mmOptionConversionInformation, com.tools20022.repository.entity.Option.mmOptionRatio, com.tools20022.repository.entity.Option.mmSecuritiesOptionTrade,
						com.tools20022.repository.entity.Option.mmSettlementType, com.tools20022.repository.entity.Option.mmStrikeMultiplier, com.tools20022.repository.entity.Option.mmExpiryLocation,
						com.tools20022.repository.entity.Option.mmFinalSettlementDate, com.tools20022.repository.entity.Option.mmOptionStyle, com.tools20022.repository.entity.Option.mmCurrencyOption,
						com.tools20022.repository.entity.Option.mmEarliestExerciseDate, com.tools20022.repository.entity.Option.mmSettlementDays, com.tools20022.repository.entity.Option.mmStrikePrice,
						com.tools20022.repository.entity.Option.mmOptionStartDate, com.tools20022.repository.entity.Option.mmExpiryDateAndTime, com.tools20022.repository.entity.Option.mmOptionType,
						com.tools20022.repository.entity.Option.mmStrikeValue, com.tools20022.repository.entity.Option.mmSettlementPeriodType);
				derivationComponent_lazy = () -> Arrays.asList(OptionStyle4Choice.mmObject(), OptionType1Choice.mmObject(), OptionType2Choice.mmObject(), OptionStyle5Choice.mmObject(), OptionType3Choice.mmObject(),
						OptionStyle1Choice.mmObject(), Option1.mmObject(), OptionStyle6Choice.mmObject(), OptionType4Choice.mmObject(), SettleStyle1Choice.mmObject(), OptionType5Choice.mmObject(), AssignmentMethod1Choice.mmObject(),
						Option7.mmObject(), OptionStyle2Choice.mmObject(), Option12.mmObject(), OptionDateOrPeriod1Choice.mmObject(), OptionStyle8Choice.mmObject(), OptionType6Choice.mmObject(), OptionStyle9Choice.mmObject(),
						OptionType7Choice.mmObject(), Option13.mmObject(), AssignmentMethod2Choice.mmObject(), OptionType8Choice.mmObject(), SettleStyle2Choice.mmObject(), OptionOrSwaption6.mmObject(), Option14.mmObject(),
						OptionEvent2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Option.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AssignmentMethodCode getInstrumentAssignmentMethod() {
		return instrumentAssignmentMethod;
	}

	public Option setInstrumentAssignmentMethod(AssignmentMethodCode instrumentAssignmentMethod) {
		this.instrumentAssignmentMethod = Objects.requireNonNull(instrumentAssignmentMethod);
		return this;
	}

	public SettleStyleCode getSettleStyle() {
		return settleStyle;
	}

	public Option setSettleStyle(SettleStyleCode settleStyle) {
		this.settleStyle = Objects.requireNonNull(settleStyle);
		return this;
	}

	public StandardisationCode getStandardisation() {
		return standardisation;
	}

	public Option setStandardisation(StandardisationCode standardisation) {
		this.standardisation = Objects.requireNonNull(standardisation);
		return this;
	}

	public Number getPositionLimit() {
		return positionLimit;
	}

	public Option setPositionLimit(Number positionLimit) {
		this.positionLimit = Objects.requireNonNull(positionLimit);
		return this;
	}

	public UnderlyingTypeCode getUnderlyingType() {
		return underlyingType;
	}

	public Option setUnderlyingType(UnderlyingTypeCode underlyingType) {
		this.underlyingType = Objects.requireNonNull(underlyingType);
		return this;
	}

	public YesNoIndicator getCoverIndicator() {
		return coverIndicator;
	}

	public Option setCoverIndicator(YesNoIndicator coverIndicator) {
		this.coverIndicator = Objects.requireNonNull(coverIndicator);
		return this;
	}

	public List<SecuritiesConversion> getOptionConversionInformation() {
		return optionConversionInformation == null ? optionConversionInformation = new ArrayList<>() : optionConversionInformation;
	}

	public Option setOptionConversionInformation(List<SecuritiesConversion> optionConversionInformation) {
		this.optionConversionInformation = Objects.requireNonNull(optionConversionInformation);
		return this;
	}

	public PercentageRate getOptionRatio() {
		return optionRatio;
	}

	public Option setOptionRatio(PercentageRate optionRatio) {
		this.optionRatio = Objects.requireNonNull(optionRatio);
		return this;
	}

	public SecuritiesOptionTrade getSecuritiesOptionTrade() {
		return securitiesOptionTrade;
	}

	public Option setSecuritiesOptionTrade(com.tools20022.repository.entity.SecuritiesOptionTrade securitiesOptionTrade) {
		this.securitiesOptionTrade = Objects.requireNonNull(securitiesOptionTrade);
		return this;
	}

	public SettlementTypeCode getSettlementType() {
		return settlementType;
	}

	public Option setSettlementType(SettlementTypeCode settlementType) {
		this.settlementType = Objects.requireNonNull(settlementType);
		return this;
	}

	public Number getStrikeMultiplier() {
		return strikeMultiplier;
	}

	public Option setStrikeMultiplier(Number strikeMultiplier) {
		this.strikeMultiplier = Objects.requireNonNull(strikeMultiplier);
		return this;
	}

	public Max4AlphaNumericText getExpiryLocation() {
		return expiryLocation;
	}

	public Option setExpiryLocation(Max4AlphaNumericText expiryLocation) {
		this.expiryLocation = Objects.requireNonNull(expiryLocation);
		return this;
	}

	public ISODate getFinalSettlementDate() {
		return finalSettlementDate;
	}

	public Option setFinalSettlementDate(ISODate finalSettlementDate) {
		this.finalSettlementDate = Objects.requireNonNull(finalSettlementDate);
		return this;
	}

	public OptionStyleCode getOptionStyle() {
		return optionStyle;
	}

	public Option setOptionStyle(OptionStyleCode optionStyle) {
		this.optionStyle = Objects.requireNonNull(optionStyle);
		return this;
	}

	public List<CurrencyOption> getCurrencyOption() {
		return currencyOption == null ? currencyOption = new ArrayList<>() : currencyOption;
	}

	public Option setCurrencyOption(List<com.tools20022.repository.entity.CurrencyOption> currencyOption) {
		this.currencyOption = Objects.requireNonNull(currencyOption);
		return this;
	}

	public ISODateTime getEarliestExerciseDate() {
		return earliestExerciseDate;
	}

	public Option setEarliestExerciseDate(ISODateTime earliestExerciseDate) {
		this.earliestExerciseDate = Objects.requireNonNull(earliestExerciseDate);
		return this;
	}

	public Number getSettlementDays() {
		return settlementDays;
	}

	public Option setSettlementDays(Number settlementDays) {
		this.settlementDays = Objects.requireNonNull(settlementDays);
		return this;
	}

	public Price getStrikePrice() {
		return strikePrice;
	}

	public Option setStrikePrice(Price strikePrice) {
		this.strikePrice = Objects.requireNonNull(strikePrice);
		return this;
	}

	public ISODateTime getOptionStartDate() {
		return optionStartDate;
	}

	public Option setOptionStartDate(ISODateTime optionStartDate) {
		this.optionStartDate = Objects.requireNonNull(optionStartDate);
		return this;
	}

	public ISODateTime getExpiryDateAndTime() {
		return expiryDateAndTime;
	}

	public Option setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = Objects.requireNonNull(expiryDateAndTime);
		return this;
	}

	public OptionDefinitionTypeCode getOptionType() {
		return optionType;
	}

	public Option setOptionType(OptionDefinitionTypeCode optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public Number getStrikeValue() {
		return strikeValue;
	}

	public Option setStrikeValue(Number strikeValue) {
		this.strikeValue = Objects.requireNonNull(strikeValue);
		return this;
	}

	public Max35Text getSettlementPeriodType() {
		return settlementPeriodType;
	}

	public Option setSettlementPeriodType(Max35Text settlementPeriodType) {
		this.settlementPeriodType = Objects.requireNonNull(settlementPeriodType);
		return this;
	}
}