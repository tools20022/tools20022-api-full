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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Description of the element that creates the mismatch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElementIdentification1#mmDocumentIndex
 * ElementIdentification1.mmDocumentIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElementIdentification1#mmElementPath
 * ElementIdentification1.mmElementPath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElementIdentification1#mmElementName
 * ElementIdentification1.mmElementName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElementIdentification1#mmElementValue
 * ElementIdentification1.mmElementValue}</li>
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
 * "ElementIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Description of the element that creates the mismatch."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ElementIdentification1", propOrder = {"documentIndex", "elementPath", "elementName", "elementValue"})
public class ElementIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max3NumericText documentIndex;
	/**
	 * Refers to the identification number of the document in which the mismatch
	 * was found
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElementIdentification1
	 * ElementIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the identification number of  the document in which the mismatch was found"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDocumentIndex = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ElementIdentification1.mmObject();
			isDerived = false;
			xmlTag = "DocIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentIndex";
			definition = "Refers to the identification number of  the document in which the mismatch was found";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected Max350Text elementPath;
	/**
	 * Specifies from the root of the message the complete path of the element
	 * that violated a rule.
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
	 * {@linkplain com.tools20022.repository.msg.ElementIdentification1
	 * ElementIdentification1}</li>
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
	 * "Specifies from the root of the message the complete path of the element that violated a rule."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElementPath = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ElementIdentification1.mmObject();
			isDerived = false;
			xmlTag = "ElmtPth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementPath";
			definition = "Specifies from the root of the message the complete path of the element that violated a rule.";
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
	 * {@linkplain com.tools20022.repository.msg.ElementIdentification1
	 * ElementIdentification1}</li>
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
			componentContext_lazy = () -> ElementIdentification1.mmObject();
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
	protected Max140Text elementValue;
	/**
	 * Content of the element
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElementIdentification1
	 * ElementIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElmtVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElementValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Content of the element"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElementValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ElementIdentification1.mmObject();
			isDerived = false;
			xmlTag = "ElmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementValue";
			definition = "Content of the element";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ElementIdentification1.mmDocumentIndex, ElementIdentification1.mmElementPath, ElementIdentification1.mmElementName, ElementIdentification1.mmElementValue);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElementIdentification1";
				definition = "Description of the element that creates the mismatch.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DocIndx", required = true)
	public Max3NumericText getDocumentIndex() {
		return documentIndex;
	}

	public void setDocumentIndex(Max3NumericText documentIndex) {
		this.documentIndex = documentIndex;
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

	@XmlElement(name = "ElmtVal")
	public Max140Text getElementValue() {
		return elementValue;
	}

	public void setElementValue(Max140Text elementValue) {
		this.elementValue = elementValue;
	}
}