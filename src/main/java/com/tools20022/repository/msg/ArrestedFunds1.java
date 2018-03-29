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
import com.tools20022.repository.datatype.Max10Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ArrestedFunds1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about funds that have been arrested."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ArrestedFunds1", propOrder = {"arrestIdentification", "totalAmount", "remainingUnpaidAmount", "arrestedAmount"})
public class ArrestedFunds1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ArrstId")
	protected Max10Text arrestIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ArrestedFunds1, Optional<Max10Text>> mmArrestIdentification = new MMMessageAttribute<ArrestedFunds1, Optional<Max10Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "ArrstId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArrestIdentification";
			definition = "Identification of the arrest order assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(ArrestedFunds1 obj) {
			return obj.getArrestIdentification();
		}

		@Override
		public void setValue(ArrestedFunds1 obj, Optional<Max10Text> value) {
			obj.setArrestIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAmt")
	protected ActiveCurrencyAndAmount totalAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ArrestedFunds1, Optional<ActiveCurrencyAndAmount>> mmTotalAmount = new MMMessageAttribute<ArrestedFunds1, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount owed subject to arrest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ArrestedFunds1 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(ArrestedFunds1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngUnpdAmt", required = true)
	protected ActiveCurrencyAndAmount remainingUnpaidAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ArrestedFunds1, ActiveCurrencyAndAmount> mmRemainingUnpaidAmount = new MMMessageAttribute<ArrestedFunds1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "RmngUnpdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingUnpaidAmount";
			definition = "Remaining unpaid amount out of total amount owed subject to arrest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(ArrestedFunds1 obj) {
			return obj.getRemainingUnpaidAmount();
		}

		@Override
		public void setValue(ArrestedFunds1 obj, ActiveCurrencyAndAmount value) {
			obj.setRemainingUnpaidAmount(value);
		}
	};
	@XmlElement(name = "ArrstdAmt")
	protected ActiveCurrencyAndAmount arrestedAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ArrestedFunds1, Optional<ActiveCurrencyAndAmount>> mmArrestedAmount = new MMMessageAttribute<ArrestedFunds1, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ArrestedFunds1.mmObject();
			isDerived = false;
			xmlTag = "ArrstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArrestedAmount";
			definition = "Funds blocked for settlement of the arrest order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ArrestedFunds1 obj) {
			return obj.getArrestedAmount();
		}

		@Override
		public void setValue(ArrestedFunds1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setArrestedAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ArrestedFunds1.mmArrestIdentification, com.tools20022.repository.msg.ArrestedFunds1.mmTotalAmount,
						com.tools20022.repository.msg.ArrestedFunds1.mmRemainingUnpaidAmount, com.tools20022.repository.msg.ArrestedFunds1.mmArrestedAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ArrestedFunds1";
				definition = "Information about funds that have been arrested.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max10Text> getArrestIdentification() {
		return arrestIdentification == null ? Optional.empty() : Optional.of(arrestIdentification);
	}

	public ArrestedFunds1 setArrestIdentification(Max10Text arrestIdentification) {
		this.arrestIdentification = arrestIdentification;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalAmount() {
		return totalAmount == null ? Optional.empty() : Optional.of(totalAmount);
	}

	public ArrestedFunds1 setTotalAmount(ActiveCurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public ActiveCurrencyAndAmount getRemainingUnpaidAmount() {
		return remainingUnpaidAmount;
	}

	public ArrestedFunds1 setRemainingUnpaidAmount(ActiveCurrencyAndAmount remainingUnpaidAmount) {
		this.remainingUnpaidAmount = Objects.requireNonNull(remainingUnpaidAmount);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getArrestedAmount() {
		return arrestedAmount == null ? Optional.empty() : Optional.of(arrestedAmount);
	}

	public ArrestedFunds1 setArrestedAmount(ActiveCurrencyAndAmount arrestedAmount) {
		this.arrestedAmount = arrestedAmount;
		return this;
	}
}