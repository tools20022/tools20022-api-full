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
import com.tools20022.repository.codeset.ATMCounterType1Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Counters of media inside an ATM cassette.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmType
 * ATMCassetteCounters4.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmAddedNumber
 * ATMCassetteCounters4.mmAddedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmRemovedNumber
 * ATMCassetteCounters4.mmRemovedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmDispensedNumber
 * ATMCassetteCounters4.mmDispensedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmDepositedNumber
 * ATMCassetteCounters4.mmDepositedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmRecycledNumber
 * ATMCassetteCounters4.mmRecycledNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmRetractedNumber
 * ATMCassetteCounters4.mmRetractedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmRejectedNumber
 * ATMCassetteCounters4.mmRejectedNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4#mmPresentedNumber
 * ATMCassetteCounters4.mmPresentedNumber}</li>
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
 * "ATMCassetteCounters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Counters of media inside an ATM cassette."</li>
 * </ul>
 */
public class ATMCassetteCounters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMCounterType1Code type;
	/**
	 * Type of counters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of counters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of counters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCounterType1Code.mmObject();
		}
	};
	protected Number addedNumber;
	/**
	 * Number of added media during servicing operations.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddedNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of added media during servicing operations."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "AddedNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddedNumber";
			definition = "Number of added media during servicing operations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number removedNumber;
	/**
	 * Number of removed media during servicing operations.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmvdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of removed media during servicing operations."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemovedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "RmvdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovedNumber";
			definition = "Number of removed media during servicing operations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number dispensedNumber;
	/**
	 * Total number of media out of the cassette.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DspnsdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DispensedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of media out of the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDispensedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "DspnsdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DispensedNumber";
			definition = "Total number of media out of the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number depositedNumber;
	/**
	 * Total number of media deposited in the cassette.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of media deposited in the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepositedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "DpstdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositedNumber";
			definition = "Total number of media deposited in the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number recycledNumber;
	/**
	 * Total number of recycled media from the cassette.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcycldNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecycledNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of recycled media from the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecycledNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "RcycldNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecycledNumber";
			definition = "Total number of recycled media from the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number retractedNumber;
	/**
	 * Total number of retracted media originating from the cassette.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrctdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetractedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of retracted media originating from the cassette."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRetractedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "RtrctdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetractedNumber";
			definition = "Total number of retracted media originating from the cassette.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number rejectedNumber;
	/**
	 * Total number of media from this cassette which are on the reject bin.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of media from this cassette which are on the reject bin."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "RjctdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedNumber";
			definition = "Total number of media from this cassette which are on the reject bin.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number presentedNumber;
	/**
	 * Total number of media presented to the customer.
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
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters4
	 * ATMCassetteCounters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PresntdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of media presented to the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPresentedNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCassetteCounters4.mmObject();
			isDerived = false;
			xmlTag = "PresntdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentedNumber";
			definition = "Total number of media presented to the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMCassetteCounters4.mmType, ATMCassetteCounters4.mmAddedNumber, ATMCassetteCounters4.mmRemovedNumber, ATMCassetteCounters4.mmDispensedNumber,
						ATMCassetteCounters4.mmDepositedNumber, ATMCassetteCounters4.mmRecycledNumber, ATMCassetteCounters4.mmRetractedNumber, ATMCassetteCounters4.mmRejectedNumber, ATMCassetteCounters4.mmPresentedNumber);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCassetteCounters4";
				definition = "Counters of media inside an ATM cassette.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMCounterType1Code getType() {
		return type;
	}

	public void setType(ATMCounterType1Code type) {
		this.type = type;
	}

	public Number getAddedNumber() {
		return addedNumber;
	}

	public void setAddedNumber(Number addedNumber) {
		this.addedNumber = addedNumber;
	}

	public Number getRemovedNumber() {
		return removedNumber;
	}

	public void setRemovedNumber(Number removedNumber) {
		this.removedNumber = removedNumber;
	}

	public Number getDispensedNumber() {
		return dispensedNumber;
	}

	public void setDispensedNumber(Number dispensedNumber) {
		this.dispensedNumber = dispensedNumber;
	}

	public Number getDepositedNumber() {
		return depositedNumber;
	}

	public void setDepositedNumber(Number depositedNumber) {
		this.depositedNumber = depositedNumber;
	}

	public Number getRecycledNumber() {
		return recycledNumber;
	}

	public void setRecycledNumber(Number recycledNumber) {
		this.recycledNumber = recycledNumber;
	}

	public Number getRetractedNumber() {
		return retractedNumber;
	}

	public void setRetractedNumber(Number retractedNumber) {
		this.retractedNumber = retractedNumber;
	}

	public Number getRejectedNumber() {
		return rejectedNumber;
	}

	public void setRejectedNumber(Number rejectedNumber) {
		this.rejectedNumber = rejectedNumber;
	}

	public Number getPresentedNumber() {
		return presentedNumber;
	}

	public void setPresentedNumber(Number presentedNumber) {
		this.presentedNumber = presentedNumber;
	}
}