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
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * DTC (The Depository Trust Company) Foreign Currency Payment service
 * elections.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1#mmCustomerCount
 * ForeignCurrencyPaymentAccountQuantity1.mmCustomerCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1#mmAccountQuantity
 * ForeignCurrencyPaymentAccountQuantity1.mmAccountQuantity}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignCurrencyPaymentAccountQuantity1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "DTC (The Depository Trust Company) Foreign Currency Payment service elections."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ForeignCurrencyPaymentAccountQuantity1", propOrder = {"customerCount", "accountQuantity"})
public class ForeignCurrencyPaymentAccountQuantity1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number customerCount;
	/**
	 * Number of customers.
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
	 * {@linkplain com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1
	 * ForeignCurrencyPaymentAccountQuantity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of customers."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerCount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ForeignCurrencyPaymentAccountQuantity1.mmObject();
			isDerived = false;
			xmlTag = "CstmrCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCount";
			definition = "Number of customers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected FinancialInstrumentQuantity15Choice accountQuantity;
	/**
	 * Quantity to be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignCurrencyPaymentAccountQuantity1
	 * ForeignCurrencyPaymentAccountQuantity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity to be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ForeignCurrencyPaymentAccountQuantity1.mmObject();
			isDerived = false;
			xmlTag = "AcctQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountQuantity";
			definition = "Quantity to be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ForeignCurrencyPaymentAccountQuantity1.mmCustomerCount, ForeignCurrencyPaymentAccountQuantity1.mmAccountQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ForeignCurrencyPaymentAccountQuantity1";
				definition = "DTC (The Depository Trust Company) Foreign Currency Payment service elections.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CstmrCnt", required = true)
	public Number getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(Number customerCount) {
		this.customerCount = customerCount;
	}

	@XmlElement(name = "AcctQty", required = true)
	public FinancialInstrumentQuantity15Choice getAccountQuantity() {
		return accountQuantity;
	}

	public void setAccountQuantity(FinancialInstrumentQuantity15Choice accountQuantity) {
		this.accountQuantity = accountQuantity;
	}
}