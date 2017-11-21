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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the agreed amount for the variation margin and
 * optionaly the segregated independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AgreedAmount1#mmVariationMarginAmount
 * AgreedAmount1.mmVariationMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AgreedAmount1#mmSegregatedIndependentAmount
 * AgreedAmount1.mmSegregatedIndependentAmount}</li>
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
 * "AgreedAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the agreed amount for the variation margin and optionaly the segregated independent amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgreedAmount1", propOrder = {"variationMarginAmount", "segregatedIndependentAmount"})
public class AgreedAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Amount1 variationMarginAmount;
	/**
	 * Provides details about the agreed amount for the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount1 Amount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
	 * MarginCall.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreedAmount1 AgreedAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the agreed amount for the variation margin."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariationMarginAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmVariationMargin;
			componentContext_lazy = () -> AgreedAmount1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmount";
			definition = "Provides details about the agreed amount for the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount1.mmObject();
		}
	};
	protected Amount1 segregatedIndependentAmount;
	/**
	 * Provides details about the agreed amount for the segregated independent
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount1 Amount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSegregatedIndependentAmount
	 * MarginCall.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AgreedAmount1 AgreedAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the agreed amount for the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> AgreedAmount1.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides details about the agreed amount for the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AgreedAmount1.mmVariationMarginAmount, AgreedAmount1.mmSegregatedIndependentAmount);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgreedAmount1";
				definition = "Provides details about the agreed amount for the variation margin and optionaly the segregated independent amount.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "VartnMrgnAmt", required = true)
	public Amount1 getVariationMarginAmount() {
		return variationMarginAmount;
	}

	public void setVariationMarginAmount(com.tools20022.repository.msg.Amount1 variationMarginAmount) {
		this.variationMarginAmount = variationMarginAmount;
	}

	@XmlElement(name = "SgrtdIndpdntAmt")
	public Amount1 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(com.tools20022.repository.msg.Amount1 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}
}