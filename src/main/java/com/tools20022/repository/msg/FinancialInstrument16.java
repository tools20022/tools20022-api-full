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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, eg, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmIdentification
 * FinancialInstrument16.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmName
 * FinancialInstrument16.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmClassType
 * FinancialInstrument16.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmUmbrellaName
 * FinancialInstrument16.mmUmbrellaName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmCountryOfDomicile
 * FinancialInstrument16.mmCountryOfDomicile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmRegisteredDistributionCountry
 * FinancialInstrument16.mmRegisteredDistributionCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDenominationCurrency
 * FinancialInstrument16.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDistributionPolicy
 * FinancialInstrument16.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDividendPolicy
 * FinancialInstrument16.mmDividendPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmSecuritiesForm
 * FinancialInstrument16.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDematerialisedIndicator
 * FinancialInstrument16.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDividendFrequency
 * FinancialInstrument16.mmDividendFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmReinvestmentFrequency
 * FinancialInstrument16.mmReinvestmentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmEUSavingsDirective
 * FinancialInstrument16.mmEUSavingsDirective}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmFrontEndLoadIndicator
 * FinancialInstrument16.mmFrontEndLoadIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmBackEndLoadIndicator
 * FinancialInstrument16.mmBackEndLoadIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmSwitchFeeIndicator
 * FinancialInstrument16.mmSwitchFeeIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument16
 * ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument16
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINIdentificationRule#forFinancialInstrument16
 * ConstraintISINIdentificationRule.forFinancialInstrument16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument16", propOrder = {"identification", "name", "classType", "umbrellaName", "countryOfDomicile", "registeredDistributionCountry", "denominationCurrency", "distributionPolicy", "dividendPolicy",
		"securitiesForm", "dematerialisedIndicator", "dividendFrequency", "reinvestmentFrequency", "eUSavingsDirective", "frontEndLoadIndicator", "backEndLoadIndicator", "switchFeeIndicator"})
