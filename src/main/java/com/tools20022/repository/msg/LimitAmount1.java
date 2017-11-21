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
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money characterics used to specify a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitAmount1#mmAmount
 * LimitAmount1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitAmount1#mmUtilisationAmount
 * LimitAmount1.mmUtilisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitAmount1#mmAvailableAmount
 * LimitAmount1.mmAvailableAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money characterics used to specify a limit."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LimitAmount1", propOrder = {"amount", "utilisationAmount", "availableAmount"})
public class LimitAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CreditDebitAmount1 amount;
	/**
	 * Amount of money of the limit, expressed in an eligible currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditDebitAmount1
	 * CreditDebitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1 LimitAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money of the limit, expressed in an eligible currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> LimitAmount1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.CreditDebitAmount1.mmObject();
		}
	};
	protected CreditDebitAmount1 utilisationAmount;
	/**
	 * Utilised amount of money of the limit expressed in an eligible currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditDebitAmount1
	 * CreditDebitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmUsedAmount
	 * Limit.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1 LimitAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UtlstnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UtilisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Utilised amount of money of the limit expressed in an eligible currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUtilisationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmUsedAmount;
			componentContext_lazy = () -> LimitAmount1.mmObject();
			isDerived = false;
			xmlTag = "UtlstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UtilisationAmount";
			definition = "Utilised amount of money of the limit expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.CreditDebitAmount1.mmObject();
		}
	};
	protected CreditDebitAmount1 availableAmount;
	/**
	 * Remaining amount of money of the limit expressed in an eligible currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditDebitAmount1
	 * CreditDebitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAvailableAmount
	 * Limit.mmAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1 LimitAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining amount of money of the limit expressed in an eligible currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAvailableAmount;
			componentContext_lazy = () -> LimitAmount1.mmObject();
			isDerived = false;
			xmlTag = "AvlblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.CreditDebitAmount1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LimitAmount1.mmAmount, LimitAmount1.mmUtilisationAmount, LimitAmount1.mmAvailableAmount);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitAmount1";
				definition = "Amount of money characterics used to specify a limit.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Amt", required = true)
	public CreditDebitAmount1 getAmount() {
		return amount;
	}

	public void setAmount(com.tools20022.repository.msg.CreditDebitAmount1 amount) {
		this.amount = amount;
	}

	@XmlElement(name = "UtlstnAmt", required = true)
	public CreditDebitAmount1 getUtilisationAmount() {
		return utilisationAmount;
	}

	public void setUtilisationAmount(com.tools20022.repository.msg.CreditDebitAmount1 utilisationAmount) {
		this.utilisationAmount = utilisationAmount;
	}

	@XmlElement(name = "AvlblAmt", required = true)
	public CreditDebitAmount1 getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(com.tools20022.repository.msg.CreditDebitAmount1 availableAmount) {
		this.availableAmount = availableAmount;
	}
}