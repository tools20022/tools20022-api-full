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
import com.tools20022.repository.codeset.TaxAdvantageType1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides extra tax details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmPlaceAndName
 * TaxSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxSD1#mmForeignTaxCreditAmount
 * TaxSD1.mmForeignTaxCreditAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmForeignTaxCreditRate
 * TaxSD1.mmForeignTaxCreditRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmForeignSourceAmount
 * TaxSD1.mmForeignSourceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmForeignSourceRate
 * TaxSD1.mmForeignSourceRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmTaxAdvantageType
 * TaxSD1.mmTaxAdvantageType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmTaxAdvantageAmount
 * TaxSD1.mmTaxAdvantageAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmTaxAdvantageRate
 * TaxSD1.mmTaxAdvantageRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmSundryOrOtherRate
 * TaxSD1.mmSundryOrOtherRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmTaxDeferredRate
 * TaxSD1.mmTaxDeferredRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxSD1#mmTaxFreeRate
 * TaxSD1.mmTaxFreeRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides extra tax details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxSD1", propOrder = {"placeAndName", "foreignTaxCreditAmount", "foreignTaxCreditRate", "foreignSourceAmount", "foreignSourceRate", "taxAdvantageType", "taxAdvantageAmount", "taxAdvantageRate", "sundryOrOtherRate",
		"taxDeferredRate", "taxFreeRate"})
