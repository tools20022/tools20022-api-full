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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AmountAndQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Value of cash held, on an unsecured basis at a bank.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredAmount1#mmDefaultedCounterpartyAmount
 * UnsecuredAmount1.mmDefaultedCounterpartyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredAmount1#mmNotDefaultedCounterpartyAmount
 * UnsecuredAmount1.mmNotDefaultedCounterpartyAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountAndQuantity
 * AmountAndQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnsecuredAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Value of cash held, on an unsecured basis at a bank."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnsecuredAmount1", propOrder = {"defaultedCounterpartyAmount", "notDefaultedCounterpartyAmount"})
public class UnsecuredAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DfltdCtrPtyAmt", required = true)
	protected AmountAndDirection6 defaultedCounterpartyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmAmount
	 * AmountAndQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredAmount1
	 * UnsecuredAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltdCtrPtyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultedCounterpartyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of cash held, on an unsecured basis, at the defaulting members CM1 and CM2 at T-1, and flows for the remainder of the horizon. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDefaultedCounterpartyAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AmountAndQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredAmount1.mmObject();
			isDerived = false;
			xmlTag = "DfltdCtrPtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultedCounterpartyAmount";
			definition = "Value of cash held, on an unsecured basis, at the defaulting members CM1 and CM2 at T-1, and flows for the remainder of the horizon. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	@XmlElement(name = "NotDfltdCtrPtyAmt", required = true)
	protected AmountAndDirection6 notDefaultedCounterpartyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmAmount
	 * AmountAndQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredAmount1
	 * UnsecuredAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotDfltdCtrPtyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDefaultedCounterpartyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of cash held, on an unsecured basis, at authorised credit institutions other than the defaulting members CM1 and CM2. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNotDefaultedCounterpartyAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AmountAndQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredAmount1.mmObject();
			isDerived = false;
			xmlTag = "NotDfltdCtrPtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDefaultedCounterpartyAmount";
			definition = "Value of cash held, on an unsecured basis, at authorised credit institutions other than the defaulting members CM1 and CM2. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnsecuredAmount1.mmDefaultedCounterpartyAmount, com.tools20022.repository.msg.UnsecuredAmount1.mmNotDefaultedCounterpartyAmount);
				trace_lazy = () -> AmountAndQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnsecuredAmount1";
				definition = "Value of cash held, on an unsecured basis at a bank.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection6 getDefaultedCounterpartyAmount() {
		return defaultedCounterpartyAmount;
	}

	public UnsecuredAmount1 setDefaultedCounterpartyAmount(com.tools20022.repository.msg.AmountAndDirection6 defaultedCounterpartyAmount) {
		this.defaultedCounterpartyAmount = Objects.requireNonNull(defaultedCounterpartyAmount);
		return this;
	}

	public AmountAndDirection6 getNotDefaultedCounterpartyAmount() {
		return notDefaultedCounterpartyAmount;
	}

	public UnsecuredAmount1 setNotDefaultedCounterpartyAmount(com.tools20022.repository.msg.AmountAndDirection6 notDefaultedCounterpartyAmount) {
		this.notDefaultedCounterpartyAmount = Objects.requireNonNull(notDefaultedCounterpartyAmount);
		return this;
	}
}