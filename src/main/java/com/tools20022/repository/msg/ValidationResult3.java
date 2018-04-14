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
import com.tools20022.repository.area.tsmt.ErrorReportV03;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ElementIdentification3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the error that is the cause of the rejection.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValidationResult3#mmSequenceNumber
 * ValidationResult3.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValidationResult3#mmRuleIdentification
 * ValidationResult3.mmRuleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValidationResult3#mmRuleDescription
 * ValidationResult3.mmRuleDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValidationResult3#mmElement
 * ValidationResult3.mmElement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmErrorDescription
 * ErrorReportV03.mmErrorDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ValidationResult3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes the error that is the cause of the rejection."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ValidationResult3", propOrder = {"sequenceNumber", "ruleIdentification", "ruleDescription", "element"})
public class ValidationResult3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SeqNb", required = true)
	protected Number sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValidationResult3
	 * ValidationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number assigned to the error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ValidationResult3, Number> mmSequenceNumber = new MMMessageAttribute<ValidationResult3, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number assigned to the error.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(ValidationResult3 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(ValidationResult3 obj, Number value) {
			obj.setSequenceNumber(value);
		}
	};
	@XmlElement(name = "RuleId", required = true)
	protected Max35Text ruleIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ValidationResult3
	 * ValidationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RuleId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RuleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Coded identification of the rule that is violated by the rejected message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ValidationResult3, Max35Text> mmRuleIdentification = new MMMessageAttribute<ValidationResult3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "RuleId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RuleIdentification";
			definition = "Coded identification of the rule that is violated by the rejected message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ValidationResult3 obj) {
			return obj.getRuleIdentification();
		}

		@Override
		public void setValue(ValidationResult3 obj, Max35Text value) {
			obj.setRuleIdentification(value);
		}
	};
	@XmlElement(name = "RuleDesc", required = true)
	protected Max350Text ruleDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValidationResult3
	 * ValidationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RuleDesc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RuleDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed description of the rule."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ValidationResult3, Max350Text> mmRuleDescription = new MMMessageAttribute<ValidationResult3, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "RuleDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RuleDescription";
			definition = "Detailed description of the rule.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(ValidationResult3 obj) {
			return obj.getRuleDescription();
		}

		@Override
		public void setValue(ValidationResult3 obj, Max350Text value) {
			obj.setRuleDescription(value);
		}
	};
	@XmlElement(name = "Elmt")
	protected List<ElementIdentification3> element;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ElementIdentification3
	 * ElementIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValidationResult3
	 * ValidationResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Elmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Element"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the elements that violated the rule."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ValidationResult3, List<ElementIdentification3>> mmElement = new MMMessageAssociationEnd<ValidationResult3, List<ElementIdentification3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "Elmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Element";
			definition = "Description of the elements that violated the rule.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ElementIdentification3.mmObject();
		}

		@Override
		public List<ElementIdentification3> getValue(ValidationResult3 obj) {
			return obj.getElement();
		}

		@Override
		public void setValue(ValidationResult3 obj, List<ElementIdentification3> value) {
			obj.setElement(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValidationResult3.mmSequenceNumber, com.tools20022.repository.msg.ValidationResult3.mmRuleIdentification,
						com.tools20022.repository.msg.ValidationResult3.mmRuleDescription, com.tools20022.repository.msg.ValidationResult3.mmElement);
				messageBuildingBlock_lazy = () -> Arrays.asList(ErrorReportV03.mmErrorDescription);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValidationResult3";
				definition = "Describes the error that is the cause of the rejection.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getSequenceNumber() {
		return sequenceNumber;
	}

	public ValidationResult3 setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = Objects.requireNonNull(sequenceNumber);
		return this;
	}

	public Max35Text getRuleIdentification() {
		return ruleIdentification;
	}

	public ValidationResult3 setRuleIdentification(Max35Text ruleIdentification) {
		this.ruleIdentification = Objects.requireNonNull(ruleIdentification);
		return this;
	}

	public Max350Text getRuleDescription() {
		return ruleDescription;
	}

	public ValidationResult3 setRuleDescription(Max350Text ruleDescription) {
		this.ruleDescription = Objects.requireNonNull(ruleDescription);
		return this;
	}

	public List<ElementIdentification3> getElement() {
		return element == null ? element = new ArrayList<>() : element;
	}

	public ValidationResult3 setElement(List<ElementIdentification3> element) {
		this.element = Objects.requireNonNull(element);
		return this;
	}
}