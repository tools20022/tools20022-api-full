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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AgreedRate3;
import com.tools20022.repository.msg.AmountsAndValueDate4;
import com.tools20022.repository.msg.PremiumAmount3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * List of elements which provide the parameters of an option trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmData
 * Option10.mmData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmExerciseStatus
 * Option10.mmExerciseStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmExerciseStyle
 * Option10.mmExerciseStyle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmOptionType
 * Option10.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option10#mmDerivativeOptionIdentification
 * Option10.mmDerivativeOptionIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmOptionPayoutType
 * Option10.mmOptionPayoutType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmValuationRate
 * Option10.mmValuationRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmStrikePrice
 * Option10.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmVolatilityMargin
 * Option10.mmVolatilityMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmRiskAmount
 * Option10.mmRiskAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmExpiryDateAndTime
 * Option10.mmExpiryDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmExpiryLocation
 * Option10.mmExpiryLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmSettlementType
 * Option10.mmSettlementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmOptionAmounts
 * Option10.mmOptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmPremium
 * Option10.mmPremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option10#mmSettlementAmountType
 * Option10.mmSettlementAmountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option10#mmAdditionalOptionInformation
 * Option10.mmAdditionalOptionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyOption
 * CurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Option10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of elements which provide the parameters of an option trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule#forOption10
 * ConstraintEarliestExerciseDateRule.forOption10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Option3 Option3}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Option10", propOrder = {"data", "exerciseStatus", "exerciseStyle", "optionType", "derivativeOptionIdentification", "optionPayoutType", "valuationRate", "strikePrice", "volatilityMargin", "riskAmount", "expiryDateAndTime",
		"expiryLocation", "settlementType", "optionAmounts", "premium", "settlementAmountType", "additionalOptionInformation"})
