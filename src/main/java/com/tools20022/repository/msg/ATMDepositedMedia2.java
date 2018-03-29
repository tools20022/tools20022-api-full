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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CheckCodeLine1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.Percentage;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Media item that are deposited.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositedMedia2#mmCount
 * ATMDepositedMedia2.mmCount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositedMedia2#mmUnitValue
 * ATMDepositedMedia2.mmUnitValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositedMedia2#mmCurrency
 * ATMDepositedMedia2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2#mmCodeLineFormat
 * ATMDepositedMedia2.mmCodeLineFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositedMedia2#mmCodeLine
 * ATMDepositedMedia2.mmCodeLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2#mmScannedValue
 * ATMDepositedMedia2.mmScannedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2#mmConfidenceLevel
 * ATMDepositedMedia2.mmConfidenceLevel}</li>
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
 * "ATMDepositedMedia2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Media item that are deposited."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositedMedia2", propOrder = {"count", "unitValue", "currency", "codeLineFormat", "codeLine", "scannedValue", "confidenceLevel"})
public class ATMDepositedMedia2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cnt")
	protected Number count;
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
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Count"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of deposit media."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia2, Optional<Number>> mmCount = new MMMessageAttribute<ATMDepositedMedia2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "Cnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Count";
			definition = "Number of deposit media.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ATMDepositedMedia2 obj) {
			return obj.getCount();
		}

		@Override
		public void setValue(ATMDepositedMedia2 obj, Optional<Number> value) {
			obj.setCount(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitVal")
	protected ImpliedCurrencyAndAmount unitValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or denomination of one media item, if the media type is valued or entered by the customer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia2, Optional<ImpliedCurrencyAndAmount>> mmUnitValue = new MMMessageAttribute<ATMDepositedMedia2, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "UnitVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitValue";
			definition = "Amount or denomination of one media item, if the media type is valued or entered by the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMDepositedMedia2 obj) {
			return obj.getUnitValue();
		}

		@Override
		public void setValue(ATMDepositedMedia2 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setUnitValue(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of media items, if valued and different from base currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia2, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<ATMDepositedMedia2, Optional<ActiveCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of media items, if valued and different from base currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(ATMDepositedMedia2 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ATMDepositedMedia2 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "CdLineFrmt")
	protected CheckCodeLine1Code codeLineFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CheckCodeLine1Code
	 * CheckCodeLine1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdLineFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CodeLineFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the check code line."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia2, Optional<CheckCodeLine1Code>> mmCodeLineFormat = new MMMessageAttribute<ATMDepositedMedia2, Optional<CheckCodeLine1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "CdLineFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CodeLineFormat";
			definition = "Format of the check code line.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CheckCodeLine1Code.mmObject();
		}

		@Override
		public Optional<CheckCodeLine1Code> getValue(ATMDepositedMedia2 obj) {
			return obj.getCodeLineFormat();
		}

		@Override
		public void setValue(ATMDepositedMedia2 obj, Optional<CheckCodeLine1Code> value) {
			obj.setCodeLineFormat(value.orElse(null));
		}
	};
	@XmlElement(name = "CdLine")
	protected Max70Text codeLine;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CodeLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Check code line."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia2, Optional<Max70Text>> mmCodeLine = new MMMessageAttribute<ATMDepositedMedia2, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "CdLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CodeLine";
			definition = "Check code line.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(ATMDepositedMedia2 obj) {
			return obj.getCodeLine();
		}

		@Override
		public void setValue(ATMDepositedMedia2 obj, Optional<Max70Text> value) {
			obj.setCodeLine(value.orElse(null));
		}
	};
	@XmlElement(name = "ScnndVal")
	protected ImpliedCurrencyAndAmount scannedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScnndVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScannedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Check amount scanned by the check reader."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia2, Optional<ImpliedCurrencyAndAmount>> mmScannedValue = new MMMessageAttribute<ATMDepositedMedia2, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "ScnndVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScannedValue";
			definition = "Check amount scanned by the check reader.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMDepositedMedia2 obj) {
			return obj.getScannedValue();
		}

		@Override
		public void setValue(ATMDepositedMedia2 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setScannedValue(value.orElse(null));
		}
	};
	@XmlElement(name = "CnfdncLvl")
	protected Percentage confidenceLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Percentage
	 * Percentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnfdncLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfidenceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of the confidence in the check amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia2, Optional<Percentage>> mmConfidenceLevel = new MMMessageAttribute<ATMDepositedMedia2, Optional<Percentage>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "CnfdncLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfidenceLevel";
			definition = "Percentage of the confidence in the check amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Percentage.mmObject();
		}

		@Override
		public Optional<Percentage> getValue(ATMDepositedMedia2 obj) {
			return obj.getConfidenceLevel();
		}

		@Override
		public void setValue(ATMDepositedMedia2 obj, Optional<Percentage> value) {
			obj.setConfidenceLevel(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositedMedia2.mmCount, com.tools20022.repository.msg.ATMDepositedMedia2.mmUnitValue, com.tools20022.repository.msg.ATMDepositedMedia2.mmCurrency,
						com.tools20022.repository.msg.ATMDepositedMedia2.mmCodeLineFormat, com.tools20022.repository.msg.ATMDepositedMedia2.mmCodeLine, com.tools20022.repository.msg.ATMDepositedMedia2.mmScannedValue,
						com.tools20022.repository.msg.ATMDepositedMedia2.mmConfidenceLevel);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositedMedia2";
				definition = "Media item that are deposited.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getCount() {
		return count == null ? Optional.empty() : Optional.of(count);
	}

	public ATMDepositedMedia2 setCount(Number count) {
		this.count = count;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getUnitValue() {
		return unitValue == null ? Optional.empty() : Optional.of(unitValue);
	}

	public ATMDepositedMedia2 setUnitValue(ImpliedCurrencyAndAmount unitValue) {
		this.unitValue = unitValue;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public ATMDepositedMedia2 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<CheckCodeLine1Code> getCodeLineFormat() {
		return codeLineFormat == null ? Optional.empty() : Optional.of(codeLineFormat);
	}

	public ATMDepositedMedia2 setCodeLineFormat(CheckCodeLine1Code codeLineFormat) {
		this.codeLineFormat = codeLineFormat;
		return this;
	}

	public Optional<Max70Text> getCodeLine() {
		return codeLine == null ? Optional.empty() : Optional.of(codeLine);
	}

	public ATMDepositedMedia2 setCodeLine(Max70Text codeLine) {
		this.codeLine = codeLine;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getScannedValue() {
		return scannedValue == null ? Optional.empty() : Optional.of(scannedValue);
	}

	public ATMDepositedMedia2 setScannedValue(ImpliedCurrencyAndAmount scannedValue) {
		this.scannedValue = scannedValue;
		return this;
	}

	public Optional<Percentage> getConfidenceLevel() {
		return confidenceLevel == null ? Optional.empty() : Optional.of(confidenceLevel);
	}

	public ATMDepositedMedia2 setConfidenceLevel(Percentage confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
		return this;
	}
}