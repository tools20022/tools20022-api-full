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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides extra tax details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TaxSD1", propOrder = {"placeAndName", "foreignTaxCreditAmount", "foreignTaxCreditRate", "foreignSourceAmount", "foreignSourceRate", "taxAdvantageType", "taxAdvantageAmount", "taxAdvantageRate", "sundryOrOtherRate",
		"taxDeferredRate", "taxFreeRate"})
public class TaxSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * Unambiguous reference to the location where the supplementary data must
	 * be inserted in the message instance. <br>
	 * <br>
	 * In the case of XML, this is expressed by a valid XPath.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount foreignTaxCreditAmount;
	/**
	 * Amount of foreign tax credit per security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of foreign tax credit per security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignTaxCreditAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnTaxCdtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxCreditAmount";
			definition = "Amount of foreign tax credit per security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate foreignTaxCreditRate;
	/**
	 * Percent of foreign tax credit per security .<br>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnTaxCdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignTaxCreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percent of foreign tax credit per security\n.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignTaxCreditRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnTaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignTaxCreditRate";
			definition = "Percent of foreign tax credit per security\n.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount foreignSourceAmount;
	/**
	 * Amount of the dividend that is being paid out of income earned in a
	 * foreign jurisdiction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignSourceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the dividend that is being paid out of income earned in a foreign jurisdiction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignSourceAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnSrcAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignSourceAmount";
			definition = "Amount of the dividend that is being paid out of income earned in a foreign jurisdiction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate foreignSourceRate;
	/**
	 * Percentage of the dividend that is being paid out of income earned in a
	 * foreign jurisdiction.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnSrcRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignSourceRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the dividend that is being paid out of income earned in a foreign jurisdiction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignSourceRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "FrgnSrcRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignSourceRate";
			definition = "Percentage of the dividend that is being paid out of income earned in a foreign jurisdiction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected TaxAdvantageType1Code taxAdvantageType;
	/**
	 * Form of tax advantage on the dividend.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdvantageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of tax advantage on the dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAdvantageType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxAdvntgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdvantageType";
			definition = "Form of tax advantage on the dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxAdvantageType1Code.mmObject();
		}
	};
	protected RestrictedFINActiveCurrencyAndAmount taxAdvantageAmount;
	/**
	 * Amount of the tax advantage on the dividend.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdvantageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the tax advantage on the dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAdvantageAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxAdvntgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdvantageAmount";
			definition = "Amount of the tax advantage on the dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate taxAdvantageRate;
	/**
	 * Percent of the tax advantage on the dividend.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdvntgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdvantageRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percent of the tax advantage on the dividend."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxAdvantageRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxAdvntgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdvantageRate";
			definition = "Percent of the tax advantage on the dividend.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate sundryOrOtherRate;
	/**
	 * Percentage of the amount of money related to taxable income that cannot
	 * be categorised.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndryOrOthrRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the amount of money related to taxable income that cannot be categorised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSundryOrOtherRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "SndryOrOthrRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherRate";
			definition = "Percentage of the amount of money related to taxable income that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate taxDeferredRate;
	/**
	 * Percentage of the amount of income eligible for deferred taxation.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDfrrdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferredRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the amount of income eligible for deferred taxation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxDeferredRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxDfrrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferredRate";
			definition = "Percentage of the amount of income eligible for deferred taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate taxFreeRate;
	/**
	 * Percentage of the amount of money that has not been subject to taxation.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxSD1
	 * TaxSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxFreeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFreeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the amount of money that has not been subject to taxation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxFreeRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxSD1.mmObject();
			isDerived = false;
			xmlTag = "TaxFreeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFreeRate";
			definition = "Percentage of the amount of money that has not been subject to taxation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TaxSD1.mmPlaceAndName, TaxSD1.mmForeignTaxCreditAmount, TaxSD1.mmForeignTaxCreditRate, TaxSD1.mmForeignSourceAmount, TaxSD1.mmForeignSourceRate, TaxSD1.mmTaxAdvantageType,
						TaxSD1.mmTaxAdvantageAmount, TaxSD1.mmTaxAdvantageRate, TaxSD1.mmSundryOrOtherRate, TaxSD1.mmTaxDeferredRate, TaxSD1.mmTaxFreeRate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxSD1";
				definition = "Provides extra tax details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm")
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "FrgnTaxCdtAmt")
	public RestrictedFINActiveCurrencyAndAmount getForeignTaxCreditAmount() {
		return foreignTaxCreditAmount;
	}

	public void setForeignTaxCreditAmount(RestrictedFINActiveCurrencyAndAmount foreignTaxCreditAmount) {
		this.foreignTaxCreditAmount = foreignTaxCreditAmount;
	}

	@XmlElement(name = "FrgnTaxCdtRate")
	public PercentageRate getForeignTaxCreditRate() {
		return foreignTaxCreditRate;
	}

	public void setForeignTaxCreditRate(PercentageRate foreignTaxCreditRate) {
		this.foreignTaxCreditRate = foreignTaxCreditRate;
	}

	@XmlElement(name = "FrgnSrcAmt")
	public RestrictedFINActiveCurrencyAndAmount getForeignSourceAmount() {
		return foreignSourceAmount;
	}

	public void setForeignSourceAmount(RestrictedFINActiveCurrencyAndAmount foreignSourceAmount) {
		this.foreignSourceAmount = foreignSourceAmount;
	}

	@XmlElement(name = "FrgnSrcRate")
	public PercentageRate getForeignSourceRate() {
		return foreignSourceRate;
	}

	public void setForeignSourceRate(PercentageRate foreignSourceRate) {
		this.foreignSourceRate = foreignSourceRate;
	}

	@XmlElement(name = "TaxAdvntgTp")
	public TaxAdvantageType1Code getTaxAdvantageType() {
		return taxAdvantageType;
	}

	public void setTaxAdvantageType(TaxAdvantageType1Code taxAdvantageType) {
		this.taxAdvantageType = taxAdvantageType;
	}

	@XmlElement(name = "TaxAdvntgAmt")
	public RestrictedFINActiveCurrencyAndAmount getTaxAdvantageAmount() {
		return taxAdvantageAmount;
	}

	public void setTaxAdvantageAmount(RestrictedFINActiveCurrencyAndAmount taxAdvantageAmount) {
		this.taxAdvantageAmount = taxAdvantageAmount;
	}

	@XmlElement(name = "TaxAdvntgRate")
	public PercentageRate getTaxAdvantageRate() {
		return taxAdvantageRate;
	}

	public void setTaxAdvantageRate(PercentageRate taxAdvantageRate) {
		this.taxAdvantageRate = taxAdvantageRate;
	}

	@XmlElement(name = "SndryOrOthrRate")
	public PercentageRate getSundryOrOtherRate() {
		return sundryOrOtherRate;
	}

	public void setSundryOrOtherRate(PercentageRate sundryOrOtherRate) {
		this.sundryOrOtherRate = sundryOrOtherRate;
	}

	@XmlElement(name = "TaxDfrrdRate")
	public PercentageRate getTaxDeferredRate() {
		return taxDeferredRate;
	}

	public void setTaxDeferredRate(PercentageRate taxDeferredRate) {
		this.taxDeferredRate = taxDeferredRate;
	}

	@XmlElement(name = "TaxFreeRate")
	public PercentageRate getTaxFreeRate() {
		return taxFreeRate;
	}

	public void setTaxFreeRate(PercentageRate taxFreeRate) {
		this.taxFreeRate = taxFreeRate;
	}
}