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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OpeningConditions1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of providing the opening conditions or fixing conditions for an NDF
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NDFOpeningFixing1Choice#mmOpeningConditions
 * NDFOpeningFixing1Choice.mmOpeningConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NDFOpeningFixing1Choice#mmOpeningConfirmationReference
 * NDFOpeningFixing1Choice.mmOpeningConfirmationReference}</li>
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
 * "NDFOpeningFixing1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of providing the opening conditions or fixing conditions for an NDF instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NDFOpeningFixing1Choice", propOrder = {"openingConditions", "openingConfirmationReference"})
public class NDFOpeningFixing1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NDFOpeningFixing1Choice
	 * NDFOpeningFixing1Choice}</li>
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
	 * "Used to provide the opening information associated with an NDF trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NDFOpeningFixing1Choice, OpeningConditions1> mmOpeningConditions = new MMMessageAssociationEnd<NDFOpeningFixing1Choice, OpeningConditions1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NDFOpeningFixing1Choice.mmObject();
			isDerived = false;
			xmlTag = "OpngConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningConditions";
			definition = "Used to provide the opening information associated with an NDF trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OpeningConditions1.mmObject();
		}

		@Override
		public OpeningConditions1 getValue(NDFOpeningFixing1Choice obj) {
			return obj.getOpeningConditions();
		}

		@Override
		public void setValue(NDFOpeningFixing1Choice obj, OpeningConditions1 value) {
			obj.setOpeningConditions(value);
		}
	};
	@XmlElement(name = "OpngConfRef", required = true)
	protected Max35Text openingConfirmationReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NDFOpeningFixing1Choice
	 * NDFOpeningFixing1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngConfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningConfirmationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the opening confirmation provided on an NDF fixing instruction to link back to the original NDF opening confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NDFOpeningFixing1Choice, Max35Text> mmOpeningConfirmationReference = new MMMessageAttribute<NDFOpeningFixing1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NDFOpeningFixing1Choice.mmObject();
			isDerived = false;
			xmlTag = "OpngConfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningConfirmationReference";
			definition = "Reference of the opening confirmation provided on an NDF fixing instruction to link back to the original NDF opening confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(NDFOpeningFixing1Choice obj) {
			return obj.getOpeningConfirmationReference();
		}

		@Override
		public void setValue(NDFOpeningFixing1Choice obj, Max35Text value) {
			obj.setOpeningConfirmationReference(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NDFOpeningFixing1Choice.mmOpeningConditions, com.tools20022.repository.choice.NDFOpeningFixing1Choice.mmOpeningConfirmationReference);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NDFOpeningFixing1Choice";
				definition = "Choice of providing the opening conditions or fixing conditions for an NDF instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public OpeningConditions1 getOpeningConditions() {
		return openingConditions;
	}

	public NDFOpeningFixing1Choice setOpeningConditions(OpeningConditions1 openingConditions) {
		this.openingConditions = Objects.requireNonNull(openingConditions);
		return this;
	}

	public Max35Text getOpeningConfirmationReference() {
		return openingConfirmationReference;
	}

	public NDFOpeningFixing1Choice setOpeningConfirmationReference(Max35Text openingConfirmationReference) {
		this.openingConfirmationReference = Objects.requireNonNull(openingConfirmationReference);
		return this;
	}
}