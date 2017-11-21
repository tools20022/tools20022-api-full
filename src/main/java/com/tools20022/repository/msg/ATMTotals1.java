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
import com.tools20022.repository.codeset.ATMMediaType1Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.ATMTotal;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Current totals of the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmMediaType
 * ATMTotals1.mmMediaType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmCurrency
 * ATMTotals1.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMBalance
 * ATMTotals1.mmATMBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMCurrent
 * ATMTotals1.mmATMCurrent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMBalanceNumber
 * ATMTotals1.mmATMBalanceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTotals1#mmATMCurrentNumber
 * ATMTotals1.mmATMCurrentNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ATMTotal ATMTotal}</li>
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
 * "ATMTotals1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Current totals of the ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTotals1", propOrder = {"mediaType", "currency", "ATMBalance", "ATMCurrent", "ATMBalanceNumber", "ATMCurrentNumber"})
public class ATMTotals1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMMediaType1Code mediaType;
	/**
	 * Type of media inside the cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType1Code
	 * ATMMediaType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of media inside the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMediaType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "MdiaTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaType";
			definition = "Type of media inside the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType1Code.mmObject();
		}
	};
	protected ActiveCurrencyCode currency;
	/**
	 * Currency of the totals.
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
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmCurrency
	 * ATMTotal.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
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
	 * definition} = "Currency of the totals."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmCurrency;
			componentContext_lazy = () -> ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the totals.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount aTMBalance;
	/**
	 * Total balance of the ATM including reject cassette, but excluding the
	 * retract cassette.
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
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalance
	 * ATMTotal.mmATMBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of the ATM including reject cassette, but excluding the retract cassette."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMBalance;
			componentContext_lazy = () -> ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			definition = "Total balance of the ATM including reject cassette, but excluding the retract cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount aTMCurrent;
	/**
	 * Available amount for dispense in the ATM.
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
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrent
	 * ATMTotal.mmATMCurrent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMCur"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Available amount for dispense in the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMCurrent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMCurrent;
			componentContext_lazy = () -> ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMCur";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCurrent";
			definition = "Available amount for dispense in the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Number aTMBalanceNumber;
	/**
	 * Total number of units for non-valued media, including reject cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMBalanceNumber
	 * ATMTotal.mmATMBalanceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMBalNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalanceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, including reject cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMBalanceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMBalanceNumber;
			componentContext_lazy = () -> ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMBalNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalanceNumber";
			definition = "Total number of units for non-valued media, including reject cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number aTMCurrentNumber;
	/**
	 * Total number of units for non-valued media, excluding reject cassette.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ATMTotal#mmATMCurrentNumber
	 * ATMTotal.mmATMCurrentNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.ATMTotals1
	 * ATMTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMCurNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCurrentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of units for non-valued media, excluding reject cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMCurrentNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ATMTotal.mmATMCurrentNumber;
			componentContext_lazy = () -> ATMTotals1.mmObject();
			isDerived = false;
			xmlTag = "ATMCurNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCurrentNumber";
			definition = "Total number of units for non-valued media, excluding reject cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMTotals1.mmMediaType, ATMTotals1.mmCurrency, ATMTotals1.mmATMBalance, ATMTotals1.mmATMCurrent, ATMTotals1.mmATMBalanceNumber, ATMTotals1.mmATMCurrentNumber);
				trace_lazy = () -> ATMTotal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTotals1";
				definition = "Current totals of the ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MdiaTp")
	public ATMMediaType1Code getMediaType() {
		return mediaType;
	}

	public void setMediaType(ATMMediaType1Code mediaType) {
		this.mediaType = mediaType;
	}

	@XmlElement(name = "Ccy")
	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "ATMBal")
	public ImpliedCurrencyAndAmount getATMBalance() {
		return aTMBalance;
	}

	public void setATMBalance(ImpliedCurrencyAndAmount aTMBalance) {
		this.aTMBalance = aTMBalance;
	}

	@XmlElement(name = "ATMCur")
	public ImpliedCurrencyAndAmount getATMCurrent() {
		return aTMCurrent;
	}

	public void setATMCurrent(ImpliedCurrencyAndAmount aTMCurrent) {
		this.aTMCurrent = aTMCurrent;
	}

	@XmlElement(name = "ATMBalNb")
	public Number getATMBalanceNumber() {
		return aTMBalanceNumber;
	}

	public void setATMBalanceNumber(Number aTMBalanceNumber) {
		this.aTMBalanceNumber = aTMBalanceNumber;
	}

	@XmlElement(name = "ATMCurNb")
	public Number getATMCurrentNumber() {
		return aTMCurrentNumber;
	}

	public void setATMCurrentNumber(Number aTMCurrentNumber) {
		this.aTMCurrentNumber = aTMCurrentNumber;
	}
}