public class Option10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Data", required = true)
	protected DataType1Code data;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataType1Code
	 * DataType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Data"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Data"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of data to indicate whether a trade is an option or resulted by an option exercise."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, DataType1Code> mmData = new MMMessageAttribute<Option10, DataType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "Data";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Data";
			definition = "Type of data to indicate whether a trade is an option or resulted by an option exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataType1Code.mmObject();
		}

		@Override
		public DataType1Code getValue(Option10 obj) {
			return obj.getData();
		}

		@Override
		public void setValue(Option10 obj, DataType1Code value) {
			obj.setData(value);
		}
	};
	@XmlElement(name = "ExrcSts", required = true)
	protected DerivativeExerciseStatus1Code exerciseStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code
	 * DerivativeExerciseStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExerciseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the exercise status of the option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, DerivativeExerciseStatus1Code> mmExerciseStatus = new MMMessageAttribute<Option10, DerivativeExerciseStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "ExrcSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExerciseStatus";
			definition = "Specifies the exercise status of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DerivativeExerciseStatus1Code.mmObject();
		}

		@Override
		public DerivativeExerciseStatus1Code getValue(Option10 obj) {
			return obj.getExerciseStatus();
		}

		@Override
		public void setValue(Option10 obj, DerivativeExerciseStatus1Code value) {
			obj.setExerciseStatus(value);
		}
	};
	@XmlElement(name = "ExrcStyle", required = true)
	protected OptionStyle2Code exerciseStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyle2Code
	 * OptionStyle2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcStyle"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExerciseStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines how an option can be exercised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmExerciseStyle
	 * Option3.mmExerciseStyle}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, OptionStyle2Code> mmExerciseStyle = new MMMessageAttribute<Option10, OptionStyle2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "ExrcStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExerciseStyle";
			definition = "Defines how an option can be exercised.";
			previousVersion_lazy = () -> Option3.mmExerciseStyle;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyle2Code.mmObject();
		}

		@Override
		public OptionStyle2Code getValue(Option10 obj) {
			return obj.getExerciseStyle();
		}

		@Override
		public void setValue(Option10 obj, OptionStyle2Code value) {
			obj.setExerciseStyle(value);
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected OptionType1Code optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionType1Code
	 * OptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionType
	 * Option.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice of format for option type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, OptionType1Code> mmOptionType = new MMMessageAttribute<Option10, OptionType1Code>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Choice of format for option type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionType1Code.mmObject();
		}

		@Override
		public OptionType1Code getValue(Option10 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(Option10 obj, OptionType1Code value) {
			obj.setOptionType(value);
		}
	};
	@XmlElement(name = "DerivOptnId", required = true)
	protected Max35Text derivativeOptionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivOptnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeOptionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the derivative option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, Max35Text> mmDerivativeOptionIdentification = new MMMessageAttribute<Option10, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "DerivOptnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeOptionIdentification";
			definition = "Identifies the derivative option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Option10 obj) {
			return obj.getDerivativeOptionIdentification();
		}

		@Override
		public void setValue(Option10 obj, Max35Text value) {
			obj.setDerivativeOptionIdentification(value);
		}
	};
	@XmlElement(name = "OptnPyoutTp", required = true)
	protected OptionPayoutType1Code optionPayoutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code
	 * OptionPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnPyoutTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionPayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of payout that will result from an in-the-money option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, OptionPayoutType1Code> mmOptionPayoutType = new MMMessageAttribute<Option10, OptionPayoutType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "OptnPyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionPayoutType";
			definition = "Indicates the type of payout that will result from an in-the-money option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionPayoutType1Code.mmObject();
		}

		@Override
		public OptionPayoutType1Code getValue(Option10 obj) {
			return obj.getOptionPayoutType();
		}

		@Override
		public void setValue(Option10 obj, OptionPayoutType1Code value) {
			obj.setOptionPayoutType(value);
		}
	};
	@XmlElement(name = "ValtnRate", required = true)
	protected AgreedRate3 valuationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreedRate3
	 * AgreedRate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmValueDate
	 * Trade.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the valuation rate used for the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option10, AgreedRate3> mmValuationRate = new MMMessageAssociationEnd<Option10, AgreedRate3>() {
		{
			businessElementTrace_lazy = () -> Trade.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "ValtnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationRate";
			definition = "Specifies the valuation rate used for the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgreedRate3.mmObject();
		}

		@Override
		public AgreedRate3 getValue(Option10 obj) {
			return obj.getValuationRate();
		}

		@Override
		public void setValue(Option10 obj, AgreedRate3 value) {
			obj.setValuationRate(value);
		}
	};
	@XmlElement(name = "StrkPric", required = true)
	protected AgreedRate3 strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreedRate3
	 * AgreedRate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the rate of exchange at which the foreign exchange option has been struck."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmStrikePrice
	 * Option3.mmStrikePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option10, AgreedRate3> mmStrikePrice = new MMMessageAssociationEnd<Option10, AgreedRate3>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Specifies the rate of exchange at which the foreign exchange option has been struck.";
			previousVersion_lazy = () -> Option3.mmStrikePrice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgreedRate3.mmObject();
		}

		@Override
		public AgreedRate3 getValue(Option10 obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(Option10 obj, AgreedRate3 value) {
			obj.setStrikePrice(value);
		}
	};
	@XmlElement(name = "VoltlyMrgn", required = true)
	protected PercentageRate volatilityMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoltlyMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Annualized volatility for option model calculations."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, PercentageRate> mmVolatilityMargin = new MMMessageAttribute<Option10, PercentageRate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "VoltlyMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityMargin";
			definition = "Annualized volatility for option model calculations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Option10 obj) {
			return obj.getVolatilityMargin();
		}

		@Override
		public void setValue(Option10 obj, PercentageRate value) {
			obj.setVolatilityMargin(value);
		}
	};
	@XmlElement(name = "RskAmt", required = true)
	protected ActiveCurrencyAndAmount riskAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measurement of the amount of the trade values converted in the US dollars."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, ActiveCurrencyAndAmount> mmRiskAmount = new MMMessageAttribute<Option10, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "RskAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskAmount";
			definition = "Measurement of the amount of the trade values converted in the US dollars.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Option10 obj) {
			return obj.getRiskAmount();
		}

		@Override
		public void setValue(Option10 obj, ActiveCurrencyAndAmount value) {
			obj.setRiskAmount(value);
		}
	};
	@XmlElement(name = "XpryDtAndTm", required = true)
	protected ISODateTime expiryDateAndTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmExpiryDateAndTime
	 * Option.mmExpiryDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtAndTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a privilege (for example, option, right, warrant.) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmExpiryDateAndTime
	 * Option3.mmExpiryDateAndTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, ISODateTime> mmExpiryDateAndTime = new MMMessageAttribute<Option10, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryDateAndTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "XpryDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "Date on which a privilege (for example, option, right, warrant.) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date.";
			previousVersion_lazy = () -> Option3.mmExpiryDateAndTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option10 obj) {
			return obj.getExpiryDateAndTime();
		}

		@Override
		public void setValue(Option10 obj, ISODateTime value) {
			obj.setExpiryDateAndTime(value);
		}
	};
	@XmlElement(name = "XpryLctn", required = true)
	protected Max4AlphaNumericText expiryLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmExpiryLocation
	 * Option.mmExpiryLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryLctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial center where option expires."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmExpiryLocation
	 * Option3.mmExpiryLocation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, Max4AlphaNumericText> mmExpiryLocation = new MMMessageAttribute<Option10, Max4AlphaNumericText>() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "XpryLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			previousVersion_lazy = () -> Option3.mmExpiryLocation;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Option10 obj) {
			return obj.getExpiryLocation();
		}

		@Override
		public void setValue(Option10 obj, Max4AlphaNumericText value) {
			obj.setExpiryLocation(value);
		}
	};
	@XmlElement(name = "SttlmTp", required = true)
	protected SettlementDateCode settlementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the settlment period of the option trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, SettlementDateCode> mmSettlementType = new MMMessageAttribute<Option10, SettlementDateCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "SttlmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementType";
			definition = "Specifies the settlment period of the option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementDateCode.mmObject();
		}

		@Override
		public SettlementDateCode getValue(Option10 obj) {
			return obj.getSettlementType();
		}

		@Override
		public void setValue(Option10 obj, SettlementDateCode value) {
			obj.setSettlementType(value);
		}
	};
	@XmlElement(name = "OptnAmts", required = true)
	protected AmountsAndValueDate4 optionAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountsAndValueDate4
	 * AmountsAndValueDate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnAmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the call and the put amount of the underlying foreign exchange trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmOptionAmounts
	 * Option3.mmOptionAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option10, AmountsAndValueDate4> mmOptionAmounts = new MMMessageAssociationEnd<Option10, AmountsAndValueDate4>() {
		{
			businessComponentTrace_lazy = () -> ForeignExchangeTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "OptnAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAmounts";
			definition = "Specifies the call and the put amount of the underlying foreign exchange trade.";
			previousVersion_lazy = () -> Option3.mmOptionAmounts;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountsAndValueDate4.mmObject();
		}

		@Override
		public AmountsAndValueDate4 getValue(Option10 obj) {
			return obj.getOptionAmounts();
		}

		@Override
		public void setValue(Option10 obj, AmountsAndValueDate4 value) {
			obj.setOptionAmounts(value);
		}
	};
	@XmlElement(name = "Prm", required = true)
	protected PremiumAmount3 premium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PremiumAmount3
	 * PremiumAmount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of the premium of a foreign exchange option trade and its settlement place."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmPremium
	 * Option3.mmPremium}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option10, PremiumAmount3> mmPremium = new MMMessageAssociationEnd<Option10, PremiumAmount3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "Prm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			definition = "Specifies the amount of the premium of a foreign exchange option trade and its settlement place.";
			previousVersion_lazy = () -> Option3.mmPremium;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PremiumAmount3.mmObject();
		}

		@Override
		public PremiumAmount3 getValue(Option10 obj) {
			return obj.getPremium();
		}

		@Override
		public void setValue(Option10 obj, PremiumAmount3 value) {
			obj.setPremium(value);
		}
	};
	@XmlElement(name = "SttlmAmtTp", required = true)
	protected SettlementType1Code settlementAmountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementType1Code
	 * SettlementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is to be settled as principal or netted off against another trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, SettlementType1Code> mmSettlementAmountType = new MMMessageAttribute<Option10, SettlementType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementType1Code.mmObject();
		}

		@Override
		public SettlementType1Code getValue(Option10 obj) {
			return obj.getSettlementAmountType();
		}

		@Override
		public void setValue(Option10 obj, SettlementType1Code value) {
			obj.setSettlementAmountType(value);
		}
	};
	@XmlElement(name = "AddtlOptnInf", required = true)
	protected Max140Text additionalOptionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlOptnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalOptionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free format text that may contain information on the option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmAdditionalOptionInformation
	 * Option3.mmAdditionalOptionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option10, Max140Text> mmAdditionalOptionInformation = new MMMessageAttribute<Option10, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option10.mmObject();
			isDerived = false;
			xmlTag = "AddtlOptnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalOptionInformation";
			definition = "Free format text that may contain information on the option.";
			previousVersion_lazy = () -> Option3.mmAdditionalOptionInformation;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Option10 obj) {
			return obj.getAdditionalOptionInformation();
		}

		@Override
		public void setValue(Option10 obj, Max140Text value) {
			obj.setAdditionalOptionInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option10.mmData, com.tools20022.repository.msg.Option10.mmExerciseStatus, com.tools20022.repository.msg.Option10.mmExerciseStyle,
						com.tools20022.repository.msg.Option10.mmOptionType, com.tools20022.repository.msg.Option10.mmDerivativeOptionIdentification, com.tools20022.repository.msg.Option10.mmOptionPayoutType,
						com.tools20022.repository.msg.Option10.mmValuationRate, com.tools20022.repository.msg.Option10.mmStrikePrice, com.tools20022.repository.msg.Option10.mmVolatilityMargin,
						com.tools20022.repository.msg.Option10.mmRiskAmount, com.tools20022.repository.msg.Option10.mmExpiryDateAndTime, com.tools20022.repository.msg.Option10.mmExpiryLocation,
						com.tools20022.repository.msg.Option10.mmSettlementType, com.tools20022.repository.msg.Option10.mmOptionAmounts, com.tools20022.repository.msg.Option10.mmPremium,
						com.tools20022.repository.msg.Option10.mmSettlementAmountType, com.tools20022.repository.msg.Option10.mmAdditionalOptionInformation);
				trace_lazy = () -> CurrencyOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule.forOption10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Option10";
				definition = "List of elements which provide the parameters of an option trade.";
				previousVersion_lazy = () -> Option3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataType1Code getData() {
		return data;
	}

	public Option10 setData(DataType1Code data) {
		this.data = Objects.requireNonNull(data);
		return this;
	}

	public DerivativeExerciseStatus1Code getExerciseStatus() {
		return exerciseStatus;
	}

	public Option10 setExerciseStatus(DerivativeExerciseStatus1Code exerciseStatus) {
		this.exerciseStatus = Objects.requireNonNull(exerciseStatus);
		return this;
	}

	public OptionStyle2Code getExerciseStyle() {
		return exerciseStyle;
	}

	public Option10 setExerciseStyle(OptionStyle2Code exerciseStyle) {
		this.exerciseStyle = Objects.requireNonNull(exerciseStyle);
		return this;
	}

	public OptionType1Code getOptionType() {
		return optionType;
	}

	public Option10 setOptionType(OptionType1Code optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public Max35Text getDerivativeOptionIdentification() {
		return derivativeOptionIdentification;
	}

	public Option10 setDerivativeOptionIdentification(Max35Text derivativeOptionIdentification) {
		this.derivativeOptionIdentification = Objects.requireNonNull(derivativeOptionIdentification);
		return this;
	}

	public OptionPayoutType1Code getOptionPayoutType() {
		return optionPayoutType;
	}

	public Option10 setOptionPayoutType(OptionPayoutType1Code optionPayoutType) {
		this.optionPayoutType = Objects.requireNonNull(optionPayoutType);
		return this;
	}

	public AgreedRate3 getValuationRate() {
		return valuationRate;
	}

	public Option10 setValuationRate(AgreedRate3 valuationRate) {
		this.valuationRate = Objects.requireNonNull(valuationRate);
		return this;
	}

	public AgreedRate3 getStrikePrice() {
		return strikePrice;
	}

	public Option10 setStrikePrice(AgreedRate3 strikePrice) {
		this.strikePrice = Objects.requireNonNull(strikePrice);
		return this;
	}

	public PercentageRate getVolatilityMargin() {
		return volatilityMargin;
	}

	public Option10 setVolatilityMargin(PercentageRate volatilityMargin) {
		this.volatilityMargin = Objects.requireNonNull(volatilityMargin);
		return this;
	}

	public ActiveCurrencyAndAmount getRiskAmount() {
		return riskAmount;
	}

	public Option10 setRiskAmount(ActiveCurrencyAndAmount riskAmount) {
		this.riskAmount = Objects.requireNonNull(riskAmount);
		return this;
	}

	public ISODateTime getExpiryDateAndTime() {
		return expiryDateAndTime;
	}

	public Option10 setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = Objects.requireNonNull(expiryDateAndTime);
		return this;
	}

	public Max4AlphaNumericText getExpiryLocation() {
		return expiryLocation;
	}

	public Option10 setExpiryLocation(Max4AlphaNumericText expiryLocation) {
		this.expiryLocation = Objects.requireNonNull(expiryLocation);
		return this;
	}

	public SettlementDateCode getSettlementType() {
		return settlementType;
	}

	public Option10 setSettlementType(SettlementDateCode settlementType) {
		this.settlementType = Objects.requireNonNull(settlementType);
		return this;
	}

	public AmountsAndValueDate4 getOptionAmounts() {
		return optionAmounts;
	}

	public Option10 setOptionAmounts(AmountsAndValueDate4 optionAmounts) {
		this.optionAmounts = Objects.requireNonNull(optionAmounts);
		return this;
	}

	public PremiumAmount3 getPremium() {
		return premium;
	}

	public Option10 setPremium(PremiumAmount3 premium) {
		this.premium = Objects.requireNonNull(premium);
		return this;
	}

	public SettlementType1Code getSettlementAmountType() {
		return settlementAmountType;
	}

	public Option10 setSettlementAmountType(SettlementType1Code settlementAmountType) {
		this.settlementAmountType = Objects.requireNonNull(settlementAmountType);
		return this;
	}

	public Max140Text getAdditionalOptionInformation() {
		return additionalOptionInformation;
	}

	public Option10 setAdditionalOptionInformation(Max140Text additionalOptionInformation) {
		this.additionalOptionInformation = Objects.requireNonNull(additionalOptionInformation);
		return this;
	}
}