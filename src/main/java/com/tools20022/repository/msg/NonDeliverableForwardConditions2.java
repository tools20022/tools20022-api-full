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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the opening and valuation conditions for the non deliverable
 * forward
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonDeliverableForwardConditions2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the opening and valuation conditions for the non deliverable forward"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardConditions1
 * NonDeliverableForwardConditions1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NonDeliverableForwardConditions2", propOrder = {"openingConditions", "fixingConditions"})
public class NonDeliverableForwardConditions2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected OpeningConditions1 openingConditions;
	/**
	 * Provides the opening information associated with an NDF trade.
	 * <p>
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
	public static final MMMessageAssociationEnd mmOpeningConditions = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FixingCondition.mmObject();
			componentContext_lazy = () -> NonDeliverableForwardConditions2.mmObject();
			isDerived = false;
			xmlTag = "OpngConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningConditions";
			definition = "Provides the opening information associated with an NDF trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OpeningConditions1.mmObject();
		}
	};
	protected FixingConditions1 fixingConditions;
	/**
	 * Provides the additional information for an NDF as supplied on a fixing
	 * instruction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmFixingConditions = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FixingCondition.mmObject();
			componentContext_lazy = () -> NonDeliverableForwardConditions2.mmObject();
			isDerived = false;
			xmlTag = "FxgConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixingConditions";
			definition = "Provides the additional information for an NDF as supplied on a fixing instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FixingConditions1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NonDeliverableForwardConditions2.mmOpeningConditions, NonDeliverableForwardConditions2.mmFixingConditions);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeStatusAndDetailsNotificationV04.mmNonDeliverableForwardConditions);
				trace_lazy = () -> FixingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableForwardConditions2";
				definition = "Specifies the opening and valuation conditions for the non deliverable forward";
				previousVersion_lazy = () -> NonDeliverableForwardConditions1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OpngConds", required = true)
	public OpeningConditions1 getOpeningConditions() {
		return openingConditions;
	}

	public void setOpeningConditions(com.tools20022.repository.msg.OpeningConditions1 openingConditions) {
		this.openingConditions = openingConditions;
	}

	@XmlElement(name = "FxgConds")
	public FixingConditions1 getFixingConditions() {
		return fixingConditions;
	}

	public void setFixingConditions(com.tools20022.repository.msg.FixingConditions1 fixingConditions) {
		this.fixingConditions = fixingConditions;
	}
}