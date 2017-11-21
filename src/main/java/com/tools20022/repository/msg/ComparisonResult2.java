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
import com.tools20022.repository.area.tsmt.DeltaReportV03;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmReplacementOrAdditionOrDeletion
 * ComparisonResult2.mmReplacementOrAdditionOrDeletion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmElementSequenceNumber
 * ComparisonResult2.mmElementSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmElementPath
 * ComparisonResult2.mmElementPath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmElementName
 * ComparisonResult2.mmElementName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmReplacement
 * ComparisonResult2.mmReplacement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ComparisonResult2#mmDeletion
 * ComparisonResult2.mmDeletion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ComparisonResult2#mmAddition
 * ComparisonResult2.mmAddition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmUpdatedElement
 * DeltaReportV03.mmUpdatedElement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ComparisonResult2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the comparison between the currently established baseline elements and the proposed ones."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ComparisonResult2", propOrder = {"elementSequenceNumber", "elementPath", "elementName", "replacement", "deletion", "addition"})
public class ComparisonResult2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number elementSequenceNumber;
	/**
	 * Sequence number assigned to the element.
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
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
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
	public static final MMMessageAttribute mmElementSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ComparisonResult2.mmObject();
			isDerived = false;
			xmlTag = "ElmtSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementSequenceNumber";
			definition = "Sequence number assigned to the element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max350Text elementPath;
	/**
	 * Specifies from the root of the message the complete path of the element.
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
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
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
	public static final MMMessageAttribute mmElementPath = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ComparisonResult2.mmObject();
			isDerived = false;
			xmlTag = "ElmtPth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementPath";
			definition = "Specifies from the root of the message the complete path of the element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text elementName;
	/**
	 * Name of the element.
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
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
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
	public static final MMMessageAttribute mmElementName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ComparisonResult2.mmObject();
			isDerived = false;
			xmlTag = "ElmtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementName";
			definition = "Name of the element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Replacement2 replacement;
	/**
	 * Replacement of an existing content by a different one
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Replacement2
	 * Replacement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
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
	 * definition} = "Replacement of an existing content by a different one"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReplacement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ComparisonResult2.mmObject();
			isDerived = false;
			xmlTag = "Rplcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replacement";
			definition = "Replacement of an existing content by a different one";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Replacement2.mmObject();
		}
	};
	protected Deletion2 deletion;
	/**
	 * Deletion of the current element.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Deletion2 Deletion2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
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
	public static final MMMessageAssociationEnd mmDeletion = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ComparisonResult2.mmObject();
			isDerived = false;
			xmlTag = "Deltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deletion";
			definition = "Deletion of the current element.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Deletion2.mmObject();
		}
	};
	protected Addition2 addition;
	/**
	 * Addition of a new element.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Addition2 Addition2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
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
	public static final MMMessageAssociationEnd mmAddition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ComparisonResult2.mmObject();
			isDerived = false;
			xmlTag = "Addtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Addition";
			definition = "Addition of a new element.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Addition2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmReplacement
	 * ComparisonResult2.mmReplacement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmDeletion
	 * ComparisonResult2.mmDeletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2#mmAddition
	 * ComparisonResult2.mmAddition}</li>
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
	public static final MMXor mmReplacementOrAdditionOrDeletion = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplacementOrAdditionOrDeletion";
			definition = "One and only one Message Element in the list Addition, Deletion, Replacement must be present.";
			messageComponent_lazy = () -> ComparisonResult2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(ComparisonResult2.mmReplacement, ComparisonResult2.mmDeletion, ComparisonResult2.mmAddition);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ComparisonResult2.mmElementSequenceNumber, ComparisonResult2.mmElementPath, ComparisonResult2.mmElementName, ComparisonResult2.mmReplacement, ComparisonResult2.mmDeletion,
						ComparisonResult2.mmAddition);
				messageBuildingBlock_lazy = () -> Arrays.asList(DeltaReportV03.mmUpdatedElement);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ComparisonResult2";
				definition = "Describes the comparison between the currently established baseline elements and the proposed ones.";
				xors_lazy = () -> Arrays.asList(ComparisonResult2.mmReplacementOrAdditionOrDeletion);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ElmtSeqNb", required = true)
	public Number getElementSequenceNumber() {
		return elementSequenceNumber;
	}

	public void setElementSequenceNumber(Number elementSequenceNumber) {
		this.elementSequenceNumber = elementSequenceNumber;
	}

	@XmlElement(name = "ElmtPth", required = true)
	public Max350Text getElementPath() {
		return elementPath;
	}

	public void setElementPath(Max350Text elementPath) {
		this.elementPath = elementPath;
	}

	@XmlElement(name = "ElmtNm", required = true)
	public Max35Text getElementName() {
		return elementName;
	}

	public void setElementName(Max35Text elementName) {
		this.elementName = elementName;
	}

	@XmlElement(name = "Rplcmnt", required = true)
	public Replacement2 getReplacement() {
		return replacement;
	}

	public void setReplacement(com.tools20022.repository.msg.Replacement2 replacement) {
		this.replacement = replacement;
	}

	@XmlElement(name = "Deltn", required = true)
	public Deletion2 getDeletion() {
		return deletion;
	}

	public void setDeletion(com.tools20022.repository.msg.Deletion2 deletion) {
		this.deletion = deletion;
	}

	@XmlElement(name = "Addtn", required = true)
	public Addition2 getAddition() {
		return addition;
	}

	public void setAddition(com.tools20022.repository.msg.Addition2 addition) {
		this.addition = addition;
	}
}