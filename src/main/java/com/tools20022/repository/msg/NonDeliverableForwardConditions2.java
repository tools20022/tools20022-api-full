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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04;
import com.tools20022.repository.entity.FixingCondition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FixingConditions1;
import com.tools20022.repository.msg.OpeningConditions1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2#mmOpeningConditions
 * NonDeliverableForwardConditions2.mmOpeningConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2#mmFixingConditions
 * NonDeliverableForwardConditions2.mmFixingConditions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FixingCondition
 * FixingCondition}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmNonDeliverableForwardConditions
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmNonDeliverableForwardConditions}</li>
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
 * "NonDeliverableForwardConditions2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the opening and valuation conditions for the non deliverable forward."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions1
 * NonDeliverableForwardConditions1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonDeliverableForwardConditions2", propOrder = {"openingConditions", "fixingConditions"})
public class NonDeliverableForwardConditions2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OpngConds", required = true)
	protected OpeningConditions1 openingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OpeningConditions1
	 * OpeningConditions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2
	 * NonDeliverableForwardConditions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the opening information associated with an NDF trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NonDeliverableForwardConditions2, OpeningConditions1> mmOpeningConditions = new MMMessageAssociationEnd<NonDeliverableForwardConditions2, OpeningConditions1>() {
		{
			businessComponentTrace_lazy = () -> FixingCondition.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardConditions2.mmObject();
			isDerived = false;
			xmlTag = "OpngConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningConditions";
			definition = "Provides the opening information associated with an NDF trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OpeningConditions1.mmObject();
		}

		@Override
		public OpeningConditions1 getValue(NonDeliverableForwardConditions2 obj) {
			return obj.getOpeningConditions();
		}

		@Override
		public void setValue(NonDeliverableForwardConditions2 obj, OpeningConditions1 value) {
			obj.setOpeningConditions(value);
		}
	};
	@XmlElement(name = "FxgConds")
	protected FixingConditions1 fixingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FixingConditions1
	 * FixingConditions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions2
	 * NonDeliverableForwardConditions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxgConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the additional information for an NDF as supplied on a fixing instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NonDeliverableForwardConditions2, Optional<FixingConditions1>> mmFixingConditions = new MMMessageAssociationEnd<NonDeliverableForwardConditions2, Optional<FixingConditions1>>() {
		{
			businessComponentTrace_lazy = () -> FixingCondition.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardConditions2.mmObject();
			isDerived = false;
			xmlTag = "FxgConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingConditions";
			definition = "Provides the additional information for an NDF as supplied on a fixing instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FixingConditions1.mmObject();
		}

		@Override
		public Optional<FixingConditions1> getValue(NonDeliverableForwardConditions2 obj) {
			return obj.getFixingConditions();
		}

		@Override
		public void setValue(NonDeliverableForwardConditions2 obj, Optional<FixingConditions1> value) {
			obj.setFixingConditions(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDeliverableForwardConditions2.mmOpeningConditions, com.tools20022.repository.msg.NonDeliverableForwardConditions2.mmFixingConditions);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeStatusAndDetailsNotificationV04.mmNonDeliverableForwardConditions);
				trace_lazy = () -> FixingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableForwardConditions2";
				definition = "Specifies the opening and valuation conditions for the non deliverable forward.";
				previousVersion_lazy = () -> NonDeliverableForwardConditions1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public OpeningConditions1 getOpeningConditions() {
		return openingConditions;
	}

	public NonDeliverableForwardConditions2 setOpeningConditions(OpeningConditions1 openingConditions) {
		this.openingConditions = Objects.requireNonNull(openingConditions);
		return this;
	}

	public Optional<FixingConditions1> getFixingConditions() {
		return fixingConditions == null ? Optional.empty() : Optional.of(fixingConditions);
	}

	public NonDeliverableForwardConditions2 setFixingConditions(FixingConditions1 fixingConditions) {
		this.fixingConditions = fixingConditions;
		return this;
	}
}