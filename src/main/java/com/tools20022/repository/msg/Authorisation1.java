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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Authorisation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Autorisation of the mandate holder."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Authorisation2 Authorisation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Authorisation1", propOrder = {"minimumAmountPerTransaction", "maximumAmountPerTransaction", "maximumAmountByPeriod"})
public class Authorisation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount minimumAmountPerTransaction;
	/**
	 * Minimum amount per transaction allowed by the mandate.
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
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMininumAmountPerTransaction
	 * OperationThreshold.mmMininumAmountPerTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation1 Authorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinAmtPerTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAmountPerTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum amount per transaction allowed by the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumAmountPerTransaction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMininumAmountPerTransaction;
			componentContext_lazy = () -> Authorisation1.mmObject();
			isDerived = false;
			xmlTag = "MinAmtPerTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAmountPerTransaction";
			definition = "Minimum amount per transaction allowed by the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount maximumAmountPerTransaction;
	/**
	 * Maximum amount per transaction allowed by the mandate.
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
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMaximumAmount
	 * OperationThreshold.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation1 Authorisation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmtPerTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountPerTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount per transaction allowed by the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAmountPerTransaction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMaximumAmount;
			componentContext_lazy = () -> Authorisation1.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtPerTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountPerTransaction";
			definition = "Maximum amount per transaction allowed by the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MaximumAmountByPeriod1> maximumAmountByPeriod;
	/**
	 * Maximum amount allowed over a specific period of time.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountByPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount allowed over a specific period of time."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaximumAmountByPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMaximumAmount;
			componentContext_lazy = () -> Authorisation1.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtByPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByPeriod";
			definition = "Maximum amount allowed over a specific period of time.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaximumAmountByPeriod1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Authorisation1.mmMinimumAmountPerTransaction, Authorisation1.mmMaximumAmountPerTransaction, Authorisation1.mmMaximumAmountByPeriod);
				trace_lazy = () -> OperationThreshold.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Authorisation1";
				definition = "Autorisation of the mandate holder.";
				nextVersions_lazy = () -> Arrays.asList(Authorisation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MinAmtPerTx", required = true)
	public ActiveCurrencyAndAmount getMinimumAmountPerTransaction() {
		return minimumAmountPerTransaction;
	}

	public void setMinimumAmountPerTransaction(ActiveCurrencyAndAmount minimumAmountPerTransaction) {
		this.minimumAmountPerTransaction = minimumAmountPerTransaction;
	}

	@XmlElement(name = "MaxAmtPerTx", required = true)
	public ActiveCurrencyAndAmount getMaximumAmountPerTransaction() {
		return maximumAmountPerTransaction;
	}

	public void setMaximumAmountPerTransaction(ActiveCurrencyAndAmount maximumAmountPerTransaction) {
		this.maximumAmountPerTransaction = maximumAmountPerTransaction;
	}

	@XmlElement(name = "MaxAmtByPrd")
	public List<MaximumAmountByPeriod1> getMaximumAmountByPeriod() {
		return maximumAmountByPeriod;
	}

	public void setMaximumAmountByPeriod(List<com.tools20022.repository.msg.MaximumAmountByPeriod1> maximumAmountByPeriod) {
		this.maximumAmountByPeriod = maximumAmountByPeriod;
	}
}