public class TaxSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<TaxSD1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(TaxSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnTaxCdtAmt")
	protected RestrictedFINActiveCurrencyAndAmount foreignTaxCreditAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnTaxCdtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of foreign tax credit per security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<RestrictedFINActiveCurrencyAndAmount>> mmForeignTaxCreditAmount = new MMMessageAttribute<TaxSD1, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnTaxCdtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxCreditAmount";
			definition = "Amount of foreign tax credit per security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(TaxSD1 obj) {
			return obj.getForeignTaxCreditAmount();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setForeignTaxCreditAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnTaxCdtRate")
	protected PercentageRate foreignTaxCreditRate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnTaxCdtRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxCreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percent of foreign tax credit per security\n.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<PercentageRate>> mmForeignTaxCreditRate = new MMMessageAttribute<TaxSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnTaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxCreditRate";
			definition = "Percent of foreign tax credit per security\n.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxSD1 obj) {
			return obj.getForeignTaxCreditRate();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<PercentageRate> value) {
			obj.setForeignTaxCreditRate(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnSrcAmt")
	protected RestrictedFINActiveCurrencyAndAmount foreignSourceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnSrcAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignSourceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the dividend that is being paid out of income earned in a foreign jurisdiction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<RestrictedFINActiveCurrencyAndAmount>> mmForeignSourceAmount = new MMMessageAttribute<TaxSD1, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnSrcAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignSourceAmount";
			definition = "Amount of the dividend that is being paid out of income earned in a foreign jurisdiction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(TaxSD1 obj) {
			return obj.getForeignSourceAmount();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setForeignSourceAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnSrcRate")
	protected PercentageRate foreignSourceRate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnSrcRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignSourceRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the dividend that is being paid out of income earned in a foreign jurisdiction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<PercentageRate>> mmForeignSourceRate = new MMMessageAttribute<TaxSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnSrcRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignSourceRate";
			definition = "Percentage of the dividend that is being paid out of income earned in a foreign jurisdiction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxSD1 obj) {
			return obj.getForeignSourceRate();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<PercentageRate> value) {
			obj.setForeignSourceRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAdvntgTp")
	protected TaxAdvantageType1Code taxAdvantageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxAdvantageType1Code
	 * TaxAdvantageType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdvntgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdvantageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of tax advantage on the dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<TaxAdvantageType1Code>> mmTaxAdvantageType = new MMMessageAttribute<TaxSD1, Optional<TaxAdvantageType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxAdvntgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdvantageType";
			definition = "Form of tax advantage on the dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxAdvantageType1Code.mmObject();
		}

		@Override
		public Optional<TaxAdvantageType1Code> getValue(TaxSD1 obj) {
			return obj.getTaxAdvantageType();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<TaxAdvantageType1Code> value) {
			obj.setTaxAdvantageType(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAdvntgAmt")
	protected RestrictedFINActiveCurrencyAndAmount taxAdvantageAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdvntgAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdvantageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the tax advantage on the dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTaxAdvantageAmount = new MMMessageAttribute<TaxSD1, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxAdvntgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdvantageAmount";
			definition = "Amount of the tax advantage on the dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(TaxSD1 obj) {
			return obj.getTaxAdvantageAmount();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTaxAdvantageAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAdvntgRate")
	protected PercentageRate taxAdvantageRate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdvntgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdvantageRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percent of the tax advantage on the dividend."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<PercentageRate>> mmTaxAdvantageRate = new MMMessageAttribute<TaxSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxAdvntgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdvantageRate";
			definition = "Percent of the tax advantage on the dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxSD1 obj) {
			return obj.getTaxAdvantageRate();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<PercentageRate> value) {
			obj.setTaxAdvantageRate(value.orElse(null));
		}
	};
	@XmlElement(name = "SndryOrOthrRate")
	protected PercentageRate sundryOrOtherRate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndryOrOthrRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the amount of money related to taxable income that cannot be categorised."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<PercentageRate>> mmSundryOrOtherRate = new MMMessageAttribute<TaxSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "SndryOrOthrRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherRate";
			definition = "Percentage of the amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxSD1 obj) {
			return obj.getSundryOrOtherRate();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<PercentageRate> value) {
			obj.setSundryOrOtherRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxDfrrdRate")
	protected PercentageRate taxDeferredRate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDfrrdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferredRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the amount of income eligible for deferred taxation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<PercentageRate>> mmTaxDeferredRate = new MMMessageAttribute<TaxSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxDfrrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferredRate";
			definition = "Percentage of the amount of income eligible for deferred taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxSD1 obj) {
			return obj.getTaxDeferredRate();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<PercentageRate> value) {
			obj.setTaxDeferredRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxFreeRate")
	protected PercentageRate taxFreeRate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxFreeRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFreeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the amount of money that has not been subject to taxation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxSD1, Optional<PercentageRate>> mmTaxFreeRate = new MMMessageAttribute<TaxSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxFreeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFreeRate";
			definition = "Percentage of the amount of money that has not been subject to taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxSD1 obj) {
			return obj.getTaxFreeRate();
		}

		@Override
		public void setValue(TaxSD1 obj, Optional<PercentageRate> value) {
			obj.setTaxFreeRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxSD1.mmPlaceAndName, com.tools20022.repository.msg.TaxSD1.mmForeignTaxCreditAmount, com.tools20022.repository.msg.TaxSD1.mmForeignTaxCreditRate,
						com.tools20022.repository.msg.TaxSD1.mmForeignSourceAmount, com.tools20022.repository.msg.TaxSD1.mmForeignSourceRate, com.tools20022.repository.msg.TaxSD1.mmTaxAdvantageType,
						com.tools20022.repository.msg.TaxSD1.mmTaxAdvantageAmount, com.tools20022.repository.msg.TaxSD1.mmTaxAdvantageRate, com.tools20022.repository.msg.TaxSD1.mmSundryOrOtherRate,
						com.tools20022.repository.msg.TaxSD1.mmTaxDeferredRate, com.tools20022.repository.msg.TaxSD1.mmTaxFreeRate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxSD1";
				definition = "Provides extra tax details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public TaxSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getForeignTaxCreditAmount() {
		return foreignTaxCreditAmount == null ? Optional.empty() : Optional.of(foreignTaxCreditAmount);
	}

	public TaxSD1 setForeignTaxCreditAmount(RestrictedFINActiveCurrencyAndAmount foreignTaxCreditAmount) {
		this.foreignTaxCreditAmount = foreignTaxCreditAmount;
		return this;
	}

	public Optional<PercentageRate> getForeignTaxCreditRate() {
		return foreignTaxCreditRate == null ? Optional.empty() : Optional.of(foreignTaxCreditRate);
	}

	public TaxSD1 setForeignTaxCreditRate(PercentageRate foreignTaxCreditRate) {
		this.foreignTaxCreditRate = foreignTaxCreditRate;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getForeignSourceAmount() {
		return foreignSourceAmount == null ? Optional.empty() : Optional.of(foreignSourceAmount);
	}

	public TaxSD1 setForeignSourceAmount(RestrictedFINActiveCurrencyAndAmount foreignSourceAmount) {
		this.foreignSourceAmount = foreignSourceAmount;
		return this;
	}

	public Optional<PercentageRate> getForeignSourceRate() {
		return foreignSourceRate == null ? Optional.empty() : Optional.of(foreignSourceRate);
	}

	public TaxSD1 setForeignSourceRate(PercentageRate foreignSourceRate) {
		this.foreignSourceRate = foreignSourceRate;
		return this;
	}

	public Optional<TaxAdvantageType1Code> getTaxAdvantageType() {
		return taxAdvantageType == null ? Optional.empty() : Optional.of(taxAdvantageType);
	}

	public TaxSD1 setTaxAdvantageType(TaxAdvantageType1Code taxAdvantageType) {
		this.taxAdvantageType = taxAdvantageType;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTaxAdvantageAmount() {
		return taxAdvantageAmount == null ? Optional.empty() : Optional.of(taxAdvantageAmount);
	}

	public TaxSD1 setTaxAdvantageAmount(RestrictedFINActiveCurrencyAndAmount taxAdvantageAmount) {
		this.taxAdvantageAmount = taxAdvantageAmount;
		return this;
	}

	public Optional<PercentageRate> getTaxAdvantageRate() {
		return taxAdvantageRate == null ? Optional.empty() : Optional.of(taxAdvantageRate);
	}

	public TaxSD1 setTaxAdvantageRate(PercentageRate taxAdvantageRate) {
		this.taxAdvantageRate = taxAdvantageRate;
		return this;
	}

	public Optional<PercentageRate> getSundryOrOtherRate() {
		return sundryOrOtherRate == null ? Optional.empty() : Optional.of(sundryOrOtherRate);
	}

	public TaxSD1 setSundryOrOtherRate(PercentageRate sundryOrOtherRate) {
		this.sundryOrOtherRate = sundryOrOtherRate;
		return this;
	}

	public Optional<PercentageRate> getTaxDeferredRate() {
		return taxDeferredRate == null ? Optional.empty() : Optional.of(taxDeferredRate);
	}

	public TaxSD1 setTaxDeferredRate(PercentageRate taxDeferredRate) {
		this.taxDeferredRate = taxDeferredRate;
		return this;
	}

	public Optional<PercentageRate> getTaxFreeRate() {
		return taxFreeRate == null ? Optional.empty() : Optional.of(taxFreeRate);
	}

	public TaxSD1 setTaxFreeRate(PercentageRate taxFreeRate) {
		this.taxFreeRate = taxFreeRate;
		return this;
	}
}