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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.EUCapitalGain2Code;
import com.tools20022.repository.codeset.EUDividendStatus1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information used to calculate the tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUCapitalGainOrExtendedEUCapitalGainRule
 * TaxCalculationInformation4.mmEUCapitalGainOrExtendedEUCapitalGainRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUDividendStatusOrExtendedEUDividendStatusRule
 * TaxCalculationInformation4.mmEUDividendStatusOrExtendedEUDividendStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUCapitalGain
 * TaxCalculationInformation4.mmEUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUCapitalGain
 * TaxCalculationInformation4.mmExtendedEUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmPercentageOfDebtClaim
 * TaxCalculationInformation4.mmPercentageOfDebtClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmPercentageGrandfatheredDebt
 * TaxCalculationInformation4.mmPercentageGrandfatheredDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmTaxableIncomePerDividend
 * TaxCalculationInformation4.mmTaxableIncomePerDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUDividendStatus
 * TaxCalculationInformation4.mmEUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUDividendStatus
 * TaxCalculationInformation4.mmExtendedEUDividendStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxCalculationInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to calculate the tax."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TaxCalculationInformation4", propOrder = {"EUCapitalGain", "extendedEUCapitalGain", "percentageOfDebtClaim", "percentageGrandfatheredDebt", "taxableIncomePerDividend", "EUDividendStatus", "extendedEUDividendStatus"})
