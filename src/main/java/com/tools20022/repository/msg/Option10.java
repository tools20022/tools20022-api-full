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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Option10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of elements which provide the parameters of an option trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Option3 Option3}
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Option10", propOrder = {"data", "exerciseStatus", "exerciseStyle", "optionType", "derivativeOptionIdentification", "optionPayoutType", "valuationRate", "strikePrice", "volatilityMargin", "riskAmount", "expiryDateAndTime",
		"expiryLocation", "settlementType", "optionAmounts", "premium", "settlementAmountType", "additionalOptionInformation"})
public class Option10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DataType1Code data;
	/**
	 * Type of data to indicate whether a trade is an option or resulted by an
	 * option exercise.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Data"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of data to indicate whether a trade is an option or resulted by an option exercise."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "Data";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Data";
			definition = "Type of data to indicate whether a trade is an option or resulted by an option exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataType1Code.mmObject();
		}
	};
	protected DerivativeExerciseStatus1Code exerciseStatus;
	/**
	 * Specifies the exercise status of the option.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExerciseStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the exercise status of the option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExerciseStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "ExrcSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExerciseStatus";
			definition = "Specifies the exercise status of the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DerivativeExerciseStatus1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmExerciseStyle
	 * Option3.mmExerciseStyle}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExerciseStyle = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
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
	};
	protected OptionType1Code optionType;
	/**
	 * Choice of format for option type.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice of format for option type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Choice of format for option type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionType1Code.mmObject();
		}
	};
	protected Max35Text derivativeOptionIdentification;
	/**
	 * Identifies the derivative option.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeOptionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the derivative option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDerivativeOptionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "DerivOptnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeOptionIdentification";
			definition = "Identifies the derivative option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected OptionPayoutType1Code optionPayoutType;
	/**
	 * Indicates the type of payout that will result from an in-the-money
	 * option.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionPayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of payout that will result from an in-the-money option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionPayoutType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "OptnPyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionPayoutType";
			definition = "Indicates the type of payout that will result from an in-the-money option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionPayoutType1Code.mmObject();
		}
	};
	protected AgreedRate3 valuationRate;
	/**
	 * Specifies the valuation rate used for the trade.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the valuation rate used for the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValuationRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmValueDate;
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "ValtnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationRate";
			definition = "Specifies the valuation rate used for the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AgreedRate3.mmObject();
		}
	};
	protected AgreedRate3 strikePrice;
	/**
	 * Specifies the rate of exchange at which the foreign exchange option has
	 * been struck.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmStrikePrice
	 * Option3.mmStrikePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStrikePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Specifies the rate of exchange at which the foreign exchange option has been struck.";
			previousVersion_lazy = () -> Option3.mmStrikePrice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AgreedRate3.mmObject();
		}
	};
	protected PercentageRate volatilityMargin;
	/**
	 * Annualized volatility for option model calculations.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Annualized volatility for option model calculations."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVolatilityMargin = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "VoltlyMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityMargin";
			definition = "Annualized volatility for option model calculations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount riskAmount;
	/**
	 * Measurement of the amount of the trade values converted in the US
	 * dollars.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Measurement of the amount of the trade values converted in the US dollars."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRiskAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "RskAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskAmount";
			definition = "Measurement of the amount of the trade values converted in the US dollars.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ISODateTime expiryDateAndTime;
	/**
	 * Date on which a privilege (for example, option, right, warrant,...)
	 * expires. If it is an European option, the option holder can only exercise
	 * the right or let it lapse on expiry date. If it is an American option,
	 * the option holder can exercise the right up to the expiry date.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
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
	 * "Date on which a privilege (for example, option, right, warrant,...) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmExpiryDateAndTime
	 * Option3.mmExpiryDateAndTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryDateAndTime;
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "XpryDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "Date on which a privilege (for example, option, right, warrant,...) expires. If it is an European option, the option holder can only exercise the right or let it lapse on expiry date. If it is an American option, the option holder can exercise the right up to the expiry date.";
			previousVersion_lazy = () -> Option3.mmExpiryDateAndTime;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmExpiryLocation
	 * Option3.mmExpiryLocation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryLocation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmExpiryLocation;
			componentContext_lazy = () -> Option10.mmObject();
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
	};
	protected SettlementDateCode settlementType;
	/**
	 * Specifies the settlment period of the option trade.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the settlment period of the option trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "SttlmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementType";
			definition = "Specifies the settlment period of the option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementDateCode.mmObject();
		}
	};
	protected AmountsAndValueDate4 optionAmounts;
	/**
	 * Specifies the call and the put amount of the underlying foreign exchange
	 * trade.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmOptionAmounts
	 * Option3.mmOptionAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionAmounts = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ForeignExchangeTrade.mmObject();
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "OptnAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAmounts";
			definition = "Specifies the call and the put amount of the underlying foreign exchange trade.";
			previousVersion_lazy = () -> Option3.mmOptionAmounts;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate4.mmObject();
		}
	};
	protected PremiumAmount3 premium;
	/**
	 * Specifies the amount of the premium of a foreign exchange option trade
	 * and its settlement place.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmPremium
	 * Option3.mmPremium}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPremium = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "Prm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			definition = "Specifies the amount of the premium of a foreign exchange option trade and its settlement place.";
			previousVersion_lazy = () -> Option3.mmPremium;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
		}
	};
	protected SettlementType1Code settlementAmountType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is to be settled as principal or netted off against another trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmountType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountType";
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option10
	 * Option10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Option3#mmAdditionalOptionInformation
	 * Option3.mmAdditionalOptionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalOptionInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Option10.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Option10.mmData, Option10.mmExerciseStatus, Option10.mmExerciseStyle, Option10.mmOptionType, Option10.mmDerivativeOptionIdentification, Option10.mmOptionPayoutType,
						Option10.mmValuationRate, Option10.mmStrikePrice, Option10.mmVolatilityMargin, Option10.mmRiskAmount, Option10.mmExpiryDateAndTime, Option10.mmExpiryLocation, Option10.mmSettlementType, Option10.mmOptionAmounts,
						Option10.mmPremium, Option10.mmSettlementAmountType, Option10.mmAdditionalOptionInformation);
				trace_lazy = () -> CurrencyOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Option10";
				definition = "List of elements which provide the parameters of an option trade.";
				previousVersion_lazy = () -> Option3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Data", required = true)
	public DataType1Code getData() {
		return data;
	}

	public void setData(DataType1Code data) {
		this.data = data;
	}

	@XmlElement(name = "ExrcSts", required = true)
	public DerivativeExerciseStatus1Code getExerciseStatus() {
		return exerciseStatus;
	}

	public void setExerciseStatus(DerivativeExerciseStatus1Code exerciseStatus) {
		this.exerciseStatus = exerciseStatus;
	}

	@XmlElement(name = "ExrcStyle", required = true)
	public OptionStyle2Code getExerciseStyle() {
		return exerciseStyle;
	}

	public void setExerciseStyle(OptionStyle2Code exerciseStyle) {
		this.exerciseStyle = exerciseStyle;
	}

	@XmlElement(name = "OptnTp", required = true)
	public OptionType1Code getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionType1Code optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "DerivOptnId", required = true)
	public Max35Text getDerivativeOptionIdentification() {
		return derivativeOptionIdentification;
	}

	public void setDerivativeOptionIdentification(Max35Text derivativeOptionIdentification) {
		this.derivativeOptionIdentification = derivativeOptionIdentification;
	}

	@XmlElement(name = "OptnPyoutTp", required = true)
	public OptionPayoutType1Code getOptionPayoutType() {
		return optionPayoutType;
	}

	public void setOptionPayoutType(OptionPayoutType1Code optionPayoutType) {
		this.optionPayoutType = optionPayoutType;
	}

	@XmlElement(name = "ValtnRate", required = true)
	public AgreedRate3 getValuationRate() {
		return valuationRate;
	}

	public void setValuationRate(com.tools20022.repository.msg.AgreedRate3 valuationRate) {
		this.valuationRate = valuationRate;
	}

	@XmlElement(name = "StrkPric", required = true)
	public AgreedRate3 getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(com.tools20022.repository.msg.AgreedRate3 strikePrice) {
		this.strikePrice = strikePrice;
	}

	@XmlElement(name = "VoltlyMrgn", required = true)
	public PercentageRate getVolatilityMargin() {
		return volatilityMargin;
	}

	public void setVolatilityMargin(PercentageRate volatilityMargin) {
		this.volatilityMargin = volatilityMargin;
	}

	@XmlElement(name = "RskAmt", required = true)
	public ActiveCurrencyAndAmount getRiskAmount() {
		return riskAmount;
	}

	public void setRiskAmount(ActiveCurrencyAndAmount riskAmount) {
		this.riskAmount = riskAmount;
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
	public SettlementDateCode getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(SettlementDateCode settlementType) {
		this.settlementType = settlementType;
	}

	@XmlElement(name = "OptnAmts", required = true)
	public AmountsAndValueDate4 getOptionAmounts() {
		return optionAmounts;
	}

	public void setOptionAmounts(com.tools20022.repository.msg.AmountsAndValueDate4 optionAmounts) {
		this.optionAmounts = optionAmounts;
	}

	@XmlElement(name = "Prm", required = true)
	public PremiumAmount3 getPremium() {
		return premium;
	}

	public void setPremium(com.tools20022.repository.msg.PremiumAmount3 premium) {
		this.premium = premium;
	}

	@XmlElement(name = "SttlmAmtTp", required = true)
	public SettlementType1Code getSettlementAmountType() {
		return settlementAmountType;
	}

	public void setSettlementAmountType(SettlementType1Code settlementAmountType) {
		this.settlementAmountType = settlementAmountType;
	}

	@XmlElement(name = "AddtlOptnInf", required = true)
	public Max140Text getAdditionalOptionInformation() {
		return additionalOptionInformation;
	}

	public void setAdditionalOptionInformation(Max140Text additionalOptionInformation) {
		this.additionalOptionInformation = additionalOptionInformation;
	}
}