public class FinancialInstrument16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification7 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification7.mmObject();
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected Max350Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "ClssTp")
	protected Max35Text classType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmClassType
	 * InvestmentFundClass.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmClassType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "ClssTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "UmbrllNm")
	protected Max35Text umbrellaName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UmbrellaFund#mmName
	 * UmbrellaFund.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UmbrllNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UmbrellaName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the umbrella fund in which financial instrument is contained."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUmbrellaName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UmbrellaFund.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "UmbrllNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UmbrellaName";
			definition = "Name of the umbrella fund in which financial instrument is contained.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CtryOfDmcl", required = true)
	protected CountryCode countryOfDomicile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmDomicileCountry
	 * InvestmentFund.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfDmcl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfDomicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where the fund has legal domicile as reflected in the ISIN classification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfDomicile = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmDomicileCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "CtryOfDmcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfDomicile";
			definition = "Country where the fund has legal domicile as reflected in the ISIN classification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "RegdDstrbtnCtry", required = true)
	protected List<CountryCode> registeredDistributionCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegisteredDistributionCountry
	 * Security.mmRegisteredDistributionCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdDstrbtnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredDistributionCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Countries where the fund is registered for distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredDistributionCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegisteredDistributionCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "RegdDstrbtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Countries where the fund is registered for distribution.";
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "DnmtnCcy", required = true)
	protected ActiveCurrencyCode denominationCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDenominationCurrency
	 * Security.mmDenominationCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDenominationCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDenominationCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "DstrbtnPlcy", required = true)
	protected DistributionPolicy1Code distributionPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
	 * InvestmentFundClass.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDistributionPolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}
	};
	@XmlElement(name = "DvddPlcy")
	protected DividendPolicy1Code dividendPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendPolicy1Code
	 * DividendPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDividendPolicy
	 * InvestmentFundClass.mmDividendPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend policy of the fund, eg, cash, units."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDividendPolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDividendPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "DvddPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPolicy";
			definition = "Dividend policy of the fund, eg, cash, units.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DividendPolicy1Code.mmObject();
		}
	};
	@XmlElement(name = "SctiesForm", required = true)
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the form, ie, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Specifies the form, ie, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	@XmlElement(name = "DmtrlsdInd", required = true)
	protected YesNoIndicator dematerialisedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDematerialisedIndicator
	 * Security.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmtrlsdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDematerialisedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDematerialisedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "DmtrlsdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, ie, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "DvddFrqcy")
	protected EventFrequency2Code dividendFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency2Code
	 * EventFrequency2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendFrequency
	 * Dividend.mmDividendFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the income is allocated to investors."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDividendFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDividendFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "DvddFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendFrequency";
			definition = "Frequency with which the income is allocated to investors.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	@XmlElement(name = "RinvstmtFrqcy")
	protected EventFrequency2Code reinvestmentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency2Code
	 * EventFrequency2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmReinvestmentFrequency
	 * InvestmentFundClassProcessingCharacteristics.mmReinvestmentFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the reinvestment takes place,  This is the same or less than the dividend frequency,"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmReinvestmentFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentFrequency";
			definition = "Frequency with which the reinvestment takes place,  This is the same or less than the dividend frequency,";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency2Code.mmObject();
		}
	};
	@XmlElement(name = "EUSvgsDrctv")
	protected EUSavingsDirective1Code eUSavingsDirective;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmEUSavingsDirective
	 * Security.mmEUSavingsDirective}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUSvgsDrctv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsDirective"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investment fund class is subject to the European Union Saving Directive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEUSavingsDirective = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmEUSavingsDirective;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "EUSvgsDrctv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsDirective";
			definition = "Indicates whether the investment fund class is subject to the European Union Saving Directive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUSavingsDirective1Code.mmObject();
		}
	};
	@XmlElement(name = "FrntEndLdInd", required = true)
	protected YesNoIndicator frontEndLoadIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFrontEndLoadIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmFrontEndLoadIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrntEndLdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoadIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Front end charge on subscription orders for this class can be applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrontEndLoadIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmFrontEndLoadIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "FrntEndLdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoadIndicator";
			definition = "Front end charge on subscription orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "BckEndLdInd", required = true)
	protected YesNoIndicator backEndLoadIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmBackEndLoadIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmBackEndLoadIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BckEndLdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoadIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exit charge (eg. CDSC) on redemption orders for this class can be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBackEndLoadIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmBackEndLoadIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "BckEndLdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoadIndicator";
			definition = "Exit charge (eg. CDSC) on redemption orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SwtchFeeInd", required = true)
	protected YesNoIndicator switchFeeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSwitchingFeeIndicator
	 * InvestmentFundClassProcessingCharacteristics.mmSwitchingFeeIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16
	 * FinancialInstrument16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchFeeInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchFeeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a separate fee for switching between sub-funds of the same umbrella can be applied"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSwitchFeeIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSwitchingFeeIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument16.mmObject();
			isDerived = false;
			xmlTag = "SwtchFeeInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFeeIndicator";
			definition = "If a separate fee for switching between sub-funds of the same umbrella can be applied";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.mmIdentification, com.tools20022.repository.msg.FinancialInstrument16.mmName,
						com.tools20022.repository.msg.FinancialInstrument16.mmClassType, com.tools20022.repository.msg.FinancialInstrument16.mmUmbrellaName, com.tools20022.repository.msg.FinancialInstrument16.mmCountryOfDomicile,
						com.tools20022.repository.msg.FinancialInstrument16.mmRegisteredDistributionCountry, com.tools20022.repository.msg.FinancialInstrument16.mmDenominationCurrency,
						com.tools20022.repository.msg.FinancialInstrument16.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument16.mmDividendPolicy, com.tools20022.repository.msg.FinancialInstrument16.mmSecuritiesForm,
						com.tools20022.repository.msg.FinancialInstrument16.mmDematerialisedIndicator, com.tools20022.repository.msg.FinancialInstrument16.mmDividendFrequency,
						com.tools20022.repository.msg.FinancialInstrument16.mmReinvestmentFrequency, com.tools20022.repository.msg.FinancialInstrument16.mmEUSavingsDirective,
						com.tools20022.repository.msg.FinancialInstrument16.mmFrontEndLoadIndicator, com.tools20022.repository.msg.FinancialInstrument16.mmBackEndLoadIndicator,
						com.tools20022.repository.msg.FinancialInstrument16.mmSwitchFeeIndicator);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument16,
						com.tools20022.repository.constraints.ConstraintISINIdentificationRule.forFinancialInstrument16);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrument16";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification7 getIdentification() {
		return identification;
	}

	public FinancialInstrument16 setIdentification(com.tools20022.repository.msg.SecurityIdentification7 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max350Text getName() {
		return name;
	}

	public FinancialInstrument16 setName(Max350Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<Max35Text> getClassType() {
		return classType == null ? Optional.empty() : Optional.of(classType);
	}

	public FinancialInstrument16 setClassType(Max35Text classType) {
		this.classType = classType;
		return this;
	}

	public Optional<Max35Text> getUmbrellaName() {
		return umbrellaName == null ? Optional.empty() : Optional.of(umbrellaName);
	}

	public FinancialInstrument16 setUmbrellaName(Max35Text umbrellaName) {
		this.umbrellaName = umbrellaName;
		return this;
	}

	public CountryCode getCountryOfDomicile() {
		return countryOfDomicile;
	}

	public FinancialInstrument16 setCountryOfDomicile(CountryCode countryOfDomicile) {
		this.countryOfDomicile = Objects.requireNonNull(countryOfDomicile);
		return this;
	}

	public List<CountryCode> getRegisteredDistributionCountry() {
		return registeredDistributionCountry == null ? registeredDistributionCountry = new ArrayList<>() : registeredDistributionCountry;
	}

	public FinancialInstrument16 setRegisteredDistributionCountry(List<CountryCode> registeredDistributionCountry) {
		this.registeredDistributionCountry = Objects.requireNonNull(registeredDistributionCountry);
		return this;
	}

	public ActiveCurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public FinancialInstrument16 setDenominationCurrency(ActiveCurrencyCode denominationCurrency) {
		this.denominationCurrency = Objects.requireNonNull(denominationCurrency);
		return this;
	}

	public DistributionPolicy1Code getDistributionPolicy() {
		return distributionPolicy;
	}

	public FinancialInstrument16 setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = Objects.requireNonNull(distributionPolicy);
		return this;
	}

	public Optional<DividendPolicy1Code> getDividendPolicy() {
		return dividendPolicy == null ? Optional.empty() : Optional.of(dividendPolicy);
	}

	public FinancialInstrument16 setDividendPolicy(DividendPolicy1Code dividendPolicy) {
		this.dividendPolicy = dividendPolicy;
		return this;
	}

	public FormOfSecurity1Code getSecuritiesForm() {
		return securitiesForm;
	}

	public FinancialInstrument16 setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = Objects.requireNonNull(securitiesForm);
		return this;
	}

	public YesNoIndicator getDematerialisedIndicator() {
		return dematerialisedIndicator;
	}

	public FinancialInstrument16 setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = Objects.requireNonNull(dematerialisedIndicator);
		return this;
	}

	public Optional<EventFrequency2Code> getDividendFrequency() {
		return dividendFrequency == null ? Optional.empty() : Optional.of(dividendFrequency);
	}

	public FinancialInstrument16 setDividendFrequency(EventFrequency2Code dividendFrequency) {
		this.dividendFrequency = dividendFrequency;
		return this;
	}

	public Optional<EventFrequency2Code> getReinvestmentFrequency() {
		return reinvestmentFrequency == null ? Optional.empty() : Optional.of(reinvestmentFrequency);
	}

	public FinancialInstrument16 setReinvestmentFrequency(EventFrequency2Code reinvestmentFrequency) {
		this.reinvestmentFrequency = reinvestmentFrequency;
		return this;
	}

	public Optional<EUSavingsDirective1Code> getEUSavingsDirective() {
		return eUSavingsDirective == null ? Optional.empty() : Optional.of(eUSavingsDirective);
	}

	public FinancialInstrument16 setEUSavingsDirective(EUSavingsDirective1Code eUSavingsDirective) {
		this.eUSavingsDirective = eUSavingsDirective;
		return this;
	}

	public YesNoIndicator getFrontEndLoadIndicator() {
		return frontEndLoadIndicator;
	}

	public FinancialInstrument16 setFrontEndLoadIndicator(YesNoIndicator frontEndLoadIndicator) {
		this.frontEndLoadIndicator = Objects.requireNonNull(frontEndLoadIndicator);
		return this;
	}

	public YesNoIndicator getBackEndLoadIndicator() {
		return backEndLoadIndicator;
	}

	public FinancialInstrument16 setBackEndLoadIndicator(YesNoIndicator backEndLoadIndicator) {
		this.backEndLoadIndicator = Objects.requireNonNull(backEndLoadIndicator);
		return this;
	}

	public YesNoIndicator getSwitchFeeIndicator() {
		return switchFeeIndicator;
	}

	public FinancialInstrument16 setSwitchFeeIndicator(YesNoIndicator switchFeeIndicator) {
		this.switchFeeIndicator = Objects.requireNonNull(switchFeeIndicator);
		return this;
	}
}