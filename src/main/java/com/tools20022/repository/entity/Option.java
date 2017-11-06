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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected AssignmentMethodCode instrumentAssignmentMethod;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInstrumentAssignmentMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmInstrumentAssignmentMethod, com.tools20022.repository.choice.AssignmentMethod1Choice.mmCode,
					com.tools20022.repository.choice.AssignmentMethod1Choice.mmProprietary, com.tools20022.repository.msg.Option7.mmInstrumentAssignmentMethod);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstrumentAssignmentMethod";
			definition = "Method under which assignment was conducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssignmentMethodCode.mmObject();
		}
	};
	protected SettleStyleCode settleStyle;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSettleStyle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmSettleStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmSettleStyle, com.tools20022.repository.choice.SettleStyle1Choice.mmCode,
					com.tools20022.repository.choice.SettleStyle1Choice.mmProprietary, com.tools20022.repository.msg.Option7.mmOptionSettlementStyle);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettleStyle";
			definition = "Specifies whether the option contract settles at the open or close of the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettleStyleCode.mmObject();
		}
	};
	protected StandardisationCode standardisation;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStandardisation
	 * Option1.mmStandardisation}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStandardisation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmStandardisation);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}
	};
	protected Number positionLimit;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	public static final MMBusinessAttribute mmPositionLimit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.mmPositionLimit, com.tools20022.repository.msg.FutureOrOptionDetails1.mmPositionLimit);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected UnderlyingTypeCode underlyingType;
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
	public static final MMBusinessAttribute mmUnderlyingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}
	};
	protected YesNoIndicator coverIndicator;
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
	public static final MMBusinessAttribute mmCoverIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverIndicator";
			definition = "Indicates whether the underlying financial instrument of an option is owned by the writer of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesConversion> optionConversionInformation;
	/**
	 * Information on the conversion exchange of an option into another form of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmRelatedOption
	 * SecuritiesConversion.mmRelatedOption}</li>
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
	public static final MMBusinessAssociationEnd mmOptionConversionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionConversionInformation";
			definition = "Information on the conversion exchange of an option into another form of securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmRelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected PercentageRate optionRatio;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	public static final MMBusinessAttribute mmOptionRatio = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstrumentLeg2.mmLegOptionRatio, com.tools20022.repository.msg.InstrumentLeg3.mmLegOptionRatio);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionRatio";
			definition = "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected SecuritiesOptionTrade securitiesOptionTrade;
	/**
	 * Specifies the trade elements for the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#mmOption
	 * SecuritiesOptionTrade.mmOption}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesOptionTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOptionTrade";
			definition = "Specifies the trade elements for the option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmObject();
		}
	};
	protected SettlementTypeCode settlementType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSettlementType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingAttributes.mmSettlementType, com.tools20022.repository.msg.Option2.mmSettlementType, com.tools20022.repository.msg.Option3.mmSettlementType,
					com.tools20022.repository.msg.UnderlyingAttributes2.mmSettlementType, com.tools20022.repository.msg.Option4.mmSettlementType, com.tools20022.repository.msg.Option5.mmSettlementType,
					com.tools20022.repository.msg.Option6.mmSettlementType);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTypeCode.mmObject();
		}
	};
	protected Number strikeMultiplier;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikeMultiplier
	 * Option1.mmStrikeMultiplier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmStrikeMultiplier
	 * Option7.mmStrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmPriceMultiplier
	 * DerivativeInstrument5.mmPriceMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmPriceMultiplier
	 * DerivativeInstrument6.mmPriceMultiplier}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStrikeMultiplier = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmStrikeMultiplier, com.tools20022.repository.msg.Option7.mmStrikeMultiplier, com.tools20022.repository.msg.DerivativeInstrument5.mmPriceMultiplier,
					com.tools20022.repository.msg.DerivativeInstrument6.mmPriceMultiplier);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeMultiplier";
			definition = "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max4AlphaNumericText expiryLocation;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmExpiryLocation = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmExpiryLocation, com.tools20022.repository.msg.Option2.mmExpiryLocation, com.tools20022.repository.msg.Option3.mmExpiryLocation,
					com.tools20022.repository.msg.Option7.mmExpiryLocation, com.tools20022.repository.msg.Option4.mmExpiryLocation, com.tools20022.repository.msg.Option5.mmExpiryLocation,
					com.tools20022.repository.msg.Option6.mmExpiryLocation, com.tools20022.repository.msg.Option10.mmExpiryLocation);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected ISODate finalSettlementDate;
	/**
	 * Date on which the trade is settled. i.e., the amounts are due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	public static final MMBusinessAttribute mmFinalSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate2.mmFinalSettlementDate, com.tools20022.repository.msg.AmountsAndValueDate3.mmFinalSettlementDate,
					com.tools20022.repository.msg.AmountsAndValueDate4.mmFinalSettlementDate, com.tools20022.repository.msg.AmountsAndValueDate5.mmFinalSettlementDate);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled. i.e., the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected OptionStyleCode optionStyle;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOptionStyle = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OptionStyle4Choice.mmCode, com.tools20022.repository.choice.OptionStyle4Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes20.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.mmOptionStyle, com.tools20022.repository.choice.OptionStyle5Choice.mmCode, com.tools20022.repository.choice.OptionStyle5Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes41.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes7.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes5.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes11.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes10.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes19.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes16.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes23.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes33.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes34.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes39.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes40.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes43.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes4.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes21.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes27.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes30.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.mmOptionStyle, com.tools20022.repository.choice.OptionStyle1Choice.mmCode, com.tools20022.repository.choice.OptionStyle1Choice.mmProprietary,
					com.tools20022.repository.msg.Option1.mmOptionStyle, com.tools20022.repository.choice.OptionStyle6Choice.mmCode, com.tools20022.repository.choice.OptionStyle6Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes44.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.mmOptionStyle, com.tools20022.repository.msg.Option2.mmExerciseStyle, com.tools20022.repository.msg.Option3.mmExerciseStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.mmOptionStyle, com.tools20022.repository.msg.Option7.mmOptionStyle, com.tools20022.repository.choice.OptionStyle2Choice.mmCode,
					com.tools20022.repository.choice.OptionStyle2Choice.mmProprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes2.mmOptionStyle, com.tools20022.repository.msg.Option4.mmExerciseStyle,
					com.tools20022.repository.msg.Option5.mmExerciseStyle, com.tools20022.repository.msg.Option6.mmExerciseStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes48.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes55.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.mmOptionStyle, com.tools20022.repository.choice.OptionStyle8Choice.mmCode, com.tools20022.repository.choice.OptionStyle8Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes64.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes67.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.mmOptionStyle, com.tools20022.repository.choice.OptionStyle9Choice.mmCode, com.tools20022.repository.choice.OptionStyle9Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes75.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.mmOptionStyle, com.tools20022.repository.msg.DerivativeInstrument5.mmOptionExerciseStyle,
					com.tools20022.repository.msg.DerivativeInstrument6.mmOptionExerciseStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes79.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes80.mmOptionStyle, com.tools20022.repository.msg.FinancialInstrumentAttributes85.mmOptionStyle,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.mmOptionStyle);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyOption> currencyOption;
	/**
	 * Information specific to a currency option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmOptionDefinition
	 * CurrencyOption.mmOptionDefinition}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Information specific to a currency option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmOptionDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}
	};
	protected ISODateTime earliestExerciseDate;
	/**
	 * First date on which an american option can be exercised.
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
	public static final MMBusinessAttribute mmEarliestExerciseDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.mmEarliestExerciseDate, com.tools20022.repository.msg.Option3.mmEarliestExerciseDate, com.tools20022.repository.msg.Option4.mmEarliestExerciseDate,
					com.tools20022.repository.msg.Option5.mmEarliestExerciseDate, com.tools20022.repository.msg.Option6.mmEarliestExerciseDate, com.tools20022.repository.choice.OptionDateOrPeriod1Choice.mmEarliestExerciseDate);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Number settlementDays;
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
	public static final MMBusinessAttribute mmSettlementDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDays";
			definition = "Number of business days between the hit date and the payment date in case of settlement at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Price strikePrice;
	/**
	 * Predetermined price at which the holder will have to buy or sell the
	 * underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Price#mmOption
	 * Price.mmOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmStrikePrice
	 * DerivativeInstrument5.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmStrikePrice
	 * DerivativeInstrument6.mmStrikePrice}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmStrikePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeInstrument5.mmStrikePrice, com.tools20022.repository.msg.DerivativeInstrument6.mmStrikePrice);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected ISODateTime optionStartDate;
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
	public static final MMBusinessAttribute mmOptionStartDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStartDate";
			definition = "First date on which an option becomes effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime expiryDateAndTime;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	public static final MMBusinessAttribute mmExpiryDateAndTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.mmExpiryDateAndTime, com.tools20022.repository.msg.Option3.mmExpiryDateAndTime, com.tools20022.repository.msg.Option4.mmExpiryDateAndTime,
					com.tools20022.repository.msg.Option5.mmExpiryDateAndTime, com.tools20022.repository.msg.Option6.mmExpiryDateAndTime, com.tools20022.repository.msg.Option10.mmExpiryDateAndTime);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected OptionDefinitionTypeCode optionType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmOptionType
	 * DerivativeInstrument5.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmOptionType
	 * DerivativeInstrument6.mmOptionType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOptionType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OptionType1Choice.mmCode, com.tools20022.repository.choice.OptionType1Choice.mmProprietary, com.tools20022.repository.choice.OptionType2Choice.mmCode,
					com.tools20022.repository.choice.OptionType2Choice.mmProprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes8.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes20.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.mmOptionType, com.tools20022.repository.choice.OptionType3Choice.mmCode, com.tools20022.repository.choice.OptionType3Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes41.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes4.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes21.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes36.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes27.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes30.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.mmOptionType, com.tools20022.repository.msg.Option1.mmOptionType, com.tools20022.repository.choice.OptionType4Choice.mmCode,
					com.tools20022.repository.choice.OptionType4Choice.mmProprietary, com.tools20022.repository.msg.FinancialInstrumentAttributes31.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes44.mmOptionType,
					com.tools20022.repository.msg.SecurityInstrumentDescription1.mmOptionType, com.tools20022.repository.msg.SecurityInstrumentDescription2.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes29.mmOptionType, com.tools20022.repository.choice.OptionType5Choice.mmCode,
					com.tools20022.repository.choice.OptionType5Choice.mmProprietary, com.tools20022.repository.msg.Option7.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes2.mmOptionType,
					com.tools20022.repository.msg.Option12.mmType, com.tools20022.repository.msg.Option10.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes63.mmOptionType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.mmOptionType, com.tools20022.repository.choice.OptionType6Choice.mmCode, com.tools20022.repository.choice.OptionType6Choice.mmProprietary,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.mmOptionType, com.tools20022.repository.msg.FinancialInstrumentAttributes78.mmOptionType, com.tools20022.repository.choice.OptionType7Choice.mmCode,
					com.tools20022.repository.choice.OptionType7Choice.mmProprietary, com.tools20022.repository.msg.DerivativeInstrument5.mmOptionType, com.tools20022.repository.msg.DerivativeInstrument6.mmOptionType);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionDefinitionTypeCode.mmObject();
		}
	};
	protected Number strikeValue;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikeValue
	 * Option1.mmStrikeValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmStrikeValue
	 * Option7.mmStrikeValue}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmStrikeValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmStrikeValue, com.tools20022.repository.msg.Option7.mmStrikeValue);
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeValue";
			definition = "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max35Text settlementPeriodType;
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
	public static final MMBusinessAttribute mmSettlementPeriodType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPeriodType";
			definition = "Specifies how settlement will take place for instance at expiration or at hit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Option";
				definition = "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.mmOption, com.tools20022.repository.entity.SecuritiesConversion.mmRelatedOption,
						com.tools20022.repository.entity.CurrencyOption.mmOptionDefinition, com.tools20022.repository.entity.SecuritiesOptionTrade.mmOption);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.mmOption, com.tools20022.repository.msg.UnsecuredMarketTransaction1.mmCallPutOption,
						com.tools20022.repository.msg.UnsecuredMarketTransaction2.mmCallPutOption, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmCallPutOption,
						com.tools20022.repository.msg.UnsecuredMarketTransaction4.mmCallPutOption);
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
						OptionType7Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AssignmentMethodCode getInstrumentAssignmentMethod() {
		return instrumentAssignmentMethod;
	}

	public void setInstrumentAssignmentMethod(AssignmentMethodCode instrumentAssignmentMethod) {
		this.instrumentAssignmentMethod = instrumentAssignmentMethod;
	}

	public SettleStyleCode getSettleStyle() {
		return settleStyle;
	}

	public void setSettleStyle(SettleStyleCode settleStyle) {
		this.settleStyle = settleStyle;
	}

	public StandardisationCode getStandardisation() {
		return standardisation;
	}

	public void setStandardisation(StandardisationCode standardisation) {
		this.standardisation = standardisation;
	}

	public Number getPositionLimit() {
		return positionLimit;
	}

	public void setPositionLimit(Number positionLimit) {
		this.positionLimit = positionLimit;
	}

	public UnderlyingTypeCode getUnderlyingType() {
		return underlyingType;
	}

	public void setUnderlyingType(UnderlyingTypeCode underlyingType) {
		this.underlyingType = underlyingType;
	}

	public YesNoIndicator getCoverIndicator() {
		return coverIndicator;
	}

	public void setCoverIndicator(YesNoIndicator coverIndicator) {
		this.coverIndicator = coverIndicator;
	}

	public List<SecuritiesConversion> getOptionConversionInformation() {
		return optionConversionInformation;
	}

	public void setOptionConversionInformation(List<com.tools20022.repository.entity.SecuritiesConversion> optionConversionInformation) {
		this.optionConversionInformation = optionConversionInformation;
	}

	public PercentageRate getOptionRatio() {
		return optionRatio;
	}

	public void setOptionRatio(PercentageRate optionRatio) {
		this.optionRatio = optionRatio;
	}

	public SecuritiesOptionTrade getSecuritiesOptionTrade() {
		return securitiesOptionTrade;
	}

	public void setSecuritiesOptionTrade(com.tools20022.repository.entity.SecuritiesOptionTrade securitiesOptionTrade) {
		this.securitiesOptionTrade = securitiesOptionTrade;
	}

	public SettlementTypeCode getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(SettlementTypeCode settlementType) {
		this.settlementType = settlementType;
	}

	public Number getStrikeMultiplier() {
		return strikeMultiplier;
	}

	public void setStrikeMultiplier(Number strikeMultiplier) {
		this.strikeMultiplier = strikeMultiplier;
	}

	public Max4AlphaNumericText getExpiryLocation() {
		return expiryLocation;
	}

	public void setExpiryLocation(Max4AlphaNumericText expiryLocation) {
		this.expiryLocation = expiryLocation;
	}

	public ISODate getFinalSettlementDate() {
		return finalSettlementDate;
	}

	public void setFinalSettlementDate(ISODate finalSettlementDate) {
		this.finalSettlementDate = finalSettlementDate;
	}

	public OptionStyleCode getOptionStyle() {
		return optionStyle;
	}

	public void setOptionStyle(OptionStyleCode optionStyle) {
		this.optionStyle = optionStyle;
	}

	public List<CurrencyOption> getCurrencyOption() {
		return currencyOption;
	}

	public void setCurrencyOption(List<com.tools20022.repository.entity.CurrencyOption> currencyOption) {
		this.currencyOption = currencyOption;
	}

	public ISODateTime getEarliestExerciseDate() {
		return earliestExerciseDate;
	}

	public void setEarliestExerciseDate(ISODateTime earliestExerciseDate) {
		this.earliestExerciseDate = earliestExerciseDate;
	}

	public Number getSettlementDays() {
		return settlementDays;
	}

	public void setSettlementDays(Number settlementDays) {
		this.settlementDays = settlementDays;
	}

	public Price getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(com.tools20022.repository.entity.Price strikePrice) {
		this.strikePrice = strikePrice;
	}

	public ISODateTime getOptionStartDate() {
		return optionStartDate;
	}

	public void setOptionStartDate(ISODateTime optionStartDate) {
		this.optionStartDate = optionStartDate;
	}

	public ISODateTime getExpiryDateAndTime() {
		return expiryDateAndTime;
	}

	public void setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = expiryDateAndTime;
	}

	public OptionDefinitionTypeCode getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionDefinitionTypeCode optionType) {
		this.optionType = optionType;
	}

	public Number getStrikeValue() {
		return strikeValue;
	}

	public void setStrikeValue(Number strikeValue) {
		this.strikeValue = strikeValue;
	}

	public Max35Text getSettlementPeriodType() {
		return settlementPeriodType;
	}

	public void setSettlementPeriodType(Max35Text settlementPeriodType) {
		this.settlementPeriodType = settlementPeriodType;
	}
}