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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.choice.OptionStyle1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contracts which grant to the holder either the privilege to purchase or the
 * privilege to sell the assets specified at a predetermined price or formula at
 * or within a time in the future.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmConversionDate
 * Option1.mmConversionDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikePrice
 * Option1.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmExpiryDate
 * Option1.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option1#mmMinimumExercisableMultipleQuantity
 * Option1.mmMinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option1#mmMinimumExercisableQuantity
 * Option1.mmMinimumExercisableQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmConversionPeriod
 * Option1.mmConversionPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmOptionStyle
 * Option1.mmOptionStyle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmOptionType
 * Option1.mmOptionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikeValue
 * Option1.mmStrikeValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikeMultiplier
 * Option1.mmStrikeMultiplier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Option1#mmInstrumentAssignmentMethod
 * Option1.mmInstrumentAssignmentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmVersionNumber
 * Option1.mmVersionNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmSettleStyle
 * Option1.mmSettleStyle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmExpiryLocation
 * Option1.mmExpiryLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStandardisation
 * Option1.mmStandardisation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmTradingPartyRole
 * Option1.mmTradingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmContractSize
 * Option1.mmContractSize}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Option1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified\nat a predetermined price or formula at or within a time in the future."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Option1", propOrder = {"conversionDate", "strikePrice", "expiryDate", "minimumExercisableMultipleQuantity", "minimumExercisableQuantity", "conversionPeriod", "optionStyle", "optionType", "strikeValue", "strikeMultiplier",
		"instrumentAssignmentMethod", "versionNumber", "settleStyle", "expiryLocation", "standardisation", "tradingPartyRole", "contractSize"})
