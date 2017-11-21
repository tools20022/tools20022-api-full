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
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.MarginAmountRequirement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the margin requirements for the variation margin and
 * optionally the segregated independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Requirement1#mmVariationMarginRequirement
 * Requirement1.mmVariationMarginRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Requirement1#mmSegregatedIndependentAmountRequirement
 * Requirement1.mmSegregatedIndependentAmountRequirement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.MarginAmountRequirement
 * MarginAmountRequirement}</li>
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
 * "Requirement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the margin requirements for the variation margin and optionally the segregated independent amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Requirement1", propOrder = {"variationMarginRequirement", "segregatedIndependentAmountRequirement"})
public class Requirement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MarginRequirement1 variationMarginRequirement;
	/**
	 * Provides details about the margin requirements for the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginRequirement1
	 * MarginRequirement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
	 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Requirement1 Requirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin requirements for the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariationMarginRequirement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmVariationMarginAmountRequirement;
			componentContext_lazy = () -> Requirement1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRequirement";
			definition = "Provides details about the margin requirements for the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarginRequirement1.mmObject();
		}
	};
	protected MarginRequirement1 segregatedIndependentAmountRequirement;
	/**
	 * Provides details about the margin requirements for the segregated
	 * independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarginRequirement1
	 * MarginRequirement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmSegregatedAmountRequirement
	 * ExposureCalculation.mmSegregatedAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Requirement1 Requirement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmtRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin requirements for the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmountRequirement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmSegregatedAmountRequirement;
			componentContext_lazy = () -> Requirement1.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmtRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRequirement";
			definition = "Provides details about the margin requirements for the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarginRequirement1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Requirement1.mmVariationMarginRequirement, Requirement1.mmSegregatedIndependentAmountRequirement);
				trace_lazy = () -> MarginAmountRequirement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Requirement1";
				definition = "Provides details about the margin requirements for the variation margin and optionally the segregated independent amount.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "VartnMrgnRqrmnt", required = true)
	public MarginRequirement1 getVariationMarginRequirement() {
		return variationMarginRequirement;
	}

	public void setVariationMarginRequirement(com.tools20022.repository.msg.MarginRequirement1 variationMarginRequirement) {
		this.variationMarginRequirement = variationMarginRequirement;
	}

	@XmlElement(name = "SgrtdIndpdntAmtRqrmnt")
	public MarginRequirement1 getSegregatedIndependentAmountRequirement() {
		return segregatedIndependentAmountRequirement;
	}

	public void setSegregatedIndependentAmountRequirement(com.tools20022.repository.msg.MarginRequirement1 segregatedIndependentAmountRequirement) {
		this.segregatedIndependentAmountRequirement = segregatedIndependentAmountRequirement;
	}
}