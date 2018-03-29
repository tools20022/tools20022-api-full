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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.EUCapitalGain2Code;
import com.tools20022.repository.codeset.EUDividendStatus1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Tax14;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information regarding the total amount of taxes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#EUDividendStatusOrExtendedEUDividendStatusRule
 * TotalTaxes3.EUDividendStatusOrExtendedEUDividendStatusRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#EUCapitalGainOrExtendedEUCapitalGainRule
 * TotalTaxes3.EUCapitalGainOrExtendedEUCapitalGainRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmTotalAmountOfTaxes
 * TotalTaxes3.mmTotalAmountOfTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmTaxableIncomePerDividend
 * TotalTaxes3.mmTaxableIncomePerDividend}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3#mmEUCapitalGain
 * TotalTaxes3.mmEUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmExtendedEUCapitalGain
 * TotalTaxes3.mmExtendedEUCapitalGain}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3#mmEUDividendStatus
 * TotalTaxes3.mmEUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmExtendedEUDividendStatus
 * TotalTaxes3.mmExtendedEUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmPercentageOfDebtClaim
 * TotalTaxes3.mmPercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3#mmTaxDetails
 * TotalTaxes3.mmTaxDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalTaxes3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding the total amount of taxes."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InformativeTax1
 * InformativeTax1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalTaxes3", propOrder = {"totalAmountOfTaxes", "taxableIncomePerDividend", "eUCapitalGain", "extendedEUCapitalGain", "eUDividendStatus", "extendedEUDividendStatus", "percentageOfDebtClaim", "taxDetails"})