public class TaxCalculationInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected EUCapitalGain2Code eUCapitalGain;
	/**
	 * Specifies whether capital gain is in the scope of the European directive
	 * on taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code
	 * EUCapitalGain2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUCptlGn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEUCapitalGain = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> TaxCalculationInformation4.mmObject();
			isDerived = false;
			xmlTag = "EUCptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUCapitalGain2Code.mmObject();
		}
	};
	protected Extended350Code extendedEUCapitalGain;
	/**
	 * Specifies whether capital gain is in the scope of the European directive
	 * on taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedEUCptlGn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedEUCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedEUCapitalGain = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> TaxCalculationInformation4.mmObject();
			isDerived = false;
			xmlTag = "XtndedEUCptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedEUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * Percentage of the underlying assets of the funds that represents a debt
	 * and is in the scope of the European directive on taxation of savings
	 * income in the form of interest payments (Council Directive 2003/48/EC 3
	 * June).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageOfDebtClaim
	 * InvestmentFundTax.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfDebtClm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageOfDebtClaim = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmPercentageOfDebtClaim;
			componentContext_lazy = () -> TaxCalculationInformation4.mmObject();
			isDerived = false;
			xmlTag = "PctgOfDebtClm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate percentageGrandfatheredDebt;
	/**
	 * Percentage of grandfathered debt claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageGrandfatheredDebt
	 * InvestmentFundTax.mmPercentageGrandfatheredDebt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgGrdfthdDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageGrandfatheredDebt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of grandfathered debt claim."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageGrandfatheredDebt = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmPercentageGrandfatheredDebt;
			componentContext_lazy = () -> TaxCalculationInformation4.mmObject();
			isDerived = false;
			xmlTag = "PctgGrdfthdDebt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageGrandfatheredDebt";
			definition = "Percentage of grandfathered debt claim.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxableIncomePerDividend;
	/**
	 * Amount included in the dividend that corresponds to gains directly or
	 * indirectly derived from interest payment in the scope of the European
	 * Directive on taxation of savings income in the form of interest payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividend
	 * SecuritiesTax.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxableIncomePerDividend = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividend;
			componentContext_lazy = () -> TaxCalculationInformation4.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected EUDividendStatus1Code eUDividendStatus;
	/**
	 * Specifies whether dividend is in the scope of the European directive on
	 * taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code
	 * EUDividendStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUDividendStatus
	 * SecuritiesTax.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUDvddSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUDividendStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEUDividendStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUDividendStatus;
			componentContext_lazy = () -> TaxCalculationInformation4.mmObject();
			isDerived = false;
			xmlTag = "EUDvddSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUDividendStatus1Code.mmObject();
		}
	};
	protected Extended350Code extendedEUDividendStatus;
	/**
	 * Specifies whether dividend is in the scope of the European directive on
	 * taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUDividendStatus
	 * SecuritiesTax.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedEUDvddSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedEUDividendStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedEUDividendStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUDividendStatus;
			componentContext_lazy = () -> TaxCalculationInformation4.mmObject();
			isDerived = false;
			xmlTag = "XtndedEUDvddSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedEUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	/**
	 * Either EUCapitalGain or ExtendedEUCapitalGain may be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUCapitalGain
	 * TaxCalculationInformation4.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUCapitalGain
	 * TaxCalculationInformation4.mmExtendedEUCapitalGain}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUCapitalGainOrExtendedEUCapitalGainRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either EUCapitalGain or ExtendedEUCapitalGain may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmEUCapitalGainOrExtendedEUCapitalGainRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUCapitalGainOrExtendedEUCapitalGainRule";
			definition = "Either EUCapitalGain or ExtendedEUCapitalGain may be present, but not both.";
			messageComponent_lazy = () -> TaxCalculationInformation4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmEUCapitalGain, TaxCalculationInformation4.mmExtendedEUCapitalGain);
		}
	};
	/**
	 * Either EUDividendStatus or ExtendedEUDividendStatus may be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4
	 * TaxCalculationInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUDividendStatus
	 * TaxCalculationInformation4.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUDividendStatus
	 * TaxCalculationInformation4.mmExtendedEUDividendStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUDividendStatusOrExtendedEUDividendStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either EUDividendStatus or ExtendedEUDividendStatus may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmEUDividendStatusOrExtendedEUDividendStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUDividendStatusOrExtendedEUDividendStatusRule";
			definition = "Either EUDividendStatus or ExtendedEUDividendStatus may be present, but not both.";
			messageComponent_lazy = () -> TaxCalculationInformation4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmEUDividendStatus, TaxCalculationInformation4.mmExtendedEUDividendStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmEUCapitalGain, TaxCalculationInformation4.mmExtendedEUCapitalGain, TaxCalculationInformation4.mmPercentageOfDebtClaim,
						TaxCalculationInformation4.mmPercentageGrandfatheredDebt, TaxCalculationInformation4.mmTaxableIncomePerDividend, TaxCalculationInformation4.mmEUDividendStatus, TaxCalculationInformation4.mmExtendedEUDividendStatus);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TaxCalculationInformation4";
				definition = "Information used to calculate the tax.";
				xors_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmEUCapitalGainOrExtendedEUCapitalGainRule, TaxCalculationInformation4.mmEUDividendStatusOrExtendedEUDividendStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "EUCptlGn")
	public EUCapitalGain2Code getEUCapitalGain() {
		return eUCapitalGain;
	}

	public void setEUCapitalGain(EUCapitalGain2Code eUCapitalGain) {
		this.eUCapitalGain = eUCapitalGain;
	}

	@XmlElement(name = "XtndedEUCptlGn")
	public Extended350Code getExtendedEUCapitalGain() {
		return extendedEUCapitalGain;
	}

	public void setExtendedEUCapitalGain(Extended350Code extendedEUCapitalGain) {
		this.extendedEUCapitalGain = extendedEUCapitalGain;
	}

	@XmlElement(name = "PctgOfDebtClm")
	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
	}

	@XmlElement(name = "PctgGrdfthdDebt")
	public PercentageRate getPercentageGrandfatheredDebt() {
		return percentageGrandfatheredDebt;
	}

	public void setPercentageGrandfatheredDebt(PercentageRate percentageGrandfatheredDebt) {
		this.percentageGrandfatheredDebt = percentageGrandfatheredDebt;
	}

	@XmlElement(name = "TaxblIncmPerDvdd")
	public ActiveOrHistoricCurrencyAnd13DecimalAmount getTaxableIncomePerDividend() {
		return taxableIncomePerDividend;
	}

	public void setTaxableIncomePerDividend(ActiveOrHistoricCurrencyAnd13DecimalAmount taxableIncomePerDividend) {
		this.taxableIncomePerDividend = taxableIncomePerDividend;
	}

	@XmlElement(name = "EUDvddSts")
	public EUDividendStatus1Code getEUDividendStatus() {
		return eUDividendStatus;
	}

	public void setEUDividendStatus(EUDividendStatus1Code eUDividendStatus) {
		this.eUDividendStatus = eUDividendStatus;
	}

	@XmlElement(name = "XtndedEUDvddSts")
	public Extended350Code getExtendedEUDividendStatus() {
		return extendedEUDividendStatus;
	}

	public void setExtendedEUDividendStatus(Extended350Code extendedEUDividendStatus) {
		this.extendedEUDividendStatus = extendedEUDividendStatus;
	}
}