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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MultiLegOrder1;
import com.tools20022.repository.msg.SingleOrder1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a single order or a multileg order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice#mmSingleOrderDetails
 * SingleOrMultiLegOrderChoice.mmSingleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice#mmMultilegOrderDetails
 * SingleOrMultiLegOrderChoice.mmMultilegOrderDetails}</li>
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
 * "SingleOrMultiLegOrderChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a single order or a multileg order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SingleOrMultiLegOrderChoice", propOrder = {"singleOrderDetails", "multilegOrderDetails"})
public class SingleOrMultiLegOrderChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SnglOrdrDtls", required = true)
	protected SingleOrder1 singleOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SingleOrder1
	 * SingleOrder1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice
	 * SingleOrMultiLegOrderChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the single order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleOrMultiLegOrderChoice, SingleOrder1> mmSingleOrderDetails = new MMMessageAssociationEnd<SingleOrMultiLegOrderChoice, SingleOrder1>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SingleOrMultiLegOrderChoice.mmObject();
			isDerived = false;
			xmlTag = "SnglOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleOrderDetails";
			definition = "Provides details about the single order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SingleOrder1.mmObject();
		}

		@Override
		public SingleOrder1 getValue(SingleOrMultiLegOrderChoice obj) {
			return obj.getSingleOrderDetails();
		}

		@Override
		public void setValue(SingleOrMultiLegOrderChoice obj, SingleOrder1 value) {
			obj.setSingleOrderDetails(value);
		}
	};
	@XmlElement(name = "MltlgOrdrDtls", required = true)
	protected MultiLegOrder1 multilegOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MultiLegOrder1
	 * MultiLegOrder1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SingleOrMultiLegOrderChoice
	 * SingleOrMultiLegOrderChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltlgOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultilegOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the multileg order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleOrMultiLegOrderChoice, MultiLegOrder1> mmMultilegOrderDetails = new MMMessageAssociationEnd<SingleOrMultiLegOrderChoice, MultiLegOrder1>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SingleOrMultiLegOrderChoice.mmObject();
			isDerived = false;
			xmlTag = "MltlgOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultilegOrderDetails";
			definition = "Provides details about the multileg order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MultiLegOrder1.mmObject();
		}

		@Override
		public MultiLegOrder1 getValue(SingleOrMultiLegOrderChoice obj) {
			return obj.getMultilegOrderDetails();
		}

		@Override
		public void setValue(SingleOrMultiLegOrderChoice obj, MultiLegOrder1 value) {
			obj.setMultilegOrderDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SingleOrMultiLegOrderChoice.mmSingleOrderDetails, com.tools20022.repository.choice.SingleOrMultiLegOrderChoice.mmMultilegOrderDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SingleOrMultiLegOrderChoice";
				definition = "Choice between a single order or a multileg order.";
			}
		});
		return mmObject_lazy.get();
	}

	public SingleOrder1 getSingleOrderDetails() {
		return singleOrderDetails;
	}

	public SingleOrMultiLegOrderChoice setSingleOrderDetails(SingleOrder1 singleOrderDetails) {
		this.singleOrderDetails = Objects.requireNonNull(singleOrderDetails);
		return this;
	}

	public MultiLegOrder1 getMultilegOrderDetails() {
		return multilegOrderDetails;
	}

	public SingleOrMultiLegOrderChoice setMultilegOrderDetails(MultiLegOrder1 multilegOrderDetails) {
		this.multilegOrderDetails = Objects.requireNonNull(multilegOrderDetails);
		return this;
	}
}