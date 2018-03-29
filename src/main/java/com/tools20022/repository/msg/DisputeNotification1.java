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
import com.tools20022.repository.entity.DisputeManagement;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SegregatedIndependentAmountDispute1;
import com.tools20022.repository.msg.VariationMarginDispute1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the dispute notification details for the variation margin and
 * optionaly the segregated independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisputeNotification1#mmVariationMarginDispute
 * DisputeNotification1.mmVariationMarginDispute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisputeNotification1#mmSegregatedIndependentAmountDispute
 * DisputeNotification1.mmSegregatedIndependentAmountDispute}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DisputeManagement
 * DisputeManagement}</li>
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
 * "DisputeNotification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the dispute notification details for the variation margin and optionaly the segregated independent amount."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DisputeNotification1", propOrder = {"variationMarginDispute", "segregatedIndependentAmountDispute"})
public class DisputeNotification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VartnMrgnDspt", required = true)
	protected VariationMarginDispute1 variationMarginDispute;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.VariationMarginDispute1
	 * VariationMarginDispute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
	 * MarginCall.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisputeNotification1
	 * DisputeNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnDspt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginDispute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the dispute notification details for the variation margin."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DisputeNotification1, VariationMarginDispute1> mmVariationMarginDispute = new MMMessageAssociationEnd<DisputeNotification1, VariationMarginDispute1>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmVariationMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisputeNotification1.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnDspt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginDispute";
			definition = "Provides the dispute notification details for the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> VariationMarginDispute1.mmObject();
		}

		@Override
		public VariationMarginDispute1 getValue(DisputeNotification1 obj) {
			return obj.getVariationMarginDispute();
		}

		@Override
		public void setValue(DisputeNotification1 obj, VariationMarginDispute1 value) {
			obj.setVariationMarginDispute(value);
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmtDspt")
	protected SegregatedIndependentAmountDispute1 segregatedIndependentAmountDispute;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountDispute1
	 * SegregatedIndependentAmountDispute1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSegregatedIndependentAmount
	 * MarginCall.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisputeNotification1
	 * DisputeNotification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmtDspt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountDispute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the dispute notification details for the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DisputeNotification1, Optional<SegregatedIndependentAmountDispute1>> mmSegregatedIndependentAmountDispute = new MMMessageAssociationEnd<DisputeNotification1, Optional<SegregatedIndependentAmountDispute1>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DisputeNotification1.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmtDspt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountDispute";
			definition = "Provides the dispute notification details for the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SegregatedIndependentAmountDispute1.mmObject();
		}

		@Override
		public Optional<SegregatedIndependentAmountDispute1> getValue(DisputeNotification1 obj) {
			return obj.getSegregatedIndependentAmountDispute();
		}

		@Override
		public void setValue(DisputeNotification1 obj, Optional<SegregatedIndependentAmountDispute1> value) {
			obj.setSegregatedIndependentAmountDispute(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisputeNotification1.mmVariationMarginDispute, com.tools20022.repository.msg.DisputeNotification1.mmSegregatedIndependentAmountDispute);
				trace_lazy = () -> DisputeManagement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisputeNotification1";
				definition = "Provides the dispute notification details for the variation margin and optionaly the segregated independent amount.";
			}
		});
		return mmObject_lazy.get();
	}

	public VariationMarginDispute1 getVariationMarginDispute() {
		return variationMarginDispute;
	}

	public DisputeNotification1 setVariationMarginDispute(VariationMarginDispute1 variationMarginDispute) {
		this.variationMarginDispute = Objects.requireNonNull(variationMarginDispute);
		return this;
	}

	public Optional<SegregatedIndependentAmountDispute1> getSegregatedIndependentAmountDispute() {
		return segregatedIndependentAmountDispute == null ? Optional.empty() : Optional.of(segregatedIndependentAmountDispute);
	}

	public DisputeNotification1 setSegregatedIndependentAmountDispute(SegregatedIndependentAmountDispute1 segregatedIndependentAmountDispute) {
		this.segregatedIndependentAmountDispute = segregatedIndependentAmountDispute;
		return this;
	}
}