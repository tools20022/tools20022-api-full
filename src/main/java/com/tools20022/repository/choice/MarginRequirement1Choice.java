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
import com.tools20022.repository.area.colr.MarginCallRequestV03;
import com.tools20022.repository.area.colr.MarginCallRequestV04;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarginRequirement1;
import com.tools20022.repository.msg.Requirement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the margin requirements for the variation margin and the segregated
 * independent amount, or the segregated independent amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice#mmMarginRequirement
 * MarginRequirement1Choice.mmMarginRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice#mmSegregatedIndependentAmountRequirement
 * MarginRequirement1Choice.mmSegregatedIndependentAmountRequirement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
 * ExposureCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmRequirementDetailsDueToA
 * MarginCallRequestV03.mmRequirementDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmRequirementDetailsDueToB
 * MarginCallRequestV03.mmRequirementDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToA
 * MarginCallRequestV04.mmRequirementDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToB
 * MarginCallRequestV04.mmRequirementDetailsDueToB}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginRequirement1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the margin requirements for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginRequirement1Choice", propOrder = {"marginRequirement", "segregatedIndependentAmountRequirement"})
public class MarginRequirement1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgnRqrmnt", required = true)
	protected Requirement1 marginRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Requirement1
	 * Requirement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmVariationMarginAmountRequirement
	 * ExposureCalculation.mmVariationMarginAmountRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin requirements for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginRequirement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmVariationMarginAmountRequirement;
			componentContext_lazy = () -> com.tools20022.repository.choice.MarginRequirement1Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginRequirement";
			definition = "Provides details about the margin requirements for the variation margin and optionally the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Requirement1.mmObject();
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmtRqrmnt", required = true)
	protected MarginRequirement1 segregatedIndependentAmountRequirement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
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
	 * "Provides details about the margin requirements for the segregated independent amount only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmountRequirement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmSegregatedAmountRequirement;
			componentContext_lazy = () -> com.tools20022.repository.choice.MarginRequirement1Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmtRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRequirement";
			definition = "Provides details about the margin requirements for the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarginRequirement1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginRequirement1Choice.mmMarginRequirement, com.tools20022.repository.choice.MarginRequirement1Choice.mmSegregatedIndependentAmountRequirement);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV03.mmRequirementDetailsDueToA, MarginCallRequestV03.mmRequirementDetailsDueToB, MarginCallRequestV04.mmRequirementDetailsDueToA,
						MarginCallRequestV04.mmRequirementDetailsDueToB);
				trace_lazy = () -> ExposureCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginRequirement1Choice";
				definition = "Provides the margin requirements for the variation margin and the segregated independent amount, or the segregated independent amount only.";
			}
		});
		return mmObject_lazy.get();
	}

	public Requirement1 getMarginRequirement() {
		return marginRequirement;
	}

	public MarginRequirement1Choice setMarginRequirement(Requirement1 marginRequirement) {
		this.marginRequirement = Objects.requireNonNull(marginRequirement);
		return this;
	}

	public MarginRequirement1 getSegregatedIndependentAmountRequirement() {
		return segregatedIndependentAmountRequirement;
	}

	public MarginRequirement1Choice setSegregatedIndependentAmountRequirement(MarginRequirement1 segregatedIndependentAmountRequirement) {
		this.segregatedIndependentAmountRequirement = Objects.requireNonNull(segregatedIndependentAmountRequirement);
		return this;
	}
}