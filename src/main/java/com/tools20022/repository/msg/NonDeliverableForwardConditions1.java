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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04;
import com.tools20022.repository.choice.NDFOpeningFixing1Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the opening and valuation conditions for the non deliverable
 * forward.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions1#mmOpeningIndicator
 * NonDeliverableForwardConditions1.mmOpeningIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions1#mmOpeningFixingConditions
 * NonDeliverableForwardConditions1.mmOpeningFixingConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmNonDeliverableForwardConditions
 * ForeignExchangeTradeInstructionV04.mmNonDeliverableForwardConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmNonDeliverableForwardConditions
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmNonDeliverableForwardConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmNonDeliverableForwardConditions
 * ForeignExchangeTradeInstructionAmendmentV04.mmNonDeliverableForwardConditions
 * }</li>
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
 * "NonDeliverableForwardConditions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the opening and valuation conditions for the non deliverable forward."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2
 * NonDeliverableForwardConditions2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonDeliverableForwardConditions1", propOrder = {"openingIndicator", "openingFixingConditions"})
public class NonDeliverableForwardConditions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OpngInd", required = true)
	protected YesNoIndicator openingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions1
	 * NonDeliverableForwardConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the instruction is an NDF opening or fixing."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonDeliverableForwardConditions1, YesNoIndicator> mmOpeningIndicator = new MMMessageAttribute<NonDeliverableForwardConditions1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardConditions1.mmObject();
			isDerived = false;
			xmlTag = "OpngInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningIndicator";
			definition = "Specifies whether the instruction is an NDF opening or fixing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(NonDeliverableForwardConditions1 obj) {
			return obj.getOpeningIndicator();
		}

		@Override
		public void setValue(NonDeliverableForwardConditions1 obj, YesNoIndicator value) {
			obj.setOpeningIndicator(value);
		}
	};
	@XmlElement(name = "OpngFxgConds", required = true)
	protected NDFOpeningFixing1Choice openingFixingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NDFOpeningFixing1Choice
	 * NDFOpeningFixing1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions1
	 * NonDeliverableForwardConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngFxgConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningFixingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies either the conditions for an NDF oepning or an NDF fixing confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NonDeliverableForwardConditions1, NDFOpeningFixing1Choice> mmOpeningFixingConditions = new MMMessageAssociationEnd<NonDeliverableForwardConditions1, NDFOpeningFixing1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardConditions1.mmObject();
			isDerived = false;
			xmlTag = "OpngFxgConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningFixingConditions";
			definition = "Specifies either the conditions for an NDF oepning or an NDF fixing confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NDFOpeningFixing1Choice.mmObject();
		}

		@Override
		public NDFOpeningFixing1Choice getValue(NonDeliverableForwardConditions1 obj) {
			return obj.getOpeningFixingConditions();
		}

		@Override
		public void setValue(NonDeliverableForwardConditions1 obj, NDFOpeningFixing1Choice value) {
			obj.setOpeningFixingConditions(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDeliverableForwardConditions1.mmOpeningIndicator, com.tools20022.repository.msg.NonDeliverableForwardConditions1.mmOpeningFixingConditions);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionV04.mmNonDeliverableForwardConditions, ForeignExchangeTradeInstructionCancellationV04.mmNonDeliverableForwardConditions,
						ForeignExchangeTradeInstructionAmendmentV04.mmNonDeliverableForwardConditions);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableForwardConditions1";
				definition = "Specifies the opening and valuation conditions for the non deliverable forward.";
				nextVersions_lazy = () -> Arrays.asList(NonDeliverableForwardConditions2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getOpeningIndicator() {
		return openingIndicator;
	}

	public NonDeliverableForwardConditions1 setOpeningIndicator(YesNoIndicator openingIndicator) {
		this.openingIndicator = Objects.requireNonNull(openingIndicator);
		return this;
	}

	public NDFOpeningFixing1Choice getOpeningFixingConditions() {
		return openingFixingConditions;
	}

	public NonDeliverableForwardConditions1 setOpeningFixingConditions(NDFOpeningFixing1Choice openingFixingConditions) {
		this.openingFixingConditions = Objects.requireNonNull(openingFixingConditions);
		return this;
	}
}