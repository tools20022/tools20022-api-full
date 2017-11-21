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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Trigger1", propOrder = {"dateChoice", "documentaryEvent"})
public class Trigger1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FixedOrRecurrentDate1Choice dateChoice;
	/**
	 * Details related to the date on which a variation is effective.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDateChoice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trigger.mmTriggerDate;
			componentContext_lazy = () -> Trigger1.mmObject();
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
	};
	protected List<com.tools20022.repository.msg.Document10> documentaryEvent;
	/**
	 * Details related to the documentary event on which a variation is
	 * triggered.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDocumentaryEvent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmSpecifiedDocument;
			componentContext_lazy = () -> Trigger1.mmObject();
			isDerived = false;
			xmlTag = "DcmntryEvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentaryEvent";
			definition = "Details related to the documentary event on which a variation is triggered.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Document10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Trigger1.mmDateChoice, Trigger1.mmDocumentaryEvent);
				trace_lazy = () -> AutomaticVariation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Trigger1";
				definition = "Trigger parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DtChc")
	public FixedOrRecurrentDate1Choice getDateChoice() {
		return dateChoice;
	}

	public void setDateChoice(FixedOrRecurrentDate1Choice dateChoice) {
		this.dateChoice = dateChoice;
	}

	@XmlElement(name = "DcmntryEvt")
	public List<Document10> getDocumentaryEvent() {
		return documentaryEvent;
	}

	public void setDocumentaryEvent(List<com.tools20022.repository.msg.Document10> documentaryEvent) {
		this.documentaryEvent = documentaryEvent;
	}
}