public class TotalTaxes3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlAmtOfTaxs")
	protected ActiveCurrencyAnd13DecimalAmount totalAmountOfTaxes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtOfTaxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountOfTaxes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total value of the taxes for a specific order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalTaxes3, Optional<ActiveCurrencyAnd13DecimalAmount>> mmTotalAmountOfTaxes = new MMMessageAttribute<TotalTaxes3, Optional<ActiveCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtOfTaxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountOfTaxes";
			definition = "Total value of the taxes for a specific order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAnd13DecimalAmount> getValue(TotalTaxes3 obj) {
			return obj.getTotalAmountOfTaxes();
		}

		@Override
		public void setValue(TotalTaxes3 obj, Optional<ActiveCurrencyAnd13DecimalAmount> value) {
			obj.setTotalAmountOfTaxes(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerDvdd")
	protected ActiveCurrencyAndAmount taxableIncomePerDividend;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividend
	 * SecuritiesTax.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
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
	public static final MMMessageAttribute<TotalTaxes3, Optional<ActiveCurrencyAndAmount>> mmTaxableIncomePerDividend = new MMMessageAttribute<TotalTaxes3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TotalTaxes3 obj) {
			return obj.getTaxableIncomePerDividend();
		}

		@Override
		public void setValue(TotalTaxes3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTaxableIncomePerDividend(value.orElse(null));
		}
	};
	@XmlElement(name = "EUCptlGn")
	protected EUCapitalGain2Code eUCapitalGain;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
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
	public static final MMMessageAttribute<TotalTaxes3, Optional<EUCapitalGain2Code>> mmEUCapitalGain = new MMMessageAttribute<TotalTaxes3, Optional<EUCapitalGain2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "EUCptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUCapitalGain2Code.mmObject();
		}

		@Override
		public Optional<EUCapitalGain2Code> getValue(TotalTaxes3 obj) {
			return obj.getEUCapitalGain();
		}

		@Override
		public void setValue(TotalTaxes3 obj, Optional<EUCapitalGain2Code> value) {
			obj.setEUCapitalGain(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedEUCptlGn")
	protected Extended350Code extendedEUCapitalGain;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
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
	public static final MMMessageAttribute<TotalTaxes3, Optional<Extended350Code>> mmExtendedEUCapitalGain = new MMMessageAttribute<TotalTaxes3, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "XtndedEUCptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedEUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(TotalTaxes3 obj) {
			return obj.getExtendedEUCapitalGain();
		}

		@Override
		public void setValue(TotalTaxes3 obj, Optional<Extended350Code> value) {
			obj.setExtendedEUCapitalGain(value.orElse(null));
		}
	};
	@XmlElement(name = "EUDvddSts")
	protected EUDividendStatus1Code eUDividendStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
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
	public static final MMMessageAttribute<TotalTaxes3, Optional<EUDividendStatus1Code>> mmEUDividendStatus = new MMMessageAttribute<TotalTaxes3, Optional<EUDividendStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUDividendStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "EUDvddSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUDividendStatus1Code.mmObject();
		}

		@Override
		public Optional<EUDividendStatus1Code> getValue(TotalTaxes3 obj) {
			return obj.getEUDividendStatus();
		}

		@Override
		public void setValue(TotalTaxes3 obj, Optional<EUDividendStatus1Code> value) {
			obj.setEUDividendStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedEUDvddSts")
	protected Extended350Code extendedEUDividendStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
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
	public static final MMMessageAttribute<TotalTaxes3, Optional<Extended350Code>> mmExtendedEUDividendStatus = new MMMessageAttribute<TotalTaxes3, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUDividendStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "XtndedEUDvddSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedEUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(TotalTaxes3 obj) {
			return obj.getExtendedEUDividendStatus();
		}

		@Override
		public void setValue(TotalTaxes3 obj, Optional<Extended350Code> value) {
			obj.setExtendedEUDividendStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "PctgOfDebtClm")
	protected PercentageRate percentageOfDebtClaim;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageOfDebtClaim
	 * InvestmentFundTax.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
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
	public static final MMMessageAttribute<TotalTaxes3, Optional<PercentageRate>> mmPercentageOfDebtClaim = new MMMessageAttribute<TotalTaxes3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmPercentageOfDebtClaim;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "PctgOfDebtClm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TotalTaxes3 obj) {
			return obj.getPercentageOfDebtClaim();
		}

		@Override
		public void setValue(TotalTaxes3 obj, Optional<PercentageRate> value) {
			obj.setPercentageOfDebtClaim(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxDtls")
	protected List<Tax14> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax14 Tax14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to a specific tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalTaxes3, List<Tax14>> mmTaxDetails = new MMMessageAssociationEnd<TotalTaxes3, List<Tax14>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Information related to a specific tax.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax14.mmObject();
		}

		@Override
		public List<Tax14> getValue(TotalTaxes3 obj) {
			return obj.getTaxDetails();
		}

		@Override
		public void setValue(TotalTaxes3 obj, List<Tax14> value) {
			obj.setTaxDetails(value);
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
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmEUDividendStatus
	 * TotalTaxes3.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmExtendedEUDividendStatus
	 * TotalTaxes3.mmExtendedEUDividendStatus}</li>
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
	public static final MMXor EUDividendStatusOrExtendedEUDividendStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUDividendStatusOrExtendedEUDividendStatusRule";
			definition = "Either EUDividendStatus or ExtendedEUDividendStatus may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTaxes3.mmEUDividendStatus, com.tools20022.repository.msg.TotalTaxes3.mmExtendedEUDividendStatus);
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
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3 TotalTaxes3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmEUCapitalGain
	 * TotalTaxes3.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmExtendedEUCapitalGain
	 * TotalTaxes3.mmExtendedEUCapitalGain}</li>
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
	public static final MMXor EUCapitalGainOrExtendedEUCapitalGainRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUCapitalGainOrExtendedEUCapitalGainRule";
			definition = "Either EUCapitalGain or ExtendedEUCapitalGain may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TotalTaxes3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTaxes3.mmEUCapitalGain, com.tools20022.repository.msg.TotalTaxes3.mmExtendedEUCapitalGain);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTaxes3.mmTotalAmountOfTaxes, com.tools20022.repository.msg.TotalTaxes3.mmTaxableIncomePerDividend,
						com.tools20022.repository.msg.TotalTaxes3.mmEUCapitalGain, com.tools20022.repository.msg.TotalTaxes3.mmExtendedEUCapitalGain, com.tools20022.repository.msg.TotalTaxes3.mmEUDividendStatus,
						com.tools20022.repository.msg.TotalTaxes3.mmExtendedEUDividendStatus, com.tools20022.repository.msg.TotalTaxes3.mmPercentageOfDebtClaim, com.tools20022.repository.msg.TotalTaxes3.mmTaxDetails);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TotalTaxes3";
				definition = "Information regarding the total amount of taxes.";
				nextVersions_lazy = () -> Arrays.asList(InformativeTax1.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTaxes3.EUDividendStatusOrExtendedEUDividendStatusRule, com.tools20022.repository.msg.TotalTaxes3.EUCapitalGainOrExtendedEUCapitalGainRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getTotalAmountOfTaxes() {
		return totalAmountOfTaxes == null ? Optional.empty() : Optional.of(totalAmountOfTaxes);
	}

	public TotalTaxes3 setTotalAmountOfTaxes(ActiveCurrencyAnd13DecimalAmount totalAmountOfTaxes) {
		this.totalAmountOfTaxes = totalAmountOfTaxes;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTaxableIncomePerDividend() {
		return taxableIncomePerDividend == null ? Optional.empty() : Optional.of(taxableIncomePerDividend);
	}

	public TotalTaxes3 setTaxableIncomePerDividend(ActiveCurrencyAndAmount taxableIncomePerDividend) {
		this.taxableIncomePerDividend = taxableIncomePerDividend;
		return this;
	}

	public Optional<EUCapitalGain2Code> getEUCapitalGain() {
		return eUCapitalGain == null ? Optional.empty() : Optional.of(eUCapitalGain);
	}

	public TotalTaxes3 setEUCapitalGain(EUCapitalGain2Code eUCapitalGain) {
		this.eUCapitalGain = eUCapitalGain;
		return this;
	}

	public Optional<Extended350Code> getExtendedEUCapitalGain() {
		return extendedEUCapitalGain == null ? Optional.empty() : Optional.of(extendedEUCapitalGain);
	}

	public TotalTaxes3 setExtendedEUCapitalGain(Extended350Code extendedEUCapitalGain) {
		this.extendedEUCapitalGain = extendedEUCapitalGain;
		return this;
	}

	public Optional<EUDividendStatus1Code> getEUDividendStatus() {
		return eUDividendStatus == null ? Optional.empty() : Optional.of(eUDividendStatus);
	}

	public TotalTaxes3 setEUDividendStatus(EUDividendStatus1Code eUDividendStatus) {
		this.eUDividendStatus = eUDividendStatus;
		return this;
	}

	public Optional<Extended350Code> getExtendedEUDividendStatus() {
		return extendedEUDividendStatus == null ? Optional.empty() : Optional.of(extendedEUDividendStatus);
	}

	public TotalTaxes3 setExtendedEUDividendStatus(Extended350Code extendedEUDividendStatus) {
		this.extendedEUDividendStatus = extendedEUDividendStatus;
		return this;
	}

	public Optional<PercentageRate> getPercentageOfDebtClaim() {
		return percentageOfDebtClaim == null ? Optional.empty() : Optional.of(percentageOfDebtClaim);
	}

	public TotalTaxes3 setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
		return this;
	}

	public List<Tax14> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public TotalTaxes3 setTaxDetails(List<Tax14> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}
}