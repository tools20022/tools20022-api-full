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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.entity.UmbrellaFund;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmClassType
 * FinancialInstrument21.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmSecuritiesForm
 * FinancialInstrument21.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDistributionPolicy
 * FinancialInstrument21.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmProductGroup
 * FinancialInstrument21.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmUmbrellaName
 * FinancialInstrument21.mmUmbrellaName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmBaseCurrency
 * FinancialInstrument21.mmBaseCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDenominationCurrency
 * FinancialInstrument21.mmDenominationCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmRequestedNAVCurrency
 * FinancialInstrument21.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmDualFundIndicator
 * FinancialInstrument21.mmDualFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmCountryOfDomicile
 * FinancialInstrument21.mmCountryOfDomicile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21#mmRegisteredDistributionCountry
 * FinancialInstrument21.mmRegisteredDistributionCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
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
 * "FinancialInstrument21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrument21", propOrder = {"classType", "securitiesForm", "distributionPolicy", "productGroup", "umbrellaName", "baseCurrency", "denominationCurrency", "requestedNAVCurrency", "dualFundIndicator",
		"countryOfDomicile", "registeredDistributionCountry"})
public class FinancialInstrument21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text classType;
	/**
	 * Features of units offered by a fund. For example, a unit may have a
	 * specific load structure, eg, front end or back end, an income policy, eg,
	 * pay out or accumulate, or a trailer policy, eg, with or without. Fund
	 * classes are typically denoted by a single character, eg, 'Class A',
	 * 'Class 2'.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
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
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
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
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * Specifies the form, that is, ownership, of the security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
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
	 * definition} = "Specifies the form, that is, ownership, of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Specifies the form, that is, ownership, of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	protected DistributionPolicy1Code distributionPolicy;
	/**
	 * Income policy relating to a class type, that is, if income is paid out or
	 * retained in the fund.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
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
	 * "Income policy relating to a class type, that is, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDistributionPolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, that is, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}
	};
	protected Max140Text productGroup;
	/**
	 * Company specific description of a group of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProductGroup
	 * InvestmentFundClass.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company specific description of a group of funds."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductGroup = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProductGroup;
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "PdctGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max35Text umbrellaName;
	/**
	 * Name of the umbrella fund in which financial instrument is contained.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
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
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
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
	protected ActiveCurrencyCode baseCurrency;
	/**
	 * Currency of the investment fund class.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTradingCurrency
	 * InvestmentFundClass.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaseCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment fund class."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBaseCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "BaseCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Currency of the investment fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ActiveCurrencyCode denominationCurrency;
	/**
	 * Currency in which a security is issued or redenominated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
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
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "DnmtnCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode requestedNAVCurrency;
	/**
	 * Currency to be used for pricing the fund. This currency must be among the
	 * set of currencies in which the price may be expressed, as stated in the
	 * prospectus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
	 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdNAVCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedNAVCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected YesNoIndicator dualFundIndicator;
	/**
	 * Indicates whether the fund has two prices.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDualFundIndicator
	 * InvestmentFundClass.mmDualFundIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DualFndInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualFundIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the fund has two prices."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDualFundIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDualFundIndicator;
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "DualFndInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualFundIndicator";
			definition = "Indicates whether the fund has two prices.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CountryCode countryOfDomicile;
	/**
	 * Country where the fund has legal domicile as reflected in the ISIN
	 * classification.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
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
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "CtryOfDmcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfDomicile";
			definition = "Country where the fund has legal domicile as reflected in the ISIN classification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected List<CountryCode> registeredDistributionCountry;
	/**
	 * Countries where the fund is registered for distribution.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument21
	 * FinancialInstrument21}</li>
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
			componentContext_lazy = () -> FinancialInstrument21.mmObject();
			isDerived = false;
			xmlTag = "RegdDstrbtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Countries where the fund is registered for distribution.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrument21.mmClassType, FinancialInstrument21.mmSecuritiesForm, FinancialInstrument21.mmDistributionPolicy, FinancialInstrument21.mmProductGroup,
						FinancialInstrument21.mmUmbrellaName, FinancialInstrument21.mmBaseCurrency, FinancialInstrument21.mmDenominationCurrency, FinancialInstrument21.mmRequestedNAVCurrency, FinancialInstrument21.mmDualFundIndicator,
						FinancialInstrument21.mmCountryOfDomicile, FinancialInstrument21.mmRegisteredDistributionCountry);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument21";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ClssTp")
	public Max35Text getClassType() {
		return classType;
	}

	public void setClassType(Max35Text classType) {
		this.classType = classType;
	}

	@XmlElement(name = "SctiesForm")
	public FormOfSecurity1Code getSecuritiesForm() {
		return securitiesForm;
	}

	public void setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
	}

	@XmlElement(name = "DstrbtnPlcy")
	public DistributionPolicy1Code getDistributionPolicy() {
		return distributionPolicy;
	}

	public void setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
	}

	@XmlElement(name = "PdctGrp")
	public Max140Text getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
	}

	@XmlElement(name = "UmbrllNm")
	public Max35Text getUmbrellaName() {
		return umbrellaName;
	}

	public void setUmbrellaName(Max35Text umbrellaName) {
		this.umbrellaName = umbrellaName;
	}

	@XmlElement(name = "BaseCcy")
	public ActiveCurrencyCode getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(ActiveCurrencyCode baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	@XmlElement(name = "DnmtnCcy")
	public ActiveCurrencyCode getDenominationCurrency() {
		return denominationCurrency;
	}

	public void setDenominationCurrency(ActiveCurrencyCode denominationCurrency) {
		this.denominationCurrency = denominationCurrency;
	}

	@XmlElement(name = "ReqdNAVCcy")
	public ActiveOrHistoricCurrencyCode getRequestedNAVCurrency() {
		return requestedNAVCurrency;
	}

	public void setRequestedNAVCurrency(ActiveOrHistoricCurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
	}

	@XmlElement(name = "DualFndInd")
	public YesNoIndicator getDualFundIndicator() {
		return dualFundIndicator;
	}

	public void setDualFundIndicator(YesNoIndicator dualFundIndicator) {
		this.dualFundIndicator = dualFundIndicator;
	}

	@XmlElement(name = "CtryOfDmcl")
	public CountryCode getCountryOfDomicile() {
		return countryOfDomicile;
	}

	public void setCountryOfDomicile(CountryCode countryOfDomicile) {
		this.countryOfDomicile = countryOfDomicile;
	}

	@XmlElement(name = "RegdDstrbtnCtry")
	public List<CountryCode> getRegisteredDistributionCountry() {
		return registeredDistributionCountry;
	}

	public void setRegisteredDistributionCountry(List<CountryCode> registeredDistributionCountry) {
		this.registeredDistributionCountry = registeredDistributionCountry;
	}
}