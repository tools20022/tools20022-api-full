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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Addition1;
import com.tools20022.repository.msg.Deletion1;
import com.tools20022.repository.msg.Replacement1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the comparison between the currently established baseline elements
 * and the proposed ones.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#ReplacementOrAdditionOrDeletion
 * ComparisonResult1.ReplacementOrAdditionOrDeletion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#mmElementSequenceNumber
 * ComparisonResult1.mmElementSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#mmElementPath
 * ComparisonResult1.mmElementPath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#mmElementName
 * ComparisonResult1.mmElementName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#mmReplacement
 * ComparisonResult1.mmReplacement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ComparisonResult1#mmDeletion
 * ComparisonResult1.mmDeletion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ComparisonResult1#mmAddition
 * ComparisonResult1.mmAddition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ComparisonResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the comparison between the currently established baseline elements and the proposed ones."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ComparisonResult1", propOrder = {"elementSequenceNumber", "elementPath", "elementName", "replacement", "deletion", "addition"})
public class ComparisonResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ElmtSeqNb", required = true)
	protected Number elementSequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1
	 * ComparisonResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElmtSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElementSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence number assigned to the element."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ComparisonResult1, Number> mmElementSequenceNumber = new MMMessageAttribute<ComparisonResult1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ComparisonResult1.mmObject();
			isDerived = false;
			xmlTag = "ElmtSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementSequenceNumber";
			definition = "Sequence number assigned to the element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(ComparisonResult1 obj) {
			return obj.getElementSequenceNumber();
		}

		@Override
		public void setValue(ComparisonResult1 obj, Number value) {
			obj.setElementSequenceNumber(value);
		}
	};
	@XmlElement(name = "ElmtPth", required = true)
	protected Max350Text elementPath;
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
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1
	 * ComparisonResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElmtPth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElementPath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies from the root of the message the complete path of the element."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ComparisonResult1, Max350Text> mmElementPath = new MMMessageAttribute<ComparisonResult1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ComparisonResult1.mmObject();
			isDerived = false;
			xmlTag = "ElmtPth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementPath";
			definition = "Specifies from the root of the message the complete path of the element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(ComparisonResult1 obj) {
			return obj.getElementPath();
		}

		@Override
		public void setValue(ComparisonResult1 obj, Max350Text value) {
			obj.setElementPath(value);
		}
	};
	@XmlElement(name = "ElmtNm", required = true)
	protected Max35Text elementName;
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
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1
	 * ComparisonResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElmtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElementName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the element."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ComparisonResult1, Max35Text> mmElementName = new MMMessageAttribute<ComparisonResult1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ComparisonResult1.mmObject();
			isDerived = false;
			xmlTag = "ElmtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementName";
			definition = "Name of the element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ComparisonResult1 obj) {
			return obj.getElementName();
		}

		@Override
		public void setValue(ComparisonResult1 obj, Max35Text value) {
			obj.setElementName(value);
		}
	};
	@XmlElement(name = "Rplcmnt", required = true)
	protected Replacement1 replacement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Replacement1
	 * Replacement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1
	 * ComparisonResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rplcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Replacement of an existing content by a different one."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ComparisonResult1, Replacement1> mmReplacement = new MMMessageAssociationEnd<ComparisonResult1, Replacement1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ComparisonResult1.mmObject();
			isDerived = false;
			xmlTag = "Rplcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replacement";
			definition = "Replacement of an existing content by a different one.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Replacement1.mmObject();
		}

		@Override
		public Replacement1 getValue(ComparisonResult1 obj) {
			return obj.getReplacement();
		}

		@Override
		public void setValue(ComparisonResult1 obj, Replacement1 value) {
			obj.setReplacement(value);
		}
	};
	@XmlElement(name = "Deltn", required = true)
	protected Deletion1 deletion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Deletion1 Deletion1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1
	 * ComparisonResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Deltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deletion of the current element."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ComparisonResult1, Deletion1> mmDeletion = new MMMessageAssociationEnd<ComparisonResult1, Deletion1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ComparisonResult1.mmObject();
			isDerived = false;
			xmlTag = "Deltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deletion";
			definition = "Deletion of the current element.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Deletion1.mmObject();
		}

		@Override
		public Deletion1 getValue(ComparisonResult1 obj) {
			return obj.getDeletion();
		}

		@Override
		public void setValue(ComparisonResult1 obj, Deletion1 value) {
			obj.setDeletion(value);
		}
	};
	@XmlElement(name = "Addtn", required = true)
	protected Addition1 addition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Addition1 Addition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1
	 * ComparisonResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Addtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Addition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Addition of a new element."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ComparisonResult1, Addition1> mmAddition = new MMMessageAssociationEnd<ComparisonResult1, Addition1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ComparisonResult1.mmObject();
			isDerived = false;
			xmlTag = "Addtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Addition";
			definition = "Addition of a new element.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Addition1.mmObject();
		}

		@Override
		public Addition1 getValue(ComparisonResult1 obj) {
			return obj.getAddition();
		}

		@Override
		public void setValue(ComparisonResult1 obj, Addition1 value) {
			obj.setAddition(value);
		}
	};
	/**
	 * One and only one Message Element in the list Addition, Deletion,
	 * Replacement must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1
	 * ComparisonResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#mmReplacement
	 * ComparisonResult1.mmReplacement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#mmDeletion
	 * ComparisonResult1.mmDeletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult1#mmAddition
	 * ComparisonResult1.mmAddition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementOrAdditionOrDeletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one Message Element in the list Addition, Deletion, Replacement must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ReplacementOrAdditionOrDeletion = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementOrAdditionOrDeletion";
			definition = "One and only one Message Element in the list Addition, Deletion, Replacement must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.ComparisonResult1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ComparisonResult1.mmReplacement, com.tools20022.repository.msg.ComparisonResult1.mmDeletion, com.tools20022.repository.msg.ComparisonResult1.mmAddition);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ComparisonResult1.mmElementSequenceNumber, com.tools20022.repository.msg.ComparisonResult1.mmElementPath,
						com.tools20022.repository.msg.ComparisonResult1.mmElementName, com.tools20022.repository.msg.ComparisonResult1.mmReplacement, com.tools20022.repository.msg.ComparisonResult1.mmDeletion,
						com.tools20022.repository.msg.ComparisonResult1.mmAddition);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ComparisonResult1";
				definition = "Describes the comparison between the currently established baseline elements and the proposed ones.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ComparisonResult1.ReplacementOrAdditionOrDeletion);
			}
		});
		return mmObject_lazy.get();
	}

	public Number getElementSequenceNumber() {
		return elementSequenceNumber;
	}

	public ComparisonResult1 setElementSequenceNumber(Number elementSequenceNumber) {
		this.elementSequenceNumber = Objects.requireNonNull(elementSequenceNumber);
		return this;
	}

	public Max350Text getElementPath() {
		return elementPath;
	}

	public ComparisonResult1 setElementPath(Max350Text elementPath) {
		this.elementPath = Objects.requireNonNull(elementPath);
		return this;
	}

	public Max35Text getElementName() {
		return elementName;
	}

	public ComparisonResult1 setElementName(Max35Text elementName) {
		this.elementName = Objects.requireNonNull(elementName);
		return this;
	}

	public Replacement1 getReplacement() {
		return replacement;
	}

	public ComparisonResult1 setReplacement(Replacement1 replacement) {
		this.replacement = Objects.requireNonNull(replacement);
		return this;
	}

	public Deletion1 getDeletion() {
		return deletion;
	}

	public ComparisonResult1 setDeletion(Deletion1 deletion) {
		this.deletion = Objects.requireNonNull(deletion);
		return this;
	}

	public Addition1 getAddition() {
		return addition;
	}

	public ComparisonResult1 setAddition(Addition1 addition) {
		this.addition = Objects.requireNonNull(addition);
		return this;
	}
}