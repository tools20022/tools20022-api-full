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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMDepositedMedia2", propOrder = {"count", "unitValue", "currency", "codeLineFormat", "codeLine", "scannedValue", "confidenceLevel"})
public class ATMDepositedMedia2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number count;
	/**
	 * Number of deposit media.
	 * <p>
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
	public static final MMMessageAttribute mmCount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "Cnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Count";
			definition = "Number of deposit media.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount unitValue;
	/**
	 * Amount or denomination of one media item, if the media type is valued or
	 * entered by the customer.
	 * <p>
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
	public static final MMMessageAttribute mmUnitValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "UnitVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitValue";
			definition = "Amount or denomination of one media item, if the media type is valued or entered by the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyCode currency;
	/**
	 * Currency of media items, if valued and different from base currency.
	 * <p>
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
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of media items, if valued and different from base currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected CheckCodeLine1Code codeLineFormat;
	/**
	 * Format of the check code line.
	 * <p>
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
	public static final MMMessageAttribute mmCodeLineFormat = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "CdLineFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CodeLineFormat";
			definition = "Format of the check code line.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CheckCodeLine1Code.mmObject();
		}
	};
	protected Max70Text codeLine;
	/**
	 * Check code line.
	 * <p>
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
	public static final MMMessageAttribute mmCodeLine = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "CdLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CodeLine";
			definition = "Check code line.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount scannedValue;
	/**
	 * Check amount scanned by the check reader.
	 * <p>
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
	public static final MMMessageAttribute mmScannedValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "ScnndVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScannedValue";
			definition = "Check amount scanned by the check reader.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Percentage confidenceLevel;
	/**
	 * Percentage of the confidence in the check amount.
	 * <p>
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
	public static final MMMessageAttribute mmConfidenceLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia2.mmObject();
			isDerived = false;
			xmlTag = "CnfdncLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfidenceLevel";
			definition = "Percentage of the confidence in the check amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Percentage.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMDepositedMedia2.mmCount, ATMDepositedMedia2.mmUnitValue, ATMDepositedMedia2.mmCurrency, ATMDepositedMedia2.mmCodeLineFormat, ATMDepositedMedia2.mmCodeLine,
						ATMDepositedMedia2.mmScannedValue, ATMDepositedMedia2.mmConfidenceLevel);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositedMedia2";
				definition = "Media item that are deposited.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cnt")
	public Number getCount() {
		return count;
	}

	public void setCount(Number count) {
		this.count = count;
	}

	@XmlElement(name = "UnitVal")
	public ImpliedCurrencyAndAmount getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(ImpliedCurrencyAndAmount unitValue) {
		this.unitValue = unitValue;
	}

	@XmlElement(name = "Ccy")
	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "CdLineFrmt")
	public CheckCodeLine1Code getCodeLineFormat() {
		return codeLineFormat;
	}

	public void setCodeLineFormat(CheckCodeLine1Code codeLineFormat) {
		this.codeLineFormat = codeLineFormat;
	}

	@XmlElement(name = "CdLine")
	public Max70Text getCodeLine() {
		return codeLine;
	}

	public void setCodeLine(Max70Text codeLine) {
		this.codeLine = codeLine;
	}

	@XmlElement(name = "ScnndVal")
	public ImpliedCurrencyAndAmount getScannedValue() {
		return scannedValue;
	}

	public void setScannedValue(ImpliedCurrencyAndAmount scannedValue) {
		this.scannedValue = scannedValue;
	}

	@XmlElement(name = "CnfdncLvl")
	public Percentage getConfidenceLevel() {
		return confidenceLevel;
	}

	public void setConfidenceLevel(Percentage confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}
}