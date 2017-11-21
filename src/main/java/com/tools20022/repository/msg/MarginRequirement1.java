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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.MarginAmountRequirement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of expected margin required by any of the parties of the margin
 * calculation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginRequirement1#mmDeliverMarginAmount
 * MarginRequirement1.mmDeliverMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginRequirement1#mmReturnMarginAmount
 * MarginRequirement1.mmReturnMarginAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
 * MarginAmountRequirement}</li>
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
 * "MarginRequirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of expected margin required by any of the parties of the margin calculation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginRequirement1", propOrder = {"deliverMarginAmount", "returnMarginAmount"})
public class MarginRequirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount deliverMarginAmount;
	/**
	 * Amount of new margin that will be delivered to one party by the other
	 * party after rounding, threshold and minimum transfer amount are taken
	 * into account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmDeliverMarginAmount
	 * MarginAmountRequirement.mmDeliverMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginRequirement1
	 * MarginRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrMrgnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of new margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliverMarginAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginAmountRequirement.mmDeliverMarginAmount;
			componentContext_lazy = () -> MarginRequirement1.mmObject();
			isDerived = false;
			xmlTag = "DlvrMrgnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverMarginAmount";
			definition = "Amount of new margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount returnMarginAmount;
	/**
	 * Amount of new margin that will be recalled to one party from the other
	 * party after rounding, threshold and minimum transfer amount are taken
	 * into account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement#mmReturnMarginAmount
	 * MarginAmountRequirement.mmReturnMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginRequirement1
	 * MarginRequirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrMrgnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of new margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReturnMarginAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginAmountRequirement.mmReturnMarginAmount;
			componentContext_lazy = () -> MarginRequirement1.mmObject();
			isDerived = false;
			xmlTag = "RtrMrgnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnMarginAmount";
			definition = "Amount of new margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginRequirement1.mmDeliverMarginAmount, MarginRequirement1.mmReturnMarginAmount);
				trace_lazy = () -> MarginAmountRequirement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginRequirement1";
				definition = "Amount of expected margin required by any of the parties of the margin calculation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DlvrMrgnAmt")
	public ActiveCurrencyAndAmount getDeliverMarginAmount() {
		return deliverMarginAmount;
	}

	public void setDeliverMarginAmount(ActiveCurrencyAndAmount deliverMarginAmount) {
		this.deliverMarginAmount = deliverMarginAmount;
	}

	@XmlElement(name = "RtrMrgnAmt")
	public ActiveCurrencyAndAmount getReturnMarginAmount() {
		return returnMarginAmount;
	}

	public void setReturnMarginAmount(ActiveCurrencyAndAmount returnMarginAmount) {
		this.returnMarginAmount = returnMarginAmount;
	}
}