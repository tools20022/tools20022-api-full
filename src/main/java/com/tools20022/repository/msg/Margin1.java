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
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.IndependentAmountTerm;
import com.tools20022.repository.entity.VariationMarginTerm;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SegregatedIndependentAmountMargin1;
import com.tools20022.repository.msg.VariationMargin1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the elements used to calculate the collateral margin call for the
 * variation margin and optionally the segregated independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Margin1#mmVariationMargin
 * Margin1.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Margin1#mmSegregatedIndependentAmountMargin
 * Margin1.mmSegregatedIndependentAmountMargin}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExposureTerm
 * ExposureTerm}</li>
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
 * "Margin1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the elements used to calculate the collateral margin call for the variation margin and optionally the segregated independent amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Margin1", propOrder = {"variationMargin", "segregatedIndependentAmountMargin"})
public class Margin1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VartnMrgn", required = true)
	protected VariationMargin1 variationMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VariationMargin1
	 * VariationMargin1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm
	 * VariationMarginTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin1
	 * Margin1}</li>
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
	 * "Elements used to calculate the collateral margin call for the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin1, VariationMargin1> mmVariationMargin = new MMMessageAssociationEnd<Margin1, VariationMargin1>() {
		{
			businessComponentTrace_lazy = () -> VariationMarginTerm.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Elements used to calculate the collateral margin call for the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> VariationMargin1.mmObject();
		}

		@Override
		public VariationMargin1 getValue(Margin1 obj) {
			return obj.getVariationMargin();
		}

		@Override
		public void setValue(Margin1 obj, VariationMargin1 value) {
			obj.setVariationMargin(value);
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmtMrgn")
	protected SegregatedIndependentAmountMargin1 segregatedIndependentAmountMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1
	 * SegregatedIndependentAmountMargin1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmountTerm
	 * IndependentAmountTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin1
	 * Margin1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmtMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements used to calculate the collateral margin call for the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin1, Optional<SegregatedIndependentAmountMargin1>> mmSegregatedIndependentAmountMargin = new MMMessageAssociationEnd<Margin1, Optional<SegregatedIndependentAmountMargin1>>() {
		{
			businessComponentTrace_lazy = () -> IndependentAmountTerm.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin1.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmtMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountMargin";
			definition = "Elements used to calculate the collateral margin call for the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SegregatedIndependentAmountMargin1.mmObject();
		}

		@Override
		public Optional<SegregatedIndependentAmountMargin1> getValue(Margin1 obj) {
			return obj.getSegregatedIndependentAmountMargin();
		}

		@Override
		public void setValue(Margin1 obj, Optional<SegregatedIndependentAmountMargin1> value) {
			obj.setSegregatedIndependentAmountMargin(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin1.mmVariationMargin, com.tools20022.repository.msg.Margin1.mmSegregatedIndependentAmountMargin);
				trace_lazy = () -> ExposureTerm.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Margin1";
				definition = "Defines the elements used to calculate the collateral margin call for the variation margin and optionally the segregated independent amount.";
			}
		});
		return mmObject_lazy.get();
	}

	public VariationMargin1 getVariationMargin() {
		return variationMargin;
	}

	public Margin1 setVariationMargin(VariationMargin1 variationMargin) {
		this.variationMargin = Objects.requireNonNull(variationMargin);
		return this;
	}

	public Optional<SegregatedIndependentAmountMargin1> getSegregatedIndependentAmountMargin() {
		return segregatedIndependentAmountMargin == null ? Optional.empty() : Optional.of(segregatedIndependentAmountMargin);
	}

	public Margin1 setSegregatedIndependentAmountMargin(SegregatedIndependentAmountMargin1 segregatedIndependentAmountMargin) {
		this.segregatedIndependentAmountMargin = segregatedIndependentAmountMargin;
		return this;
	}
}