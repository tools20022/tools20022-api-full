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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmOptionAmounts
 * Option4.mmOptionAmounts}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmStrikePrice
 * Option4.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmExerciseStyle
 * Option4.mmExerciseStyle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmEarliestExerciseDate
 * Option4.mmEarliestExerciseDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmExpiryDateAndTime
 * Option4.mmExpiryDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmExpiryLocation
 * Option4.mmExpiryLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmSettlementType
 * Option4.mmSettlementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option4#mmAdditionalOptionInformation
 * Option4.mmAdditionalOptionInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option4#mmPremium
 * Option4.mmPremium}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyOption
 * CurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Option4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of elements which provide the parameters of an option trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Option4", propOrder = {"optionAmounts", "strikePrice", "exerciseStyle", "earliestExerciseDate", "expiryDateAndTime", "expiryLocation", "settlementType", "additionalOptionInformation", "premium"})
public class Option4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountsAndValueDate3 optionAmounts;
	/**
	 * Specifies the call and the put amount of the underlying foreign exchange
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3
	 * AmountsAndValueDate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAssociationEnd mmOptionAmounts = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CurrencyOption.mmObject();
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "OptnAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAmounts";
			definition = "Specifies the call and the put amount of the underlying foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate3.mmObject();
		}
	};
	protected AgreedRate1 strikePrice;
	/**
	 * Specifies the rate of exchange at which the foreign exchange option has
	 * been struck.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAssociationEnd mmStrikePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmStrikeRate;
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Specifies the rate of exchange at which the foreign exchange option has been struck.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AgreedRate1.mmObject();
		}
	};
	protected OptionStyle2Code exerciseStyle;
	/**
	 * Defines how an option can be exercised.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAttribute mmExerciseStyle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "ExrcStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExerciseStyle";
			definition = "Defines how an option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyle2Code.mmObject();
		}
	};
	protected ISODate earliestExerciseDate;
	/**
	 * First date on which an american option can be exercised.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAttribute mmEarliestExerciseDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmEarliestExerciseDate;
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "EarlstExrcDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODateTime expiryDateAndTime;
	/**
	 * Date on which a privilege (eg, option, right, warrant,...) expires. If it
	 * is an European option, the option holder can only exercise the right or
	 * let it lapse on expiry date. If it is an American option, the option
	 * holder can exercise the right up to the expiry date.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	 * "Date on which a privilege (eg, option, right, warrant,...) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryDateAndTime;
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "XpryDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "Date on which a privilege (eg, option, right, warrant,...) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max4AlphaNumericText expiryLocation;
	/**
	 * Financial center where option expires.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAttribute mmExpiryLocation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryLocation;
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "XpryLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected SettlementType1Code settlementType;
	/**
	 * Indicates whether the trade is to be settled as principal or netted off
	 * against another trade.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAttribute mmSettlementType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmSettlementType;
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "SttlmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementType1Code.mmObject();
		}
	};
	protected Max140Text additionalOptionInformation;
	/**
	 * Free format text that may contain information on the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAttribute mmAdditionalOptionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "AddtlOptnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalOptionInformation";
			definition = "Free format text that may contain information on the option.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PremiumAmount2 premium;
	/**
	 * Specifies the amount of the premium of a foreign exchange option trade
	 * and its settlement place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PremiumAmount2
	 * PremiumAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumCalculation
	 * CurrencyOption.mmPremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option4
	 * Option4}</li>
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
	public static final MMMessageAssociationEnd mmPremium = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmPremiumCalculation;
			componentContext_lazy = () -> Option4.mmObject();
			isDerived = false;
			xmlTag = "Prm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			definition = "Specifies the amount of the premium of a foreign exchange option trade and its settlement place.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PremiumAmount2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Option4.mmOptionAmounts, Option4.mmStrikePrice, Option4.mmExerciseStyle, Option4.mmEarliestExerciseDate, Option4.mmExpiryDateAndTime, Option4.mmExpiryLocation,
						Option4.mmSettlementType, Option4.mmAdditionalOptionInformation, Option4.mmPremium);
				trace_lazy = () -> CurrencyOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Option4";
				definition = "List of elements which provide the parameters of an option trade.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OptnAmts", required = true)
	public AmountsAndValueDate3 getOptionAmounts() {
		return optionAmounts;
	}

	public void setOptionAmounts(com.tools20022.repository.msg.AmountsAndValueDate3 optionAmounts) {
		this.optionAmounts = optionAmounts;
	}

	@XmlElement(name = "StrkPric", required = true)
	public AgreedRate1 getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(com.tools20022.repository.msg.AgreedRate1 strikePrice) {
		this.strikePrice = strikePrice;
	}

	@XmlElement(name = "ExrcStyle", required = true)
	public OptionStyle2Code getExerciseStyle() {
		return exerciseStyle;
	}

	public void setExerciseStyle(OptionStyle2Code exerciseStyle) {
		this.exerciseStyle = exerciseStyle;
	}

	@XmlElement(name = "EarlstExrcDt")
	public ISODate getEarliestExerciseDate() {
		return earliestExerciseDate;
	}

	public void setEarliestExerciseDate(ISODate earliestExerciseDate) {
		this.earliestExerciseDate = earliestExerciseDate;
	}

	@XmlElement(name = "XpryDtAndTm", required = true)
	public ISODateTime getExpiryDateAndTime() {
		return expiryDateAndTime;
	}

	public void setExpiryDateAndTime(ISODateTime expiryDateAndTime) {
		this.expiryDateAndTime = expiryDateAndTime;
	}

	@XmlElement(name = "XpryLctn", required = true)
	public Max4AlphaNumericText getExpiryLocation() {
		return expiryLocation;
	}

	public void setExpiryLocation(Max4AlphaNumericText expiryLocation) {
		this.expiryLocation = expiryLocation;
	}

	@XmlElement(name = "SttlmTp", required = true)
	public SettlementType1Code getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(SettlementType1Code settlementType) {
		this.settlementType = settlementType;
	}

	@XmlElement(name = "AddtlOptnInf")
	public Max140Text getAdditionalOptionInformation() {
		return additionalOptionInformation;
	}

	public void setAdditionalOptionInformation(Max140Text additionalOptionInformation) {
		this.additionalOptionInformation = additionalOptionInformation;
	}

	@XmlElement(name = "Prm", required = true)
	public PremiumAmount2 getPremium() {
		return premium;
	}

	public void setPremium(com.tools20022.repository.msg.PremiumAmount2 premium) {
		this.premium = premium;
	}
}