public class Option1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ConvsDt")
	protected ISODateTime conversionDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionDate
	 * SecuritiesConversion.mmConversionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which a convertible security must be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConversionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "ConvsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "StrkPric")
	protected Price1 strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
	 * Price.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 202, FIXSynonym: 947</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStrikePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Price.mmSecuritiesPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "202"), new FIXSynonym(this, "947"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	@XmlElement(name = "XpryDt")
	protected ISODateTime expiryDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a privilege expires."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpiryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which a privilege expires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "MinExrcblMltplQty")
	protected FinancialInstrumentQuantityChoice minimumExercisableMultipleQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableMultipleQuantity
	 * SecuritiesConversion.mmMinimumExercisableMultipleQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblMltplQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of securities that must be exercised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumExercisableMultipleQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableMultipleQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblMltplQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity of securities that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "MinExrcblQty")
	protected FinancialInstrumentQuantityChoice minimumExercisableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmMinimumExercisableQuantity
	 * SecuritiesConversion.mmMinimumExercisableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinExrcblQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum quantity of securities that must be exercised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumExercisableQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmMinimumExercisableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "MinExrcblQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of securities that must be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "ConvsPrd")
	protected DateTimePeriodChoice conversionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPeriod
	 * SecuritiesConversion.mmConversionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a convertible security may be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConversionPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "ConvsPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};
	@XmlElement(name = "OptnStyle")
	protected OptionStyle1Choice optionStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionStyle1Choice
	 * OptionStyle1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmOptionStyle
	 * Option.mmOptionStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how an option can be exercised (American, European, Bermudan)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionStyle = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "OptnStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionStyle1Choice.mmObject();
		}
	};
	@XmlElement(name = "OptnTp")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
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
	 * definition} =
	 * "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OptionType1Code.mmObject();
		}
	};
	@XmlElement(name = "StrkVal")
	protected Number strikeValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikeValue
	 * Option.mmStrikeValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 968</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for derivatives. The number of shares/units for the financial instrument involved in the option trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStrikeValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikeValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "StrkVal";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "968"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikeValue";
			definition = "Used for derivatives. The number of shares/units for the financial instrument involved in the option trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "StrkMltplr")
	protected Number strikeMultiplier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikeMultiplier
	 * Option.mmStrikeMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkMltplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 967</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for derivatives. Multiplier applied to the strike price for the purpose of calculating the settlement value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStrikeMultiplier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmStrikeMultiplier;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "StrkMltplr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "967"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikeMultiplier";
			definition = "Used for derivatives. Multiplier applied to the strike price for the purpose of calculating the settlement value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "InstrmAssgnmtMtd")
	protected AssignmentMethod1Code instrumentAssignmentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssignmentMethod1Code
	 * AssignmentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmInstrumentAssignmentMethod
	 * Option.mmInstrumentAssignmentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmAssgnmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1049</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentAssignmentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method under which assignment was conducted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstrumentAssignmentMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmInstrumentAssignmentMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "InstrmAssgnmtMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1049"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentAssignmentMethod";
			definition = "Method under which assignment was conducted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssignmentMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "VrsnNb")
	protected Number versionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmVersionNumber
	 * Derivative.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VrsnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 206</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmVersionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "VrsnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "206"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VersionNumber";
			definition = "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "SttlStyle")
	protected SettleStyle1Code settleStyle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettleStyle1Code
	 * SettleStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmSettleStyle
	 * Option.mmSettleStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option contract settles at the open or close of the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettleStyle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmSettleStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "SttlStyle";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettleStyle";
			definition = "Specifies whether the option contract settles at the open or close of the market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettleStyle1Code.mmObject();
		}
	};
	@XmlElement(name = "XpryLctn")
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "XpryLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "Stdstn")
	protected StandardisationCode standardisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStandardisation
	 * Option.mmStandardisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stdstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardisation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Option.mmStandardisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "Stdstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}
	};
	@XmlElement(name = "TradgPtyRole", required = true)
	protected OptionParty1Code tradingPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionParty1Code
	 * OptionParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmBuyerOrSeller
	 * TradePartyRole.mmBuyerOrSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPtyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingPartyRole = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmBuyerOrSeller;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "TradgPtyRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPartyRole";
			definition = "Specifies the party which is the buyer or the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionParty1Code.mmObject();
		}
	};
	@XmlElement(name = "CtrctSz", required = true)
	protected BaseOneRate contractSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
	 * SecuritiesConversion.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Option1
	 * Option1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.Option1.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Option1.mmConversionDate, com.tools20022.repository.msg.Option1.mmStrikePrice, com.tools20022.repository.msg.Option1.mmExpiryDate,
						com.tools20022.repository.msg.Option1.mmMinimumExercisableMultipleQuantity, com.tools20022.repository.msg.Option1.mmMinimumExercisableQuantity, com.tools20022.repository.msg.Option1.mmConversionPeriod,
						com.tools20022.repository.msg.Option1.mmOptionStyle, com.tools20022.repository.msg.Option1.mmOptionType, com.tools20022.repository.msg.Option1.mmStrikeValue, com.tools20022.repository.msg.Option1.mmStrikeMultiplier,
						com.tools20022.repository.msg.Option1.mmInstrumentAssignmentMethod, com.tools20022.repository.msg.Option1.mmVersionNumber, com.tools20022.repository.msg.Option1.mmSettleStyle,
						com.tools20022.repository.msg.Option1.mmExpiryLocation, com.tools20022.repository.msg.Option1.mmStandardisation, com.tools20022.repository.msg.Option1.mmTradingPartyRole,
						com.tools20022.repository.msg.Option1.mmContractSize);
				trace_lazy = () -> Option.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Option1";
				definition = "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified\nat a predetermined price or formula at or within a time in the future.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getConversionDate() {
		return conversionDate == null ? Optional.empty() : Optional.of(conversionDate);
	}

	public Option1 setConversionDate(ISODateTime conversionDate) {
		this.conversionDate = conversionDate;
		return this;
	}

	public Optional<Price1> getStrikePrice() {
		return strikePrice == null ? Optional.empty() : Optional.of(strikePrice);
	}

	public Option1 setStrikePrice(com.tools20022.repository.msg.Price1 strikePrice) {
		this.strikePrice = strikePrice;
		return this;
	}

	public Optional<ISODateTime> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public Option1 setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMinimumExercisableMultipleQuantity() {
		return minimumExercisableMultipleQuantity == null ? Optional.empty() : Optional.of(minimumExercisableMultipleQuantity);
	}

	public Option1 setMinimumExercisableMultipleQuantity(FinancialInstrumentQuantityChoice minimumExercisableMultipleQuantity) {
		this.minimumExercisableMultipleQuantity = minimumExercisableMultipleQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getMinimumExercisableQuantity() {
		return minimumExercisableQuantity == null ? Optional.empty() : Optional.of(minimumExercisableQuantity);
	}

	public Option1 setMinimumExercisableQuantity(FinancialInstrumentQuantityChoice minimumExercisableQuantity) {
		this.minimumExercisableQuantity = minimumExercisableQuantity;
		return this;
	}

	public Optional<DateTimePeriodChoice> getConversionPeriod() {
		return conversionPeriod == null ? Optional.empty() : Optional.of(conversionPeriod);
	}

	public Option1 setConversionPeriod(DateTimePeriodChoice conversionPeriod) {
		this.conversionPeriod = conversionPeriod;
		return this;
	}

	public Optional<OptionStyle1Choice> getOptionStyle() {
		return optionStyle == null ? Optional.empty() : Optional.of(optionStyle);
	}

	public Option1 setOptionStyle(OptionStyle1Choice optionStyle) {
		this.optionStyle = optionStyle;
		return this;
	}

	public Optional<OptionType1Code> getOptionType() {
		return optionType == null ? Optional.empty() : Optional.of(optionType);
	}

	public Option1 setOptionType(OptionType1Code optionType) {
		this.optionType = optionType;
		return this;
	}

	public Optional<Number> getStrikeValue() {
		return strikeValue == null ? Optional.empty() : Optional.of(strikeValue);
	}

	public Option1 setStrikeValue(Number strikeValue) {
		this.strikeValue = strikeValue;
		return this;
	}

	public Optional<Number> getStrikeMultiplier() {
		return strikeMultiplier == null ? Optional.empty() : Optional.of(strikeMultiplier);
	}

	public Option1 setStrikeMultiplier(Number strikeMultiplier) {
		this.strikeMultiplier = strikeMultiplier;
		return this;
	}

	public Optional<AssignmentMethod1Code> getInstrumentAssignmentMethod() {
		return instrumentAssignmentMethod == null ? Optional.empty() : Optional.of(instrumentAssignmentMethod);
	}

	public Option1 setInstrumentAssignmentMethod(AssignmentMethod1Code instrumentAssignmentMethod) {
		this.instrumentAssignmentMethod = instrumentAssignmentMethod;
		return this;
	}

	public Optional<Number> getVersionNumber() {
		return versionNumber == null ? Optional.empty() : Optional.of(versionNumber);
	}

	public Option1 setVersionNumber(Number versionNumber) {
		this.versionNumber = versionNumber;
		return this;
	}

	public Optional<SettleStyle1Code> getSettleStyle() {
		return settleStyle == null ? Optional.empty() : Optional.of(settleStyle);
	}

	public Option1 setSettleStyle(SettleStyle1Code settleStyle) {
		this.settleStyle = settleStyle;
		return this;
	}

	public Optional<Max4AlphaNumericText> getExpiryLocation() {
		return expiryLocation == null ? Optional.empty() : Optional.of(expiryLocation);
	}

	public Option1 setExpiryLocation(Max4AlphaNumericText expiryLocation) {
		this.expiryLocation = expiryLocation;
		return this;
	}

	public Optional<StandardisationCode> getStandardisation() {
		return standardisation == null ? Optional.empty() : Optional.of(standardisation);
	}

	public Option1 setStandardisation(StandardisationCode standardisation) {
		this.standardisation = standardisation;
		return this;
	}

	public OptionParty1Code getTradingPartyRole() {
		return tradingPartyRole;
	}

	public Option1 setTradingPartyRole(OptionParty1Code tradingPartyRole) {
		this.tradingPartyRole = Objects.requireNonNull(tradingPartyRole);
		return this;
	}

	public BaseOneRate getContractSize() {
		return contractSize;
	}

	public Option1 setContractSize(BaseOneRate contractSize) {
		this.contractSize = Objects.requireNonNull(contractSize);
		return this;
	}
}