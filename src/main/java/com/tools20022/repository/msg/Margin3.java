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
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the calculation of the margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Margin3#mmInitialMargin
 * Margin3.mmInitialMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin3#mmVariationMargin
 * Margin3.mmVariationMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin3#mmOtherMargin
 * Margin3.mmOtherMargin}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
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
 * "Margin3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the calculation of the margin."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Margin3", propOrder = {"initialMargin", "variationMargin", "otherMargin"})
public class Margin3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Amount2 initialMargin;
	/**
	 * Margin required for absorbing future market price fluctuations (market
	 * risks) occurring between the default of a member and close-out of
	 * unsettled securities positions by the central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
	 * MarginCall.mmInitialMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin3
	 * Margin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitialMargin = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmInitialMargin;
			componentContext_lazy = () -> Margin3.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.VariationMargin3> variationMargin;
	/**
	 * Provides details on the calculation of the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VariationMargin3
	 * VariationMargin3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
	 * MarginCall.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin3
	 * Margin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the calculation of the variation margin."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariationMargin = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmVariationMargin;
			componentContext_lazy = () -> Margin3.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides details on the calculation of the variation margin.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.VariationMargin3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Margin4> otherMargin;
	/**
	 * Provides details on the margin type and amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Margin4 Margin4}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin3
	 * Margin3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the margin type and amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherMargin = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> Margin3.mmObject();
			isDerived = false;
			xmlTag = "OthrMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherMargin";
			definition = "Provides details on the margin type and amount.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Margin4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Margin3.mmInitialMargin, Margin3.mmVariationMargin, Margin3.mmOtherMargin);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Margin3";
				definition = "Provides details on the calculation of the margin.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InitlMrgn")
	public Amount2 getInitialMargin() {
		return initialMargin;
	}

	public void setInitialMargin(com.tools20022.repository.msg.Amount2 initialMargin) {
		this.initialMargin = initialMargin;
	}

	@XmlElement(name = "VartnMrgn")
	public List<VariationMargin3> getVariationMargin() {
		return variationMargin;
	}

	public void setVariationMargin(List<com.tools20022.repository.msg.VariationMargin3> variationMargin) {
		this.variationMargin = variationMargin;
	}

	@XmlElement(name = "OthrMrgn")
	public List<Margin4> getOtherMargin() {
		return otherMargin;
	}

	public void setOtherMargin(List<com.tools20022.repository.msg.Margin4> otherMargin) {
		this.otherMargin = otherMargin;
	}
}