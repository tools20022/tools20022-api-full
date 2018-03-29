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
import com.tools20022.repository.choice.FixedOrRecurrentDate1Choice;
import com.tools20022.repository.entity.AutomaticVariation;
import com.tools20022.repository.entity.Trigger;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Document10;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Trigger parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Trigger1#mmDateChoice
 * Trigger1.mmDateChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Trigger1#mmDocumentaryEvent
 * Trigger1.mmDocumentaryEvent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AutomaticVariation
 * AutomaticVariation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDateChoiceAndDocumentaryEvent1Rule#forTrigger1
 * ConstraintDateChoiceAndDocumentaryEvent1Rule.forTrigger1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDateChoiceAndDocumentaryEvent2Rule#forTrigger1
 * ConstraintDateChoiceAndDocumentaryEvent2Rule.forTrigger1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Trigger1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Trigger parameters."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Trigger1", propOrder = {"dateChoice", "documentaryEvent"})
public class Trigger1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtChc")
	protected FixedOrRecurrentDate1Choice dateChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FixedOrRecurrentDate1Choice
	 * FixedOrRecurrentDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trigger#mmTriggerDate
	 * Trigger.mmTriggerDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trigger1
	 * Trigger1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the date on which a variation is effective."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Trigger1, Optional<FixedOrRecurrentDate1Choice>> mmDateChoice = new MMMessageAssociationEnd<Trigger1, Optional<FixedOrRecurrentDate1Choice>>() {
		{
			businessElementTrace_lazy = () -> Trigger.mmTriggerDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trigger1.mmObject();
			isDerived = false;
			xmlTag = "DtChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateChoice";
			definition = "Details related to the date on which a variation is effective.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FixedOrRecurrentDate1Choice.mmObject();
		}

		@Override
		public Optional<FixedOrRecurrentDate1Choice> getValue(Trigger1 obj) {
			return obj.getDateChoice();
		}

		@Override
		public void setValue(Trigger1 obj, Optional<FixedOrRecurrentDate1Choice> value) {
			obj.setDateChoice(value.orElse(null));
		}
	};
	@XmlElement(name = "DcmntryEvt")
	protected List<Document10> documentaryEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Document10 Document10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmSpecifiedDocument
	 * Undertaking.mmSpecifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Trigger1
	 * Trigger1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmntryEvt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentaryEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the documentary event on which a variation is triggered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Trigger1, List<Document10>> mmDocumentaryEvent = new MMMessageAssociationEnd<Trigger1, List<Document10>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.Trigger1.mmObject();
			isDerived = false;
			xmlTag = "DcmntryEvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentaryEvent";
			definition = "Details related to the documentary event on which a variation is triggered.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Document10.mmObject();
		}

		@Override
		public List<Document10> getValue(Trigger1 obj) {
			return obj.getDocumentaryEvent();
		}

		@Override
		public void setValue(Trigger1 obj, List<Document10> value) {
			obj.setDocumentaryEvent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Trigger1.mmDateChoice, com.tools20022.repository.msg.Trigger1.mmDocumentaryEvent);
				trace_lazy = () -> AutomaticVariation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDateChoiceAndDocumentaryEvent1Rule.forTrigger1,
						com.tools20022.repository.constraints.ConstraintDateChoiceAndDocumentaryEvent2Rule.forTrigger1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trigger1";
				definition = "Trigger parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FixedOrRecurrentDate1Choice> getDateChoice() {
		return dateChoice == null ? Optional.empty() : Optional.of(dateChoice);
	}

	public Trigger1 setDateChoice(FixedOrRecurrentDate1Choice dateChoice) {
		this.dateChoice = dateChoice;
		return this;
	}

	public List<Document10> getDocumentaryEvent() {
		return documentaryEvent == null ? documentaryEvent = new ArrayList<>() : documentaryEvent;
	}

	public Trigger1 setDocumentaryEvent(List<Document10> documentaryEvent) {
		this.documentaryEvent = Objects.requireNonNull(documentaryEvent);
		return this;
	}
}