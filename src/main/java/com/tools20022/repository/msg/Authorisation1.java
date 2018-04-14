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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.OperationThreshold;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MaximumAmountByPeriod1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Autorisation of the mandate holder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation1#mmMinimumAmountPerTransaction
 * Authorisation1.mmMinimumAmountPerTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation1#mmMaximumAmountPerTransaction
 * Authorisation1.mmMaximumAmountPerTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation1#mmMaximumAmountByPeriod
 * Authorisation1.mmMaximumAmountByPeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.OperationThreshold
 * OperationThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Authorisation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Autorisation of the mandate holder."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Authorisation2 Authorisation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Authorisation1", propOrder = {"minimumAmountPerTransaction", "maximumAmountPerTransaction", "maximumAmountByPeriod"})
public class Authorisation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MinAmtPerTx", required = true)
	protected ActiveCurrencyAndAmount minimumAmountPerTransaction;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMininumAmountPerTransaction
	 * OperationThreshold.mmMininumAmountPerTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation1 Authorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinAmtPerTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAmountPerTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum amount per transaction allowed by the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Authorisation1, ActiveCurrencyAndAmount> mmMinimumAmountPerTransaction = new MMMessageAttribute<Authorisation1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMininumAmountPerTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Authorisation1.mmObject();
			isDerived = false;
			xmlTag = "MinAmtPerTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAmountPerTransaction";
			definition = "Minimum amount per transaction allowed by the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Authorisation1 obj) {
			return obj.getMinimumAmountPerTransaction();
		}

		@Override
		public void setValue(Authorisation1 obj, ActiveCurrencyAndAmount value) {
			obj.setMinimumAmountPerTransaction(value);
		}
	};
	@XmlElement(name = "MaxAmtPerTx", required = true)
	protected ActiveCurrencyAndAmount maximumAmountPerTransaction;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMaximumAmount
	 * OperationThreshold.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation1 Authorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmtPerTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountPerTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount per transaction allowed by the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Authorisation1, ActiveCurrencyAndAmount> mmMaximumAmountPerTransaction = new MMMessageAttribute<Authorisation1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Authorisation1.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtPerTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountPerTransaction";
			definition = "Maximum amount per transaction allowed by the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Authorisation1 obj) {
			return obj.getMaximumAmountPerTransaction();
		}

		@Override
		public void setValue(Authorisation1 obj, ActiveCurrencyAndAmount value) {
			obj.setMaximumAmountPerTransaction(value);
		}
	};
	@XmlElement(name = "MaxAmtByPrd")
	protected List<MaximumAmountByPeriod1> maximumAmountByPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1
	 * MaximumAmountByPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMaximumAmount
	 * OperationThreshold.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation1 Authorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmtByPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountByPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount allowed over a specific period of time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Authorisation1, List<MaximumAmountByPeriod1>> mmMaximumAmountByPeriod = new MMMessageAssociationEnd<Authorisation1, List<MaximumAmountByPeriod1>>() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Authorisation1.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtByPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByPeriod";
			definition = "Maximum amount allowed over a specific period of time.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MaximumAmountByPeriod1.mmObject();
		}

		@Override
		public List<MaximumAmountByPeriod1> getValue(Authorisation1 obj) {
			return obj.getMaximumAmountByPeriod();
		}

		@Override
		public void setValue(Authorisation1 obj, List<MaximumAmountByPeriod1> value) {
			obj.setMaximumAmountByPeriod(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Authorisation1.mmMinimumAmountPerTransaction, com.tools20022.repository.msg.Authorisation1.mmMaximumAmountPerTransaction,
						com.tools20022.repository.msg.Authorisation1.mmMaximumAmountByPeriod);
				trace_lazy = () -> OperationThreshold.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Authorisation1";
				definition = "Autorisation of the mandate holder.";
				nextVersions_lazy = () -> Arrays.asList(Authorisation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getMinimumAmountPerTransaction() {
		return minimumAmountPerTransaction;
	}

	public Authorisation1 setMinimumAmountPerTransaction(ActiveCurrencyAndAmount minimumAmountPerTransaction) {
		this.minimumAmountPerTransaction = Objects.requireNonNull(minimumAmountPerTransaction);
		return this;
	}

	public ActiveCurrencyAndAmount getMaximumAmountPerTransaction() {
		return maximumAmountPerTransaction;
	}

	public Authorisation1 setMaximumAmountPerTransaction(ActiveCurrencyAndAmount maximumAmountPerTransaction) {
		this.maximumAmountPerTransaction = Objects.requireNonNull(maximumAmountPerTransaction);
		return this;
	}

	public List<MaximumAmountByPeriod1> getMaximumAmountByPeriod() {
		return maximumAmountByPeriod == null ? maximumAmountByPeriod = new ArrayList<>() : maximumAmountByPeriod;
	}

	public Authorisation1 setMaximumAmountByPeriod(List<MaximumAmountByPeriod1> maximumAmountByPeriod) {
		this.maximumAmountByPeriod = Objects.requireNonNull(maximumAmountByPeriod);
		return this;
	}
}