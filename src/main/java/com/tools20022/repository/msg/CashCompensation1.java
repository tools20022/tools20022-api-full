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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.BuyIn;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the cash compensation such as the fees and the total
 * settlement amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCompensation1#mmSettlementAmount
 * CashCompensation1.mmSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCompensation1#mmFees
 * CashCompensation1.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCompensation1#mmValueDate
 * CashCompensation1.mmValueDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
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
 * "CashCompensation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the cash compensation such as the fees and the total settlement amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CashCompensation1", propOrder = {"settlementAmount", "fees", "valueDate"})
public class CashCompensation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection20 settlementAmount;
	/**
	 * Provides the original amount to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1
	 * CashCompensation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the original amount to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> CashCompensation1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Provides the original amount to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	protected AmountAndDirection20 fees;
	/**
	 * Amount of fees linked to the cash compensation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmFees BuyIn.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1
	 * CashCompensation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of fees linked to the cash compensation process."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFees = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmFees;
			componentContext_lazy = () -> CashCompensation1.mmObject();
			isDerived = false;
			xmlTag = "Fees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			definition = "Amount of fees linked to the cash compensation process.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Indicates the value date of the cash compensation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1
	 * CashCompensation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the value date of the cash compensation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> CashCompensation1.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Indicates the value date of the cash compensation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CashCompensation1.mmSettlementAmount, CashCompensation1.mmFees, CashCompensation1.mmValueDate);
				trace_lazy = () -> BuyIn.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashCompensation1";
				definition = "Provides details about the cash compensation such as the fees and the total settlement amount.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmAmt", required = true)
	public AmountAndDirection20 getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(com.tools20022.repository.msg.AmountAndDirection20 settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "Fees")
	public AmountAndDirection20 getFees() {
		return fees;
	}

	public void setFees(com.tools20022.repository.msg.AmountAndDirection20 fees) {
		this.fees = fees;
	}

	@XmlElement(name = "ValDt")
	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}
}