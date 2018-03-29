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
import com.tools20022.repository.codeset.OptionStyle2Code;
import com.tools20022.repository.codeset.SettlementType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.CurrencyOption;
import com.tools20022.repository.entity.Option;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AgreedRate1;
import com.tools20022.repository.msg.AmountsAndValueDate2;
import com.tools20022.repository.msg.PremiumAmount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmOptionAmounts
 * Option2.mmOptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmStrikePrice
 * Option2.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmPremium
 * Option2.mmPremium}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmExerciseStyle
 * Option2.mmExerciseStyle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmEarliestExerciseDate
 * Option2.mmEarliestExerciseDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmExpiryDateAndTime
 * Option2.mmExpiryDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmExpiryLocation
 * Option2.mmExpiryLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option2#mmSettlementType
 * Option2.mmSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option2#mmAdditionalOptionInformation
 * Option2.mmAdditionalOptionInformation}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule#forOption2
 * ConstraintEarliestExerciseDateRule.forOption2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Option2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of elements which provide the parameters of an option trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Option2", propOrder = {"optionAmounts", "strikePrice", "premium", "exerciseStyle", "earliestExerciseDate", "expiryDateAndTime", "expiryLocation", "settlementType", "additionalOptionInformation"})
public class Option2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OptnAmts", required = true)
	protected AmountsAndValueDate2 optionAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountsAndValueDate2
	 * AmountsAndValueDate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the call and the put amount of the underlying foreign exchange trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option2, AmountsAndValueDate2> mmOptionAmounts = new MMMessageAssociationEnd<Option2, AmountsAndValueDate2>() {
		{
			businessComponentTrace_lazy = () -> CurrencyOption.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "OptnAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAmounts";
			definition = "Specifies the call and the put amount of the underlying foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountsAndValueDate2.mmObject();
		}

		@Override
		public AmountsAndValueDate2 getValue(Option2 obj) {
			return obj.getOptionAmounts();
		}

		@Override
		public void setValue(Option2 obj, AmountsAndValueDate2 value) {
			obj.setOptionAmounts(value);
		}
	};
	@XmlElement(name = "StrkPric", required = true)
	protected AgreedRate1 strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreedRate1
	 * AgreedRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmStrikeRate
	 * CurrencyOption.mmStrikeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the rate of exchange at which the foreign exchange option has been struck."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option2, AgreedRate1> mmStrikePrice = new MMMessageAssociationEnd<Option2, AgreedRate1>() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmStrikeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Specifies the rate of exchange at which the foreign exchange option has been struck.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AgreedRate1.mmObject();
		}

		@Override
		public AgreedRate1 getValue(Option2 obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(Option2 obj, AgreedRate1 value) {
			obj.setStrikePrice(value);
		}
	};
	@XmlElement(name = "Prm", required = true)
	protected PremiumAmount1 premium;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PremiumAmount1
	 * PremiumAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumCalculation
	 * CurrencyOption.mmPremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of the premium of a foreign exchange option trade and its settlement place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Option2, PremiumAmount1> mmPremium = new MMMessageAssociationEnd<Option2, PremiumAmount1>() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmPremiumCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "Prm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			definition = "Specifies the amount of the premium of a foreign exchange option trade and its settlement place.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PremiumAmount1.mmObject();
		}

		@Override
		public PremiumAmount1 getValue(Option2 obj) {
			return obj.getPremium();
		}

		@Override
		public void setValue(Option2 obj, PremiumAmount1 value) {
			obj.setPremium(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExerciseStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines how an option can be exercised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option2, OptionStyle2Code> mmExerciseStyle = new MMMessageAttribute<Option2, OptionStyle2Code>() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "ExrcStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExerciseStyle";
			definition = "Defines how an option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyle2Code.mmObject();
		}

		@Override
		public OptionStyle2Code getValue(Option2 obj) {
			return obj.getExerciseStyle();
		}

		@Override
		public void setValue(Option2 obj, OptionStyle2Code value) {
			obj.setExerciseStyle(value);
		}
	};
	@XmlElement(name = "EarlstExrcDt")
	protected ISODate earliestExerciseDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmEarliestExerciseDate
	 * Option.mmEarliestExerciseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstExrcDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an american option can be exercised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option2, Optional<ISODate>> mmEarliestExerciseDate = new MMMessageAttribute<Option2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Option.mmEarliestExerciseDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "EarlstExrcDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Option2 obj) {
			return obj.getEarliestExerciseDate();
		}

		@Override
		public void setValue(Option2 obj, Optional<ISODate> value) {
			obj.setEarliestExerciseDate(value.orElse(null));
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a privilege (eg, option, right, warrant.) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option2, ISODateTime> mmExpiryDateAndTime = new MMMessageAttribute<Option2, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryDateAndTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "XpryDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "Date on which a privilege (eg, option, right, warrant.) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Option2 obj) {
			return obj.getExpiryDateAndTime();
		}

		@Override
		public void setValue(Option2 obj, ISODateTime value) {
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial center where option expires."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option2, Max4AlphaNumericText> mmExpiryLocation = new MMMessageAttribute<Option2, Max4AlphaNumericText>() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "XpryLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Option2 obj) {
			return obj.getExpiryLocation();
		}

		@Override
		public void setValue(Option2 obj, Max4AlphaNumericText value) {
			obj.setExpiryLocation(value);
		}
	};
	@XmlElement(name = "SttlmTp", required = true)
	protected SettlementType1Code settlementType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmSettlementType
	 * Option.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is to be settled as principal or netted off against another trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option2, SettlementType1Code> mmSettlementType = new MMMessageAttribute<Option2, SettlementType1Code>() {
		{
			businessElementTrace_lazy = () -> Option.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "SttlmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementType1Code.mmObject();
		}

		@Override
		public SettlementType1Code getValue(Option2 obj) {
			return obj.getSettlementType();
		}

		@Override
		public void setValue(Option2 obj, SettlementType1Code value) {
			obj.setSettlementType(value);
		}
	};
	@XmlElement(name = "AddtlOptnInf")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option2
	 * Option2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlOptnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalOptionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free format text that may contain information on the option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Option2, Optional<Max140Text>> mmAdditionalOptionInformation = new MMMessageAttribute<Option2, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Option2.mmObject();
			isDerived = false;
			xmlTag = "AddtlOptnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalOptionInformation";
			definition = "Free format text that may contain information on the option.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(Option2 obj) {
			return obj.getAdditionalOptionInformation();
		}

		@Override
		public void setValue(Option2 obj, Optional<Max140Text> value) {
			obj.setAdditionalOptionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option2.mmOptionAmounts, com.tools20022.repository.msg.Option2.mmStrikePrice, com.tools20022.repository.msg.Option2.mmPremium,
						com.tools20022.repository.msg.Option2.mmExerciseStyle, com.tools20022.repository.msg.Option2.mmEarliestExerciseDate, com.tools20022.repository.msg.Option2.mmExpiryDateAndTime,
						com.tools20022.repository.msg.Option2.mmExpiryLocation, com.tools20022.repository.msg.Option2.mmSettlementType, com.tools20022.repository.msg.Option2.mmAdditionalOptionInformation);
				trace_lazy = () -> CurrencyOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEarliestExerciseDateRule.forOption2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Option2";
				definition = "List of elements which provide the parameters of an option trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountsAndValueDate2 getOptionAmounts() {
		return optionAmounts;
	}

	public Option2 setOptionAmounts(AmountsAndValueDate2 optionAmounts) {
		this.optionAmounts = Objects.requireNonNull(optionAmounts);
		return this;
	}

	public AgreedRate1 getStrikePrice() {
		return strikePrice;
	}

	public Option2 setStrikePrice(AgreedRate1 strikePrice) {
		this.strikePrice = Objects.requireNonNull(strikePrice);
		return this;
	}

	public PremiumAmount1 getPremium() {
		return premium;
	}

	public Option2 setPremium(PremiumAmount1 premium) {
		this.premium = Objects.requireNonNull(premium);
		return this;
	}

	public OptionStyle2Code getExerciseStyle() {
		return exerciseStyle;
	}

	public Option2 setExerciseStyle(OptionStyle2Code exerciseStyle) {
		this.exerciseStyle = Objects.requireNonNull(exerciseStyle);
		return this;
	}

	public Optional<ISODate> getEarliestExerciseDate() {
		return earliestExerciseDate == null ? Optional.empty() : Optional.of(earliestExerciseDate);
	}

	public Option2 setEarliestExerciseDate(ISODate earliestExerciseDate) {
		this.earliestExerciseDate = earliestExerciseDate;
		return this;
	}

	public ISODateTime getExpiryDateAndTime() {
		return expiryDateAndTime;
	}

	public Option2 setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = Objects.requireNonNull(expiryDateAndTime);
		return this;
	}

	public Max4AlphaNumericText getExpiryLocation() {
		return expiryLocation;
	}

	public Option2 setExpiryLocation(Max4AlphaNumericText expiryLocation) {
		this.expiryLocation = Objects.requireNonNull(expiryLocation);
		return this;
	}

	public SettlementType1Code getSettlementType() {
		return settlementType;
	}

	public Option2 setSettlementType(SettlementType1Code settlementType) {
		this.settlementType = Objects.requireNonNull(settlementType);
		return this;
	}

	public Optional<Max140Text> getAdditionalOptionInformation() {
		return additionalOptionInformation == null ? Optional.empty() : Optional.of(additionalOptionInformation);
	}

	public Option2 setAdditionalOptionInformation(Max140Text additionalOptionInformation) {
		this.additionalOptionInformation = additionalOptionInformation;
		return this;
	}
}