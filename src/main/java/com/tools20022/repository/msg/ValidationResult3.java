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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ValidationResult3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes the error that is the cause of the rejection."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ValidationResult3", propOrder = {"sequenceNumber", "ruleIdentification", "ruleDescription", "element"})
public class ValidationResult3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number sequenceNumber;
	/**
	 * Sequential number assigned to the error.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number assigned to the error."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number assigned to the error.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max35Text ruleIdentification;
	/**
	 * Coded identification of the rule that is violated by the rejected
	 * message.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RuleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Coded identification of the rule that is violated by the rejected message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRuleIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "RuleId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RuleIdentification";
			definition = "Coded identification of the rule that is violated by the rejected message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max350Text ruleDescription;
	/**
	 * Detailed description of the rule.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RuleDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed description of the rule."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRuleDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "RuleDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RuleDescription";
			definition = "Detailed description of the rule.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ElementIdentification3> element;
	/**
	 * Description of the elements that violated the rule.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Element"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the elements that violated the rule."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmElement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ValidationResult3.mmObject();
			isDerived = false;
			xmlTag = "Elmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Element";
			definition = "Description of the elements that violated the rule.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ElementIdentification3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ValidationResult3.mmSequenceNumber, ValidationResult3.mmRuleIdentification, ValidationResult3.mmRuleDescription, ValidationResult3.mmElement);
				messageBuildingBlock_lazy = () -> Arrays.asList(ErrorReportV03.mmErrorDescription);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValidationResult3";
				definition = "Describes the error that is the cause of the rejection.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SeqNb", required = true)
	public Number getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@XmlElement(name = "RuleId", required = true)
	public Max35Text getRuleIdentification() {
		return ruleIdentification;
	}

	public void setRuleIdentification(Max35Text ruleIdentification) {
		this.ruleIdentification = ruleIdentification;
	}

	@XmlElement(name = "RuleDesc", required = true)
	public Max350Text getRuleDescription() {
		return ruleDescription;
	}

	public void setRuleDescription(Max350Text ruleDescription) {
		this.ruleDescription = ruleDescription;
	}

	@XmlElement(name = "Elmt")
	public List<ElementIdentification3> getElement() {
		return element;
	}

	public void setElement(List<com.tools20022.repository.msg.ElementIdentification3> element) {
		this.element = element;
	}
}