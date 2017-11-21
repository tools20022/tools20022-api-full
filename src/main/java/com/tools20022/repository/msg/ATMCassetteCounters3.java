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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ATMMediaType3Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ATM cassette counter per unit value or globally.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmUnitValue
 * ATMCassetteCounters3.mmUnitValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrency
 * ATMCassetteCounters3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmMediaCategory
 * ATMCassetteCounters3.mmMediaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrentNumber
 * ATMCassetteCounters3.mmCurrentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrentAmount
 * ATMCassetteCounters3.mmCurrentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmFlowTotals
 * ATMCassetteCounters3.mmFlowTotals}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
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
 * "ATMCassetteCounters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM cassette counter per unit value or globally."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMCassetteCounters3", propOrder = {"unitValue", "currency", "mediaCategory", "currentNumber", "currentAmount", "flowTotals"})
public class ATMCassetteCounters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ImpliedCurrencyAndAmount unitValue;
	/**
	 * Amount of one media unit, if the media type is valued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
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
	 * definition} = "Amount of one media unit, if the media type is valued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "UnitVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitValue";
			definition = "Amount of one media unit, if the media type is valued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyCode currency;
	/**
	 * Currency of the media, if the media type is valued and different from the
	 * currency of the requested amount.
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
	 * {@linkplain com.tools20022.repository.entity.Price#mmCurrency
	 * Price.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
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
	 * "Currency of the media, if the media type is valued and different from the currency of the requested amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Price.mmCurrency;
			componentContext_lazy = () -> ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the media, if the media type is valued and different from the currency of the requested amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ATMMediaType3Code mediaCategory;
	/**
	 * Category of media items.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of media items."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMediaCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "MdiaCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaCategory";
			definition = "Category of media items.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType3Code.mmObject();
		}
	};
	protected Number currentNumber;
	/**
	 * Current number of media present in the cassette.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current number of media present in the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "CurNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentNumber";
			definition = "Current number of media present in the cassette.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount currentAmount;
	/**
	 * Current amount in the cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current amount in the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "CurAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentAmount";
			definition = "Current amount in the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCassetteCounters4> flowTotals;
	/**
	 * Counters of media inside the cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
	 * ATMCassetteCounters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlowTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlowTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters of media inside the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFlowTotals = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMCassetteCounters3.mmObject();
			isDerived = false;
			xmlTag = "FlowTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlowTotals";
			definition = "Counters of media inside the cassette.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCassetteCounters4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMCassetteCounters3.mmUnitValue, ATMCassetteCounters3.mmCurrency, ATMCassetteCounters3.mmMediaCategory, ATMCassetteCounters3.mmCurrentNumber, ATMCassetteCounters3.mmCurrentAmount,
						ATMCassetteCounters3.mmFlowTotals);
				trace_lazy = () -> Price.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassetteCounters3";
				definition = "ATM cassette counter per unit value or globally.";
			}
		});
		return mmObject_lazy.get();
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

	@XmlElement(name = "MdiaCtgy")
	public ATMMediaType3Code getMediaCategory() {
		return mediaCategory;
	}

	public void setMediaCategory(ATMMediaType3Code mediaCategory) {
		this.mediaCategory = mediaCategory;
	}

	@XmlElement(name = "CurNb", required = true)
	public Number getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(Number currentNumber) {
		this.currentNumber = currentNumber;
	}

	@XmlElement(name = "CurAmt")
	public ImpliedCurrencyAndAmount getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(ImpliedCurrencyAndAmount currentAmount) {
		this.currentAmount = currentAmount;
	}

	@XmlElement(name = "FlowTtls")
	public List<ATMCassetteCounters4> getFlowTotals() {
		return flowTotals;
	}

	public void setFlowTotals(List<com.tools20022.repository.msg.ATMCassetteCounters4> flowTotals) {
		this.flowTotals = flowTotals;
	}
}