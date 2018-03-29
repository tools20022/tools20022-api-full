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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
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
 * Details of a currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmAlphaCode
 * CurrencyDetails1.mmAlphaCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmNumericCode
 * CurrencyDetails1.mmNumericCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmDecimal
 * CurrencyDetails1.mmDecimal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails1#mmName
 * CurrencyDetails1.mmName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of a currency."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails2
 * CurrencyDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails3
 * CurrencyDetails3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyDetails1", propOrder = {"alphaCode", "numericCode", "decimal", "name"})
public class CurrencyDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AlphaCd", required = true)
	protected CurrencyCode alphaCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1
	 * CurrencyDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AlphaCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlphaCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alpha currency code (ISO 4217, 3 alphanumeric characters)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmAlphaCode
	 * CurrencyDetails2.mmAlphaCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmAlphaCode
	 * CurrencyDetails3.mmAlphaCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails1, CurrencyCode> mmAlphaCode = new MMMessageAttribute<CurrencyDetails1, CurrencyCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails1.mmObject();
			isDerived = false;
			xmlTag = "AlphaCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlphaCode";
			definition = "Alpha currency code (ISO 4217, 3 alphanumeric characters).";
			nextVersions_lazy = () -> Arrays.asList(CurrencyDetails2.mmAlphaCode, CurrencyDetails3.mmAlphaCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CurrencyDetails1 obj) {
			return obj.getAlphaCode();
		}

		@Override
		public void setValue(CurrencyDetails1 obj, CurrencyCode value) {
			obj.setAlphaCode(value);
		}
	};
	@XmlElement(name = "NmrcCd", required = true)
	protected Exact3NumericText numericCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1
	 * CurrencyDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmrcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumericCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numeric currency code (ISO 4217, 3 numeric characters)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmNumericCode
	 * CurrencyDetails2.mmNumericCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmNumericCode
	 * CurrencyDetails3.mmNumericCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails1, Exact3NumericText> mmNumericCode = new MMMessageAttribute<CurrencyDetails1, Exact3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails1.mmObject();
			isDerived = false;
			xmlTag = "NmrcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumericCode";
			definition = "Numeric currency code (ISO 4217, 3 numeric characters).";
			nextVersions_lazy = () -> Arrays.asList(CurrencyDetails2.mmNumericCode, CurrencyDetails3.mmNumericCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(CurrencyDetails1 obj) {
			return obj.getNumericCode();
		}

		@Override
		public void setValue(CurrencyDetails1 obj, Exact3NumericText value) {
			obj.setNumericCode(value);
		}
	};
	@XmlElement(name = "Dcml", required = true)
	protected Number decimal;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1
	 * CurrencyDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dcml"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximal number of digits after the decimal separator for the currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmDecimal
	 * CurrencyDetails2.mmDecimal}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmDecimal
	 * CurrencyDetails3.mmDecimal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails1, Number> mmDecimal = new MMMessageAttribute<CurrencyDetails1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails1.mmObject();
			isDerived = false;
			xmlTag = "Dcml";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decimal";
			definition = "Maximal number of digits after the decimal separator for the currency.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyDetails2.mmDecimal, CurrencyDetails3.mmDecimal);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(CurrencyDetails1 obj) {
			return obj.getDecimal();
		}

		@Override
		public void setValue(CurrencyDetails1 obj, Number value) {
			obj.setDecimal(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max35Text name;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails1
	 * CurrencyDetails1}</li>
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
	 * definition} = "Full name of the currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails2#mmName
	 * CurrencyDetails2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmName
	 * CurrencyDetails3.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails1, Optional<Max35Text>> mmName = new MMMessageAttribute<CurrencyDetails1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Full name of the currency.";
			nextVersions_lazy = () -> Arrays.asList(CurrencyDetails2.mmName, CurrencyDetails3.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CurrencyDetails1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CurrencyDetails1 obj, Optional<Max35Text> value) {
			obj.setName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyDetails1.mmAlphaCode, com.tools20022.repository.msg.CurrencyDetails1.mmNumericCode, com.tools20022.repository.msg.CurrencyDetails1.mmDecimal,
						com.tools20022.repository.msg.CurrencyDetails1.mmName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyDetails1";
				definition = "Details of a currency.";
				nextVersions_lazy = () -> Arrays.asList(CurrencyDetails2.mmObject(), CurrencyDetails3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getAlphaCode() {
		return alphaCode;
	}

	public CurrencyDetails1 setAlphaCode(CurrencyCode alphaCode) {
		this.alphaCode = Objects.requireNonNull(alphaCode);
		return this;
	}

	public Exact3NumericText getNumericCode() {
		return numericCode;
	}

	public CurrencyDetails1 setNumericCode(Exact3NumericText numericCode) {
		this.numericCode = Objects.requireNonNull(numericCode);
		return this;
	}

	public Number getDecimal() {
		return decimal;
	}

	public CurrencyDetails1 setDecimal(Number decimal) {
		this.decimal = Objects.requireNonNull(decimal);
		return this;
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CurrencyDetails1 setName(Max35Text name) {
		this.name = name;
		return this;
	}
}