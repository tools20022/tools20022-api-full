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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max10Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about funds that have been arrested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ArrestedFunds1#mmArrestIdentification
 * ArrestedFunds1.mmArrestIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ArrestedFunds1#mmTotalAmount
 * ArrestedFunds1.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ArrestedFunds1#mmRemainingUnpaidAmount
 * ArrestedFunds1.mmRemainingUnpaidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ArrestedFunds1#mmArrestedAmount
 * ArrestedFunds1.mmArrestedAmount}</li>
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
 * "ArrestedFunds1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about funds that have been arrested. "</li>
 * </ul>
 */
public class ArrestedFunds1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max10Text arrestIdentification;
	/**
	 * Identification of the arrest order assigned by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ArrestedFunds1 ArrestedFunds1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ArrstId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the arrest order assigned by the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmArrestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "ArrstId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArrestIdentification";
			definition = "Identification of the arrest order assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalAmount;
	/**
	 * Total amount owed subject to arrest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ArrestedFunds1 ArrestedFunds1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount owed subject to arrest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount owed subject to arrest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount remainingUnpaidAmount;
	/**
	 * Remaining unpaid amount out of total amount owed subject to arrest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ArrestedFunds1 ArrestedFunds1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngUnpdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingUnpaidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining unpaid amount out of total amount owed subject to arrest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemainingUnpaidAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "RmngUnpdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingUnpaidAmount";
			definition = "Remaining unpaid amount out of total amount owed subject to arrest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount arrestedAmount;
	/**
	 * Funds blocked for settlement of the arrest order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ArrestedFunds1 ArrestedFunds1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ArrstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds blocked for settlement of the arrest order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmArrestedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "ArrstdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArrestedAmount";
			definition = "Funds blocked for settlement of the arrest order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ArrestedFunds1.mmArrestIdentification, com.tools20022.repository.msg.ArrestedFunds1.mmTotalAmount,
						com.tools20022.repository.msg.ArrestedFunds1.mmRemainingUnpaidAmount, com.tools20022.repository.msg.ArrestedFunds1.mmArrestedAmount);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ArrestedFunds1";
				definition = "Information about funds that have been arrested. ";
			}
		});
		return mmObject_lazy.get();
	}

	public Max10Text getArrestIdentification() {
		return arrestIdentification;
	}

	public void setArrestIdentification(Max10Text arrestIdentification) {
		this.arrestIdentification = arrestIdentification;
	}

	public ActiveCurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(ActiveCurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
	}

	public ActiveCurrencyAndAmount getRemainingUnpaidAmount() {
		return remainingUnpaidAmount;
	}

	public void setRemainingUnpaidAmount(ActiveCurrencyAndAmount remainingUnpaidAmount) {
		this.remainingUnpaidAmount = remainingUnpaidAmount;
	}

	public ActiveCurrencyAndAmount getArrestedAmount() {
		return arrestedAmount;
	}

	public void setArrestedAmount(ActiveCurrencyAndAmount arrestedAmount) {
		this.arrestedAmount = arrestedAmount;
	}
}